import java.util.ArrayList;

public class Ex05 {
    // public static void main(String[] args) {
    //     ArrayList<String> arl = myGetArgs(args);
    //     System.out.println(arl);
    // }

    public static ArrayList<String> myGetArgs(String ... var) {
        ArrayList<String> arl = new ArrayList<String>();
        for (String str : var) {
            arl.add(str);
        }
        return arl;
    }
}
