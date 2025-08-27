package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: vb2  reason: default package */
public final class vb2 implements fq2, luf {
    public final Context a;
    public final Function0 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l = LazyKt.lazy(new nb2(this, 3));
    public final Lazy m = LazyKt.lazy(new nb2(this, 5));
    public final Lazy n = LazyKt.lazy(new nb2(this, 6));
    public final Lazy o = LazyKt.lazy(new nb2(this, 7));
    public final Lazy p = LazyKt.lazy(new nb2(this, 8));
    public final Lazy q = LazyKt.lazy(new nb2(this, 9));
    public final Lazy r = LazyKt.lazy(new nb2(this, 10));
    public final Lazy s = LazyKt.lazy(new nb2(this, 0));
    public final Lazy t = LazyKt.lazy(new nb2(this, 1));
    public final Lazy u = LazyKt.lazy(new nb2(this, 2));
    public final Lazy v = LazyKt.lazy(new nb2(this, 4));
    public final sb2 w = new sb2(this);
    public final String x = vb2.class.getName();
    public final ub2 y;

    public vb2(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, gaf gaf, Lazy lazy9, us2 us2) {
        this.a = context;
        this.b = us2;
        this.c = lazy3;
        this.d = lazy;
        this.e = lazy2;
        this.f = lazy5;
        this.g = lazy4;
        this.h = lazy7;
        this.i = lazy9;
        this.j = lazy6;
        this.k = lazy8;
        this.y = new ub2(lazy3, lazy, this);
        context.registerComponentCallbacks(new ob2(0, (Object) this));
        bs0.K(new ps5((etc) fu4.k.e(context).j, new tb2(this, (Continuation) null), 5), e14.a(((osa) gaf).a()));
    }

