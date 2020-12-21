public abstract class Figure {
    float x,y;
    abstract float getArea();
    abstract float getPerimeter();

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

