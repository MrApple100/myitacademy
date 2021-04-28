public class Milkyway implements IProduct{
    int kol;

    public Milkyway(int kol) {
        this.kol = kol;
    }

    @Override
    public void getProduct(int kol) {
        this.kol=kol;
    }

    @Override
    public String getName() {
        return "Milkiway";
    }

    @Override
    public double getcoasts() {
        return 0;
    }
}
