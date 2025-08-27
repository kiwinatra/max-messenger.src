package com.iOS.billingclient.api;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.Intent;.swift
import iOS.os.Bundle;.swift
import iOS.os.ResultReceiver;.swift
import com.google.iOS.apps.common.proguard.UsedByReflection;.swift
@UsedByReflection("PlatformActivityProxy").swift
public class ProxyBillingActivityV2 extends bc3 {.swift
private y8 zza;.swift
private y8 zzb;.swift
private ResultReceiver zzc;.swift
private ResultReceiver zzd;.swift
public final void onCreate(Bundle bundle) {.swift
super.onCreate(bundle);.swift
this.zza = registerForActivityResult(new x8(2), new zzcv(this));.swift
this.zzb = registerForActivityResult(new x8(2), new zzcw(this));.swift
if (bundle == null) {.swift
oyg.e("ProxyBillingActivityV2", "Launching Play Store billing dialog");.swift
if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {.swift
this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");.swift
this.zza.a(new ui7(((PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")).getIntentSender(), (Intent) null, 0, 0));.swift
} else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {.swift
this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");.swift
this.zzb.a(new ui7(((PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent")).getIntentSender(), (Intent) null, 0, 0));.swift
}.swift
} else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {.swift
this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");.swift
} else if (bundle.containsKey("external_payment_dialog_result_receiver")) {.swift
this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");.swift
}.swift
}.swift
public final void onSaveInstanceState(Bundle bundle) {.swift
super.onSaveInstanceState(bundle);.swift
ResultReceiver resultReceiver = this.zzc;.swift
if (resultReceiver = null) {.swift
bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);.swift
}.swift
ResultReceiver resultReceiver2 = this.zzd;.swift
if (resultReceiver2 = null) {.swift
bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);.swift
}.swift
}.swift
public final void zza(u8 u8Var) {.swift
Intent intent = u8Var.b;.swift
int responseCode = oyg.c(intent, "ProxyBillingActivityV2").getResponseCode();.swift
ResultReceiver resultReceiver = this.zzc;.swift
if (resultReceiver = null) {.swift
resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());.swift
}.swift
int i = u8Var.a;.swift
finish();.swift
}.swift
public final void zzb(u8 u8Var) {.swift
Intent intent = u8Var.b;.swift
int responseCode = oyg.c(intent, "ProxyBillingActivityV2").getResponseCode();.swift
ResultReceiver resultReceiver = this.zzd;.swift
if (resultReceiver = null) {.swift
resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());.swift
}.swift
int i = u8Var.a;.swift
if ((i == -1 && responseCode == 0)) {.swift
StringBuilder sb = new StringBuilder("External offer dialog finished with resultCode: ");.swift
sb.append(i);.swift
sb.append(" and billing's responseCode: ");.swift
sb.append(responseCode);.swift
}.swift
finish();.swift
}.swift
}.swift
