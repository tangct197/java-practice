import java.util.*;

//Java practice with String and char arrays as well as strings using for loops.
public class Reverse{
  public static void main(String [] args){
    char [] example = {'a', 'b', 'c', 'd'};
    String [] exampleTwo = {"a", "b", "c", "d"};
    System.out.println(reverse(example));
    System.out.println(reverseTwo(example));
    System.out.println(Arrays.toString(reverseThree(exampleTwo)));
    System.out.println(Arrays.toString(reverseFour(exampleTwo)));

    System.out.println(stringReversal("Example String"));
  }

  //Method which takes a character array and returns the character array in
  //reversed order using only a temporary character
  public static char [] reverse(char [] c){
    char temp;
    for(int i = 0; i < c.length / 2; i++){
      temp = c[i];
      c[i] = c[c.length - i - 1];
      c[c.length - i - 1] = temp;
    }
    return c;
  }

  //Method which takes a character array and returns the character array in
  //reversed order using a data structure(a new char array)
  public static char [] reverseTwo(char [] c){
    char [] reverse = new char[c.length];
    int j = 0;
    for(int i = c.length - 1; i >= 0; i--){
      reverse[j] = c[i];
      j++;
    }
    return reverse;
  }

  //Method which takes a string array and returns the string array in reversed
  //order using a temp string
  public static String [] reverseThree(String [] s){
    String temp;
    for(int i = 0; i < s.length / 2; i++){
      temp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = temp;
    }
    return s;
  }

  //Method which takes a string array and return the string array in reversed
  //order using a data structure(a new string array)
  public static String [] reverseFour(String [] s){
    String [] reverse = new String[s.length];
    int j = 0;
    for(int i = s.length - 1; i >= 0; i--){
      reverse[j] = s[i];
      j++;
    }
    return reverse;
  }

  //Method which takes a string and returns the string reversed using a
  //temporary string
  public static String stringReversal(String s){
    String reverse = "";
    for(int i = s.length() - 1; i >= 0; i--){
      reverse += s.charAt(i);
    }
    return reverse;
  }
}
