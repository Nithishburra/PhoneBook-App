package com.miniproject.Service;

import java.util.List;

import com.miniproject.binding.ContactForm;

public interface ContactService {

	public String saveContact(ContactForm form);

	public List<ContactForm> viewContacts();

	public ContactForm editContact(Integer contactId);

	public List<ContactForm> deleteContact(Integer contactId);

}
