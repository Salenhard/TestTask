package Vladislav.Gurbatov.TestTask.service;

import Vladislav.Gurbatov.TestTask.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    public User save(User user);

    public void delete(Integer id);

    public User get(Integer id);

    public Page<User> getAll(Pageable pageable);


}
