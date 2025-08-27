package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadExternalGifWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "xxf", "txf", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadExternalGifWorker extends ForegroundWorker {
    public final Lazy X = LazyKt.lazy(new rxf(this, 3));
    public final Lazy Y = LazyKt.lazy(new rxf(this, 4));
    public final Lazy Z = LazyKt.lazy(new rxf(this, 5));
    public final Lazy a = LazyKt.lazy(new rxf(this, 0));
    public final Lazy b = LazyKt.lazy(new rxf(this, 7));
    public final Lazy c = LazyKt.lazy(new rxf(this, 8));
    public final Lazy o = LazyKt.lazy(new rxf(this, 9));
    public final Lazy v = LazyKt.lazy(new rxf(this, 10));
    public final Lazy v0 = LazyKt.lazy(new rxf(this, 6));
    public final Lazy w = LazyKt.lazy(new rxf(this, 11));
    public long w0;
    public final Lazy x = LazyKt.lazy(new rxf(this, 12));
    public volatile xxf x0;
    public final Lazy y = LazyKt.lazy(new rxf(this, 1));
    public final zxf y0 = new zxf(this);
    public final Lazy z = LazyKt.lazy(new rxf(this, 2));

    public UploadExternalGifWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static final void c(UploadExternalGifWorker uploadExternalGifWorker) {
        a32 G = ((r62) uploadExternalGifWorker.v.getValue()).G(uploadExternalGifWorker.d().e);
        if (G != null) {
            long j = G.b.a;
            long j2 = uploadExternalGifWorker.d().d;
            ((d6b) uploadExternalGifWorker.x.getValue()).getClass();
            d6b.b(j, j2);
        }
        ((hm5) uploadExternalGifWorker.X.getValue()).b(((po5) ((ln5) uploadExternalGifWorker.c.getValue())).n(uploadExternalGifWorker.d().f));
    }

    public final Object createForegroundInfo(Continuation continuation) {
        Pair pair;
        String str;
        xxf xxf = this.x0;
        if (xxf instanceof wxf) {
            wxf wxf = (wxf) xxf;
            pair = TuplesKt.to(Boxing.boxFloat(wxf.a), Boxing.boxLong(wxf.b));
        } else {
            pair = TuplesKt.to(Boxing.boxFloat(-1.0f), Boxing.boxLong(0));
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        long longValue = ((Number) pair.component2()).longValue();
        PendingIntent c2 = dpg.d(getApplicationContext()).c(getId());
        a32 G = ((r62) this.v.getValue()).G(d().e);
        lm5 lm5 = (lm5) this.v0.getValue();
        long j = d().e;
        Long boxLong = Boxing.boxLong(longValue);
        Long boxLong2 = Boxing.boxLong(d().d);
        if (G == null || (str = G.r()) == null) {
            str = "";
        }
        return new o96(((Number) this.b.getValue()).intValue(), lm5.b(j, boxLong, boxLong2, str, getApplicationContext().getString(((lm5) this.v0.getValue()).g), (int) floatValue, false, c2), 1);
    }

    public final txf d() {
        return (txf) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0186 A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6 A[Catch:{ all -> 0x003c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c8 A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.yxf
            if (r2 == 0) goto L_0x0017
            r2 = r1
            yxf r2 = (defpackage.yxf) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001c
        L_0x0017:
            yxf r2 = new yxf
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.o
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.w
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker"
            if (r4 == 0) goto L_0x0060
            if (r4 == r7) goto L_0x0050
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            d08 r0 = r2.b
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x003c }
            r1 = r0
            r0 = r4
            goto L_0x00d7
        L_0x003c:
            r0 = move-exception
            goto L_0x01eb
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            d08 r0 = r2.b
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0188
        L_0x0050:
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r0 = r2.c
            d08 r4 = r2.b
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r9 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x003c }
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x0174
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = "doWork"
            defpackage.z68.c(r8, r1, new java.lang.Object[0])
            c08 r1 = defpackage.d08.b()
            kotlin.Lazy r4 = r0.v     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003c }
            r62 r4 = (defpackage.r62) r4     // Catch:{ all -> 0x003c }
            txf r9 = r17.d()     // Catch:{ all -> 0x003c }
            long r9 = r9.e     // Catch:{ all -> 0x003c }
            a32 r4 = r4.G(r9)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0098
            kotlin.Lazy r9 = r0.x     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003c }
            r10 = r9
            d6b r10 = (defpackage.d6b) r10     // Catch:{ all -> 0x003c }
            m72 r4 = r4.b     // Catch:{ all -> 0x003c }
            long r11 = r4.a     // Catch:{ all -> 0x003c }
            b10 r13 = defpackage.b10.PHOTO     // Catch:{ all -> 0x003c }
            txf r4 = r17.d()     // Catch:{ all -> 0x003c }
            long r14 = r4.d     // Catch:{ all -> 0x003c }
            r10.f(r11, r13, r14)     // Catch:{ all -> 0x003c }
        L_0x0098:
            kotlin.Lazy r4 = r0.c     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003c }
            ln5 r4 = (defpackage.ln5) r4     // Catch:{ all -> 0x003c }
            txf r9 = r17.d()     // Catch:{ all -> 0x003c }
            java.lang.String r9 = r9.f     // Catch:{ all -> 0x003c }
            po5 r4 = (defpackage.po5) r4     // Catch:{ all -> 0x003c }
            java.io.File r4 = r4.n(r9)     // Catch:{ all -> 0x003c }
            boolean r9 = defpackage.cjf.o(r4)     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x00b8
            zxf r9 = r0.y0     // Catch:{ all -> 0x003c }
            r9.j(r4)     // Catch:{ all -> 0x003c }
            goto L_0x00d7
        L_0x00b8:
            kotlin.Lazy r9 = r0.w     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003c }
            w47 r9 = (defpackage.w47) r9     // Catch:{ all -> 0x003c }
            txf r10 = r17.d()     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x003c }
            zxf r11 = r0.y0     // Catch:{ all -> 0x003c }
            txf r12 = r17.d()     // Catch:{ all -> 0x003c }
            java.lang.String r12 = r12.f     // Catch:{ all -> 0x003c }
            y47 r9 = r9.a     // Catch:{ all -> 0x003c }
            boolean r4 = r9.b(r10, r4, r11, r12)     // Catch:{ all -> 0x003c }
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch:{ all -> 0x003c }
        L_0x00d7:
            boolean r4 = r0.isStopped()     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x01b7
            kotlin.Lazy r4 = r0.v     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003c }
            r62 r4 = (defpackage.r62) r4     // Catch:{ all -> 0x003c }
            txf r9 = r0.d()     // Catch:{ all -> 0x003c }
            long r9 = r9.e     // Catch:{ all -> 0x003c }
            a32 r4 = r4.G(r9)     // Catch:{ all -> 0x003c }
            js9 r9 = defpackage.js9.x
            if (r4 != 0) goto L_0x00f5
            r0.x0 = r9     // Catch:{ all -> 0x003c }
        L_0x00f5:
            xxf r4 = r0.x0     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x01a6
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x010d
            tk5 r1 = defpackage.tk5.v     // Catch:{ all -> 0x003c }
            t64 r1 = r1.a()     // Catch:{ all -> 0x003c }
            a08 r2 = new a08     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
        L_0x010a:
            r1 = r2
            goto L_0x01b7
        L_0x010d:
            boolean r9 = r4 instanceof defpackage.vxf     // Catch:{ all -> 0x003c }
            if (r9 != 0) goto L_0x01b7
            boolean r9 = r4 instanceof defpackage.uxf     // Catch:{ all -> 0x003c }
            if (r9 != 0) goto L_0x01b7
            o9a r9 = defpackage.o9a.x     // Catch:{ all -> 0x003c }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0129
            tk5 r1 = defpackage.tk5.o     // Catch:{ all -> 0x003c }
            t64 r1 = r1.a()     // Catch:{ all -> 0x003c }
            a08 r2 = new a08     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
            goto L_0x010a
        L_0x0129:
            p9a r9 = defpackage.p9a.y     // Catch:{ all -> 0x003c }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x013d
            tk5 r1 = defpackage.tk5.c     // Catch:{ all -> 0x003c }
            t64 r1 = r1.a()     // Catch:{ all -> 0x003c }
            a08 r2 = new a08     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
            goto L_0x010a
        L_0x013d:
            boolean r9 = r4 instanceof defpackage.wxf     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x018b
            r9 = r4
            wxf r9 = (defpackage.wxf) r9     // Catch:{ all -> 0x003c }
            float r9 = r9.a     // Catch:{ all -> 0x003c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r10.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r11 = "progress "
            r10.append(r11)     // Catch:{ all -> 0x003c }
            r10.append(r9)     // Catch:{ all -> 0x003c }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x003c }
            defpackage.z68.c(r8, r9, new java.lang.Object[0])     // Catch:{ all -> 0x003c }
            wxf r4 = (defpackage.wxf) r4     // Catch:{ all -> 0x003c }
            float r4 = r4.a     // Catch:{ all -> 0x003c }
            boolean r4 = r0.needToShowNotification(r4)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x01a6
            r2.a = r0     // Catch:{ all -> 0x003c }
            r2.b = r1     // Catch:{ all -> 0x003c }
            r2.c = r0     // Catch:{ all -> 0x003c }
            r2.w = r7     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r0.getForegroundInfo(r2)     // Catch:{ all -> 0x003c }
            if (r4 != r3) goto L_0x0173
            return r3
        L_0x0173:
            r9 = r0
        L_0x0174:
            o96 r4 = (defpackage.o96) r4     // Catch:{ all -> 0x003c }
            r2.a = r9     // Catch:{ all -> 0x003c }
            r2.b = r1     // Catch:{ all -> 0x003c }
            r10 = 0
            r2.c = r10     // Catch:{ all -> 0x003c }
            r2.w = r6     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.setForeground(r4, r2)     // Catch:{ all -> 0x003c }
            if (r0 != r3) goto L_0x0186
            return r3
        L_0x0186:
            r0 = r1
            r4 = r9
        L_0x0188:
            r1 = r0
            r0 = r4
            goto L_0x01a6
        L_0x018b:
            s9a r1 = defpackage.s9a.x     // Catch:{ all -> 0x003c }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x01a0
            tk5 r1 = defpackage.tk5.w     // Catch:{ all -> 0x003c }
            t64 r1 = r1.a()     // Catch:{ all -> 0x003c }
            a08 r2 = new a08     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
            goto L_0x010a
        L_0x01a0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x01a6:
            long r9 = r0.getWorkDelay()     // Catch:{ all -> 0x003c }
            r2.a = r0     // Catch:{ all -> 0x003c }
            r2.b = r1     // Catch:{ all -> 0x003c }
            r2.w = r5     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = defpackage.xk4.b(r9, r2)     // Catch:{ all -> 0x003c }
            if (r4 != r3) goto L_0x00d7
            return r3
        L_0x01b7:
            java.lang.String r2 = "doWork %s"
            xxf r3 = r0.x0     // Catch:{ all -> 0x003c }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x003c }
            defpackage.z68.c(r8, r2, r3)     // Catch:{ all -> 0x003c }
            xxf r2 = r0.x0     // Catch:{ all -> 0x003c }
            boolean r3 = r2 instanceof defpackage.uxf     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x01f4
            kotlin.Lazy r3 = r0.Y     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x003c }
            r9 = r3
            gl5 r9 = (defpackage.gl5) r9     // Catch:{ all -> 0x003c }
            uxf r2 = (defpackage.uxf) r2     // Catch:{ all -> 0x003c }
            df5 r10 = r2.a     // Catch:{ all -> 0x003c }
            txf r2 = r0.d()     // Catch:{ all -> 0x003c }
            long r11 = r2.d     // Catch:{ all -> 0x003c }
            txf r2 = r0.d()     // Catch:{ all -> 0x003c }
            long r13 = r2.e     // Catch:{ all -> 0x003c }
            txf r0 = r0.d()     // Catch:{ all -> 0x003c }
            java.lang.String r15 = r0.c     // Catch:{ all -> 0x003c }
            r9.c(r10, r11, r13, r15)     // Catch:{ all -> 0x003c }
            goto L_0x01f4
        L_0x01eb:
            java.lang.String r1 = "failure!"
            defpackage.z68.f(r8, r1, r0)
            a08 r1 = defpackage.d08.a()
        L_0x01f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.UploadExternalGifWorker" : e;
    }
}
