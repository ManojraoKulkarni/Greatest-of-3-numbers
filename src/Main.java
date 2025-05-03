import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input for variable a from the user
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        //taking input for variable b from the user
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        //taking input for variable cfrom the user
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();

                // checking a is greater than b
                if (a > b) {
                    System.out.println(" a is grater than b");

                    // checking a is greater than c
                    if (a > c) {
                        System.out.println("a is greater than c");
                        System.out.println("a is the greater " + a);
                    } else {
                        System.out.println("c is greater than a");
                        System.out.println("c is the greater " + c);
                    }
                }else{
                    // checking b is greater than c
                        if(b > c) {
                            System.out.println("b is the grater");
                            System.out.println("b is the greater "+b);
                        }
                        else{
                            System.out.println("c is the greater");
                            System.out.println("c is the greater "+c);
                }
            }
        }
    }
