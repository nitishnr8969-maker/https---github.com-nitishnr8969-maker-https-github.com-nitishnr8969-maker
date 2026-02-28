import java.util.Scanner;
public class GratestThree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number:");
        int a=sc.nextInt();
        System.out.print("Enter Second number:");
        int b=sc.nextInt();
        System.out.print("Enter Third number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("First number is greatest");
        }
        else if(b>a && b>c){
            System.out.println("Second number is greatest");
        }
        else{
            System.out.println("Third number is greatest");
        }
    }
}