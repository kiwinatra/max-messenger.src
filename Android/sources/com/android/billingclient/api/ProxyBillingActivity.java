package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;

@UsedByReflection("PlatformActivityProxy")
@zzi
public class ProxyBillingActivity extends Activity {
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final String TAG = "ProxyBillingActivity";
    private ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private ResultReceiver priceChangeResultReceiver;
    private boolean sendCancelledBroadcastIfFinished;

    private Intent makeAlternativeBillingIntent(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        z3h zza = zzbx.zza(intent.getAction());
        nxg nxg = rxg.b;
        Object[] objArr = {zza};
        ct.M(1, objArr);
        intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new ayg(objArr, 1)).b());
        return intent;
    }

    private Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        z3h zza = zzbx.zza(intent.getAction());
        nxg nxg = rxg.b;
        Object[] objArr = {zza};
        ct.M(1, objArr);
        intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new ayg(objArr, 1)).b());
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r7 = r9.getExtras();
     */
    @com.android.billingclient.api.zzi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 100
            r1 = 0
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            if (r7 == r0) goto L_0x0039
            if (r7 != r2) goto L_0x000e
            goto L_0x0039
        L_0x000e:
            r8 = 101(0x65, float:1.42E-43)
            if (r7 != r8) goto L_0x0035
            int r7 = defpackage.oyg.a
            if (r9 != 0) goto L_0x0018
        L_0x0016:
            r7 = r3
            goto L_0x0025
        L_0x0018:
            android.os.Bundle r7 = r9.getExtras()
            if (r7 != 0) goto L_0x001f
            goto L_0x0016
        L_0x001f:
            java.lang.String r8 = "IN_APP_MESSAGE_RESPONSE_CODE"
            int r7 = r7.getInt(r8, r3)
        L_0x0025:
            android.os.ResultReceiver r8 = r6.inAppMessageResultReceiver
            if (r8 == 0) goto L_0x00ca
            if (r9 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            android.os.Bundle r1 = r9.getExtras()
        L_0x0030:
            r8.send(r7, r1)
            goto L_0x00ca
        L_0x0035:
            int r7 = defpackage.oyg.a
            goto L_0x00ca
        L_0x0039:
            java.lang.String r0 = "ProxyBillingActivity"
            com.android.billingclient.api.BillingResult r0 = defpackage.oyg.c(r9, r0)
            int r0 = r0.getResponseCode()
            r4 = -1
            if (r8 != r4) goto L_0x004a
            if (r0 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            android.os.ResultReceiver r8 = r6.priceChangeResultReceiver
            if (r8 == 0) goto L_0x0059
            if (r9 != 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            android.os.Bundle r1 = r9.getExtras()
        L_0x0055:
            r8.send(r0, r1)
            goto L_0x00ca
        L_0x0059:
            if (r9 == 0) goto L_0x00bb
            android.os.Bundle r8 = r9.getExtras()
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r1 = "INTENT_SOURCE"
            if (r8 == 0) goto L_0x0088
            android.os.Bundle r8 = r9.getExtras()
            java.lang.String r4 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r8 = r8.getString(r4)
            if (r8 == 0) goto L_0x0079
            android.content.Intent r8 = r6.makeAlternativeBillingIntent(r8)
            r8.putExtra(r1, r0)
            goto L_0x00bf
        L_0x0079:
            android.content.Intent r8 = r6.makePurchasesUpdatedIntent()
            android.os.Bundle r9 = r9.getExtras()
            r8.putExtras(r9)
            r8.putExtra(r1, r0)
            goto L_0x00bf
        L_0x0088:
            android.content.Intent r8 = r6.makePurchasesUpdatedIntent()
            java.lang.String r9 = "RESPONSE_CODE"
            r4 = 6
            r8.putExtra(r9, r4)
            java.lang.String r9 = "DEBUG_MESSAGE"
            java.lang.String r5 = "An internal error occurred."
            r8.putExtra(r9, r5)
            com.android.billingclient.api.BillingResult$Builder r9 = com.android.billingclient.api.BillingResult.newBuilder()
            r9.setResponseCode(r4)
            r9.setDebugMessage(r5)
            com.android.billingclient.api.BillingResult r9 = r9.build()
            r4 = 22
            r5 = 2
            t3h r9 = com.android.billingclient.api.zzbx.zzb(r4, r5, r9)
            byte[] r9 = r9.b()
            java.lang.String r4 = "FAILURE_LOGGING_PAYLOAD"
            r8.putExtra(r4, r9)
            r8.putExtra(r1, r0)
            goto L_0x00bf
        L_0x00bb:
            android.content.Intent r8 = r6.makePurchasesUpdatedIntent()
        L_0x00bf:
            if (r7 != r2) goto L_0x00c7
            java.lang.String r7 = "IS_FIRST_PARTY_PURCHASE"
            r9 = 1
            r8.putExtra(r7, r9)
        L_0x00c7:
            r6.sendBroadcast(r8)
        L_0x00ca:
            r6.sendCancelledBroadcastIfFinished = r3
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @zzi
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            oyg.e(TAG, "Launching Play Store billing flow");
            int i = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.isFlowFromFirstPartyClient = true;
                    i = REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW;
                }
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.priceChangeResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_PRICE_CHANGE_RESULT_RECEIVER);
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
                i = 101;
            } else {
                pendingIntent = null;
            }
            int i2 = i;
            try {
                this.sendCancelledBroadcastIfFinished = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                int i3 = oyg.a;
                ResultReceiver resultReceiver = this.priceChangeResultReceiver;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        if (this.isFlowFromFirstPartyClient) {
                            makePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
                        makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(makePurchasesUpdatedIntent);
                    }
                }
                this.sendCancelledBroadcastIfFinished = false;
                finish();
            }
        } else {
            oyg.e(TAG, "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);
            if (bundle.containsKey(KEY_PRICE_CHANGE_RESULT_RECEIVER)) {
                this.priceChangeResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER);
            } else if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {
                this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            }
            this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        }
    }

    @zzi
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);
            makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(makePurchasesUpdatedIntent);
        }
    }

    @zzi
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.priceChangeResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
        if (resultReceiver2 != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver2);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
    }
}
