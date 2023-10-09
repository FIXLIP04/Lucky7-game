import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int num1, num2, num3;
        
        num1 = random.nextInt(10)+1;
        num2 = random.nextInt(10)+1;
        num3 = random.nextInt(10)+1;

        if(num1 == 7 || num2 == 7 || num3 == 7){
            System.out.println("You won");
        }
        else{
            System.out.println("You lost");
        }
    }
}