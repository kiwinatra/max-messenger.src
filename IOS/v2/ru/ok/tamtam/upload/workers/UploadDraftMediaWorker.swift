package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadDraftMediaWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUploadDraftMediaWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadDraftMediaWorker.kt\nru/ok/tamtam/upload/workers/UploadDraftMediaWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,418:1\n1#2:419\n*E\n"})
public final class UploadDraftMediaWorker extends ForegroundWorker {
    public final Lazy X = LazyKt.lazy(new mxf(this, 2));
    public final Lazy Y = LazyKt.lazy(new mxf(this, 3));
    public final Lazy Z = LazyKt.lazy(new mxf(this, 4));
    public final Lazy a = LazyKt.lazy(new mxf(this, 0));
    public final Lazy b = LazyKt.lazy(new mxf(this, 5));
    public final Lazy c = LazyKt.lazy(new mxf(this, 6));
    public final Lazy o = LazyKt.lazy(new mxf(this, 7));
    public final Lazy v = LazyKt.lazy(new mxf(this, 8));
    public or7 v0;
    public final Lazy w = LazyKt.lazy(new mxf(this, 9));
    public volatile float w0 = -1.0f;
    public final Lazy x = LazyKt.lazy(new mxf(this, 10));
    public volatile d08 x0;
    public final Lazy y = LazyKt.lazy(new mxf(this, 11));
    public final Lazy z = LazyKt.lazy(new mxf(this, 1));

    public UploadDraftMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final r62 c() {
        return (r62) this.o.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        String string;
        PendingIntent c2 = dpg.d(getApplicationContext()).c(getId());
        a32 G = c().G(d().a.a);
        if (G == null) {
            i();
        }
        lm5 lm5 = (lm5) this.X.getValue();
        long j = d().a.a;
        if (G == null || (string = G.r()) == null) {
            string = getApplicationContext().getString(((lm5) this.X.getValue()).f);
        }
        return new o96(d().a.hashCode(), lm5.b(j, (Long) null, (Long) null, string, G == null ? null : getApplicationContext().getString(((lm5) this.X.getValue()).f), (int) this.w0, true, c2), 1);
    }

