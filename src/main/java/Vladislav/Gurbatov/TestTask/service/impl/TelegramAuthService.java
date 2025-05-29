package Vladislav.Gurbatov.TestTask.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TelegramAuthService {

    private final String botToken;

    public TelegramAuthService(@Value("${telegram.bot.token}") String botToken) {
        this.botToken = botToken;
    }
}
