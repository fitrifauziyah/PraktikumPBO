package kasus3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class OperationHandling {
    public static void main(String args[]) {
        //Arithmetic Exeption
        try {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println ("Result = " + c);
        } catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        
        //ArrayIndexOutOfBoundException
        try {
            int d[] = new int[3];
            d[4] = 5;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println ("Array Index is Out Of Bounds");
        }
        
        //InputMisMatchException
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        
        //FileNotFoundException
        try {
            File file = new File("F://file.txt");
            FileReader fr = new FileReader(file);
        } catch(FileNotFoundException e) {
           System.out.println("File does not exist");
        }
        
        //RuntimeException
        try {
            double area1;
            Rectangle r1;
            r1.length = 5;
            r1.width = 2;
            area1 = r1.length * r1.width;
            System.out.println("area rectangle 1: " + area1);
        } catch(RuntimeException e) {
            System.out.println("Variable reference might not have been initialized");
        }
        
    }
}
