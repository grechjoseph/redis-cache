package com.jg.rediscache;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class CacheController {

    private final CacheService service;

    @PostMapping
    public void addStudent(@RequestBody final Student student) {
        service.addStudent(student);
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable final UUID studentId) {
        return service.getStudent(studentId);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable final UUID studentId) {
        service.deleteStudent(studentId);
    }

}
