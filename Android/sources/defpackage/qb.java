package defpackage;

import android.view.View;

/* renamed from: qb  reason: default package */
public final class qb extends kbe {
    /* renamed from: P */
    public final void M(bb bbVar) {
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(bbVar.x));
        ol3.setName(bbVar.b);
        ngf ngf = bbVar.c;
        ol3.setMessage(ngf != null ? ngf.a(ol3.getContext()) : null);
        ol3.X();
        ol3.setOnClickListener((View.OnClickListener) null);
        ol3.setVerified(bbVar.w);
        ol3.Y(bbVar.a, bbVar.v, bbVar.o);
        ol3.setSelectionEnabled(false);
    }
}
