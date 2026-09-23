package problem_solving;
import java.util.Arrays;

public class M {

    public static void main(String[] args) {
        InnerM obj = new InnerM();
        boolean res = obj.check("Aab " , "baa");
        System.out.println(res);
    }
    
}

class InnerM {
boolean check(String s , String t){
    String a = s.replace("\\s"," ");
    String b = t.replace("\\s"," ");
    
    if (a.length()!= b.length()){
        return false;
    }
    char [] letter1 = a.toLowerCase().toCharArray();
    char [] letter2 = b.toLowerCase().toCharArray();

    Arrays.sort(letter1);
    Arrays.sort(letter2);

    if (letter1.equals(letter2)){
        return true;
    }
else return false;

   

}
    
}