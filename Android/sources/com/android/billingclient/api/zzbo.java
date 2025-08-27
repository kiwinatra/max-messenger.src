package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

final class zzbo extends i7h {
    final WeakReference zza;
    final ResultReceiver zzb;

    public zzbo(WeakReference weakReference, ResultReceiver resultReceiver, zzbn zzbn) {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            int i = oyg.a;
        } else if (bundle == null) {
            resultReceiver.send(0, (Bundle) null);
        } else {
            Activity activity = (Activity) this.zza.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                this.zzb.send(0, (Bundle) null);
                int i2 = oyg.a;
                return;
            }
            try {
                Intent intent = new Intent(activity, ProxyBillingActivity.class);
                intent.putExtra("in_app_message_result_receiver", this.zzb);
                intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                activity.startActivity(intent);
            } catch (CancellationException unused) {
                this.zzb.send(0, (Bundle) null);
                int i3 = oyg.a;
            }
        }
    }
}
