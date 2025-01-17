public class access local variable {
    public static void main(String[] args) {
        //int a=200;
       // System.out.println(a);
        class Local
        {
            void Local1(){
                int a=100;
                System.out.println("This ia local variable "+a);
            }

        }
        Local l= new Local();
        l.Local1();
        System.out.println(a);

    }
}