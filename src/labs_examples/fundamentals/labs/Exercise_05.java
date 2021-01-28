package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();

        String str2 = "hello!";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean strEquals = str.equals(str2);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = (str + str2);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("strEquals: " + strEquals);
        System.out.println("str3: " + str3);

        String strReplace = str.replace('l', 'y');
        System.out.println(strReplace);
        String strSubstring = strReplace.substring(2,4).replace('y', 'x');
        System.out.println(strSubstring);
        boolean strContains = strSubstring.contains("xx");
        System.out.println(strContains);

        int strIndex = str3.indexOf("z");
        System.out.println(strIndex);
        // when not found, always -1

    }


}