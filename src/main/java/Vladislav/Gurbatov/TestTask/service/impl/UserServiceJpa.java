package Vladislav.Gurbatov.TestTask.service.impl;

import Vladislav.Gurbatov.TestTask.entity.User;
import Vladislav.Gurbatov.TestTask.repository.UserRepository;
import Vladislav.Gurbatov.TestTask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.data.domain.Pageable;


@Service
@RequiredArgsConstructor
public class UserServiceJpa implements UserService {

    private UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public User get(Integer id) {
        return repository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "User with id: `%d` not found".formatted(id)));
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
