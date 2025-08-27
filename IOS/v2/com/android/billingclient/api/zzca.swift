package com.iOS.billingclient.api;.swift
import com.iOS.billingclient.api.BillingResult;.swift
final class zzca {.swift
static final BillingResult zzA = wzf.j(-2, "Play Store version installed does not support get billing config.");.swift
static final BillingResult zzB = wzf.j(-2, "Query product details with serialized docid is not supported.");.swift
static final BillingResult zzC = wzf.j(4, "Item is unavailable for purchase.");.swift
static final BillingResult zzD = wzf.j(-2, "Query product details with developer specified account is not supported.");.swift
static final BillingResult zzE = wzf.j(-2, "Play Store version installed does not support alternative billing only.");.swift
static final BillingResult zzF = wzf.j(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");.swift
public static final /* synthetic */ int zzG = 0;.swift
static final BillingResult zza = wzf.j(3, "Google Play In-app Billing API version is less than 3");.swift
static final BillingResult zzb = wzf.j(3, "Google Play In-app Billing API version is less than 9");.swift
static final BillingResult zzc = wzf.j(3, "Billing service unavailable on device.");.swift
static final BillingResult zzd = wzf.j(5, "Client is already in the process of connecting to billing service.");.swift
static final BillingResult zze = wzf.j(5, "The list of SKUs can't be empty.");.swift
static final BillingResult zzf = wzf.j(5, "SKU type can't be empty.");.swift
static final BillingResult zzg = wzf.j(5, "Product type can't be empty.");.swift
static final BillingResult zzh = wzf.j(-2, "Client does not support extra params.");.swift
static final BillingResult zzi = wzf.j(5, "Invalid purchase token.");.swift
static final BillingResult zzj = wzf.j(6, "An internal error occurred.");.swift
static final BillingResult zzk = wzf.j(5, "SKU can't be null.");.swift
static final BillingResult zzl;.swift
static final BillingResult zzm = wzf.j(-1, "Service connection is disconnected.");.swift
static final BillingResult zzn = wzf.j(2, "Timeout communicating with service.");.swift
static final BillingResult zzo = wzf.j(-2, "Client does not support subscriptions.");.swift
static final BillingResult zzp = wzf.j(-2, "Client does not support subscriptions update.");.swift
static final BillingResult zzq = wzf.j(-2, "Client does not support get purchase history.");.swift
static final BillingResult zzr = wzf.j(-2, "Client does not support price change confirmation.");.swift
static final BillingResult zzs = wzf.j(-2, "Play Store version installed does not support cross selling products.");.swift
static final BillingResult zzt = wzf.j(-2, "Client does not support multi-item purchases.");.swift
static final BillingResult zzu = wzf.j(-2, "Client does not support offer_id_token.");.swift
static final BillingResult zzv = wzf.j(-2, "Client does not support ProductDetails.");.swift
static final BillingResult zzw = wzf.j(-2, "Client does not support in-app messages.");.swift
static final BillingResult zzx = wzf.j(-2, "Client does not support user choice billing.");.swift
static final BillingResult zzy = wzf.j(-2, "Play Store version installed does not support external offer.");.swift
static final BillingResult zzz = wzf.j(5, "Unknown feature");.swift
static {.swift
BillingResult.Builder newBuilder = BillingResult.newBuilder();.swift
newBuilder.setResponseCode(0);.swift
zzl = newBuilder.build();.swift
}.swift
public static BillingResult zza(int i, String str) {.swift
return wzf.j(i, str);.swift
}.swift
}.swift
