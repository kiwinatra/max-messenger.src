package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzco {
    public zzco(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
