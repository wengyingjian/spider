package com.wengyingjian.spider.lagou.spider;

import com.alibaba.fastjson.JSON;
import com.wengyingjian.spider.lagou.bean.CompanyInfo;
import com.wengyingjian.spider.lagou.bean.CompanyResult;
import com.wengyingjian.spider.service.lagou.LagouService;
import org.apache.log4j.Logger;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
public class LagouProcessor implements PageProcessor {

    Logger logger = Logger.getLogger(this.getClass());

    private Site site = Site.me();

    private static final String URL_PREFIX = "http://www.lagou.com/gongsi/6-0-0.json?first=false&sortField=0&havemark=0&pn=";

    @Override
    public void process(Page page) {
        logger.info("抓取到页面...");

        CompanyResult companyResult = page.getJson().toObject(CompanyResult.class);
//        logger.info("json:"+page.getJson().toString());
        logger.info(JSON.toJSON(companyResult));

        doService(companyResult);

        String newUrl = genNewUrl(page);
        page.addTargetRequest(newUrl);
    }

    private void doService(CompanyResult companyResult) {
        List<CompanyInfo> cInfos = companyResult.getResult();
        if (cInfos != null) {
            LagouService lagouService = new LagouService();
            for (CompanyInfo info : cInfos) {
                lagouService.save(info);
            }
        }
    }

    private String genNewUrl(Page page) {
        String oldUrl = page.getRequest().getUrl();
        int oldPageNo = Integer.valueOf(oldUrl.replace(URL_PREFIX, ""));
        String newUrl = URL_PREFIX + (oldPageNo + 1);
        logger.info("oldUrl=[" + oldUrl + "],newUrl=[" + newUrl + "]");
        return newUrl;
    }

    @Override
    public Site getSite() {
        return site;
    }
}
