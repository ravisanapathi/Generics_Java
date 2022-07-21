package findMaxFloatValue;

public class MaxFloat_1stPosition {
	
    static float array[] = {9.6f, 5.5f, 7.0f};
	
	static float compareTo() {
	    int i;
	    float max = array[0];
	    
	    for(i = 1; i < array.length; i++)
	       if(array[i] > max)
	       max = array[i];
	       return max;
		}
	
	
	public static void main(String[] args) {
		System.out.println("Max Float Number in the Array is : "+compareTo());		
		}

}
