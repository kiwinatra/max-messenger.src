package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class d {
    final IapClient a;
    final Context b;
    final b c;
    Set d;

    public static final class a {
        final IapClient a;
        final Context b;

        public a(IapClient iapClient, Context context) {
            this.a = iapClient;
            this.b = context;
        }

        public d a(b bVar) {
            return new d(this.a, bVar, this.b);
        }
    }

    public interface b {
        void a(List list);

        void c(List list);
    }

    public final class c implements OnSuccessListener {
        final int a;
        final int b;
        final List c = Collections.synchronizedList(new ArrayList());
        final List d = Collections.synchronizedList(new ArrayList());
        String e;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            x2.a("OwnedPurchaseLoader: loader created");
        }

        private /* synthetic */ void a(Exception exc) {
            x2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            d.this.b(this);
        }

        public void b(String str) {
            m.f(new d3(0, this, str));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            Task task;
            x2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.b;
            if (i == 2) {
                task = d.this.a.obtainOwnedPurchases(ownedPurchasesReq);
            } else if (i == 3) {
                task = d.this.a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            } else {
                x2.a("OwnedPurchaseLoader: invalid source to load purchases");
                d.this.b(this);
                return;
            }
            task.addOnFailureListener(new ntg());
            task.addOnSuccessListener(this);
        }

        /* renamed from: b */
        public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
            m.a(new d3(1, this, ownedPurchasesResult));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                x2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
            } else if (this.c.isEmpty()) {
                x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.b + " priceType is " + this.a);
                d.this.b(this);
            } else if (this.d.isEmpty()) {
                x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.b + " priceType is " + this.a);
                d.this.b(this);
            } else {
                this.e = ownedPurchasesResult.getSignatureAlgorithm();
                d.this.a(this);
            }
        }
    }

    public d(IapClient iapClient, b bVar, Context context) {
        this.a = iapClient;
        this.c = bVar;
        this.b = context;
        x2.a("AppGalleryHelper AppGalleryHelper created");
    }

    public static ArrayList a(List list, List list2, String str, int i) {
        ArrayList arrayList = new ArrayList();
        long a2 = v2.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            f a3 = f.a((String) list.get(i2), (String) list2.get(i2), str, i, a2);
            if (a3 == null) {
                x2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo parsePurchaseResultInfoFromIntent = this.a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
        if (returnCode != 0) {
            x2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
            return;
        }
        this.c.a(Collections.singletonList(f.a(parsePurchaseResultInfoFromIntent.getInAppPurchaseData(), parsePurchaseResultInfoFromIntent.getInAppDataSignature(), parsePurchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, v2.a())));
    }

    public void a(c cVar) {
        this.c.a(a(cVar.c, cVar.d, cVar.e, cVar.b));
        b(cVar);
    }

    public void b(c cVar) {
        Set set = this.d;
        if (set == null) {
            x2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.d = null;
        }
    }

    public void a(Intent intent) {
        x2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        m.f(new l8g(15, this, intent));
    }

    public JSONObject a(List list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else if (list == null) {
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                try {
                    if (jSONObject.getString("productId").equals(str)) {
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    x2.a("AppGalleryHelper: error while reading product_id", th);
                }
            }
            return null;
        }
        x2.a(str2);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        x2.a("AppGalleryHelper: error while loading products ", exc);
        this.c.c(list);
    }

    private /* synthetic */ void a(List list, Exception exc) {
        m.a(new o6d(20, (Object) this, (Object) exc, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List<ProductInfo> productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            x2.a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            for (ProductInfo a2 : productInfoList) {
                arrayList.add(a((Object) a2));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.a(a((List) arrayList, fVar.c()));
            }
        }
        this.c.c(list);
    }

    private /* synthetic */ void a(List list, ProductInfoResult productInfoResult) {
        m.a(new ktg(this, productInfoResult, list, 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, List list) {
        Task obtainProductInfo = this.a.obtainProductInfo(productInfoReq);
        obtainProductInfo.addOnFailureListener(new ltg(list));
        obtainProductInfo.addOnSuccessListener(new mtg(list));
    }

    public void a(List list) {
        x2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                int i = fVar.e().getInt("kind");
                if (i == 0) {
                    arrayList.add(fVar);
                } else if (i == 1) {
                    arrayList2.add(fVar);
                } else if (i == 2) {
                    arrayList3.add(fVar);
                }
            } catch (Throwable th) {
                x2.b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            a((List) arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a((List) arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a((List) arrayList3, 2);
        }
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.d = Collections.synchronizedSet(hashSet);
        x2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b((String) null);
        }
    }

    public void a(List list, int i) {
        x2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            f fVar = (f) it.next();
            hashSet.add(fVar.c());
            arrayList.add(fVar);
            it.remove();
        }
        x2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (hashSet.contains(fVar2.c())) {
                arrayList.add(fVar2);
                it.remove();
            }
        }
        x2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            x2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i);
        }
        ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        m.f(new ktg(this, productInfoReq, arrayList, 0));
    }

    public static a a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            x2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    public static JSONObject a(Object obj) {
        x2.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("productId", (Object) productInfo.getProductId());
            jSONObject.put("productName", (Object) productInfo.getProductName());
            jSONObject.put("productDesc", (Object) productInfo.getProductDesc());
            jSONObject.put("currency", (Object) productInfo.getCurrency());
            jSONObject.put("price", (Object) productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", (Object) productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", (Object) productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", (Object) productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", (Object) productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", (Object) productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", (Object) productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", (Object) productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e) {
            x2.b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            x2.b("AppGalleryHelper: ", th);
            return null;
        }
    }
}
