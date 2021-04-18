package AccessoriesPage;

public class AccessoriesLocators {

    public static final String WEB_ELEMENT_EXAMPLE = "";

    /**
     * Deals Features
     */

    //Filter Deals to only Black Color
    public static final String WEB_ELEMENT_DEALS_LINK = "//a[@href='/products/sale/']";
    public static final String WEB_ELEMENT_FILTERS_DEALS = "//button[@class='gw-filter-by NHaasTX75Bd fontSize_16 pad15 noLeftPad positionRelative letterSpacing3 padRight45']";
    public static final String WEB_ELEMENT_DROP_DOWN_COLORS = "//button[.='Color']";
    public static final String WEB_ELEMENT_BLACK_COLOR = "//button[.='Color']";
    public static final String WEB_ELEMENT_VERIFY_BLACK = "//li[@class='listStyleTypeNone applied-filter displayInlineBlock positionRelative border_grayThree NHaasDS55Rg fontSize_14']/div[.='Black']";

    //Sort Filter for Price Low -> High
    public static final String WEB_ELEMENT_DROP_DOWN_SORT = "//select[@id='sortOptions']";
    public static final String WEB_ELEMENT_PRICE_SORT = "//option[@value='Price Low-High']";

    //Find a phone case for Iphone 12
    public static final String WEB_ELEMENT_FIELD_COMPATIBLE = "//input[@id='Compatiblecheck']";
    public static final String WEB_ELEMENT_IPHONE_DROP_DOWN = "//span[.='iPhone 12']";
    public static final String WEB_ELEMENT_IPHONE = "iPhone";
    public static final String WEB_ELEMENT_HEADER_IPHONE12 = "//div[.='iPhone 12']";

    //Find case for Samsung S21
    public static final String WEB_ELEMENT_SAMSUNG_LINK = "//span[normalize-space()='Gear4 Copenhagen Case for Galaxy S21 Ultra 5G']";
    public static final String WEB_ELEMENT_BUTTON_CHECKOUT = "//button[contains(text(),'Checkout')]";
    public static final String WEB_ELEMENT_HEADER_BEGIN_CHECKOUT = "//h1[normalize-space()='Begin Checkout']";

    /**
     * Accessories Main Page
     */

    //See what is trending
    public static final String WEB_ELEMENT_HEADER_TRENDING = "//h2[contains(text(),\"See what's trending.\")]";

    //Select Airpods and View Price
    public static final String WEB_ELEMENT_LINK_AIRPODS = "//div[@class='product-tile height--xs400 height--md266 height--lg400 u-colorBackgroundGray--1 u-paddingAll--xs24 u-marginBottom--xs32 u-marginBottom--md0']";
    public static final String WEB_ELEMENT_HEADER_AIRPODS = "//h1[@class='fontDSStd-75Bd fontSize_24 textAlignLeft color_000 deviceName']";
    public static final String WEB_ELEMENT_HEADER_PRICE = "//div[@class='fontSize_16 fontDSStd-75Bd']";

    //View Accessories Page
    public static final String WEB_ELEMENT_HEADER_ACCESSORIES = "//h1[contains(text(),'Accessories')]";





}
