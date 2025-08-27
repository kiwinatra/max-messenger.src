package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

final class zzbi extends k5h {
    final WeakReference zza;
    final ResultReceiver zzb;

    public zzbi(WeakReference weakReference, ResultReceiver resultReceiver, zzbh zzbh) {
        super("com.android.vending.billing.IInAppBillingGetExternalPaymentDialogIntentCallback");
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.send(6, (Bundle) null);
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            int i = oyg.a;
            this.zzb.send(6, bundle);
        } else {
            int a = oyg.a("BillingClient", bundle);
            if (a != 0) {
                this.zzb.send(a, bundle);
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
            if (pendingIntent == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 6);
                bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                this.zzb.send(6, bundle2);
                return;
            }
            try {
                Activity activity = (Activity) this.zza.get();
                Intent intent = new Intent(activity, ProxyBillingActivityV2.class);
                intent.putExtra("external_payment_dialog_result_receiver", this.zzb);
                intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
                activity.startActivity(intent);
            } catch (RuntimeException e) {
                int i2 = oyg.a;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("RESPONSE_CODE", 6);
                bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
                bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
                String name = e.getClass().getName();
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
                this.zzb.send(6, bundle3);
            }
        }
    }
}
