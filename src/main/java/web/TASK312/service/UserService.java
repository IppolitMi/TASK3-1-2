package web.TASK312.service;

import web.TASK312.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUserById(int id);

    List<User> getAllUsers();
}