package nathan.devtoolsdocker.repository;

import nathan.devtoolsdocker.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
