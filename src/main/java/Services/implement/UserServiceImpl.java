package Services.implement;

import DTOs.UserDTO;
import Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Optional<UserDTO> getUserById(Integer userId){
        return Optional.empty();
    };

}
