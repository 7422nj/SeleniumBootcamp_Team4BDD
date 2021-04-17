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











}
