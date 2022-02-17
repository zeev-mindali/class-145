package com.jb.spring_basic.security;


import com.jb.spring_basic.jwt.JwtTokenVerifier;
import com.jb.spring_basic.jwt.JwtUsernameAndPasswordAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    //@Autowired
    //private PasswordEncoder passwordEncoder;

    private final PasswordEncoder PASSWORD_ENCODER;

//    @Autowired
//    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder){
//        this.PASSWORD_ENCODER=passwordEncoder;
//
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable() //todo: we will talk about CSRF later
//                .authorizeRequests()
//                .antMatchers("/","index","/css/*","/js/*","/media/*","/img/*").permitAll()
//                .antMatchers("/cats/**").hasAnyRole(ApplicationUserRole.ADMIN.name()
//                 , ApplicationUserRole.SUPPORT.name()) //only admin will can login
//                //.antMatchers("/cats/**").hasRole(ApplicationUserRole.SUPPORT.name())
//                .anyRequest()
//                .authenticated()
//                .and()
//                //.httpBasic();
//                .formLogin()
//                .loginPage("/login").permitAll()
//                .defaultSuccessUrl("/mainpage",true)
//                .and()
//                .rememberMe()    //defaults to 2 weeks instead of 30 minutes
//                .tokenValiditySeconds((int) TimeUnit.MINUTES.toSeconds(30))
//                .key("class-145"); //create our own key

        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager()))
                .addFilterAfter(new JwtTokenVerifier(),JwtUsernameAndPasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/","index","/css/*","/js/*","/media/*","/img/*").permitAll()
                .antMatchers("/cat/**").hasRole(ApplicationUserRole.ADMIN.name())
                .anyRequest()
                .authenticated();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails userZeev = User.builder()
                .username("zeev")
                .password(PASSWORD_ENCODER.encode("12345")) //it will not work , since password must be encoded
                //.roles(ApplicationUserRole.ADMIN.name()) //ROLE_ADMIN
                .authorities(ApplicationUserRole.ADMIN.getGrantedAuthorities()) //getGrantedAuthorities().stream().filter(item->!item.getAuthority().contains("WRITE")
                .build();

        UserDetails userSupport = User.builder()
                .username("support")
                .password(PASSWORD_ENCODER.encode("54321")) //it will not work , since password must be encoded
                .roles(ApplicationUserRole.SUPPORT.name()) //ROLE_SUPPORT
                .build();

        return new InMemoryUserDetailsManager(userZeev,userSupport);
    }
}
