public class Main {
    public static void main(String[] args) {
        NoGenericMethods example = new NoGenericMethods("Object 1", "Object 2", "Object 3");


        System.out.println("Initial values:");
        System.out.println("Object 1: " + example.getObj1());
        System.out.println("Object 2: " + example.getObj2());
        System.out.println("Object 3: " + example.getObj3());

        System.out.println(" ");


        example.setObj1("New Object 1");
        example.setObj2("New Object 2");
        example.setObj3("New Object 3");


        System.out.println("Modified values:");
        System.out.println("Object 1: " + example.getObj1());
        System.out.println("Object 2: " + example.getObj2());
        System.out.println("Object 3: " + example.getObj3());
    }
}
