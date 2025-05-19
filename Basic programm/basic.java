
//                           Determining Number is +ve ,-ve and zero 


// import java.util.*;

// public class basic{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num>0){
//             System.out.println("Number " + num + " is positive.");
//         }
//         else if (num<0) {
//             System.out.println("Number " + num + " is negative.");
//         }
//         else{
//             System.out.println("Number " + num + " is zero.");
//         }
//     }
// }


//                                       Greatest of the three Number 


// import java.util.*;

// public class basic{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();

//         if (num1>=num2 && num1>=num3) {
//             System.out.println(num1 + " is Greatest of three");
//         } 
//         else if(num2>=num3 && num2>=num1) {
//             System.out.println(num2 + " is Greatest of three");
//         }
//         else{
//             System.out.println(num3 + " is Greatest of three");
//         }
//     }
// }


//                                      Table 


// import java.util.*;

// public class basic{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first no. : ");
//         int n1 = sc.nextInt();
//         System.out.println("Enter the sceond no. : ");
//         int n2 = sc.nextInt();
//         int lcm = lcm( n1 , n2 );
//         System.out.println("LCM of two no. is : " + lcm);   
//     }

//     public static int lcm(int n1 , int n2){
//         int i = 1;
//         while(true){
//             int factor = n1 * i;
//             if (factor%n2 == 0) {
//                 return factor;
//             }
//             i++;
//         }
//     }
// }



//                                   Greatest Common factor  

// import java.util.*;

// public class basic{

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the first no. : ");
//         int n1 = input.nextInt();
//         System.out.println("Enter the second no. : ");
//         int n2 = input.nextInt();
//         int gcd = gcd( n1 , n2);
//         System.out.println("GCD of the no. is : " + gcd);
//     }
//     public static int gcd(int num1 , int num2) {
//         int gcd = 1;
//         int i = 2;
//         int least = least(num1,num2);
//         while(i<=least){
//             if (num1 % i == 0 && num2 % i == 0) {
//                 gcd = i;
//             }
//             i++;
//         }
//         return gcd;
//     }

//     public static int least(int num1 , int num2){
//         if(num1 < num2){
//             return num2;
//         }
//         else{
//             return num1;
//         }
//     }
// }



//                                  Given No. is prime or Not 


// import java.util.*;

// public class basic{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first no. : ");
//         int num = sc.nextInt();
//         boolean isPrime = true;

//         if (num<2){
//             isPrime = false;
//         }else{
//             for (int i = 2; i < Math.sqrt(num); i++) {
//                 if(num%i==0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime){
//                 System.out.println("No. is  Prime.");
//         }
//         else {
//                 System.out.println("No. is not Prime.");
//         }
//     }
// }


//                                       Reverse The Digit 

// import java.util.*;

// public class basic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int Original_num = sc.nextInt();
//         int rev = 0;
//         int num = Original_num;
//         while(num!=0){
//            int d = num%10;
//            rev = rev*10 + d;
//            num = num/10;
//         }
//         System.out.println("Revrse No. is : " + rev);
//     }
// }


import java.util.*;

public class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int st = 1;
        int sp = num-1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
            System.out.print("*");
            }
        System.out.println();
        st++;
        sp--;
        }
       
    }
}
