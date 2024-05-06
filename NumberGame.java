import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Choose the number of attempt : ");
        int r[]={10,20,30,40,50};
        System.out.print(Arrays.toString(r)+" : ");
        try{
            int b=s.nextInt();
            
            for(int j=0;j<r.length;j++){
                if(r[j]==b){
                    sum(b);
                }
                else if(b>50 || b<10 || b<20 && b>10 || b<30 && b>20 || b<40 && b>30 || b<50 && b>40){
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }

        static void sum(int b){
        Random random = new Random();
        Scanner s=new Scanner(System.in);
        int count=0;
        try{
        for(int i=b; i>0;i--){
            int randomNumber = random.nextInt(100);
            System.out.println(i+" Attempts left");
            System.out.print("Enter the Number : ");
            int n=s.nextInt();
            System.out.println("Computer : "+randomNumber);
            s.nextLine();
            if(n==randomNumber){
                count++;
                System.out.println("You guessed correct!");
                if(count==1){
                System.out.println("You won "+count+" round! & Score is "+count);
            }
                else{
                    System.out.println("You won "+count+" rounds! & Score is "+count);
                }
                System.out.print("Want to play another round? Yes/No : ");
                String m=s.nextLine();
                if(!m.equalsIgnoreCase("Yes")){
                    System.out.println("Game Over!");
                    break;
                }
                else{
                    i=b+1;
                }
            }
            else if(n!=randomNumber && i==1){
                System.out.println("\nYou Lost!\n");
                System.out.print("Want to play another round? Yes/No : ");
                try{
                    String m=s.nextLine();
                    if(m.equalsIgnoreCase("Yes")){
                        i=b+1;
                    }
                    else if(m.equalsIgnoreCase("No")){
                        System.out.println("Game Over!");
                        break;
                    }
                }catch(InputMismatchException e){
                    System.out.println(e);
                }
            }
            System.out.println();
        }}catch(InputMismatchException e){
            System.out.println(e);
        }
        }
    }

    

    

