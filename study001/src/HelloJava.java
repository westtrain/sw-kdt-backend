import taylor.Book;

public class HelloJava {

    public static void main(String[] args){
        User user = new User("taylor");
        Book book = new Book();
        System.out.println(user.myName());
        System.out.println("Hello CodeStates!");
    }

}
