package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

@zzg
public final class BillingConfig {
    private final String countryCode;
    private final String jsonString;
    private final JSONObject parsedJson;

    public BillingConfig(String str) throws JSONException {
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.parsedJson = jSONObject;
        this.countryCode = jSONObject.optString("countryCode");
    }

    public String getCountryCode() {
        return this.countryCode;
    }
}
