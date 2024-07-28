public class problem3 {
    /* Day 3 Roomba Route
    This question is asked by Amazon. Given a string representing
    the sequence of moves a robot vacuum makes,
    return whether or not it will return to its original position.
    The string will only contain L, R, U, and D characters, representing
    left, right, up, and down respectively.

    Ex: Given the following strings...
    "LR", return true
    "URURD", return false
    "RUULLDRD", return true
     */
    //Just count up how many of each move is in the input stream
    //If L == R and U == D then true, otherwise false
    // can also check first if odd or even, if odd then false, if even, do the counting
    static boolean originalPosition(String moveStream){
        int leftCount,rightCount, upCount, downCount;
        leftCount = rightCount = upCount = downCount = 0;

        for( int x = 0 ; x<moveStream.length(); x++){
            switch (moveStream.charAt(x)){
                case 'L': leftCount++;
                    break;
                case 'R': rightCount++;
                    break;
                case 'U': upCount++;
                    break;
                case 'D': downCount++;
                    break;
            }
        }
        System.out.println("Left moves:" + leftCount);
        System.out.println("Right moves:" + rightCount);
        System.out.println("Up moves:" + upCount);
        System.out.println("Down moves:" + downCount);
        return leftCount == rightCount && upCount == downCount;
    }
}
