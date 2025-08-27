package defpackage;

import android.view.MenuItem;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ve  reason: default package */
public final class ve extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve(int i, Object obj) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013b, code lost:
        if (r0 == false) goto L_0x013e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            r1 = 20
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x0312;
                case 1: goto L_0x0309;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02ba;
                case 4: goto L_0x0284;
                case 5: goto L_0x027b;
                case 6: goto L_0x0237;
                case 7: goto L_0x0226;
                case 8: goto L_0x0143;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00a6;
                case 12: goto L_0x0042;
                case 13: goto L_0x0028;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r0.b
            in1 r0 = (defpackage.in1) r0
            ap0 r1 = r0.e
            monitor-enter(r1)
            long r5 = r1.c     // Catch:{ all -> 0x0025 }
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            r3 = r4
        L_0x001f:
            monitor-exit(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            java.lang.Object r0 = r0.b
            jk3 r0 = (defpackage.jk3) r0
            java.lang.Object r0 = r0.a
            tvb r0 = (defpackage.tvb) r0
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0042:
            java.lang.Object r0 = r0.b
            g43 r0 = (defpackage.g43) r0
            r0.getClass()
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r0.<init>(r3)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r5 = r3
        L_0x0059:
            java.lang.String r6 = "video/avc"
            if (r5 >= r2) goto L_0x007a
            r7 = r0[r5]
            java.lang.String[] r8 = r7.getSupportedTypes()
            boolean r6 = kotlin.collections.ArraysKt.contains((T[]) r8, r6)
            if (r6 == 0) goto L_0x0078
            boolean r6 = r7.isEncoder()
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.isHardwareAccelerated()
            if (r6 == 0) goto L_0x0078
            r1.add(r7)
        L_0x0078:
            int r5 = r5 + r4
            goto L_0x0059
        L_0x007a:
            java.util.Iterator r0 = r1.iterator()
        L_0x007e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r0.next()
            android.media.MediaCodecInfo r1 = (android.media.MediaCodecInfo) r1
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r6)
            int r2 = r1.getMaxSupportedInstances()
            if (r2 <= 0) goto L_0x007e
            int r3 = r1.getMaxSupportedInstances()
        L_0x0098:
            int r3 = r3 + -5
            r0 = 4
            r1 = 10
            int r0 = kotlin.ranges.RangesKt.coerceIn((int) r3, (int) r0, (int) r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00a6:
            java.lang.Object r0 = r0.b
            f7a r0 = (defpackage.f7a) r0
            java.lang.Object r1 = r0.c
            android.content.Context r1 = (android.content.Context) r1
            n57 r2 = new n57
            java.lang.String r3 = r1.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TracerSDK/1.0.8 Lib/"
            r4.<init>(r5)
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = " App/"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            java.lang.String r3 = "http.agent"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            java.lang.String r3 = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)"
        L_0x00da:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            int r0 = r0.a
            r2.<init>(r0, r1, r3)
            return r2
        L_0x00e7:
            rof r1 = new rof
            java.lang.Object r0 = r0.b
            yof r0 = (defpackage.yof) r0
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            xof r0 = (defpackage.xof) r0
            r1.<init>(r0)
            return r1
        L_0x00f9:
            java.lang.Object r0 = r0.b
            rof r0 = (defpackage.rof) r0
            ekd r0 = r0.b
            r0.getClass()
            java.lang.String r0 = "ru.ok.tracer.lite.crash.report"
            kotlin.random.Random$Default r1 = kotlin.random.Random.Default     // Catch:{ all -> 0x0133 }
            int r1 = r1.nextInt()     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "0"
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0133 }
            int r1 = r1 * r2
            int r1 = r1 + 46
            char r1 = (char) r1     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r2.<init>(r0)     // Catch:{ all -> 0x0133 }
            r2.append(r1)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "SeemsUnused"
            r2.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0133 }
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0133 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0133 }
            r0 = r0 ^ r4
            goto L_0x0134
        L_0x0133:
            r0 = r4
        L_0x0134:
            if (r0 == 0) goto L_0x013d
            kof r0 = defpackage.kof.a     // Catch:{ all -> 0x013a }
            r0 = r4
            goto L_0x013b
        L_0x013a:
            r0 = r3
        L_0x013b:
            if (r0 == 0) goto L_0x013e
        L_0x013d:
            r3 = r4
        L_0x013e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0143:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r0 = r0.b
            abe r0 = (defpackage.abe) r0
            r0.getClass()
            kotlin.jvm.functions.Function0 r0 = r0.a     // Catch:{ Exception -> 0x021e }
            java.lang.Object r0 = r0.invoke()     // Catch:{ Exception -> 0x021e }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x021e }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x021e }
            if (r5 != 0) goto L_0x0160
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x021e }
            goto L_0x0222
        L_0x0160:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x021e }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x021e }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x021e }
            r7.<init>(r0)     // Catch:{ Exception -> 0x021e }
            r6.<init>(r7)     // Catch:{ Exception -> 0x021e }
            r5.<init>(r6)     // Catch:{ Exception -> 0x021e }
            int r0 = r5.readInt()     // Catch:{ all -> 0x017b }
            if (r0 <= r4) goto L_0x017f
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ all -> 0x017b }
            goto L_0x0213
        L_0x017b:
            r0 = move-exception
            r2 = r0
            goto L_0x0217
        L_0x017f:
            int r0 = r5.readInt()     // Catch:{ all -> 0x017b }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            if (r4 > r0) goto L_0x0212
            r7 = r4
        L_0x018b:
            java.lang.String r8 = r5.readUTF()     // Catch:{ all -> 0x017b }
            int r9 = r5.readInt()     // Catch:{ all -> 0x017b }
            switch(r9) {
                case 1: goto L_0x0206;
                case 2: goto L_0x01fd;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01eb;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01b5;
                default: goto L_0x0196;
            }     // Catch:{ all -> 0x017b }
        L_0x0196:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r2.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "Read unknown type "
            r2.append(r3)     // Catch:{ all -> 0x017b }
            r2.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r3 = " with key "
            r2.append(r3)     // Catch:{ all -> 0x017b }
            r2.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017b }
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x01b5:
            int r9 = r5.readInt()     // Catch:{ all -> 0x017b }
            int r10 = r5.readInt()     // Catch:{ all -> 0x017b }
            r11 = r3
        L_0x01be:
            if (r11 >= r10) goto L_0x01d6
            r5.readUTF()     // Catch:{ all -> 0x017b }
            r5.readLong()     // Catch:{ all -> 0x017b }
            r5.readUTF()     // Catch:{ all -> 0x017b }
            r5.readUTF()     // Catch:{ all -> 0x017b }
            r5.readLong()     // Catch:{ all -> 0x017b }
            if (r9 != r4) goto L_0x01d4
            r5.readInt()     // Catch:{ all -> 0x017b }
        L_0x01d4:
            int r11 = r11 + r4
            goto L_0x01be
        L_0x01d6:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x01d9:
            double r9 = r5.readDouble()     // Catch:{ all -> 0x017b }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x01e2:
            float r9 = r5.readFloat()     // Catch:{ all -> 0x017b }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x01eb:
            long r9 = r5.readLong()     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x01f4:
            int r9 = r5.readInt()     // Catch:{ all -> 0x017b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x01fd:
            boolean r9 = r5.readBoolean()     // Catch:{ all -> 0x017b }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x017b }
            goto L_0x020a
        L_0x0206:
            java.lang.String r9 = r5.readUTF()     // Catch:{ all -> 0x017b }
        L_0x020a:
            r6.put(r8, r9)     // Catch:{ all -> 0x017b }
            if (r7 == r0) goto L_0x0212
            int r7 = r7 + r4
            goto L_0x018b
        L_0x0212:
            r0 = r6
        L_0x0213:
            kotlin.io.CloseableKt.closeFinally(r5, r2)     // Catch:{ Exception -> 0x021e }
            goto L_0x0222
        L_0x0217:
            throw r2     // Catch:{ all -> 0x0218 }
        L_0x0218:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r5, r2)     // Catch:{ Exception -> 0x021e }
            throw r3     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L_0x0222:
            r1.<init>(r0)
            return r1
        L_0x0226:
            java.lang.Object r0 = r0.b
            q2 r0 = (defpackage.q2) r0
            java.lang.String r1 = r0.F()
            java.lang.Object r0 = r0.a
            i6d r0 = (defpackage.i6d) r0
            gf6 r0 = r0.d(r1)
            return r0
        L_0x0237:
            java.lang.Object r0 = r0.b
            kxd r0 = (defpackage.kxd) r0
            android.content.Context r0 = r0.a
            java.lang.String r1 = defpackage.o54.r()
            java.lang.String r2 = r0.getPackageName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x024e
            java.lang.String r1 = "tracer"
            goto L_0x0268
        L_0x024e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)
            r3 = 58
            r4 = 45
            java.lang.String r1 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r1, (char) r3, (char) r4, false, 4, (java.lang.Object) null)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0268:
            java.io.File r2 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            r2.<init>(r0, r1)
            defpackage.f6e.y(r2)
            java.lang.String r0 = "session.data"
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r0)
            return r0
        L_0x027b:
            java.lang.Object r0 = r0.b
            hbg r0 = (defpackage.hbg) r0
            androidx.lifecycle.SavedStateHandlesVM r0 = defpackage.b59.F(r0)
            return r0
        L_0x0284:
            java.lang.Object r0 = r0.b
            mtc r0 = (defpackage.mtc) r0
            jw6 r0 = r0.d
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x029d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02b9
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            if (r2 == 0) goto L_0x02b1
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.add(r2)
            goto L_0x029d
        L_0x02b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            return r1
        L_0x02ba:
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x02bf:
            java.lang.Object r0 = r0.b
            ef6 r0 = (defpackage.ef6) r0
            java.lang.String r2 = r0.b
            if (r2 == 0) goto L_0x02ee
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x02ee
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r0.a
            java.io.File r3 = r3.getNoBackupFilesDir()
            java.lang.String r4 = r0.b
            r2.<init>(r3, r4)
            df6 r3 = new df6
            java.lang.String r7 = r2.getAbsolutePath()
            rt6 r8 = new rt6
            r8.<init>((int) r1)
            ty r9 = r0.c
            boolean r10 = r0.v
            android.content.Context r6 = r0.a
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0303
        L_0x02ee:
            df6 r3 = new df6
            rt6 r14 = new rt6
            r14.<init>((int) r1)
            ty r15 = r0.c
            boolean r1 = r0.v
            android.content.Context r12 = r0.a
            java.lang.String r13 = r0.b
            r11 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0303:
            boolean r0 = r0.x
            r3.setWriteAheadLoggingEnabled(r0)
            return r3
        L_0x0309:
            java.lang.Object r0 = r0.b
            x04 r0 = (defpackage.x04) r0
            r0.m = r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0312:
            java.lang.Object r0 = r0.b
            com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl r0 = (com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ve(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, MenuItem menuItem) {
        super(0);
        this.a = 0;
        this.b = androidXLifecycleHandlerImpl;
    }
}
