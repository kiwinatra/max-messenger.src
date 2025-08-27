package com.android.billingclient.api;

public final class BillingResult {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public String zzb;

    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        public /* synthetic */ Builder(zzbz zzbz) {
        }
    }

    public static Builder newBuilder() {
        return new Builder((zzbz) null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        int i = this.zza;
        int i2 = oyg.a;
        kyg kyg = ywg.c;
        Integer valueOf = Integer.valueOf(i);
        return g63.j("Response Code: ", (!kyg.containsKey(valueOf) ? ywg.RESPONSE_CODE_UNSPECIFIED : (ywg) kyg.get(valueOf)).toString(), ", Debug Message: ", this.zzb);
    }
}
