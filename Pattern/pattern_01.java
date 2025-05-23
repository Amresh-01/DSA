//                                  ## Pattern - 01 ##
// 
//                                        1
//                                        12
//                                        123
//                                        1234
//                                        12345
// 
// 
// public class pattern_01 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//                                            ## Pattern - 02 ##
//                                            
//                                                  12345
//                                                  1234
//                                                  123
//                                                  12
//                                                  1
// 
// 
// public class pattern_01 {
//     public static void main(String[] args) {
//         for (int line = 1; line <= 5; line++) {
//             for (int stars = 1; stars <=5-line+1 ; stars++) {
//                 System.out.print(stars);
//             }
//                 System.out.println();
//             }   
//         }
// }
//                                             ## Pattern - 03 ##
// 
//                                                     *
//                                                     **
//                                                     ***
//                                                     ****
//                                                     *****
//                                                     ****
//                                                     ***
//                                                     **
//                                                     *
// 
// 
// import java.util.*;
// public class pattern_01 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int st = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= st; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             if (i <= n / 2) {
//                 st += 1;
//             } else {
//                 st -= 1;
//             }
//         }
//     }
// }
//                             ## Pattern - 04 ##
// 
//                                    *****
//                                     ****
//                                      ***
//                                       **
//                                        *
// 
// 
// import java.util.*;

// public class pattern_01 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sp = 0;
//         int st = 5;
//         for (int i = 0; i < num; i++) {
//             for (int j = 0; j < sp; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < st; j++) {
//                 System.out.print("*");
//             }
//             st--;
//             sp++;
//             System.out.println();
//         }
//     }
// }
// 
//                                         ## Pattern - 05 ##
// 
//                                           Diamond Pattern
//                                                 *
//                                              *  *  *
//                                           *  *  *  *  *
//                                              *  *  *
//                                                 *  
// 
// 
// import java.util.Scanner;
// public class pattern_01 {
//         public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int sp =n/2;
//             int st =1;
//             for(int i=1; i<=n; i++){
//                 for (int j = 1; j<=sp; j++){
//                     System.out.print("\t");
//                 }
//                 for(int j=1; j<=st; j++){
//                     System.out.print("*\t");
//                 }
//                 System.out.println();
//                 if (i<=n/2) {
//                         sp--;
//                         st +=2;
//                 }
//                 else{
//                         sp++;
//                         st -=2; 
//                 }
//             }
//             }
//     }
// 
//                                         ## Pattern - 06 ##
// 
//                                             Floyd's Triangle
// 
//                                                1
//                                                01
//                                                101
//                                                0101
//                                                10101
// 
// 
// public class pattern_01 {
//         public static void Triangle(int n){
//              for (int i = 0; i < n; i++) {
//                 for (int j = 0; j <= i; j++) { 
//                     if ((i+j)%2==0) {
//                         System.out.print("1");  
//                     }else{
//                         System.out.print("0");
//                     }
//                 }
//                 System.out.println();
//         }
//         }
//         public static void main(String[] args) {
//             Triangle(5);
//         }
// }
// 
//                                     ## Pattern - 07 ##
// 
//                                      Butterfly Patterns
// 
// 
//                                         *        *
//                                         **      **
//                                         ***    ***
//                                         ****  ****
//                                         **********
//                                         ****  ****
//                                         ***    ***
//                                         **      **
//                                         *        *
// 
// 
// public class pattern_01 { 
//             public static void Butterfly(int n){
//                  for (int i = 1; i <=n; i++) {
//                     for (int j = 1; j <=i; j++) {
//                             System.out.print("*");  
//                     }
//                     for (int j = 1; j<=2*(n-i); j++) {
//                     System.out.print(" ");       
//                     }
//                     for (int j = 1; j <=i; j++) {
//                         System.out.print("*");  
//                 }
//                 System.out.println();
//             }
//             for (int i = n; i >=1; i--) {
//                 for (int j = 1; j <=i; j++) {
//                         System.out.print("*");  
//                 }
//                 for (int j = 1; j<=2*(n-i); j++) {
//                     System.out.print(" ");       
//                 }
//                 for (int j = 1; j <=i; j++) {
//                     System.out.print("*");  
//             }
//             System.out.println();
//         }
//     }
//             public static void main(String[] args) {
//                 Butterfly(5);
//             }
//         }
// 
// 
//                        ##   Pepcoding   ##
//
//                              PATTERN - 16
// 
import java.util.Scanner;

public class pattern_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            if (i == n) {
                st--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}

// 
//                                                  *
//                                                  **
//                                                  ***
//                                              ********          
//                                                  ***
//                                                  **
//                                                  *
// 
// import java.util.Scanner;
// public class pattern_01 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sp = 3;
//         int st = 1;
//         int i;
//         for (i = 1; i <= n; i++) {
//             for (int j = 1; j <= sp; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= st; j++) {
//                 System.out.print("*");
//             }
//             st++;
//             System.out.println();
//             if (i == (n + 1) / 2) {
//                 for (i = 0; i <= n; i++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//                 int st2 = 4;
//                 for (i = 1; i <= n; i++) {
//                     for (int j = 1; j <= sp; j++) {
//                         System.out.print(" ");
//                     }
//                     for (int j = 1; j <= st2; j++) {
//                         System.out.print("*");
//                     }
//                     st2--;
//                     System.out.println();
//                 }
//             }
//         }
//     }
// }
// 
//                            ##  Pattern - 18  ##
//                         
//                              * * * * * * *          
//                               *         *        
//                                *       *
//                                 *     *
//                                  *   *
//                                   * *
//                                    *
//                                   * *
//                                  * * *
//                                 * * * *
//                                * * * * *
//                               * * * * * * 
//                              * * * * * * *   
// import java.util.Scanner;
// public class pattern_01{
// public static void main (String []args){
//     Scanner sc =new Scanner(System.in);
//     int n = sc.nextInt();
//     int st=2;
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= n; j++) {
//             if (i==j || i+j == n+1 || i==1) {
//                 System.out.print("*");
//             }
//            else  if (i==n/2 && j<st) {
//                System.out.println("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         if(i==n/2){
//             st++;
//         }
//         System.out.println();
//     }
// }
// }
//                                                      1
//                                                     2 2
//                                                    3 3 3
//                                                   4 4 4 4
//                                                  5 5 5 5 5 
//                                                 6 6 6 6 6 6 
// import java.util.Scanner;
// public class pattern_01{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int st = 1;
//     int sp = n-1;
//     // starting with Row
//     for (int i = 1; i <= n; i++) {
//       // Print leading spaces
//         for (int j = 1; j <= sp ; j++) {
//             System.out.print(" ");
//         }
//         // print No. + spaces
//         for (int k = 1; k <= st; k++) {
//                 System.out.print(i + " ");
//         }
//         System.out.println();
//         st++;
//         sp--;
//       }
//     }
// }
