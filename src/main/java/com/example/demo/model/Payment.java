
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Double amount;
  private String method;
}
