package com.example.demo;

import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyString;

class DemoApplicationTests {

	//@Mock
	//PersonBuilder personBuilder;

	@Spy
	CreatePerson createPerson;

	@BeforeAll
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	/*@Test
	void createTest(){
		//Arrange
		Person person = new Person (1,"fernando");
		//PersonBuilder personBuilder = Mockito.mock(PersonBuilder.class);
		when(personBuilder.build(anyInt(), anyString())).thenReturn(person);

		//Act
		Person personResult = createPerson.create();

		//Assert
		assertTrue(personResult.getName().equals("fernando"));
		
		Integer i;
		
		int j;

		for (int i1 = 0; i1 < j; i1++) {
			
		}

		i.

	}*/

}
