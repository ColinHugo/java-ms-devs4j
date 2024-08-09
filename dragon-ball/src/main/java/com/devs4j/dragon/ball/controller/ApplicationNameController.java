package com.devs4j.dragon.ball.controller;

import com.devs4j.dragon.ball.config.DragonBallConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/application-name" )
public class ApplicationNameController {

    private final DragonBallConfig dragonBallConfig;

    @GetMapping
    public ResponseEntity< String > getAppName() {
        return ResponseEntity.ok( dragonBallConfig.getApplicationName() );
    }

}