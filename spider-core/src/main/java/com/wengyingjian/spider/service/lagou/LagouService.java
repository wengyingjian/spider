package com.wengyingjian.spider.service.lagou;

import com.wengyingjian.spider.dao.CompanyInfoDao;
import com.wengyingjian.spider.lagou.bean.CompanyInfo;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
public class LagouService {

    private CompanyInfoDao companyInfoDao = new CompanyInfoDao();

    public void save(CompanyInfo companyInfo) {
        companyInfoDao.save(companyInfo);
    }
}
