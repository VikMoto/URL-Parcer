package com.parser.controller;

import com.parser.common.Constants;
import com.parser.domain.URL;
import com.parser.service.URLService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class URLController {
    private final URLService urlService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping()
    public ResponseEntity<Void> submitUrl(@RequestBody URL url) {
        url.setId(Constants.URL_UUID_PREFIX + UUID.randomUUID().toString());
        url.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        urlService.save(url);
        System.out.println(url);
        return ResponseEntity.ok().build();
    }
}
