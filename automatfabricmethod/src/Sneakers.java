public class Sneakers implements IProduct{
    int kol;

    public Sneakers(int kol) {
        this.kol = kol;
    }

    @Override
    public void getProduct(int kol) {
        this.kol=kol;
    }

    @Override
    public String getName() {
        return "Sneaker";
    }

    @Override
    public double getcoasts() {
        return 0;
    }
}
