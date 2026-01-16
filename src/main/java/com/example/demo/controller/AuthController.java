
@RestController
@RequestMapping("/auth")
public class AuthController {
  private final JwtUtil jwtUtil;
  public AuthController(JwtUtil jwtUtil) {
    this.jwtUtil = jwtUtil;
  }

  @PostMapping("/login")
  public Map<String, String> login(@RequestBody Map<String, String> req) {
    if ("admin".equals(req.get("username")) && "123".equals(req.get("password"))) {
      return Map.of("token", jwtUtil.generateToken(req.get("username")));
    }
    throw new RuntimeException("Invalid credentials");
  }
}
