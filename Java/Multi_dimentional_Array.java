public class Multi_dimentional_Array 
{
    public static void main(String[] args)
    {
        int nums[][]= new int[3][4];
        //int random = (int) (Math.random()*10);
        for (int i=0;i<3;i++)
        {
            for(int j = 0;j<4;j++)
            {
            nums[i][j]=(int)(Math.random()*10);
            //System.out.println(nums[i][j]);
            //nums[i][j] = random;
            }
        }
        //     for (int i=0;i<3;i++)
        // {
        //     for(int j = 0;j<4;j++)
        //     {
        //     System.out.print(nums[i][j]+" ");
           
        //     }
        //     System.out.println();

        // }
        // by the use of enhanced for loop
        for(int n[]:nums)  // n here is  ot a simple variable  its a itself a array
        {
            for(int m:n)
            {
                System.out.print(m+" "); 
            }
            System.out.println();
        }
    }
                                              
    
}
