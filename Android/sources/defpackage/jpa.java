package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: jpa  reason: default package */
public final class jpa implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ lpa a;

    public jpa(lpa lpa) {
        this.a = lpa;
    }

    public final void onPushTokenGenerated(String str) {
        lpa lpa = this.a;
        ((xme) lpa.z).setValue(lpa.d());
    }
}
