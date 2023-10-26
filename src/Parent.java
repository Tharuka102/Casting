public class Parent {
    void printdata() {
        System.out.println("Method of Parent class");
    }
}
class child extends Parent {
    @Override
    void printdata() {
        System.out.println("Method of child class");
    }
}
class test {
    public static void main(String[] args) {
        Parent p =new child();
        p.printdata();

    }
}