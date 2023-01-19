package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.service.HelloService;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
//org.mockito.exceptions.misusing.UnnecessaryStubbingException: Unnecessary stubbings detected.
//JUnit 5 tests you can silence this exception using this annotation
class HelloWorldTest {

	@Mock
	HelloService helloService;

	@InjectMocks
	HelloWorld helloWorld;

	@Test
	public void testMain() {
		Mockito.when(helloService.sayHello("testing")).thenReturn("Welcome testing");
		// HelloWorld helloWorld = new HelloWorld();
		String actual = helloWorld.callService("testing");
		assertEquals("Welcome testing", actual);

	}
}
