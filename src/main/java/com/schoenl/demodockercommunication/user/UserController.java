package com.schoenl.demodockercommunication.user;

import com.schoenl.demodockercommunication.ApplicationConfigProperties;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("v1/users")
@Log4j2
@AllArgsConstructor
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;
    private final RestTemplate restTemplate;
    private final ApplicationConfigProperties applicationConfigProperties;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(value = "userId") Long id) {
        return ResponseEntity.ok(userService.getAllUsers().getFirst());
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(applicationConfigProperties.toString());
    }

    @PostMapping("/receive")
    public ResponseEntity<String> receive(@RequestBody String msg) {
        LOGGER.info("INPUT: {}", msg);
        return ResponseEntity.ok(msg);
    }

    @GetMapping("/send")
    public ResponseEntity<String> send() {

        return ResponseEntity.ok("Gesendet");
    }

}
