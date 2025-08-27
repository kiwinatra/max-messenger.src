package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.text.TextUtils;.swift
import com.huawei.hmf.tasks.OnSuccessListener;.swift
import com.huawei.hmf.tasks.Task;.swift
import com.huawei.hms.iap.Iap;.swift
import com.huawei.hms.iap.IapClient;.swift
import com.huawei.hms.iap.entity.OwnedPurchasesReq;.swift
import com.huawei.hms.iap.entity.OwnedPurchasesResult;.swift
import com.huawei.hms.iap.entity.ProductInfo;.swift
import com.huawei.hms.iap.entity.ProductInfoReq;.swift
import com.huawei.hms.iap.entity.ProductInfoResult;.swift
import com.huawei.hms.iap.entity.PurchaseResultInfo;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Set;.swift
import org.json.JSONObject;.swift
public final class d {.swift
final IapClient a;.swift
final Context b;.swift
final b c;.swift
Set d;.swift
public static final class a {.swift
final IapClient a;.swift
final Context b;.swift
public a(IapClient iapClient, Context context) {.swift
this.a = iapClient;.swift
this.b = context;.swift
}.swift
public d a(b bVar) {.swift
return new d(this.a, bVar, this.b);.swift
}.swift
}.swift
public interface b {.swift
void a(List list);.swift
void c(List list);.swift
}.swift
public final class c implements OnSuccessListener {.swift
final int a;.swift
final int b;.swift
final List c = Collections.synchronizedList(new ArrayList());.swift
final List d = Collections.synchronizedList(new ArrayList());.swift
String e;.swift
public c(int i, int i2) {.swift
this.a = i;.swift
this.b = i2;.swift
x2.a("OwnedPurchaseLoader: loader created");.swift
}.swift
private /* synthetic */ void a(Exception exc) {.swift
x2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);.swift
d.this.b(this);.swift
}.swift
public void b(String str) {.swift
m.f(new d3(0, this, str));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str) {.swift
Task task;.swift
x2.a("OwnedPurchaseLoader: start loadPurchases");.swift
OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();.swift
ownedPurchasesReq.setPriceType(this.a);.swift
ownedPurchasesReq.setContinuationToken(str);.swift
int i = this.b;.swift
if (i == 2) {.swift
task = d.this.a.obtainOwnedPurchases(ownedPurchasesReq);.swift
} else if (i == 3) {.swift
task = d.this.a.obtainOwnedPurchaseRecord(ownedPurchasesReq);.swift
} else {.swift
x2.a("OwnedPurchaseLoader: invalid source to load purchases");.swift
d.this.b(this);.swift
return;.swift
}.swift
task.addOnFailureListener(new ntg());.swift
task.addOnSuccessListener(this);.swift
}.swift
/* renamed from: b */.swift
public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {.swift
m.a(new d3(1, this, ownedPurchasesResult));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {.swift
this.c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());.swift
this.d.addAll(ownedPurchasesResult.getInAppSignature());.swift
String continuationToken = ownedPurchasesResult.getContinuationToken();.swift
if (TextUtils.isEmpty(continuationToken)) {.swift
x2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");.swift
b(continuationToken);.swift
} else if (this.c.isEmpty()) {.swift
x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.b + " priceType is " + this.a);.swift
d.this.b(this);.swift
} else if (this.d.isEmpty()) {.swift
x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.b + " priceType is " + this.a);.swift
d.this.b(this);.swift
} else {.swift
this.e = ownedPurchasesResult.getSignatureAlgorithm();.swift
d.this.a(this);.swift
}.swift
}.swift
}.swift
public d(IapClient iapClient, b bVar, Context context) {.swift
this.a = iapClient;.swift
this.c = bVar;.swift
this.b = context;.swift
x2.a("AppGalleryHelper AppGalleryHelper created");.swift
}.swift
public static ArrayList a(List list, List list2, String str, int i) {.swift
ArrayList arrayList = new ArrayList();.swift
long a2 = v2.a();.swift
for (int i2 = 0; i2 < list.size(); i2++) {.swift
f a3 = f.a((String) list.get(i2), (String) list2.get(i2), str, i, a2);.swift
if (a3 == null) {.swift
x2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");.swift
} else {.swift
arrayList.add(a3);.swift
}.swift
}.swift
return arrayList;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(Intent intent) {.swift
PurchaseResultInfo parsePurchaseResultInfoFromIntent = this.a.parsePurchaseResultInfoFromIntent(intent);.swift
int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();.swift
if (returnCode = 0) {.swift
x2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);.swift
return;.swift
}.swift
this.c.a(Collections.singletonList(f.a(parsePurchaseResultInfoFromIntent.getInAppPurchaseData(), parsePurchaseResultInfoFromIntent.getInAppDataSignature(), parsePurchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, v2.a())));.swift
}.swift
public void a(c cVar) {.swift
this.c.a(a(cVar.c, cVar.d, cVar.e, cVar.b));.swift
b(cVar);.swift
}.swift
public void b(c cVar) {.swift
Set set = this.d;.swift
if (set == null) {.swift
x2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");.swift
return;.swift
}.swift
set.remove(cVar);.swift
if (set.isEmpty()) {.swift
this.d = null;.swift
}.swift
}.swift
public void a(Intent intent) {.swift
x2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");.swift
m.f(new l8g(15, this, intent));.swift
}.swift
public JSONObject a(List list, String str) {.swift
String str2;.swift
if (str == null) {.swift
str2 = "AppGalleryHelper: can't get product by id, id is null";.swift
} else if (list == null) {.swift
str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";.swift
} else {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
JSONObject jSONObject = (JSONObject) it.next();.swift
try {.swift
if (jSONObject.getString("productId").equals(str)) {.swift
return jSONObject;.swift
}.swift
} catch (Throwable th) {.swift
x2.a("AppGalleryHelper: error while reading product_id", th);.swift
}.swift
}.swift
return null;.swift
}.swift
x2.a(str2);.swift
return null;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Exception exc, List list) {.swift
x2.a("AppGalleryHelper: error while loading products ", exc);.swift
this.c.c(list);.swift
}.swift
private /* synthetic */ void a(List list, Exception exc) {.swift
m.a(new o6d(20, (Object) this, (Object) exc, list));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {.swift
List<ProductInfo> productInfoList = productInfoResult.getProductInfoList();.swift
if (productInfoList == null) {.swift
x2.a("AppGalleryHelper: productInfoList is null, finish products loading");.swift
} else {.swift
ArrayList arrayList = new ArrayList();.swift
for (ProductInfo a2 : productInfoList) {.swift
arrayList.add(a((Object) a2));.swift
}.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
f fVar = (f) it.next();.swift
fVar.a(a((List) arrayList, fVar.c()));.swift
}.swift
}.swift
this.c.c(list);.swift
}.swift
private /* synthetic */ void a(List list, ProductInfoResult productInfoResult) {.swift
m.a(new ktg(this, productInfoResult, list, 1));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(ProductInfoReq productInfoReq, List list) {.swift
Task obtainProductInfo = this.a.obtainProductInfo(productInfoReq);.swift
obtainProductInfo.addOnFailureListener(new ltg(list));.swift
obtainProductInfo.addOnSuccessListener(new mtg(list));.swift
}.swift
public void a(List list) {.swift
x2.a("AppGalleryHelper: start loading all products");.swift
ArrayList arrayList = new ArrayList();.swift
ArrayList arrayList2 = new ArrayList();.swift
ArrayList arrayList3 = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
f fVar = (f) it.next();.swift
try {.swift
int i = fVar.e().getInt("kind");.swift
if (i == 0) {.swift
arrayList.add(fVar);.swift
} else if (i == 1) {.swift
arrayList2.add(fVar);.swift
} else if (i == 2) {.swift
arrayList3.add(fVar);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("AppGalleryHelper: can not getting price type ", th);.swift
}.swift
}.swift
if (arrayList.size() > 0) {.swift
a((List) arrayList, 0);.swift
}.swift
if (arrayList2.size() > 0) {.swift
a((List) arrayList2, 1);.swift
}.swift
if (arrayList3.size() > 0) {.swift
a((List) arrayList3, 2);.swift
}.swift
}.swift
public void a() {.swift
HashSet hashSet = new HashSet();.swift
hashSet.add(new c(0, 2));.swift
hashSet.add(new c(1, 2));.swift
hashSet.add(new c(2, 2));.swift
hashSet.add(new c(0, 3));.swift
hashSet.add(new c(2, 3));.swift
this.d = Collections.synchronizedSet(hashSet);.swift
x2.a("AppGalleryHelper: purchase loaders created");.swift
Iterator it = hashSet.iterator();.swift
while (it.hasNext()) {.swift
((c) it.next()).b((String) null);.swift
}.swift
}.swift
public void a(List list, int i) {.swift
x2.a("AppGalleryHelper: start loading products by price");.swift
HashSet hashSet = new HashSet();.swift
ArrayList arrayList = new ArrayList();.swift
Iterator it = list.iterator();.swift
while (it.hasNext() && hashSet.size() < 200) {.swift
f fVar = (f) it.next();.swift
hashSet.add(fVar.c());.swift
arrayList.add(fVar);.swift
it.remove();.swift
}.swift
x2.a("AppGalleryHelper: product id's have been detected");.swift
while (it.hasNext()) {.swift
f fVar2 = (f) it.next();.swift
if (hashSet.contains(fVar2.c())) {.swift
arrayList.add(fVar2);.swift
it.remove();.swift
}.swift
}.swift
x2.a("AppGalleryHelper: products deduplication done");.swift
if (list.size() > 0) {.swift
x2.a("AppGalleryHelper: there are still unloaded products, we are loading more");.swift
a(list, i);.swift
}.swift
ProductInfoReq productInfoReq = new ProductInfoReq();.swift
productInfoReq.setPriceType(i);.swift
productInfoReq.setProductIds(new ArrayList(hashSet));.swift
m.f(new ktg(this, productInfoReq, arrayList, 0));.swift
}.swift
public static a a(Context context) {.swift
try {.swift
return new a(Iap.getIapClient(context), context);.swift
} catch (Throwable th) {.swift
x2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);.swift
return null;.swift
}.swift
}.swift
public static JSONObject a(Object obj) {.swift
x2.a("AppGalleryHelper: start parseProductInfoToJson");.swift
try {.swift
ProductInfo productInfo = (ProductInfo) obj;.swift
JSONObject jSONObject = new JSONObject();.swift
jSONObject.put("productId", (Object) productInfo.getProductId());.swift
jSONObject.put("productName", (Object) productInfo.getProductName());.swift
jSONObject.put("productDesc", (Object) productInfo.getProductDesc());.swift
jSONObject.put("currency", (Object) productInfo.getCurrency());.swift
jSONObject.put("price", (Object) productInfo.getPrice());.swift
jSONObject.put("microsPrice", productInfo.getMicrosPrice());.swift
jSONObject.put("priceType", productInfo.getPriceType());.swift
jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());.swift
jSONObject.put("originalLocalPrice", (Object) productInfo.getOriginalLocalPrice());.swift
jSONObject.put("subPeriod", (Object) productInfo.getSubPeriod());.swift
jSONObject.put("subSpecialPrice", (Object) productInfo.getSubSpecialPrice());.swift
jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());.swift
jSONObject.put("subSpecialPeriod", (Object) productInfo.getSubSpecialPeriod());.swift
jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());.swift
jSONObject.put("subFreeTrialPeriod", (Object) productInfo.getSubFreeTrialPeriod());.swift
jSONObject.put("subGroupId", (Object) productInfo.getSubGroupId());.swift
jSONObject.put("subGroupTitle", (Object) productInfo.getSubGroupTitle());.swift
jSONObject.put("subProductLevel", productInfo.getSubProductLevel());.swift
jSONObject.put("status", productInfo.getStatus());.swift
return jSONObject;.swift
} catch (NoClassDefFoundError e) {.swift
x2.b("AppGalleryHelper: ", e);.swift
return null;.swift
} catch (Throwable th) {.swift
x2.b("AppGalleryHelper: ", th);.swift
return null;.swift
}.swift
}.swift
}.swift
