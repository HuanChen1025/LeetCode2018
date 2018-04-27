/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int middle;
        while (start < end){
           middle = start/2 +end/2;
            if (guess(middle)==1){
                start = middle +1;
            }
            else if (guess(middle) == -1){
                end = middle-1;
            }
            else {
                return middle;
            }
             

        }

        return start; 
    }
}