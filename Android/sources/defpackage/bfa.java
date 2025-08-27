package defpackage;

import android.content.Context;

/* renamed from: bfa  reason: default package */
public final class bfa {
    public final yva a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;

    public bfa(yva yva, hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = yva;
        this.b = hs7;
        this.c = hs72;
        this.d = hs73;
    }

    public final lf6 a(Context context, a89 a89, a32 a32) {
        a89 a892 = a89;
        ha9 ha9 = a892.a;
        String str = ha9.y;
        boolean z = ha9.z();
        hs7 hs7 = this.c;
        if (z) {
            hs7 hs72 = this.b;
            boolean K = a32.K();
            vk3 p = ((km3) hs72.get()).p(ha9.w, true);
            long s = ((qjd) ((x23) hs7.get())).s();
            Context context2 = context;
            str = ghf.k(context2, this.a, (km3) hs72.get(), K, a892.a, p, true, true, s).toString();
        } else if (str == null || str.length() == 0) {
            Context context3 = context;
            str = ((ghf) this.d.get()).f(context3, this.a, a892.a, true, false, true, false, ((qjd) ((x23) hs7.get())).s(), true);
        } else {
            this.a.getClass();
            ha9.F();
        }
        if (ha9.q()) {
            str = context.getString(tmc.tt_forwarded_message_patten, new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        return new lf6(str, true);
    }
}
