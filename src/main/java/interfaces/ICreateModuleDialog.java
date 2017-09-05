package interfaces;

public interface ICreateModuleDialog extends IHaloApp {

    IWarningNewModuleDialog createWithEmptyName();

    IContentDashboard createNewModule();

    ICreateModuleDialog typeNewModuleName();

    ICreateModuleDialog swithOnSingleRadioButtons();

    ICreateModuleDialog switchOffSingleRadioButton();

}
