package sg.edu.nus.lapslogin.repo;

import sg.edu.nus.lapslogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}