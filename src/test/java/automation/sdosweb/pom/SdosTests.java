package automation.sdosweb.pom;

import org.junit.runner.*;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ContactTest.class, ServicesTest.class})
public class SdosTests {
	
}
