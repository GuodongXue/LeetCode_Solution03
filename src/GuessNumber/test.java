package GuessNumber;

public class test {
    public static void main(String[] args) {
        int[] guess ={1,2,3};
        int[] ans ={3,2,1};
        int res = GuessNumber.game(guess, ans);
        System.out.println(res);
    }
}
