package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class SkuDetails {
    private final String zza;
    private final JSONObject zzb;

    public SkuDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.zza, ((SkuDetails) obj).zza);
    }

    public String getDescription() {
        return this.zzb.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.zzb.optString("freeTrialPeriod");
    }

    public String getIconUrl() {
        return this.zzb.optString("iconUrl");
    }

    public String getIntroductoryPrice() {
        return this.zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.zzb.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.zzb.optString("introductoryPricePeriod");
    }

    public String getOriginalJson() {
        return this.zza;
    }

    public String getOriginalPrice() {
        return this.zzb.has("original_price") ? this.zzb.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        return this.zzb.has("original_price_micros") ? this.zzb.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public String getPrice() {
        return this.zzb.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.zzb.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.zzb.optString("price_currency_code");
    }

    public String getSku() {
        return this.zzb.optString("productId");
    }

    public String getSubscriptionPeriod() {
        return this.zzb.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.zzb.optString("title");
    }

    public String getType() {
        return this.zzb.optString("type");
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.zza));
    }

    public int zza() {
        return this.zzb.optInt("offer_type");
    }

    public String zzb() {
        return this.zzb.optString("offer_id");
    }

    public String zzc() {
        String optString = this.zzb.optString("offerIdToken");
        return optString.isEmpty() ? this.zzb.optString("offer_id_token") : optString;
    }

    public final String zzd() {
        return this.zzb.optString("packageName");
    }

    public String zze() {
        return this.zzb.optString("serializedDocid");
    }

    public final String zzf() {
        return this.zzb.optString("skuDetailsToken");
    }
}
