package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: lp3  reason: default package */
public final class lp3 extends kbe {
    /* renamed from: P */
    public final void M(zo3 zo3) {
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(zo3.a));
        ol3.setName(zo3.b);
        ol3.setMessage(zo3.v);
        ol3.setVerified(zo3.z);
        ol3.X();
        String str = null;
        ol3.setOnClickListener((View.OnClickListener) null);
        Uri uri = zo3.x;
        if (uri != null) {
            str = uri.toString();
        }
        ol3.Y(zo3.a, zo3.X, str);
        ol3.setSelectionEnabled(false);
    }
}
