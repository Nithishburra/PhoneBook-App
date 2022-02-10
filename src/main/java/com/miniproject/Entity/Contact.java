package com.miniproject.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactname;

	@Column(name = "CONTACT_EMAIL")
	private String contactemail;

	@Column(name = "CONTACT_NUMBER")
	private Long contactnumber;

	@Column(name = "ACTIVE_SW")
	private String activesw;

	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDate createdDate;

	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate updatedDate;

}
