package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yn5  reason: default package */
public final class yn5 extends SuspendLambda implements Function2 {
    public Object a;
    public do5 b;
    public Object c;
    public AtomicBoolean o;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ do5 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn5(do5 do5, Continuation continuation) {
        super(2, continuation);
        this.x = do5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yn5 yn5 = new yn5(this.x, continuation);
        yn5.w = obj;
        return yn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yn5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: zvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: zvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: zvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011a A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0153 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016c A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c4 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c5 A[Catch:{ all -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.v
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            if (r3 == 0) goto L_0x007f
            if (r3 == r1) goto L_0x0077
            if (r3 == r8) goto L_0x006c
            if (r3 == r7) goto L_0x0050
            if (r3 == r6) goto L_0x0034
            if (r3 != r5) goto L_0x002c
            java.lang.Object r1 = r0.a
            do5 r1 = (defpackage.do5) r1
            java.lang.Object r0 = r0.w
            r2 = r0
            java.io.Closeable r2 = (java.io.Closeable) r2
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0028 }
            goto L_0x01b7
        L_0x0028:
            r0 = move-exception
            r1 = r0
            goto L_0x01f7
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            java.lang.Object r1 = r0.c
            java.util.Iterator r1 = (java.util.Iterator) r1
            do5 r3 = r0.b
            java.lang.Object r7 = r0.a
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r8 = r0.w
            cwb r8 = (defpackage.cwb) r8
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x004b }
            r4 = r6
            r5 = r7
            r6 = r8
            r8 = r3
            goto L_0x0166
        L_0x004b:
            r0 = move-exception
            r1 = r0
            r2 = r7
            goto L_0x01f7
        L_0x0050:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.o
            java.lang.Object r3 = r0.c
            java.nio.channels.AsynchronousFileChannel r3 = (java.nio.channels.AsynchronousFileChannel) r3
            do5 r8 = r0.b
            java.lang.Object r9 = r0.a
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r10 = r0.w
            cwb r10 = (defpackage.cwb) r10
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0067 }
            r5 = r9
            r6 = r10
            goto L_0x014b
        L_0x0067:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x01f7
        L_0x006c:
            java.lang.Object r3 = r0.w
            cwb r3 = (defpackage.cwb) r3
            kotlin.ResultKt.throwOnFailure(r19)
            r5 = r19
            goto L_0x0101
        L_0x0077:
            java.lang.Object r3 = r0.w
            cwb r3 = (defpackage.cwb) r3
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x00ef
        L_0x007f:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r3 = r0.w
            cwb r3 = (defpackage.cwb) r3
            do5 r9 = r0.x
            java.lang.String r10 = r9.d
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x008f
            goto L_0x00c6
        L_0x008f:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x00c6
            w78 r12 = defpackage.w78.o
            java.io.File r13 = r9.i
            java.lang.String r13 = r13.getPath()
            long r14 = r9.j
            yqf r9 = r9.c
            mi3 r9 = r9.c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Uploading file="
            r5.<init>(r6)
            r5.append(r13)
            java.lang.String r6 = " with size="
            r5.append(r6)
            r5.append(r14)
            java.lang.String r6 = " on network="
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r11.d(r12, r10, r5, r4)
        L_0x00c6:
            do5 r5 = r0.x
            long r9 = java.lang.System.currentTimeMillis()
            r5.r = r9
            do5 r5 = r0.x
            tyf r6 = r5.t
            java.net.URI r5 = r5.h
            java.lang.String r5 = r5.toString()
            sd3 r9 = new sd3
            r9.<init>()
            r9.n(r4, r5)
            m57 r5 = r9.c()
            r0.w = r3
            r0.v = r1
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r2) goto L_0x00ef
            return r2
        L_0x00ef:
            do5 r5 = r0.x
            tn5 r6 = new tn5
            r6.<init>(r5, r1)
            r0.w = r3
            r0.v = r8
            java.lang.Object r5 = defpackage.ryg.W(r6, r0)
            if (r5 != r2) goto L_0x0101
            return r2
        L_0x0101:
            java.io.Closeable r5 = (java.io.Closeable) r5
            do5 r6 = r0.x
            r8 = r5
            java.nio.channels.AsynchronousFileChannel r8 = (java.nio.channels.AsynchronousFileChannel) r8     // Catch:{ all -> 0x0151 }
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0151 }
            r9.<init>(r1)     // Catch:{ all -> 0x0151 }
            r1 = r9
            r17 = r6
            r6 = r3
            r3 = r8
            r8 = r17
        L_0x0114:
            boolean r9 = r1.get()     // Catch:{ all -> 0x0151 }
            if (r9 == 0) goto L_0x0153
            kotlin.coroutines.CoroutineContext r9 = r18.getContext()     // Catch:{ all -> 0x0151 }
            defpackage.kv0.q(r9)     // Catch:{ all -> 0x0151 }
            kotlin.Lazy r9 = r8.f     // Catch:{ all -> 0x0151 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0151 }
            xlf r9 = (defpackage.xlf) r9     // Catch:{ all -> 0x0151 }
            xn5 r15 = new xn5     // Catch:{ all -> 0x0151 }
            r16 = 0
            r10 = r15
            r11 = r1
            r12 = r8
            r13 = r3
            r14 = r6
            r4 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0151 }
            r0.w = r6     // Catch:{ all -> 0x0151 }
            r0.a = r5     // Catch:{ all -> 0x0151 }
            r0.b = r8     // Catch:{ all -> 0x0151 }
            r0.c = r3     // Catch:{ all -> 0x0151 }
            r0.o = r1     // Catch:{ all -> 0x0151 }
            r0.v = r7     // Catch:{ all -> 0x0151 }
            java.lang.Object r4 = r9.a(r4, r0)     // Catch:{ all -> 0x0151 }
            if (r4 != r2) goto L_0x014b
            return r2
        L_0x014b:
            r4 = 0
            goto L_0x0114
        L_0x014d:
            r1 = r0
            r2 = r5
            goto L_0x01f7
        L_0x0151:
            r0 = move-exception
            goto L_0x014d
        L_0x0153:
            qm7 r1 = r8.p     // Catch:{ all -> 0x0151 }
            r1.getClass()     // Catch:{ all -> 0x0151 }
            on7 r3 = new on7     // Catch:{ all -> 0x0151 }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0151 }
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sequence(r3)     // Catch:{ all -> 0x0151 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0151 }
        L_0x0166:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0151 }
            if (r3 == 0) goto L_0x0187
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0151 }
            pm7 r3 = (defpackage.pm7) r3     // Catch:{ all -> 0x0151 }
            r0.w = r6     // Catch:{ all -> 0x0151 }
            r0.a = r5     // Catch:{ all -> 0x0151 }
            r0.b = r8     // Catch:{ all -> 0x0151 }
            r0.c = r1     // Catch:{ all -> 0x0151 }
            r4 = 0
            r0.o = r4     // Catch:{ all -> 0x0151 }
            r4 = 4
            r0.v = r4     // Catch:{ all -> 0x0151 }
            java.lang.Object r3 = r3.d(r0)     // Catch:{ all -> 0x0151 }
            if (r3 != r2) goto L_0x0166
            return r2
        L_0x0187:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0151 }
            long r3 = r8.j     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r8.s     // Catch:{ all -> 0x0151 }
            nyf r7 = new nyf     // Catch:{ all -> 0x0151 }
            r9 = 1120403456(0x42c80000, float:100.0)
            r7.<init>(r9, r3, r1)     // Catch:{ all -> 0x0151 }
            java.lang.Object r1 = kotlin.Result.m23constructorimpl(r7)     // Catch:{ all -> 0x0151 }
            kotlin.Result r1 = kotlin.Result.m22boximpl(r1)     // Catch:{ all -> 0x0151 }
            r0.w = r5     // Catch:{ all -> 0x0151 }
            r0.a = r8     // Catch:{ all -> 0x0151 }
            r3 = 0
            r0.b = r3     // Catch:{ all -> 0x0151 }
            r0.c = r3     // Catch:{ all -> 0x0151 }
            r0.o = r3     // Catch:{ all -> 0x0151 }
            r3 = 5
            r0.v = r3     // Catch:{ all -> 0x0151 }
            zvb r6 = (defpackage.zvb) r6     // Catch:{ all -> 0x0151 }
            x02 r3 = r6.o     // Catch:{ all -> 0x0151 }
            java.lang.Object r0 = r3.t(r1, r0)     // Catch:{ all -> 0x0151 }
            if (r0 != r2) goto L_0x01b5
            return r2
        L_0x01b5:
            r2 = r5
            r1 = r8
        L_0x01b7:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0028 }
            long r5 = r1.r     // Catch:{ all -> 0x0028 }
            long r3 = r3 - r5
            java.lang.String r0 = r1.d     // Catch:{ all -> 0x0028 }
            a67 r1 = defpackage.z68.b     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x01c5
            goto L_0x01ee
        L_0x01c5:
            boolean r5 = r1.c()     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x01ee
            w78 r5 = defpackage.w78.o     // Catch:{ all -> 0x0028 }
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x0028 }
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.MILLISECONDS     // Catch:{ all -> 0x0028 }
            long r3 = kotlin.time.DurationKt.toDuration((long) r3, (kotlin.time.DurationUnit) r6)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = kotlin.time.Duration.m1402toStringimpl(r3)     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r4.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "File was uploaded for "
            r4.append(r6)     // Catch:{ all -> 0x0028 }
            r4.append(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0028 }
            r4 = 0
            r1.d(r5, r0, r3, r4)     // Catch:{ all -> 0x0028 }
        L_0x01ee:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0028 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01f7:
            throw r1     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
