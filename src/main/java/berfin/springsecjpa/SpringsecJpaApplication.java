package berfin.springsecjpa;

import berfin.springsecjpa.entities.AppUser;
import berfin.springsecjpa.entities.Role;
import berfin.springsecjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecJpaApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringsecJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        AppUser adminAccount = userRepository.findByRole(Role.ADMIN);
        if (null == adminAccount){
            AppUser user = new AppUser();
            user.setEmail("admin@gmail.com");
            user.setFirstname("admin");
            user.setSurname("admin");
            user.setRole(Role.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
            userRepository.save(user);
        }
    }
}
