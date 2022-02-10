package com.miniproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.Service.ContactService;
import com.miniproject.binding.ContactForm;

@RestController
public class ContactRestController {

	@Autowired
	private ContactService service;

	@PostMapping("/save")
	public String saveContact(@RequestBody ContactForm form) {
		String status = service.saveContact(form);
		return status;

	}

	@GetMapping("/contacts")
	public List<ContactForm> ViewAllContacts() {
		return service.viewContacts();
	}

	@GetMapping("/edit/{contactId}")
	public ContactForm editcontact(@PathVariable Integer contactId) {
		return service.editContact(contactId);
	}

	@DeleteMapping("/delete/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactId) {
		return service.deleteContact(contactId);
	}
}

