package dio_aula_jpa.repository;
import dio_aula_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {
}