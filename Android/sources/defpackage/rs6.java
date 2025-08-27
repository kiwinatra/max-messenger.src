package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: rs6  reason: default package */
public final class rs6 extends kbe {
    /* renamed from: P */
    public final void M(qs6 qs6) {
        String str;
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(qs6.X));
        isb isb = qs6.c;
        boolean W = ol3.W(isb.a.toString());
        CharSequence charSequence = isb.a;
        List list = qs6.x;
        if (W) {
            charSequence = n54.S(charSequence, list, isb.b);
        }
        ol3.setName(charSequence);
        isb isb2 = qs6.o;
        boolean V = ol3.V(isb2.a.toString());
        CharSequence charSequence2 = isb2.a;
        if (V) {
            charSequence2 = n54.S(charSequence2, list, isb2.b);
        }
        ol3.setMessage(charSequence2);
        Uri uri = qs6.v;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        ol3.Y(qs6.a, qs6.b, str);
    }
}
