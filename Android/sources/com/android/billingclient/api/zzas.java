package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class zzas extends ResultReceiver {
    final /* synthetic */ InAppMessageResponseListener zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzas(BillingClientImpl billingClientImpl, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.zza = inAppMessageResponseListener;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        InAppMessageResponseListener inAppMessageResponseListener = this.zza;
        int i2 = oyg.a;
        inAppMessageResponseListener.onInAppMessageResponse(bundle == null ? new InAppMessageResult(0, (String) null) : new InAppMessageResult(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN")));
    }
}
