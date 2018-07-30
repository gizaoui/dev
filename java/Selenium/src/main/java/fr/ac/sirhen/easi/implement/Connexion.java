package fr.ac.sirhen.easi.implement;


import fr.ac.sirhen.easi.IConnexion;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;


public class Connexion implements IConnexion {

    private static Logger logger = Logger.getLogger(Connexion.class);

    private String remoteWebDriver;
    private String remoteBrowser;
    private short port;

    private BrowserMobProxy proxyServer;
    private String browser;
    private String binary;
    private WebDriver driver;
    private WebDriverWait wait;

    private short timeout;
    private short stepSleep;
    private DesiredCapabilities capabillities;

    private static int nbInstance=0;



    public WebDriver getDriver() {
        return driver;
    }

    public BrowserMobProxy getBrowserProxy() {
        return proxyServer;
    }


    public short getTimeout() {
        return timeout;
    }

    public void setTimeout(short timeout) {
        this.timeout = timeout;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }


    public void setBinary(String binary) {
        this.binary = binary;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public void setStepSleep(short stepSleep) {
        this.stepSleep = stepSleep;
    }

    public short getStepSleep() {
        return stepSleep;
    }

    public void setRemoteWebDriver(String remoteWebDriver) {
        this.remoteWebDriver = remoteWebDriver;
    }

    public void setRemoteBrowser(String remoteBrowser) {
        this.remoteBrowser = remoteBrowser;
    }

    public void setPort(short port) {
        this.port = port;
    }


    public void Initialize() {

        proxyServer = new BrowserMobProxyServer();
        proxyServer.setHarCaptureTypes(CaptureType.getAllContentCaptureTypes());
        proxyServer.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT, CaptureType.REQUEST_HEADERS);
        proxyServer.setTrustAllServers(true);

        // Port de départ. Incrémenté à chaque nouvelle instance (ou Thread)
        proxyServer.start(port + nbInstance++);



        logger.debug(" ---> Browser : " + proxyServer.getPort() );


        // OPTION LOCAL
        if (browser.indexOf("geckodriver") > -1) {
            driver = new FirefoxDriver(OptionsManager.getFirefoxOptions(browser, binary, proxyServer));
        } else if (browser.indexOf("chromedriver") > -1) {
            driver = new ChromeDriver(OptionsManager.getChromeOptions(browser, binary, proxyServer));
        } else {

            // OPTION REMOTE
            Proxy proxy = ClientUtil.createSeleniumProxy(proxyServer);

            // L'exploitation d'un tunnel permet de pointer sur l'IP 127.0.0.1
            proxy.setHttpProxy("127.0.0.1:" + proxyServer.getPort());
            proxy.setSslProxy("127.0.0.1:" + proxyServer.getPort());

            logger.info("BrowserMobProxyServer.getPort(): " + proxyServer.getPort());

            // Sélection du navigateur
            capabillities = DesiredCapabilities.firefox();
            capabillities.setBrowserName(remoteBrowser);

            // Prise en charge de la collecte des données par le navigateur sélectionné ci-dessus
            capabillities.setCapability(CapabilityType.PROXY, proxy);

            logger.info("RemoteWebDriver: " + remoteWebDriver);
            try {
                driver = new RemoteWebDriver(new URL(remoteWebDriver), capabillities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        // ===========================================================================

        wait = new WebDriverWait(driver, timeout);  // Attente  max. d'un évènement de 60 secondes
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);  // Timeout URL
    }




    public void Finalize() {

        try {
            Thread.sleep(3000);

            if (driver != null) driver.quit();
            //      if (proxyServer != null) proxyServer.stop();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            logger.debug(">>>>>>>>>>>>> Finalize ");
            //System.exit(0);
        }

    }


}


