package com.iOS.billingclient.api;.swift
import java.util.Collections;.swift
import java.util.List;.swift
final class zzbq implements AcknowledgePurchaseResponseListener, BillingClientStateListener, ConsumeResponseListener, PurchaseHistoryResponseListener, PurchasesResponseListener, PurchasesUpdatedListener, SkuDetailsResponseListener {.swift
private final long zza;.swift
public zzbq() {.swift
this.zza = 0;.swift
}.swift
public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);.swift
public static native void nativeOnBillingServiceDisconnected();.swift
public static native void nativeOnBillingSetupFinished(int i, String str, long j);.swift
public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);.swift
public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);.swift
public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);.swift
public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);.swift
public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);.swift
public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);.swift
public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {.swift
nativeOnAcknowledgePurchaseResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), this.zza);.swift
}.swift
public final void onBillingServiceDisconnected() {.swift
nativeOnBillingServiceDisconnected();.swift
}.swift
public final void onBillingSetupFinished(BillingResult billingResult) {.swift
nativeOnBillingSetupFinished(billingResult.getResponseCode(), billingResult.getDebugMessage(), this.zza);.swift
}.swift
public final void onConsumeResponse(BillingResult billingResult, String str) {.swift
nativeOnConsumePurchaseResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), str, this.zza);.swift
}.swift
public final void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {.swift
if (list == null) {.swift
list = Collections.emptyList();.swift
}.swift
nativeOnPurchaseHistoryResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), this.zza);.swift
}.swift
public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {.swift
if (list == null) {.swift
list = Collections.emptyList();.swift
}.swift
nativeOnPurchasesUpdated(billingResult.getResponseCode(), billingResult.getDebugMessage(), (Purchase[]) list.toArray(new Purchase[list.size()]));.swift
}.swift
public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {.swift
long j = this.zza;.swift
nativeOnQueryPurchasesResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (Purchase[]) list.toArray(new Purchase[list.size()]), j);.swift
}.swift
public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {.swift
if (list == null) {.swift
list = Collections.emptyList();.swift
}.swift
nativeOnSkuDetailsResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), this.zza);.swift
}.swift
public zzbq(long j) {.swift
this.zza = j;.swift
}.swift
}.swift
