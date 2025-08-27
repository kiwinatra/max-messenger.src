package com.android.billingclient.api;

public final class ConsumeParams {
    /* access modifiers changed from: private */
    public String zza;

    public static final class Builder {
        private String zza;

        private Builder() {
        }

        public ConsumeParams build() {
            String str = this.zza;
            if (str != null) {
                ConsumeParams consumeParams = new ConsumeParams((zzcc) null);
                consumeParams.zza = str;
                return consumeParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public Builder setPurchaseToken(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzcb zzcb) {
        }
    }

    private ConsumeParams() {
    }

    public static Builder newBuilder() {
        return new Builder((zzcb) null);
    }

    public String getPurchaseToken() {
        return this.zza;
    }

    public /* synthetic */ ConsumeParams(zzcc zzcc) {
    }
}
