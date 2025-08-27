package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yb3  reason: default package */
public final class yb3 extends e9 {
    public final /* synthetic */ bc3 h;

    public yb3(bc3 bc3) {
        this.h = bc3;
    }

    public final void b(int i, w8 w8Var, Object obj) {
        Bundle bundle;
        bc3 bc3 = this.h;
        xv1 b = w8Var.b(bc3, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new kh1((Object) this, i, (Object) b, 3));
            return;
        }
        Intent a = w8Var.a(bc3, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(bc3.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (Intrinsics.areEqual((Object) "androidx.activity.result.contract.action.REQUEST_PERMISSIONS", (Object) a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            q8.L(bc3, stringArrayExtra, i);
        } else if (Intrinsics.areEqual((Object) "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", (Object) a.getAction())) {
            ui7 ui7 = (ui7) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                bc3.startIntentSenderForResult(ui7.a, i, ui7.b, ui7.c, ui7.o, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new kh1((Object) this, i, (Object) e, 4));
            }
        } else {
            bc3.startActivityForResult(a, i, bundle);
        }
    }
}
