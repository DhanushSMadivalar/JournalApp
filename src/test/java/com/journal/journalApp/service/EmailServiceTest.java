package com.journal.journalApp.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

@SpringBootTest
@Slf4j
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        System.out.println("=== TEST STARTED ===");
        emailService.sendEmail("shanasir333@gmail.com",
                        "Testing java mail sender",
                        "hiiiii");
        log.info("Mail Sent");
    }
}
