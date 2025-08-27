package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: ihb  reason: default package */
public final class ihb extends kbe {
    /* renamed from: P */
    public final void M(hhb hhb) {
        String str;
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(hhb.X));
        ol3.setName(hhb.c);
        ngf ngf = hhb.o;
        ol3.setMessage(ngf != null ? ngf.a(ol3.getContext()) : null);
        ol3.setOnClickListener((View.OnClickListener) null);
        Uri uri = hhb.v;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        ol3.Y(hhb.b, hhb.z, str);
        ol3.setVerified(hhb.x);
    }
}
