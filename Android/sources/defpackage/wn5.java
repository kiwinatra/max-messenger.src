package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wn5  reason: default package */
public final class wn5 extends SuspendLambda implements Function2 {
    public Object a;
    public long b;
    public int c;
    public final /* synthetic */ do5 o;
    public final /* synthetic */ ulf v;
    public final /* synthetic */ AsynchronousFileChannel w;
    public final /* synthetic */ AtomicBoolean x;
    public final /* synthetic */ cwb y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wn5(do5 do5, ulf ulf, AsynchronousFileChannel asynchronousFileChannel, AtomicBoolean atomicBoolean, cwb cwb, Continuation continuation) {
        super(2, continuation);
        this.o = do5;
        this.v = ulf;
        this.w = asynchronousFileChannel;
        this.x = atomicBoolean;
        this.y = cwb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wn5(this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wn5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1 = (defpackage.cxf) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r14 = r13.o;
        r5 = r14.d;
        r6 = defpackage.z68.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r6 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r6.c() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r7 = defpackage.w78.o;
        r14 = r14.c.c();
        r6.d(r7, r5, r1 + " acquired on network=" + r14, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r11 = java.lang.System.currentTimeMillis();
        r5 = r13.o;
        r6 = r13.v;
        r8 = r13.w;
        r9 = new defpackage.vn5(r13.y, r5, (kotlin.coroutines.Continuation) null);
        r13.a = r1;
        r13.b = r11;
        r13.c = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (defpackage.do5.a(r5, r6, r1, r8, r9, r13) != r0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r7 = java.lang.System.currentTimeMillis() - r5;
        r14 = r13.o;
        r5 = r14.d;
        r6 = defpackage.z68.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r6 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r6.c() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r9 = defpackage.w78.o;
        r10 = kotlin.time.Duration.Companion;
        r7 = kotlin.time.Duration.m1402toStringimpl(kotlin.time.DurationKt.toDuration(r7, kotlin.time.DurationUnit.MILLISECONDS));
        r14 = r14.c.c();
        r6.d(r9, r5, r1 + " was uploaded for " + r7 + " on network=" + r14, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r14 = r13.o.d;
        r1 = defpackage.z68.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        if (r1 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f5, code lost:
        if (r1.c() == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        r1.d(defpackage.w78.o, r14, "execute: no chunks remained, stopped launcher", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r13.x.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r1 = r13.v;
        r13.a = null;
        r13.c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        if (((defpackage.xlf) r13.o.f.getValue()).b(r1, r13) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        defpackage.z68.f(r13.o.d, "During uploading chunk got exception", r14);
        r13.x.set(false);
        ((defpackage.uta) ((defpackage.m95) r13.o.c.d.getValue())).c(new ru.ok.tamtam.ExceptionHandler$HandledException((java.lang.String) null, r14, 1, "ONEME-11028"), true);
        r1 = r13.y;
        r2 = kotlin.Result.Companion;
        r14 = kotlin.Result.m22boximpl(kotlin.Result.m23constructorimpl(kotlin.ResultKt.createFailure(r14)));
        r13.a = null;
        r13.c = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015e, code lost:
        if (((defpackage.zvb) r1).o.t(r14, r13) == r0) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0160, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0161, code lost:
        r1 = r13.v;
        r13.c = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0174, code lost:
        if (((defpackage.xlf) r13.o.f.getValue()).b(r1, r13) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0179, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017a, code lost:
        r2 = r13.v;
        r13.a = r14;
        r13.c = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018f, code lost:
        if (((defpackage.xlf) r13.o.f.getValue()).b(r2, r13) == r0) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0191, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0192, code lost:
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0193, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x001d, B:10:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.c
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0037;
                case 2: goto L_0x002a;
                case 3: goto L_0x0025;
                case 4: goto L_0x001d;
                case 5: goto L_0x0025;
                case 6: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0014:
            java.lang.Object r13 = r13.a
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0193
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0022 }
            goto L_0x0161
        L_0x0022:
            r14 = move-exception
            goto L_0x017a
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0177
        L_0x002a:
            long r5 = r13.b
            java.lang.Object r1 = r13.a
            cxf r1 = (defpackage.cxf) r1
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0034 }
            goto L_0x00a0
        L_0x0034:
            r14 = move-exception
            goto L_0x011b
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0034 }
            goto L_0x004b
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r14)
            do5 r14 = r13.o     // Catch:{ all -> 0x0034 }
            tyf r14 = r14.t     // Catch:{ all -> 0x0034 }
            r13.c = r2     // Catch:{ all -> 0x0034 }
            java.lang.Object r14 = r14.a(r13)     // Catch:{ all -> 0x0034 }
            if (r14 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r1 = r14
            cxf r1 = (defpackage.cxf) r1     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x00e8
            do5 r14 = r13.o     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r14.d     // Catch:{ all -> 0x0034 }
            a67 r6 = defpackage.z68.b     // Catch:{ all -> 0x0034 }
            if (r6 != 0) goto L_0x0059
            goto L_0x007e
        L_0x0059:
            boolean r7 = r6.c()     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x007e
            w78 r7 = defpackage.w78.o     // Catch:{ all -> 0x0034 }
            yqf r14 = r14.c     // Catch:{ all -> 0x0034 }
            mi3 r14 = r14.c()     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r8.<init>()     // Catch:{ all -> 0x0034 }
            r8.append(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = " acquired on network="
            r8.append(r9)     // Catch:{ all -> 0x0034 }
            r8.append(r14)     // Catch:{ all -> 0x0034 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x0034 }
            r6.d(r7, r5, r14, r4)     // Catch:{ all -> 0x0034 }
        L_0x007e:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0034 }
            do5 r5 = r13.o     // Catch:{ all -> 0x0034 }
            ulf r6 = r13.v     // Catch:{ all -> 0x0034 }
            java.nio.channels.AsynchronousFileChannel r8 = r13.w     // Catch:{ all -> 0x0034 }
            vn5 r9 = new vn5     // Catch:{ all -> 0x0034 }
            cwb r14 = r13.y     // Catch:{ all -> 0x0034 }
            r9.<init>(r14, r5, r4)     // Catch:{ all -> 0x0034 }
            r13.a = r1     // Catch:{ all -> 0x0034 }
            r13.b = r11     // Catch:{ all -> 0x0034 }
            r14 = 2
            r13.c = r14     // Catch:{ all -> 0x0034 }
            r7 = r1
            r10 = r13
            java.lang.Object r14 = defpackage.do5.a(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0034 }
            if (r14 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r5 = r11
        L_0x00a0:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0034 }
            long r7 = r7 - r5
            do5 r14 = r13.o     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r14.d     // Catch:{ all -> 0x0034 }
            a67 r6 = defpackage.z68.b     // Catch:{ all -> 0x0034 }
            if (r6 != 0) goto L_0x00ae
            goto L_0x0103
        L_0x00ae:
            boolean r9 = r6.c()     // Catch:{ all -> 0x0034 }
            if (r9 == 0) goto L_0x0103
            w78 r9 = defpackage.w78.o     // Catch:{ all -> 0x0034 }
            kotlin.time.Duration$Companion r10 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x0034 }
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.MILLISECONDS     // Catch:{ all -> 0x0034 }
            long r7 = kotlin.time.DurationKt.toDuration((long) r7, (kotlin.time.DurationUnit) r10)     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r7)     // Catch:{ all -> 0x0034 }
            yqf r14 = r14.c     // Catch:{ all -> 0x0034 }
            mi3 r14 = r14.c()     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r8.<init>()     // Catch:{ all -> 0x0034 }
            r8.append(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = " was uploaded for "
            r8.append(r1)     // Catch:{ all -> 0x0034 }
            r8.append(r7)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = " on network="
            r8.append(r1)     // Catch:{ all -> 0x0034 }
            r8.append(r14)     // Catch:{ all -> 0x0034 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x0034 }
            r6.d(r9, r5, r14, r4)     // Catch:{ all -> 0x0034 }
            goto L_0x0103
        L_0x00e8:
            do5 r14 = r13.o     // Catch:{ all -> 0x0034 }
            java.lang.String r14 = r14.d     // Catch:{ all -> 0x0034 }
            a67 r1 = defpackage.z68.b     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x00f1
            goto L_0x00fe
        L_0x00f1:
            boolean r5 = r1.c()     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x00fe
            w78 r5 = defpackage.w78.o     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "execute: no chunks remained, stopped launcher"
            r1.d(r5, r14, r6, r4)     // Catch:{ all -> 0x0034 }
        L_0x00fe:
            java.util.concurrent.atomic.AtomicBoolean r14 = r13.x     // Catch:{ all -> 0x0034 }
            r14.set(r3)     // Catch:{ all -> 0x0034 }
        L_0x0103:
            do5 r14 = r13.o
            kotlin.Lazy r14 = r14.f
            java.lang.Object r14 = r14.getValue()
            xlf r14 = (defpackage.xlf) r14
            ulf r1 = r13.v
            r13.a = r4
            r2 = 3
            r13.c = r2
            java.lang.Object r13 = r14.b(r1, r13)
            if (r13 != r0) goto L_0x0177
            return r0
        L_0x011b:
            do5 r1 = r13.o     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r1.d     // Catch:{ all -> 0x0022 }
            java.lang.String r5 = "During uploading chunk got exception"
            defpackage.z68.f(r1, r5, r14)     // Catch:{ all -> 0x0022 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.x     // Catch:{ all -> 0x0022 }
            r1.set(r3)     // Catch:{ all -> 0x0022 }
            do5 r1 = r13.o     // Catch:{ all -> 0x0022 }
            yqf r1 = r1.c     // Catch:{ all -> 0x0022 }
            kotlin.Lazy r1 = r1.d     // Catch:{ all -> 0x0022 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0022 }
            m95 r1 = (defpackage.m95) r1     // Catch:{ all -> 0x0022 }
            ru.ok.tamtam.ExceptionHandler$HandledException r3 = new ru.ok.tamtam.ExceptionHandler$HandledException     // Catch:{ all -> 0x0022 }
            java.lang.String r5 = "ONEME-11028"
            r3.<init>(r4, r14, r2, r5)     // Catch:{ all -> 0x0022 }
            uta r1 = (defpackage.uta) r1     // Catch:{ all -> 0x0022 }
            r1.c(r3, r2)     // Catch:{ all -> 0x0022 }
            cwb r1 = r13.y     // Catch:{ all -> 0x0022 }
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0022 }
            java.lang.Object r14 = kotlin.ResultKt.createFailure(r14)     // Catch:{ all -> 0x0022 }
            java.lang.Object r14 = kotlin.Result.m23constructorimpl(r14)     // Catch:{ all -> 0x0022 }
            kotlin.Result r14 = kotlin.Result.m22boximpl(r14)     // Catch:{ all -> 0x0022 }
            r13.a = r4     // Catch:{ all -> 0x0022 }
            r2 = 4
            r13.c = r2     // Catch:{ all -> 0x0022 }
            zvb r1 = (defpackage.zvb) r1     // Catch:{ all -> 0x0022 }
            x02 r1 = r1.o     // Catch:{ all -> 0x0022 }
            java.lang.Object r14 = r1.t(r14, r13)     // Catch:{ all -> 0x0022 }
            if (r14 != r0) goto L_0x0161
            return r0
        L_0x0161:
            do5 r14 = r13.o
            kotlin.Lazy r14 = r14.f
            java.lang.Object r14 = r14.getValue()
            xlf r14 = (defpackage.xlf) r14
            ulf r1 = r13.v
            r2 = 5
            r13.c = r2
            java.lang.Object r13 = r14.b(r1, r13)
            if (r13 != r0) goto L_0x0177
            return r0
        L_0x0177:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x017a:
            do5 r1 = r13.o
            kotlin.Lazy r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            xlf r1 = (defpackage.xlf) r1
            ulf r2 = r13.v
            r13.a = r14
            r3 = 6
            r13.c = r3
            java.lang.Object r13 = r1.b(r2, r13)
            if (r13 != r0) goto L_0x0192
            return r0
        L_0x0192:
            r13 = r14
        L_0x0193:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
