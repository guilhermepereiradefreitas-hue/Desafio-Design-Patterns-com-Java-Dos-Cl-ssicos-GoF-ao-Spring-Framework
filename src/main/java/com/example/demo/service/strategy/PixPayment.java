
@Component
public class PixPayment implements PaymentStrategy {
  public void pay(Double amount) {
    System.out.println("PIX: R$ " + amount);
  }
}
