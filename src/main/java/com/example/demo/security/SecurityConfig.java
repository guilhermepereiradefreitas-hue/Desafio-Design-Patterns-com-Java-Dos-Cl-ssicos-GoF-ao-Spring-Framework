
@Configuration
public class SecurityConfig {
  private final JwtFilter filter;
  public SecurityConfig(JwtFilter filter) {
    this.filter = filter;
  }

  @Bean
  SecurityFilterChain chain(HttpSecurity http) throws Exception {
    return http.csrf(csrf -> csrf.disable())
      .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
      .authorizeHttpRequests(a -> a.requestMatchers("/auth/login").permitAll().anyRequest().authenticated())
      .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
      .build();
  }
}
