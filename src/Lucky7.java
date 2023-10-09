import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int num1, num2, num3;

        for(int money = 5; money >= 1; money--){
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
        }
        
    }
}