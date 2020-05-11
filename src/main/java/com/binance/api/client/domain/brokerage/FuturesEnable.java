package com.binance.api.client.domain.brokerage;

public class FuturesEnable {

    private String subaccountId;
    private Boolean enableFutures;
    private Long updateTime;

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId;
    }

    public Boolean getEnableFutures() {
        return enableFutures;
    }

    public void setEnableFutures(Boolean enableFutures) {
        this.enableFutures = enableFutures;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
