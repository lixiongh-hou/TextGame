package com.sq.common_module.common.bean;

public class EnterpriseInfoBean {

    private String companyName;
    private String creditCode;
    private String orgNumber;
    private String companyType;
    private String keyPersonName;
    private String keyPersonType;
    private String regCapital;
    private String actualCapital;
    private String province;
    private String provinceCode;
    private String city;
    private String cityCode;
    private String district;
    private String districtCode;
    private String regNumber;
    private String authority;
    private String regLocation;
    private String regStatus;
    private String businessScope;
    private String establishTime;
    private String approvedTime;
    private String termStart;
    private String termEnd;
    private String lastUpdatedTime;
    private Object historyNames;
    private IndustryDTO industry;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getKeyPersonName() {
        return keyPersonName;
    }

    public void setKeyPersonName(String keyPersonName) {
        this.keyPersonName = keyPersonName;
    }

    public String getKeyPersonType() {
        return keyPersonType;
    }

    public void setKeyPersonType(String keyPersonType) {
        this.keyPersonType = keyPersonType;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public String getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(String actualCapital) {
        this.actualCapital = actualCapital;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRegLocation() {
        return regLocation;
    }

    public void setRegLocation(String regLocation) {
        this.regLocation = regLocation;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(String establishTime) {
        this.establishTime = establishTime;
    }

    public String getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getTermStart() {
        return termStart;
    }

    public void setTermStart(String termStart) {
        this.termStart = termStart;
    }

    public String getTermEnd() {
        return termEnd;
    }

    public void setTermEnd(String termEnd) {
        this.termEnd = termEnd;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Object getHistoryNames() {
        return historyNames;
    }

    public void setHistoryNames(Object historyNames) {
        this.historyNames = historyNames;
    }

    public IndustryDTO getIndustry() {
        return industry;
    }

    public void setIndustry(IndustryDTO industry) {
        this.industry = industry;
    }

    public static class IndustryDTO {
        private String industry;
        private String industryCode;
        private String subIndustry;
        private String subIndustryCode;
        private String middleCategory;
        private String middleCategoryCode;
        private String smallCategory;
        private String smallCategoryCode;

        public String getIndustry() {
            return industry;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public String getIndustryCode() {
            return industryCode;
        }

        public void setIndustryCode(String industryCode) {
            this.industryCode = industryCode;
        }

        public String getSubIndustry() {
            return subIndustry;
        }

        public void setSubIndustry(String subIndustry) {
            this.subIndustry = subIndustry;
        }

        public String getSubIndustryCode() {
            return subIndustryCode;
        }

        public void setSubIndustryCode(String subIndustryCode) {
            this.subIndustryCode = subIndustryCode;
        }

        public String getMiddleCategory() {
            return middleCategory;
        }

        public void setMiddleCategory(String middleCategory) {
            this.middleCategory = middleCategory;
        }

        public String getMiddleCategoryCode() {
            return middleCategoryCode;
        }

        public void setMiddleCategoryCode(String middleCategoryCode) {
            this.middleCategoryCode = middleCategoryCode;
        }

        public String getSmallCategory() {
            return smallCategory;
        }

        public void setSmallCategory(String smallCategory) {
            this.smallCategory = smallCategory;
        }

        public String getSmallCategoryCode() {
            return smallCategoryCode;
        }

        public void setSmallCategoryCode(String smallCategoryCode) {
            this.smallCategoryCode = smallCategoryCode;
        }
    }
}
