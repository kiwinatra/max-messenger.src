package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class SkuDetailsParams {
    /* access modifiers changed from: private */
    public String zza;
    /* access modifiers changed from: private */
    public List zzb;

    public static class Builder {
        private String zza;
        private List zzb;

        private Builder() {
        }

        public SkuDetailsParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.zzb != null) {
                SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
                skuDetailsParams.zza = str;
                skuDetailsParams.zzb = this.zzb;
                return skuDetailsParams;
            } else {
                throw new IllegalArgumentException("SKU list must be set");
            }
        }

        public Builder setSkusList(List<String> list) {
            this.zzb = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzdj zzdj) {
        }
    }

    public static Builder newBuilder() {
        return new Builder((zzdj) null);
    }

    public String getSkuType() {
        return this.zza;
    }

    public List<String> getSkusList() {
        return this.zzb;
    }
}
