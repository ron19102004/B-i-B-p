package BaiBip;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(70);
        ResizableCircle resizableCircle = new ResizableCircle(70);
        System.out.println(circle.toString());
        resizableCircle.resize(20);
        System.out.println(resizableCircle.toString());
    }
}
