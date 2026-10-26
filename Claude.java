// In this claud is my tutuor and he will be giving qusetion for practice 

// Problem: find the sum of all even numbers from 1 to N (N = 10 gives 30, N = 7 gives 12; 1 ≤ N ≤ 1000).

public class Claude{
    public static void main(String[]args){
        int n = 10;
        int i;
        int sum = 0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum = sum + i ;
            }
            
        }
        System.out.print(sum);
    }
}