
@Component
public class JwtUtil {
  private final String SECRET = "secret-key-example-1234567890";
  public String generateToken(String username) {
    return Jwts.builder()
      .setSubject(username)
      .setIssuedAt(new Date())
      .setExpiration(new Date(System.currentTimeMillis() + 86400000))
      .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()))
      .compact();
  }
  public String extractUsername(String token) {
    return Jwts.parserBuilder()
      .setSigningKey(SECRET.getBytes())
      .build()
      .parseClaimsJws(token)
      .getBody()
      .getSubject();
  }
}
