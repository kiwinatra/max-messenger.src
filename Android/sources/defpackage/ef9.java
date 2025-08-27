package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.LruCache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ef9  reason: default package */
public final class ef9 implements hf9 {
    public final Context a;
    public final m95 b;
    public final String c;
    public final Lazy d;
    public final Lazy e;
    public final jx3 f;
    public final z3a g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final ConcurrentHashMap k;
    public final ThreadLocal l;

    public ef9(Context context, gaf gaf, Lazy lazy, Lazy lazy2, m95 m95) {
        this(context, gaf, lazy, lazy2, m95, 10, 6);
    }

    public static /* synthetic */ void c(ef9 ef9, a32 a32, a89 a89, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        ef9.b(a32, a89, (CharSequence) null, z);
    }

    public final void a(jf9 jf9, gf9 gf9) {
        z68.c(this.c, "invalidate by reason " + gf9, new Object[0]);
        c(this, jf9.a, jf9.b, false, 12);
    }

    public final gs7 b(a32 a32, a89 a89, CharSequence charSequence, boolean z) {
        Lazy lazy;
        a32 a322 = a32;
        a89 a892 = a89;
        ye9 ye9 = new ye9(a322, a892, z);
        for (a89 a893 : ((j2b) ((qgf) this.e.getValue())).a(a892)) {
            if (a893 != a892) {
                c(this, a322, a893, true, 4);
            }
        }
        Lazy lazy2 = this.i;
        gs7 gs7 = (gs7) ((LruCache) lazy2.getValue()).get(ye9);
        Lazy lazy3 = this.d;
        int d2 = ((et0) lazy3.getValue()).d();
        int e2 = ((et0) lazy3.getValue()).e();
        int i2 = d2;
        Lazy lazy4 = LazyKt.lazy(new xe9(this, a32, a89, d2, charSequence, z, 0));
        boolean z2 = false;
        boolean z3 = i2 == e2;
        if (z3) {
            lazy = lazy4;
        } else {
            lazy = lazy4;
            lazy4 = LazyKt.lazy(new xe9(this, a32, a89, e2, charSequence, z, 1));
        }
        if (this.a.getResources().getConfiguration().orientation == 1) {
            z2 = true;
        }
        jx3 jx3 = this.f;
        if (gs7 != null) {
            jf9 jf9 = gs7.b;
            if (z3 || z2) {
                jf9 jf92 = gs7.a;
                jf92.b((Layout) lazy.getValue());
                if (jf92 != jf9) {
                    ev0.v(jx3, (CoroutineContext) null, (f14) null, new ze9(gs7, lazy4, (Continuation) null), 3);
                }
            } else {
                jf9.b((Layout) lazy4.getValue());
                ev0.v(jx3, (CoroutineContext) null, (f14) null, new af9(gs7, lazy, (Continuation) null), 3);
            }
        } else {
            jf9 jf93 = new jf9(a322, a892, this, lazy);
            jf9 jf94 = z3 ? jf93 : new jf9(a322, a892, this, lazy4);
            gs7 = new gs7(jf93, jf94);
            ((LruCache) lazy2.getValue()).put(ye9, gs7);
            if (z3 || z2) {
                jf93.b((Layout) lazy.getValue());
                if (jf93 != jf94) {
                    ev0.v(jx3, (CoroutineContext) null, (f14) null, new bf9(gs7, lazy4, (Continuation) null), 3);
                }
            } else {
                jf94.b((Layout) lazy4.getValue());
                ev0.v(jx3, (CoroutineContext) null, (f14) null, new cf9(gs7, lazy, (Continuation) null), 3);
            }
        }
        return gs7;
    }

