package natomicsLab.narremeSpace.repository;

import natomicsLab.narremeSpace.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}