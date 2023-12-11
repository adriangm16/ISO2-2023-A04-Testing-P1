package teamA04.iso;

import java.util.Date;

public class Persona {
	
	private String name;
	
	private String lastName;
	
	private String nationality;
	
	private String education;
	
	private String englishCertification;
	
	private int phoneNumber;
	
	private String email;
	
	private int day,month,year;
	

	public Persona(String name, String lastName, String nationality, String education,
			String englishCertification, int phoneNumber, String email, int day, int month, int year){
		this.name = name;
		this.lastName = lastName;
		this.nationality = nationality;
		this.education = education;
		this.englishCertification = englishCertification;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEnglishCertification() {
		return englishCertification;
	}

	public void setEnglishCertification(String englishCertification) {
		this.englishCertification = englishCertification;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public boolean isLegal(Persona a) {
		
		int year = 2023;
		boolean age;
		
		if((year - a.year)<=18){			
			age=false;
		}else {
			age=true;
		}
		
		return age ;
		
	}
	public enum europeanCountries{
		
		SPAIN, FRANCE, ALEMANY, ITALY, UNITED_KINGDOM;
	}
	
	public static boolean isEuropean(europeanCountries country) {
		switch(country){
		
		case SPAIN:
		case ALEMANY:
		case UNITED_KINGDOM:
		case FRANCE:
		case ITALY:
			return true;
		default:
			return false;
		
		}
	}
	
	
}
