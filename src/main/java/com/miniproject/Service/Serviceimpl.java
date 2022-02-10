package com.miniproject.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.Entity.Contact;
import com.miniproject.Repository.ContactRepository;
import com.miniproject.binding.ContactForm;

@Service
public class Serviceimpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;

	@Override
	public String saveContact(ContactForm form) {

		Contact entity = new Contact();
		BeanUtils.copyProperties(form, entity);
		entity.setActivesw("y");
		entity = contactrepo.save(entity);
		if (entity.getContactId() != null) {
			return "Success";
		} else {
			return "failed";
		}
	}

	@Override
	public List<ContactForm> viewContacts() {

		List<ContactForm> datalist = new ArrayList<>();

		List<Contact> findAll = contactrepo.findAll();
		
		for (Contact entity : findAll) {
			System.out.println("heyyy");
			ContactForm form = new ContactForm();
			BeanUtils.copyProperties(form, entity);
			datalist.add(form);
			System.out.println("heyyy");
		}
		return datalist;
	}

	@Override
	public ContactForm editContact(Integer contactId) {
		Optional<Contact> findById = contactrepo.findById(contactId);
		if (findById.isPresent()) {
			Contact entity = findById.get();
			ContactForm form = new ContactForm();
			BeanUtils.copyProperties(entity, form);
			return form;
		}
		return null;
	}

	@Override
	public List<ContactForm> deleteContact(Integer contactId) {
		contactrepo.deleteById(contactId);
		System.out.println("heyyy");
		return viewContacts();
	}

}
