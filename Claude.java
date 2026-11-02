// In this claud is my tutuor and he will be giving qusetion for practice 

// Problem: find the sum of all even numbers from 1 to N (N = 10 gives 30, N = 7 gives 12; 1 ≤ N ≤ 1000).

// public class Claude{
//     public static void main(String[]args){
//         int n = 10;
//         int i;
//         int sum = 0;
//         for(i=1;i<=n;i++)
//         {
//             if(i%2==0)
//             {
//                 sum = sum + i ;
//             }
            
//         }
//         System.out.print(sum);
//     }
// }

// Day 2 : oct 27
// Pattern 1: right-angled triangle (N = 5)

// public class Claude {
//     public static void main(String[]args){
//         int i,j;
//         int n = 5;
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 2: pyramid (N = 5)

// public class Claude{
//     public static void main(String[]args){
//         int i,j;
//         int n = 5;
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(j=1;j<=2*i-1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 3: number triangle (N = 5)

// public class Claude{
//     public static void main(String[]args){
//         int i,j;
//         int n = 5;
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
        
//     }
// }

//Pattern 4: hollow square (N = 5)

// public class Claude{
//     public static void main(String[]args){
//         int i,j;
//         int n = 5;
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=n;j++)
//             {
//                 if(i==1||i==n||j==1||j==n)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
// }



//Problem 5: Reverse a number

// public class Claude{
//     public static void main(String[]args){
//         int n = 1234;
//         int rev = 0;
//         while(n>0)
//         {
//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n = n / 10;

//         }
//         System.out.print(rev);
//     }
// }

//Problem 6: Palindrome of a number

// public class Claude {
//     public static void main(String[] args) {
//         int n = 121;
//         int original = n;
//         int rev = 0;
//         while (n > 0) {
//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n = n / 10;
//         }
//         if (rev == original) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }


//Problem 7: Factorial of a number

// public class Claude{
//     public static void main (String[]args){
//         int n = 5;
//         int fact = 1;
//         for(int i=1;i<=n;i++)
//         {
//             fact = fact*i;
            
//         }
//         System.out.println(fact);
//     }
// }


//Problem 8: Prime check

// public class Claude{
//     public static void main (String[]args){
//         int n = 13;
//         boolean isPrime = true;
//         if (n < 2) {
//             isPrime = false;
//         }
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         System.out.println(isPrime);
//     }
// }



//Problem 9: DIAMOND PATTERN
public class Claude {
    public static void main(String[] args) {
        int n = 5;
        // top half: rows 1 to n
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // bottom half: rows n-1 down to 1
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Question 1 (Basic): Largest element

// Problem: find the largest number in an array.

// {3, 8, 1, 9, 4} gives 9
// {-5, -2, -9} gives -2

class solution{
    public void largest(int i){
        int[] arr = {3,8,1,9,4};
        int max = arr[0];
        for(i=1;i < arr.length, i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

// Question 2 (Basic): Smallest and largest in one pass

// Problem: find both the smallest and largest values in one loop.

// {7, 2, 9, 4} gives min 2, max 9

class solution2{
    public void largest(int i){
        int[] arr = {3,8,1,9,4};
        int max = arr[0];
        int min = arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<min)min = arr[i];
            if(arr[i]>max)max = arr[i];
        }
        System.out.print("Min : "+min+" , Max : " + max);
    }
}

// Question 3 (Basic): Linear search

// Problem: return the index of x in the array, or -1 if it isn’t there.

// {4, 7, 1, 9}, x = 1 gives 2
// {4, 7, 1, 9}, x = 5 gives -1

class solution3{
    public void largest(int i){
        int[] arr = {3,8,1,9,4};
        int x =1;
        int index = -1;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                index = i;
                break;
            }
        }
        System.out.print(index);
    }
}