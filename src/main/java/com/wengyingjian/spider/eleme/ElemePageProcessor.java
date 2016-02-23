package com.wengyingjian.spider.eleme;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by wengyingjian on 16/2/22.
 */
public class ElemePageProcessor implements PageProcessor {

    private Site site = Site.me().setRetrySleepTime(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
//        page.
        System.out.println("page!!! fount ");
        System.out.println("page:" + page.getHtml());
    }

    @Override
    public Site getSite() {
        return site;
    }
}
