
//                                      Table 
// import java.util.*;
// public class recurse{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n1 = input.nextInt();
//         int j = n1;
//         for (int i = 1; i <=10; i++) {
//             j *= i;
//             System.out.println(n1 + " X " + i + " = " + j);
//             j = n1;
//         }  
//      }
// } 
//                                  Sum of all Odd no. 
// import java.util.*;
// public class recurse{
//     public static void main(String[] args){ 
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n1; i++) {
//             if (i%2!=0) {
//                 sum += i;
//             }
//         }
//         System.out.println(sum);
//     }
// }
//                                         LCM of two no.
 
// import java.util.*;

// public class recurse {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first no. : ");
//         int n1 = sc.nextInt();
//         System.out.println("Enter the sceond no. : ");
//         int n2 = sc.nextInt();
//         int lcm = lcm(n1, n2);
//         System.out.println("LCM of two no. is : " + lcm);
//     }

//     public static int lcm(int n1, int n2) {
//         int i = 1;
//         while (true) {
//             int factor = n1 * i;
//             if (factor % n2 == 0) {
//                 return factor;
//             }
//             i++;
//         }
//     }
// }

//                              Given No. is prime or Not 
// import java.util.*;
// public class recurse{
//     public static void main(String[] args){
//         try(Scanner sc = new Scanner(System.in)){
//         System.out.println("Enter the first no. : ");
//         int num = sc.nextInt();
//         int prime=0;
//         for (int i = 2; i < num; i++) {
//             if(num%i==0){
//                prime = 1;
//             }
//             else{
//                 prime = 0;
//             }
//         }
//         if(prime == 1){
//                 System.out.println("No. is Prime.");
//         }else{
//                 System.out.println("No. is not Prime.");
//         }
//         sc.close();
// }
//         }
// }
//                                              Anagram String
// import java.util.*;
// public class recurse{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 String str1 = sc.nextLine();
//                 String str2 = sc.nextLine();
//                 if(str1.length() != str2.length()){
//                         System.out.print(false);
//                 }
//                 else{
//                        char str1char[] = str1.toCharArray();
//                        char str2char[] = str2.toCharArray();
//                        Arrays.sort(str1char); 
//                        Arrays.sort(str2char);
//                        int flag = 0;
//                 for (int i = 0; i < str1.length(); i++) {
//                     if (str1char[i] != str2char[i]) {
//                         flag = 1;
//                         break;
//                     }
//                 }
//                 if (flag==0) {
//                         System.out.println(true);
//                 }
//                 else{
//                         System.out.println(false);
//                 }
//         }
// }
// }
//                                        Recursion [ Repeating elements in an array]
// import java.util.*;
// public class recurse{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 System.out.println("Enter the Array : \n ");
//                 int[] arr = new int[n];
//                 for (int i = 0; i < n; i++) {
//                         arr[i] = sc.nextInt(); 
//                     }
//                 int search = sc.nextInt();
//                 for(int i= 0 ; i<arr.length; i++){
//                        if(arr[i]==search) {
//                         System.out.println(i);
//                        }
//                 }
//         }
// }
//                                         2019 (Number) in Word
// import java.util.*;
// public class recurse{
//         static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
//         public static void main(String[] args) {
//                 printDigits(2019);
//                 System.out.println();
//         }
//         public static void printDigits(int number) {
//                 if (number==0){
//                         return;
//                         }
//                         int lastDigit = number % 10;
//                         printDigits(number / 10);
//                         System.out.print(digits[lastDigit] + " ");
//                 }
//     }
//                                            Friends Pairing Problem
// public class recurse {
//     public static void main(String[] args) {
//         int n = 4;
//         int count = countPairing(n);
//         System.out.println("Number of ways to pair " + n + " friends is: " + count);
//     }
//     public static int countPairing(int n) {
//         if (n == 1 || n == 2) {
//             return n;
//         }
//        int pairing_alone = countPairing(n-1);
//        int pairing_pair = (n-1) * countPairing(n-2);
//        int total_ways_pairing = pairing_pair + pairing_alone ;
//        return  total_ways_pairing;
//     }
// }
//                                             Tower of Hanoi 
// public class recurse{
//         public static void main(String[] args) {
//                 int n = 3; 
//                 solveHanoi(n, 'A', 'C', 'B'); 
//             }
//         public static void solveHanoi(int n, char source, char destination , char helper){
//                 if(n==1){
//                         System.out.println("Move disk 1 from " + source + " to " + destination);
//                         return;
//                 }
//                 // Move n-1 disk from rod A to rod B 
//                 solveHanoi(n-1, source , helper , destination);
//                 System.out.println("Move disk " + n + " from rod " + source + " to " + destination );
//                 solveHanoi(n-1, helper , destination, source);
//         }
// }

