class program2
{
    public void print(int n)
    {
        int i,a=0,b=1,c=0;
        System.out.print(a+" ,"+b);
        for(i=1;i<=(n-2);i++)
        {
            c=a+b;
            System.out.print(" ,"+c);
            a=b;
            b=c;
        }
    }
}