package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: x1d  reason: default package */
public final class x1d extends SuspendLambda implements Function2 {
    public Ref.ObjectRef a;
    public Ref.ObjectRef b;
    public Function2 c;
    public int o;
    public final /* synthetic */ ju7 v;
    public final /* synthetic */ iu7 w;
    public final /* synthetic */ d14 x;
    public final /* synthetic */ Function2 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x1d(ju7 ju7, iu7 iu7, d14 d14, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.v = ju7;
        this.w = iu7;
        this.x = d14;
        this.y = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x1d(this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x1d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            r4 = 0
            ju7 r5 = r0.v
            if (r2 == 0) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x0019 }
            goto L_0x00a2
        L_0x0019:
            r0 = move-exception
            goto L_0x00b7
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r5
            lv7 r2 = (defpackage.lv7) r2
            iu7 r2 = r2.d
            iu7 r6 = defpackage.iu7.a
            if (r2 != r6) goto L_0x0033
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0033:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            iu7 r6 = r0.w     // Catch:{ all -> 0x009b }
            d14 r9 = r0.x     // Catch:{ all -> 0x009b }
            kotlin.jvm.functions.Function2 r13 = r0.y     // Catch:{ all -> 0x009b }
            r0.a = r2     // Catch:{ all -> 0x009b }
            r0.b = r14     // Catch:{ all -> 0x009b }
            r0.c = r13     // Catch:{ all -> 0x009b }
            r0.o = r3     // Catch:{ all -> 0x009b }
            lw1 r15 = new lw1     // Catch:{ all -> 0x009b }
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r16)     // Catch:{ all -> 0x009b }
            r15.<init>(r3, r7)     // Catch:{ all -> 0x009b }
            r15.u()     // Catch:{ all -> 0x009b }
            fu7 r7 = defpackage.hu7.Companion     // Catch:{ all -> 0x009b }
            r7.getClass()     // Catch:{ all -> 0x009b }
            int[] r7 = defpackage.eu7.$EnumSwitchMapping$0     // Catch:{ all -> 0x009b }
            int r8 = r6.ordinal()     // Catch:{ all -> 0x009b }
            r7 = r7[r8]     // Catch:{ all -> 0x009b }
            if (r7 == r3) goto L_0x0075
            r3 = 2
            if (r7 == r3) goto L_0x0072
            r3 = 3
            if (r7 == r3) goto L_0x006e
            r7 = r4
            goto L_0x0078
        L_0x006e:
            hu7 r3 = defpackage.hu7.ON_RESUME     // Catch:{ all -> 0x009b }
        L_0x0070:
            r7 = r3
            goto L_0x0078
        L_0x0072:
            hu7 r3 = defpackage.hu7.ON_START     // Catch:{ all -> 0x009b }
            goto L_0x0070
        L_0x0075:
            hu7 r3 = defpackage.hu7.ON_CREATE     // Catch:{ all -> 0x009b }
            goto L_0x0070
        L_0x0078:
            hu7 r10 = defpackage.fu7.a(r6)     // Catch:{ all -> 0x009b }
            a0a r12 = defpackage.cvg.a()     // Catch:{ all -> 0x009b }
            w1d r3 = new w1d     // Catch:{ all -> 0x009b }
            r6 = r3
            r8 = r2
            r11 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x009b }
            r14.element = r3     // Catch:{ all -> 0x009b }
            r5.a(r3)     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r15.t()     // Catch:{ all -> 0x009b }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x009b }
            if (r3 != r6) goto L_0x009e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r16)     // Catch:{ all -> 0x009b }
            goto L_0x009e
        L_0x009b:
            r0 = move-exception
            r1 = r14
            goto L_0x00b7
        L_0x009e:
            if (r3 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r1 = r14
        L_0x00a2:
            T r0 = r2.element
            pm7 r0 = (defpackage.pm7) r0
            if (r0 == 0) goto L_0x00ab
            r0.b(r4)
        L_0x00ab:
            T r0 = r1.element
            zu7 r0 = (defpackage.zu7) r0
            if (r0 == 0) goto L_0x00b4
            r5.b(r0)
        L_0x00b4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00b7:
            T r2 = r2.element
            pm7 r2 = (defpackage.pm7) r2
            if (r2 == 0) goto L_0x00c0
            r2.b(r4)
        L_0x00c0:
            T r1 = r1.element
            zu7 r1 = (defpackage.zu7) r1
            if (r1 == 0) goto L_0x00c9
            r5.b(r1)
        L_0x00c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
