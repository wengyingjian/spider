package com.wengyingjian.sprider;

import com.wengyingjian.spider.eleme.ElemePageProcessor;
import org.junit.Test;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;

/**
 * Created by wengyingjian on 16/2/23.
 */
public class ElemeTest {
    private String startUrl = "https://www.ele.me/place/wtmk63t09qr";
    private static String chromeDrivePath = "chromedriver";

    @Test
    public void test() {

        System.out.println("start...");
        Spider.create(new ElemePageProcessor())
                .addUrl(startUrl)
                //需要渲染,使用SeleniumDownloader
                //                //ServiceFactory.getApplicationPropInstance()
                //chrome.driver
                .setDownloader(new SeleniumDownloader(chromeDrivePath))
                .thread(1)
                .run();
        System.out.println("end...");
    }
}
