package PodcastPage;

public class PodcastLocators {

    //Find Mel & Todd's ESPN First Draft Picks Podcast
    public static final String WEB_ELEMENT_LINK_MEl = "//div[@class='span-2 last']//a[.='Play']";
    public static final String WEB_ELEMENT_VERIFY_MEl = "//span[normalize-space()=\"Apr 13, 2021\"]";

    //Find ESPN Daily Podcast
    public static final String WEB_ELEMENT_LINK_ESPN = "//div[@class='span-2 first']//a[.='Play']";
    public static final String WEB_ELEMENT_VERIFY_ESPN = "//span[contains(text(),\"ESPN Daily - The Next Great Quarterback Prospect (\")]";

    //Find 30 for 30 Podcast
    public static final String WEB_ELEMENT_LINK_30 = "//a[.='30 for 30']";
    public static final String WEB_ELEMENT_VERIFY_30 = "//h4[.='30 For 30 Podcasts']";

    //Find Adam Podcast
    public static final String WEB_ELEMENT_LINK_ADAM = "//a[.='The Adam Schefter Podcast (NFL)']";
    public static final String WEB_ELEMENT_VERIFY_ADAM = "//h4[.='The Adam Schefter Podcast']";

    //Find Around the Rim with LaChina Robinson (WBB)
    public static final String WEB_ELEMENT_LINK_WBB = "//a[.='Around the Rim with LaChina Robinson (WBB)']";
    public static final String WEB_ELEMENT_VERIFY_WBB = "//h4[.='Around The Rim']";

    //Find The Daily Wager Podcast Page
    public static final String WEB_ELEMENT_LINK_WAGER = "//a[.='Daily Wager']";
    public static final String WEB_ELEMENT_VERIFY_WAGER = "//h4[.='Daily Wager']";

    //Find The ESPN Investigates Podcast Page
    public static final String WEB_ELEMENT_LINK_INVESTIGATES = "//a[.='ESPN Investigates']";
    public static final String WEB_ELEMENT_VERIFY_INVESTIGATES = "//h4[.='ESPN Investigates']";

    //Download Podcast
    public static final String WEB_ELEMENT_DOWNLOAD_POD = "//a[.='Download'][1][@href='https://traffic.megaphone.fm/ESP6705055426.mp3']";
    public static final String WEB_ELEMENT_AUDIO = "//source[@type='audio/mpeg']";
    public static final String WEB_ELEMENT_VERIFY_AUDIO_BOX = "//video[@name='media']";

    //Send keys to search bar
    public static final String WEB_ELEMENT_FIELD_SEARCH_BAR = "//input[@class='search-box']";
    public static final String WEB_ELEMENT_LINK_SEARCH_BAR = "//a[@id='global-search-trigger']";








}
