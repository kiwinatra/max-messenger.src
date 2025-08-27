package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: qva  reason: default package */
public final class qva extends wj0 {
    public static final /* synthetic */ int l = 0;
    public final m95 f;
    public final ggd g;
    public final gaf h;
    public final Lazy i = LazyKt.lazy(new ova(this, 0));
    public final Lazy j;
    public final Lazy k;

    public qva(Context context, m95 m95, po5 po5, bud bud, epa epa, ggd ggd, gaf gaf) {
        super(context, po5.b, po5, bud, epa, m95);
        this.f = m95;
        this.g = ggd;
        this.h = gaf;
        this.j = LazyKt.lazy(new c28(21, bud));
        this.k = LazyKt.lazy(new ova(this, 1));
    }

    /* JADX WARNING: type inference failed for: r1v57, types: [java.lang.Object, d19] */
    /* JADX WARNING: type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v27, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r2v49, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r16v16, types: [w09] */
    /* JADX WARNING: type inference failed for: r16v17, types: [x09] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0410 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0412  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r41, java.lang.String r42, float r43, float r44, defpackage.rac r45, boolean r46, defpackage.hxf r47) {
        /*
            r40 = this;
            r1 = r40
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r46
            r2 = r47
            kotlin.Lazy r0 = r1.j
            java.lang.Object r0 = r0.getValue()
            u09 r0 = (defpackage.u09) r0
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = 0
            if (r0 == 0) goto L_0x0490
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0037
            w78 r3 = defpackage.w78.o
            java.lang.String r4 = "qva"
            java.lang.String r5 = "transformMedia"
            r0.d(r3, r4, r5, r9)
        L_0x0037:
            java.io.File r0 = new java.io.File
            r8 = r41
            r0.<init>(r8)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.content.Context r3 = r1.a
            int r4 = r13.b
            int r5 = r13.c
            int r6 = r13.d
            kotlin.Lazy r7 = r1.j
            java.lang.Object r7 = r7.getValue()
            u09 r7 = (defpackage.u09) r7
            kotlin.Lazy r7 = r7.e
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            kotlin.Lazy r10 = r1.j
            java.lang.Object r10 = r10.getValue()
            u09 r10 = (defpackage.u09) r10
            kotlin.Lazy r10 = r10.f
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            vq7 r9 = new vq7
            r15 = 22
            r9.<init>((int) r15, (java.lang.Object) r2)
            if (r42 == 0) goto L_0x0084
            java.lang.CharSequence r15 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r42)
            java.lang.String r15 = r15.toString()
            goto L_0x0085
        L_0x0084:
            r15 = 0
        L_0x0085:
            if (r0 == 0) goto L_0x0473
            if (r15 == 0) goto L_0x0473
            int r16 = r15.length()
            if (r16 == 0) goto L_0x0473
            r16 = 0
            int r16 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r16 < 0) goto L_0x044d
            r16 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r16 <= 0) goto L_0x044d
            int r16 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r16 <= 0) goto L_0x044d
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = (double) r12
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x044d
            if (r4 <= 0) goto L_0x043e
            if (r5 <= 0) goto L_0x043e
            d19 r1 = new d19
            s09 r2 = new s09
            r2.<init>(r3)
            r2.b = r0
            r2.c = r15
            r2.d = r4
            r2.e = r5
            r2.f = r6
            r2.i = r14
            r2.h = r12
            r2.g = r11
            r2.j = r10
            r2.k = r7
            r2.l = r9
            r1.<init>()
            r1.b = r2
            java.lang.Class<d19> r0 = defpackage.d19.class
            java.lang.String r0 = r0.getName()
            r1.c = r0
            android.content.Context r0 = r2.a
            android.content.Context r0 = r0.getApplicationContext()
            r1.a = r0
            java.lang.String r3 = "execute, failed to transform media"
            a19 r4 = new a19
            r4.<init>(r2)
            lq8 r5 = new lq8
            java.lang.Object r0 = r1.a
            android.content.Context r0 = (android.content.Context) r0
            r5.<init>(r0)
            android.net.Uri r2 = r2.b
            java.lang.String r0 = "Failed to find a suitable extractor for "
            jq8 r9 = r5.a(r2)     // Catch:{ all -> 0x015f }
            if (r9 == 0) goto L_0x0168
            pv0 r0 = new pv0     // Catch:{ all -> 0x0117 }
            r0.<init>(r9)     // Catch:{ all -> 0x0117 }
            java.lang.Object r10 = r0.c     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x0117 }
            ea6[] r10 = defpackage.ryg.H(r10)     // Catch:{ all -> 0x0117 }
            int r15 = r10.length     // Catch:{ all -> 0x0117 }
            r6 = 0
        L_0x0105:
            if (r6 >= r15) goto L_0x011a
            r7 = r10[r6]     // Catch:{ all -> 0x0117 }
            m53 r8 = r7.A     // Catch:{ all -> 0x0117 }
            boolean r8 = defpackage.m53.g(r8)     // Catch:{ all -> 0x0117 }
            if (r8 == 0) goto L_0x0112
            goto L_0x011b
        L_0x0112:
            r7 = 1
            int r6 = r6 + r7
            r8 = r41
            goto L_0x0105
        L_0x0117:
            r0 = move-exception
            r6 = r0
            goto L_0x0161
        L_0x011a:
            r7 = 0
        L_0x011b:
            hq8 r6 = new hq8     // Catch:{ all -> 0x0117 }
            java.lang.Object r8 = r0.w     // Catch:{ all -> 0x0117 }
            snd r8 = (defpackage.snd) r8     // Catch:{ all -> 0x0117 }
            if (r8 == 0) goto L_0x012c
            long r16 = r8.f()     // Catch:{ all -> 0x0117 }
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0117 }
            goto L_0x012d
        L_0x012c:
            r8 = 0
        L_0x012d:
            if (r8 == 0) goto L_0x0136
            long r16 = r8.longValue()     // Catch:{ all -> 0x0117 }
            r17 = r16
            goto L_0x013b
        L_0x0136:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013b:
            if (r7 == 0) goto L_0x0140
            r19 = 1
            goto L_0x0142
        L_0x0140:
            r19 = 0
        L_0x0142:
            java.lang.Object r7 = r0.o     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0117 }
            ea6[] r21 = defpackage.ryg.H(r7)     // Catch:{ all -> 0x0117 }
            java.lang.Object r0 = r0.v     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0117 }
            ea6[] r22 = defpackage.ryg.H(r0)     // Catch:{ all -> 0x0117 }
            r16 = r6
            r20 = r10
            r16.<init>(r17, r19, r20, r21, r22)     // Catch:{ all -> 0x0117 }
            r7 = 0
            kotlin.io.CloseableKt.closeFinally(r9, r7)     // Catch:{ all -> 0x015f }
            goto L_0x0294
        L_0x015f:
            r0 = move-exception
            goto L_0x017a
        L_0x0161:
            throw r6     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r7 = r0
            kotlin.io.CloseableKt.closeFinally(r9, r6)     // Catch:{ all -> 0x015f }
            throw r7     // Catch:{ all -> 0x015f }
        L_0x0168:
            one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException r6 = new one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            r7.<init>(r0)     // Catch:{ all -> 0x015f }
            r7.append(r2)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x015f }
            r6.<init>(r0)     // Catch:{ all -> 0x015f }
            throw r6     // Catch:{ all -> 0x015f }
        L_0x017a:
            java.lang.String r6 = r5.b
            java.lang.String r7 = "Failed to retrieve media info"
            defpackage.z68.f(r6, r7, r0)
            java.lang.String r0 = "mime"
            java.lang.String r7 = "durationUs"
            android.media.MediaExtractor r8 = new android.media.MediaExtractor     // Catch:{ all -> 0x0286 }
            r8.<init>()     // Catch:{ all -> 0x0286 }
            android.content.Context r5 = r5.a     // Catch:{ all -> 0x0284 }
            r9 = 0
            r8.setDataSource(r5, r2, r9)     // Catch:{ all -> 0x0284 }
            int r2 = r8.getTrackCount()     // Catch:{ all -> 0x0284 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01c0 }
            r5.<init>()     // Catch:{ all -> 0x01c0 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01c0 }
            r9.<init>()     // Catch:{ all -> 0x01c0 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x01c0 }
            r10.<init>()     // Catch:{ all -> 0x01c0 }
            r15 = 0
            r16 = 0
        L_0x01a6:
            if (r15 >= r2) goto L_0x0200
            r17 = r2
            android.media.MediaFormat r2 = r8.getTrackFormat(r15)     // Catch:{ all -> 0x01f3 }
            ea6 r13 = defpackage.hsg.h(r2)     // Catch:{ all -> 0x01c0 }
            java.lang.String r18 = r2.getString(r0)     // Catch:{ all -> 0x01c0 }
            boolean r18 = defpackage.vq9.k(r18)     // Catch:{ all -> 0x01c0 }
            if (r18 == 0) goto L_0x01c3
            r5.add(r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x01d4
        L_0x01c0:
            r0 = move-exception
            goto L_0x0276
        L_0x01c3:
            java.lang.String r18 = r2.getString(r0)     // Catch:{ all -> 0x01c0 }
            boolean r18 = defpackage.vq9.h(r18)     // Catch:{ all -> 0x01c0 }
            if (r18 == 0) goto L_0x01d1
            r9.add(r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x01d4
        L_0x01d1:
            r10.add(r13)     // Catch:{ all -> 0x01c0 }
        L_0x01d4:
            boolean r13 = r2.containsKey(r7)     // Catch:{ all -> 0x01c0 }
            if (r13 == 0) goto L_0x01f3
            if (r16 == 0) goto L_0x01e9
            long r13 = r16.longValue()     // Catch:{ all -> 0x01c0 }
            long r11 = r2.getLong(r7)     // Catch:{ all -> 0x01c0 }
            long r11 = java.lang.Math.max(r13, r11)     // Catch:{ all -> 0x01c0 }
            goto L_0x01ed
        L_0x01e9:
            long r11 = r2.getLong(r7)     // Catch:{ all -> 0x01c0 }
        L_0x01ed:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01c0 }
            r16 = r2
        L_0x01f3:
            r2 = 1
            int r15 = r15 + r2
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r46
            r2 = r17
            goto L_0x01a6
        L_0x0200:
            r2 = 1
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01c0 }
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0219
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01c0 }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0217
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x01c0 }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r0 = 0
            goto L_0x0272
        L_0x0219:
            java.util.Iterator r0 = r5.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x021d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x0233
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01c0 }
            r7 = r2
            ea6 r7 = (defpackage.ea6) r7     // Catch:{ all -> 0x01c0 }
            m53 r7 = r7.A     // Catch:{ all -> 0x01c0 }
            boolean r7 = defpackage.m53.g(r7)     // Catch:{ all -> 0x01c0 }
            if (r7 == 0) goto L_0x021d
            goto L_0x0234
        L_0x0233:
            r2 = 0
        L_0x0234:
            ea6 r2 = (defpackage.ea6) r2     // Catch:{ all -> 0x01c0 }
            hq8 r0 = new hq8     // Catch:{ all -> 0x01c0 }
            if (r16 == 0) goto L_0x0241
            long r11 = r16.longValue()     // Catch:{ all -> 0x01c0 }
            r26 = r11
            goto L_0x0246
        L_0x0241:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0246:
            if (r2 == 0) goto L_0x024c
            r2 = 0
            r28 = 1
            goto L_0x024f
        L_0x024c:
            r2 = 0
            r28 = 0
        L_0x024f:
            ea6[] r7 = new defpackage.ea6[r2]     // Catch:{ all -> 0x01c0 }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ all -> 0x01c0 }
            r29 = r5
            ea6[] r29 = (defpackage.ea6[]) r29     // Catch:{ all -> 0x01c0 }
            ea6[] r5 = new defpackage.ea6[r2]     // Catch:{ all -> 0x01c0 }
            java.lang.Object[] r5 = r9.toArray(r5)     // Catch:{ all -> 0x01c0 }
            r30 = r5
            ea6[] r30 = (defpackage.ea6[]) r30     // Catch:{ all -> 0x01c0 }
            ea6[] r5 = new defpackage.ea6[r2]     // Catch:{ all -> 0x01c0 }
            java.lang.Object[] r2 = r10.toArray(r5)     // Catch:{ all -> 0x01c0 }
            r31 = r2
            ea6[] r31 = (defpackage.ea6[]) r31     // Catch:{ all -> 0x01c0 }
            r25 = r0
            r25.<init>(r26, r28, r29, r30, r31)     // Catch:{ all -> 0x01c0 }
        L_0x0272:
            r8.release()
            goto L_0x0293
        L_0x0276:
            java.lang.String r2 = "Failed to extract media"
            defpackage.z68.f(r6, r2, r0)     // Catch:{ all -> 0x027f }
            r8.release()
            goto L_0x0292
        L_0x027f:
            r0 = move-exception
            r8.release()
            throw r0
        L_0x0284:
            r0 = move-exception
            goto L_0x0288
        L_0x0286:
            r0 = move-exception
            r8 = 0
        L_0x0288:
            java.lang.String r2 = "Failed to open media extractor"
            defpackage.z68.f(r6, r2, r0)
            if (r8 == 0) goto L_0x0292
            r8.release()
        L_0x0292:
            r0 = 0
        L_0x0293:
            r6 = r0
        L_0x0294:
            if (r6 == 0) goto L_0x02a5
            z09 r0 = r4.c
            long r7 = java.lang.System.currentTimeMillis()
            r0.a = r7
            z09 r0 = r4.c
            java.util.concurrent.atomic.AtomicReference r0 = r0.b
            r0.set(r6)
        L_0x02a5:
            java.lang.Object r0 = r1.c
            java.lang.String r0 = (java.lang.String) r0
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x02ae
            goto L_0x02c8
        L_0x02ae:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x02c8
            w78 r5 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "execute, "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r2.d(r5, r0, r7, r8)
        L_0x02c8:
            ir8 r0 = r1.n(r6)     // Catch:{ MediaTransformException -> 0x02f5, all -> 0x02f2 }
            e05 r0 = r1.k(r0)     // Catch:{ MediaTransformException -> 0x02f5, all -> 0x02f2 }
            f05 r2 = new f05     // Catch:{ MediaTransformException -> 0x02f5, all -> 0x02f2 }
            r10 = 0
            e05[] r5 = new defpackage.e05[r10]     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            r2.<init>(r0, r5)     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            gd3 r0 = r1.j(r4, r2)     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            kotlin.Lazy r2 = defpackage.pm4.c     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            ep1 r2 = new ep1     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            r5 = 5
            r2.<init>(r1, r4, r0, r5)     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            boolean r2 = defpackage.m58.M(r2)     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            if (r2 != 0) goto L_0x0314
            r1.s(r4, r0)     // Catch:{ MediaTransformException -> 0x02f0, all -> 0x02ee }
            goto L_0x0314
        L_0x02ee:
            r0 = move-exception
            goto L_0x02f8
        L_0x02f0:
            r0 = move-exception
            goto L_0x030a
        L_0x02f2:
            r0 = move-exception
            r10 = 0
            goto L_0x02f8
        L_0x02f5:
            r0 = move-exception
            r10 = 0
            goto L_0x030a
        L_0x02f8:
            java.lang.Object r2 = r1.c
            java.lang.String r2 = (java.lang.String) r2
            defpackage.z68.f(r2, r3, r0)
            one.me.sdk.media.transformer.MediaTransformException r2 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r3 = "Failed to transform media"
            r2.<init>(r3, r0)
            r4.a(r2)
            goto L_0x0314
        L_0x030a:
            java.lang.Object r2 = r1.c
            java.lang.String r2 = (java.lang.String) r2
            defpackage.z68.f(r2, r3, r0)
            r4.a(r0)
        L_0x0314:
            long r19 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r0 = r4.f
            java.lang.Object r0 = r0.get()
            yd5 r0 = (defpackage.yd5) r0
            java.util.concurrent.atomic.AtomicReference r2 = r4.g
            java.lang.Object r2 = r2.get()
            one.me.sdk.media.transformer.MediaTransformException r2 = (one.me.sdk.media.transformer.MediaTransformException) r2
            if (r0 == 0) goto L_0x037e
            if (r2 != 0) goto L_0x037e
            long r2 = r4.b
            r17 = r2
            s09 r2 = r4.a
            r21 = r2
            z09 r2 = r4.c
            r22 = r2
            long r2 = r0.a
            r23 = r2
            long r2 = r0.b
            r25 = r2
            int r2 = r0.o
            r27 = r2
            java.lang.String r2 = r0.f
            r28 = r2
            int r2 = r0.d
            r29 = r2
            int r2 = r0.e
            r30 = r2
            int r2 = r0.c
            r31 = r2
            java.lang.String r2 = r0.m
            r32 = r2
            int r2 = r0.k
            r33 = r2
            int r2 = r0.j
            r34 = r2
            int r2 = r0.h
            r35 = r2
            int r2 = r4.e
            r38 = r2
            int r2 = r4.d
            r36 = r2
            int r2 = r0.l
            r37 = r2
            m53 r0 = r0.i
            boolean r39 = defpackage.m53.g(r0)
            x09 r0 = new x09
            r16 = r0
            r16.<init>(r17, r19, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x039d
        L_0x037e:
            w09 r0 = new w09
            long r5 = r4.b
            s09 r3 = r4.a
            z09 r4 = r4.c
            if (r2 != 0) goto L_0x0390
            one.me.sdk.media.transformer.MediaTransformException r2 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r7 = "Unknown media transform error occured"
            r8 = 0
            r2.<init>(r7, r8)
        L_0x0390:
            r23 = r2
            r16 = r0
            r17 = r5
            r21 = r3
            r22 = r4
            r16.<init>(r17, r19, r21, r22, r23)
        L_0x039d:
            boolean r2 = r0 instanceof defpackage.x09
            if (r2 == 0) goto L_0x03c5
            java.lang.Object r1 = r1.c
            java.lang.String r1 = (java.lang.String) r1
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x03aa
            goto L_0x040e
        L_0x03aa:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x040e
            w78 r4 = defpackage.w78.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "execute, completed with "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r3.d(r4, r1, r5, r6)
            goto L_0x040e
        L_0x03c5:
            boolean r3 = r0 instanceof defpackage.w09
            if (r3 == 0) goto L_0x0438
            java.lang.Object r3 = r1.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "execute, failed with "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = r0
            w09 r5 = (defpackage.w09) r5
            one.me.sdk.media.transformer.MediaTransformException r5 = r5.e
            defpackage.z68.f(r3, r4, r5)
            java.lang.Object r3 = r1.c
            java.lang.String r3 = (java.lang.String) r3
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x03ec
            goto L_0x03fa
        L_0x03ec:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x03fa
            w78 r5 = defpackage.w78.o
            java.lang.String r6 = "cleanup"
            r7 = 0
            r4.d(r5, r3, r6, r7)
        L_0x03fa:
            java.io.File r3 = new java.io.File
            java.lang.Object r1 = r1.b
            s09 r1 = (defpackage.s09) r1
            java.lang.String r1 = r1.c
            r3.<init>(r1)
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L_0x040e
            r3.delete()
        L_0x040e:
            if (r2 == 0) goto L_0x0412
            r1 = 1
            return r1
        L_0x0412:
            r1 = 1
            boolean r2 = r0 instanceof defpackage.w09
            if (r2 == 0) goto L_0x0432
            r2 = r40
            m95 r3 = r2.f
            ru.ok.tamtam.ExceptionHandler$HandledException r4 = new ru.ok.tamtam.ExceptionHandler$HandledException
            w09 r0 = (defpackage.w09) r0
            one.me.sdk.media.transformer.MediaTransformException r0 = r0.e
            java.lang.String r5 = "ONEME-9916"
            r6 = 0
            r4.<init>(r6, r0, r1, r5)
            uta r3 = (defpackage.uta) r3
            r3.c(r4, r1)
            r11 = r43
            r12 = r44
            r9 = 0
            goto L_0x0492
        L_0x0432:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0438:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x043e:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.String r1 = "Illegal requested size="
            java.lang.String r2 = "x"
            java.lang.String r1 = defpackage.g63.h(r1, r4, r5, r2)
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L_0x044d:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal requested position range=["
            r1.<init>(r2)
            r11 = r43
            r1.append(r11)
            java.lang.String r2 = ", "
            r1.append(r2)
            r12 = r44
            r1.append(r12)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L_0x0473:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r1 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal input/output="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = r2.toString()
            r9 = 0
            r1.<init>(r0, r9)
            throw r1
        L_0x0490:
            r2 = r1
            r10 = 0
        L_0x0492:
            p3a r0 = new p3a
            r1 = r47
            r0.<init>((java.lang.Object) r1)
            android.content.Context r3 = r2.a
            m95 r4 = r2.f
            u4g r13 = new u4g
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r14 = r9
            r9 = r46
            r15 = r10
            r10 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r43)
            java.lang.Float r4 = java.lang.Float.valueOf(r44)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r46)
            r1 = r41
            r2 = r42
            r5 = r45
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6}
            java.lang.String r1 = "Start convert with parameters: \nsrcUri: %s\ndstPath: %s\nstartPosition: %f\nendPosition: %f\nquality: %s\nmute: %s"
            java.lang.String r2 = "u4g"
            defpackage.z68.c(r2, r1, r0)
            boolean r0 = r13.a()     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x0525
            java.lang.String r0 = "execute: failed to init recorder"
            defpackage.z68.f(r2, r0, r14)     // Catch:{ all -> 0x0522 }
            aqg r0 = r13.h
            if (r0 == 0) goto L_0x04e9
            java.lang.Object r0 = r0.a
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x04e9
            r0.release()
        L_0x04e9:
            he r0 = r13.f
            if (r0 == 0) goto L_0x04f6
            java.lang.Object r0 = r0.c
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x04f6
            r0.release()
        L_0x04f6:
            android.media.MediaExtractor r0 = r13.b
            if (r0 == 0) goto L_0x04fd
            r0.release()
        L_0x04fd:
            d0a r0 = r13.c
            if (r0 == 0) goto L_0x0508
            java.lang.Object r0 = r0.f
            android.media.MediaMuxer r0 = (android.media.MediaMuxer) r0
            r0.release()
        L_0x0508:
            m7f r0 = r13.i
            if (r0 == 0) goto L_0x0515
            java.lang.Object r1 = r0.o
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L_0x0515
            r0.x()
        L_0x0515:
            j6b r0 = r13.g
            if (r0 == 0) goto L_0x0721
            android.view.Surface r1 = r0.b
            if (r1 == 0) goto L_0x0721
        L_0x051d:
            r0.a()
            goto L_0x0721
        L_0x0522:
            r0 = move-exception
            goto L_0x06ad
        L_0x0525:
            long r0 = r13.x     // Catch:{ all -> 0x0522 }
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0533
            android.media.MediaExtractor r3 = r13.b     // Catch:{ all -> 0x0522 }
            r3.seekTo(r0, r15)     // Catch:{ all -> 0x0522 }
            goto L_0x0538
        L_0x0533:
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            r0.seekTo(r3, r15)     // Catch:{ all -> 0x0522 }
        L_0x0538:
            boolean r0 = r13.l     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x0661
        L_0x053c:
            boolean r0 = r13.j     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x064d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0522 }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x0645
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            int r0 = r0.getSampleTrackIndex()     // Catch:{ all -> 0x0522 }
            r3 = 10000(0x2710, double:4.9407E-320)
            r1 = -1
            if (r0 == r1) goto L_0x055d
            boolean r5 = r13.n     // Catch:{ all -> 0x0522 }
            if (r5 == 0) goto L_0x0560
            boolean r5 = r13.m     // Catch:{ all -> 0x0522 }
            if (r5 == 0) goto L_0x0560
        L_0x055d:
            r1 = 1
            goto L_0x061c
        L_0x0560:
            int r5 = r13.d     // Catch:{ all -> 0x0522 }
            if (r0 != r5) goto L_0x058d
            he r0 = r13.f     // Catch:{ all -> 0x0522 }
            android.media.MediaExtractor r1 = r13.b     // Catch:{ all -> 0x0522 }
            java.lang.Object r5 = r0.c     // Catch:{ all -> 0x0522 }
            android.media.MediaCodec r5 = (android.media.MediaCodec) r5     // Catch:{ all -> 0x0522 }
            int r7 = r5.dequeueInputBuffer(r3)     // Catch:{ all -> 0x0522 }
            if (r7 < 0) goto L_0x064d
            java.nio.ByteBuffer r3 = r5.getInputBuffer(r7)     // Catch:{ all -> 0x0522 }
            int r9 = r1.readSampleData(r3, r15)     // Catch:{ all -> 0x0522 }
            long r10 = r1.getSampleTime()     // Catch:{ all -> 0x0522 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0522 }
            r6 = r0
            android.media.MediaCodec r6 = (android.media.MediaCodec) r6     // Catch:{ all -> 0x0522 }
            r8 = 0
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0522 }
            r1.advance()     // Catch:{ all -> 0x0522 }
            goto L_0x064d
        L_0x058d:
            int r3 = r13.e     // Catch:{ all -> 0x0522 }
            if (r0 != r3) goto L_0x0615
            if (r3 == r1) goto L_0x0615
            if (r46 != 0) goto L_0x05a1
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            long r0 = r0.getSampleTime()     // Catch:{ all -> 0x0522 }
            long r3 = r13.y     // Catch:{ all -> 0x0522 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x05a3
        L_0x05a1:
            r1 = 1
            goto L_0x060c
        L_0x05a3:
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            long r0 = r0.getSampleTime()     // Catch:{ all -> 0x0522 }
            long r3 = r13.x     // Catch:{ all -> 0x0522 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x060e
            java.nio.ByteBuffer r0 = r13.a     // Catch:{ all -> 0x0522 }
            r0.rewind()     // Catch:{ all -> 0x0522 }
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0522 }
            r0.<init>()     // Catch:{ all -> 0x0522 }
            r0.offset = r15     // Catch:{ all -> 0x0522 }
            android.media.MediaExtractor r1 = r13.b     // Catch:{ all -> 0x0522 }
            java.nio.ByteBuffer r3 = r13.a     // Catch:{ all -> 0x0522 }
            int r1 = r1.readSampleData(r3, r15)     // Catch:{ all -> 0x0522 }
            r0.size = r1     // Catch:{ all -> 0x0522 }
            android.media.MediaExtractor r1 = r13.b     // Catch:{ all -> 0x0522 }
            long r3 = r1.getSampleTime()     // Catch:{ all -> 0x0522 }
            r0.presentationTimeUs = r3     // Catch:{ all -> 0x0522 }
            android.media.MediaExtractor r1 = r13.b     // Catch:{ all -> 0x0522 }
            int r1 = r1.getSampleFlags()     // Catch:{ all -> 0x0522 }
            r0.flags = r1     // Catch:{ all -> 0x0522 }
            long r3 = r0.presentationTimeUs     // Catch:{ all -> 0x0522 }
            long r5 = r13.x     // Catch:{ all -> 0x0522 }
            long r3 = r3 - r5
            r0.presentationTimeUs = r3     // Catch:{ all -> 0x0522 }
            d0a r1 = r13.c     // Catch:{ all -> 0x0522 }
            java.nio.ByteBuffer r3 = r13.a     // Catch:{ all -> 0x0522 }
            boolean r4 = r1.b()     // Catch:{ all -> 0x0522 }
            if (r4 == 0) goto L_0x05fd
            boolean r4 = r1.c     // Catch:{ all -> 0x0522 }
            java.lang.Object r5 = r1.f     // Catch:{ all -> 0x0522 }
            android.media.MediaMuxer r5 = (android.media.MediaMuxer) r5     // Catch:{ all -> 0x0522 }
            if (r4 != 0) goto L_0x05f4
            r5.start()     // Catch:{ all -> 0x0522 }
            r4 = 1
            r1.c = r4     // Catch:{ all -> 0x0522 }
        L_0x05f4:
            r1.a()     // Catch:{ all -> 0x0522 }
            int r1 = r1.b     // Catch:{ all -> 0x0522 }
            r5.writeSampleData(r1, r3, r0)     // Catch:{ all -> 0x0522 }
            goto L_0x060e
        L_0x05fd:
            java.lang.Object r4 = r1.g     // Catch:{ all -> 0x0522 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0522 }
            c0a r5 = new c0a     // Catch:{ all -> 0x0522 }
            int r1 = r1.b     // Catch:{ all -> 0x0522 }
            r5.<init>(r1, r3, r0)     // Catch:{ all -> 0x0522 }
            r4.add(r5)     // Catch:{ all -> 0x0522 }
            goto L_0x060e
        L_0x060c:
            r13.n = r1     // Catch:{ all -> 0x0522 }
        L_0x060e:
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            r0.advance()     // Catch:{ all -> 0x0522 }
            goto L_0x053c
        L_0x0615:
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            r0.advance()     // Catch:{ all -> 0x0522 }
            goto L_0x053c
        L_0x061c:
            r13.j = r1     // Catch:{ all -> 0x0522 }
            android.media.MediaExtractor r0 = r13.b     // Catch:{ all -> 0x0522 }
            r0.release()     // Catch:{ all -> 0x0522 }
            he r0 = r13.f     // Catch:{ all -> 0x0522 }
            java.lang.Object r1 = r0.c     // Catch:{ all -> 0x0522 }
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1     // Catch:{ all -> 0x0522 }
            int r6 = r1.dequeueInputBuffer(r3)     // Catch:{ all -> 0x0522 }
            if (r6 < 0) goto L_0x0640
            java.lang.Object r1 = r0.c     // Catch:{ all -> 0x0522 }
            r5 = r1
            android.media.MediaCodec r5 = (android.media.MediaCodec) r5     // Catch:{ all -> 0x0522 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x0522 }
            r0.b = r15     // Catch:{ all -> 0x0522 }
            goto L_0x053c
        L_0x0640:
            r1 = 1
            r0.b = r1     // Catch:{ all -> 0x0522 }
            goto L_0x053c
        L_0x0645:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x0522 }
            java.lang.String r1 = "conversion is interrupted"
            r0.<init>(r1)     // Catch:{ all -> 0x0522 }
            throw r0     // Catch:{ all -> 0x0522 }
        L_0x064d:
            boolean r0 = r13.k     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x0656
            he r0 = r13.f     // Catch:{ all -> 0x0522 }
            r0.m()     // Catch:{ all -> 0x0522 }
        L_0x0656:
            boolean r0 = r13.l     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x0538
            aqg r0 = r13.h     // Catch:{ all -> 0x0522 }
            r0.f()     // Catch:{ all -> 0x0522 }
            goto L_0x0538
        L_0x0661:
            aqg r0 = r13.h
            if (r0 == 0) goto L_0x066e
            java.lang.Object r0 = r0.a
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x066e
            r0.release()
        L_0x066e:
            he r0 = r13.f
            if (r0 == 0) goto L_0x067b
            java.lang.Object r0 = r0.c
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x067b
            r0.release()
        L_0x067b:
            android.media.MediaExtractor r0 = r13.b
            if (r0 == 0) goto L_0x0682
            r0.release()
        L_0x0682:
            d0a r0 = r13.c
            if (r0 == 0) goto L_0x068d
            java.lang.Object r0 = r0.f
            android.media.MediaMuxer r0 = (android.media.MediaMuxer) r0
            r0.release()
        L_0x068d:
            m7f r0 = r13.i
            if (r0 == 0) goto L_0x069a
            java.lang.Object r1 = r0.o
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L_0x069a
            r0.x()
        L_0x069a:
            j6b r0 = r13.g
            if (r0 == 0) goto L_0x06a5
            android.view.Surface r1 = r0.b
            if (r1 == 0) goto L_0x06a5
            r0.a()
        L_0x06a5:
            java.lang.String r0 = "Video convert successfully done"
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            r15 = 1
            goto L_0x0721
        L_0x06ad:
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x06ca }
            java.lang.String r3 = "execute: interrupted"
            if (r1 != 0) goto L_0x0722
            boolean r1 = r0 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x06ca }
            if (r1 == 0) goto L_0x06cc
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x06ca }
            boolean r1 = r1 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x06ca }
            if (r1 != 0) goto L_0x06c0
            goto L_0x06cc
        L_0x06c0:
            defpackage.z68.f(r2, r3, r14)     // Catch:{ all -> 0x06ca }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x06ca }
            java.lang.InterruptedException r0 = (java.lang.InterruptedException) r0     // Catch:{ all -> 0x06ca }
            throw r0     // Catch:{ all -> 0x06ca }
        L_0x06ca:
            r0 = move-exception
            goto L_0x0728
        L_0x06cc:
            java.lang.String r1 = "failed to convert video"
            defpackage.z68.f(r2, r1, r0)     // Catch:{ all -> 0x06ca }
            m95 r1 = r13.p     // Catch:{ all -> 0x06ca }
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x06ca }
            r2.<init>(r0)     // Catch:{ all -> 0x06ca }
            uta r1 = (defpackage.uta) r1     // Catch:{ all -> 0x06ca }
            r3 = 1
            r1.c(r2, r3)     // Catch:{ all -> 0x06ca }
            aqg r0 = r13.h
            if (r0 == 0) goto L_0x06eb
            java.lang.Object r0 = r0.a
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x06eb
            r0.release()
        L_0x06eb:
            he r0 = r13.f
            if (r0 == 0) goto L_0x06f8
            java.lang.Object r0 = r0.c
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            if (r0 == 0) goto L_0x06f8
            r0.release()
        L_0x06f8:
            android.media.MediaExtractor r0 = r13.b
            if (r0 == 0) goto L_0x06ff
            r0.release()
        L_0x06ff:
            d0a r0 = r13.c
            if (r0 == 0) goto L_0x070a
            java.lang.Object r0 = r0.f
            android.media.MediaMuxer r0 = (android.media.MediaMuxer) r0
            r0.release()
        L_0x070a:
            m7f r0 = r13.i
            if (r0 == 0) goto L_0x0717
            java.lang.Object r1 = r0.o
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L_0x0717
            r0.x()
        L_0x0717:
            j6b r0 = r13.g
            if (r0 == 0) goto L_0x0721
            android.view.Surface r1 = r0.b
            if (r1 == 0) goto L_0x0721
            goto L_0x051d
        L_0x0721:
            return r15
        L_0x0722:
            defpackage.z68.f(r2, r3, r14)     // Catch:{ all -> 0x06ca }
            java.lang.InterruptedException r0 = (java.lang.InterruptedException) r0     // Catch:{ all -> 0x06ca }
            throw r0     // Catch:{ all -> 0x06ca }
        L_0x0728:
            aqg r1 = r13.h
            if (r1 == 0) goto L_0x0735
            java.lang.Object r1 = r1.a
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1
            if (r1 == 0) goto L_0x0735
            r1.release()
        L_0x0735:
            he r1 = r13.f
            if (r1 == 0) goto L_0x0742
            java.lang.Object r1 = r1.c
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1
            if (r1 == 0) goto L_0x0742
            r1.release()
        L_0x0742:
            android.media.MediaExtractor r1 = r13.b
            if (r1 == 0) goto L_0x0749
            r1.release()
        L_0x0749:
            d0a r1 = r13.c
            if (r1 == 0) goto L_0x0754
            java.lang.Object r1 = r1.f
            android.media.MediaMuxer r1 = (android.media.MediaMuxer) r1
            r1.release()
        L_0x0754:
            m7f r1 = r13.i
            if (r1 == 0) goto L_0x0761
            java.lang.Object r2 = r1.o
            android.view.Surface r2 = (android.view.Surface) r2
            if (r2 == 0) goto L_0x0761
            r1.x()
        L_0x0761:
            j6b r1 = r13.g
            if (r1 == 0) goto L_0x076c
            android.view.Surface r2 = r1.b
            if (r2 == 0) goto L_0x076c
            r1.a()
        L_0x076c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.e(java.lang.String, java.lang.String, float, float, rac, boolean, hxf):boolean");
    }

    public final void f(String str, boolean z) {
        if (z) {
            ld9.B().g(qa7.b(str), (Object) null, uub.o);
        } else {
            ld9.B().f(qa7.b(str), (f0) null);
        }
    }
}
