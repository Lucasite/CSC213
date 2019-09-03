package StringManipulation;

/**
 *
 * @author Davindra O'Neal
 */
public class StringManipulation {

    public static void main(String[] args) {
        
        String string = new String("Davindra");
        string.concat("O'Neal");
        System.out.println(string);
        
        StringBuffer sb = new StringBuffer("Davindra ");
        sb.append("O'Neal");
        System.out.println(sb);
    }
    
}
