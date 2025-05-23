
//                                             ## Sum of Two Arrays ##
// 
// import java.util.*;
// public class array{
//     public static void main (String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int n1 = sc.nextInt();
//                 int [] a1 = new int[n1];
//                 for (int i = 0; i < a1.length; i++) {
//                     a1[i]= sc.nextInt();
//                 }
//                 int n2 = sc.nextInt();
//                 int [] a2 = new int [n2];
//                 for (int i = 0; i < a2.length; i++) {
//                         a2[i]= sc.nextInt(); 
//                 }
//                 int[] sum = new int[n1>n2 ? n1:n2];
//                 int i = a1.length - 1;
//                 int j = a2.length - 1;
//                 int k = sum.length - 1;         
//     }
//  }
// 
//                                       ## Reverse in an Array ##
//  
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         reverseArray(arr);
//         System.out.println("Reversed array: " + Arrays.toString(arr));
//     }
//     public static void reverseArray(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }
// }
// 
// 
//                                             ## Through linear search ##
// 
// import java.util.*;
// public class array{
//     public static int getlargest(int numbers[]){
//                   int largest = Integer.MIN_VALUE;            //for  MAX_VALUE it initialise to + infinity 
//                 for(int i=0; i<numbers.length; i++){
//                     if (largest<numbers[i]) {
//                         largest = numbers[i]; 
//                     }
//                 }
//                 return largest;
//     }
// public static void main (String args[]) {
//         int numbers[] = {1,2,3,4,56,7,3,2,4,55,5566,666,8,9,90,98789,89,76543456,878,989,989};
//         System.out.println("the largest no. is :" + getlargest(numbers));
//     }
// }
// 
//                                          ## Through binary search ##
// 
// import java.util.Arrays;
// public class array{
//     public static int binarysearch(int numbers[],int key){
//         int start = 0,end = numbers.length-1;
//         while (start<=end) { 
//             int mid = (start+end)/2;
//             if (numbers[mid]== key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) { 
//                 start = mid +1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {224,33,4,8,9,98};
//         Array.sort(numbers);
//         int key = 224;
//         System.out.println(" index for key is : " + binarysearch(numbers, key));
//     }
// }
// 
// 
//                          ## Span of an array (Difference b\w Maximum no. and Minimum no.) ##
// 
// 
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); 
//         int[] number = new int[n];
//         for (int i = 0; i < number.length; i++) {
//             number[i] = sc.nextInt();
//         }
//         int max = number[0];
//         int min = number[0];
//         for (int i = 1; i < number.length; i++) {
//                 if (number[i]>max) {
//                         max = number[i];
//                 }
//                 if(min>number[i]) {
//                     min = number[i];
//                 }
//         }
//         int span = max-min;
//                     System.out.println("span :" +span);
//     }
// }
// 
//                                      ##  Bar chart in Array ##
// 
// import java.util.*;
// public class array{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt(); 
//             int[] number = new int[n];
//             for (int i = 0; i < number.length; i++) {
//                 number[i] = sc.nextInt();
//                 }
//                 int max = number[0];
//                 for (int i = 0; i < number.length; i++) {
//                     if (number[i]>max) {
//                         max = number[i];
//                     }
//                 }
//                 for (int floor = max; floor >= 1 ; floor--) {
//                     for (int i = 0; i < number.length; i++) {
//                         if (number[i]>floor) {
//                             System.out.print("*\t");
//                         }
//                         else{
//                             System.out.print("\t");
//                         }
//                     }
//                     System.out.println(); 
//                 }
//             }
//         }
// 

//                                        ##  Rain problem  ##
// 
// import java.util.*;
// public class array{
//     public static boolean findMonotonic(int[] arr,int n){
//             // It is Monotonical increasing 
//             for (int i = 0; i < n-1; i++) {
//                 if(arr[i] > arr[i+1]){
//                     return false;
//                 }
//             }
//             // 
//             for (int i = 0; i < n-1; i++) {
//                 if(arr[i] < arr[i+1]){
//                     return false;
//                 }
//             }
//             return true;
//     }
// }
// 
//                                   ##  Spiral Array  ##
// 
// public class array{
//     public static void printSpiral(int [][] arr) {
//             int n = arr.length;
//             int m = arr[0].length;
//             int sc = 0;    // Starting Col
//             int sr = 0;    // starting Row
//             int er = n-1;   // ending row 
//             int ec = n-1;     // ending col
//             int row = 0;
//             int col = 0;
//         while(sc<=ec && sr<=er){
//             // col downward 
//             col = sc;
//             for ( row = sr; row<=er; row++) {
//                 System.out.print(arr[row][col]+" ");
//             }
//             sc++;
//             // row towards right
//             row = er;
//             for ( col = sc; col <=ec; col++) {
//                 System.out.print(arr[row][col]+" ");
//             }
//             er--;
//             // col upwards
//             col = ec;
//             for ( row = er; row>=sr; row--) {
//                 System.out.print(arr[row][col]+" ");
//             }
//             ec--;
//             // row towards left
//             row = sr;
//             for ( col = ec; col >=sc; col--) {
//                 System.out.print(arr[row][col]+" ");
//             }
//             sr++  ;
//             }
//         }
//     public static  void main (String args[]){
//         int[][] arr = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         printSpiral(arr);
//         }
//     }
// 
//                                      ## Maximum and Minimum Array ##
// 
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no of elements in an array :");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int maxArr = arr[0];
//         int minArr = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (minArr > arr[i]) {
//                 minArr = arr[i];
//             }
//             if (maxArr < arr[i]) {
//                 maxArr = arr[i];
//             }
//         }
//         System.out.println("Minimum number is: " + minArr);
//         System.out.println("Maximum number is: " + maxArr);
//     }
// }
// 
// 
//                                   ## Given Array is Sorted or Not ##
// 
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         boolean isIncrease = true;
//         boolean isDecrease = true;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] < arr[i + 1]) {
//                 isDecrease = false;  // If any pair is increasing, it's not decreasing
//             }
//             if (arr[i] > arr[i + 1]) {
//                 isIncrease = false;  // If any pair is decreasing, it's not increasing
//             }
//         }
//         if (isDecrease) {
//             System.out.println("Array is sorted in Decreasing Order");
//         } else if (isIncrease) {
//             System.out.println("Array is sorted in Increasing Order");
//         } else {
//             System.out.println("Array is not sorted");
//         }
//     }
// }
// 

//                                   Searching Elemnt in 2-D Array
// 
// import java.util.*;

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Please Enter the Row : ");
//         int row = sc.nextInt();
//         System.out.println("Please Enter the Column : ");
//         int col = sc.nextInt();

//         if (row <= 0 || col <= 0) {
//             System.out.println("Row and Column values must be positive integers.");
//             return;
//         }

//         int[][] arr = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.println("Enter the value at row " + (i + 1) + ", column " + (j + 1) + " :");
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter the number you want to search for: ");
//         int num = sc.nextInt();

//         boolean isFound = search(arr, num);
//         if (isFound) {
//             System.out.println("Your number was found.");
//         } else {
//             System.out.println("Your number was not found.");
//         }
//     }

//     public static boolean search(int[][] arr, int num) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] == num) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
