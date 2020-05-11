package com.binance.api.client.domain.brokerage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class SubAccount {

    private String subaccountId;
    private String makerCommission;
    private String takerCommission;
    private String marginMakerCommission;
    private String marginTakerCommission;
    private long createTime;

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMarginTakerCommission() {
        return marginTakerCommission;
    }

    public void setMarginTakerCommission(String marginTakerCommission) {
        this.marginTakerCommission = marginTakerCommission;
    }

    public String getMarginMakerCommission() {
        return marginMakerCommission;
    }

    public void setMarginMakerCommission(String marginMakerCommission) {
        this.marginMakerCommission = marginMakerCommission;
    }

    public String getTakerCommission() {
        return takerCommission;
    }

    public void setTakerCommission(String takerCommission) {
        this.takerCommission = takerCommission;
    }

    public String getMakerCommission() {
        return makerCommission;
    }

    public void setMakerCommission(String makerCommission) {
        this.makerCommission = makerCommission;
    }

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId;
    }
}
