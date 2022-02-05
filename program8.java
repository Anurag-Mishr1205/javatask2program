class program8
{
    static boolean checkmirrorinverse(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[arr[i]]!=i)
               return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int arr[]={2,3,6,8};
        if(checkmirrorinverse(arr))
          System.out.println("It is mirror inverse");
        else
            System.out.println("It is not a mirror inverse");
    }
}