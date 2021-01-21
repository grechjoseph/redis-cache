package com.jg.rediscache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CacheService {

    /**
     * @CachePut replaces cache value having key = #student.id with the method's return value.
     */
    @CachePut(value = "Students", key = "#student.id")
    public Student addStudent(final Student student) {
        log.info("Saving student: {}", student);
        return student;
    }

    /**
     * @Cacheable Gets cached value having key #studentId, or fetches manually (executed method), returning fetched value
     * and placing it in cache for next time.
     */
    @Cacheable(value = "Students", key = "#studentId")
    public Student getStudent(final UUID studentId) {
        log.info("Retrieving student by id: {}", studentId);
        return null;
    }

    /**
     * @CacheEvict removed a cached value by key #studentId.
     */
    @CacheEvict(value = "Students", key = "#studentId")
    public void deleteStudent(final UUID studentId) {
        log.info("Deleting student by id: {}", studentId);
    }

}
