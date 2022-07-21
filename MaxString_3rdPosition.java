package findMaxString;

public class MaxString_3rdPosition {

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
	      String[] toppings = {"Ravi", "Kumar", "Ramya sri"};
	      String longestString = getLongestString(toppings);
	      System.out.println("longest string: "+longestString);
	  }

}
