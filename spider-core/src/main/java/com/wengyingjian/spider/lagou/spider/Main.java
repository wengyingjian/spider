package com.wengyingjian.spider.lagou.spider;

import us.codecraft.webmagic.Spider;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
public class Main {

    private static String[] url = {"http://www.lagou.com/gongsi/6-0-0.json?first=false&sortField=0&havemark=0&pn=1"};

    public static void main(String[] args) {
        Spider.create(new LagouProcessor())
                .addUrl(url)
                .start();

    }

}
