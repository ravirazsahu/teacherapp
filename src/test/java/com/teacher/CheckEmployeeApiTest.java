package com.teacher;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CheckEmployeeApiTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void checkemployeeapitestcase() {
		String uri="http://localhost:8081/api/employee/alltest";
		HttpUriRequest req= new HttpGet(uri);
		try {
			HttpResponse res=HttpClientBuilder.create().build().execute(req);
			
			Assertions.assertThat(res.getStatusLine().getStatusCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
