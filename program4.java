class program4
{
    public void find(int n)
    {
        int rem=0,rev=0,a=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==a)
          System.out.println("It is Palindrome Number");
        else
        System.out.println("It is  not a Palindrome Number");
    }
}