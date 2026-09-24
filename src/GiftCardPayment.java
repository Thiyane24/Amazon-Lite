public class GiftCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paid $"+ amount + " using a giftcard." );
    }
}
