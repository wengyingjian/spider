package com.wengyingjian.spider.eleme;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;

/**
 * Created by wengyingjian on 16/2/22.
 */
public class Main {


    private static String startUrl = "https://www.ele.me/place/wtmk63t09qr";
    private static String chromeDrivePath = "chromedriver_mac32";

    public static void main(String[] args) {
        System.out.println("start...");
        SeleniumDownloader downloader = new SeleniumDownloader(chromeDrivePath);
        downloader.setSleepTime(5000);

        Spider.create(new ElemePageProcessor())
                .addUrl(startUrl)
                //需要渲染,使用SeleniumDownloader
                //                //ServiceFactory.getApplicationPropInstance()
                //chrome.driver
                .setDownloader(downloader)
                .thread(1)
                .run();
    }

}
