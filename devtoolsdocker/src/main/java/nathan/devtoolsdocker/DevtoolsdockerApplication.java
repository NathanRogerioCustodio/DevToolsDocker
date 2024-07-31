package nathan.devtoolsdocker;

import nathan.devtoolsdocker.entity.UserEntity;
import nathan.devtoolsdocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevtoolsdockerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DevtoolsdockerApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new UserEntity(1L, "Nathan"));
		userRepository.save(new UserEntity(2L, "Dayara"));
		userRepository.save(new UserEntity(3L, "Thiago"));


	}
}
