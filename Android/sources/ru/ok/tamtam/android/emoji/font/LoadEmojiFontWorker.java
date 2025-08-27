package ru.ok.tamtam.android.emoji.font;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/tamtam/android/emoji/font/LoadEmojiFontWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ld08;", "doForegroundWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo96;", "createForegroundInfo", "Lc25;", "emojiFontLoadingNotifications$delegate", "Lkotlin/Lazy;", "getEmojiFontLoadingNotifications", "()Lc25;", "emojiFontLoadingNotifications", "Lh28;", "state", "Lh28;", "", "getName", "()Ljava/lang/String;", "name", "Companion", "d28", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class LoadEmojiFontWorker extends ForegroundWorker {
    public static final d28 Companion = new Object();
    public static final String TAG = "LoadEmojiFontWorker";
    public static final String WAITING_FOR_WIFI = "waiting_for_wifi";
    private final Lazy emojiFontLoadingNotifications$delegate = LazyKt.lazy(new c28(0, this));
    /* access modifiers changed from: private */
    public volatile h28 state = new f28(-1);

    public LoadEmojiFontWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* access modifiers changed from: private */
    public static final c25 emojiFontLoadingNotifications_delegate$lambda$0(LoadEmojiFontWorker loadEmojiFontWorker) {
        return (c25) ((sjd) loadEmojiFontWorker.getTamComponent()).o().l.getValue();
    }

    private final c25 getEmojiFontLoadingNotifications() {
        return (c25) this.emojiFontLoadingNotifications$delegate.getValue();
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(ipg ipg, boolean z) {
        Companion.getClass();
        d28.a(ipg, z);
    }

    public Object createForegroundInfo(Continuation<? super o96> continuation) {
        h28 h28 = this.state;
        f28 f28 = h28 instanceof f28 ? (f28) h28 : null;
        int i = f28 != null ? f28.a : -1;
        PendingIntent c = dpg.d(getApplicationContext()).c(getId());
        c25 emojiFontLoadingNotifications = getEmojiFontLoadingNotifications();
        ap0 ap0 = emojiFontLoadingNotifications.a;
        ap0.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = ap0.c;
        if (j == 0 || currentTimeMillis - j > ap0.b) {
            ap0.c = currentTimeMillis;
            z68.c("c25", "getEmojiFontLoadingNotification: progress = %d", Integer.valueOf(i));
        }
        pwa pwa = emojiFontLoadingNotifications.c;
        pwa.c();
        Intent f = pwa.f(false);
        Context context = emojiFontLoadingNotifications.b;
        PendingIntent x = ld9.x(context, 11, f);
        emojiFontLoadingNotifications.e.getClass();
        eda h = pwa.h(true, "ru.oneme.app.fileUpload", true);
        emojiFontLoadingNotifications.f.getClass();
        h.e = eda.c(context.getString(qad.s2));
        emojiFontLoadingNotifications.d.getClass();
        int i2 = nad.G1;
        Notification notification = h.F;
        notification.icon = i2;
        boolean z = i == -1;
        h.o = 100;
        h.p = i;
        h.q = z;
        h.k = 0;
        h.g(0);
        h.p((Uri) null);
        h.i(16, false);
        h.v = "progress";
        notification.when = 0;
        h.i(2, true);
        h.b.add(new qca(0, context.getString(qad.m0), c));
        h.g = x;
        Notification b = h.b();
        getEmojiFontLoadingNotifications().getClass();
        return new o96(11, b, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        if ((!(r9 instanceof defpackage.f28)) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095 A[Catch:{ all -> 0x0155, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4 A[Catch:{ all -> 0x0155, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd A[Catch:{ all -> 0x0155, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115 A[Catch:{ all -> 0x0155, all -> 0x005f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doForegroundWork(kotlin.coroutines.Continuation<? super defpackage.d08> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.i28
            if (r0 == 0) goto L_0x0013
            r0 = r14
            i28 r0 = (defpackage.i28) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            i28 r0 = new i28
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 0
            r4 = 3
            r5 = 2
            java.lang.String r6 = "LoadEmojiFontWorker"
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0063
            if (r2 == r7) goto L_0x0052
            if (r2 == r5) goto L_0x0047
            if (r2 != r4) goto L_0x003f
            paf r13 = r0.c
            c35 r2 = r0.b
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x003c }
            r14 = r2
            r2 = r13
            r13 = r9
            goto L_0x008f
        L_0x003c:
            r14 = move-exception
            goto L_0x015e
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0047:
            paf r13 = r0.c
            c35 r2 = r0.b
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x003c }
            goto L_0x0100
        L_0x0052:
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r13 = r0.o
            paf r2 = r0.c
            c35 r9 = r0.b
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x005f }
            goto L_0x00ea
        L_0x005f:
            r14 = move-exception
        L_0x0060:
            r13 = r2
            goto L_0x015e
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r14)
            z9f r14 = r13.getTamComponent()
            sjd r14 = (defpackage.sjd) r14
            q4 r14 = r14.getAccessor()
            java.lang.Class<c35> r2 = defpackage.c35.class
            java.lang.Object r14 = r14.g(r2)
            c35 r14 = (defpackage.c35) r14
            kotlin.Lazy r2 = r14.a
            java.lang.Object r2 = r2.getValue()
            paf r2 = (defpackage.paf) r2
            java.lang.String r9 = "doWork"
            defpackage.z68.c(r6, r9, new java.lang.Object[0])     // Catch:{ all -> 0x005f }
            u6h r9 = new u6h     // Catch:{ all -> 0x005f }
            r10 = 20
            r9.<init>(r10, r13)     // Catch:{ all -> 0x005f }
            r2.c(r9)     // Catch:{ all -> 0x005f }
        L_0x008f:
            boolean r9 = r13.isStopped()     // Catch:{ all -> 0x005f }
            if (r9 == 0) goto L_0x00a4
            h28 r9 = r13.state     // Catch:{ all -> 0x005f }
            r9.getClass()     // Catch:{ all -> 0x00a2 }
            boolean r9 = r9 instanceof defpackage.f28     // Catch:{ all -> 0x00a2 }
            r9 = r9 ^ r7
            if (r9 != 0) goto L_0x013c
            goto L_0x00a4
        L_0x00a0:
            r14 = r13
            goto L_0x0060
        L_0x00a2:
            r13 = move-exception
            goto L_0x00a0
        L_0x00a4:
            h28 r9 = r13.state     // Catch:{ all -> 0x005f }
            boolean r10 = r9 instanceof defpackage.e28     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x00b4
            e28 r9 = (defpackage.e28) r9     // Catch:{ all -> 0x005f }
            r9.getClass()     // Catch:{ all -> 0x005f }
            a08 r13 = defpackage.d08.a()     // Catch:{ all -> 0x005f }
            return r13
        L_0x00b4:
            boolean r10 = r9 instanceof defpackage.f28     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x0116
            java.lang.String r10 = "progress %f"
            r11 = r9
            f28 r11 = (defpackage.f28) r11     // Catch:{ all -> 0x005f }
            int r11 = r11.a     // Catch:{ all -> 0x005f }
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x005f }
            defpackage.z68.c(r6, r10, r11)     // Catch:{ all -> 0x005f }
            f28 r9 = (defpackage.f28) r9     // Catch:{ all -> 0x005f }
            int r9 = r9.a     // Catch:{ all -> 0x005f }
            float r9 = (float) r9     // Catch:{ all -> 0x005f }
            boolean r9 = r13.needToShowNotification(r9)     // Catch:{ all -> 0x005f }
            if (r9 == 0) goto L_0x0103
            r0.a = r13     // Catch:{ all -> 0x005f }
            r0.b = r14     // Catch:{ all -> 0x005f }
            r0.c = r2     // Catch:{ all -> 0x005f }
            r0.o = r13     // Catch:{ all -> 0x005f }
            r0.x = r7     // Catch:{ all -> 0x005f }
            java.lang.Object r9 = r13.getForegroundInfo(r0)     // Catch:{ all -> 0x005f }
            if (r9 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            r10 = r13
            r12 = r9
            r9 = r14
            r14 = r12
        L_0x00ea:
            o96 r14 = (defpackage.o96) r14     // Catch:{ all -> 0x005f }
            r0.a = r10     // Catch:{ all -> 0x005f }
            r0.b = r9     // Catch:{ all -> 0x005f }
            r0.c = r2     // Catch:{ all -> 0x005f }
            r0.o = r8     // Catch:{ all -> 0x005f }
            r0.x = r5     // Catch:{ all -> 0x005f }
            java.lang.Object r13 = r13.setForeground(r14, r0)     // Catch:{ all -> 0x005f }
            if (r13 != r1) goto L_0x00fd
            return r1
        L_0x00fd:
            r13 = r2
            r2 = r9
            r9 = r10
        L_0x0100:
            r14 = r2
            r2 = r13
            r13 = r9
        L_0x0103:
            long r9 = r13.getWorkDelay()     // Catch:{ all -> 0x005f }
            r0.a = r13     // Catch:{ all -> 0x005f }
            r0.b = r14     // Catch:{ all -> 0x005f }
            r0.c = r2     // Catch:{ all -> 0x005f }
            r0.x = r4     // Catch:{ all -> 0x005f }
            java.lang.Object r9 = defpackage.xk4.b(r9, r0)     // Catch:{ all -> 0x005f }
            if (r9 != r1) goto L_0x008f
            return r1
        L_0x0116:
            boolean r0 = r9 instanceof defpackage.g28     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0158
            g28 r9 = (defpackage.g28) r9     // Catch:{ all -> 0x005f }
            a96 r0 = r9.a     // Catch:{ all -> 0x005f }
            r14.getClass()     // Catch:{ all -> 0x0155 }
            r0.b = r7     // Catch:{ all -> 0x0155 }
            ws r1 = r0.e     // Catch:{ all -> 0x0155 }
            if (r1 != 0) goto L_0x012e
            ws r1 = new ws     // Catch:{ all -> 0x0155 }
            r1.<init>((int) r3)     // Catch:{ all -> 0x0155 }
            r0.e = r1     // Catch:{ all -> 0x0155 }
        L_0x012e:
            ws r1 = r0.e     // Catch:{ all -> 0x0155 }
            r1.add(r14)     // Catch:{ all -> 0x0155 }
            r0.c = r3     // Catch:{ all -> 0x0155 }
            r0.d = r8     // Catch:{ all -> 0x0155 }
            r0.f = r3     // Catch:{ all -> 0x0155 }
            defpackage.s15.c(r0)     // Catch:{ all -> 0x0155 }
        L_0x013c:
            boolean r13 = r13.isStopped()     // Catch:{ all -> 0x005f }
            if (r13 == 0) goto L_0x014b
            b08 r13 = new b08     // Catch:{ all -> 0x0148 }
            r13.<init>()     // Catch:{ all -> 0x0148 }
            goto L_0x017e
        L_0x0148:
            r13 = move-exception
            goto L_0x00a0
        L_0x014b:
            java.lang.String r13 = "success!"
            defpackage.z68.c(r6, r13, new java.lang.Object[0])     // Catch:{ all -> 0x005f }
            c08 r13 = defpackage.d08.b()     // Catch:{ all -> 0x005f }
            goto L_0x017e
        L_0x0155:
            r13 = move-exception
            goto L_0x00a0
        L_0x0158:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x005f }
            r13.<init>()     // Catch:{ all -> 0x005f }
            throw r13     // Catch:{ all -> 0x005f }
        L_0x015e:
            java.lang.String r0 = "cancelled!"
            defpackage.z68.o(r6, r0, r14)
            r13.getClass()
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r3)
            java.lang.String r0 = "paf"
            java.lang.String r1 = "cancelLoading"
            defpackage.z68.n(r0, r8, r1, r14)
            ao1 r14 = r13.h
            defpackage.jbd.c(r14)
            r13.h = r8
            a08 r13 = defpackage.d08.a()
        L_0x017e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public String getName() {
        return TAG;
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(ipg ipg) {
        Companion.getClass();
        d28.a(ipg, false);
    }
}
