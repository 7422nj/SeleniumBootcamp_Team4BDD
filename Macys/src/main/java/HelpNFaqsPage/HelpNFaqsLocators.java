package HelpNFaqsPage;

public class HelpNFaqsLocators {

    /**
     * Sign In/Sign Up Functionalities
     */

    // Find Sign In Page
  public static final String WEB_ELEMENT_DROP_DOWN_SIGN_IN = "//span[@class='tier-status']";
  public static final String WEB_ELEMENT_DROP_DOWN_SELECT = "//a[@id='drop-down-sign-in']";
  public static final String WEB_ELEMENT_HEADER_SIGN_UP = "//h3[@id='sign-up-title']";
  public static final String WEB_ELEMENT_HEADER_SIGN_IN = "//h3[@id='pm-desktop-subheading']";



  //Sign in using valid credentials
  public static final String WEB_ELEMENT_INPUT_EMAIL = "//input[@id='email']";
  public static final String WEB_ELEMENT_INPUT_PASSWORD = "//input[@id='pw-input']";
  public static final String WEB_ELEMENT_BUTTON_SIGN_IN = "//input[@id='sign-in']";
  public static final String WEB_ELEMENT_VERIFY_ACCESS_DENIED = "//h1[.='Access Denied']";

  //Sign in using valid email but invalid password
  public static final String WEB_ELEMENT_PASS_ERROR = "//p[@class='notification-body']";

  //Sign in with email and no password
  public static final String WEB_ELEMENT_NO_PASSWORD = "//small[@id='pw-input-error']";

  //Sign in with password but no email
  public static final String WEB_ELEMENT_NO_EMAIL = "//small[@id='email-error']";

  //Navigate back to help & faqs page
  public static final  String WEB_ELEMENT_HELP_HEADER = "//strong[.='How Can We Help?']";

  /**
   * Search Bar Functionalities
   */

  //Send keys to search field
  public static final String WEB_ELEMENT_SEARCH_BAR = "//input[@class='rn_SearchField']";

  //Sends keys and search for results
  public static final String WEB_ELEMENT_BUTTON_SEARCH = "//div[@class='rn_CustomSimpleSearch rn_SimpleSearch']//button[1]";
  public static final String WEB_ELEMENT_VERIFY_RETURN_SEARCH = "//button[@class='primaryBlack']";

  //Send invalid keys and search for results
  public static final String WEB_ELEMENT_NO_RESULTS_HEADER = "//div[@class='still-looking-for-help']";










}
