import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      1.  Write a Java program that accept three numbers from the user and print the largest number .
//        int [] numbers = new int[3];
//        System.out.println("Please enter 3 numbers to find the largest number.");
//
//        System.out.println("The largest number is "+findMax(fillArray(numbers))+".");

//        2. Write a Java program that accept a String and a number from the user,
//        then print the character in the given index .

//        System.out.println("Please enter a string and an index to print a specific character.");
//        System.out.println("Please enter a string.");
//        String str = input.nextLine();
//        System.out.println("Please enter a number.");
//        int n1 = input.nextInt();
//        System.out.println("The letter is "+str.charAt(n1)+".");

//        3. Write a program to enter the numbers till the user wants and at the end
//        it should display the sum entered .

//        System.out.println("Please enter how many numbers to find the sum of all numbers.");
//        int n = input.nextInt();
//        int [] sumed_numbers = new int[n];
//
//        System.out.println("the sum is "+sum(fillArray(sumed_numbers))+".");
//
//        4. Write a Java program to find positive and negative numbers of a given array:
//
//        -  Original Array:
//        [   10, -21 , 30, 31, -25]
//           -  Expected Output:
//          10  is a positive number
//         -21 is a negative number
//          30 is a positive number
//          31 is a positive number
//         -25 is a negative number

//        System.out.println("Please enter how many number to compare and to find the positive and negative numbers.");
//        int n1 = input.nextInt();
//        int [] compared_numbers = new int[n1];
//
//        printPosNeg(fillArray(compared_numbers));

//        5. Write a Java program to find a shortest word of a given array:
//        - Original Array:
//          [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//        - Expected Output:
//          JAVA

//        String [] words = {"Tuwaiq", "Bootcamp" , "Student", "JAVA"};
//        System.out.println("The shortest word is "+findShortestWord(words)+".");



    }
    public static int[] fillArray(int[] a){
        Scanner input = new Scanner(System.in);
        int n=1;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter "+n+" number");
            a[i] = input.nextInt();
            ++n;
        }
        return a;
    }
    public static int findMax(int [] a){
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > temp){temp = a[i];}

        }
        return temp;
    }
    public static int sum(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static void printPosNeg(int[] a){

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0){
                System.out.println("["+a[i]+"] Is a positive number.");
            } else if (a[i] == 0) {
                System.out.println("["+a[i]+"] Is a zero.");
                
            }else System.out.println("["+a[i]+"] Is a negative number.");

        }
    }
    public static String findShortestWord(String[] a){

        String temp = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i].length() < temp.length()){
                temp = a[i];
            }

        }
        return temp;
    }
}