import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int num1, num2, num3, money;
        String input;

        System.out.println("How much money do you want to play with?");
        input = in.nextLine();
        money = Integer.parseInt(input);

        for(; money >= 1; money--){
            num1 = random.nextInt(10)+1;
            num2 = random.nextInt(10)+1;
            num3 = random.nextInt(10)+1;

            System.out.println(num1 + " " + num2 + " " + num3);
            
            if(num1 == 7 && num2 == 7 && num3 == 7){
                System.out.println("You won 10EUR");
                money += 10;
            }
            else if(num1 == 7 && num2 == 7 || num1 == 7 && num3 == 7 || num2 == 7 && num3 == 7){
                System.out.println("You won 5EUR");
                money += 5;
            }
            else if(num1 == 7 || num2 == 7 || num3 == 7){
                System.out.println("You won 3EUR");
                money += 3;
            }
            else{
                System.out.println("You lost");
            }

            System.out.println("Do you want to play again? You currently have " + (money-1) + "€ left (y/n)");
            input = in.nextLine();
            if(input.equals("n") || input.equals("N")){
                System.exit(0);
            }
            else{
                
            }
            
        }
        
    }
}