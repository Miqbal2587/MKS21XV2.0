import java.util.*;
import java.io.*;

public class Usaco{
  public static int bronze(String filename){
	// Read the file
	Scanner sc = new Scanner(new File(filename) );

	// For getting the metadata from the first line
	String firstLine = sc.nextLine();
	Scanner firstLineScan = new Scanner( firstLine );
	int rows = firstLineScan.next();
	System.out.println("Rows are: " + rows);
	int cols = firstLineScan.next();
	System.out.println("Cols are: " + cols);
	int elevation = firstLineScan.next();
	System.out.println("Elevation is: " + elevation);
	int numOrders = firstLineScan.next();

	// Creating the pasture/order array
	int[][]pasture = new int[rows][cols];
	int[][]orders = new int[numOrders][3];

	// Loading the pasture
	for (int r=0; r < rows; r++){
	    Scanner lineScan = new Scanner(sc.nextLine());
	    for (int c=0; c<cols; c++){
		pasture[r][c]=lineScan.next();
	    }
	}
	System.out.println(arrayToString(pasture));


	// Loading the orders
	for (int i = 0; i < numOrders; i++){
	    Scanner orderScan = new Scanner(sc.nextLine());
	    for (int o = 0; o < 3; o++){
		orders[i][o] = orderScan.next();
	    }
	}
	System.out.println(arrayToString(orders));
	

	return 0; // Change later
    }


    private static String arrayToString(int[][]ary){
	String ans = "";
	for(int row = 0; row < ary.length; row++){
	    for(int col = 0; col < ary[row].length; col++){
		if(ary[row][col] < 10){
		    ans += "  " + ary[row][col];
		} else {
		    ans += " " + ary[row][col];
		}
	    }
	    ans += "\n";
	}
	return ans;
    }



    /*
    int [][] pasture;
    int [][] order;
    int  elevation;
    public CowStomping(String file) {
    try{
        Scanner sc = new Scanner(new File(file));
        //Instatiating variables
        String fl = sc.nextLine();
        Scanner flscan = new Scanner(fl);
        int r =flscan.next();
        int c = flscan.next();
        elevation = flscan.next();
        int n = flscan.next();
        pasture= new int[r][c];
        order= new int[n][3];
        //Loading pasture
        for (int i=0; i < r; i++){
        // Visits every int
        Scanner lineScan = new Scanner(sc.nextLine());
        for (int e=0; e<c; e++){
            pasture[i][e]=lineScan.next();
        }
        }
        //Loading Orders
    }
    catch{
        
    }
    
    */
}
}
