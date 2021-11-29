package com.DemoCommerce.qa.TestCases;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;




/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static Logger log = LogManager.getLogger(AppTest.class.getName());
  
    @Test
    public void shouldAnswerWithTrue()
    {
    log.debug("Macha debug da");
    log.warn("Macha nammake warning da");
    log.info("Macha info da");
    log.error("Macha error da");
     }
}
