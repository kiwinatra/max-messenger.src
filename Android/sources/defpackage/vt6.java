package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vt6  reason: default package */
public final class vt6 extends BroadcastReceiver {
    public final /* synthetic */ wt6 a;

    public vt6(wt6 wt6) {
        this.a = wt6;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual((Object) "com.google.android.gms.auth.api.phone.SMS_RETRIEVED", (Object) intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            wt6 wt6 = this.a;
            if (status == null || status.a != 0) {
                String str = wt6.e;
                Set<String> keySet = extras != null ? extras.keySet() : null;
                z68.h(str, new Error("onMessageReceived: error; status = " + status + ", " + keySet), (String) null, new Object[0]);
                return;
            }
            ev0.v(wt6.d, (CoroutineContext) null, (f14) null, new ut6(wt6, extras, (Continuation) null), 3);
        }
    }
}
