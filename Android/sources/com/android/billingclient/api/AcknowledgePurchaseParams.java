package com.android.billingclient.api;

public final class AcknowledgePurchaseParams {
    /* access modifiers changed from: private */
    public String zza;

    public static final class Builder {
        private String zza;

        private Builder() {
        }

        public AcknowledgePurchaseParams build() {
            String str = this.zza;
            if (str != null) {
                AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams((zzb) null);
                acknowledgePurchaseParams.zza = str;
                return acknowledgePurchaseParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public Builder setPurchaseToken(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zza zza2) {
        }
    }

    private AcknowledgePurchaseParams() {
    }

    public static Builder newBuilder() {
        return new Builder((zza) null);
    }

    public String getPurchaseToken() {
        return this.zza;
    }

    public /* synthetic */ AcknowledgePurchaseParams(zzb zzb) {
    }
}
