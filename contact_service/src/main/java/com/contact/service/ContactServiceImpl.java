package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "sumit@gmail.com", "Amit", 101L),
            new Contact(2L, "jatin@gmail.com", "Anil", 101L),
            new Contact(3L, "rohit@gmail.com", "Rohan", 102L),
            new Contact(4L, "kamal@gmail.com", "Sameer", 103L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
