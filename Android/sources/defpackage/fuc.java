package defpackage;

import android.view.View;

/* renamed from: fuc  reason: default package */
public final class fuc extends kbe {
    /* renamed from: P */
    public final void M(cuc cuc) {
        String str = cuc.c;
        View view = this.a;
        ((euc) view).setAvatar(str);
        if (cuc.c == null) {
            ((euc) view).setAbbreviation(new gd0(cuc.o, this.v));
        }
        ((euc) view).setName(cuc.b);
        ((euc) view).setVerified(cuc.w);
        ((euc) view).setOnline(cuc.v);
    }
}
