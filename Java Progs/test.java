class Test {
    private Test(int data) {
        System.out.printf(" Constructor called ");
    }

    protected static Test create(int data) {
        Test obj = new Test(data);
        return obj;
    }

    public void myMethod() {
        System.out.printf(" Method called ");
    }
}

public class Testt

{

    public static void main(String[] args)

    {

        Test obj = Test.create(20);

        obj.myMethod();

    }

}