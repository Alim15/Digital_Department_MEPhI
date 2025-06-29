public class InitBlockClass {

    private int a;
    private  String s;

    static {
        System.out.println("From static block");
    }



    {
        System.out.println("From dynamic block");
    }
    public InitBlockClass(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public void method(){

    }
}
