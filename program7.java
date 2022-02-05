class program7
{
    public void check(String s)
    {
        int l=s.length(),pos=0,i;
        String str="";
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==32 || s.charAt(i)=='.')
            {
                str=s.substring(pos,i);
                StringBuffer sb=new StringBuffer(str);
                System.out.print(sb.reverse()+" ");
                pos=i+1;
            }
        }
    }
}