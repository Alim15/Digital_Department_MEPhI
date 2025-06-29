

public class Main {
    public static void main(String[] args) {

        BasicUser basicUser1 = new BasicUser(5, "Max");
        BasicUser basicUser2 = new BasicUser(25, "Mary");
        BasicUser basicUser3 = new BasicUser(35, "Sylviya");
        User user = new User(26, "Tom");
        basicUser1.act();
        basicUser2.act();
        basicUser3.act();
        user.act();
        user.getAge();
        System.out.println(basicUser1.getAge());
    }
}