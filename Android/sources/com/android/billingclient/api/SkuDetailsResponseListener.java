package com.android.billingclient.api;

import java.util.List;

@Deprecated
public interface SkuDetailsResponseListener {
    void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list);
}
