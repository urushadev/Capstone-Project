package com.example.coachprofile.Service;

import com.example.coachprofile.repository.ContactRepository;
import com.example.coachprofile.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public ContactForm saveContactForm(ContactForm contactForm) {
        return repository.save(contactForm);
    }

    public List<ContactForm> getAllContacts() {
        return repository.findAll();
    }

    public ContactForm getContactByEmail(String email) {
        return repository.findByEmail(email);
    }

    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}