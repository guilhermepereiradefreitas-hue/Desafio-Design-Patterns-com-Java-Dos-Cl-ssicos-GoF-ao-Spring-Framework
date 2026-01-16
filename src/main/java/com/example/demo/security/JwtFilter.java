
@Component
public class JwtFilter extends OncePerRequestFilter {
  private final JwtUtil jwtUtil;
  public JwtFilter(JwtUtil jwtUtil) {
    this.jwtUtil = jwtUtil;
  }
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
      throws ServletException, IOException {
    String h = req.getHeader("Authorization");
    if (h != null && h.startsWith("Bearer ")) {
      String token = h.substring(7);
      String user = jwtUtil.extractUsername(token);
      SecurityContextHolder.getContext()
        .setAuthentication(new UsernamePasswordAuthenticationToken(user, null, List.of()));
    }
    chain.doFilter(req, res);
  }
}
