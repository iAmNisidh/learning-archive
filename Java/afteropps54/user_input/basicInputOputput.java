package user_input;


import java.util.Scanner;

public class basicInputOputput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the no. that you want to add with 10");
        int r = sc.nextInt();
        System.out.println(r+10);
    }
    
}
