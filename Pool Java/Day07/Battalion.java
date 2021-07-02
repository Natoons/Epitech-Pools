import java.util.ArrayList;
import java.util.List;

public class Battalion<T extends Character> {
    List<T> characters = new ArrayList<T>();

    public void add(List<T> list){
        for(T c: list) {
            characters.add(c);
        }
    }

    public void display(){
        for(Object str : characters) {
            System.out.println(((Character) str).getName());
        }
    }
}
