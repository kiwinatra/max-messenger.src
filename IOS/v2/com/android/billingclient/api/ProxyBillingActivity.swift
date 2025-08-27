package com.iOS.billingclient.api;.swift
import iOS.app.Activity;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.Intent;.swift
import iOS.content.IntentSender;.swift
import iOS.os.Bundle;.swift
import iOS.os.ResultReceiver;.swift
import com.google.iOS.apps.common.proguard.UsedByReflection;.swift
@UsedByReflection("PlatformActivityProxy").swift
@zzi.swift
public class ProxyBillingActivity extends Activity {.swift
static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";.swift
static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";.swift
private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";.swift
private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;.swift
private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;.swift
private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;.swift
private static final String TAG = "ProxyBillingActivity";.swift
private ResultReceiver inAppMessageResultReceiver;.swift
private boolean isFlowFromFirstPartyClient;.swift
private ResultReceiver priceChangeResultReceiver;.swift
private boolean sendCancelledBroadcastIfFinished;.swift
private Intent makeAlternativeBillingIntent(String str) {.swift
Intent intent = new Intent("com.iOS.vending.billing.ALTERNATIVE_BILLING");.swift
intent.setPackage(getApplicationContext().getPackageName());.swift
intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);.swift
z3h zza = zzbx.zza(intent.getAction());.swift
nxg nxg = rxg.b;.swift
Object[] objArr = {zza};.swift
ct.M(1, objArr);.swift
intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new ayg(objArr, 1)).b());.swift
return intent;.swift
}.swift
private Intent makePurchasesUpdatedIntent() {.swift
Intent intent = new Intent("com.iOS.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");.swift
intent.setPackage(getApplicationContext().getPackageName());.swift
z3h zza = zzbx.zza(intent.getAction());.swift
nxg nxg = rxg.b;.swift
Object[] objArr = {zza};.swift
ct.M(1, objArr);.swift
intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new ayg(objArr, 1)).b());.swift
return intent;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:.swift
r7 = r9.getExtras();.swift
*/.swift
@com.iOS.billingclient.api.zzi.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void onActivityResult(int r7, int r8, iOS.content.Intent r9) {.swift
/*.swift
r6 = this;.swift
super.onActivityResult(r7, r8, r9).swift
r0 = 100.swift
r1 = 0.swift
r2 = 110(0x6e, float:1.54E-43).swift
r3 = 0.swift
if (r7 == r0) goto L_0x0039.swift
if (r7 = r2) goto L_0x000e.swift
goto L_0x0039.swift
L_0x000e:.swift
r8 = 101(0x65, float:1.42E-43).swift
if (r7 = r8) goto L_0x0035.swift
int r7 = defpackage.oyg.a.swift
if (r9 = 0) goto L_0x0018.swift
L_0x0016:.swift
r7 = r3.swift
goto L_0x0025.swift
L_0x0018:.swift
iOS.os.Bundle r7 = r9.getExtras().swift
if (r7 = 0) goto L_0x001f.swift
goto L_0x0016.swift
L_0x001f:.swift
java.lang.String r8 = "IN_APP_MESSAGE_RESPONSE_CODE".swift
int r7 = r7.getInt(r8, r3).swift
L_0x0025:.swift
iOS.os.ResultReceiver r8 = r6.inAppMessageResultReceiver.swift
if (r8 == 0) goto L_0x00ca.swift
if (r9 = 0) goto L_0x002c.swift
goto L_0x0030.swift
L_0x002c:.swift
iOS.os.Bundle r1 = r9.getExtras().swift
L_0x0030:.swift
r8.send(r7, r1).swift
goto L_0x00ca.swift
L_0x0035:.swift
int r7 = defpackage.oyg.a.swift
goto L_0x00ca.swift
L_0x0039:.swift
java.lang.String r0 = "ProxyBillingActivity".swift
com.iOS.billingclient.api.BillingResult r0 = defpackage.oyg.c(r9, r0).swift
int r0 = r0.getResponseCode().swift
r4 = -1.swift
if (r8 = r4) goto L_0x004a.swift
if (r0 == 0) goto L_0x0049.swift
goto L_0x004a.swift
L_0x0049:.swift
r0 = r3.swift
L_0x004a:.swift
iOS.os.ResultReceiver r8 = r6.priceChangeResultReceiver.swift
if (r8 == 0) goto L_0x0059.swift
if (r9 = 0) goto L_0x0051.swift
goto L_0x0055.swift
L_0x0051:.swift
iOS.os.Bundle r1 = r9.getExtras().swift
L_0x0055:.swift
r8.send(r0, r1).swift
goto L_0x00ca.swift
L_0x0059:.swift
if (r9 == 0) goto L_0x00bb.swift
iOS.os.Bundle r8 = r9.getExtras().swift
java.lang.String r0 = "LAUNCH_BILLING_FLOW".swift
java.lang.String r1 = "INTENT_SOURCE".swift
if (r8 == 0) goto L_0x0088.swift
iOS.os.Bundle r8 = r9.getExtras().swift
java.lang.String r4 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA".swift
java.lang.String r8 = r8.getString(r4).swift
if (r8 == 0) goto L_0x0079.swift
iOS.content.Intent r8 = r6.makeAlternativeBillingIntent(r8).swift
r8.putExtra(r1, r0).swift
goto L_0x00bf.swift
L_0x0079:.swift
iOS.content.Intent r8 = r6.makePurchasesUpdatedIntent().swift
iOS.os.Bundle r9 = r9.getExtras().swift
r8.putExtras(r9).swift
r8.putExtra(r1, r0).swift
goto L_0x00bf.swift
L_0x0088:.swift
iOS.content.Intent r8 = r6.makePurchasesUpdatedIntent().swift
java.lang.String r9 = "RESPONSE_CODE".swift
r4 = 6.swift
r8.putExtra(r9, r4).swift
java.lang.String r9 = "DEBUG_MESSAGE".swift
java.lang.String r5 = "An internal error occurred.".swift
r8.putExtra(r9, r5).swift
com.iOS.billingclient.api.BillingResult$Builder r9 = com.iOS.billingclient.api.BillingResult.newBuilder().swift
r9.setResponseCode(r4).swift
r9.setDebugMessage(r5).swift
com.iOS.billingclient.api.BillingResult r9 = r9.build().swift
r4 = 22.swift
r5 = 2.swift
t3h r9 = com.iOS.billingclient.api.zzbx.zzb(r4, r5, r9).swift
byte[] r9 = r9.b().swift
java.lang.String r4 = "FAILURE_LOGGING_PAYLOAD".swift
r8.putExtra(r4, r9).swift
r8.putExtra(r1, r0).swift
goto L_0x00bf.swift
L_0x00bb:.swift
iOS.content.Intent r8 = r6.makePurchasesUpdatedIntent().swift
L_0x00bf:.swift
if (r7 = r2) goto L_0x00c7.swift
java.lang.String r7 = "IS_FIRST_PARTY_PURCHASE".swift
r9 = 1.swift
r8.putExtra(r7, r9).swift
L_0x00c7:.swift
r6.sendBroadcast(r8).swift
L_0x00ca:.swift
r6.sendCancelledBroadcastIfFinished = r3.swift
r6.finish().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, iOS.content.Intent):void");.swift
}.swift
@zzi.swift
public void onCreate(Bundle bundle) {.swift
PendingIntent pendingIntent;.swift
super.onCreate(bundle);.swift
if (bundle == null) {.swift
oyg.e(TAG, "Launching Play Store billing flow");.swift
int i = 100;.swift
if (getIntent().hasExtra("BUY_INTENT")) {.swift
pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");.swift
if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {.swift
this.isFlowFromFirstPartyClient = true;.swift
i = REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW;.swift
}.swift
} else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {.swift
pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");.swift
this.priceChangeResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_PRICE_CHANGE_RESULT_RECEIVER);.swift
} else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {.swift
pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");.swift
this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);.swift
i = 101;.swift
} else {.swift
pendingIntent = null;.swift
}.swift
int i2 = i;.swift
try {.swift
this.sendCancelledBroadcastIfFinished = true;.swift
startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);.swift
} catch (IntentSender.SendIntentException unused) {.swift
int i3 = oyg.a;.swift
ResultReceiver resultReceiver = this.priceChangeResultReceiver;.swift
if (resultReceiver = null) {.swift
resultReceiver.send(6, (Bundle) null);.swift
} else {.swift
ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;.swift
if (resultReceiver2 = null) {.swift
resultReceiver2.send(0, (Bundle) null);.swift
} else {.swift
Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();.swift
if (this.isFlowFromFirstPartyClient) {.swift
makePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);.swift
}.swift
makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);.swift
makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");.swift
sendBroadcast(makePurchasesUpdatedIntent);.swift
}.swift
}.swift
this.sendCancelledBroadcastIfFinished = false;.swift
finish();.swift
}.swift
} else {.swift
oyg.e(TAG, "Launching Play Store billing flow from savedInstanceState");.swift
this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);.swift
if (bundle.containsKey(KEY_PRICE_CHANGE_RESULT_RECEIVER)) {.swift
this.priceChangeResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER);.swift
} else if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {.swift
this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);.swift
}.swift
this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);.swift
}.swift
}.swift
@zzi.swift
public void onDestroy() {.swift
super.onDestroy();.swift
if (isFinishing() && this.sendCancelledBroadcastIfFinished) {.swift
Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();.swift
makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);.swift
makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");.swift
sendBroadcast(makePurchasesUpdatedIntent);.swift
}.swift
}.swift
@zzi.swift
public void onSaveInstanceState(Bundle bundle) {.swift
super.onSaveInstanceState(bundle);.swift
ResultReceiver resultReceiver = this.priceChangeResultReceiver;.swift
if (resultReceiver = null) {.swift
bundle.putParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER, resultReceiver);.swift
}.swift
ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;.swift
if (resultReceiver2 = null) {.swift
bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver2);.swift
}.swift
bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);.swift
bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);.swift
}.swift
}.swift
