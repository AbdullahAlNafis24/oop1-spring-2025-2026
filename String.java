public class String {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Java Programming";

        //length of string
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        //Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        //Substring
        String substring = str1.substrings(6,20);
        System.out.println("Substring of String 1: " + substring);

        //Replace
        String replacedString = str1.replace("World", "Java");
        System.out.println("Replaced String: " + replacedString);

        //Convert to Lowercase
        String lowerCaseString = str1.toLowerCase();
        System.out.println("Lower case String 1: " + lowerCaseString);

        //Convert to Uppercase
        String upperCaseString = str2.toLowerCase();
        System.out.println("Upper case String 2: " + upperCaseString);

        //Trim
        String stringWithSpaces = "Trim me! ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString + "'");

        //Boolean checks
        boolean startsWithHello = str1.startWith("Hello");
        boolean endsWithProgramming = str2.endsWith("Programming");
        System.out.println("String 1 starts with 'Hello': " + startsWithHello);
        System.out.println("String 2 ends with 'Programming': " + endsWithProgramming);

        //Character at index
        char charAtIndex5 = str1.charAt(5);
        System.out.println("Character at index 5 of String 1: " + charAtIndex5);

        //Index of substring
        int indexOfJava = str2.indexof("Java");
        System.out.println("Index of 'Java' in String 2: " + indexOfJava);
    }
}
