package fr.ac.sirhen.easi.implement;


import net.lightbody.bmp.BrowserMobProxy;

import net.lightbody.bmp.client.ClientUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.net.Inet4Address;
import java.net.UnknownHostException;


public class OptionsManager {

    private static Logger logger = Logger.getLogger(OptionsManager.class);


    //Get Chrome Options
    public static ChromeOptions getChromeOptions(String browser, String binary, BrowserMobProxy proxyServer) {

        logger.debug("CHROME : " + browser);

        Proxy proxy = ClientUtil.createSeleniumProxy(proxyServer);
        System.setProperty("webdriver.chrome.driver", browser);



        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        // options.addArguments("--headless");
//        options.addArguments("--ignore-certificate-errors");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-gpu");
        options.setCapability(CapabilityType.PROXY, proxy);


        return options;

    }



    //Get Firefox Options
    public static FirefoxOptions getFirefoxOptions(String browser, String binary, BrowserMobProxy proxyServer) {

        logger.debug("FIREFOX : " + browser);

        System.setProperty("webdriver.gecko.driver", browser);
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.proxy.type", 1);

        try {
            profile.setPreference("network.proxy.http", Inet4Address.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        profile.setPreference("network.proxy.http_port", proxyServer.getPort());
        profile.setPreference("network.http.use-cache", true);
        profile.setPreference("acceptInsecureCerts", true);
        profile.setPreference("browser.cache.disk.enable", true);
        profile.setPreference("browser.cache.memory.enable", true);
        profile.setPreference("browser.cache.offline.enable", true);
        profile.setPreference("network.http.use-cache", true);

        FirefoxBinary firefoxBinary = new FirefoxBinary(new File(binary));
        //firefoxBinary.addCommandLineOptions("--headless");

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        options.setHeadless(false);

        options.setCapability(FirefoxDriver.PROFILE, profile);

        return options;
    }
}