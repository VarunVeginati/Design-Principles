public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton singleton2 = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}
