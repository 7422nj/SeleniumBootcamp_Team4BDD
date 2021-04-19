package SupportPage;

public class SupportLocators {

    /**
     * Sign In Functionalities
     */

    //Sign in with Invalid credentials
    public static final String WEB_ELEMENT_LINK_SIGN_IN = "//a[@href='javascript:void(0);']";
    public static final String WEB_ELEMENT_INPUT_USERID = "//input[@id='userID']";
    public static final String WEB_ELEMENT_INPUT_PASSWORD = "//input[@id='password']";
    public static final String WEB_ELEMENT_BUTTON_SUBMIT_SIGN_IN = "//button[@id='signin']";
    public static final String WEB_ELEMENT_ERROR_CODE = "//h1[@class='bad-request-header mb-0 mt-3']";

    //Sign in with user id and no password
    public static final String WEB_ELEMENT_ERROR_PASSWORD = "//div[@id='passwordInlineErrorText']";

    //Sign  in with password and no user id
    public static final String WEB_ELEMENT_ERROR_USERID = "//div[@id='userInlineErrorText']";

    //Locate sign in page
    public static final String WEB_ELEMENT_HEADER_SIGN_IN = "//h1[@id='signInHeaderText']";

    /**
     * Search Bar Functionalities
     */

    //Send keys to search field
    public static final String WEB_ELEMENT_SEARCH_FIELD = "//input[@id='searchfield']";

    //View results in drop down
    public static final String WEB_ELEMENT_RESULT_BILLS = "//b[.='bill support in all search results']";

    //View results after selecting search button
    public static final String WEB_ELEMENT_HEADER_RESULTS = "//div[@class='_2syZ7']";

    /**
     * Support Main Page
     */

    //Find Bills & Accounts Page
    public static final String WEB_ELEMENT_LINK_BILLS = "//a[.='Bill & account']";
    public static final String WEB_ELEMENT_VERIFY_BILL_HEADER = "//span[.='Bill & account support']";

    //Find Wireless Support
    public static final String WEB_ELEMENT_LINK_WIRELESS = "//a[@title=\"Wireless\"]";
    public static final String WEB_ELEMENT_VERIFY_WIRELESS = "//span[.='Wireless support']";
}
