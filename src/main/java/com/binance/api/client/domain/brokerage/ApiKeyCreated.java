package com.binance.api.client.domain.brokerage;

public class ApiKeyCreated {

    private String subaccountId;
    private String apiKey;
    private String secretKey;
    private Boolean canTrade;
    private Boolean marginTrade;
    private Boolean futuresTrade;

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getMarginTrade() {
        return marginTrade;
    }

    public void setMarginTrade(Boolean marginTrade) {
        this.marginTrade = marginTrade;
    }

    public Boolean getFuturesTrade() {
        return futuresTrade;
    }

    public void setFuturesTrade(Boolean futuresTrade) {
        this.futuresTrade = futuresTrade;
    }
}
