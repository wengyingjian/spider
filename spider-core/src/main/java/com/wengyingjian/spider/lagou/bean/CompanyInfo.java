package com.wengyingjian.spider.lagou.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 公司bean
 *
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
@Table(name = "lagou_company_info")
@Entity
public class CompanyInfo implements Serializable {

    private String city;
    @Id
    private Integer companyId;
    private String industryField;
    private String companyLogo;
    private String companyName;
    private String companyShortName;
    private String companyFeatures;

 //   private List<Integer> companyPositions;
    private Integer positionNum;
    private String createTime;
    private Integer orderBy;
    private Integer interviewRemarkNum;
    private Integer processRate;
    private String otherLabels;
    private String companyLabels;
    private String finaceStage;
    private Integer countryScore;
    private Integer cityScore;
    private Integer score;
    private Integer searchScore;
    private Integer totalCount;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getIndustryField() {
        return industryField;
    }

    public void setIndustryField(String industryField) {
        this.industryField = industryField;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getCompanyFeatures() {
        return companyFeatures;
    }

    public void setCompanyFeatures(String companyFeatures) {
        this.companyFeatures = companyFeatures;
    }

//    public List<Integer> getCompanyPositions() {
//        return companyPositions;
//    }
//
//    public void setCompanyPositions(List<Integer> companyPositions) {
//        this.companyPositions = companyPositions;
//    }

    public Integer getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(Integer positionNum) {
        this.positionNum = positionNum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getInterviewRemarkNum() {
        return interviewRemarkNum;
    }

    public void setInterviewRemarkNum(Integer interviewRemarkNum) {
        this.interviewRemarkNum = interviewRemarkNum;
    }

    public Integer getProcessRate() {
        return processRate;
    }

    public void setProcessRate(Integer processRate) {
        this.processRate = processRate;
    }

    public String getOtherLabels() {
        return otherLabels;
    }

    public void setOtherLabels(String otherLabels) {
        this.otherLabels = otherLabels;
    }

    public String getCompanyLabels() {
        return companyLabels;
    }

    public void setCompanyLabels(String companyLabels) {
        this.companyLabels = companyLabels;
    }

    public String getFinaceStage() {
        return finaceStage;
    }

    public void setFinaceStage(String finaceStage) {
        this.finaceStage = finaceStage;
    }

    public Integer getCountryScore() {
        return countryScore;
    }

    public void setCountryScore(Integer countryScore) {
        this.countryScore = countryScore;
    }

    public Integer getCityScore() {
        return cityScore;
    }

    public void setCityScore(Integer cityScore) {
        this.cityScore = cityScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSearchScore() {
        return searchScore;
    }

    public void setSearchScore(Integer searchScore) {
        this.searchScore = searchScore;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
