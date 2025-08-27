package ru.ok.messages.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.work.WorkerParameters;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/services/PipWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class PipWorker extends SdkCoroutineWorker {
    public final Lazy a = LazyKt.lazy(new ifb(5, this));
    public final Lazy b;

    public PipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = LazyKt.lazy(new lgb(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[SYNTHETIC, Splitter:B:30:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6 A[Catch:{ all -> 0x0033 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.inb
            if (r0 == 0) goto L_0x0013
            r0 = r10
            inb r0 = (defpackage.inb) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            inb r0 = new inb
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "PIP_WORKER"
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            ru.ok.messages.services.PipWorker r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0033 }
            goto L_0x0068
        L_0x0033:
            r10 = move-exception
            goto L_0x00bf
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            ru.ok.messages.services.PipWorker r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0033 }
            goto L_0x00a4
        L_0x0044:
            ru.ok.messages.services.PipWorker r9 = r0.b
            ru.ok.messages.services.PipWorker r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0093
        L_0x004c:
            r10 = move-exception
            r9 = r2
            goto L_0x00bf
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = "doWork"
            defpackage.z68.c(r6, r10, new java.lang.Object[0])
            r9.getApplicationContext()
            id3 r10 = defpackage.ym.e()
            qra r10 = (defpackage.qra) r10
            hn4 r10 = r10.n()
            r10.f(r6)
        L_0x0068:
            boolean r10 = r9.isStopped()     // Catch:{ all -> 0x0033 }
            kotlin.Lazy r2 = r9.a
            if (r10 != 0) goto L_0x00ba
            java.lang.Object r10 = r2.getValue()     // Catch:{ all -> 0x0033 }
            smb r10 = (defpackage.smb) r10     // Catch:{ all -> 0x0033 }
            a32 r10 = r10.F0     // Catch:{ all -> 0x0033 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0033 }
            smb r2 = (defpackage.smb) r2     // Catch:{ all -> 0x0033 }
            a89 r2 = r2.E0     // Catch:{ all -> 0x0033 }
            if (r10 == 0) goto L_0x00b7
            if (r2 != 0) goto L_0x0085
            goto L_0x00b7
        L_0x0085:
            r0.a = r9     // Catch:{ all -> 0x0033 }
            r0.b = r9     // Catch:{ all -> 0x0033 }
            r0.v = r5     // Catch:{ all -> 0x0033 }
            java.lang.Object r10 = r9.getForegroundInfo(r0)     // Catch:{ all -> 0x0033 }
            if (r10 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r2 = r9
        L_0x0093:
            o96 r10 = (defpackage.o96) r10     // Catch:{ all -> 0x004c }
            r0.a = r2     // Catch:{ all -> 0x004c }
            r7 = 0
            r0.b = r7     // Catch:{ all -> 0x004c }
            r0.v = r4     // Catch:{ all -> 0x004c }
            java.lang.Object r9 = r9.setForeground(r10, r0)     // Catch:{ all -> 0x004c }
            if (r9 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r9 = r2
        L_0x00a4:
            kotlin.time.Duration$Companion r10 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x0033 }
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.SECONDS     // Catch:{ all -> 0x0033 }
            long r7 = kotlin.time.DurationKt.toDuration((int) r5, (kotlin.time.DurationUnit) r10)     // Catch:{ all -> 0x0033 }
            r0.a = r9     // Catch:{ all -> 0x0033 }
            r0.v = r3     // Catch:{ all -> 0x0033 }
            java.lang.Object r10 = defpackage.xk4.c(r7, r0)     // Catch:{ all -> 0x0033 }
            if (r10 != r1) goto L_0x0068
            return r1
        L_0x00b7:
            r9.stop()     // Catch:{ all -> 0x0033 }
        L_0x00ba:
            c08 r10 = defpackage.d08.b()     // Catch:{ all -> 0x0033 }
            goto L_0x00c8
        L_0x00bf:
            java.lang.String r0 = "failure!"
            defpackage.z68.f(r6, r0, r10)
            a08 r10 = defpackage.d08.a()
        L_0x00c8:
            java.lang.String r0 = "doWork finish %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            defpackage.z68.c(r6, r0, r1)
            r9.getApplicationContext()
            id3 r9 = defpackage.ym.e()
            qra r9 = (defpackage.qra) r9
            hn4 r9 = r9.n()
            r9.g(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.services.PipWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [sda, kda] */
    public final Object getForegroundInfo(Continuation continuation) {
        Uri uri;
        smb smb = (smb) this.a.getValue();
        bnb bnb = smb.v0;
        a32 a32 = smb.F0;
        a89 a89 = smb.E0;
        l20 l20 = smb.D0;
        Bitmap bitmap = null;
        if (l20 == null) {
            uri = null;
        } else {
            uri = Uri.parse((ld8.Y(l20) ? smb.D0.j.d.d : smb.D0.d).c);
        }
        boolean z = smb.I0;
        bnb.b.c();
        pwa pwa = bnb.b;
        bnb.c.getClass();
        eda h = pwa.h(true, "ru.oneme.app.media", true);
        ? sda = new sda();
        sda.e = null;
        sda.f = ((MediaSessionCompat) bnb.d.getValue()).getSessionToken();
        sda.e = new int[]{0};
        wsb wsb = bnb.e;
        wsb.getClass();
        Intent intent = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        PendingIntent.getBroadcast((Context) wsb.a, 5, intent, ld9.W(ld9.v(134217728), intent));
        if (uri != null) {
            y33 y33 = (y33) ld9.B().a(qa7.a(uri), (Object) null).e();
            if (y33 != null) {
                y33.e0();
                v33 v33 = (v33) y33.e0();
                if (v33 instanceof CloseableStaticBitmap) {
                    bitmap = ((CloseableStaticBitmap) v33).getUnderlyingBitmap();
                }
            }
            if (bitmap != null) {
                h.k(bitmap);
            }
        }
        wsb wsb2 = bnb.e;
        wsb2.getClass();
        Intent intent2 = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        h.F.deleteIntent = PendingIntent.getBroadcast((Context) wsb2.a, 5, intent2, ld9.W(ld9.v(134217728), intent2));
        h.i(2, z);
        h.m();
        if (a32 != null) {
            a32.l0();
            h.f(a32.X);
            if (a89 != null) {
                wsb wsb3 = bnb.e;
                long j = a32.a;
                ha9 ha9 = a89.a;
                long j2 = ha9.o;
                long j3 = ha9.b;
                pwa pwa2 = (pwa) wsb3.b;
                pwa2.getClass();
                zb8 zb8 = zb8.b;
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(j3);
                zb8.getClass();
                h.g = ld9.x((Context) wsb3.a, 5, pwa2.j(zb8.n1(j, valueOf, valueOf2)));
            }
        }
        h.e(bnb.a.getText(qad.ta));
        h.F.icon = z ? nad.I1 : nad.J1;
        wsb wsb4 = bnb.e;
        wsb4.getClass();
        Intent intent3 = new Intent().setAction(z ? "ru.ok.video.ACTION_VIDEO_PAUSE" : "ru.ok.video.ACTION_VIDEO_PLAY").setPackage("one.me.android");
        h.a(new qca(z ? nad.a1 : nad.h1, "", PendingIntent.getBroadcast((Context) wsb4.a, 5, intent3, ld9.W(ld9.v(134217728), intent3))));
        h.q(sda);
        return new o96(5, h.b(), 2);
    }
}
