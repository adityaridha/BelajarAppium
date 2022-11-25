package belajarappium;

import io.cucumber.java.*;

public class CucumberHooks {

  @BeforeAll
  public static void before_all() {
    BaseTest.setupDriver();
  }

  @AfterAll
  public static void afterAll() {
    BaseTest.stopDriver();
  }

  @After
  public static void after() {
    BaseTest.resetApp();
  }

}
