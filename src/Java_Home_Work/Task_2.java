package Java_Home_Work;

//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
public class Task_2 {
    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(replace(s));
    }
    static String replace(String s)
    {
        String end = "";
         s = s.trim();
         String[] x  = s.split("\\s+");
        for (int i = x.length-1; i > 0; i--)
        {
            end = end + x[i] + " ";
        }
        return end + x[0];
    }
}
