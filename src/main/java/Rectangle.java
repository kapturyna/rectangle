public class Rectangle {

    private int a;

    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int obliczPole() {
        return a * b;
    }

    int obliczObwod() {
        return (2 * a) + (2 * b);
    }

}
