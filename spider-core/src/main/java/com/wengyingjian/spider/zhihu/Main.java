package com.wengyingjian.spider.zhihu;

import us.codecraft.webmagic.Spider;

/**
 * Created by wengyingjian on 16/2/22.
 */
public class Main {

    private static String startUrl = "http://www.zhihu.com";

    public static void main(String[] args) {

        Spider.create(new ZhihuPageProcessor())
                .addUrl(startUrl)
                .thread(1)
                .run();
    }



}
