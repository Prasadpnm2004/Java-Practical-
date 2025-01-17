public class VariableExample {
    int instanceVar = 10;
    static int staticVar = 20;
    public void instanceMethod() {
        // Local variable
        int localVar = 30;
        System.out.println("Instance: " + instanceVar + ", Static: " + staticVar + ", Local: " + localVar);
    }
    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.instanceMethod();
        System.out.println("Static Variable from main: " + staticVar);
    }
}
