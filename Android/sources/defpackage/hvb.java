package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: hvb  reason: default package */
public final class hvb extends o45 {
    final /* synthetic */ ivb this$0;

    public hvb(ivb ivb) {
        this.this$0 = ivb;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
        ivb ivb = this.this$0;
        int i = ivb.b - 1;
        ivb.b = i;
        if (i == 0) {
            ivb.v.postDelayed(ivb.x, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        fvb.a(activity, new gvb(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        ivb ivb = this.this$0;
        int i = ivb.a - 1;
        ivb.a = i;
        if (i == 0 && ivb.c) {
            ivb.w.e(hu7.ON_STOP);
            ivb.o = true;
        }
    }
}
