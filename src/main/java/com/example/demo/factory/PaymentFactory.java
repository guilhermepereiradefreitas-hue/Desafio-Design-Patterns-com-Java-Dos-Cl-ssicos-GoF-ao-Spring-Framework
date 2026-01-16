
@Component
public class PaymentFactory {
  public Payment create(PaymentRequestDTO dto) {
    return Payment.builder()
      .amount(dto.getAmount())
      .method(dto.getMethod())
      .build();
  }
}
