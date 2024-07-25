public class problem1 {
    /*Day 1 Reverse String
        This question is asked by Google.
        Given a string, reverse all of its characters
        and return the resulting string.
        Ex: Given the following strings...
        Cat”, return “taC”
        “The Daily Byte”, return "etyB yliaD ehT”
        “civic”, return “civic”
         */
    //Convert string into char array
    //traverse char array to swap chars
    //return char arrays as a new string
    static String reverseString(String inputString){
        char temp;
        char [] stringArray = inputString.toCharArray();
        for(int x = 0, y = inputString.length()-1; x<=y; x++, y-- ){
            temp = stringArray[x];
            stringArray[x] = stringArray[y];
            stringArray[y] = temp;
        }
        return new String(stringArray);
    }
}
