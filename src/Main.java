import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num= 5;
        int temp;
        boolean isPrime = true;
        for(int i =2; i < num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime) {
            System.out.println(num +" is a prime number");
        }else System.out.println(num+ " is not a prime number");

    }
}