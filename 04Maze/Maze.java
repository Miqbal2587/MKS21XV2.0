import java.util.*;
import java.io.*;
public class Maze{
    private char[][]maze;
    private boolean animate;
    private int xcor;
    private int ycor;
    public Maze(String filename)throws FileNotFoundException{
	animate=false;
	File text = new File(filename); 
        Scanner scan = new Scanner(text);
        int row = 0;
	int col = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
	    row=0;
	    col=line.length();
	}
	scan.close();
	maze= new char[row][col];
	scan = new Scanner(text);
	int newrow = 0;
	while(scan.hasNextLine()){
	    String line = scan.nextLine();
	    for(int newcol=0; newcol<line.length(); newcol++){
		maze[newrow][newcol]=line.charAt(newcol);
		if(line.charAt(col)=='S'){
		    xcor=row;
		    ycor=col;
		}
	    }
	    newrow=newrow + 1;
	}	
    }
    private void wait(int x){
         try {
             Thread.sleep(x);
         }
         catch (InterruptedException e) {
         }
    }
    // Just let it be false for now
    public void setAnimate(boolean b){
	animate = false;
    }
    public void clearTerminal(){
	System.out.println("\033[2J\033[1;1H");
    }
    public boolean solve(){
	int startr=xcor;
	int startc=ycor;
	maze[startr][startc]=' ';
	return solve(startr,startc);
    }
    private boolean solve(int row, int col){
        if(animate){
            System.out.println("\033[2J\033[1;1H"+this);
            wait(20);
        }
	if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length){
	    return false;
	}
	if (maze[row][col] == 'E'){
	    return true;
	}
	if(maze[row][col] == '#' || maze[row][col] == '.'){
	    return false;
	}
	if (maze[row][col] == ' '){
	    maze[row][col] = '@';
	    if (solve(row + 1, col) || solve(row, col + 1) || solve(row - 1, col) || solve(row, col - 1)){
		return true;
	    }
	    else{
		maze[row][col] = '.';
	    }
	}
        return false;
    }
    //Converting an array into a string
    public String toString(){
	String holder="";
	for(int x=0; x<maze.length; x++){
	    for(int y=0; y<maze[0].length; y++){
		holder=String.valueOf(maze[x][y]);
	    }
	    holder=holder+"\n";
	}
	return holder;
    }

    public static void main(String args[])throws FileNotFoundException{

    }
}
