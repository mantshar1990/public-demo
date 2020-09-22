package com.service.schoolservice.schoolservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SchoolController{

    @GetMapping(value="/schoolName", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSchoolDetails(@RequestHeader String schoolCode){

        return ResponseEntity.status(HttpStatus.OK).body("Test the service @@@@ "+schoolCode);
    }
}