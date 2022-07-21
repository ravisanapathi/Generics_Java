package findMaxInteger;

public class MaxInt_1stPosition {
	
    static int array[] = {9, 5, 7};
	
	static int compareTo() {
	    int i;
	    int max = array[0];
	    
	    for(i = 1; i < array.length; i++)
	       if(array[i] > max)
	       max = array[i];
	       return max;
		}
	
	
	public static void main(String[] args) {
		System.out.println("Max Number in the Array is : "+compareTo());		
		}


}
