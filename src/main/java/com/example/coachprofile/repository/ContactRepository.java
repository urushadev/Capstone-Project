package com.example.coachprofile.repository;

import com.example.coachprofile.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactForm, Long> {
    ContactForm findByEmail(String email);
}