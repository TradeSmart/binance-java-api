package com.binance.api.client.domain.brokerage;

public class MarginEnable {

    private String subaccountId;
    private Boolean enableMargin;
    private Long updateTime;

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getEnableMargin() {
        return enableMargin;
    }

    public void setEnableMargin(Boolean enableMargin) {
        this.enableMargin = enableMargin;
    }
}
