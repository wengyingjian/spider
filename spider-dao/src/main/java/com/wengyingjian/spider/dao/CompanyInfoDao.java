package com.wengyingjian.spider.dao;

import com.wengyingjian.spider.lagou.bean.CompanyInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
public class CompanyInfoDao {


    public void save(CompanyInfo companyInfo) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(companyInfo);
        transaction.commit();
    }
}
