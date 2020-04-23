package natomicsLab.narremeSpace.service;

import natomicsLab.narremeSpace.modules.CustomUserDetails;
import natomicsLab.narremeSpace.modules.Users;
import natomicsLab.narremeSpace.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByName(String username) throws UsernameNotFoundException {
        Optional<Users> optionalUsers = usersRepository.findbyName(username);

        optionalUsers
                .orElseThrow(() -> new UsernameNotFoundException("Name not found."))
        return optionalUsers
            .map(CustomUserDetails::new).get();
    }
}
