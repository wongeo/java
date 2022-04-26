public class 值传递和引用传递 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "p1";

        System.out.println(p.name);
    }

    static void run(Person p) {
        Person temp = new Person();
        temp.name = "p3";
        p = temp;
    }

    static class Person {
        String name;
    }
}
