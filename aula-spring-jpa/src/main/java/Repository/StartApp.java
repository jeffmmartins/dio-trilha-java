package Repository;

import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Jefferson");
        user.setUsername("Jeff");
        user.setPassword("Dio");

        userRepository.save(user);

        for (User u : userRepository.findAll()){
            System.out.println(u);
        }
    }
}
