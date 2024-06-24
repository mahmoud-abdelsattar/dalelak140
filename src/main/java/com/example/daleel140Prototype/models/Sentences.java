package com.example.daleel140Prototype.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name= "sentences")
public class Sentences {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(name = "arabic_sentence")
	private String   arabicSentence;
	
	@Lob
	@Column(name= "english_sentence")
	private String englishSentence;
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArabicSentence() {
		return arabicSentence;
	}

	public void setArabicSentence(String arabicSentence) {
		this.arabicSentence = arabicSentence;
	}

	public String getEnglishSentence() {
		return englishSentence;
	}

	public void setEnglishSentence(String englishSentence) {
		this.englishSentence = englishSentence;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}*/
	  @Id
	    private Integer id;
	    private String arabic_sentence;
	    private String english_sentence;
	    private String phone_number;

	    // Getters and Setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getArabic_sentence() {
	        return arabic_sentence;
	    }

	    public void setArabic_sentence(String arabic_sentence) {
	        this.arabic_sentence = arabic_sentence;
	    }

	    public String getenglish_sentence() {
	        return english_sentence;
	    }

	    public void setenglish_sentence(String english_sentence) {
	        this.english_sentence = english_sentence;
	    }

	    public String getPhone_number() {
	        return phone_number;
	    }

	    public void setPhone_number(String phone_number) {
	        this.phone_number = phone_number;
	    }


}
