import java.util.Scanner;
public class Example24 {
    public static void main(String[] args){
        int number;
        int factorial;
        System.out.println("Please type the number that you want to know the factorial of:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();
        factorial = 1;
        for (int i =1; i <= number; i++) {
            factorial = i * factorial;
        }
    System.out.println("The factorial of your number is : "   + factorial);
    }
}
