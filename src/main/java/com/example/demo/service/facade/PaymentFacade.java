
@Service
public class PaymentFacade {
  private final PaymentRepository repo;
  private final PaymentFactory factory;
  private final PaymentStrategyResolver resolver;

  public PaymentFacade(PaymentRepository repo, PaymentFactory factory, PaymentStrategyResolver resolver) {
    this.repo = repo;
    this.factory = factory;
    this.resolver = resolver;
  }

  public Payment process(PaymentRequestDTO dto) {
    Payment p = factory.create(dto);
    resolver.resolve(dto.getMethod()).pay(dto.getAmount());
    return repo.save(p);
  }
}
