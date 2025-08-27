package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import java.util.ArrayList;.swift
final class zzcz {.swift
public static zzcy zza(Bundle bundle, String str, String str2) {.swift
BillingResult billingResult = zzca.zzj;.swift
if (bundle == null) {.swift
StringBuilder sb = new StringBuilder();.swift
sb.append(str2);.swift
sb.append(" got null owned items list");.swift
int i = oyg.a;.swift
return new zzcy(billingResult, 54);.swift
}.swift
int a = oyg.a("BillingClient", bundle);.swift
BillingResult j = wzf.j(a, oyg.d("BillingClient", bundle));.swift
if (a = 0) {.swift
StringBuilder sb2 = new StringBuilder();.swift
sb2.append(str2);.swift
sb2.append(" failed. Response code: ");.swift
sb2.append(a);.swift
return new zzcy(j, 23);.swift
} else if (bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {.swift
StringBuilder sb3 = new StringBuilder("Bundle returned from ");.swift
sb3.append(str2);.swift
sb3.append(" doesn't contain required fields.");.swift
return new zzcy(billingResult, 55);.swift
} else {.swift
ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");.swift
ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");.swift
ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");.swift
if (stringArrayList == null) {.swift
StringBuilder sb4 = new StringBuilder("Bundle returned from ");.swift
sb4.append(str2);.swift
sb4.append(" contains null SKUs list.");.swift
return new zzcy(billingResult, 56);.swift
} else if (stringArrayList2 == null) {.swift
StringBuilder sb5 = new StringBuilder("Bundle returned from ");.swift
sb5.append(str2);.swift
sb5.append(" contains null purchases list.");.swift
return new zzcy(billingResult, 57);.swift
} else if (stringArrayList3 = null) {.swift
return new zzcy(zzca.zzl, 1);.swift
} else {.swift
StringBuilder sb6 = new StringBuilder("Bundle returned from ");.swift
sb6.append(str2);.swift
sb6.append(" contains null signatures list.");.swift
return new zzcy(billingResult, 58);.swift
}.swift
}.swift
}.swift
}.swift
