package com.android.billingclient.api;

@zzg
public interface BillingConfigResponseListener {
    void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig);
}
