package com.binance.api.client.domain.brokerage;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BrokerInfo {

    private String maxMakerCommission;

    private String minMakerCommission;

    private String maxTakerCommission;

    private String minTakerCommission;

    private String subAccountQty;

    private String maxSubAccountQty;

    public String getMaxSubAccountQty() {
        return maxSubAccountQty;
    }

    public void setMaxSubAccountQty(String maxSubAccountQty) {
        this.maxSubAccountQty = maxSubAccountQty;
    }

    public String getSubAccountQty() {
        return subAccountQty;
    }

    public void setSubAccountQty(String subAccountQty) {
        this.subAccountQty = subAccountQty;
    }

    public String getMinTakerCommission() {
        return minTakerCommission;
    }

    public void setMinTakerCommission(String minTakerCommission) {
        this.minTakerCommission = minTakerCommission;
    }

    public String getMaxTakerCommission() {
        return maxTakerCommission;
    }

    public void setMaxTakerCommission(String maxTakerCommission) {
        this.maxTakerCommission = maxTakerCommission;
    }

    public String getMinMakerCommission() {
        return minMakerCommission;
    }

    public void setMinMakerCommission(String minMakerCommission) {
        this.minMakerCommission = minMakerCommission;
    }

    public String getMaxMakerCommission() {
        return maxMakerCommission;
    }

    public void setMaxMakerCommission(String maxMakerCommission) {
        this.maxMakerCommission = maxMakerCommission;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("maxMakerCommission", maxMakerCommission)
                .append("minMakerCommission", minMakerCommission)
                .append("maxTakerCommission", maxTakerCommission)
                .append("minTakerCommission", minTakerCommission)
                .append("subAccountQty", subAccountQty)
                .append("maxSubAccountQty", maxSubAccountQty)
                .toString();
    }
}
