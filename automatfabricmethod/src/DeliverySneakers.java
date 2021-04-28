
public class DeliverySneakers implements IDelivery{
    @Override
    public IProduct deliveryproduct(int kol){
        return new Sneakers(kol);
    }
}
