public class User extends BasicUser {
    public User(int age, String name) {
        super(age, name);
    }

    @Override
    protected void act() {
        System.out.println("Act as User");
        System.out.println("Act as User");
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
