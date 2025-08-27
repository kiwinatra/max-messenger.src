package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uj  reason: default package */
public final class uj extends SuspendLambda implements Function2 {
    public ArrayList a;
    public int b;
    public final /* synthetic */ va8 c;
    public final /* synthetic */ gk o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj(gk gkVar, jz9 jz9, Continuation continuation) {
        super(2, continuation);
        this.c = jz9;
        this.o = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uj(this.o, (jz9) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uj) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff A[LOOP:1: B:38:0x00f9->B:40:0x00ff, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0026
            if (r2 == r5) goto L_0x0020
            if (r2 != r4) goto L_0x0018
            java.util.ArrayList r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x00f3
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L_0x0074
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r19)
            va8 r2 = r0.c
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0034
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0034:
            gk r2 = r0.o
            java.lang.String r2 = r2.f
            va8 r6 = r0.c
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x003f
            goto L_0x0056
        L_0x003f:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0056
            w78 r8 = defpackage.w78.o
            r9 = 31
            java.lang.String r6 = defpackage.va8.d(r6, r3, r3, r9)
            java.lang.String r9 = "fetchAnimojis for "
            java.lang.String r6 = defpackage.a81.m(r9, r6)
            r7.d(r8, r2, r6, r3)
        L_0x0056:
            gk r2 = r0.o
            gaf r2 = r2.d
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            tj r6 = new tj
            gk r7 = r0.o
            va8 r8 = r0.c
            jz9 r8 = (defpackage.jz9) r8
            r6.<init>(r7, r8, r3)
            r0.b = r5
            java.lang.Object r2 = defpackage.ev0.I(r2, r6, r0)
            if (r2 != r1) goto L_0x0074
            return r1
        L_0x0074:
            du r2 = (defpackage.du) r2
            if (r2 != 0) goto L_0x0091
            gk r0 = r0.o
            java.lang.String r0 = r0.f
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x008e
            w78 r2 = defpackage.w78.w
            java.lang.String r4 = "response is null"
            r1.d(r2, r0, r4, r3)
        L_0x008e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0091:
            java.util.List r2 = r2.v
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            gk r3 = r0.o
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x00a4:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r2.next()
            gi r6 = (defpackage.gi) r6
            kotlin.reflect.KProperty[] r7 = defpackage.gk.p
            r3.getClass()
            dj r7 = new dj
            long r9 = r6.a
            long r11 = r6.d
            java.lang.Long r16 = java.lang.Long.valueOf(r11)
            java.lang.String r15 = r6.f
            java.lang.String r14 = r6.g
            long r11 = r6.b
            java.lang.String r13 = r6.c
            java.lang.String r6 = r6.e
            r8 = r7
            r17 = r14
            r14 = r6
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            r5.add(r7)
            goto L_0x00a4
        L_0x00d4:
            gk r2 = r0.o
            kotlin.reflect.KProperty[] r3 = defpackage.gk.p
            pi r2 = r2.h()
            r0.a = r5
            r0.b = r4
            r2.getClass()
            ni r3 = new ni
            r4 = 0
            r3.<init>(r4, r2, r5)
            i6d r2 = r2.a
            java.lang.Object r2 = defpackage.i8b.r(r2, r3, r0)
            if (r2 != r1) goto L_0x00f2
            return r1
        L_0x00f2:
            r1 = r5
        L_0x00f3:
            gk r0 = r0.o
            java.util.Iterator r1 = r1.iterator()
        L_0x00f9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = r1.next()
            dj r2 = (defpackage.dj) r2
            kotlin.reflect.KProperty[] r3 = defpackage.gk.p
            r0.getClass()
            hi r2 = defpackage.gk.l(r2)
            r0.j(r2)
            goto L_0x00f9
        L_0x0112:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