    /* JADX WARNING: type inference failed for: r0v83, types: [android.text.BoringLayout] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        r0 = r15.charAt(0);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0305 A[SYNTHETIC, Splitter:B:112:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e7 A[SYNTHETIC, Splitter:B:61:0x01e7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout d(defpackage.a32 r30, defpackage.a89 r31, int r32, java.lang.CharSequence r33, boolean r34) {
        /*
            r29 = this;
            r8 = r29
            r0 = r30
            r9 = r31
            r1 = r33
            r6 = r34
            kotlin.Lazy r2 = r8.e
            java.lang.Object r3 = r2.getValue()
            qgf r3 = (defpackage.qgf) r3
            j2b r3 = (defpackage.j2b) r3
            pgf r3 = r3.c(r0, r9)
            kotlin.Lazy r10 = r8.d
            if (r3 != 0) goto L_0x0038
            pgf r3 = new pgf
            java.lang.Object r4 = r10.getValue()
            et0 r4 = (defpackage.et0) r4
            boolean r5 = r31.f()
            float r12 = r4.a(r5)
            java.lang.CharSequence r13 = r9.c(r0)
            r14 = 1
            r15 = 0
            r16 = 504(0x1f8, float:7.06E-43)
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0038:
            r11 = 0
            if (r1 == 0) goto L_0x0041
            r4 = 501(0x1f5, float:7.02E-43)
            pgf r3 = defpackage.pgf.a(r3, r1, r11, r4)
        L_0x0041:
            java.lang.Object r1 = r2.getValue()
            qgf r1 = (defpackage.qgf) r1
            j2b r1 = (defpackage.j2b) r1
            java.lang.CharSequence r4 = r3.b
            java.lang.CharSequence r1 = r1.d(r4, r6)
            r4 = 509(0x1fd, float:7.13E-43)
            pgf r12 = defpackage.pgf.a(r3, r1, r11, r4)
            boolean r1 = r12.d
            java.lang.CharSequence r15 = r12.b
            if (r1 == 0) goto L_0x00bc
            ye9 r13 = new ye9
            r13.<init>(r0, r9, r6)
            java.util.concurrent.ConcurrentHashMap r14 = r8.k
            boolean r1 = r14.containsKey(r13)
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r14.get(r13)
            mq4 r1 = (defpackage.mq4) r1
            if (r1 == 0) goto L_0x0077
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x0077
            goto L_0x00bc
        L_0x0077:
            java.lang.Object r1 = r14.get(r13)
            mq4 r1 = (defpackage.mq4) r1
            if (r1 == 0) goto L_0x0082
            r1.dispose()
        L_0x0082:
            java.lang.Object r1 = r2.getValue()
            qgf r1 = (defpackage.qgf) r1
            j2b r1 = (defpackage.j2b) r1
            si8 r7 = r1.b(r15)
            pv0 r5 = new pv0
            r16 = 5
            r1 = r5
            r2 = r15
            r3 = r29
            r4 = r30
            r0 = r5
            r5 = r31
            r6 = r34
            r11 = r7
            r7 = r16
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (boolean) r6, (int) r7)
            xv1 r1 = new xv1
            r2 = 29
            r1.<init>((int) r2, (java.lang.Object) r8)
            p00 r2 = new p00
            r3 = 13
            r2.<init>(r3, r8, r13)
            oh8 r3 = new oh8
            r3.<init>(r0, r1, r2)
            r11.a(r3)
            r14.put(r13, r3)
        L_0x00bc:
            if (r15 == 0) goto L_0x00d6
            int r0 = r15.length()
            if (r0 != 0) goto L_0x00c5
            goto L_0x00d6
        L_0x00c5:
            r1 = 0
            char r0 = r15.charAt(r1)
            r1 = 1424(0x590, float:1.995E-42)
            if (r1 > r0) goto L_0x00d6
            r1 = 1792(0x700, float:2.511E-42)
            if (r0 >= r1) goto L_0x00d6
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x00d4:
            r1 = r0
            goto L_0x00d9
        L_0x00d6:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00d4
        L_0x00d9:
            kotlin.Lazy r0 = r8.j
            java.lang.Object r0 = r0.getValue()
            df9 r0 = (defpackage.df9) r0
            java.lang.Object r2 = r10.getValue()
            et0 r2 = (defpackage.et0) r2
            boolean r3 = r31.f()
            int r2 = r2.f(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            float r3 = r12.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            android.text.TextPaint r2 = (android.text.TextPaint) r2
            int r0 = r15.length()
            r3 = 0
            float r0 = r2.measureText(r15, r3, r0)
            int r3 = kotlin.math.MathKt.roundToInt((float) r0)
            int r0 = r12.h
            int r0 = r32 - r0
            int r4 = r12.i
            int r4 = r0 - r4
            java.lang.ThreadLocal r0 = r8.l
            java.lang.Object r5 = r0.get()
            android.text.BoringLayout$Metrics r5 = (android.text.BoringLayout.Metrics) r5
            android.text.BoringLayout$Metrics r5 = android.text.BoringLayout.isBoring(r15, r2, r5)
            r6 = 0
            java.lang.String r7 = r8.c
            if (r5 == 0) goto L_0x0171
            java.lang.Object r5 = r0.get()
            if (r5 == 0) goto L_0x0165
            android.text.BoringLayout$Metrics r5 = (android.text.BoringLayout.Metrics) r5
            int r5 = r5.width
            if (r5 > r4) goto L_0x0171
            ha9 r4 = r9.a
            long r4 = r4.b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "it's boring for #"
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            defpackage.z68.c(r7, r4, new java.lang.Object[0])
            java.lang.Object r0 = r0.get()
            r19 = r0
            android.text.BoringLayout$Metrics r19 = (android.text.BoringLayout.Metrics) r19
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r20 = 0
            r13 = r15
            r14 = r2
            r15 = r3
            r16 = r1
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0162:
            r9 = r0
            goto L_0x034d
        L_0x0165:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0171:
            float r0 = android.text.Layout.getDesiredWidth(r15, r2)     // Catch:{ all -> 0x017a }
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)     // Catch:{ all -> 0x017a }
            goto L_0x018a
        L_0x017a:
            r0 = move-exception
            java.lang.String r5 = "fail to getDesiredWidth for message %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r15}
            defpackage.z68.h(r7, r0, r5, r9)
            m95 r5 = r8.b
            ((defpackage.uta) r5).c(r0, false)
            r0 = 0
        L_0x018a:
            int r0 = java.lang.Math.max(r0, r3)
            r3 = 1
            if (r0 <= r4) goto L_0x0193
            r5 = r4
            goto L_0x019e
        L_0x0193:
            boolean r5 = r12.j
            if (r5 != 0) goto L_0x019d
            r5 = 495(0x1ef, float:6.94E-43)
            pgf r12 = defpackage.pgf.a(r12, r6, r3, r5)
        L_0x019d:
            r5 = r0
        L_0x019e:
            z3a r13 = r8.g     // Catch:{ all -> 0x01bb }
            boolean r0 = r12.c     // Catch:{ all -> 0x01bb }
            android.text.TextUtils$TruncateAt r9 = r12.f     // Catch:{ all -> 0x01bb }
            int r10 = r12.e     // Catch:{ all -> 0x01bb }
            r14 = r15
            r11 = r15
            r15 = r2
            r16 = r5
            r17 = r1
            r18 = r0
            r19 = r9
            r20 = r10
            android.text.StaticLayout r0 = r13.j(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01b9 }
        L_0x01b7:
            r9 = r0
            goto L_0x01e1
        L_0x01b9:
            r0 = move-exception
            goto L_0x01bd
        L_0x01bb:
            r0 = move-exception
            r11 = r15
        L_0x01bd:
            java.lang.String r9 = "static layout create error"
            defpackage.z68.f(r7, r9, r0)
            java.lang.String r22 = r11.toString()
            boolean r0 = r12.c
            android.text.TextUtils$TruncateAt r9 = r12.f
            int r10 = r12.e
            z3a r13 = r8.g
            r21 = r13
            r23 = r2
            r24 = r5
            r25 = r1
            r26 = r0
            r27 = r9
            r28 = r10
            android.text.StaticLayout r0 = r21.j(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01b7
        L_0x01e1:
            int r0 = r9.getLineCount()
            if (r0 <= r3) goto L_0x034d
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x021d }
            int r0 = r9.getLineCount()     // Catch:{ all -> 0x021d }
            r10 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r10, (int) r0)     // Catch:{ all -> 0x021d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x021d }
            boolean r10 = r0.hasNext()     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x022c
            r10 = r0
            kotlin.collections.IntIterator r10 = (kotlin.collections.IntIterator) r10     // Catch:{ all -> 0x021d }
            int r10 = r10.nextInt()     // Catch:{ all -> 0x021d }
            float r10 = r9.getLineMax(r10)     // Catch:{ all -> 0x021d }
        L_0x0207:
            boolean r13 = r0.hasNext()     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x021f
            r13 = r0
            kotlin.collections.IntIterator r13 = (kotlin.collections.IntIterator) r13     // Catch:{ all -> 0x021d }
            int r13 = r13.nextInt()     // Catch:{ all -> 0x021d }
            float r13 = r9.getLineMax(r13)     // Catch:{ all -> 0x021d }
            float r10 = java.lang.Math.max(r10, r13)     // Catch:{ all -> 0x021d }
            goto L_0x0207
        L_0x021d:
            r0 = move-exception
            goto L_0x0232
        L_0x021f:
            int r0 = kotlin.math.MathKt.roundToInt((float) r10)     // Catch:{ all -> 0x021d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021d }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x021d }
            goto L_0x023c
        L_0x022c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x021d }
            r0.<init>()     // Catch:{ all -> 0x021d }
            throw r0     // Catch:{ all -> 0x021d }
        L_0x0232:
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x023c:
            boolean r10 = kotlin.Result.m29isFailureimpl(r0)
            if (r10 == 0) goto L_0x0243
            r0 = r6
        L_0x0243:
            r10 = r0
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0302
            int r0 = r10.intValue()
            if (r0 >= r5) goto L_0x02f4
            z3a r13 = r8.g     // Catch:{ all -> 0x0268 }
            boolean r0 = r12.c     // Catch:{ all -> 0x0268 }
            android.text.TextUtils$TruncateAt r5 = r12.f     // Catch:{ all -> 0x0268 }
            int r9 = r12.e     // Catch:{ all -> 0x0268 }
            r14 = r11
            r15 = r2
            r16 = r4
            r17 = r1
            r18 = r0
            r19 = r5
            r20 = r9
            android.text.StaticLayout r0 = r13.j(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0268 }
        L_0x0266:
            r4 = r0
            goto L_0x028d
        L_0x0268:
            r0 = move-exception
            java.lang.String r5 = "static layout create error 2"
            defpackage.z68.f(r7, r5, r0)
            java.lang.String r22 = r11.toString()
            boolean r0 = r12.c
            android.text.TextUtils$TruncateAt r5 = r12.f
            int r9 = r12.e
            z3a r13 = r8.g
            r21 = r13
            r23 = r2
            r24 = r4
            r25 = r1
            r26 = r0
            r27 = r5
            r28 = r9
            android.text.StaticLayout r0 = r21.j(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0266
        L_0x028d:
            int r0 = r4.getLineCount()
            if (r0 != r3) goto L_0x02f2
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x02c9 }
            int r0 = r4.getLineCount()     // Catch:{ all -> 0x02c9 }
            r3 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r3, (int) r0)     // Catch:{ all -> 0x02c9 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02c9 }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x02c9 }
            if (r3 == 0) goto L_0x02d8
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3     // Catch:{ all -> 0x02c9 }
            int r3 = r3.nextInt()     // Catch:{ all -> 0x02c9 }
            float r3 = r4.getLineMax(r3)     // Catch:{ all -> 0x02c9 }
        L_0x02b3:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x02c9 }
            if (r5 == 0) goto L_0x02cb
            r5 = r0
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5     // Catch:{ all -> 0x02c9 }
            int r5 = r5.nextInt()     // Catch:{ all -> 0x02c9 }
            float r5 = r4.getLineMax(r5)     // Catch:{ all -> 0x02c9 }
            float r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x02c9 }
            goto L_0x02b3
        L_0x02c9:
            r0 = move-exception
            goto L_0x02de
        L_0x02cb:
            int r0 = kotlin.math.MathKt.roundToInt((float) r3)     // Catch:{ all -> 0x02c9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02c9 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x02c9 }
            goto L_0x02e8
        L_0x02d8:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x02c9 }
            r0.<init>()     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02de:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x02e8:
            boolean r3 = kotlin.Result.m29isFailureimpl(r0)
            if (r3 == 0) goto L_0x02ef
            r0 = r6
        L_0x02ef:
            r10 = r0
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x02f2:
            r0 = r4
            goto L_0x0303
        L_0x02f4:
            int r0 = r10.intValue()
            if (r0 < r5) goto L_0x0302
            if (r5 != r4) goto L_0x0302
            java.lang.String r0 = "maxLineWidth more than maxWidth"
            defpackage.z68.p(r7, r0)
            r10 = r6
        L_0x0302:
            r0 = r9
        L_0x0303:
            if (r10 == 0) goto L_0x0162
            z3a r13 = r8.g     // Catch:{ all -> 0x0323 }
            int r0 = r10.intValue()     // Catch:{ all -> 0x0323 }
            int r16 = r0 + 2
            boolean r0 = r12.c     // Catch:{ all -> 0x0323 }
            android.text.TextUtils$TruncateAt r3 = r12.f     // Catch:{ all -> 0x0323 }
            int r4 = r12.e     // Catch:{ all -> 0x0323 }
            r14 = r11
            r15 = r2
            r17 = r1
            r18 = r0
            r19 = r3
            r20 = r4
            android.text.StaticLayout r0 = r13.j(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0323 }
            goto L_0x0162
        L_0x0323:
            r0 = move-exception
            java.lang.String r3 = "static layout create error 3"
            defpackage.z68.f(r7, r3, r0)
            java.lang.String r22 = r11.toString()
            int r0 = r10.intValue()
            int r24 = r0 + 2
            boolean r0 = r12.c
            android.text.TextUtils$TruncateAt r3 = r12.f
            int r4 = r12.e
            z3a r5 = r8.g
            r21 = r5
            r23 = r2
            r25 = r1
            r26 = r0
            r27 = r3
            r28 = r4
            android.text.StaticLayout r0 = r21.j(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0162
        L_0x034d:
            kotlin.Lazy r0 = r8.h     // Catch:{ all -> 0x0364 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0364 }
            at6 r0 = (defpackage.at6) r0     // Catch:{ all -> 0x0364 }
            r0.getClass()     // Catch:{ all -> 0x0364 }
            zs6 r1 = new zs6     // Catch:{ all -> 0x0364 }
            r1.<init>(r9, r0, r6)     // Catch:{ all -> 0x0364 }
            d14 r0 = r0.a     // Catch:{ all -> 0x0364 }
            r2 = 3
            defpackage.ev0.v(r0, r6, r6, r1, r2)     // Catch:{ all -> 0x0364 }
            goto L_0x036a
        L_0x0364:
            r0 = move-exception
            java.lang.String r1 = "could not warm layout"
            defpackage.z68.o(r7, r1, r0)
        L_0x036a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef9.d(a32, a89, int, java.lang.CharSequence, boolean):android.text.Layout");
    }

    public final jf9 e(a32 a32, a89 a89, boolean z, boolean z2) {
        String str = a89.a.y;
        if ((str == null || str.length() == 0) && a89.a.o()) {
            return null;
        }
        ye9 ye9 = new ye9(a32, a89, z2);
        LruCache lruCache = (LruCache) this.i.getValue();
        Object obj = lruCache.get(ye9);
        if (obj == null) {
            obj = b(a32, a89, (CharSequence) null, z2);
            lruCache.put(ye9, obj);
        }
        gs7 gs7 = (gs7) obj;
        return z ? gs7.a : gs7.b;
    }

    public final void f() {
        Lazy lazy = this.i;
        for (Map.Entry entry : ((LruCache) lazy.getValue()).snapshot().entrySet()) {
            ((LruCache) lazy.getValue()).remove((ye9) entry.getKey());
            a(((gs7) entry.getValue()).a, gf9.b);
        }
    }

    public ef9(Context context, gaf gaf, Lazy lazy, Lazy lazy2, m95 m95, int i2, int i3) {
        this.a = context;
        this.b = m95;
        this.c = ef9.class.getName();
        this.d = lazy2;
        this.e = lazy;
        this.f = e14.a(((osa) gaf).a());
        this.g = new z3a(9, m95);
        this.h = LazyKt.lazy(new c28(8, this));
        this.i = LazyKt.lazy(new we9(i2, 0));
        this.j = LazyKt.lazy(new of5(i3, (Object) this, 2));
        this.k = new ConcurrentHashMap();
        this.l = ThreadLocal.withInitial(new vk(1));
    }
}
