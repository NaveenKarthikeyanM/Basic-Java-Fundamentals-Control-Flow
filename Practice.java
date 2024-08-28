import java.util.*;
public class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Get number from User
        int n=sc.nextInt();
        int temp=n;
        //Check number is positive negative or zero
        if(n==0)
            System.out.println("Zero");
        else if(n>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        //Printing numbers from 1 to user input
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //Printing Numbers from n to 1
        while(temp!=0){
            System.out.print(temp+" ");
            temp--;
        }
        System.out.println();
        //Printing upto 3 using do...while
        int j=1;
        do { 
            System.out.print(j+" ");
            j++;
        } while (j<=3);
        //Weekdays using Switch Case
        switch(n){
            case 1:
                System.out.println("\nSunday");
                break;
            case 2:
                System.out.println("\nMonday");
                break;
            case 3:
                System.out.println("\nTuesday");
                break;
            case 4:
                System.out.println("\nWednesday");
                break;
            case 5:
                System.out.println("\nThursday");
                break;
            case 6:
                System.out.println("\nFriday");
                break;
            case 7:
                System.out.println("\nSaturday");
                break;
            default:
                System.out.println("\nInvalid Input");
            }

    }
}