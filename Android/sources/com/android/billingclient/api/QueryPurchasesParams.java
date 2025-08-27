package com.android.billingclient.api;

public final class QueryPurchasesParams {
    private final String zza;

    public static class Builder {
        /* access modifiers changed from: private */
        public String zza;

        private Builder() {
        }

        public QueryPurchasesParams build() {
            if (this.zza != null) {
                return new QueryPurchasesParams(this, (zzdh) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzdg zzdg) {
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzdh zzdh) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder((zzdg) null);
    }

    public final String zza() {
        return this.zza;
    }
}
