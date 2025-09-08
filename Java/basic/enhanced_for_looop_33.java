public class enhanced_for_looop_33 
{
    public static void main(String[] args)
    {
        // int num[]=new int[3];
        // num[0]=9;
        // num[1]=6;
        // num[2]=834;
        //  for(int n:num)        
        //  {
        //     System.out.println(n);
        //  }
        student s1 =new student();
        s1.rollno=1;
        s1.name="nisidh";
        s1.marks=91;

        student s2 =new student();
        s2.rollno=21;
        s2.name="Tannu";
        s2.marks=96;
        
        student s3 =new student();
        s3.rollno=19;
        s3.name="Raj";
        s3.marks=92;

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (student stud:students)
        {
            System.out.println(stud.name +":"+stud.marks);
        }

        
 
    }
    
    
}
