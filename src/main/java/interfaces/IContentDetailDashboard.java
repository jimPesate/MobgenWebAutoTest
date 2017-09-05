package interfaces;

public interface IContentDetailDashboard extends IBaseDashboard {

    INewModuleItemForm clickNewContentItem();

    IDeleteFirstModuleItemDialog deleteFirstItem();

    IContentDashboard clickBackButton();
}
