package findMaxString;

public class MaxString_2ndPosition {

	  public static String getLongestString(String[] array) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }

	  public static void main(String[] args) {
	      String[] toppings = {"Ravi", "Ravi Rebel", "Ramya"};
	      String longestString = getLongestString(toppings);
	      System.out.println("longest string: "+longestString);
	  }

}
