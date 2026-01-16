
@Component
public class PaymentStrategyResolver {
  private final Map<String, PaymentStrategy> map;
  public PaymentStrategyResolver(PixPayment pix, CreditCardPayment credit) {
    map = Map.of("PIX", pix, "CREDIT", credit);
  }
  public PaymentStrategy resolve(String method) {
    return map.get(method.toUpperCase());
  }
}
