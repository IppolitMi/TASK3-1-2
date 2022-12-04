package web.TASK312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.TASK312.dao.UserDao;
import web.TASK312.models.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return this.dao.getUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        this.dao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {
        this.dao.deleteUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.dao.getAllUsers();
    }
}