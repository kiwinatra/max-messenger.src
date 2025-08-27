package com.android.billingclient.api;

import java.util.List;

public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list);
}
