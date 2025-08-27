package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import org.apache.http.HttpStatus;

/* renamed from: j2b  reason: default package */
public final class j2b implements qgf {
    public final Context a;
    public final ltb b;
    public final String c = j2b.class.getName();
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public j2b(Lazy lazy, Context context, ltb ltb, Lazy lazy2) {
        this.a = context;
        this.b = ltb;
        this.d = lazy2;
        this.e = lazy;
        this.f = LazyKt.lazy(new pna(24));
    }

    public final List a(a89 a89) {
        mc9 mc9 = a89.c;
        if (mc9 == null || mc9.a != 1) {
            return CollectionsKt.emptyList();
        }
        a89 a892 = mc9.c;
        if (a892.b() != null) {
            a892 = a892.b();
        }
        return CollectionsKt.listOf(new a89(a892.a, a892.b, a892.c, a892.o, a892.v, a892.w, a892.x, a892.y));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yff, java.lang.Object] */
    public final si8 b(CharSequence charSequence) {
        zff zff = (zff) this.f.getValue();
        zff.getClass();
        bi8 bi8 = new bi8(new z52(11, zff, charSequence));
        ? obj = new Object();
        obj.a = false;
        obj.b = charSequence;
        mka h = lbe.h(obj);
        Iterator it = zff.b.iterator();
        if (!it.hasNext()) {
            return new si8(new wh8(2, new hb3(1, bi8, new tbe(h, new pbb(21, zff, charSequence), 3)), new xff(0)), m58.f, new nqd(25, charSequence), m58.e);
        }
        rae.w(it.next());
        Objects.requireNonNull((Object) null, "transformer is null");
        throw null;
    }

    public final pgf c(a32 a32, a89 a89) {
        boolean z;
        ha9 ha9;
        CharSequence charSequence;
        a32 a322 = a32;
        a89 a892 = a89;
        boolean z2 = a892 instanceof i2b;
        Context context = this.a;
        if (z2) {
            ltb ltb = this.b;
            boolean q = ltb.c.q();
            ha9 ha92 = a892.a;
            String str = ha92.y;
            if (str != null && str.length() != 0 && !ha92.F()) {
                charSequence = a892.c(a322);
            } else if (ha92.w()) {
                if (q) {
                    i10 c2 = ha92.c();
                    String str2 = c2 != null ? c2.f : null;
                    if (!(str2 == null || str2.length() == 0)) {
                        charSequence = ha92.c().f;
                    }
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.ENGLISH;
                String string = context.getString(jad.n);
                long j = ha92.c().c;
                String[] strArr = ghf.c;
                charSequence = String.format(locale, "%s %s", Arrays.copyOf(new Object[]{string, b0h.c(j)}, 2));
            } else {
                if (ha92.A()) {
                    s10 g = ha92.g();
                    if (g != null) {
                        charSequence = g.c;
                    }
                } else if (ha92.y()) {
                    n10 e2 = ha92.e();
                    Class<bl3> cls = bl3.class;
                    vk3 b2 = ((bl3) ((qra) ym.e()).getAccessor().g(cls)).b(e2);
                    int i = qad.q;
                    bl3 bl3 = (bl3) ((qra) ym.e()).getAccessor().g(cls);
                    charSequence = context.getString(i, new Object[]{bs0.H(b2, e2)});
                } else if (ha92.B()) {
                    charSequence = context.getString(jad.y);
                } else if (ha92.x()) {
                    charSequence = ghf.h(this.a, a892.a, false, false, ltb.a.s());
                }
                charSequence = null;
            }
            if (charSequence == null || charSequence.length() == 0) {
                return null;
            }
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            int i2 = 3;
            if (charSequence.length() != 0) {
                if (ha92.w()) {
                    i2 = 1;
                } else if (ha92.y()) {
                    i2 = 2;
                }
                if (charSequence instanceof Spannable) {
                    charSequence = charSequence.subSequence(0, charSequence.length());
                    Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
                    if (spannable != null) {
                        for (Object obj : spannable.getSpans(0, spannable.length(), jf8.class)) {
                            spannable.removeSpan((jf8) obj);
                        }
                    }
                }
            }
            int i3 = i2;
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                return null;
            }
            float f2 = (float) 10;
            return new pgf(TypedValue.applyDimension(2, 14.0f, vo4.c().getDisplayMetrics()), charSequence2, !a89.a().isEmpty(), false, i3, truncateAt, a89, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        }
        String str3 = a892.a.y;
        if (!(str3 == null || str3.length() == 0)) {
            ha9 ha93 = a892.a;
            if (!ha93.F()) {
                gsb gsb = a892.v;
                if (!TextUtils.isEmpty(gsb.c(a322)) && ha93.b() == 0) {
                    float c3 = so4.c(tr2.b.g((uy4) ((rta) this.d.getValue()).a.getValue()), context);
                    gsb.f = a322;
                    yva yva = gsb.a;
                    gsb.j(a322, yva.h(), yva.e());
                    gsb.h(a322);
                    CharSequence charSequence3 = gsb.i;
                    if (charSequence3 == null) {
                        charSequence3 = "";
                    }
                    return new pgf(c3, charSequence3, (!ha93.F() && (TextUtils.isEmpty(gsb.c(a322)) || ha93.b() != 0)) || a892.c != null || (a89.a().isEmpty() ^ true), false, HttpStatus.SC_GATEWAY_TIMEOUT);
                }
                CharSequence c4 = a892.c(a322);
                Spannable p = bk3.p(c4, fu4.k.e(context).f().a().a(a89.f()).b.b, 28);
                Spannable spannable2 = p == null ? c4 : p;
                float a2 = ((et0) this.e.getValue()).a(a89.f());
                a89 b3 = a89.b();
                int i4 = (b3 == null || (ha9 = b3.a) == null) ? ha93.M0 : ha9.M0;
                if (((float) i4) > 100.0f) {
                    a2 *= ((float) Math.min(i4, HttpStatus.SC_MULTIPLE_CHOICES)) / 100.0f;
                    z = false;
                } else {
                    z = true;
                }
                return new pgf(TypedValue.applyDimension(2, ((Number) cvg.b().a.getValue()).floatValue(), vo4.c().getDisplayMetrics()) + a2, spannable2, true, z, 496);
            }
        }
        return null;
    }

    public final CharSequence d(CharSequence charSequence, boolean z) {
        String str = this.c;
        if (!z || !(charSequence instanceof Spannable)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        fld[] fldArr = (fld[]) spannableString.getSpans(0, spannableString.length(), fld.class);
        if (fldArr.length == 0) {
            return charSequence;
        }
        for (fld fld : fldArr) {
            try {
                ForegroundColorSpan foregroundColorSpan = fld.a;
                if (foregroundColorSpan != null) {
                    spannableString.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = fld.b;
                if (backgroundColorSpan != null) {
                    spannableString.removeSpan(backgroundColorSpan);
                }
                spannableString.removeSpan(fld);
                z68.l(str, "reformatText: remove search span", new Object[0]);
            } catch (Throwable unused) {
                z68.p(str, "reformatText: could not remove search spans");
            }
        }
        return spannableString;
    }
}
