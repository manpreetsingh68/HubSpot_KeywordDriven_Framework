package com.hubspot.keyword.testcases;

import org.testng.annotations.Test;

import com.hubspot.keyword.utils.KeywordExecutionEngine;

public class LoginTest {
	
	public KeywordExecutionEngine keyExecEngine;
	
	@Test
	public void loginTest() {
		keyExecEngine = new KeywordExecutionEngine();
		keyExecEngine.startExecution("Login");
		
	}

}
