package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

@SpringBootTest
class RestAssuredApplicationTests {

//	@Test
//	void contextLoads() {
//		RestAssured.baseURI = "https://rahulshettyacademy.com";
//		given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
//		.body("{\n"
//				+ "    \"location\": {\n"
//				+ "        \"lat\": -38.383494,\n"
//				+ "        \"lng\": 33.427362\n"
//				+ "    },\n"
//				+ "    \"accuracy\": 50,\n"
//				+ "    \"name\": \"Rahul Shetty Academy\",\n"
//				+ "    \"phone_number\": \"(+91) 983 893 3937\",\n"
//				+ "    \"adress\": \"29, side layout, cohen 09\",\n"
//				+ "    \"types\": [\n"
//				+ "        \"shoe park\",\n"
//				+ "        \"shop\"\n"
//				+ "    ],\n"
//				+ "    \"website\": \"https://rahulshettyacademy.com\",\n"
//				+ "    \"language\": \"French-IN\"\n"
//				+ "}").when().post("maps/api/place/add/json")
//		.then().assertThat().statusCode(200);
//	}
	@Test
	void postJira() {
		System.out.println("Post Jira");
	}

}
