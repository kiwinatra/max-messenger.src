package defpackage;

import android.os.Handler;
import androidx.work.WorkRequest;
import com.my.tracker.personalize.PersonalizeApiClient;
import com.my.tracker.personalize.PersonalizeRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: po1  reason: default package */
public final /* synthetic */ class po1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ po1(dpg dpg, String str, ata ata, lqg lqg, WorkRequest workRequest) {
        this.a = 11;
        this.w = dpg;
        this.o = str;
        this.c = ata;
        this.b = lqg;
        this.v = workRequest;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Throwable, one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.getClass();
        r0 = defpackage.kof.a;
        defpackage.kof.b().a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        r5.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0159 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            r2 = 21
            r3 = 0
            r4 = 0
            r5 = 1
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x03f9;
                case 1: goto L_0x03e1;
                case 2: goto L_0x03bb;
                case 3: goto L_0x033a;
                case 4: goto L_0x02ed;
                case 5: goto L_0x0223;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01bc;
                case 8: goto L_0x016b;
                case 9: goto L_0x0101;
                case 10: goto L_0x00cd;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r1.w
            dpg r0 = (defpackage.dpg) r0
            androidx.work.impl.WorkDatabase r2 = r0.c
            ypg r2 = r2.y()
            java.lang.Object r3 = r1.o
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r4 = r2.n(r3)
            int r6 = r4.size()
            java.lang.Object r7 = r1.c
            ata r7 = (defpackage.ata) r7
            if (r6 <= r5) goto L_0x0039
            r4b r0 = new r4b
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't apply UPDATE policy to the chains of work."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.z(r0)
            goto L_0x00cc
        L_0x0039:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            vpg r4 = (defpackage.vpg) r4
            java.lang.Object r5 = r1.b
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            if (r4 != 0) goto L_0x004a
            r5.invoke()
            goto L_0x00cc
        L_0x004a:
            java.lang.String r6 = r4.a
            xpg r8 = r2.m(r6)
            if (r8 != 0) goto L_0x006a
            r4b r0 = new r4b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "WorkSpec with "
            java.lang.String r4 = ", that matches a name \""
            java.lang.String r5 = "\", wasn't found"
            java.lang.String r2 = defpackage.rae.p(r2, r6, r4, r3, r5)
            r1.<init>(r2)
            r0.<init>(r1)
            r7.z(r0)
            goto L_0x00cc
        L_0x006a:
            boolean r3 = r8.d()
            if (r3 != 0) goto L_0x0080
            r4b r0 = new r4b
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.z(r0)
            goto L_0x00cc
        L_0x0080:
            xog r3 = defpackage.xog.w
            xog r8 = r4.b
            if (r8 != r3) goto L_0x008d
            r2.e(r6)
            r5.invoke()
            goto L_0x00cc
        L_0x008d:
            java.lang.Object r1 = r1.v
            androidx.work.WorkRequest r1 = (androidx.work.WorkRequest) r1
            xpg r8 = r1.getWorkSpec()
            java.lang.String r9 = r4.a
            r14 = 0
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 1048574(0xffffe, float:1.469365E-39)
            xpg r22 = defpackage.xpg.b(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            rvb r2 = r0.f     // Catch:{ all -> 0x00c3 }
            androidx.work.impl.WorkDatabase r3 = r0.c     // Catch:{ all -> 0x00c3 }
            ve3 r4 = r0.b     // Catch:{ all -> 0x00c3 }
            java.util.List r0 = r0.e     // Catch:{ all -> 0x00c3 }
            java.util.Set r23 = r1.getTags()     // Catch:{ all -> 0x00c3 }
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r0
            defpackage.j4b.h0(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00c3 }
            t4b r0 = defpackage.u4b.U     // Catch:{ all -> 0x00c3 }
            r7.z(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00cc
        L_0x00c3:
            r0 = move-exception
            r4b r1 = new r4b
            r1.<init>(r0)
            r7.z(r1)
        L_0x00cc:
            return
        L_0x00cd:
            java.lang.Object r0 = r1.w
            r3g r0 = (defpackage.r3g) r0
            su1 r2 = r0.c()
            java.lang.Object r3 = r1.c
            su1 r3 = (defpackage.su1) r3
            if (r3 != r2) goto L_0x0100
            java.lang.Object r2 = r1.b
            q3f r2 = (defpackage.q3f) r2
            z3f r2 = r2.d(r3, r5)
            r0.t = r2
            la0 r2 = defpackage.s3g.b
            java.lang.Object r3 = r1.o
            s3g r3 = (defpackage.s3g) r3
            java.lang.Object r2 = r3.n(r2)
            h7g r2 = (defpackage.h7g) r2
            java.util.Objects.requireNonNull(r2)
            z3f r3 = r0.t
            java.lang.Object r1 = r1.v
            xjf r1 = (defpackage.xjf) r1
            r2.f(r3, r1)
            r0.N()
        L_0x0100:
            return
        L_0x0101:
            java.lang.Object r0 = r1.w
            d19 r0 = (defpackage.d19) r0
            java.lang.Object r2 = r1.b
            lxd r2 = (defpackage.lxd) r2
            java.lang.Object r3 = r1.c
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r5 = r1.o
            android.os.ConditionVariable r5 = (android.os.ConditionVariable) r5
            java.lang.Object r1 = r1.v
            kxd r1 = (defpackage.kxd) r1
            kof r6 = defpackage.kof.a     // Catch:{ Exception -> 0x0159 }
            kotlin.Lazy r6 = defpackage.kof.h     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x0159 }
            n57 r6 = (defpackage.n57) r6     // Catch:{ Exception -> 0x0159 }
            i57 r6 = r6.b(r0)     // Catch:{ Exception -> 0x0159 }
            int r0 = r6.b     // Catch:{ all -> 0x0136 }
            java.io.Closeable r7 = r6.o     // Catch:{ all -> 0x0136 }
            mm5 r7 = (defpackage.mm5) r7     // Catch:{ all -> 0x0136 }
            if (r7 == 0) goto L_0x0139
            java.lang.Object r7 = r7.c     // Catch:{ all -> 0x0136 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0136 }
            if (r7 == 0) goto L_0x0139
            java.lang.String r7 = kotlin.text.StringsKt.decodeToString(r7)     // Catch:{ all -> 0x0136 }
            goto L_0x013a
        L_0x0136:
            r0 = move-exception
            r1 = r0
            goto L_0x0152
        L_0x0139:
            r7 = r4
        L_0x013a:
            java.lang.String r8 = "CRASH_FREE"
            defpackage.s9a.i(r7, r8, r4)     // Catch:{ all -> 0x0136 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 == r7) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            r1.a()     // Catch:{ all -> 0x0136 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0136 }
        L_0x0149:
            kotlin.io.CloseableKt.closeFinally(r6, r4)     // Catch:{ Exception -> 0x0159 }
        L_0x014c:
            r5.open()
            goto L_0x0166
        L_0x0150:
            r0 = move-exception
            goto L_0x0167
        L_0x0152:
            throw r1     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
            r4 = r0
            kotlin.io.CloseableKt.closeFinally(r6, r1)     // Catch:{ Exception -> 0x0159 }
            throw r4     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            r2.getClass()     // Catch:{ all -> 0x0150 }
            kof r0 = defpackage.kof.a     // Catch:{ all -> 0x0150 }
            gx4 r0 = defpackage.kof.b()     // Catch:{ all -> 0x0150 }
            r0.a(r3)     // Catch:{ all -> 0x0150 }
            goto L_0x014c
        L_0x0166:
            return
        L_0x0167:
            r5.open()
            throw r0
        L_0x016b:
            java.lang.Object r0 = r1.w
            r11 = r0
            ktd r11 = (defpackage.ktd) r11
            java.util.Map r10 = r11.A()
            java.lang.Object r0 = r1.c
            r8 = r0
            org.webrtc.StatsReport[] r8 = (org.webrtc.StatsReport[]) r8
            int r0 = r8.length
            qr0[] r9 = new defpackage.qr0[r0]
            r0 = r3
        L_0x017d:
            int r2 = r8.length
            if (r0 >= r2) goto L_0x01ae
            java.lang.Object r2 = r1.o
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r0)
            wsg r2 = (defpackage.wsg) r2
            boolean r6 = r2.b
            if (r6 == 0) goto L_0x0196
            qr0 r2 = new qr0
            r2.<init>((java.lang.Object) r4, (boolean) r5)
            r9[r0] = r2
            goto L_0x01ac
        L_0x0196:
            boolean r6 = r2.c
            if (r6 == 0) goto L_0x019f
            ef1 r2 = r11.Y
            ye1 r2 = r2.a
            goto L_0x01a5
        L_0x019f:
            ue1 r2 = r2.a
            ye1 r2 = r11.z(r2)
        L_0x01a5:
            qr0 r6 = new qr0
            r6.<init>((java.lang.Object) r2, (boolean) r3)
            r9[r0] = r6
        L_0x01ac:
            int r0 = r0 + r5
            goto L_0x017d
        L_0x01ae:
            java.lang.Object r0 = r1.v
            r6 = r0
            xne r6 = (defpackage.xne) r6
            java.lang.Object r0 = r1.b
            r7 = r0
            org.webrtc.StatsReport[] r7 = (org.webrtc.StatsReport[]) r7
            r6.a(r7, r8, r9, r10, r11)
            return
        L_0x01bc:
            java.lang.Object r0 = r1.c
            android.os.Handler r0 = (android.os.Handler) r0
            java.lang.Object r2 = r1.v
            com.my.tracker.personalize.PersonalizeApiClient$OnCompleteListener r2 = (com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r2
            java.lang.Object r3 = r1.w
            com.my.tracker.personalize.PersonalizeApiClient r3 = (com.my.tracker.personalize.PersonalizeApiClient) r3
            java.lang.Object r4 = r1.o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.b
            com.my.tracker.personalize.PersonalizeRequest r1 = (com.my.tracker.personalize.PersonalizeRequest) r1
            r3.a((java.lang.String) r4, (com.my.tracker.personalize.PersonalizeRequest) r1, (android.os.Handler) r0, (com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r2)
            return
        L_0x01d4:
            java.lang.Object r0 = r1.w
            r2 = r0
            d19 r2 = (defpackage.d19) r2
            java.lang.Object r0 = r1.b
            lrf r0 = (defpackage.lrf) r0
            java.lang.Object r3 = r1.c
            gd3 r3 = (defpackage.gd3) r3
            java.lang.Object r5 = r1.o
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.v
            c19 r1 = (defpackage.c19) r1
            java.lang.Object r6 = r2.c
            java.lang.String r6 = (java.lang.String) r6
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x01f2
            goto L_0x01ff
        L_0x01f2:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x01ff
            w78 r8 = defpackage.w78.o
            java.lang.String r9 = "Transformer.startSafely"
            r7.d(r8, r6, r9, r4)
        L_0x01ff:
            r0.e(r3, r5)     // Catch:{ all -> 0x0203 }
            goto L_0x0222
        L_0x0203:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r2.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "Unexpected failure when start transformer"
            defpackage.z68.f(r0, r2, r3)
            one.me.sdk.media.transformer.MediaTransformException r0 = new one.me.sdk.media.transformer.MediaTransformException
            r0.<init>(r2, r3)
            java.lang.String r2 = r1.b
            java.lang.String r3 = "onError"
            defpackage.z68.f(r2, r3, r0)
            a19 r2 = r1.a
            r2.a(r0)
            r1.a()
        L_0x0222:
            return
        L_0x0223:
            java.lang.Object r0 = r1.w
            r6 = r0
            gy8 r6 = (defpackage.gy8) r6
            r6.getClass()
            java.lang.Object r0 = r1.b
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Object r7 = r1.c
            java.util.List r7 = (java.util.List) r7
            int r8 = r7.size()
            if (r0 != r8) goto L_0x02ec
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r3
        L_0x0243:
            java.lang.Object r0 = r1.o
            java.util.List r0 = (java.util.List) r0
            int r10 = r0.size()
            if (r9 >= r10) goto L_0x027b
            java.lang.Object r0 = r0.get(r9)
            zz7 r0 = (defpackage.zz7) r0
            if (r0 == 0) goto L_0x0262
            java.lang.Object r0 = defpackage.o5a.p(r0)     // Catch:{ CancellationException | ExecutionException -> 0x025c }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ CancellationException | ExecutionException -> 0x025c }
            goto L_0x0263
        L_0x025c:
            r0 = move-exception
            java.lang.String r10 = "Failed to get bitmap"
            defpackage.i8b.l(r0, r10)
        L_0x0262:
            r0 = r4
        L_0x0263:
            java.lang.Object r10 = r7.get(r9)
            ir8 r10 = (defpackage.ir8) r10
            zp8 r0 = defpackage.ft7.g(r10, r0)
            long r10 = defpackage.ft7.p(r9)
            mx8 r12 = new mx8
            r12.<init>(r4, r0, r10)
            r8.add(r12)
            int r9 = r9 + r5
            goto L_0x0243
        L_0x027b:
            int r0 = defpackage.v0g.a
            java.lang.Object r4 = r6.v
            iy8 r4 = (defpackage.iy8) r4
            if (r0 >= r2) goto L_0x02e7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r6 = r3
        L_0x028d:
            int r7 = r8.size()     // Catch:{ all -> 0x02a9 }
            if (r6 >= r7) goto L_0x02ab
            java.lang.Object r7 = r8.get(r6)     // Catch:{ all -> 0x02a9 }
            android.os.Parcelable r7 = (android.os.Parcelable) r7     // Catch:{ all -> 0x02a9 }
            r2.writeParcelable(r7, r3)     // Catch:{ all -> 0x02a9 }
            int r9 = r2.dataSize()     // Catch:{ all -> 0x02a9 }
            r10 = 262144(0x40000, float:3.67342E-40)
            if (r9 >= r10) goto L_0x02ab
            r0.add(r7)     // Catch:{ all -> 0x02a9 }
            int r6 = r6 + r5
            goto L_0x028d
        L_0x02a9:
            r0 = move-exception
            goto L_0x02e3
        L_0x02ab:
            r2.recycle()
            int r2 = r0.size()
            java.lang.Object r1 = r1.v
            jkf r1 = (defpackage.jkf) r1
            int r3 = r1.p()
            if (r2 == r3) goto L_0x02dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Sending "
            r2.<init>(r3)
            int r3 = r0.size()
            r2.append(r3)
            java.lang.String r3 = " items out of "
            r2.append(r3)
            int r1 = r1.p()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.i8b.F(r1)
        L_0x02dd:
            px8 r1 = r4.X
            defpackage.iy8.R(r1, r0)
            goto L_0x02ec
        L_0x02e3:
            r2.recycle()
            throw r0
        L_0x02e7:
            px8 r0 = r4.X
            defpackage.iy8.R(r0, r8)
        L_0x02ec:
            return
        L_0x02ed:
            java.lang.Object r0 = r1.w
            r11 = r0
            ap4 r11 = (defpackage.ap4) r11
            r11.getClass()
            java.lang.Object r0 = r1.c
            r8 = r0
            org.webrtc.StatsReport[] r8 = (org.webrtc.StatsReport[]) r8
            int r0 = r8.length
            qr0[] r9 = new defpackage.qr0[r0]
            ef1 r0 = r11.Y
            ye1 r0 = r0.a
            java.lang.Object r2 = r1.o
            ue1 r2 = (defpackage.ue1) r2
            ye1 r2 = r11.z(r2)
            r4 = r3
        L_0x030a:
            int r6 = r8.length
            if (r4 >= r6) goto L_0x032a
            r6 = r8[r4]
            java.lang.String r6 = r6.id
            java.lang.String r7 = "_recv"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x0321
            qr0 r6 = new qr0
            r6.<init>((java.lang.Object) r2, (boolean) r3)
            r9[r4] = r6
            goto L_0x0328
        L_0x0321:
            qr0 r6 = new qr0
            r6.<init>((java.lang.Object) r0, (boolean) r3)
            r9[r4] = r6
        L_0x0328:
            int r4 = r4 + r5
            goto L_0x030a
        L_0x032a:
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            java.lang.Object r0 = r1.v
            r6 = r0
            xne r6 = (defpackage.xne) r6
            java.lang.Object r0 = r1.b
            r7 = r0
            org.webrtc.StatsReport[] r7 = (org.webrtc.StatsReport[]) r7
            r6.a(r7, r8, r9, r10, r11)
            return
        L_0x033a:
            java.lang.Object r0 = r1.w
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            java.lang.Object r3 = r1.b
            e4 r3 = (defpackage.e4) r3
            java.lang.Object r6 = r1.c
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r7 = r1.o
            i70 r7 = (defpackage.i70) r7
            java.lang.Object r1 = r1.v
            bv1 r1 = (defpackage.bv1) r1
            r0.flush()     // Catch:{ all -> 0x0387 }
            r0.release()     // Catch:{ all -> 0x0387 }
            if (r3 == 0) goto L_0x036c
            android.os.Looper r0 = r6.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x036c
            ir1 r0 = new ir1
            r0.<init>(r2, r3, r7)
            r6.post(r0)
        L_0x036c:
            r1.g()
            java.lang.Object r8 = defpackage.sc4.m0
            monitor-enter(r8)
            int r0 = defpackage.sc4.o0     // Catch:{ all -> 0x0381 }
            int r0 = r0 - r5
            defpackage.sc4.o0 = r0     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x0383
            java.util.concurrent.ExecutorService r0 = defpackage.sc4.n0     // Catch:{ all -> 0x0381 }
            r0.shutdown()     // Catch:{ all -> 0x0381 }
            defpackage.sc4.n0 = r4     // Catch:{ all -> 0x0381 }
            goto L_0x0383
        L_0x0381:
            r0 = move-exception
            goto L_0x0385
        L_0x0383:
            monitor-exit(r8)     // Catch:{ all -> 0x0381 }
            return
        L_0x0385:
            monitor-exit(r8)     // Catch:{ all -> 0x0381 }
            throw r0
        L_0x0387:
            r0 = move-exception
            if (r3 == 0) goto L_0x03a0
            android.os.Looper r8 = r6.getLooper()
            java.lang.Thread r8 = r8.getThread()
            boolean r8 = r8.isAlive()
            if (r8 == 0) goto L_0x03a0
            ir1 r8 = new ir1
            r8.<init>(r2, r3, r7)
            r6.post(r8)
        L_0x03a0:
            r1.g()
            java.lang.Object r2 = defpackage.sc4.m0
            monitor-enter(r2)
            int r1 = defpackage.sc4.o0     // Catch:{ all -> 0x03b5 }
            int r1 = r1 - r5
            defpackage.sc4.o0 = r1     // Catch:{ all -> 0x03b5 }
            if (r1 != 0) goto L_0x03b7
            java.util.concurrent.ExecutorService r1 = defpackage.sc4.n0     // Catch:{ all -> 0x03b5 }
            r1.shutdown()     // Catch:{ all -> 0x03b5 }
            defpackage.sc4.n0 = r4     // Catch:{ all -> 0x03b5 }
            goto L_0x03b7
        L_0x03b5:
            r0 = move-exception
            goto L_0x03b9
        L_0x03b7:
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            throw r0
        L_0x03b9:
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            throw r0
        L_0x03bb:
            java.lang.Object r0 = r1.w
            m7f r0 = (defpackage.m7f) r0
            r0.getClass()
            java.lang.Object r2 = r1.b
            kh3 r2 = (defpackage.kh3) r2
            zz7 r2 = r2.run()
            jh3 r3 = new jh3
            java.lang.Object r4 = r1.c
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            java.lang.Object r5 = r1.o
            lh3 r5 = (defpackage.lh3) r5
            java.lang.Object r1 = r1.v
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r3.<init>(r0, r4, r5, r1)
            dp4 r0 = defpackage.dp4.a
            r2.d(r3, r0)
            return
        L_0x03e1:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.v
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r3 = r1.b
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            java.lang.Object r4 = r1.c
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r1 = r1.w
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl r1 = (ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$8(r3, r4, r1, r0, r2)
            return
        L_0x03f9:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.v
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r3 = r1.w
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl r3 = (ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl) r3
            java.lang.Object r4 = r1.b
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r1 = r1.c
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.doOnOwnThread$lambda$8(r3, r4, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po1.run():void");
    }

    public /* synthetic */ po1(PersonalizeApiClient personalizeApiClient, String str, PersonalizeRequest personalizeRequest, Handler handler, PersonalizeApiClient.OnCompleteListener onCompleteListener) {
        this.a = 7;
        this.w = personalizeApiClient;
        this.o = str;
        this.b = personalizeRequest;
        this.c = handler;
        this.v = onCompleteListener;
    }

    public /* synthetic */ po1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.v = obj5;
    }

    public /* synthetic */ po1(Function0 function0, Function0 function02, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, Function1 function1) {
        this.a = 1;
        this.b = function0;
        this.c = function02;
        this.w = callsAudioManagerV3Impl;
        this.o = str;
        this.v = function1;
    }
}
