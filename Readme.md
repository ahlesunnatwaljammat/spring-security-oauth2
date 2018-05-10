Spring security with default password encoder
<pre>@Bean
public MapReactiveUserDetailsService userDetailsService() {        
    UserDetails user = User.withUsername("user")
            .password("user")
            .roles("USER")
            .build();
    return new MapReactiveUserDetailsService(user);
}
</pre>

Add BCrypt password encoder in spring security
<pre>
@Bean
public MapReactiveUserDetailsService userDetailsService() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    UserDetails user = User.withUsername("admin")
            .password(encoder.encode("x"))
            .roles("USER")
            .build();
    return new MapReactiveUserDetailsService(user);
}
</pre>

Once password encoder is added then login wont work and application will throw
<br><b>"No password encoder exception"</b>
To resolve the above exception, please add the following password encoder
<pre>
@Bean
PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}
</pre>
 