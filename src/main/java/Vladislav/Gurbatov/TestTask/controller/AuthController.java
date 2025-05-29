package Vladislav.Gurbatov.TestTask.controller;

import Vladislav.Gurbatov.TestTask.service.impl.TelegramAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    public final TelegramAuthService telegramAuthService;

    @PostMapping("/telegram")
    public ResponseEntity<?> authenticate(@RequestParam String initData) {
        System.out.println(initData);
        return ResponseEntity.ok().build();
    }

}
