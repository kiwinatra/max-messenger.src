package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* renamed from: zdd  reason: default package */
public final class zdd extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ aed X;
    public Object[] a;
    public long[] b;
    public int c;
    public int o;
    public int v;
    public int w;
    public long x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zdd(aed aed, Continuation continuation) {
        super(2, continuation);
        this.X = aed;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zdd zdd = new zdd(this.X, continuation);
        zdd.z = obj;
        return zdd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zdd) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L_0x002e
            if (r2 != r3) goto L_0x0026
            int r2 = r0.w
            int r6 = r0.v
            long r7 = r0.x
            int r9 = r0.o
            int r10 = r0.c
            long[] r11 = r0.b
            java.lang.Object[] r12 = r0.a
            java.lang.Object r13 = r0.z
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x008b
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r2 = r0.z
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            aed r6 = r0.X
            java.lang.Object[] r7 = r6.c
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x0099
            r9 = r4
        L_0x0041:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x0094
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L_0x0062:
            if (r2 >= r6) goto L_0x008e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x008b
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.z = r13
            r0.a = r12
            r0.b = r11
            r0.c = r10
            r0.o = r9
            r0.x = r7
            r0.v = r6
            r0.w = r2
            r0.y = r3
            java.lang.Object r14 = r13.yield(r14, r0)
            if (r14 != r1) goto L_0x008b
            return r1
        L_0x008b:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L_0x0062
        L_0x008e:
            if (r6 != r5) goto L_0x0099
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L_0x0094:
            if (r9 == r8) goto L_0x0099
            int r9 = r9 + 1
            goto L_0x0041
        L_0x0099:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
