package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.transfer.exceptions.TamHttpErrorException;
import ru.ok.tamtam.errors.TamErrorException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUploadFileAttachWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileAttachWorker.kt\nru/ok/tamtam/upload/workers/UploadFileAttachWorker\n+ 2 ConnectionInfo.kt\nru/ok/tamtam/ConnectionInfoKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 Log.kt\nru/ok/tamtam/logger/Log\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,534:1\n31#2:535\n32#2,5:545\n51#2:550\n52#2,6:552\n351#3,9:536\n360#3,2:558\n5#4:551\n32#5,4:560\n32#5,4:564\n32#5,4:568\n32#5,4:572\n32#5,4:576\n1#6:580\n*S KotlinDebug\n*F\n+ 1 UploadFileAttachWorker.kt\nru/ok/tamtam/upload/workers/UploadFileAttachWorker\n*L\n85#1:535\n85#1:545,5\n85#1:550\n85#1:552,6\n85#1:536,9\n85#1:558,2\n85#1:551\n87#1:560,4\n90#1:564,4\n121#1:568,4\n135#1:572,4\n171#1:576,4\n*E\n"})
public final class UploadFileAttachWorker extends ForegroundWorker {
    public volatile d08 A0;
    public final Lazy X = LazyKt.lazy(new ayf(this, 5));
    public final Lazy Y = LazyKt.lazy(new ayf(this, 6));
    public final Lazy Z = LazyKt.lazy(new ayf(this, 7));
    public final Lazy a = LazyKt.lazy(new ayf(this, 0));
    public final Lazy b = LazyKt.lazy(new ayf(this, 11));
    public final Lazy c = LazyKt.lazy(new ayf(this, 12));
    public final Lazy o = LazyKt.lazy(new ayf(this, 13));
    public final Lazy v = LazyKt.lazy(new ayf(this, 14));
    public final Lazy v0 = LazyKt.lazy(new ayf(this, 8));
    public final Lazy w = LazyKt.lazy(new ayf(this, 1));
    public final Lazy w0 = LazyKt.lazy(new ayf(this, 9));
    public final Lazy x = LazyKt.lazy(new ayf(this, 2));
    public final Lazy x0 = LazyKt.lazy(new ayf(this, 10));
    public final Lazy y = LazyKt.lazy(new ayf(this, 3));
    public or7 y0;
    public final Lazy z = LazyKt.lazy(new ayf(this, 4));
    public volatile float z0 = -1.0f;

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final qf9 c() {
        return (qf9) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        Object obj;
        String string;
        PendingIntent c2 = dpg.d(getApplicationContext()).c(getId());
        a32 G = ((r62) this.x.getValue()).G(c().a.b);
        if (G == null) {
            z68.f("UploadFileAttachWorker", "chat is null in getForegroundInfo!", (Throwable) null);
            h();
            this.A0 = d08.a();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(new File(c().b).getName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = "";
        }
        String i = g63.i(getApplicationContext().getString(((lm5) this.Y.getValue()).h), " ", (String) obj);
        lm5 lm5 = (lm5) this.Y.getValue();
        long j = c().a.b;
        if (G == null || (string = G.r()) == null) {
            string = getApplicationContext().getString(((lm5) this.Y.getValue()).h);
        }
        return new o96(c().a.hashCode(), lm5.b(j, (Long) null, (Long) null, string, G == null ? null : i, MathKt.roundToInt(this.z0), true, c2), 1);
    }

    public final fa9 d() {
        return (fa9) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            r0 = 2
            boolean r1 = r9 instanceof defpackage.cyf
            if (r1 == 0) goto L_0x0014
            r1 = r9
            cyf r1 = (defpackage.cyf) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x0019
        L_0x0014:
            cyf r1 = new cyf
            r1.<init>(r8, r9)
        L_0x0019:
            java.lang.Object r9 = r1.b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.o
            r4 = 3
            r5 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 == r5) goto L_0x003d
            if (r3 == r0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00fc
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00db
        L_0x003d:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r8 = r1.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Lazy r9 = r8.x0
            java.lang.Object r9 = r9.getValue()
            rh3 r9 = (defpackage.rh3) r9
            r1.a = r8
            r1.getClass()
            r1.o = r5
            lw1 r3 = new lw1
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r3.<init>(r5, r6)
            r3.u()
            boolean r5 = r9.e()
            if (r5 == 0) goto L_0x0073
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)
            r3.resumeWith(r9)
            goto L_0x0090
        L_0x0073:
            th3 r5 = new th3
            r5.<init>(r9, r3)
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "Network connection lost, waiting network."
            defpackage.z68.c(r6, r7, new java.lang.Object[0])
            r9.c(r5)
            ak2 r6 = new ak2
            r6.<init>(r0, r9, r5)
            r3.k(r6)
        L_0x0090:
            java.lang.Object r9 = r3.t()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r3) goto L_0x009d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
        L_0x009d:
            if (r9 != r2) goto L_0x00a0
            return r2
        L_0x00a0:
            kotlin.Lazy r9 = r8.Z
            java.lang.Object r9 = r9.getValue()
            jtb r9 = (defpackage.jtb) r9
            ltb r9 = (defpackage.ltb) r9
            vj5 r9 = r9.e
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f88newuploaderenabled
            r5 = 0
            boolean r9 = r9.m(r3, r5)
            java.lang.String r3 = "UploadFileAttachWorker"
            r5 = 0
            if (r9 == 0) goto L_0x00dc
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x00c0
            goto L_0x00cd
        L_0x00c0:
            boolean r4 = r9.c()
            if (r4 == 0) goto L_0x00cd
            w78 r4 = defpackage.w78.o
            java.lang.String r6 = "doForegroundWork: Using new uploader"
            r9.d(r4, r3, r6, r5)
        L_0x00cd:
            r1.a = r5
            r1.getClass()
            r1.o = r0
            java.lang.Object r9 = r8.k(r1)
            if (r9 != r2) goto L_0x00db
            return r2
        L_0x00db:
            return r9
        L_0x00dc:
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x00e1
            goto L_0x00ee
        L_0x00e1:
            boolean r0 = r9.c()
            if (r0 == 0) goto L_0x00ee
            w78 r0 = defpackage.w78.o
            java.lang.String r6 = "doForegroundWork: Using old uploader"
            r9.d(r0, r3, r6, r5)
        L_0x00ee:
            r1.a = r5
            r1.getClass()
            r1.o = r4
            java.lang.Object r9 = r8.l(r1)
            if (r9 != r2) goto L_0x00fc
            return r2
        L_0x00fc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        z68.g("UploadFileAttachWorker", "onUploadFailed: %s", c().a, th);
        if (th instanceof TamHttpErrorException) {
            long j = c().a.b;
            ((sv0) this.c.getValue()).c(new ko5(((TamHttpErrorException) th).a));
        } else if (th instanceof TamErrorException) {
            ((sv0) this.c.getValue()).c(new hj0(((TamErrorException) th).a));
        }
        this.z0 = -1.0f;
        ha9 r = d().r(c().a.a);
        if (r == null || r.Y == qe9.DELETED) {
            z68.f("UploadFileAttachWorker", "failMessageUpload: message is deleted", (Throwable) null);
        } else {
            d().z(r, oa9.ERROR);
            d().x(c().a.a, c().a.c, new hxf(1));
            ((sv0) this.c.getValue()).c(new twf(0, c().a.b, c().a.a));
        }
        rvd.A((jqg) this.v.getValue());
        h();
        ((gl5) this.w.getValue()).a(c().a.a);
        this.A0 = d08.a();
    }

    public final void g(tf9 tf9) {
        w28 w28;
        z68.c("UploadFileAttachWorker", "onUploadUpdate %s", tf9);
        bxf bxf = tf9.a;
        wyf wyf = bxf.g;
        if (bxf.a()) {
            z68.c("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", c().a, tf9);
            long j = c().a.a;
            String str = c().a.c;
            long j2 = c().a.b;
            d().x(j, str, new nxf(tf9, 2));
            ((h00) this.w0.getValue()).a(new cqc(j, tf9.a.f));
            h();
            ((sv0) this.c.getValue()).c(new twf(0, j2, j));
            rvd.A((jqg) this.v.getValue());
            this.A0 = d08.b();
        } else if (wyf == wyf.UPLOADING) {
            z68.c("UploadFileAttachWorker", "onUploadProgress %s, %s", c(), tf9);
            long j3 = c().a.a;
            String str2 = c().a.c;
            long j4 = c().a.b;
            ha9 r = d().r(c().a.a);
            if (!(r == null || r.Y == qe9.DELETED || (w28 = r.x0) == null || w28.G() <= 0)) {
                for (l20 l20 : (List) w28.b) {
                    if (Intrinsics.areEqual((Object) l20.q, (Object) c().a.c)) {
                        bxf bxf2 = tf9.a;
                        i(ev0.a(bxf2.a.c));
                        this.z0 = bxf2.e;
                        d().x(j3, str2, new gxf(bxf2, 2));
                        ((h00) this.w0.getValue()).a(new dqc(bxf2.e, j3, bxf2.f));
                        ((sv0) this.c.getValue()).c(new twf(0, j4, j3));
                        return;
                    }
                }
            }
            z68.n("UploadFileAttachWorker", (IOException) null, "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", Arrays.copyOf(new Object[]{c()}, 1));
            h();
            this.A0 = d08.a();
        } else {
            Throwable th = new Throwable("Internal error. Unknown upload state");
            z68.h("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", c().a, tf9);
            e(th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadFileAttachWorker" : e;
    }

    public final void h() {
        z68.c("UploadFileAttachWorker", "removeUpload %s", c());
        z68.c("UploadFileAttachWorker", "stopTyping %s", c());
        a32 G = ((r62) this.x.getValue()).G(c().a.b);
        if (G != null) {
            long j = G.b.a;
            long j2 = c().a.a;
            ((d6b) this.y.getValue()).getClass();
            d6b.b(j, j2);
        }
        or7 or7 = this.y0;
        if (or7 != null) {
            qq4.a(or7);
        }
        try {
            new na3(4, ((yf9) this.b.getValue()).b(), new td8(19, c().a)).a();
            z68.c("UploadFileAttachWorker", "removeUploadFromStorage: success %s", c());
        } catch (Throwable th) {
            z68.f("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
    }

    public final void i(b10 b10) {
        z68.c("UploadFileAttachWorker", "sendTyping %s", c());
        a32 G = ((r62) this.x.getValue()).G(c().a.b);
        if (G != null) {
            ((d6b) this.y.getValue()).f(G.b.a, b10, c().a.a);
        }
    }

    public final void j() {
        z68.c("UploadFileAttachWorker", "startUpload", new Object[0]);
        b10 a2 = ev0.a(c().d);
        if (a2 == b10.UNKNOWN) {
            e(new Throwable("Internal error. Unknown attach type for upload type"));
            return;
        }
        i(a2);
        lja s = ((lyf) this.z.getValue()).a(c()).s(xfd.d);
        or7 or7 = new or7(new xga(10, this), new nob((Object) this), m58.e);
        s.a(or7);
        this.y0 = or7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 3
            r3 = 1
            boolean r4 = r1 instanceof defpackage.fyf
            if (r4 == 0) goto L_0x0019
            r4 = r1
            fyf r4 = (defpackage.fyf) r4
            int r5 = r4.v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.v = r5
            goto L_0x001e
        L_0x0019:
            fyf r4 = new fyf
            r4.<init>(r0, r1)
        L_0x001e:
            java.lang.Object r1 = r4.c
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.v
            java.lang.String r7 = "UploadFileAttachWorker"
            r8 = 0
            r9 = 2
            if (r6 == 0) goto L_0x0047
            if (r6 == r3) goto L_0x0041
            if (r6 != r9) goto L_0x0039
            long r2 = r4.b
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r4.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0191
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r4.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0083
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r1)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x005c
            w78 r6 = defpackage.w78.o
            java.lang.String r10 = "Started foreground uploading"
            r1.d(r6, r7, r10, r8)
        L_0x005c:
            r4.a = r0
            r4.v = r3
            kotlin.Lazy r1 = r0.v0
            java.lang.Object r1 = r1.getValue()
            gaf r1 = (defpackage.gaf) r1
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            eyf r6 = new eyf
            r6.<init>(r0, r8)
            java.lang.Object r1 = defpackage.ev0.I(r1, r6, r4)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r6) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0080:
            if (r1 != r5) goto L_0x0083
            return r5
        L_0x0083:
            qf9 r1 = r0.c()
            xyf r1 = r1.d
            b10 r1 = defpackage.ev0.a(r1)
            b10 r6 = defpackage.b10.UNKNOWN
            if (r1 != r6) goto L_0x00ac
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown attach type for upload type"
            r1.<init>(r2)
            r0.e(r1)
            d08 r0 = r0.A0
            if (r0 == 0) goto L_0x00a0
            return r0
        L_0x00a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            r0.i(r1)
            long r14 = java.lang.System.currentTimeMillis()
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            r10 = -1
            r1.element = r10
            kotlin.Lazy r6 = r0.X
            java.lang.Object r6 = r6.getValue()
            l5f r6 = (defpackage.l5f) r6
            qf9 r10 = r0.c()
            r6.getClass()
            fs5 r11 = new fs5
            r11.<init>(r2, r10)
            j5f r12 = new j5f
            r12.<init>(r6, r8)
            on2 r11 = defpackage.bs0.D(r11, r12)
            zjb r12 = new zjb
            r13 = 12
            r12.<init>(r11, r6, r13)
            p2c r11 = new p2c
            kotlin.Lazy r13 = r6.b
            java.lang.Object r13 = r13.getValue()
            r18 = r13
            h5f r18 = (defpackage.h5f) r18
            java.lang.Class<h5f> r19 = defpackage.h5f.class
            java.lang.String r20 = "upload"
            r17 = 2
            java.lang.String r21 = "upload(Lone/me/sdk/transfer/domain/UploadData;)Lkotlinx/coroutines/flow/Flow;"
            r22 = 4
            r23 = 20
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            on2 r11 = defpackage.bs0.D(r12, r11)
            k5f r12 = new k5f
            r12.<init>(r6, r8)
            on2 r11 = defpackage.bs0.D(r11, r12)
            uu5 r12 = new uu5
            r13 = 11
            r12.<init>(r6, r10, r8, r13)
            wb r10 = new wb
            r13 = 15
            r10.<init>(r13, r11, r12)
            v4f r11 = new v4f
            r11.<init>(r6, r8, r3)
            wb r3 = new wb
            r12 = 16
            r3.<init>(r12, r10, r11)
            kotlin.Lazy r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.b()
            bs5 r3 = defpackage.bs0.F(r3, r6)
            gyf r6 = new gyf
            r6.<init>(r0, r8)
            ps5 r13 = new ps5
            r13.<init>(r3, r6, r2)
            p2c r2 = new p2c
            java.lang.String r3 = "onUploadUpdate(Lru/ok/tamtam/upload/messages/MessageUploadState;)V"
            r16 = 4
            r11 = 2
            java.lang.Class<ru.ok.tamtam.upload.workers.UploadFileAttachWorker> r6 = ru.ok.tamtam.upload.workers.UploadFileAttachWorker.class
            java.lang.String r17 = "onUploadUpdate"
            r18 = 22
            r10 = r2
            r12 = r0
            r9 = r13
            r13 = r6
            r24 = r14
            r14 = r17
            r15 = r3
            r17 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            ps5 r3 = new ps5
            r6 = 5
            r3.<init>(r9, r2, r6)
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            r2 = 500(0x1f4, float:7.0E-43)
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.MILLISECONDS
            long r9 = kotlin.time.DurationKt.toDuration((int) r2, (kotlin.time.DurationUnit) r6)
            g12 r2 = defpackage.gt5.d(r3, r9)
            qrb r3 = new qrb
            r6 = 17
            r3.<init>((java.lang.Object) r0, (kotlin.coroutines.Continuation) r8, (int) r6)
            vt5 r6 = new vt5
            r6.<init>(r2, r3)
            iyf r2 = new iyf
            r2.<init>(r0, r1)
            r4.a = r0
            r9 = r24
            r4.b = r9
            r1 = 2
            r4.v = r1
            java.lang.Object r1 = r6.e(r2, r4)
            if (r1 != r5) goto L_0x0190
            return r5
        L_0x0190:
            r2 = r9
        L_0x0191:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x019b
            goto L_0x01be
        L_0x019b:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01be
            w78 r2 = defpackage.w78.o
            d08 r3 = r0.A0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "doWork finish by "
            r6.<init>(r9)
            r6.append(r3)
            java.lang.String r3 = " and duration="
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r1.d(r2, r7, r3, r8)
        L_0x01be:
            d08 r0 = r0.A0
            if (r0 != 0) goto L_0x01c6
            a08 r0 = defpackage.d08.a()
        L_0x01c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016a A[Catch:{ all -> 0x004a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017d A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            boolean r2 = r0 instanceof defpackage.jyf
            if (r2 == 0) goto L_0x0017
            r2 = r0
            jyf r2 = (defpackage.jyf) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            jyf r2 = new jyf
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.x
            java.lang.String r5 = "UploadFileAttachWorker"
            r6 = 0
            r7 = -1
            r9 = 5
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 4
            if (r4 == 0) goto L_0x0087
            if (r4 == r12) goto L_0x0081
            if (r4 == r11) goto L_0x0078
            if (r4 == r10) goto L_0x0061
            if (r4 == r13) goto L_0x0055
            if (r4 != r9) goto L_0x004d
            long r14 = r2.o
            r16 = r14
            long r13 = r2.c
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x004a }
            r12 = r13
            r14 = r16
            goto L_0x016d
        L_0x004a:
            r0 = move-exception
            goto L_0x01ac
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            long r12 = r2.o
            long r14 = r2.c
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x004a }
            r7 = 4
            goto L_0x0153
        L_0x0061:
            long r12 = r2.o
            long r14 = r2.c
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.b
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r4 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0074 }
            r18 = r2
            r2 = r1
            r1 = r4
            r4 = r18
            goto L_0x013e
        L_0x0074:
            r0 = move-exception
            r1 = r4
            goto L_0x01ac
        L_0x0078:
            long r12 = r2.c
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0102
        L_0x0081:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00b6
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "doWork"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])     // Catch:{ all -> 0x004a }
            r2.a = r1     // Catch:{ all -> 0x004a }
            r2.x = r12     // Catch:{ all -> 0x004a }
            kotlin.Lazy r0 = r1.v0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x004a }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x004a }
            q04 r0 = r0.b()     // Catch:{ all -> 0x004a }
            eyf r4 = new eyf     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = defpackage.ev0.I(r0, r4, r2)     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x004a }
            if (r0 != r4) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004a }
        L_0x00b3:
            if (r0 != r3) goto L_0x00b6
            return r3
        L_0x00b6:
            r1.j()     // Catch:{ all -> 0x004a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            r14 = r7
        L_0x00be:
            d08 r0 = r1.A0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "progress =%f"
            float r4 = r1.z0     // Catch:{ all -> 0x004a }
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r4)     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x004a }
            defpackage.z68.c(r5, r0, r4)     // Catch:{ all -> 0x004a }
            float r0 = r1.z0     // Catch:{ all -> 0x004a }
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)     // Catch:{ all -> 0x004a }
            float r0 = (float) r0     // Catch:{ all -> 0x004a }
            boolean r0 = r1.needToShowNotification(r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0156
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            r2.a = r1     // Catch:{ all -> 0x004a }
            r2.c = r12     // Catch:{ all -> 0x004a }
            r2.x = r11     // Catch:{ all -> 0x004a }
            kotlin.Lazy r0 = r1.v0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x004a }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x004a }
            q04 r0 = r0.b()     // Catch:{ all -> 0x004a }
            dyf r4 = new dyf     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = defpackage.ev0.I(r0, r4, r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x004a }
            long r14 = r0.longValue()     // Catch:{ all -> 0x004a }
        L_0x0108:
            kotlin.Lazy r0 = r1.Z     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            jtb r0 = (defpackage.jtb) r0     // Catch:{ all -> 0x004a }
            ltb r0 = (defpackage.ltb) r0     // Catch:{ all -> 0x004a }
            cud r0 = r0.b     // Catch:{ all -> 0x004a }
            r0.getClass()     // Catch:{ all -> 0x004a }
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f64maxdownloadedsizefornotifykb     // Catch:{ all -> 0x004a }
            r7 = 1024(0x400, float:1.435E-42)
            long r7 = (long) r7     // Catch:{ all -> 0x004a }
            long r7 = r0.r(r4, r7)     // Catch:{ all -> 0x004a }
            int r0 = (int) r7     // Catch:{ all -> 0x004a }
            long r7 = (long) r0     // Catch:{ all -> 0x004a }
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r2.a = r1     // Catch:{ all -> 0x004a }
            r2.b = r1     // Catch:{ all -> 0x004a }
            r2.c = r12     // Catch:{ all -> 0x004a }
            r2.o = r14     // Catch:{ all -> 0x004a }
            r2.x = r10     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r1.getForegroundInfo(r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x0137
            return r3
        L_0x0137:
            r4 = r2
            r2 = r1
            r18 = r12
            r12 = r14
            r14 = r18
        L_0x013e:
            o96 r0 = (defpackage.o96) r0     // Catch:{ all -> 0x004a }
            r4.a = r1     // Catch:{ all -> 0x004a }
            r4.b = r6     // Catch:{ all -> 0x004a }
            r4.c = r14     // Catch:{ all -> 0x004a }
            r4.o = r12     // Catch:{ all -> 0x004a }
            r7 = 4
            r4.x = r7     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r2.setForeground(r0, r4)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x0152
            return r3
        L_0x0152:
            r2 = r4
        L_0x0153:
            r7 = r12
            r13 = r14
            goto L_0x0158
        L_0x0156:
            r7 = r14
            r13 = r12
        L_0x0158:
            long r10 = r1.getWorkDelay()     // Catch:{ all -> 0x004a }
            r2.a = r1     // Catch:{ all -> 0x004a }
            r2.c = r13     // Catch:{ all -> 0x004a }
            r2.o = r7     // Catch:{ all -> 0x004a }
            r2.x = r9     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = defpackage.xk4.b(r10, r2)     // Catch:{ all -> 0x004a }
            if (r10 != r3) goto L_0x016b
            return r3
        L_0x016b:
            r12 = r13
            r14 = r7
        L_0x016d:
            r7 = -1
            r10 = 3
            r11 = 2
            goto L_0x00be
        L_0x0173:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            long r2 = r2 - r12
            a67 r0 = defpackage.z68.b     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x017d
            goto L_0x01a3
        L_0x017d:
            boolean r4 = r0.c()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x01a3
            w78 r4 = defpackage.w78.o     // Catch:{ all -> 0x004a }
            d08 r7 = r1.A0     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r8.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r9 = "doWork finish by "
            r8.append(r9)     // Catch:{ all -> 0x004a }
            r8.append(r7)     // Catch:{ all -> 0x004a }
            java.lang.String r7 = " and duration="
            r8.append(r7)     // Catch:{ all -> 0x004a }
            r8.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x004a }
            r0.d(r4, r5, r2, r6)     // Catch:{ all -> 0x004a }
        L_0x01a3:
            d08 r0 = r1.A0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x01bc
            a08 r0 = defpackage.d08.a()     // Catch:{ all -> 0x004a }
            goto L_0x01bc
        L_0x01ac:
            java.lang.String r2 = "cancelled!"
            defpackage.z68.f(r5, r2, r0)
            or7 r0 = r1.y0
            if (r0 == 0) goto L_0x01b8
            defpackage.qq4.a(r0)
        L_0x01b8:
            a08 r0 = defpackage.d08.a()
        L_0x01bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.l(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
