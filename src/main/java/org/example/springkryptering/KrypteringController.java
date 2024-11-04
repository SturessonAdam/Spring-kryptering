package org.example.springkryptering;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KrypteringController {

    @PostMapping("/encrypt")
    public String encrypt(@RequestParam String text, @RequestParam int shift) {
        return Kryptering.encrypt(text, shift);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestParam String text, @RequestParam int shift) {
        return Kryptering.decrypt(text, shift);
    }
}
