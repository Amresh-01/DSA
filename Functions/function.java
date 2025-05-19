// import java.util.*;
// public class fact_01{

//                                        ## FACTORIAL (NcR) ##

//     public static int fact(int x){
//         int rv =1;
//         for (int i = 1; i <=x; i++) {   
//             rv = rv * i;
//         }
//         return rv;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//         int nfact = fact(n);
//         int nmrfact = fact(n-r); 

//         int npr = nfact/nmrfact;
//         System.out.println(n + "p" + r + "=" + npr);
    // }
// }



//                                        ##   Decimal to Any Base  Conversion  ## 



// public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the no. in Decimal");
//             int num = sc.nextInt();
//             int no = sc.nextInt();
//             int sum = 0;
//             int p = 1;
//             while (num>0) { 
//                 int r = num % no;
//                 num = num / no;
//                 sum += r * p; 
//                 p = p * 10;
//             }
//             System.out.println("Converted no. is :"+sum);
 
//         }
//     }


//                                        ##  Any base to Decimal  ##  


// import java.util.*;
// public class fact_01{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the no. :");
//     int num = sc.nextInt();
//     int no = sc.nextInt();
//     int sum = 0;
//     int p = 1;
//     while (num>0) { 
//         int r = num % 10;
//         num = num / 10;
//         sum += r * p; 
//         p = p * no;
//     }
//     System.out.println("Converted no. is :"+sum);

// }
// }

//                                   ##  Any base to any base  ##                                     
//                I can`t understand it 

// import java.util.*;
// public class function{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the no. :");
//     int num = sc.nextInt();
//     int no = sc.nextInt();
//     int sum = 0;
//     int p = 1;
//     while (num>0) { 
//         int r = num % 10;
//         num = num / 10;
//         sum += r * p; 
//         p = p * no;
//     }
//     System.out.println("Converted no. is :"+sum);

// }
// }

//                                   ##  Any base addition  ## 

// import java.util.*;
// public class function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no. 01 :");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the no. 02 :");
//         int num2 = sc.nextInt();
//         System.out.println("Enter the Base : ");
//         int base = sc.nextInt();
//         int sum ;

//     }
// }

//                                                  Fibonacci series



// import java.util.*;

//     public class function{

//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the Number : ");
//             int No = sc.nextInt();

//             int first_term = 0; 
//             int second_term = 1;
//             int next_term;
            
//             System.out.print(first_term + ",");
//             System.out.print( second_term );

//             for(int i = 2; i<No; i++){
                                
//                 next_term = first_term + second_term;
//                 System.out.print(" ," + next_term );
//                 first_term = second_term;
//                 second_term = next_term;
//             }
//             System.out.println();
//         }
//     }


