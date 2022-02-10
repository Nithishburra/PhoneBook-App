package com.miniproject.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact , Serializable>{

}
