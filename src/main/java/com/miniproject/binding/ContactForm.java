package com.miniproject.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContactForm {

	private Integer contactId;

	private String contactname;

	private String contactemail;

	private Long contactnumber;

	private String activesw;

	private LocalDate createdDate;

	private LocalDate updatedDate;

}
