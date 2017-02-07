public class Recursion{
    public static String name(){
	return "Iqbal,Mohammed";
    }
    public static double sqrt(double n){
	if(n<0){
	    throw new IllegalArgumentException();
	}
	else if(n==0){
	    return 0;
	}
	else{
	    return sqrtHelp(n, 1);
	}
    }
    public static double sqrtHelp(double n, double guess){
	double better_guess=(((n/guess) ) + guess) / 2;
	if (guess * guess>=.995*n && guess*guess<=1.005*n){
	    return guess;
	}
	else{
	    return sqrtHelp(n,better_guess);
	}
    }
    public static void main(String[] args){
	System.out.println(sqrt(1));
	System.out.println(sqrt(2));
	System.out.println(sqrt(100));
	System.out.println(sqrt(723));
	System.out.println(sqrt(500));
	System.out.println(sqrt(0));
	System.out.println(sqrt(-1));
    }
}
