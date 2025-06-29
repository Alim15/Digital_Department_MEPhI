public class BasicUser {
    private int age;
    private String name;
    private static final int Max_Age = 140;
    protected void act(){
        System.out.println("Act as BasicUser");
    }


    public BasicUser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