    public final au4 d() {
        return (au4) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4 A[Catch:{ all -> 0x0037 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d5 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.pxf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            pxf r0 = (defpackage.pxf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            pxf r0 = new pxf
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "UploadDraftMediaWorker"
            r7 = 4
            r8 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0049
            if (r2 == r3) goto L_0x0042
            if (r2 != r7) goto L_0x003a
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0037 }
            goto L_0x008d
        L_0x0037:
            r12 = move-exception
            goto L_0x00de
        L_0x003a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0042:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0037 }
            goto L_0x00c6
        L_0x0049:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.b
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0051 }
            goto L_0x00b6
        L_0x0051:
            r12 = move-exception
            r11 = r2
            goto L_0x00de
        L_0x0055:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0037 }
            goto L_0x008a
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "doWork"
            defpackage.z68.c(r6, r12, new java.lang.Object[0])     // Catch:{ all -> 0x0037 }
            r0.a = r11     // Catch:{ all -> 0x0037 }
            r0.v = r5     // Catch:{ all -> 0x0037 }
            kotlin.Lazy r12 = r11.Z     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0037 }
            gaf r12 = (defpackage.gaf) r12     // Catch:{ all -> 0x0037 }
            osa r12 = (defpackage.osa) r12     // Catch:{ all -> 0x0037 }
            q04 r12 = r12.b()     // Catch:{ all -> 0x0037 }
            qxf r2 = new qxf     // Catch:{ all -> 0x0037 }
            r2.<init>(r11, r8)     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = defpackage.ev0.I(r12, r2, r0)     // Catch:{ all -> 0x0037 }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0037 }
            if (r12 != r2) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0037 }
        L_0x0087:
            if (r12 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r11.h()     // Catch:{ all -> 0x0037 }
        L_0x008d:
            d08 r12 = r11.x0     // Catch:{ all -> 0x0037 }
            if (r12 != 0) goto L_0x00d5
            java.lang.String r12 = "update %f"
            float r2 = r11.w0     // Catch:{ all -> 0x0037 }
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)     // Catch:{ all -> 0x0037 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0037 }
            defpackage.z68.c(r6, r12, r2)     // Catch:{ all -> 0x0037 }
            float r12 = r11.w0     // Catch:{ all -> 0x0037 }
            boolean r12 = r11.needToShowNotification(r12)     // Catch:{ all -> 0x0037 }
            if (r12 == 0) goto L_0x00c6
            r0.a = r11     // Catch:{ all -> 0x0037 }
            r0.b = r11     // Catch:{ all -> 0x0037 }
            r0.v = r4     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = r11.getForegroundInfo(r0)     // Catch:{ all -> 0x0037 }
            if (r12 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            r2 = r11
        L_0x00b6:
            o96 r12 = (defpackage.o96) r12     // Catch:{ all -> 0x0051 }
            r0.a = r2     // Catch:{ all -> 0x0051 }
            r0.b = r8     // Catch:{ all -> 0x0051 }
            r0.v = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r11 = r11.setForeground(r12, r0)     // Catch:{ all -> 0x0051 }
            if (r11 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r11 = r2
        L_0x00c6:
            long r9 = r11.getWorkDelay()     // Catch:{ all -> 0x0037 }
            r0.a = r11     // Catch:{ all -> 0x0037 }
            r0.v = r7     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = defpackage.xk4.b(r9, r0)     // Catch:{ all -> 0x0037 }
            if (r12 != r1) goto L_0x008d
            return r1
        L_0x00d5:
            d08 r12 = r11.x0     // Catch:{ all -> 0x0037 }
            if (r12 != 0) goto L_0x00ea
            a08 r12 = defpackage.d08.a()     // Catch:{ all -> 0x0037 }
            goto L_0x00ea
        L_0x00de:
            java.lang.String r0 = "cancelled!"
            defpackage.z68.f(r6, r0, r12)
            r11.i()
            a08 r12 = defpackage.d08.a()
        L_0x00ea:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        st4 st4 = d().a;
        z68.f("UploadDraftMediaWorker", "onUploadFailed: draftMediaUploadKey = " + st4, th);
        st4 st42 = d().a;
        z68.f("UploadDraftMediaWorker", "failDraftUpload: key = " + st42, (Throwable) null);
        a32 G = c().G(d().a.a);
        if (G == null) {
            z68.f("UploadDraftMediaWorker", "failDraftUpload: chat is null", (Throwable) null);
        } else {
            pt4 pt4 = G.b.f0;
            if (pt4 == null) {
                z68.f("UploadDraftMediaWorker", "failDraftUpload: draft is null", (Throwable) null);
            } else {
                ((xt4) this.v.getValue()).a(pt4);
                r62 c2 = c();
                Long a2 = pt4.a();
                c2.n(G.a, a2 != null ? a2.longValue() : 0, pt4);
                rvd.A((jqg) this.c.getValue());
            }
        }
        g();
        ((gl5) this.Y.getValue()).b(d().a.a);
        this.x0 = d08.a();
    }

    public final void g() {
        try {
            new na3(4, ((ju4) this.b.getValue()).a(), new ch2(8, d().a)).a();
            st4 st4 = d().a;
            z68.c("UploadDraftMediaWorker", "removeUploadFromStorage: success for key = " + st4, new Object[0]);
        } catch (Throwable th) {
            st4 st42 = d().a;
            z68.f("UploadDraftMediaWorker", "removeUploadFromStorage: failed for key = " + st42, th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadDraftMediaWorker" : e;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, we8] */
    public final void h() {
        b10 b10;
        au4 d = d();
        z68.c("UploadDraftMediaWorker", "startUpload: draftUpload = " + d, new Object[0]);
        int ordinal = d().d.ordinal();
        if (ordinal == 0) {
            b10 = b10.UNKNOWN;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    b10 = b10.FILE;
                } else if (ordinal == 5) {
                    b10 = b10.AUDIO;
                } else if (ordinal != 6) {
                    b10 = ordinal != 7 ? b10.UNKNOWN : b10.STICKER;
                }
            }
            b10 = b10.PHOTO;
        } else {
            b10 = b10.VIDEO;
        }
        if (b10 == b10.UNKNOWN) {
            e(new IllegalStateException("Internal error. Unknown attach type for upload type"));
            return;
        }
        ? obj = new Object();
        obj.e = d().e;
        obj.b = d().b;
        obj.d = d().d;
        obj.a = d().c;
        obj.f = d().a.b;
        lja s = ((lyf) this.y.getValue()).a(new qf9(obj)).s((lfd) this.z.getValue());
        or7 or7 = new or7(new d6a(14, (Object) this), new ykb(10, this), m58.e);
        s.a(or7);
        this.v0 = or7;
    }

    public final void i() {
        st4 st4 = d().a;
        z68.c("UploadDraftMediaWorker", "cancel: key =" + st4, new Object[0]);
        jbd.c(this.v0);
        g();
        String str = d().a.b;
        z68.c("UploadDraftMediaWorker", "cancel: finished for key = " + str, new Object[0]);
        this.x0 = d08.a();
    }
}
