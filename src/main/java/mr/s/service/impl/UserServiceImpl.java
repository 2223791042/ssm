package mr.s.service.impl;

import mr.s.dao.UserMapper;
import mr.s.entity.User;
import mr.s.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Transactional
    public void register(User user) {
        userMapper.insertSelective(user);
    }
}
