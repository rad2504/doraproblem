package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int number=scn.nextInt();
        if(number>=1 && number<=col)
        {
            System.out.println("Yes");
        }
        else if(number%col==1 && number/col<row)
        {
            System.out.println("Yes");
        }
        else if(number>row*(col-1) && number<=row*col)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
