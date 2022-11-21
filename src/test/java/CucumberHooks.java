import io.cucumber.java.*;

public class CucumberHooks {

  @BeforeAll
  public static void before_all() {
    System.out.println("Before All");
  }

  @Before
  public void before() {
    System.out.println("Before");
  }

  @BeforeStep
  public void beforeStep() {
    System.out.println("Before Step");
  }

  @AfterAll
  public static void after_all() {
    System.out.println("After All");
  }

  @After
  public void after() {
    System.out.println("After");
  }

  @AfterStep
  public void afterStep() {
    System.out.println("After Step");
  }
}
