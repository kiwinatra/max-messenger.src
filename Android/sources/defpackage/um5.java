package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;

/* renamed from: um5  reason: default package */
public final class um5 {
    public final int a;
    public final d14 b;
    public final int c;
    public final Regex d;
    public final Regex e;
    public final String f = um5.class.getName();
    public final File g;
    public final File h;
    public pm7 i;
    public final qm7 j;
    public final a0a k;
    public final n6e l;

    public um5(String str, int i2, d14 d14, int i3, Regex regex, Regex regex2) {
        this.a = i2;
        this.b = d14;
        this.c = i3;
        this.d = regex;
        this.e = regex2;
        File file = new File(c(str, false));
        this.g = file;
        this.h = new File(c(str, true));
        this.j = kv0.b();
        this.k = cvg.a();
        this.l = m5a.b(0, 0, (cu0) null, 7);
        o5a.h(file);
        this.i = ev0.v(d14, (CoroutineContext) null, (f14) null, new sm5(this, (String) null, (Continuation) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0073, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0079, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.um5 r8, java.util.Collection r9) {
        /*
            r8.getClass()
            r9.size()
            boolean r0 = r9.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x007a
            java.io.File r0 = r8.g
            defpackage.o5a.h(r0)
            java.io.FileWriter r2 = new java.io.FileWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0064 }
            r1.<init>(r2)     // Catch:{ all -> 0x0064 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x0066 }
            r3.<init>(r1)     // Catch:{ all -> 0x0066 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0026:
            boolean r4 = r9.hasNext()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0036 }
            r3.println(r4)     // Catch:{ all -> 0x0036 }
            goto L_0x0026
        L_0x0036:
            r8 = move-exception
            goto L_0x0068
        L_0x0038:
            long r4 = r0.length()     // Catch:{ all -> 0x0036 }
            r9 = 1024(0x400, float:1.435E-42)
            long r6 = (long) r9     // Catch:{ all -> 0x0036 }
            long r4 = r4 / r6
            int r9 = r8.a     // Catch:{ all -> 0x0036 }
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0057
            java.io.File r8 = r8.h     // Catch:{ IOException -> 0x0053 }
            boolean r8 = r0.renameTo(r8)     // Catch:{ IOException -> 0x0053 }
            if (r8 == 0) goto L_0x0057
            defpackage.o5a.h(r0)     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0036 }
        L_0x0057:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0036 }
            r8 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r8)     // Catch:{ all -> 0x0066 }
            kotlin.io.CloseableKt.closeFinally(r1, r8)     // Catch:{ all -> 0x0064 }
            kotlin.io.CloseableKt.closeFinally(r2, r8)
            goto L_0x007a
        L_0x0064:
            r8 = move-exception
            goto L_0x0074
        L_0x0066:
            r8 = move-exception
            goto L_0x006e
        L_0x0068:
            throw r8     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r8)     // Catch:{ all -> 0x0066 }
            throw r9     // Catch:{ all -> 0x0066 }
        L_0x006e:
            throw r8     // Catch:{ all -> 0x006f }
        L_0x006f:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r8)     // Catch:{ all -> 0x0064 }
            throw r9     // Catch:{ all -> 0x0064 }
        L_0x0074:
            throw r8     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r8)
            throw r9
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um5.a(um5, java.util.Collection):void");
    }

    public static String c(String str, boolean z) {
        return tr1.j(str, z ? ".1.log" : ".log");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: a0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: a0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: xz9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: a0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: a0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: a0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: xz9} */
    /* JADX WARNING: type inference failed for: r7v14, types: [xz9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.nm5
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nm5 r0 = (defpackage.nm5) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            nm5 r0 = new nm5
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x0051
            if (r2 == r5) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.String r7 = r0.c
            xz9 r1 = r0.b
            um5 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0037 }
            goto L_0x00ab
        L_0x0037:
            r7 = move-exception
            goto L_0x00c3
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            xz9 r7 = r0.b
            um5 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ TimeoutCancellationException -> 0x004f, all -> 0x004a }
            goto L_0x0083
        L_0x004a:
            r8 = move-exception
            r1 = r7
            r7 = r8
            goto L_0x00c3
        L_0x004f:
            r8 = r7
            goto L_0x008a
        L_0x0051:
            xz9 r7 = r0.b
            um5 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r2
            goto L_0x006d
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r7
            a0a r8 = r7.k
            r0.b = r8
            r0.w = r6
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L_0x006d
            return r1
        L_0x006d:
            om5 r2 = new om5     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r2.<init>(r7, r4)     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.a = r7     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.b = r8     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.w = r5     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r2 = defpackage.okf.c(r5, r2, r0)     // Catch:{ TimeoutCancellationException -> 0x0089 }
            if (r2 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r2 = r7
            r7 = r8
        L_0x0083:
            r8 = r7
            r7 = r4
            goto L_0x008c
        L_0x0086:
            r7 = move-exception
            r1 = r8
            goto L_0x00c3
        L_0x0089:
            r2 = r7
        L_0x008a:
            java.lang.String r7 = "Timeout was exceed during waiting finishing jobs on flushing, not all logs were flushed"
        L_0x008c:
            pm7 r5 = r2.i     // Catch:{ all -> 0x0086 }
            r0.a = r2     // Catch:{ all -> 0x0086 }
            r0.b = r8     // Catch:{ all -> 0x0086 }
            r0.c = r7     // Catch:{ all -> 0x0086 }
            r0.w = r3     // Catch:{ all -> 0x0086 }
            r5.b(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r5.d(r0)     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0086 }
            if (r0 != r5) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0086 }
        L_0x00a6:
            if (r0 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r1 = r8
            r0 = r2
        L_0x00ab:
            r0.getClass()     // Catch:{ all -> 0x0037 }
            sm5 r8 = new sm5     // Catch:{ all -> 0x0037 }
            r8.<init>(r0, r7, r4)     // Catch:{ all -> 0x0037 }
            d14 r7 = r0.b     // Catch:{ all -> 0x0037 }
            aje r7 = defpackage.ev0.v(r7, r4, r4, r8, r3)     // Catch:{ all -> 0x0037 }
            r0.i = r7     // Catch:{ all -> 0x0037 }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0037 }
            a0a r1 = (defpackage.a0a) r1
            r1.e(r4)
            return r7
        L_0x00c3:
            a0a r1 = (defpackage.a0a) r1
            r1.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
