package com.example.madhu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customerapi1")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

//	@Column(name="streetaddress")
//	private String streetaddress;
//	
//	@Column(name="streetaddressline")
//	private String streetaddressline;
//	
//	@Column(name="city")
//	private String city;
//	
//	@Column(name="state")
//	private String state;
//	
//	@Column(name="postal")
//	private long postal;
//	
//	@Column(name="phonenumber")
//	private long phonenumber;
//	
//	@Column(name="email")
//	private String email;
//	
//	@Column(name="how_did_you_here_about_us")
//	private String Howdidyouhereaboutus;
//	
//	@Column(name="feedback_about_us")
//	private String Feedbackaboutus;
//	
//	@Column(name="suggestions_if_any_for_further_improvement")
//	private String Suggestionsifanyforfurtherimprovement;
//	
//	@Column(name="will_you_be_willing_to_recommend_us")
//	private String Willyoubewillingtorecommendus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getStreetaddress() {
//		return streetaddress;
//	}
//
//	public void setStreetaddress(String streetaddress) {
//		this.streetaddress = streetaddress;
//	}
//
//	public String getStreetaddressline() {
//		return streetaddressline;
//	}
//
//	public void setStreetaddressline(String streetaddressline) {
//		this.streetaddressline = streetaddressline;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public long getPostal() {
//		return postal;
//	}
//
//	public void setPostal(long postal) {
//		this.postal = postal;
//	}
//
//	public long getPhonenumber() {
//		return phonenumber;
//	}
//
//	public void setPhonenumber(long phonenumber) {
//		this.phonenumber = phonenumber;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getHowdidyouhereaboutus() {
//		return Howdidyouhereaboutus;
//	}
//
//	public void setHowdidyouhereaboutus(String howdidyouhereaboutus) {
//		Howdidyouhereaboutus = howdidyouhereaboutus;
//	}
//
//	public String getFeedbackaboutus() {
//		return Feedbackaboutus;
//	}
//
//	public void setFeedbackaboutus(String feedbackaboutus) {
//		Feedbackaboutus = feedbackaboutus;
//	}

//	public String getSuggestionsifanyforfurtherimprovement() {
//		return Suggestionsifanyforfurtherimprovement;
//	}
//
//	public void setSuggestionsifanyforfurtherimprovement(String suggestionsifanyforfurtherimprovement) {
//		Suggestionsifanyforfurtherimprovement = suggestionsifanyforfurtherimprovement;
//	}
//
//	public String getWillyoubewillingtorecommendus() {
//		return Willyoubewillingtorecommendus;
//	}

//	public void setWillyoubewillingtorecommendus(String willyoubewillingtorecommendus) {
//		Willyoubewillingtorecommendus = willyoubewillingtorecommendus;
//	}
//
//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetaddress="
//				+ streetaddress + ", streetaddressline=" + streetaddressline + ", city=" + city + ", state=" + state
//				+ ", postal=" + postal + ", phonenumber=" + phonenumber + ", email=" + email + ", Howdidyouhereaboutus="
//				+ Howdidyouhereaboutus + ", Feedbackaboutus=" + Feedbackaboutus
//				+ ", Suggestionsifanyforfurtherimprovement=" + Suggestionsifanyforfurtherimprovement
//				+ ", Willyoubewillingtorecommendus=" + Willyoubewillingtorecommendus + "]";
//	}
//
//	public Customer(int id, String firstName, String lastName, String streetaddress, String streetaddressline,
//			String city, String state, long postal, long phonenumber, String email, String howdidyouhereaboutus,
//			String feedbackaboutus, String suggestionsifanyforfurtherimprovement,
//			String willyoubewillingtorecommendus) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.streetaddress = streetaddress;
//		this.streetaddressline = streetaddressline;
//		this.city = city;
//		this.state = state;
//		this.postal = postal;
//		this.phonenumber = phonenumber;
//		this.email = email;
//		Howdidyouhereaboutus = howdidyouhereaboutus;
//		Feedbackaboutus = feedbackaboutus;
//		Suggestionsifanyforfurtherimprovement = suggestionsifanyforfurtherimprovement;
//		Willyoubewillingtorecommendus = willyoubewillingtorecommendus;
//	}
	
	

	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
