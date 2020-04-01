package com.amazon.qa.util;

import com.amazon.qa.base.TestBase;

public class TestUtil extends TestBase{
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
