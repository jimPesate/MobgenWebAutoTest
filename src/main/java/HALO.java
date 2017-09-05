import interfaces.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HALO implements IHaloApp, ILoginHalo, IBaseDashboard, ISideMenu, IContentDashboard,
                                ICreateModuleDialog, IWarningNewModuleDialog,
                                IContentDetailDashboard, INewModuleItemForm,
                                IDeleteFirstModuleItemDialog,
                                IDeleteModuleDialog, IProfileIconDropDown {

    private WebDriver webDriver;
    private WebDriverWait wait;
    private Actions action;

    HALO(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, 10);
        this.action  = new Actions(webDriver);
    }

    @Override
    public ILoginHalo loadHalo() {

        //Open Halo page with URL
        webDriver.get("https://halo-new-int.mobgen.com/");
        return this;
    }

    @Override
    public IBaseDashboard logIn() {

        //Making active the user input field
        WebElement username = webDriver.findElement(By.xpath("//*[contains(@id, \"email-objectObject-null-\")]"));
        //Typing the password
        username.sendKeys("test.admin@mobgen.com");

        //Waiting until email field is visible
        wait.until(ExpectedConditions.visibilityOf(username));

        //Making active the password input field
        webDriver.findElement(By.xpath("//*[contains(@id, 'password-objectObject-null-')]"))
                //Typing the password
                .sendKeys("aA12345*");

        //Moving the focus to the Login Button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div/div[1]/div/div[4]/div/button"))
                //Simulating Click
                .click();

        return this;
    }


    @Override
    public ISideMenu openSideMenu() {

        //Performing wait
        action.pause(2000).perform();

        //Moving the focus to the hamburger menu
        webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[1]/*[1]"))
                //Simulating click
                .click();

        return this;
    }

    @Override
    public IContentDashboard selectContent() {

        //Performing wait
        action.pause(500).perform();
        //Moving the focus to "Content" button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/div/div/div[3]/*[1]"))
                //Simulating Click
                .click();

        return this;

    }

    @Override
    public ICreateModuleDialog clickCreateNewModule() {

        //Performing wait
        action.pause(1000).perform();

        //Moving the focus to the new module button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/button"))
                //Simulating click
                .click();
        return this;
    }

    @Override
    public ICreateModuleDialog typeNewModuleName() {

        //Performing wait
        action.pause(1000).perform();

        //Moving the focus to the name text field
        webDriver.findElement(By.xpath("//*[contains(@id, 'name-objectObject-null-')]"))
                //Typing the name
                .sendKeys("This is the new module");

        return this;
    }

    @Override
    public IContentDashboard createNewModule(){

        //Performing wait
        action.pause(1000).perform();

        //Moving the focus to create module button
        webDriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div/div[2]/div[3]/div/button"))
                //Simulating click
                .click();

        return this;
    }

    @Override
    public IWarningNewModuleDialog createWithEmptyName() {

        return (IWarningNewModuleDialog) createNewModule();
    }

    @Override
    public ICreateModuleDialog acceptWarning() {


        //Performing wait
        action.pause(2000).perform();

        //Moving the focus to OK button
        webDriver.findElement(By.xpath("/html/body/div[5]/div/button[2]"))
                //Simulating click
                .click();

        return this;
    }


    @Override
    public IContentDetailDashboard openFirstModule() {

        //Performing wait
        action.pause(1000).perform();
        //Moving the focus to first grid cell
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]"))
                //Simulating click
                .click();

        return this;
    }


    @Override
    public INewModuleItemForm clickNewContentItem() {

        //Performing wait
        action.pause(1000).perform();


        //Moving the focus to New Content Item Button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/button"))
                //Simulating click
                .click();

        //Performing wait
        action.pause(5000);

        return this;
    }


    @Override
    public INewModuleItemForm typeNewContentItemName() {

        //Moving the focus to item name field
        WebElement title = webDriver.findElement(By.xpath("//*[contains(@id, 'undefined-objectObject-null-')]"));

        //Performing wait until the field is visible
        wait.until(ExpectedConditions.visibilityOf(title));

        //Typing the name
        title.sendKeys("New Content");

        return this;
    }

    @Override
    public ICreateModuleDialog swithOnSingleRadioButtons() {

        //Moving the focus to "On" radio button
        webDriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div/div[2]/div[2]/div[2]/input"))
                //Simulating click
                .click();

        action.pause(500).perform();

        return this;
    }

    @Override
    public ICreateModuleDialog switchOffSingleRadioButton() {

        //Moving the focus to "Off" radio button
        webDriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div/div[2]/div[2]/div[3]/input"))
                //Simulating click
                .click();

        action.pause(1000).perform();

        return this;
    }

    @Override
    public INewModuleItemForm pickPublishOnDate() {
        //Moving the focus to the date picker
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div/div[2]"))
                //Simulating click
                .click();

        //Performing wait
//        action.pause(1000).perform();

        //Moving the focus to the day in the calendar
        webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div[2]/div[1]/div[3]/div/div/div[2]/button[5]"))
                .click();

        //Moving the focus to ok button in the calendar
        webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div[2]/div[2]/button[2]"))
                .click();

        //Implementimg wait
        action.pause(1000).perform();

        return this;
    }

    @Override
    public INewModuleItemForm selectTextEditorPreference() {

        //Moving the focus to HTTP view checkbox
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[4]/div[2]/div[2]/input"))
                //Simulating click
                .click();
        action.pause(1000).perform();

        return this;
    }

    @Override
    public IContentDetailDashboard clickSaveContentItem() {

        //Moving the focus to the save button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/button"))
                //Simulating click
                .click();

        return this;
    }


    @Override
    public IDeleteFirstModuleItemDialog deleteFirstItem() {

        //Performing wait
        action.pause(4000).perform();

        //Moving the focus to delete button in the first cell
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div[2]/div/div/div/div[6]/span/div/button"))
                //Simulating click
                .click();

        //Performing pause
        action.pause(1500).perform();

        return this;
    }

    @Override
    public IContentDetailDashboard deleteItem() {

        //Moving the focus to the confirm delete button
        webDriver.findElement(By.xpath("/html/body/div[2]/div/button[2]"))
                //Simulating click
                .click();

        return this;
    }

    @Override
    public IContentDashboard clickBackButton() {

        //Performing wait
        action.pause(3000).perform();

        //Moving the focus to the back button
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/button"))
                //Simulating click
                .click();

        action.pause(2000).perform();

        return this;
    }

    @Override
    public IDeleteModuleDialog deleteFirstModule() {

        action.pause(1500).perform();

        //Moving the focus to delete button in the first cell grid
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[7]/span/div/button"))
                //Simulating click
                .click();

        //Performing wait
        action.pause(3000).perform();

        return this;
    }

    @Override
    public IContentDashboard deleteModule() {

        action.pause(1000).perform();
        //Moving the focus to the confirm delete button
        webDriver.findElement(By.xpath("//*[contains (@class, 'confirm')]"))
                //Simulating click
                .click();

        return this;
    }

    @Override
    public IProfileIconDropDown clickProfileIcon() {

        //Performing wait
        action.pause(2000).perform();

        //Moving the focus to profile icon
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]/div[1]"))
                //Simulating click
                .click();

        //Performing wait
        action.pause(1000).perform();

        return this;
    }

    @Override
    public ILoginHalo clickLogOut() {

        action.pause(1000).perform();

        //Moving the focus to Log Out button
        webDriver.findElement(By.xpath("//*[contains (@class, 'logOutItem')]"))
                //Simulating click
                .click();

        return this;
    }



    @Override
    public void closeHalo() {

        //Performing Wait
        action.pause(2000).perform();

        //Closes the browser
        webDriver.close();
    }
}
