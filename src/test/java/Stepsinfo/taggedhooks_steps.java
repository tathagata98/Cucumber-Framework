package Stepsinfo;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class taggedhooks_steps 
{
WebDriver driver;

public taggedhooks_steps(common_steps comsteps)
{
	driver=comsteps.driver();
}
@Before(value="@Advance",order=1)
public void executehookstepbefore()
{
	System.out.println("This will execute after the global before hook");
}
@After(value="@Searchlink",order=0)
public void executehookstepafter()
{
	System.out.println("This will execute after the global after hook");	
}
}
