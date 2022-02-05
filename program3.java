class program3
{
    public void find(int n)
    {
        int fact=1;
        while(n>=1)
        {
            fact*=n;
            n--;
        }
        System.out.println("Factorial value="+fact);
    }
}