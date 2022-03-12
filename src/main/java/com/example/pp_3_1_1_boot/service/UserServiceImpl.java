package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.model.User;
import com.example.pp_3_1_1_boot.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userDao;

    public UserServiceImpl(UserRepository userDao) {
        this.userDao = userDao;
    }

    public List<User> index() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getUser(long id) {
        return userDao.getById(id);
    }

    public void update(User user) {
        userDao.save(user);
    }

    public void delete(long id) {
        userDao.deleteById(id);
    }

}
