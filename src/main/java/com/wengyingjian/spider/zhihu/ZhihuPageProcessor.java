package com.wengyingjian.spider.zhihu;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wengyingjian on 16/2/22.
 */
public class ZhihuPageProcessor implements PageProcessor {
    List<String> sites = new ArrayList<String>();
    List<String> qs = new ArrayList<String>();

    private Site site = Site.me()
            .setSleepTime(1000)
            .setRetrySleepTime(3)
            .addCookie("zhihu.com", "z_c0", "QUJETXVMUTNxQWdYQUFBQVlRSlZUWXl0OGxZckdnU2lsQUQwUGczTXp6ZlFRZDlWaUFMSF9RPT0=|1456152716|b34cffc5b931aa774ea0aafb9340aab81e4d3782")
            .addCookie("Domain=zhihu.com", "n_c", "1");

    @Override
    public void process(Page page) {

        //为下次抓取准备
        page.addTargetRequests(page.getHtml().links().regex("https://www\\.zhihu\\.com/question/\\w+").all());

        //    page.putField("title", );

        List<Selectable> nodes = page.getHtml().$("a.question_link").nodes();
        for (Selectable selectable : nodes) {
            String select = selectable.regex(">.*<").toString();
            qs.add(select.substring(1, select.length() - 1));
        }

        System.out.println("title:");
        for (String title : qs) {
            System.out.println("\t" + title);
        }
        System.out.println(qs.size());

        sites.add(page.getUrl().toString());
        sites.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("sites:");
        for (String site : sites) {
            System.out.println("\t" + site);
        }
        System.out.println(sites.size());

        //}
        //要抓取的属性

        //  System.out.println("pageAll:" + page.getHtml());
    }


    @Override
    public Site getSite() {
        return this.site;
    }
}
