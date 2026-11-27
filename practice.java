import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
       int a[] = {1 , 2, 4, 6, 8, 3, 5};
       int largest = a[0]; 
       for(int i=0;i<a.length;i++)
       {
        if (a[i]>largest)
            largest = a[i];
       }
       System.out.print(largest);
       
    }
}
