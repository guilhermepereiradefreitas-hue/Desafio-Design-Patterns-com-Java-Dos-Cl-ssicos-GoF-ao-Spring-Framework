
@Component
public class CreditCardPayment implements PaymentStrategy {
  public void pay(Double amount) {
    System.out.println("CREDIT CARD: R$ " + amount);
  }
}
