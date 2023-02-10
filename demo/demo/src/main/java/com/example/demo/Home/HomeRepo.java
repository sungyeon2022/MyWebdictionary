package com.example.demo.Home;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepo extends JpaRepository<Home, Integer> {
    Home findBySubject(String subject);
    Home findBySubjectAndContent(String subject,String content);
}
