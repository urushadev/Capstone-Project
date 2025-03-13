//package com.example.coachprofile.config;
//
//import com.example.coachprofile.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll() // ✅ Allow static files
//                        .requestMatchers("/sign-in", "/register", "/home", "/about", "/contact").permitAll() // ✅ Allow public pages
//                        .anyRequest().authenticated() // 🔒 Protect other pages
//                )
//                .formLogin(form -> form
//                        .loginPage("/sign-in") // Use custom login page, or remove this to use Spring Security's default
//                        .loginProcessingUrl("/login") // Specify the form action URL
//                        .defaultSuccessUrl("/dashboard", true) // Redirect to dashboard on successful login
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl("/sign-in")
//                );
//        return http.build();
//    }
//}

package com.example.coachprofile.config;

import com.example.coachprofile.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private UserService userService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll() // ✅ Allow static resources
                        .requestMatchers("/home", "/about", "/contact", "/sign-in", "/register").permitAll() // ✅ Allow public pages
                        .anyRequest().authenticated() // 🔒 Protect other pages
                )
                .formLogin(form -> form
                        .loginPage("/sign-in") // ✅ Custom login page
                        .loginProcessingUrl("/login") // ✅ Form action URL
                        .defaultSuccessUrl("/dashboard", true) // ✅ Redirect to dashboard after successful login
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // ✅ Custom logout URL
                        .logoutSuccessUrl("/sign-in") // ✅ Redirect to sign-in after logout
                        .invalidateHttpSession(true) // ✅ Invalidate session on logout
                        .deleteCookies("JSESSIONID") // ✅ Delete session cookies on logout
                )
                .csrf(csrf -> csrf
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // ✅ Enable CSRF protection
                );

        return http.build();
    }
}
