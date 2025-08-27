package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ei2  reason: default package */
public final class ei2 extends SuspendLambda implements Function2 {
    public Object a;
    public ci2 b;
    public a32 c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ aj2 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ei2(aj2 aj2, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.w = aj2;
        this.x = j;
        this.y = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ei2 ei2 = new ei2(this.w, this.x, this.y, continuation);
        ei2.v = obj;
        return ei2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ei2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: ci2} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        r4 = r3.x0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r15
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.o
            r9 = 0
            r2 = 3
            r3 = 2
            r10 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 == r10) goto L_0x0045
            if (r1 == r3) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            java.lang.Object r0 = r8.a
            r1 = r0
            ci2 r1 = (defpackage.ci2) r1
            java.lang.Object r0 = r8.v
            r2 = r0
            fr8 r2 = (defpackage.fr8) r2
            kotlin.ResultKt.throwOnFailure(r16)     // Catch:{ all -> 0x0025 }
            r11 = r1
            r1 = r16
            goto L_0x011d
        L_0x0025:
            r0 = move-exception
            goto L_0x012a
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            a32 r1 = r8.c
            ci2 r3 = r8.b
            java.lang.Object r4 = r8.a
            fr8 r4 = (defpackage.fr8) r4
            java.lang.Object r5 = r8.v
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r16)
            r11 = r3
            r12 = r4
            r3 = r16
            goto L_0x00e2
        L_0x0045:
            ci2 r1 = r8.b
            java.lang.Object r4 = r8.a
            fr8 r4 = (defpackage.fr8) r4
            java.lang.Object r5 = r8.v
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r16)
            r6 = r16
            goto L_0x00c6
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r16)
            java.lang.Object r1 = r8.v
            r5 = r1
            d14 r5 = (defpackage.d14) r5
            aj2 r1 = r8.w
            xme r1 = r1.N0
            java.lang.Object r1 = r1.getValue()
            ai2 r1 = (defpackage.ai2) r1
            java.util.List r1 = r1.a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            long r6 = r8.x
            java.lang.String r4 = r8.y
            java.util.Iterator r1 = r1.iterator()
        L_0x0074:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0094
            java.lang.Object r11 = r1.next()
            r12 = r11
            hr8 r12 = (defpackage.hr8) r12
            long r13 = r12.m()
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x0074
            java.lang.String r12 = r12.v()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x0074
            goto L_0x0095
        L_0x0094:
            r11 = r9
        L_0x0095:
            boolean r1 = r11 instanceof defpackage.fr8
            if (r1 == 0) goto L_0x009d
            fr8 r11 = (defpackage.fr8) r11
            r4 = r11
            goto L_0x009e
        L_0x009d:
            r4 = r9
        L_0x009e:
            ci2 r1 = new ci2
            r1.<init>((defpackage.fr8) r4, (int) r3)
            aj2 r6 = r8.w
            xme r6 = r6.T0
            r6.getClass()
            r6.m(r9, r1)
            aj2 r6 = r8.w
            qx2 r6 = r6.q()
            aj2 r7 = r8.w
            long r11 = r7.b
            r8.v = r5
            r8.a = r4
            r8.b = r1
            r8.o = r10
            java.lang.Object r6 = r6.d(r11, r15)
            if (r6 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            a32 r6 = (defpackage.a32) r6
            aj2 r7 = r8.w
            to9 r7 = r7.y
            long r11 = r8.x
            r8.v = r5
            r8.a = r4
            r8.b = r1
            r8.c = r6
            r8.o = r3
            java.lang.Object r3 = r7.a(r11, r15)
            if (r3 != r0) goto L_0x00df
            return r0
        L_0x00df:
            r11 = r1
            r12 = r4
            r1 = r6
        L_0x00e2:
            ha9 r3 = (defpackage.ha9) r3
            if (r3 == 0) goto L_0x00f1
            w28 r4 = r3.x0
            if (r4 == 0) goto L_0x00f1
            java.lang.String r5 = r8.y
            l20 r4 = r4.H(r5)
            goto L_0x00f2
        L_0x00f1:
            r4 = r9
        L_0x00f2:
            if (r4 == 0) goto L_0x019a
            aj2 r5 = r8.w
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0127 }
            kotlin.Lazy r5 = r5.z0     // Catch:{ all -> 0x0127 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0127 }
            n5g r5 = (defpackage.n5g) r5     // Catch:{ all -> 0x0127 }
            m72 r1 = r1.b     // Catch:{ all -> 0x0127 }
            long r6 = r1.a     // Catch:{ all -> 0x0127 }
            long r13 = r3.c     // Catch:{ all -> 0x0127 }
            r8.v = r12     // Catch:{ all -> 0x0127 }
            r8.a = r11     // Catch:{ all -> 0x0127 }
            r8.b = r9     // Catch:{ all -> 0x0127 }
            r8.c = r9     // Catch:{ all -> 0x0127 }
            r8.o = r2     // Catch:{ all -> 0x0127 }
            r1 = r5
            r2 = r4
            r3 = r6
            r5 = r13
            r7 = r15
            java.lang.Object r1 = r1.b(r2, r3, r5, r7)     // Catch:{ all -> 0x0127 }
            if (r1 != r0) goto L_0x011c
            return r0
        L_0x011c:
            r2 = r12
        L_0x011d:
            g4g r1 = (defpackage.g4g) r1     // Catch:{ all -> 0x0124 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0135
        L_0x0124:
            r0 = move-exception
            r1 = r11
            goto L_0x012a
        L_0x0127:
            r0 = move-exception
            r1 = r11
            r2 = r12
        L_0x012a:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            r11 = r1
        L_0x0135:
            boolean r1 = kotlin.Result.m29isFailureimpl(r0)
            if (r1 == 0) goto L_0x013c
            r0 = r9
        L_0x013c:
            g4g r0 = (defpackage.g4g) r0
            if (r0 != 0) goto L_0x014e
            aj2 r1 = r8.w
            s85 r1 = r1.L0
            i85 r3 = new i85
            m09 r4 = defpackage.m09.v
            r3.<init>(r4, r10)
            defpackage.xag.h(r1, r3)
        L_0x014e:
            aj2 r1 = r8.w
            java.lang.String r1 = r1.Z
            long r3 = r8.x
            java.lang.String r5 = r8.y
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x015b
            goto L_0x017a
        L_0x015b:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x017a
            w78 r7 = defpackage.w78.o
            java.lang.String r10 = "Media viewer. Get video content msg:"
            java.lang.String r12 = ", attach:"
            java.lang.StringBuilder r3 = defpackage.i2a.k(r10, r3, r12, r5)
            java.lang.String r4 = ", content:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r6.d(r7, r1, r3, r9)
        L_0x017a:
            aj2 r1 = r8.w
            hr8 r1 = r1.r()
            if (r1 == 0) goto L_0x01a8
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x01a8
            aj2 r1 = r8.w
            xme r1 = r1.T0
            hr8 r2 = r11.a
            ci2 r3 = new ci2
            r3.<init>((defpackage.hr8) r2, (defpackage.g4g) r0)
            r1.getClass()
            r1.m(r9, r3)
            goto L_0x01a8
        L_0x019a:
            aj2 r0 = r8.w
            s85 r0 = r0.L0
            i85 r1 = new i85
            m09 r2 = defpackage.m09.v
            r1.<init>(r2, r10)
            defpackage.xag.h(r0, r1)
        L_0x01a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
