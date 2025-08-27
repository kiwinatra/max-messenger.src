package defpackage;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* renamed from: wn  reason: default package */
public final /* synthetic */ class wn implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((eo) obj).C();
                return;
            case 1:
                ((gg8) obj).a();
                return;
            case 2:
                ((Function0) obj).invoke();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
