package com.binance.api.client.domain.brokerage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class SubAccountCreated {

    private String subaccountId;

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountid(String subaccountId) {
        this.subaccountId = subaccountId;
    }
}
