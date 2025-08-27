package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzd
@Deprecated
public final class AlternativeChoiceDetails {
    private final String zza;
    private final JSONObject zzb;
    private final List zzc;

    @zzd
    public static class Product {
        private final String zza;
        private final String zzb;
        private final String zzc;

        public /* synthetic */ Product(JSONObject jSONObject, zzc zzc2) {
            this.zza = jSONObject.optString("productId");
            this.zzb = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.zzc = true == optString.isEmpty() ? null : optString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && Objects.equals(this.zzc, product.getOfferToken());
        }

        @zzd
        public String getId() {
            return this.zza;
        }

        @zzd
        public String getOfferToken() {
            return this.zzc;
        }

        @zzd
        public String getType() {
            return this.zzb;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});
        }

        public String toString() {
            String str = this.zza;
            String str2 = this.zzb;
            return wj6.n(rae.r("{id: ", str, ", type: ", str2, ", offer token: "), this.zzc, "}");
        }
    }

    public AlternativeChoiceDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject, (zzc) null));
                }
            }
        }
        this.zzc = arrayList;
    }

    @zzd
    public String getExternalTransactionToken() {
        return this.zzb.optString("externalTransactionToken");
    }

    @zzd
    public String getOriginalExternalTransactionId() {
        String optString = this.zzb.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @zzd
    public List<Product> getProducts() {
        return this.zzc;
    }
}
