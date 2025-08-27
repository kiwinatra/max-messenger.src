package com.android.billingclient.api;

public final class QueryPurchaseHistoryParams {
    private final String zza;

    public static class Builder {
        /* access modifiers changed from: private */
        public String zza;

        private Builder() {
        }

        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, (zzdf) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzde zzde) {
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzdf zzdf) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder((zzde) null);
    }

    public final String zza() {
        return this.zza;
    }
}
