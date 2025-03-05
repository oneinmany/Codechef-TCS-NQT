/*
Vehicle Manufacturing
You are tasked with determining the number of two-wheelers and four-wheelers that need to be manufactured based on the given total number of vehicles and the total number of wheels.

You are provided with two integers:

v: the total number of vehicles (both two-wheelers and four-wheelers).
w: the total number of wheels for all the vehicles combined.
Your task is to calculate and print how many two-wheelers and four-wheelers must be manufactured based on the input data. If it's not possible to manufacture such a combination, print 
−
1
−1.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line contains an integer 
v
v — the total number of vehicles.
The second line contains an integer 
w
w — the total number of wheels.
Output Format
For each test case,

If a valid combination of two-wheelers and four-wheelers exists, print two integers:
The number of two-wheelers, the number of four-wheelers.
If no valid combination is possible, print -1.
Constraints
1
≤
T
≤
100
1≤T≤100
0
≤
v
≤
1
0
6
0≤v≤10 
6
 
0
≤
w
≤
4
0≤w≤4 x 
1
0
6
10 
6
 
Sample 1:
Input
2
12 
34
10 
25
Output
7 5
-1
Explanation:
Test Case 1: You have 12 vehicles in total and 34 wheels, which is possible with 7 two-wheelers and 5 four-wheelers.
Test Case 2: it is not possible to have 25 wheels with 10 vehicles, so the output is -1.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int w = sc.nextInt();
            if(w%2!=0 ||w<2 ||w<v*2|| w> v*4){
                System.out.println("-1");
            }else{
                int tw= (4*v-w)/2;
                int fw =(v-tw);
                System.out.println(tw+" "+fw);
            }
        }
    }
}
