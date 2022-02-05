import java.util.ArrayList;
class program9
{
    public static void main(String args[])
    {
        ArrayList<String>arr=new ArrayList<String>
        (5);
        arr.add("Anurag");
        arr.add("Anushka");
        arr.add("Ütkarsh");
        arr.add("Ram");
        arr.add("Shyam");
        System.out.println("The list of the length is:"+arr.size());
        for(String name:arr)
        {
            System.out.println("Name is:"+name);
        }
        arr.remove("Anushka");
        System.out.println("After removing the size of the array is:"+arr.size());
        for(String name:arr)
        {
            System.out.println("Name is:"+name);
        }
        }
    }
