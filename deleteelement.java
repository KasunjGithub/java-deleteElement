import java.util.*;
public class deleteelement
{
    public static void main(String []args)
    {
        //create an array with few elements
        System.out.print("Original array : ");
        int array[]={56,85,41,21,8};
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");

        }
        System.out.println("\n");

        //create an array with size of array-1
        int result[]=new int[array.length-1];

        //remove the element from second index
        int position=3;
        for(int i=0,k=0;i<array.length;i++)
        {
            if(i==position)
            {
                continue;
            }
            else{
                result[k++]=array[i];

            }
        }
        System.out.println("new array");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
       