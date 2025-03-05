/*Count Character Occurrences
You are given two strings, str1 and str2. Your mission is to calculate the total number of occurrences of each unique character of str2 within the string str1. The task is to find the sum of occurrences of all unique characters from str2 in str1 and return this total count.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
For each test case:
The first line contains the string str1.
The second line contains the string str2.
Output Format
For each test case, output the total sum of occurrences of characters in str2 found in str1 on a new line.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
∣
s
t
r
1
∣
,
∣
s
t
r
2
∣
≤
1
0
5
1≤∣str1∣,∣str2∣≤10 
5
 
The strings consists of lowercase letters only.
Sample 1:
Input:
3
helloworld
do
abacabadabacaba
abcd
abc 
abcdabcdabcdabcd
Output:
3
15
3
Explanation:
Test Case 1: the character 'd' appears once and 'o' appears twice in "helloworld", so the total count is 3.
Test Case 2: The characters from "abcd" appear as follows in "abacabadabacaba": 'a': 7 occurrences 'b': 4 occurrences 'c': 2 occurrences 'd': 2 occurrences Total = 7 + 4 + 2 + 2 = 15.
Test Case 3: The characters appear only once in abc as we are calculating the unique characters of abcdabcdabcdabcd.
*/
import java.util.*;

public class Main {
    
   public static int sumOfOccurrences(String str1, String str2){
       HashMap<Character,Integer> freq= new HashMap<>();
       for(char ch: str1.toCharArray()){
           freq.put(ch, freq.getOrDefault(ch,0)+1);
       }
       HashSet<Character> uniquele = new HashSet<>();
       for(char ch: str2.toCharArray()){
           uniquele.add(ch);
       }
       int count=0;
       
       for(char ch:uniquele){
           count+= freq.getOrDefault(ch,0);
       }
       return count;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine(); 

        while (t-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(sumOfOccurrences(str1, str2)); 
        }

        scanner.close();
    }
}
