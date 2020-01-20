import java.util.Scanner;   

public class PrimeNumList{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int maxNum, minNum;
        int flag = 1;

        System.out.println("Enter the starting number: ");
        minNum = reader.nextInt();
        System.out.println("Enter the maximum number: ");
        maxNum = reader.nextInt();

        System.out.println("The min num is: " + minNum);
        System.out.println("The max num is: " + maxNum);


        System.out.println("\nPrime number between " + minNum + " and " + maxNum + " is: ");
        for (int i = minNum ; i <= maxNum ; i++){

            if (i > 1){

                flag = 0;

                for (int y = 2 ; y < i ; y++){
                    int remain = i % y;
                    if (remain == 0){
                        flag = 1;
                        break;
                    }
                }
                
                if (flag == 0){
                    System.out.print(i + ", ");
                    flag = 1;
                }
            }
        }

        System.out.println("\n\n");
           
     
    }
}

