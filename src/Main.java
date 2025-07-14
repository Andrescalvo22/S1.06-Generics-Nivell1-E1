public class Main {
    public static void main(String[] args) {
        NoGenericMethod example1 = new NoGenericMethod("Object 1", "Object 2", "Object 3");
        example1.showContent();
        System.out.println("");

        NoGenericMethod example2 = new NoGenericMethod("Object 3", "Object 2 ", "Object 1");
        example2.showContent();
    }
}
