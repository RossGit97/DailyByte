public class problem2 {
    /*Day 2 Valid Palindrome
        This question is asked by Facebook. Given a string,
        return whether it forms a palindrome ignoring
        case and non-alphabetical characters.
        Note: a palindrome is a sequence of characters that
        reads the same forwards and backwards.

        Ex: Given the following strings...
        "level", return true
        "algorithm", return false
        "A man, a plan, a canal: Panama.", return true
     */
    //remove non-alphabetical characters
    //remove spaces
    //convert to lower case
    //iterate from both sides to compare characters
    static boolean isPalindrome(String inputString){
        boolean output = true;
        String newString = inputString;

        newString = newString.replaceAll("[^a-zA-Z0-9]", "");
        newString = newString.replaceAll("\\s", "");
        newString = newString.toLowerCase();
        for (int x =0, y =newString.length()-1; x<y&& output;) {
            if (newString.charAt(x) == newString.charAt(y)) {
                x++;
                y--;
            } else {
                output = false;
            }
        }
        return output;
    }
}
