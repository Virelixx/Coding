class practice{
    public static void main(String[] args){
        int i;
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