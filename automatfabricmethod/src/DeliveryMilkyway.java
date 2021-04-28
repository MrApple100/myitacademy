
public class DeliveryMilkyway implements IDelivery{
    public IProduct deliveryproduct(int kol){
        return new Milkyway(kol);
    }
}
