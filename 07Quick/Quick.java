import java.util.*;
public class Quick{
    public static int part( int [] data , int start, int end){
	int piv = data[(int)(Math.random() * data.length)];
	System.out.println(piv);
	int [] newData;
	newData = new int[end-start];
	int newBack = newData.length - 1; 
	int newStart=0;
	for (int x=start; x<data.length; x++){
	    if (piv>=data[x] && newStart<data.length){
		newData[newStart] = data[x];
		newStart += 1;
	    }
	    else{
		newData[newBack] = data[x];
		newBack = newBack -1;
	    }
	}
	newData[newBack]= piv;
	//To See new Data
	System.out.println(toString(newData));
	return newStart;
    }
    public static int quickselect(int [] data, int k){
	return 0;
    }
    public static String toString(int [] ary){
	String hold="[";
	for (int x=0; x<ary.length ; x++){
	    hold=hold + ary[x] + ",";
	}
	hold= hold + "]";
	return hold;
    }
}
