package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k59  reason: default package */
public final class k59 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ l59 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k59(l59 l59, Continuation continuation) {
        super(2, continuation);
        this.c = l59;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k59(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            l59 r6 = r8.c
            if (r1 == 0) goto L_0x003a
            if (r1 == r5) goto L_0x0036
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r8 = r8.a
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007a
        L_0x001e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0026:
            java.lang.Object r1 = r8.a
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006a
        L_0x002e:
            java.lang.Object r1 = r8.a
            kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0054
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0046
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.b = r5
            java.lang.Object r9 = defpackage.l59.a(r6, r8)
            if (r9 != r0) goto L_0x0046
            return r0
        L_0x0046:
            r1 = r9
            kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
            r8.a = r1
            r8.b = r4
            java.lang.Object r9 = defpackage.l59.b(r6, r8)
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r8.a = r9
            r8.b = r3
            java.lang.Object r1 = defpackage.j4b.g(r1, r8)
            if (r1 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x006a:
            java.util.Collection r9 = (java.util.Collection) r9
            r8.a = r9
            r8.b = r2
            java.lang.Object r8 = defpackage.j4b.g(r1, r8)
            if (r8 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x007a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r8 = kotlin.collections.CollectionsKt.plus(r8, r9)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r8 = kotlin.collections.CollectionsKt.toMutableList(r8)
            kotlin.Lazy r9 = r6.c
            java.lang.Object r9 = r9.getValue()
            ns3 r9 = (defpackage.ns3) r9
            wg7 r0 = new wg7
            r1 = 17
            r0.<init>(r1)
            r9.c(r8, r0)
            jz9 r9 = new jz9
            int r0 = r8.size()
            r9.<init>((int) r0)
            pv r0 = new pv
            r1 = 1
            r0.<init>(r9, r1)
            rz5 r9 = new rz5
            r9.<init>(r1, r0)
            r8.removeIf(r9)
            xme r9 = r6.j
            r9.getClass()
            r0 = 0
            r9.m(r0, r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.g
            r9 = 0
            r8.set(r9)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k59.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
