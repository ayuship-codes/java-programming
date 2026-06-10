

public class StrgBuf {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sunflower");
        System.out.println(sb);
        System.out.println(sb.capacity());   //25
        //capacity of a blank object is 16 bit, but above it became 25 adding the string charcters(16 + 9)
        
        //appending
        System.out.println(sb.append(" yellow"));

        //inserting
        System.out.println(sb.insert(3, " + "));

        //replacing
        sb.replace(6, 10, "World"); 
        System.out.println(sb);

        //deleting
        sb.delete(5, 7); 
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
