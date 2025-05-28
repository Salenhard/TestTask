package Vladislav.Gurbatov.TestTask.controller;

import Vladislav.Gurbatov.TestTask.entity.User;
import Vladislav.Gurbatov.TestTask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
        User resultUser = userService.update(id, user);
        return ResponseEntity.ok(resultUser);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Integer id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        User user = userService.get(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<PagedModel<User>> getAll(@RequestParam(required = false) Optional<Integer> page,
                                                   @RequestParam(required = false) Optional<Integer> size) {
        Pageable pageable = PageRequest.of(page.orElse(1) - 1, size.orElse(25));
        Page<User> users = userService.getAll(pageable);
        PagedModel<User> user = new PagedModel<>(users);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        User resultUser = userService.save(user);
        return ResponseEntity.ok(resultUser);
    }
}

