 public class jagged_3d_array_30 
{
    public static void main(String a[] ) 
    {
        int nums[][]=new int[3][]; // jagged array: in this type of array hame ye nahi pata hota hai ki array ka length kitna hai 
        
        nums[0]=new int[2];
        nums[1]=new int[4];
        nums[2]=new int[3];    
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j= 0;j<nums[i].length;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }


        for (int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    
}
