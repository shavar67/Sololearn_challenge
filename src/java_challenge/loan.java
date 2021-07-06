package java_challenge;

public class loan {


    public static void main(String[] args) {

        System.out.println(loan(20000));
    }


    public static double loan(int amount){
        double percent = .10;
        double remainder;
        double balance;
        double newAmount = 0;

        for(int i =0; i <= 3;i ++){
           remainder = amount - (amount * percent);
           balance = remainder - (remainder * percent);
           newAmount = balance - (balance * percent);
        }

        return  newAmount;
    }
}
