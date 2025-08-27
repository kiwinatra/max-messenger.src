package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: a39  reason: default package */
public final class a39 extends kbe {
    /* renamed from: P */
    public final void M(z29 z29) {
        String str;
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(z29.a));
        ol3.setEnabled(z29.X);
        ol3.setName(z29.b);
        ol3.setMessage(z29.o.a(ol3.getContext()));
        ol3.setVerified(z29.x);
        ngf ngf = z29.v0;
        ol3.setAlias(ngf != null ? ngf.a(ol3.getContext()) : null);
        ol3.X();
        ol3.setOnClickListener((View.OnClickListener) null);
        Uri uri = z29.v;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        ol3.Y(z29.a, z29.w, str);
        ol3.setSelectionEnabled(false);
    }
}
