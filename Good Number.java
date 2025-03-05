/*
Good Number
You are given a number 
N
N, and your task is to determine whether it is a "Good Number" or not. A Good Number is defined as a number that is divisible by the sum of its own digits. If the number is divisible by the sum of its digits, it is classified as Good, otherwise, it is classified as Bad.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case contains a single integer 
N
N, the number you need to check.
Output Format
For each test case, print "Good Number" if the number is a Good, otherwise print "Bad Number".

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
1
0
6
1≤N≤10 
6
 
Sample 1:
Input
Output
3
18
19
21
Good Number
Bad Number
Good Number
Explanation:
Test Case 1: For the first test case, the sum of digits of 18 is 1+8=9. Since 18÷9=2, 18 is a Good Number.
Test Case 2: For the second test case, the sum of digits of 19 is 1+9=10. Since 19÷10 is not an integer, 19 is a Bad Number.
Test Case 3: For the third test case, the sum of digits of 21 is 2+1=3. Since 21÷3=7, 21 is a Good Number.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) { 
            int num = sc.nextInt();
            int n = num;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10; 
                sum += digit;        
                n = n / 10;          
            }
            if (num % sum == 0) {
                System.out.println("Good Number");
            } else {
                System.out.println("Bad Number");
            }
        }

        sc.close();
    }
}
