package com.binance.api.client.domain.brokerage;

public class CommissionChanged {

     private String subAccountId;
     private String makerCommission;
     private String takerCommission;
     private String marginMakerCommission;
     private String marginTakerCommission;

    public String getSubAccountId() {
        return subAccountId;
    }

    public void setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
    }

    public String getMakerCommission() {
        return makerCommission;
    }

    public void setMakerCommission(String makerCommission) {
        this.makerCommission = makerCommission;
    }

    public String getTakerCommission() {
        return takerCommission;
    }

    public void setTakerCommission(String takerCommission) {
        this.takerCommission = takerCommission;
    }

    public String getMarginMakerCommission() {
        return marginMakerCommission;
    }

    public void setMarginMakerCommission(String marginMakerCommission) {
        this.marginMakerCommission = marginMakerCommission;
    }

    public String getMarginTakerCommission() {
        return marginTakerCommission;
    }

    public void setMarginTakerCommission(String marginTakerCommission) {
        this.marginTakerCommission = marginTakerCommission;
    }
}
