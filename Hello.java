//import java.util.Scanner;


// public class Hello{
//   public static void main (String[]args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your age");
//     int age = sc.nextInt();
    
//     if(age >= 13 && age <= 17){
//       System.out.println("you are teeneaged");
//     }
//     else if (age >=18){
//       System.out.println("you are eligible to drive car");
//     }
//     else {
//       System.out.println("you are not eligible for any of the above categories");
//     }

//   }
// }


//1st trial question

// public class Hello{}

// public static void main(String[]agrs){
//     int i,j;
// for (i=1; i<=5;i++)
// {
//     for(j=1;j<=4;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }


//1 st striver sheet question;

// class Solution {
//     public void pattern1(int n){                                  // in this we have n=4 and n=2 to satisfy the condition of the question
//     int i,j;
//     {
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=n;j++)
//             {

//                  System.out.print("*");
//             }
//         System.out.println();
//         }
        
//     }
// }
// }

//2nd striver sheet question

// class Solution {                                                  // in this ques while working in colum or printing j we have to make it 
//     public void pattern2(int n) {                                    equal to i because we have to print the stars in increasing order of 
//                                                                      rows and columns
//     int i,j;
//     {
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }

//     }
// }

//3rd striver sheet question

// import java.util.Scanner;                                            // this input condition is made by me not in striver sheet 
// class Hello {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number of rows");
//     int n = sc.nextInt();
//     int i,j;
//     {
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//             System.out.print(j);
//             }
//         System.out.println();
//         }
//     System.out.println();       
//     }
       
//     }
// }

// //4th striver sheet question

// class Solution {
//     public void pattern4(int n) {
//     int i,j;
//     {
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print(i);
//             }
//         System.out.println();
//         }
//     }

//     }
// }

//5th striver sheet question

// import java.util.Scanner;
// class Hello{

//     public static void main (String[]agrs){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows and columns for inverted star pattern");
//         int n = sc.nextInt();
//         int i,j;
//         {
//             for(i=n;i>=1;i--)
//             {
//                 for(j=1;j<=i;j++)
//                 {
//                     System.out.print("*");

//                 }
//                 System.out.println();
//             }
//         }

//     }
// }

//6th striver sheet question

// class Solution {
//     public void pattern6(int n) {
//     int i,j;
//     for(i=1;i<=n;i++)
//     {
//         for(j=1;j<=n-i+1;j++)
//         {
//             System.out.print(j);
//         }
//         System.out.println();
//     }

//     }
// }

//7th striver sheet question

// import java.util.Scanner;
// class Hello{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter the value on n");
//         int n = sc.nextInt();
//         int i,j;
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

// import java.util.Scanner;
// class Hello{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter the value on n");
//         int n = sc.nextInt();
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(j=1;j<=spaces;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(i=n;i>=1;i--){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(j=1;j<=spaces;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }}

//8th striver sheet question

// class Solution {
//     public void pattern8(int n) {
//         int i,j;
//         for(i=n;i>=1;i--)
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



// import java.util.Scanner;
// class Hello{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter the value on n");
//         int n = sc.nextInt();
//         int i,j;
//         {
//             for(i=1;i<=n;i++)
//             {
//                 for(j=1;j<=n-i;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(j=1;j<=n;j++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }

// }

// class Hello{
//     public static void main(String[]args){
//     int i,j;
//     int n = 5;
//     {
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=n-i;j++)
//             {
//                 System.err.print(" ");
//             }
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print(i+" ");
            
//             }
//             System.out.println();
//         }
//     }
//     }
// }


class Hello{
    public static void main(String[]args){
    int i,j;
    int n = 5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}


//9 th Striver Sheet Question
class Solution9 {
    public void pattern9(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


//10th Striver Sheet Question

class Solution10 {
    public void pattern9(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// 11th Striver Sheet Question

class Solution {
    public void pattern11(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                int sum = i+j;
                if(sum % 2 == 0)
                {
                    System.out.print("1" + " ");
                }
                else
                {
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }

    }
 
}

// 12th Striver Sheet Question

class Solution12 {
    public void pattern12(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            int spaces = 2*(n-i);
            for(j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 13th Striver Sheet Question

class Solution13 {
    public void pattern13(int n) {
        int i,j;
        int num = 1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

// 14th Striver Sheet Question

class Solution14 {
    public void pattern14(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print( (char)('A'+j));
            }
            System.out.println();
        }


    }
}
// 15th Striver Sheet Question

class Solution15 {
    public void pattern15(int n) {
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }

    }
}
// 16th Striver Sheet Question

class Solution16 {
    public void pattern16(int n) {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }

}

// 17th Striver Sheet Question

class Solution17 {
    public void pattern17(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i-1;j++)
            {
                System.out.print((char)('A'+j));
            }
            for(j=i-2;j>=0;j--)
            {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}

// 18th Striver Sheet Question
class Solution18 {
    public void pattern18(int n) {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print((char)('A'+(n-i-1)+j)+" ");
            }
            System.out.println();
        }

    }
}

// 19th Striver Sheet Question
class Solution19 {
    public void pattern19(int n) {
        int i,j;
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=2*(i-1);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

