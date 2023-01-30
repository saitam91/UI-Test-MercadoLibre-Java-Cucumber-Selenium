package pages;

public class MeliProductPage extends BasePage{

    public MeliProductPage(){
        super(driver);
    }

    private String searchField ="//input[@id='cb1-edit']";
    private String searchButton="//header/div[1]/form[1]/button[1]/div[1]";
    private String selectLocation="//ul/li[@class='ui-search-filter-container shops__container-lists']//a[@aria-label='Montevideo']";
    private String selectItem="//div[@class='ui-search-result__wrapper shops__result-wrapper']//div[@class='andes-card andes-card--flat andes-card--default ui-search-result shops__cardStyles ui-search-result--core andes-card--padding-default']//div[@class='ui-search-result__content-wrapper shops__result-content-wrapper']//div[@class='ui-search-item__group ui-search-item__group--title shops__items-group']//a[@title]";
    private String quitBanner="//button[@class='cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept']";
    private String sellersSales="//strong";

    public void searchProduct(String product){
    write(searchField,product);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }

    public void clickBanner(){
        clickElement(quitBanner);
    }

    public void clickLocation(){
        clickAction(selectLocation);
    }

    public void selectRandomItem(int index)  {
        selectItems(selectItem,index);
    }

    public String salesLabel(){
        return textFromElement(sellersSales);
    }








}
