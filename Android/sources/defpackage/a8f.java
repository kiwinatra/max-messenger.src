package defpackage;

import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: a8f  reason: default package */
public final /* synthetic */ class a8f implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ f8f b;

    public /* synthetic */ a8f(String str, f8f f8f) {
        this.a = str;
        this.b = f8f;
    }

    public final void onPushTokenGenerated(String str) {
        if (!Intrinsics.areEqual((Object) this.a, (Object) str)) {
            f8f f8f = this.b;
            z68.c(f8f.a, "checkTokenChanged: token changed", new Object[0]);
            ((SystemServicesManager$PushTokenGeneratedListener) f8f.v.getValue()).onPushTokenGenerated(str);
        }
    }
}
