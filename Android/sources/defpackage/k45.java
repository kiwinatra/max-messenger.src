package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.math.MathKt;

/* renamed from: k45  reason: default package */
public final class k45 implements i25 {
    public final Context a;
    public final Lazy b = LazyKt.lazy(new j45(this, 0));
    public final n35 c;
    public final g6d d;
    public final Lazy e;
    public final Lazy f;

    public k45(Context context, Lazy lazy) {
        this.a = context;
        this.c = new n35(context);
        this.d = new g6d(8);
        this.e = LazyKt.lazy(new j35((Object) this, lazy, 2));
        this.f = LazyKt.lazy(new j45(this, 1));
    }

    public final bs5 a() {
        return ((m35) this.e.getValue()).e;
    }

    public final void b(Activity activity) {
        ((m35) this.e.getValue()).b(activity);
    }

    public final qhe c(String str) {
        z35 a2 = ((v25) this.b.getValue()).a(str, 0, str.length());
        if (a2 == null) {
            return null;
        }
        n35 n35 = this.c;
        n35.getClass();
        return new qhe(a2, MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density), new l15(this.d, n35, (m35) this.e.getValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d(java.lang.CharSequence r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00e0
            int r0 = r13.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00e0
        L_0x000a:
            kotlin.Lazy r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            f35 r12 = (defpackage.f35) r12
            int r0 = r13.length()
            r12.getClass()
            boolean r1 = r13 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x0020
            android.text.Spannable r13 = (android.text.Spannable) r13
            goto L_0x0028
        L_0x0020:
            android.text.Spannable$Factory r1 = android.text.Spannable.Factory.getInstance()
            android.text.Spannable r13 = r1.newSpannable(r13)
        L_0x0028:
            z3a r1 = new z3a
            r1.<init>(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            v25 r12 = r12.a
            r3 = 0
        L_0x0035:
            if (r3 >= r0) goto L_0x00e4
            int r4 = r1.r(r3)
            r5 = 0
            if (r4 >= 0) goto L_0x0040
            r4 = r5
            goto L_0x0046
        L_0x0040:
            java.lang.Object r6 = r1.b
            cge[] r6 = (defpackage.cge[]) r6
            r4 = r6[r4]
        L_0x0046:
            java.lang.String r6 = ", "
            java.lang.String r7 = "Can't subSequence by "
            java.lang.Class<f35> r8 = defpackage.f35.class
            if (r4 != 0) goto L_0x00a7
            int r4 = r1.r(r3)
            r9 = -1
            if (r4 < 0) goto L_0x0066
            java.lang.Object r10 = r1.b
            cge[] r10 = (defpackage.cge[]) r10
            int r11 = kotlin.collections.ArraysKt.getLastIndex((T[]) r10)
            if (r4 > r11) goto L_0x0066
            int r4 = r4 + 1
            r4 = r10[r4]
            int r4 = r4.a
            goto L_0x0067
        L_0x0066:
            r4 = r9
        L_0x0067:
            if (r4 != r9) goto L_0x006a
            r4 = r0
        L_0x006a:
            z35 r4 = r12.a(r13, r3, r4)
            if (r4 == 0) goto L_0x00a4
            int r9 = r4.b()
            int r9 = r9 + r3
            java.lang.CharSequence r10 = r13.subSequence(r3, r9)     // Catch:{ Exception -> 0x0086 }
            kotlin.ranges.IntRange r11 = new kotlin.ranges.IntRange     // Catch:{ Exception -> 0x0086 }
            r11.<init>(r3, r9)     // Catch:{ Exception -> 0x0086 }
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)     // Catch:{ Exception -> 0x0086 }
            r2.add(r10)     // Catch:{ Exception -> 0x0086 }
            goto L_0x009e
        L_0x0086:
            java.lang.String r8 = r8.getName()
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x008f
            goto L_0x009e
        L_0x008f:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x009e
            w78 r11 = defpackage.w78.x
            java.lang.String r6 = defpackage.g63.h(r7, r3, r9, r6)
            r10.d(r11, r8, r6, r5)
        L_0x009e:
            int r4 = r4.b()
            int r3 = r3 + r4
            goto L_0x0035
        L_0x00a4:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x00a7:
            int r3 = r4.a     // Catch:{ Exception -> 0x00c0 }
            int r9 = r4.b     // Catch:{ Exception -> 0x00c0 }
            java.lang.CharSequence r3 = r13.subSequence(r3, r9)     // Catch:{ Exception -> 0x00c0 }
            kotlin.ranges.IntRange r9 = new kotlin.ranges.IntRange     // Catch:{ Exception -> 0x00c0 }
            int r10 = r4.a     // Catch:{ Exception -> 0x00c0 }
            int r11 = r4.b     // Catch:{ Exception -> 0x00c0 }
            r9.<init>(r10, r11)     // Catch:{ Exception -> 0x00c0 }
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r9)     // Catch:{ Exception -> 0x00c0 }
            r2.add(r3)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00dc
        L_0x00c0:
            java.lang.String r3 = r8.getName()
            a67 r8 = defpackage.z68.b
            if (r8 != 0) goto L_0x00c9
            goto L_0x00dc
        L_0x00c9:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00dc
            w78 r9 = defpackage.w78.x
            int r10 = r4.a
            int r11 = r4.b
            java.lang.String r6 = defpackage.g63.h(r7, r10, r11, r6)
            r8.d(r9, r3, r6, r5)
        L_0x00dc:
            int r3 = r4.b
            goto L_0x0035
        L_0x00e0:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00e4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k45.d(java.lang.CharSequence):java.util.List");
    }

    public final Spannable e(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        f35 f35 = (f35) this.f.getValue();
        f35.getClass();
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        z3a z3a = new z3a(newSpannable);
        int i2 = 0;
        while (i2 < length) {
            int r = z3a.r(i2);
            cge[] cgeArr = (cge[]) z3a.b;
            cge cge = r < 0 ? null : cgeArr[r];
            if (cge == null) {
                int r2 = z3a.r(i2);
                int i3 = (r2 < 0 || r2 > ArraysKt.getLastIndex((T[]) cgeArr)) ? -1 : cgeArr[r2 + 1].a;
                if (i3 == -1) {
                    i3 = length;
                }
                z35 a2 = f35.a.a(newSpannable, i2, i3);
                if (a2 != null) {
                    n35 n35 = f35.c;
                    g6d g6d = f35.b;
                    l15 l15 = new l15(g6d, n35, (m35) f35.d.getValue());
                    tb8 tb8 = (tb8) g6d.o;
                    kge kge = (kge) tb8.c(a2);
                    if (kge == null) {
                        kge = new kge(0);
                        tb8.d(a2, kge);
                    }
                    qhe qhe = (qhe) kge.f(i);
                    if (qhe == null) {
                        qhe = new qhe(a2, i, l15);
                        kge.g(i, qhe);
                    }
                    newSpannable.setSpan(new i35(qhe), i2, a2.b() + i2, 33);
                    i2 += a2.b();
                } else {
                    i2++;
                }
            } else {
                i2 = cge.b;
            }
        }
        return newSpannable;
    }
}
