package com.example.demo.webcontroller;




import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class LoginAuthority extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{ 
        //PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
            .withUser("yuangli")
            .password("1234")
            .roles("USER");
        
            
    }

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
            
            .antMatchers( "/public/**").permitAll()
            // .anyRequest().authenticated()
            .and()
            .formLogin(form -> form
            //https://www.baeldung.com/spring-security-login  (sending the password and account id to backend- todo)
            .loginPage("/welcome2")
            
           
            
            
            // .usernameParameter("username")
            // .passwordParameter("password")
            // .loginProcessingUrl("/employee").permitAll()
            .defaultSuccessUrl("/employee",true).permitAll()
            .failureUrl("/welcome2?error=true")
                 
            );
 
             
    }
//     @Bean
//     public PasswordEncoder getPasswordEncoder() {
//         return NoOpPasswordEncoder.getInstance();
// }
//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//             .antMatchers( "/public/**").permitAll() 
//             // .anyRequest().authenticated()
//             .and()
//             .formLogin(form -> form
//                 .loginPage("/welcome2.html")
//                 .defaultSuccessUrl("/manager.html")
//             );  
            
//         return http.build();
//     }



    // @Bean
    // public InMemoryUserDetailsManager userDetailsService() {
    //     UserDetails user = User.withDefaultPasswordEncoder()
    //         .username("user")
    //         .password("password")
    //         .roles("USER")
    //         .build();
    //     return new InMemoryUserDetailsManager(user);
    // }

}
    
    


