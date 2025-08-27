package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nb3  reason: default package */
public final /* synthetic */ class nb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc3 b;

    public /* synthetic */ nb3(bc3 bc3, int i) {
        this.a = i;
        this.b = bc3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateMenu();
                return;
            default:
                try {
                    nb3.super.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!Intrinsics.areEqual((Object) e.getMessage(), (Object) "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!Intrinsics.areEqual((Object) e2.getMessage(), (Object) "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
