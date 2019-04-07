package com.hubspot.keyword.testcases;

import org.testng.annotations.Test;

import com.hubspot.keyword.utils.KeywordExecutionEngine;

public class LoginTest {

	public KeywordExecutionEngine keyExecEngine;

	@Test(priority = 1)
	public void loginTest() {
		keyExecEngine = new KeywordExecutionEngine();
		keyExecEngine.startExecution("Login");

	}

	@Test(priority = 2)
	public void SignUpLinkTest() {
		keyExecEngine = new KeywordExecutionEngine();
		keyExecEngine.startExecution("Signup");

	}

}
