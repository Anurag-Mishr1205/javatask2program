class program1
{
    public void calculate(int a, int b,char op)
    {
        switch(op)
        {
            case '+':
                System.out.println("Sum="+(a+b));
                break;
            case '-':
                System.out.println("Difference="+(a-b));
                break;
            case '*':
                System.out.println("Multiply="+(a*b));
                break;
            case '/':
                System.out.println("Divide="+(a/b));
                break;
            case '%':
                System.out.println("Remainder="+(a%b));
                break;
        }
    }
}