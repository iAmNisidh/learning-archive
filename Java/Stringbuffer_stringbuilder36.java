public class Stringbuffer_stringbuilder36

{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Nisidh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("kumar");
        System.out.println(sb);
        String str= sb.toString();
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(6, "kumar");
        System.out.println(sb);
        sb.setLength(51);
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb);
    
    
        
    }

    
}
