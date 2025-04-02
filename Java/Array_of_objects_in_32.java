

class student
{
    int rollno;
    String name;
    int marks;

}
public class Array_of_objects_in_32 
{
    public static void main (String[] args)
    {
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

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno+" "+students[i].name +":"+ students[i].marks);

        }






        
        // int numss[]=new int[6];
        // numss[0]=1;
        // numss[1]=2;
        // numss[2]=6                               ;
        // numss[3]=8;

        // for(int i= 0; i<numss.length;i++)
        // {
        //     System.out.println(numss[i]);
        // }

    }
}
