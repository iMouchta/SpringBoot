package Services;

import DTOs.UserDTO;

import java.util.Optional;

public interface UserService {

    Optional<UserDTO> getUserById(Integer userId);


}
