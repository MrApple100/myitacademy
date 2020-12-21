public class Circle extends Figure implements Moveable{
    float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float)(Math.PI*radius*radius);
    }

    @Override
    float getPerimeter() {
        return (float)(2*Math.PI*radius);
    }

    @Override
    public void move(float dx, float dy) {
        x+=dx;
        y+=dy;
    }

    @Override
    public void resize(float koeff) {
        radius*=koeff;
    }

    @Override
    public String toString() {
        return "Circle Center: ("+ x +
                ", " + y +") "
                +
                "Radius: " + radius;
    }
}