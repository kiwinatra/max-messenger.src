package defpackage;

import android.app.Activity;

/* renamed from: gvb  reason: default package */
public final class gvb extends o45 {
    final /* synthetic */ ivb this$0;

    public gvb(ivb ivb) {
        this.this$0 = ivb;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity activity) {
        ivb ivb = this.this$0;
        int i = ivb.a + 1;
        ivb.a = i;
        if (i == 1 && ivb.o) {
            ivb.w.e(hu7.ON_START);
            ivb.o = false;
        }
    }
}
