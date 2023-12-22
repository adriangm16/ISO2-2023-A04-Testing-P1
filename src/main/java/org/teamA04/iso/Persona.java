package org.teamA04.iso;

import java.util.Date;

public class Persona {

	 	private String name;
	    private String lastName;
	    private europeanCountries nationality;
	    private String education;
	    private boolean englishCertification;
	    private String phoneNumber;
	    private String email;
	    private Date dateOfBirth; // Date attribute for date of birth
	    
		public Persona(String name, String lastName, europeanCountries nationality, String education, boolean englishCertification,
				String phoneNumber, String email, Date dateOfBirth) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.nationality = nationality;
			this.education = education;
			this.englishCertification = englishCertification;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.dateOfBirth = dateOfBirth;
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

		public europeanCountries getNationality() {
			return nationality;
		}

		public void setNationality(europeanCountries nationality) {
			this.nationality = nationality;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public boolean getEnglishCertification() {
			return englishCertification;
		}

		public void setEnglishCertification(boolean englishCertification) {
			this.englishCertification = englishCertification;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
		@Override
		public String toString() {
			return "Persona [name=" + name + ", lastName=" + lastName + ", nationality=" + nationality + ", education="
					+ education + ", englishCertification=" + englishCertification + ", phoneNumber=" + phoneNumber
					+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
		}

		public boolean isLegal() {
	        // Calculate legal age based on current date and date of birth
	        Date currentDate = new Date();
	        long millisInYear = 1000L * 60 * 60 * 24 * 365; // Milliseconds in a year
	        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
	        int age = (int) (ageInMillis / millisInYear);

	        return age >= 18; // Check if age is 18 or older for legal age
	    }
		
		public boolean isEuropean() {
	        for (europeanCountries European : europeanCountries.values()) {
	            if (European == this.nationality) {
	                return true;
	            }
	        }
	        return false;
	    }
}
