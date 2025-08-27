package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i88  reason: default package */
public final class i88 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j88 c;
    public final /* synthetic */ l88 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i88(j88 j88, l88 l88, Continuation continuation) {
        super(2, continuation);
        this.c = j88;
        this.o = l88;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i88 i88 = new i88(this.c, this.o, continuation);
        i88.b = obj;
        return i88;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i88) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r11.c.h(r12.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0010, B:10:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ExcHandler: TamErrorException (r12v4 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:4:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.lang.Object r0 = r11.b
            d14 r0 = (defpackage.d14) r0
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ TamErrorException -> 0x0014, all -> 0x004b }
            goto L_0x006d
        L_0x0014:
            r12 = move-exception
            goto L_0x0066
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.b
            d14 r12 = (defpackage.d14) r12
            j88 r1 = r11.c     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            rm r1 = r1.c     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            if (r1 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            kotlin.Lazy r1 = r1.l     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            r4 = r1
            e98 r4 = (defpackage.e98) r4     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            j88 r1 = r11.c     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            long r5 = r1.a     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            l88 r7 = r11.o     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            long r8 = r1.v     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            r11.b = r12     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            r11.a = r3     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            r10 = r11
            java.lang.Object r11 = r4.q(r5, r7, r8, r10)     // Catch:{ TamErrorException -> 0x0014, all -> 0x004a }
            if (r11 != r0) goto L_0x006d
            return r0
        L_0x004a:
            r0 = r12
        L_0x004b:
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getName()
            a67 r12 = defpackage.z68.b
            if (r12 != 0) goto L_0x0058
            goto L_0x006d
        L_0x0058:
            boolean r0 = r12.c()
            if (r0 == 0) goto L_0x006d
            w78 r0 = defpackage.w78.x
            java.lang.String r1 = "beans.loginLogic.onLogin fail"
            r12.d(r0, r11, r1, r2)
            goto L_0x006d
        L_0x0066:
            j88 r11 = r11.c
            qaf r12 = r12.a
            r11.h(r12)
        L_0x006d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i88.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
