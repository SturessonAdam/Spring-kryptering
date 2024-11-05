package org.example.springkryptering;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
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
