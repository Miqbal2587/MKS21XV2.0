import java.util.ArrayList;

public class Quiz2Redux{
    /*Returns an ArrayLIst<String> that contains all subsets of the
     *Characters of String s. Assume s has no duplicate characters.
     */
    public static ArrayList<String> combinations(String s){
	ArrayList<String> words = new ArrayList<String>();

	//1. ** Fill in the Arguments Based on your design ***

	combinationH(s, words, 0, 1);
	return words;
    }
    //2. add whatever other parameters you need and complete the method
    public static void combinationH(String s, ArrayList<String> words, int x,int y){
	if (x> words.size()){
	    words.add("");
	}
	if (y+1>words.size()){
	    combinationH(s, words, x+1, x+2);
	}
	else{
	    words.add(s.charAt(x) + "" + s.charAt(y));
	    words.add(s.substring(x,y));
	    combinationH(s, words, x, y+1);
	}
    }
}

