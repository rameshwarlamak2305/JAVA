package lab9mar;

public class StringBufferLab {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is StringBuffer");

        // Adds the string 
        sb.append(" This is a sample program");
        System.out.println(sb);

        // Inserting object at 21 position
        sb.insert(20, "Object ");
        System.out.println(sb);

     

        // Replaces the word “Buffer” with “Builder” and display it.
        sb.replace(14, 19, "Builder");
        
        
        sb.reverse();
         System.out.println(sb);

    }
}

