package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public SubscriptionUpdateParams zzd;
    /* access modifiers changed from: private */
    public rxg zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder unused = newBuilder.zzc = true;
            this.zzf = newBuilder;
        }

        public BillingFlowParams build() {
            rxg rxg;
            ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            List list = this.zzc;
            boolean z3 = list != null && !list.isEmpty();
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!z2 || !z3) {
                if (!z2) {
                    ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);
                    int i = 0;
                    while (i < this.zzc.size()) {
                        ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i);
                        if (productDetailsParams2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        } else if (i == 0 || productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) || productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                            i++;
                        } else {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String zza2 = productDetailsParams.zza().zza();
                    for (ProductDetailsParams productDetailsParams3 : this.zzc) {
                        if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza2.equals(productDetailsParams3.zza().zza())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.zzd.contains((Object) null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else if (this.zzd.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.zzd;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                        if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String zzd2 = skuDetails.zzd();
                    ArrayList arrayList3 = this.zzd;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                        if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zzd2.equals(skuDetails3.zzd())) {
                            i3++;
                        } else {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams((zzbw) null);
                if ((!z2 || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                    z = false;
                }
                billingFlowParams.zza = z;
                billingFlowParams.zzb = this.zza;
                billingFlowParams.zzc = this.zzb;
                billingFlowParams.zzd = this.zzf.build();
                ArrayList arrayList4 = this.zzd;
                billingFlowParams.zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                billingFlowParams.zzg = this.zze;
                List list2 = this.zzc;
                if (list2 != null) {
                    rxg = rxg.n(list2);
                } else {
                    nxg nxg = rxg.b;
                    rxg = ayg.v;
                }
                billingFlowParams.zze = rxg;
                return billingFlowParams;
            } else {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
        }

        public Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = SubscriptionUpdateParams.zzc(subscriptionUpdateParams);
            return this;
        }

        public /* synthetic */ Builder(zzbr zzbr) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder unused = newBuilder.zzc = true;
            this.zzf = newBuilder;
        }
    }

    public static final class ProductDetailsParams {
        private final ProductDetails zza;
        private final String zzb;

        public static class Builder {
            /* access modifiers changed from: private */
            public ProductDetails zza;
            /* access modifiers changed from: private */
            public String zzb;

            private Builder() {
            }

            public ProductDetailsParams build() {
                ProductDetails productDetails = this.zza;
                if (productDetails == null) {
                    throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
                } else if (productDetails.getSubscriptionOfferDetails() == null || this.zzb != null) {
                    return new ProductDetailsParams(this, (zzbt) null);
                } else {
                    throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
            }

            public Builder setOfferToken(String str) {
                this.zzb = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zza() != null) {
                        this.zzb = oneTimePurchaseOfferDetails.zza();
                    }
                }
                return this;
            }

            public /* synthetic */ Builder(zzbs zzbs) {
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder, zzbt zzbt) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static Builder newBuilder() {
            return new Builder((zzbs) null);
        }

        public final ProductDetails zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    public static class SubscriptionUpdateParams {
        /* access modifiers changed from: private */
        public String zza;
        /* access modifiers changed from: private */
        public String zzb;
        /* access modifiers changed from: private */
        public int zzc = 0;
        /* access modifiers changed from: private */
        public int zzd = 0;

        public static class Builder {
            private String zza;
            private String zzb;
            /* access modifiers changed from: private */
            public boolean zzc;
            private int zzd = 0;
            private int zze = 0;

            private Builder() {
            }

            public SubscriptionUpdateParams build() {
                boolean z = !TextUtils.isEmpty(this.zza) || !TextUtils.isEmpty((CharSequence) null);
                boolean isEmpty = true ^ TextUtils.isEmpty(this.zzb);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.zzc || z || isEmpty) {
                    SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams((zzbv) null);
                    subscriptionUpdateParams.zza = this.zza;
                    subscriptionUpdateParams.zzc = this.zzd;
                    subscriptionUpdateParams.zzd = this.zze;
                    subscriptionUpdateParams.zzb = this.zzb;
                    return subscriptionUpdateParams;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }

            public Builder setOldPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            @Deprecated
            public Builder setOldSkuPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            @zzd
            public Builder setOriginalExternalTransactionId(String str) {
                this.zzb = str;
                return this;
            }

            @Deprecated
            public Builder setReplaceProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            @Deprecated
            public Builder setReplaceSkusProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            public Builder setSubscriptionReplacementMode(int i) {
                this.zze = i;
                return this;
            }

            public /* synthetic */ Builder(zzbu zzbu) {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        public static Builder newBuilder() {
            return new Builder((zzbu) null);
        }

        public static /* bridge */ /* synthetic */ Builder zzc(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder newBuilder = newBuilder();
            newBuilder.setOldSkuPurchaseToken(subscriptionUpdateParams.zza);
            newBuilder.setReplaceSkusProrationMode(subscriptionUpdateParams.zzc);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzd);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return newBuilder;
        }

        @Deprecated
        public final int zza() {
            return this.zzc;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzd() {
            return this.zza;
        }

        public final String zze() {
            return this.zzb;
        }

        public /* synthetic */ SubscriptionUpdateParams(zzbv zzbv) {
        }
    }

    private BillingFlowParams() {
    }

    public static Builder newBuilder() {
        return new Builder((zzbr) null);
    }

    @Deprecated
    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        return this.zzd.zzb();
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd.zzd();
    }

    public final String zzf() {
        return this.zzd.zze();
    }

    public final ArrayList zzg() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final List zzh() {
        return this.zze;
    }

    public final boolean zzp() {
        return this.zzg;
    }

    public final boolean zzq() {
        return (this.zzb == null && this.zzc == null && this.zzd.zze() == null && this.zzd.zza() == 0 && this.zzd.zzb() == 0 && !this.zza && !this.zzg) ? false : true;
    }

    public /* synthetic */ BillingFlowParams(zzbw zzbw) {
    }
}
