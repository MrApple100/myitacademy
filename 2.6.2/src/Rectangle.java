
class Rectangle extends Figure implements Moveable {
    float height;
    float width;
    float size = 1.0F;

    Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    float getArea() {
        return this.height * this.width;
    }

    float getPerimeter() {
        return 2.0F * (this.height + this.width);
    }

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public void resize(float koeff) {
        this.size = koeff;
        this.height *= this.size;
        this.width *= this.size;
    }

    public String toString() {
        String var10000 = String.valueOf((double)this.x + 0.5D * (double)this.size);
        return "Rectangle\nCenter: (" + var10000 + ", " + String.valueOf((double)this.y + 0.5D * (double)this.size) + ")\nHeight: " + String.valueOf(this.height) + "\nWidth: " + String.valueOf(this.width);
    }
}