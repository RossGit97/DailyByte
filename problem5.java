public class problem5 {
    /* Day 5    Add Binary
    This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s)
    return their sum (also as a binary string).
    Note: neither binary string will contain leading 0s unless the string itself is 0

    Ex: Given the following binary strings...
    "100" + "1", return "101"
    "11" + "1", return "100"
    "1" + "0", return  "1"

     */
    static String addBinary(String firstString, String secondString){
        int x = firstString.length()-1;
        int y = secondString.length()-1;
        int prevCarry = 0;
        StringBuilder output = new StringBuilder();

        while (x >= 0 || y >= 0 || prevCarry == 1) {
            //get value of bits from strings, 0 if the string runs out
            int a = (x >= 0) ? Character.getNumericValue(firstString.charAt(x--)) : 0;
            int b = (y >= 0) ? Character.getNumericValue(secondString.charAt(y--)) : 0;

            //use XOR to compute value of sum
            int sumBit = a ^ b ^ prevCarry;

            //use AND to compute carry,
            int newCarry = (a & b) | (a & prevCarry) | (b & prevCarry);

            output.insert(0, sumBit);
            prevCarry = newCarry;
        }
        return output.isEmpty() ? "0" : output.toString();
    }
}