import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private WebDriver webDriver;
    private HALO halo;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        HALO halo = new HALO(webDriver);

        halo.loadHalo()
                .logIn()
                .openSideMenu()
                .selectContent()
                .clickCreateNewModule()
                .createWithEmptyName()
                .acceptWarning()
                .typeNewModuleName()
                .swithOnSingleRadioButtons()
                .switchOffSingleRadioButton()
                .createNewModule()
                .openFirstModule()
                .clickNewContentItem()
                .typeNewContentItemName()
                .pickPublishOnDate()
                .selectTextEditorPreference()
                .clickSaveContentItem()
                .deleteFirstItem()
                .deleteItem()
                .clickBackButton()
                .deleteFirstModule()
                .deleteModule()
                .clickProfileIcon()
                .clickLogOut()
                .closeHalo();


    }
//
//    @Test
//    public void login(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//
//        halo.loadHalo().logIn();
//    }
//
//    @Test
//    public void goToContent(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu()
//                .selectContent();
//    }
//
//    @Test
//    public void createEmptyModule(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .clickCreateNewModule()
//                .createWithEmptyName();
//    }
//
//    @Test
//    public void createNewModule(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .clickCreateNewModule()
//                .typeNewModuleName()
//                .swithOnSingleRadioButtons()
//                .createNewModule();
//    }
//
//
//    @Test
//    public void deleteModule(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .deleteFirstModule().deleteModule();
//    }
//
//    @Test
//    public void openModule(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .openFirstModule();
//    }
//
//    @Test
//    public void createNewItem(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .openFirstModule().clickNewContentItem()
//                .typeNewContentItemName()
//                .pickPublishOnDate()
//                .selectTextEditorPreference()
//                .clickSaveContentItem();
//    }
//
//    @Test
//    public void deleteItem(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .openFirstModule()
//                .deleteFirstItem()
//                .deleteItem();
//    }
//
//    @Test
//    public void deleteFirstModule(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu().selectContent()
//                .deleteFirstModule()
//                .deleteModule();
//    }
//
//    @Test
//    public void logout(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        HALO halo = new HALO(webDriver);
//
//        halo.loadHalo().logIn()
//                .openSideMenu()
//                .selectContent()
//                .clickProfileIcon()
//                .clickLogOut();
//    }

}
