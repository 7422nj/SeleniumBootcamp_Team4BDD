package BrandOutletPage;

public class BrandOutletLocators {

    public static final String WEB_ELEMENT_SEARCH_ITEM = "//input[@id='gh-ac']";
    public static final String WEB_ELEMENT_BRAND_OUTLET= "//a[contains(.,'Brand Outlet')]";
    public static String getPageLinkLocators(String Links){
        return "//a[contains(.,'"+Links+"')]";
    }




}
