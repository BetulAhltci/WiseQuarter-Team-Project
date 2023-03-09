package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

<<<<<<< HEAD
=======
import java.time.Duration;

>>>>>>> main
public class TestBaseCross {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser){

<<<<<<< HEAD
        driver= DriverCross.getDriver(browser);
=======
        driver= DriverCros.getDriver(browser);

>>>>>>> main

    }

    @AfterMethod
    public void tearDown(){

<<<<<<< HEAD
        DriverCross.closeDriver();
    }
}


=======
        DriverCros.closeDriver();
    }
}

>>>>>>> main