    public final boolean a(a32 a32, qb2 qb2, a89 a89, SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (qb2 != qb2.a && !z && !a89.a.z()) {
            js9 js9 = fu4.k;
            Context context = this.a;
            vk3 vk3 = a89.b;
            if (vk3 == null || vk3.r() != ((Number) this.b.invoke()).longValue()) {
                if (a32.L()) {
                    eoa eoa = new eoa(context, goa.a);
                    String t2 = vk3.t(kl0.a);
                    if (t2 != null) {
                        try {
                            eoa.c(t2);
                        } catch (Throwable th) {
                            z68.f(this.x, "fail to set avatar url", th);
                            ((e24) this.i.getValue()).a("ONEME-4183", th);
                            eoa.b(new gd0(vk3.q(), vk3.r()));
                        }
                    } else {
                        eoa.b(new gd0(vk3.q(), vk3.r()));
                    }
                    j4b.a(spannableStringBuilder, 8203, new bq5((Drawable) eoa, (vp5) null, 6));
                    spannableStringBuilder.append(8288);
                    j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)));
                    spannableStringBuilder.append(8288);
                    j4b.b(spannableStringBuilder, String.valueOf(vk3.f()), new aif(js9.e(context).f(), new gl1(7)));
                    spannableStringBuilder.append(8288);
                    if (vk3.z()) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(new n2g(context, m2g.SMALL, true, new gl1(8)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(8288);
                    }
                    j4b.b(spannableStringBuilder, ":", new aif(js9.e(context).f(), new gl1(9)));
                    spannableStringBuilder.append(8288);
                    j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)));
                    return true;
                }
            } else if (a32.L()) {
                j4b.b(spannableStringBuilder, tr1.j(context.getString(jad.H), ":"), new aif(js9.e(context).f(), new gl1(11)));
                spannableStringBuilder.append(8288);
                j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
                return true;
            }
        }
        return false;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, a89 a89, boolean z) {
        Sequence sequence;
        List list;
        Sequence asSequence;
        Sequence mapNotNull;
        Drawable drawable;
        l10 d2;
        l10 d3;
        ha9 ha9 = a89.a;
        List list2 = null;
        if (ha9 == null) {
            z68.f(this.x, "Empty MessageDb while process message", (Throwable) null);
            sequence = SequencesKt.emptySequence();
        } else if (ha9.q()) {
            sequence = SequencesKt.sequenceOf((Drawable) this.l.getValue());
        } else if (ha9.y()) {
            sequence = SequencesKt.sequenceOf((Drawable) this.m.getValue());
        } else if (ha9.A()) {
            sequence = SequencesKt.sequenceOf((Drawable) this.n.getValue());
        } else if (ha9.w()) {
            sequence = SequencesKt.sequenceOf((Drawable) this.o.getValue());
        } else if (ha9.B()) {
            sequence = SequencesKt.sequenceOf((Drawable) this.p.getValue());
        } else if (ha9.x()) {
            l10 d4 = ha9.d();
            if (d4 == null || !d4.e() || (d3 = ha9.d()) == null || !d3.b()) {
                l10 d5 = ha9.d();
                if (d5 == null || !d5.e()) {
                    l10 d6 = ha9.d();
                    if (d6 == null || d6.e() || (d2 = ha9.d()) == null || !d2.b()) {
                        l10 d7 = ha9.d();
                        Lazy lazy = this.q;
                        drawable = (d7 == null || d7.e()) ? (Drawable) lazy.getValue() : (Drawable) lazy.getValue();
                    } else {
                        drawable = (Drawable) this.s.getValue();
                    }
                } else {
                    drawable = (Drawable) this.r.getValue();
                }
            } else {
                drawable = (Drawable) this.t.getValue();
            }
            sequence = SequencesKt.sequenceOf(drawable);
        } else {
            w28 w28 = ha9.x0;
            sequence = (w28 == null || (list = (List) w28.b) == null || (asSequence = CollectionsKt.asSequence(list)) == null || (mapNotNull = SequencesKt.mapNotNull(asSequence, new wk(3, this, a89))) == null) ? null : SequencesKt.take(mapNotNull, 3);
            if (sequence == null) {
                sequence = SequencesKt.emptySequence();
            }
        }
        List list3 = SequencesKt.toList(sequence);
        if (!list3.isEmpty()) {
            list2 = list3;
        }
        if (list2 != null) {
            if (!z) {
                j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
            }
            int i2 = 0;
            for (Object next : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                j4b.a(spannableStringBuilder, 8203, new bq5((Drawable) next, vp5.a, 4));
                spannableStringBuilder.append(8288);
                if (i2 < list2.size() - 1) {
                    j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)));
                    spannableStringBuilder.append(8288);
                }
                i2 = i3;
            }
            j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)));
            spannableStringBuilder.append(8288);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: gge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: gge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: gge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: gge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: gge} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.a32 r17, defpackage.qb2 r18, defpackage.a89 r19, android.text.SpannableStringBuilder r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 1
            ha9 r7 = r3.a
            r6 = 0
            if (r7 != 0) goto L_0x001b
            java.lang.String r0 = r0.x
            java.lang.String r1 = "Empty MessageDb while process message"
            defpackage.z68.f(r0, r1, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x01cc
        L_0x001b:
            boolean r8 = r7.F()
            if (r8 == 0) goto L_0x0053
            kotlin.Lazy r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            ghf r5 = (defpackage.ghf) r5
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            yva r7 = (defpackage.yva) r7
            ha9 r8 = r3.a
            kotlin.jvm.functions.Function0 r1 = r0.b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r13 = r1.longValue()
            android.content.Context r6 = r0.a
            r10 = 1
            r15 = 0
            r9 = 0
            r11 = 1
            r12 = 0
            java.lang.String r0 = r5.f(r6, r7, r8, r9, r10, r11, r12, r13, r15)
            if (r0 == 0) goto L_0x01cc
            r4.append(r0)
            goto L_0x01cc
        L_0x0053:
            boolean r8 = r7.y()
            r9 = 0
            if (r8 == 0) goto L_0x0071
            android.content.Context r1 = r0.a
            n10 r2 = r7.e()
            kotlin.Lazy r0 = r0.h
            java.lang.Object r0 = r0.getValue()
            bl3 r0 = (defpackage.bl3) r0
            java.lang.String r0 = defpackage.ghf.j(r1, r2, r0, r9, r9)
            r4.append(r0)
            goto L_0x01cc
        L_0x0071:
            boolean r8 = r7.E()
            if (r8 == 0) goto L_0x00cd
            gsb r0 = r3.v
            r0.f = r1
            yva r2 = r0.a
            int r3 = r2.h()
            int r2 = r2.e()
            r0.j(r1, r3, r2)
            java.lang.CharSequence r0 = r0.g
            if (r0 == 0) goto L_0x00c6
            int r1 = defpackage.gge.a
            gge r0 = defpackage.sq6.A(r0, r5)
            int r1 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r1 = r6
        L_0x009e:
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            if (r1 == 0) goto L_0x00ad
            int r2 = r1.length
            r3 = r9
        L_0x00a4:
            if (r3 >= r2) goto L_0x00ad
            r7 = r1[r3]
            r0.removeSpan(r7)
            int r3 = r3 + r5
            goto L_0x00a4
        L_0x00ad:
            int r1 = r0.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x00c5
            int r1 = r6.length
        L_0x00bc:
            if (r9 >= r1) goto L_0x00c5
            r2 = r6[r9]
            r0.removeSpan(r2)
            int r9 = r9 + r5
            goto L_0x00bc
        L_0x00c5:
            r6 = r0
        L_0x00c6:
            if (r6 == 0) goto L_0x01cc
            r4.append(r6)
            goto L_0x01cc
        L_0x00cd:
            boolean r8 = r7.z()
            if (r8 == 0) goto L_0x0124
            q10 r8 = r7.f()
            if (r8 == 0) goto L_0x00dc
            p10 r8 = r8.a
            goto L_0x00dd
        L_0x00dc:
            r8 = r6
        L_0x00dd:
            p10 r10 = defpackage.p10.X
            if (r8 != r10) goto L_0x0124
            if (r21 != 0) goto L_0x0107
            bge r2 = new bge
            r5 = 6
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r2.<init>(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r5 = 8203(0x200b, float:1.1495E-41)
            defpackage.j4b.a(r4, r5, r2)
            r2 = 8288(0x2060, float:1.1614E-41)
            r4.append(r2)
        L_0x0107:
            android.content.Context r2 = r0.a
            int r5 = defpackage.ead.l0
            java.lang.String r2 = r2.getString(r5)
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            a89 r2 = r3.o
            qb2 r3 = defpackage.qb2.a
            android.text.SpannableString r0 = r0.d(r1, r2, r3, false)
            r4.append(r0)
            goto L_0x01cc
        L_0x0124:
            boolean r8 = r7.x()
            if (r8 == 0) goto L_0x0143
            android.content.Context r6 = r0.a
            kotlin.jvm.functions.Function0 r0 = r0.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            r8 = 0
            r9 = 1
            java.lang.String r0 = defpackage.ghf.h(r6, r7, r8, r9, r10)
            r4.append(r0)
            goto L_0x01cc
        L_0x0143:
            boolean r7 = r7.q()
            if (r7 == 0) goto L_0x0166
            a89 r7 = r19.b()
            if (r7 == 0) goto L_0x0166
            a89 r3 = r19.b()
        L_0x0153:
            a89 r6 = r3.b()
            if (r6 == 0) goto L_0x015e
            a89 r3 = r3.b()
            goto L_0x0153
        L_0x015e:
            android.text.SpannableString r0 = r0.d(r1, r3, r2, r5)
            r4.append(r0)
            goto L_0x01cc
        L_0x0166:
            qb2 r0 = defpackage.qb2.b
            if (r2 != r0) goto L_0x0183
            r17.k0()
            java.lang.CharSequence r0 = r1.Y
            if (r0 == 0) goto L_0x0177
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0178
        L_0x0177:
            r9 = r5
        L_0x0178:
            r1 = r9 ^ 1
            if (r1 == 0) goto L_0x017d
            r6 = r0
        L_0x017d:
            if (r6 == 0) goto L_0x01cc
            r4.append(r6)
            goto L_0x01cc
        L_0x0183:
            qb2 r0 = defpackage.qb2.a
            if (r2 != r0) goto L_0x01ca
            ogf r0 = defpackage.puf.l
            r0.getClass()
            uy4 r2 = defpackage.uy4.b
            long r6 = r0.g(r2)
            float r0 = defpackage.so4.e(r6)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = (int) r0
            gsb r2 = r3.v
            r2.f = r1
            boolean r3 = r2.q
            if (r3 != 0) goto L_0x01c2
            ha9 r3 = r2.d
            java.lang.String r1 = r2.a(r1, r3)
            yva r6 = r2.a
            u25 r7 = r6.k
            java.lang.CharSequence r1 = r7.e(r1, r0)
            java.util.List r3 = r3.P0
            java.lang.CharSequence r0 = r6.l(r0, r1, r3)
            r2.j = r0
            r2.q = r5
        L_0x01c2:
            java.lang.CharSequence r0 = r2.j
            if (r0 == 0) goto L_0x01cc
            r4.append(r0)
            goto L_0x01cc
        L_0x01ca:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb2.c(a32, qb2, a89, android.text.SpannableStringBuilder, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b A[LOOP:0: B:17:0x0069->B:18:0x006b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString d(defpackage.a32 r10, defpackage.a89 r11, defpackage.qb2 r12, boolean r13) {
        /*
            r9 = this;
            r0 = 1
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r8 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x001e }
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r11
            r5 = r7
            r6 = r13
            boolean r13 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x001e }
            if (r13 != 0) goto L_0x0020
            int r13 = r7.length()     // Catch:{ all -> 0x001e }
            if (r13 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r6 = r8
            goto L_0x0021
        L_0x001e:
            r10 = move-exception
            goto L_0x0033
        L_0x0020:
            r6 = r0
        L_0x0021:
            r9.b(r7, r11, r6)     // Catch:{ all -> 0x001e }
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r11
            r5 = r7
            r1.c(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x001e }
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001e }
            java.lang.Object r10 = kotlin.Result.m23constructorimpl(r10)     // Catch:{ all -> 0x001e }
            goto L_0x003d
        L_0x0033:
            kotlin.Result$Companion r11 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m23constructorimpl(r10)
        L_0x003d:
            java.lang.Throwable r10 = kotlin.Result.m26exceptionOrNullimpl(r10)
            if (r10 == 0) goto L_0x005c
            java.lang.String r11 = r9.x
            java.lang.String r12 = "FAILURE process last message for chatRow"
            defpackage.z68.f(r11, r12, r10)
            kotlin.Lazy r9 = r9.i
            java.lang.Object r9 = r9.getValue()
            e24 r9 = (defpackage.e24) r9
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r12, r10)
            java.lang.String r10 = "ONEME-16071"
            r9.a(r10, r11)
        L_0x005c:
            android.text.SpannableString r9 = new android.text.SpannableString
            int r10 = r7.length()
            java.lang.Class<jf8> r11 = defpackage.jf8.class
            java.lang.Object[] r10 = r7.getSpans(r8, r10, r11)
            int r11 = r10.length
        L_0x0069:
            if (r8 >= r11) goto L_0x0074
            r12 = r10[r8]
            jf8 r12 = (defpackage.jf8) r12
            r7.removeSpan(r12)
            int r8 = r8 + r0
            goto L_0x0069
        L_0x0074:
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb2.d(a32, a89, qb2, boolean):android.text.SpannableString");
    }

    public final CharSequence f(long j2) {
        iz9 iz9;
        Map a2 = ((ne7) this.c.getValue()).a(j2);
        if (a2 == null) {
            return null;
        }
        if (a2.isEmpty()) {
            iz9 = ua8.a;
        } else {
            iz9 iz92 = new iz9(a2.size());
            for (Map.Entry entry : a2.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                Object value = entry.getValue();
                int b2 = iz92.b(longValue);
                Object[] objArr = iz92.c;
                Object obj = objArr[b2];
                iz92.b[b2] = longValue;
                objArr[b2] = value;
            }
            iz9 = iz92;
        }
        if (iz9 == null) {
            return null;
        }
        return (CharSequence) this.y.c(new rb2(j2, iz9));
    }
}
