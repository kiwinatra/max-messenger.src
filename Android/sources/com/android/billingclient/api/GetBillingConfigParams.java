package com.android.billingclient.api;

@zzg
public final class GetBillingConfigParams {

    @zzg
    public static final class Builder {
        private Builder() {
        }

        public GetBillingConfigParams build() {
            return new GetBillingConfigParams();
        }
    }

    private GetBillingConfigParams() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
