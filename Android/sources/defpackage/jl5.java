package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: jl5  reason: default package */
public final /* synthetic */ class jl5 implements qk3, nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll5 b;

    public /* synthetic */ jl5(ll5 ll5, int i) {
        this.a = i;
        this.b = ll5;
    }

    public void accept(Object obj) {
        ll5 ll5 = this.b;
        switch (this.a) {
            case 0:
                l20 l20 = (l20) obj;
                if (ll5.f()) {
                    ((w57) ll5.o).F0((int) l20.p);
                    return;
                }
                return;
            case 1:
                gdb gdb = (gdb) obj;
                if (!cvg.A(ll5.X)) {
                    String[] strArr = gdb.b;
                    String[] n = n54.n();
                    int length = n.length;
                    int i = 0;
                    while (i < length) {
                        if (n54.U(strArr, gdb.c, n[i])) {
                            i++;
                        }
                    }
                    ll5.S(ll5.X, ll5.Y);
                    return;
                }
                ll5.X = null;
                ll5.Y = false;
                ll5.Z = null;
                ll5.w0 = false;
                ll5.v0 = 0;
                return;
            default:
                l20 l202 = (l20) obj;
                if (ll5.f()) {
                    ((w57) ll5.o).n0();
                    if (scf.f(l202.j.c, false)) {
                        ll5.v.e("ACTION_THEME_SHARE_EXTERNAL");
                    }
                    po5 po5 = ll5.x;
                    File h = po5.h(l202);
                    Context O1 = ((FrgBase) ll5.c).O1();
                    if (O1 != null) {
                        ArrayList arrayList = gsg.j;
                        try {
                            Uri f = po5.f(O1, h);
                            hr6 hr6 = new hr6(O1);
                            ((Intent) hr6.b).setType("*/*");
                            hr6.t(f);
                            hr6.u((CharSequence) null);
                            hr6.w();
                            return;
                        } catch (Exception e) {
                            z68.f("gsg", "shareFile error", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean test(Object obj) {
        a89 a89 = (a89) obj;
        ll5 ll5 = this.b;
        ll5.getClass();
        ha9 ha9 = a89.a;
        return ha9.b == ll5.z && ha9.o() && a89.a.g() != null;
    }
}
