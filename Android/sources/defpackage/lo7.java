package defpackage;

import kotlin.Result;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lo7  reason: default package */
public abstract class lo7 implements oo7 {
    public final ru0 a = o54.a(IntCompanionObject.MAX_VALUE, 6, (cu0) null);
    public final sa3 b = kne.b();

    public final void a(Object obj) {
        this.a.p((Throwable) null);
        this.b.R(Result.m22boximpl(Result.m23constructorimpl(obj)));
    }

    public final void b(Throwable th) {
        this.a.p((Throwable) null);
        sa3 sa3 = this.b;
        sa3.getClass();
        sa3.R(new jb3(th, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ho7
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ho7 r0 = (defpackage.ho7) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ho7 r0 = new ho7
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r5 = r0.a
            lo7 r5 = (defpackage.lo7) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0075
        L_0x0030:
            r6 = move-exception
            goto L_0x007b
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            lo7 r5 = r0.b
            java.lang.Object r6 = r0.a
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0058
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x0030 }
            sa3 r7 = r5.b     // Catch:{ all -> 0x0030 }
            r0.a = r6     // Catch:{ all -> 0x0030 }
            r0.b = r5     // Catch:{ all -> 0x0030 }
            r0.v = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r7 = r7.a(r0)     // Catch:{ all -> 0x0030 }
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            kotlin.Result r7 = (kotlin.Result) r7     // Catch:{ all -> 0x0030 }
            java.lang.Object r7 = r7.m32unboximpl()     // Catch:{ all -> 0x0030 }
            boolean r2 = kotlin.Result.m30isSuccessimpl(r7)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0075
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0030 }
            r0.a = r5     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.b = r2     // Catch:{ all -> 0x0030 }
            r0.v = r3     // Catch:{ all -> 0x0030 }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x0030 }
            if (r6 != r1) goto L_0x0075
            return r1
        L_0x0075:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0030 }
            kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0084
        L_0x007b:
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            kotlin.Result.m23constructorimpl(r6)
        L_0x0084:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.c(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.io7
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io7 r0 = (defpackage.io7) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            io7 r0 = new io7
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r6 = r0.a
            lo7 r6 = (defpackage.lo7) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00b9
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            java.lang.Object r6 = r0.b
            lo7 r6 = (defpackage.lo7) r6
            java.lang.Object r7 = r0.a
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0048 }
            goto L_0x0095
        L_0x0048:
            r8 = move-exception
            goto L_0x009c
        L_0x004a:
            java.lang.Object r6 = r0.b
            lo7 r6 = (defpackage.lo7) r6
            java.lang.Object r7 = r0.a
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0048 }
            goto L_0x006a
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch:{ all -> 0x0048 }
            sa3 r8 = r6.b     // Catch:{ all -> 0x0048 }
            r0.a = r7     // Catch:{ all -> 0x0048 }
            r0.b = r6     // Catch:{ all -> 0x0048 }
            r0.v = r5     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r8.a(r0)     // Catch:{ all -> 0x0048 }
            if (r8 != r1) goto L_0x006a
            return r1
        L_0x006a:
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r8.m32unboximpl()     // Catch:{ all -> 0x0048 }
            boolean r2 = kotlin.Result.m29isFailureimpl(r8)     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0095
            java.lang.Throwable r8 = kotlin.Result.m26exceptionOrNullimpl(r8)     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0089
            r0.a = r7     // Catch:{ all -> 0x0048 }
            r0.b = r6     // Catch:{ all -> 0x0048 }
            r0.v = r4     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r7.invoke(r8, r0)     // Catch:{ all -> 0x0048 }
            if (r8 != r1) goto L_0x0095
            return r1
        L_0x0089:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0048 }
            r2.<init>(r8)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0095:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)     // Catch:{ all -> 0x0048 }
            goto L_0x00a6
        L_0x009c:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)
        L_0x00a6:
            java.lang.Throwable r2 = kotlin.Result.m26exceptionOrNullimpl(r8)
            if (r2 == 0) goto L_0x00b9
            r0.a = r6
            r0.b = r8
            r0.v = r3
            java.lang.Object r7 = r7.invoke(r2, r0)
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.d(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.jgg r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jo7
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jo7 r0 = (defpackage.jo7) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            jo7 r0 = new jo7
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            lo7 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            ko7 r6 = new ko7
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = defpackage.e14.d(r6, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.e(jgg, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
