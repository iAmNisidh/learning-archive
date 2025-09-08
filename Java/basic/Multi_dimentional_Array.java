import java.util.Scanner;

public class Multi_dimentional_Array 
{
    public static void main(String[] args)
    {
        int nums[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int nums2[][] = new int[3][3];
        for(int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                nums2[i][j] = sc.nextInt();
            }
        }

        int num3[][] = new int[3][3];
        for (int k = 0 ; k<3; k++){
            for(int o = 0; o<3; o++){
                num3[k][o] = nums[k][o] + nums2[k][o]; 
            }
        }

        for (int i = 0; i < num3.length; i++) {
            for (int j = 0; j < num3[i].length; j++) {
                System.out.print(num3[i][j] + "    "); // Print each element with a tab space
            }
            System.out.println(); // Move to the next row
            System.out.println();
        }

        // int x = sc.nextInt();
        // int nums[][]= new int[3][4];
        // //int random = (int) (Math.random()*10);
        // for (int i=0;i<3;i++)
        // {
        //     for(int j = 0;j<4;j++)
        //     {
        //     nums[i][j]=(int)(Math.random()*10);
        //     //System.out.println(nums[i][j]);
        //     //nums[i][j] = random;
        //     }
        // }
        //     for (int i=0;i<3;i++)
        // {
        //     for(int j = 0;j<4;j++)
        //     {
        //     System.out.print(nums[i][j]+" ");
           
        //     }
        //     System.out.println();

        // }
        // by the use of enhanced for loop
        // for(int n[]:nums)  // n here is  ot a simple variable  its a itself a array
        // {
        //     for(int m:n)
        //     {
        //         System.out.print(m+" "); 
        //     }
        //     System.out.println();
        // }
    }
                                              
    
}
