package interfaces;

public interface IContentDashboard extends IBaseDashboard {

    ICreateModuleDialog clickCreateNewModule();

    IContentDetailDashboard openFirstModule();

    IDeleteModuleDialog deleteFirstModule();

}
