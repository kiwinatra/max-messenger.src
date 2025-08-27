package com.android.billingclient.api;

import com.android.billingclient.api.ProductDetails;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcu {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final ProductDetails.PricingPhase zzf;

    public zzcu(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("productId");
        this.zzb = jSONObject.optString("title");
        this.zzc = jSONObject.optString("name");
        this.zzd = jSONObject.optString("description");
        this.zze = jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.zzf = optJSONObject == null ? null : new ProductDetails.PricingPhase(optJSONObject);
    }
}
