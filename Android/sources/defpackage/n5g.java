package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Lazy;

/* renamed from: n5g  reason: default package */
public final class n5g {
    public final Context a;
    public final Lazy b;
    public final x23 c;
    public final rl d;
    public final ln5 e;
    public final i4g f;
    public final String g = n5g.class.getName();
    public final jx3 h;

    public n5g(Context context, Lazy lazy, x23 x23, rl rlVar, ln5 ln5, i4g i4g, gaf gaf) {
        this.a = context;
        this.b = lazy;
        this.c = x23;
        this.d = rlVar;
        this.e = ln5;
        this.f = i4g;
        this.h = e14.a(((osa) gaf).b().plus(kr7.b()).plus(new m5g(this)));
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [no5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [hj7, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2 A[SYNTHETIC, Splitter:B:43:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.l20 r13, long r14, long r16, kotlin.coroutines.Continuation r18) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r2 = r18
            boolean r3 = r2 instanceof defpackage.i5g
            if (r3 == 0) goto L_0x0017
            r3 = r2
            i5g r3 = (defpackage.i5g) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.v = r4
            goto L_0x001c
        L_0x0017:
            i5g r3 = new i5g
            r3.<init>(r12, r2)
        L_0x001c:
            java.lang.Object r2 = r3.c
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.v
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 != r7) goto L_0x003b
            k20 r1 = r3.b
            n5g r3 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ Exception -> 0x0036 }
            r0 = r2
            r2 = r1
            r1 = r3
            goto L_0x0119
        L_0x0036:
            r0 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x013b
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r2)
            boolean r2 = defpackage.ld8.Y(r13)
            if (r2 == 0) goto L_0x0053
            s10 r2 = r0.j
            l20 r2 = r2.d
            k20 r2 = r2.d
            goto L_0x0055
        L_0x0053:
            k20 r2 = r0.d
        L_0x0055:
            boolean r5 = r13.i()
            boolean r8 = defpackage.ld8.Y(r13)
            java.lang.String r9 = r1.g
            if (r5 != 0) goto L_0x006b
            if (r8 != 0) goto L_0x006b
            java.lang.String r0 = "Fetch video. Build fetcher: can't fetch because don't have video"
            defpackage.z68.p(r9, r0)
        L_0x0068:
            r0 = r6
            goto L_0x00da
        L_0x006b:
            java.lang.String r10 = r12.c(r13)
            if (r10 == 0) goto L_0x0080
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            g58 r0 = new g58
            android.content.Context r5 = r1.a
            r0.<init>(r5, r10)
            goto L_0x00da
        L_0x0080:
            if (r5 == 0) goto L_0x00b4
            k20 r5 = r0.d
            java.lang.String r10 = r5.g
            if (r10 == 0) goto L_0x008e
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00b4
        L_0x008e:
            java.lang.String r0 = "Fetch video. Build fetcher: internal video"
            defpackage.z68.c(r9, r0, new java.lang.Object[0])
            hj7 r0 = new hj7
            long r10 = r5.a
            java.lang.String r5 = r5.l
            rl r8 = r1.d
            r0.<init>()
            r0.o = r8
            r0.a = r10
            r10 = r14
            r0.b = r10
            r10 = r16
            r0.c = r10
            r0.v = r5
            java.lang.Class<hj7> r5 = defpackage.hj7.class
            java.lang.String r5 = r5.getName()
            r0.w = r5
            goto L_0x00da
        L_0x00b4:
            if (r8 == 0) goto L_0x00d4
            java.lang.String r5 = "Fetch video. Build fetcher: video file"
            defpackage.z68.c(r9, r5, new java.lang.Object[0])
            no5 r5 = new no5
            s10 r0 = r0.j
            long r10 = r0.a
            rl r0 = r1.d
            r5.<init>()
            r5.b = r0
            r5.a = r10
            java.lang.Class<no5> r0 = defpackage.no5.class
            java.lang.String r0 = r0.getName()
            r5.c = r0
            r0 = r5
            goto L_0x00da
        L_0x00d4:
            java.lang.String r0 = "Fetch video. Build fetcher: unknown type! null"
            defpackage.z68.p(r9, r0)
            goto L_0x0068
        L_0x00da:
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "Fetch video. Fetcher is null"
            defpackage.z68.c(r9, r0, new java.lang.Object[0])
            return r6
        L_0x00e2:
            j5g r5 = new j5g     // Catch:{ Exception -> 0x013a }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x013a }
            sbd r0 = new sbd     // Catch:{ Exception -> 0x013a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x013a }
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.SECONDS     // Catch:{ Exception -> 0x013a }
            r8 = 30
            long r8 = kotlin.time.DurationKt.toDuration((long) r8, (kotlin.time.DurationUnit) r5)     // Catch:{ Exception -> 0x013a }
            st5 r5 = new st5     // Catch:{ Exception -> 0x013a }
            r5.<init>(r8, r0, r6)     // Catch:{ Exception -> 0x013a }
            fs5 r0 = new fs5     // Catch:{ Exception -> 0x013a }
            r8 = 0
            r0.<init>(r8, r5)     // Catch:{ Exception -> 0x013a }
            sf2 r5 = new sf2     // Catch:{ Exception -> 0x013a }
            r8 = 1
            r5.<init>(r12, r6, r8)     // Catch:{ Exception -> 0x013a }
            wb r8 = new wb     // Catch:{ Exception -> 0x013a }
            r9 = 16
            r8.<init>(r9, r0, r5)     // Catch:{ Exception -> 0x013a }
            r3.a = r1     // Catch:{ Exception -> 0x013a }
            r3.b = r2     // Catch:{ Exception -> 0x013a }
            r3.v = r7     // Catch:{ Exception -> 0x013a }
            java.lang.Object r0 = defpackage.bs0.z(r8, r3)     // Catch:{ Exception -> 0x013a }
            if (r0 != r4) goto L_0x0119
            return r4
        L_0x0119:
            kk5 r0 = (defpackage.kk5) r0     // Catch:{ Exception -> 0x013a }
            kotlin.Lazy r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            nd r1 = (defpackage.nd) r1
            java.lang.String r3 = r2.h
            java.lang.String r4 = "ACTION_VIDEO_FETCH_OK"
            if (r3 == 0) goto L_0x0136
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0130
            goto L_0x0136
        L_0x0130:
            java.lang.String r2 = r2.h
            r1.f(r4, r2)
            goto L_0x0139
        L_0x0136:
            r1.e(r4)
        L_0x0139:
            return r0
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            boolean r3 = r0 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x014d
            r3 = r0
            ru.ok.tamtam.errors.TamErrorException r3 = (ru.ok.tamtam.errors.TamErrorException) r3
            qaf r3 = r3.a
            java.lang.String r3 = r3.b
            boolean r3 = defpackage.m58.A(r3)
            if (r3 == 0) goto L_0x014d
            return r6
        L_0x014d:
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x0183
            java.lang.String r3 = r1.g
            java.lang.String r4 = r2.g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Fetch video. Failed to fetch "
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.z68.f(r3, r4, r0)
            kotlin.Lazy r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            nd r0 = (defpackage.nd) r0
            java.lang.String r1 = "ACTION_VIDEO_FETCH_FAILURE"
            java.lang.String r2 = r2.h
            if (r2 == 0) goto L_0x017f
            int r3 = r2.length()
            if (r3 != 0) goto L_0x017b
            goto L_0x017f
        L_0x017b:
            r0.f(r1, r2)
            goto L_0x0182
        L_0x017f:
            r0.e(r1)
        L_0x0182:
            return r6
        L_0x0183:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5g.a(l20, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, g4g] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r12v7, types: [xu9] */
    /* JADX WARNING: type inference failed for: r12v8, types: [l27] */
    /* JADX WARNING: type inference failed for: r12v9, types: [s64] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.l20 r26, long r27, long r29, kotlin.coroutines.Continuation r31) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof defpackage.l5g
            if (r1 == 0) goto L_0x001a
            r1 = r0
            l5g r1 = (defpackage.l5g) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.w = r2
        L_0x0018:
            r6 = r1
            goto L_0x0020
        L_0x001a:
            l5g r1 = new l5g
            r1.<init>(r7, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r6.o
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.w
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r11) goto L_0x0039
            k20 r1 = r6.c
            l20 r2 = r6.b
            n5g r3 = r6.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00d7
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = r7.g
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x004f
        L_0x004a:
            r12 = r27
            r4 = r29
            goto L_0x006d
        L_0x004f:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x004a
            w78 r2 = defpackage.w78.o
            java.lang.String r3 = "Fetch video. Start fetch, getVideoContent chatServerId="
            java.lang.String r4 = ", messageServerId="
            r12 = r27
            java.lang.StringBuilder r3 = defpackage.tr1.n(r12, r3, r4)
            r4 = r29
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r10)
        L_0x006d:
            boolean r0 = defpackage.ld8.Y(r26)
            if (r0 == 0) goto L_0x007b
            s10 r0 = r8.j
            l20 r0 = r0.d
            k20 r0 = r0.d
        L_0x0079:
            r14 = r0
            goto L_0x007e
        L_0x007b:
            k20 r0 = r8.d
            goto L_0x0079
        L_0x007e:
            java.lang.String r0 = r14.g
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0228
            boolean r0 = r14.f
            if (r0 == 0) goto L_0x00a0
            long r0 = r14.j
            x23 r2 = r7.c
            qjd r2 = (defpackage.qjd) r2
            long r2 = r2.m()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            java.lang.String r0 = r7.g
            java.lang.String r1 = "Fetch video. Live stream not started"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            return r10
        L_0x00a0:
            java.lang.String r0 = r25.c(r26)
            java.lang.String r1 = r7.g
            java.lang.String r2 = "Fetch video. Check local path, getVideoContent: local path = %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.z68.c(r1, r2, r0)
            i4g r0 = r7.f
            java.lang.String r1 = r8.q
            r0.getClass()
            g4g r0 = defpackage.i4g.a(r1)
            if (r0 == 0) goto L_0x00bd
            return r0
        L_0x00bd:
            r6.a = r7
            r6.b = r8
            r6.c = r14
            r6.w = r11
            r0 = r25
            r1 = r26
            r2 = r27
            r4 = r29
            java.lang.Object r0 = r0.a(r1, r2, r4, r6)
            if (r0 != r9) goto L_0x00d4
            return r9
        L_0x00d4:
            r3 = r7
            r2 = r8
            r1 = r14
        L_0x00d7:
            kk5 r0 = (defpackage.kk5) r0
            r3.getClass()
            if (r0 == 0) goto L_0x01ef
            java.util.List r0 = r0.a
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00e8
            goto L_0x01ef
        L_0x00e8:
            j20 r4 = r1.k
            if (r4 == 0) goto L_0x00f1
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x00f8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x010c
            java.lang.Object r5 = r4.next()
            r6 = r5
            ik5 r6 = (defpackage.ik5) r6
            p5g r6 = r6.a
            p5g r7 = defpackage.p5g.DASH
            if (r6 != r7) goto L_0x00f8
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            ik5 r5 = (defpackage.ik5) r5
            if (r5 == 0) goto L_0x013b
            s64 r0 = new s64
            java.lang.String r4 = r5.b
            zy r5 = r1.m
            long r6 = r1.a
            long r8 = r1.b
            long r14 = r1.j
            boolean r13 = r1.f
            int r12 = r1.d
            int r1 = r1.e
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r6
            r17 = r8
            r21 = r5
            r22 = r4
            r24 = r11
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x01f0
        L_0x013b:
            java.util.Iterator r4 = r0.iterator()
        L_0x013f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            r6 = r5
            ik5 r6 = (defpackage.ik5) r6
            p5g r6 = r6.a
            p5g r7 = defpackage.p5g.HLS
            if (r6 != r7) goto L_0x013f
            goto L_0x0154
        L_0x0153:
            r5 = r10
        L_0x0154:
            ik5 r5 = (defpackage.ik5) r5
            if (r5 == 0) goto L_0x0182
            l27 r0 = new l27
            java.lang.String r4 = r5.b
            zy r5 = r1.m
            long r6 = r1.a
            long r8 = r1.b
            long r14 = r1.j
            boolean r13 = r1.f
            int r12 = r1.d
            int r1 = r1.e
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r6
            r17 = r8
            r21 = r5
            r22 = r4
            r24 = r11
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x01f0
        L_0x0182:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x018b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01a2
            java.lang.Object r5 = r0.next()
            r6 = r5
            ik5 r6 = (defpackage.ik5) r6
            p5g r6 = r6.a
            p5g r7 = defpackage.p5g.MP4
            if (r6 != r7) goto L_0x018b
            r4.add(r5)
            goto L_0x018b
        L_0x01a2:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01a9
            r4 = r10
        L_0x01a9:
            if (r4 == 0) goto L_0x01ef
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            r13.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L_0x01b8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01d5
            java.lang.Object r4 = r0.next()
            ik5 r4 = (defpackage.ik5) r4
            vu9 r5 = new vu9
            java.lang.String r6 = r4.b
            int r7 = r4.c
            int r8 = r4.d
            int r4 = r4.e
            r5.<init>(r6, r7, r8, r4)
            r13.add(r5)
            goto L_0x01b8
        L_0x01d5:
            xu9 r0 = new xu9
            zy r14 = r1.m
            long r4 = r1.a
            long r6 = r1.b
            int r8 = r1.d
            int r1 = r1.e
            r12 = r0
            r15 = r4
            r17 = r6
            r19 = r11
            r20 = r8
            r21 = r1
            r12.<init>(r13, r14, r15, r17, r19, r20, r21)
            goto L_0x01f0
        L_0x01ef:
            r0 = r10
        L_0x01f0:
            if (r0 == 0) goto L_0x0207
            i4g r1 = r3.f
            java.lang.String r2 = r2.q
            r1.getClass()
            android.util.LruCache r1 = defpackage.i4g.a
            h4g r4 = new h4g
            long r5 = java.lang.System.currentTimeMillis()
            r4.<init>(r0, r5)
            r1.put(r2, r4)
        L_0x0207:
            java.lang.String r1 = r3.g
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x020e
            goto L_0x0227
        L_0x020e:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0227
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch video. Finish fetch, getVideoContent: processFetchResult for videoContent "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r1, r4, r10)
        L_0x0227:
            return r0
        L_0x0228:
            java.lang.String r0 = r7.g
            java.lang.String r1 = "Fetch video. Video hosting in black list"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5g.b(l20, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String c(l20 l20) {
        long j;
        boolean Y = ld8.Y(l20);
        boolean i = l20.i();
        String str = l20.r;
        if (i) {
            j = l20.d.a;
        } else {
            if (!Y) {
                str = "";
            }
            j = 0;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (wc8.h(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        File t = ((po5) this.e).t(j);
        if (wc8.h(t)) {
            return t.getAbsolutePath();
        }
        return null;
    }
}
