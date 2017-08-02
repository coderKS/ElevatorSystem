package com.elevator;
import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import java.util.Scanner;
/**
 * 
 * @author ryan.wong
 * Test for view class
 */
public class ViewTest {
	private View view;
	
	@Test
	public void Stub_String_as_request_in_scanner_should_return_request(){
		View view = new View();
		String request = "2:8";
		InputStream inputStream = new ByteArrayInputStream(request.getBytes());
		System.setIn(inputStream);
		assertEquals(view.getRequest(),"2:8");
	}
}
