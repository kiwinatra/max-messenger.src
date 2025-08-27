package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;

public final class QueryProductDetailsParams {
    private final rxg zza;

    public static class Builder {
        /* access modifiers changed from: private */
        public rxg zza;

        private Builder() {
        }

        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this, (zzdd) null);
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product next : list) {
                if (!"play_pass_subs".equals(next.zzb())) {
                    hashSet.add(next.zzb());
                }
            }
            if (hashSet.size() <= 1) {
                this.zza = rxg.n(list);
                return this;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }

        public /* synthetic */ Builder(zzda zzda) {
        }
    }

    public static class Product {
        private final String zza;
        private final String zzb;

        public static class Builder {
            /* access modifiers changed from: private */
            public String zza;
            /* access modifiers changed from: private */
            public String zzb;

            private Builder() {
            }

            public Product build() {
                if ("first_party".equals(this.zzb)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                } else if (this.zza == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                } else if (this.zzb != null) {
                    return new Product(this, (zzdc) null);
                } else {
                    throw new IllegalArgumentException("Product type must be provided.");
                }
            }

            public Builder setProductId(String str) {
                this.zza = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.zzb = str;
                return this;
            }

            public /* synthetic */ Builder(zzdb zzdb) {
            }
        }

        public /* synthetic */ Product(Builder builder, zzdc zzdc) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static Builder newBuilder() {
            return new Builder((zzdb) null);
        }

        public final String zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzdd zzdd) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder((zzda) null);
    }

    public final rxg zza() {
        return this.zza;
    }

    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }
}
