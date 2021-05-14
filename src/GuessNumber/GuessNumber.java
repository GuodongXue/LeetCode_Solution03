package GuessNumber;

public class GuessNumber {
    public static int game(int[] guess, int[] ans){
        int result = 0;
        for(int i = 0; i<guess.length; i++){
            if(guess[i]== ans[i]){
                result++;
            }
        }
        return result;
    }
}
