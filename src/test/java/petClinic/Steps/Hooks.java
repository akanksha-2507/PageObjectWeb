package petClinic.Steps;

import com.petClinicAutomation.core.TestFactory;
import com.petClinicAutomation.utilities.TestConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks  {

    @Before
   public void startUp(){
        TestFactory.launchApplication(TestConfig.getConfigDetails().get("browser"));
    }

    @After
    public static void cleanUp() {
        TestFactory.driver.close();
        TestFactory.driver.quit();
    }
}
