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
    public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
        Optional<Users> optionalUsers = usersRepository.findByName(user_name);

        optionalUsers
                .orElseThrow(() -> new UsernameNotFoundException("Name not found."));
        return optionalUsers
            .map(CustomUserDetails::new).get();
    }
}
