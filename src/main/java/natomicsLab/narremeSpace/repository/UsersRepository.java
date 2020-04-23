package natomicsLab.narremeSpace.repository;

import natomicsLab.narremeSpace.modules.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findbyName(String username);
}
