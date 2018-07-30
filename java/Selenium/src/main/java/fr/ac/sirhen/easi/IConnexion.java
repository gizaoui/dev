package fr.ac.sirhen.easi;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IConnexion {
    void Initialize();
    BrowserMobProxy getBrowserProxy();
    WebDriver getDriver();
    short getTimeout();
    String getBrowser();
    WebDriverWait getWait();
    void Finalize();
    short getStepSleep();
}
