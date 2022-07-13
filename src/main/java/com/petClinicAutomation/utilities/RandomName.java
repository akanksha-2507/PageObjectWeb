package com.petClinicAutomation.utilities;

import com.github.javafaker.Faker;

public class RandomName {
	static Faker faker = new Faker();	

	public static String generateOwnerName(){

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		return firstName +" "+lastName;
	}

	public static String generatePetName(){

		String petName = faker.name().firstName();	
		return petName;
	}

}
