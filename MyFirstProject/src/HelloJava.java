import java.util.ArrayList;
import java.util.HashMap;

public class HelloJava {

    static HashMap<String, String> book = new HashMap<>(); // -> 필드(전역) 변수

    public static void main(String[] args){

        CreateData("departure_times", "22:00:44!!!!!!");
        String data = book.get("departure_times");
        System.out.println(data);

    }
    public static void CreateData(String k, String v){
        book.put(k, v);
    }

    public static void update(String k, String v){
        book.put(k, v);
    }
    public static void Delect(){
        book.clear();
    }
}
