
@RestController
@RequestMapping("/payments")
public class PaymentController {
  private final PaymentFacade facade;
  public PaymentController(PaymentFacade facade) {
    this.facade = facade;
  }

  @PostMapping
  public ResponseEntity<Payment> pay(@RequestBody PaymentRequestDTO dto) {
    return ResponseEntity.ok(facade.process(dto));
  }
}
