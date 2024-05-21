package curso.etech.enums;

import curso.etech.common.StaticVariables;
import curso.etech.interfaces.AppInt;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public enum AppEnum implements AppInt {
    ANDROID("ANDROID") {
        @Override
        public AndroidDriver getDriver() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            StaticVariables.setDevice("emulator-5554");
            capabilities.setCapability("deviceName", "Emulador E.Tech");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("udid", StaticVariables.getDevice());
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "br.com.filme.app");
            capabilities.setCapability("appActivity", "br.com.filme.app.modules.onboardingone.ui.OnboardingOneActivity");
            capabilities.setCapability("autoGrantPermissions", "true");
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
    };

    AppEnum(String type){}


}
