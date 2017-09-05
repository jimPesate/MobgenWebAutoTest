import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCases {

    private static HALO halo;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        halo = new HALO(webDriver);
    }

    @After
    public void cleanUp() {

        halo.closeHalo();
    }

    @AfterClass
    public static void tearDown() {
        halo = null;
    }

    @Test
    public void login(){

        halo.loadHalo().logIn();
    }

    @Test
    public void goToContent(){

        halo.loadHalo().logIn()
                .openSideMenu()
                .selectContent();
    }

    @Test
    public void createEmptyModule(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .clickCreateNewModule()
                .createWithEmptyName();
    }

    @Test
    public void createNewModule(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .clickCreateNewModule()
                .typeNewModuleName()
                .swithOnSingleRadioButtons()
                .createNewModule();
    }


    @Test
    public void deleteModule(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .deleteFirstModule().deleteModule();
    }

    @Test
    public void openModule(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .openFirstModule();
    }

    @Test
    public void createNewItem(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .openFirstModule().clickNewContentItem()
                .typeNewContentItemName()
                .pickPublishOnDate()
                .selectTextEditorPreference()
                .clickSaveContentItem();
    }

    @Test
    public void deleteItem(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .openFirstModule()
                .deleteFirstItem()
                .deleteItem();
    }

    @Test
    public void deleteFirstModule(){

        halo.loadHalo().logIn()
                .openSideMenu().selectContent()
                .deleteFirstModule()
                .deleteModule();
    }

    @Test
    public void logout(){

        halo.loadHalo().logIn()
                .openSideMenu()
                .selectContent()
                .clickProfileIcon()
                .clickLogOut();
    }

}
