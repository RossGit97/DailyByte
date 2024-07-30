public class problem4 {
    /* Day 4 Correct Capitalization
    This question is asked by Google. Given a string, return whether or not
    it uses capitalization correctly. A string correctly uses capitalization
    if all letters are capitalized, no letters are capitalized,
    or only the first letter is capitalized.

    Ex: Given the following strings...
    "USA", return true
    "Calvin", return true
    "compUter", return false
    "coding", return true
     */
    //check the first two characters of strings then cascade the checking depending on which case
    //is currently being tested (aa, AA or Aa) other than those, false
    static boolean correctCapitalization(String inputString){
        int x = 0;
        boolean returnValue = true;
        if(((int)inputString.charAt(x) >= 65 && (int)inputString.charAt(x) <= 90)
                && ((int)inputString.charAt(x+1) >= 97 && (int)inputString.charAt(x+1) <=122)){
            for (; x<inputString.length()-1 && returnValue; x++){
                returnValue = (int) inputString.charAt(x + 1) >= 97 && (int) inputString.charAt(x + 1) <= 122;
            }
        } else if (((int)inputString.charAt(x) >= 65 && (int)inputString.charAt(x) <= 90)
                && ((int)inputString.charAt(x+1) >= 65 && (int)inputString.charAt(x+1) <=90)) {
            for (; x<inputString.length()-1 && returnValue; x++){
                returnValue = (int) inputString.charAt(x + 1) >= 65 && (int) inputString.charAt(x + 1) <= 90;
            }
        } else if (((int)inputString.charAt(x) >= 97 && (int)inputString.charAt(x) <= 122)
                && ((int)inputString.charAt(x+1) >= 97 && (int)inputString.charAt(x+1) <=122)) {
            for (; x<inputString.length()-1 && returnValue; x++){
                returnValue = (int) inputString.charAt(x + 1) >= 97 && (int) inputString.charAt(x + 1) <= 122;
            }
        }else {
            returnValue = false;
        }
        return returnValue;
    }
}
