package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: dc1  reason: default package */
public final class dc1 extends xag {
    public final String b;
    public final npg c;
    public final qpg o;
    public final lf1 v;
    public volatile Long w;
    public final xme x;
    public final etc y;
    public final s85 z = new s85(0);

    public dc1(boolean z2, Long l, String str, String str2, npg npg, qpg qpg, wp1 wp1, lf1 lf1) {
        this.b = str;
        this.c = npg;
        this.o = qpg;
        this.v = lf1;
        xme a = f6e.a(tb1.j);
        this.x = a;
        this.y = new etc(a);
        bs0.K(new ps5(new dtc(wp1.a), new bc1(this, (Continuation) null), 5), this.a);
        if (!(true ^ (str == null || str.length() == 0))) {
            k();
        } else if (str != null) {
            l(z2, str, str2, l);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void j(long j) {
        int i = (j > ((long) kqa.b) ? 1 : (j == ((long) kqa.b) ? 0 : -1));
        if (i == 0) {
            k();
            return;
        }
        etc etc = this.y;
        CharSequence charSequence = ((tb1) etc.a.getValue()).c;
        s85 s85 = this.z;
        if (charSequence == null) {
            xag.h(s85, new i91(new igf(lqa.i)));
        } else if (j == ((long) kqa.a)) {
            CharSequence charSequence2 = ((tb1) etc.a.getValue()).c;
            if (charSequence2 != null) {
                xag.h(s85, new f91(charSequence2));
            }
        } else if (j == ((long) kqa.c)) {
            xag.h(s85, new g91(charSequence));
        } else if (j == ((long) kqa.d)) {
            xag.h(s85, new h91(charSequence));
        } else if (j == ((long) kqa.e)) {
            this.v.i(charSequence.toString(), !((tb1) etc.a.getValue()).i, false, ((tb1) etc.a.getValue()).i, new s2(10, (Object) this, (Object) charSequence));
        } else if (i == 0) {
            k();
        }
    }

    public final void k() {
        if (((tb1) this.y.a.getValue()).c == null && this.w == null) {
            ev0.v(this.a, (CoroutineContext) null, (f14) null, new cc1(this, (Continuation) null), 3);
            return;
        }
        String name = dc1.class.getName();
        boolean z2 = ((tb1) this.y.a.getValue()).c != null;
        Long l = this.w;
        z68.p(name, "Skip creating call link: callLink=" + z2 + " createJoinLinkRequestId=" + l);
    }

    public final void l(boolean z2, CharSequence charSequence, String str, Long l) {
        xme xme;
        Object value;
        tb1 tb1;
        gd0 gd0;
        ngf mgf;
        String J;
        rb1 rb1;
        boolean z3;
        String str2 = str;
        do {
            xme = this.x;
            value = xme.getValue();
            tb1 = (tb1) value;
            gd0 = null;
            String str3 = z2 ^ true ? str2 : null;
            npg npg = this.c;
            npg.getClass();
            Context context = (Context) npg.b;
            if (l != null) {
                long longValue = l.longValue();
                if (str3 == null) {
                    str3 = "";
                }
                gd0 = new gd0(String.valueOf(new mgf(str3).a(context)), longValue);
            }
            mgf = str2 != null ? new mgf(str2) : new igf(lqa.g);
            J = f6e.J(charSequence.toString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f6e.J(charSequence.toString()));
            z3 = false;
            spannableStringBuilder.setSpan(new aif(fu4.k.e(context).f(), new m91(npg, 1)), 0, spannableStringBuilder.length(), 17);
            rb1 = new rb1(new mgf(spannableStringBuilder));
            if (this.b == null) {
                z3 = true;
            }
        } while (!xme.b(value, tb1.a(tb1, gd0, J, rb1, mgf, z3, 225)));
    }
}
