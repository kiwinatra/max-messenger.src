package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sj  reason: default package */
public final class sj extends SuspendLambda implements Function2 {
    public ArrayList a;
    public int b;
    public final /* synthetic */ va8 c;
    public final /* synthetic */ gk o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj(gk gkVar, jz9 jz9, Continuation continuation) {
        super(2, continuation);
        this.c = jz9;
        this.o = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sj(this.o, (jz9) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sj) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0133 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.b
            r4 = 0
            r5 = 3
            r6 = 2
            if (r3 == 0) goto L_0x002e
            if (r3 == r1) goto L_0x0028
            if (r3 == r6) goto L_0x0021
            if (r3 != r5) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0134
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            java.util.ArrayList r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x00ff
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r21)
            r3 = r21
            goto L_0x007c
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r21)
            va8 r3 = r0.c
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x003c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x003c:
            gk r3 = r0.o
            java.lang.String r3 = r3.f
            va8 r7 = r0.c
            a67 r8 = defpackage.z68.b
            if (r8 != 0) goto L_0x0047
            goto L_0x005e
        L_0x0047:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x005e
            w78 r9 = defpackage.w78.o
            r10 = 31
            java.lang.String r7 = defpackage.va8.d(r7, r4, r4, r10)
            java.lang.String r10 = "fetchAnimojiSets for "
            java.lang.String r7 = defpackage.a81.m(r10, r7)
            r8.d(r9, r3, r7, r4)
        L_0x005e:
            gk r3 = r0.o
            gaf r3 = r3.d
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.b()
            rj r7 = new rj
            gk r8 = r0.o
            va8 r9 = r0.c
            jz9 r9 = (defpackage.jz9) r9
            r7.<init>(r8, r9, r4)
            r0.b = r1
            java.lang.Object r3 = defpackage.ev0.I(r3, r7, r0)
            if (r3 != r2) goto L_0x007c
            return r2
        L_0x007c:
            du r3 = (defpackage.du) r3
            if (r3 != 0) goto L_0x0099
            gk r0 = r0.o
            java.lang.String r0 = r0.f
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0089
            goto L_0x0096
        L_0x0089:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0096
            w78 r2 = defpackage.w78.w
            java.lang.String r3 = "response is null"
            r1.d(r2, r0, r3, r4)
        L_0x0096:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0099:
            java.util.List r3 = r3.w
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            gk r7 = r0.o
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r3, 10)
            r8.<init>(r9)
            java.util.Iterator r3 = r3.iterator()
        L_0x00ac:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x00dd
            java.lang.Object r9 = r3.next()
            mk r9 = (defpackage.mk) r9
            kotlin.reflect.KProperty[] r10 = defpackage.gk.p
            r7.getClass()
            nk r10 = new nk
            long r12 = r9.a
            long r14 = r9.e
            java.util.List r11 = r9.f
            java.lang.String r5 = r9.b
            java.lang.String r4 = r9.c
            java.lang.String r9 = r9.d
            r19 = r11
            r11 = r10
            r17 = r14
            r14 = r5
            r15 = r4
            r16 = r9
            r11.<init>(r12, r14, r15, r16, r17, r19)
            r8.add(r10)
            r4 = 0
            r5 = 3
            goto L_0x00ac
        L_0x00dd:
            gk r3 = r0.o
            kotlin.reflect.KProperty[] r4 = defpackage.gk.p
            kotlin.Lazy r3 = r3.h
            java.lang.Object r3 = r3.getValue()
            ok r3 = (defpackage.ok) r3
            r0.a = r8
            r0.b = r6
            r3.getClass()
            ni r4 = new ni
            r4.<init>(r1, r3, r8)
            i6d r1 = r3.a
            java.lang.Object r1 = defpackage.i8b.r(r1, r4, r0)
            if (r1 != r2) goto L_0x00fe
            return r2
        L_0x00fe:
            r1 = r8
        L_0x00ff:
            kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)
            h9 r3 = new h9
            r4 = 10
            r3.<init>(r4)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.flatMapIterable(r1, r3)
            gk r3 = r0.o
            l r4 = new l
            r5 = 8
            r4.<init>(r5, r3)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filter(r1, r4)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            gk r3 = r0.o
            java.util.Collection r1 = (java.util.Collection) r1
            jz9 r1 = defpackage.wa8.d(r1)
            r4 = 0
            r0.a = r4
            r4 = 3
            r0.b = r4
            java.lang.Object r0 = r3.e(r1, r0)
            if (r0 != r2) goto L_0x0134
            return r2
        L_0x0134:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
