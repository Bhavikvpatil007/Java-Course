package StaticKeyword.P2;

class Outer {

    static class Inner {
        void show() {
            System.out.println("Message from static nested class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
