package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* renamed from: vi1  reason: default package */
public final class vi1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ xag v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi1(xag xag, Continuation continuation, int i) {
        super(4, continuation);
        this.a = i;
        this.v = xag;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                vi1 vi1 = new vi1((jj1) this.v, (Continuation) obj4, 0);
                vi1.b = (k91) obj;
                vi1.c = (zm1) obj2;
                vi1.o = (Map) obj3;
                return vi1.invokeSuspend(Unit.INSTANCE);
            case 1:
                vi1 vi12 = new vi1((am1) this.v, (Continuation) obj4, 1);
                vi12.b = (k91) obj;
                vi12.c = (vag) obj2;
                vi12.o = (smf) obj3;
                return vi12.invokeSuspend(Unit.INSTANCE);
            default:
                vi1 vi13 = new vi1((r49) this.v, (Continuation) obj4, 2);
                vi13.b = (List) obj;
                vi13.c = (List) obj2;
                vi13.o = (w29) obj3;
                return vi13.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0424 A[LOOP:3: B:57:0x0171->B:169:0x0424, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0421 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r0 = r34
            xag r2 = r0.v
            r4 = 1
            int r5 = r0.a
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            switch(r5) {
                case 0: goto L_0x015e;
                case 1: goto L_0x00f2;
                default: goto L_0x000d;
            }
        L_0x000d:
            kotlin.ResultKt.throwOnFailure(r35)
            java.lang.Object r1 = r0.b
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.c
            java.util.List r5 = (java.util.List) r5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.o
            w29 r0 = (defpackage.w29) r0
            if (r5 == 0) goto L_0x0024
            r10 = r4
            goto L_0x0025
        L_0x0024:
            r10 = 0
        L_0x0025:
            r49 r2 = (defpackage.r49) r2
            if (r10 == 0) goto L_0x0064
            if (r5 == 0) goto L_0x0058
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r1.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r3.next()
            vk3 r4 = (defpackage.vk3) r4
            kotlin.Lazy r5 = r2.v0
            java.lang.Object r5 = r5.getValue()
            gh4 r5 = (defpackage.gh4) r5
            z29 r4 = r5.f(r4)
            r1.add(r4)
            goto L_0x003a
        L_0x0056:
            r7 = r1
            goto L_0x0079
        L_0x0058:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            java.lang.Integer r3 = r2.o
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r3 == 0) goto L_0x0074
            int r3 = r3.intValue()
            java.util.List r1 = kotlin.collections.CollectionsKt.take(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L_0x0074:
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            goto L_0x0056
        L_0x0079:
            java.util.List r1 = r0.a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r8.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ac
            java.lang.Object r3 = r1.next()
            s29 r3 = (defpackage.s29) r3
            t29 r4 = new t29
            int r12 = r3.a
            java.lang.Integer r15 = r3.o
            f1e r5 = r3.v
            ngf r13 = r3.b
            h1e r14 = r3.c
            r11 = r4
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r8.add(r4)
            goto L_0x008a
        L_0x00ac:
            java.util.List r0 = r0.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00bd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r0.next()
            s29 r1 = (defpackage.s29) r1
            t29 r3 = new t29
            int r12 = r1.a
            java.lang.Integer r15 = r1.o
            f1e r4 = r1.v
            ngf r13 = r1.b
            h1e r14 = r1.c
            r11 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r9.add(r3)
            goto L_0x00bd
        L_0x00df:
            kotlin.Lazy r0 = r2.z
            java.lang.Object r0 = r0.getValue()
            z49 r0 = (defpackage.z49) r0
            boolean r11 = r0.c()
            j49 r0 = new j49
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x00f2:
            kotlin.ResultKt.throwOnFailure(r35)
            java.lang.Object r5 = r0.b
            k91 r5 = (defpackage.k91) r5
            java.lang.Object r6 = r0.c
            vag r6 = (defpackage.vag) r6
            java.lang.Object r0 = r0.o
            r16 = r0
            smf r16 = (defpackage.smf) r16
            boolean r8 = r5.g
            boolean r0 = r5.m
            if (r8 != 0) goto L_0x0112
            boolean r7 = r5.u
            if (r7 == 0) goto L_0x0110
            if (r0 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r9 = 0
            goto L_0x0113
        L_0x0112:
            r9 = r4
        L_0x0113:
            if (r8 != 0) goto L_0x0117
            r10 = 0
            goto L_0x0118
        L_0x0117:
            r10 = r6
        L_0x0118:
            boolean r1 = r5.t
            r11 = r1 ^ 1
            if (r8 == 0) goto L_0x014b
            boolean r1 = r5.l
            if (r1 != 0) goto L_0x014b
            am1 r2 = (defpackage.am1) r2
            ph1 r1 = r2.b
            jj1 r1 = (defpackage.jj1) r1
            kotlin.Lazy r1 = r1.z0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x014b
            ph1 r1 = r2.b
            jj1 r1 = (defpackage.jj1) r1
            kotlin.Lazy r1 = r1.B0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r12 = 0
            goto L_0x014c
        L_0x014b:
            r12 = r4
        L_0x014c:
            li1 r1 = r5.j
            boolean r13 = r1.c
            boolean r15 = r5.g
            if (r15 == 0) goto L_0x0156
            r14 = r4
            goto L_0x0157
        L_0x0156:
            r14 = r0
        L_0x0157:
            lnf r0 = new lnf
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x015e:
            kotlin.ResultKt.throwOnFailure(r35)
            java.lang.Object r5 = r0.b
            k91 r5 = (defpackage.k91) r5
            java.lang.Object r6 = r0.c
            zm1 r6 = (defpackage.zm1) r6
            java.lang.Object r0 = r0.o
            java.util.Map r0 = (java.util.Map) r0
            jj1 r2 = (defpackage.jj1) r2
            xme r7 = r2.E0
        L_0x0171:
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            l31 r9 = (defpackage.l31) r9
            q01 r10 = r2.v
            r10.e = r5
            vag r11 = r6.e
            r10.f = r11
            ze1 r11 = r6.b
            r10.g = r11
            ze1 r11 = r6.a
            r10.h = r11
            r10.i = r0
            boolean r11 = r6.d
            r10.a = r11
            me5 r11 = r5.e
            boolean r11 = r11 instanceof defpackage.he5
            if (r11 == 0) goto L_0x01a2
            k31 r9 = defpackage.k31.a
        L_0x0196:
            r34 = r0
            r35 = r2
            r3 = r4
            r22 = r5
            r32 = r6
            r0 = r7
            goto L_0x041b
        L_0x01a2:
            boolean r11 = r9 instanceof defpackage.j31
            if (r11 == 0) goto L_0x0196
            j31 r9 = (defpackage.j31) r9
            pn1 r9 = r9.a
            nfd r11 = defpackage.aj8.a
            r11.getClass()
            aj8 r11 = r5.r
            boolean r11 = defpackage.nfd.r(r11)
            if (r11 != 0) goto L_0x01b9
        L_0x01b7:
            r11 = 0
            goto L_0x01e3
        L_0x01b9:
            java.lang.Object r11 = r10.e
            k91 r11 = (defpackage.k91) r11
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x01c2
            goto L_0x01b7
        L_0x01c2:
            java.lang.Object r11 = r10.g
            ze1 r11 = (defpackage.ze1) r11
            if (r11 == 0) goto L_0x01d5
            ze1 r12 = defpackage.ze1.c
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 != 0) goto L_0x01d5
            java.lang.Object r11 = r10.g
            ze1 r11 = (defpackage.ze1) r11
            goto L_0x01e3
        L_0x01d5:
            java.lang.Object r11 = r10.e
            k91 r11 = (defpackage.k91) r11
            y8b r11 = r11.h
            if (r11 == 0) goto L_0x01b7
            cf1 r11 = r11.a
            ze1 r11 = r11.getId()
        L_0x01e3:
            java.lang.Object r12 = r10.f
            vag r12 = (defpackage.vag) r12
            java.lang.Object r13 = r10.i
            java.util.Map r13 = (java.util.Map) r13
            gd8 r12 = r10.c(r12, r13, r11)
            j31 r13 = new j31
            java.lang.Object r14 = r10.f
            vag r14 = (defpackage.vag) r14
            java.lang.Object r15 = r10.e
            k91 r15 = (defpackage.k91) r15
            boolean r1 = r15.t
            if (r1 == 0) goto L_0x020c
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0201:
            r34 = r0
            r17 = r1
            r35 = r2
            r22 = r5
            r2 = 0
            goto L_0x02bc
        L_0x020c:
            ni1 r1 = r15.i
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0224
            tc1 r1 = new tc1
            java.lang.Object r11 = r10.e
            k91 r11 = (defpackage.k91) r11
            ni1 r11 = r11.i
            r1.<init>(r11)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L_0x0201
        L_0x0224:
            java.lang.Object r1 = r10.e
            k91 r1 = (defpackage.k91) r1
            boolean r15 = r1.g
            if (r15 == 0) goto L_0x0297
            rc1 r15 = new rc1
            vag r4 = defpackage.vag.o
            java.lang.Object r3 = r10.i
            java.util.Map r3 = (java.util.Map) r3
            java.util.Collection r3 = r3.values()
            java.util.List r1 = r10.a(r3, r4, r1)
            java.lang.Object r3 = r10.e
            k91 r3 = (defpackage.k91) r3
            boolean r3 = r3.t
            if (r3 == 0) goto L_0x0246
            r3 = 0
            goto L_0x024b
        L_0x0246:
            yu6 r3 = new yu6
            r3.<init>(r1)
        L_0x024b:
            r15.<init>(r3)
            java.lang.Object r1 = r10.e
            k91 r1 = (defpackage.k91) r1
            boolean r1 = r1.l
            if (r1 == 0) goto L_0x0280
            vc1 r1 = new vc1
            java.lang.Object r3 = r10.i
            java.util.Map r3 = (java.util.Map) r3
            vag r4 = defpackage.vag.b
            r34 = r0
            gd8 r0 = r10.c(r4, r3, r11)
            r35 = r2
            java.lang.Object r2 = r10.e
            k91 r2 = (defpackage.k91) r2
            r22 = r5
            java.lang.Object r5 = r10.i
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.util.List r2 = r10.a(r5, r4, r2)
            nge r0 = r10.b(r3, r0, r2, r11)
            r1.<init>(r0)
            goto L_0x0287
        L_0x0280:
            r34 = r0
            r35 = r2
            r22 = r5
            r1 = 0
        L_0x0287:
            r0 = 2
            wc1[] r0 = new defpackage.wc1[r0]
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r15
            java.util.List r0 = kotlin.collections.CollectionsKt.listOfNotNull((T[]) r0)
        L_0x0294:
            r17 = r0
            goto L_0x02bc
        L_0x0297:
            r34 = r0
            r35 = r2
            r22 = r5
            r2 = 0
            java.lang.Object r0 = r10.i
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.List r0 = r10.a(r0, r14, r1)
            vc1 r1 = new vc1
            java.lang.Object r3 = r10.i
            java.util.Map r3 = (java.util.Map) r3
            nge r0 = r10.b(r3, r12, r0, r11)
            r1.<init>(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L_0x0294
        L_0x02bc:
            java.lang.Object r0 = r10.c
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            if (r12 == 0) goto L_0x02d9
            js9 r1 = defpackage.vag.a
            java.lang.Object r3 = r10.f
            vag r3 = (defpackage.vag) r3
            r1.getClass()
            boolean r1 = defpackage.js9.k(r3)
            if (r1 == 0) goto L_0x02d9
            java.lang.Object r1 = r10.e
            k91 r1 = (defpackage.k91) r1
            boolean r1 = r1.t
            if (r1 == 0) goto L_0x02e0
        L_0x02d9:
            r32 = r6
            r33 = r7
            r3 = 1
            goto L_0x038e
        L_0x02e0:
            nr7 r1 = new nr7
            java.lang.Object r3 = r10.e
            k91 r3 = (defpackage.k91) r3
            boolean r4 = r3.g
            o0g r5 = r12.g
            if (r4 != 0) goto L_0x02f8
            boolean r3 = r3.u
            if (r3 == 0) goto L_0x02f1
            goto L_0x02f8
        L_0x02f1:
            r32 = r6
            r33 = r7
            r25 = 0
            goto L_0x0333
        L_0x02f8:
            java.lang.Object r3 = r0.getValue()
            r23 = r3
            hl1 r23 = (defpackage.hl1) r23
            java.lang.Object r3 = r10.e
            k91 r3 = (defpackage.k91) r3
            boolean r4 = r3.g
            if (r5 == 0) goto L_0x030d
            boolean r11 = r5.g
            r30 = r11
            goto L_0x030f
        L_0x030d:
            r30 = r2
        L_0x030f:
            boolean r11 = r3.m
            me5 r3 = r3.e
            boolean r15 = r12.h
            lge r2 = r12.i
            r32 = r6
            java.lang.CharSequence r6 = r12.b
            r33 = r7
            boolean r7 = r12.f
            r24 = r15
            r25 = r2
            r26 = r6
            r27 = r4
            r28 = r7
            r29 = r11
            r31 = r3
            android.text.SpannableStringBuilder r2 = r23.e(r24, r25, r26, r27, r28, r29, r30, r31)
            r25 = r2
        L_0x0333:
            java.lang.Object r2 = r10.h
            ze1 r2 = (defpackage.ze1) r2
            ze1 r3 = r12.c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x034a
            java.lang.Object r2 = r10.e
            k91 r2 = (defpackage.k91) r2
            boolean r2 = r2.g
            if (r2 == 0) goto L_0x034a
            r26 = 1
            goto L_0x034c
        L_0x034a:
            r26 = 0
        L_0x034c:
            boolean r2 = r12.h
            if (r2 == 0) goto L_0x0364
            java.lang.Object r2 = r10.e
            k91 r2 = (defpackage.k91) r2
            boolean r2 = r2.g
            if (r2 != 0) goto L_0x0364
            if (r5 == 0) goto L_0x0364
            boolean r2 = r5.c
            r3 = 1
            if (r2 != r3) goto L_0x0364
            p0g r2 = defpackage.p0g.b
        L_0x0361:
            r28 = r2
            goto L_0x0372
        L_0x0364:
            java.lang.Object r2 = r10.e
            k91 r2 = (defpackage.k91) r2
            boolean r2 = r2.g
            if (r2 == 0) goto L_0x036f
            p0g r2 = defpackage.p0g.a
            goto L_0x0361
        L_0x036f:
            p0g r2 = defpackage.p0g.o
            goto L_0x0361
        L_0x0372:
            ze1 r2 = r12.c
            boolean r3 = r12.d
            r23 = r1
            r24 = r2
            r27 = r3
            r23.<init>(r24, r25, r26, r27, r28)
            nr7 r2 = defpackage.nr7.f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x038a
            goto L_0x038b
        L_0x038a:
            r1 = 0
        L_0x038b:
            r19 = r1
            goto L_0x0390
        L_0x038e:
            r19 = 0
        L_0x0390:
            java.lang.Object r1 = r10.e
            k91 r1 = (defpackage.k91) r1
            boolean r2 = r1.t
            if (r2 != 0) goto L_0x039b
            r18 = 0
            goto L_0x03f9
        L_0x039b:
            evf r2 = new evf
            l21 r1 = r1.f
            if (r1 == 0) goto L_0x03a6
            java.lang.CharSequence r1 = r1.b
            r24 = r1
            goto L_0x03a8
        L_0x03a6:
            r24 = 0
        L_0x03a8:
            java.lang.Object r0 = r0.getValue()
            hl1 r0 = (defpackage.hl1) r0
            java.lang.Object r1 = r10.e
            k91 r1 = (defpackage.k91) r1
            boolean r4 = r1.d
            boolean r5 = r1.g
            boolean r6 = r1.m
            me5 r1 = r1.e
            java.lang.String r25 = r0.d(r5, r4, r6, r1)
            java.lang.Object r0 = r10.e
            k91 r0 = (defpackage.k91) r0
            l21 r1 = r0.f
            ld9 r4 = r0.c
            if (r4 == 0) goto L_0x03cb
            r27 = r3
            goto L_0x03cd
        L_0x03cb:
            r27 = 0
        L_0x03cd:
            aj8 r0 = r0.r
            boolean r28 = defpackage.nfd.r(r0)
            java.lang.Object r0 = r10.e
            k91 r0 = (defpackage.k91) r0
            me5 r0 = r0.e
            boolean r4 = r0 instanceof defpackage.ge5
            if (r4 == 0) goto L_0x03e0
            ge5 r0 = (defpackage.ge5) r0
            goto L_0x03e1
        L_0x03e0:
            r0 = 0
        L_0x03e1:
            if (r0 == 0) goto L_0x03e6
            fe5 r0 = r0.b
            goto L_0x03e7
        L_0x03e6:
            r0 = 0
        L_0x03e7:
            fe5 r4 = defpackage.fe5.c
            if (r0 != r4) goto L_0x03ee
            r29 = r3
            goto L_0x03f0
        L_0x03ee:
            r29 = 0
        L_0x03f0:
            r23 = r2
            r26 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r18 = r2
        L_0x03f9:
            java.lang.Object r0 = r10.e
            k91 r0 = (defpackage.k91) r0
            boolean r0 = r0.g
            if (r12 == 0) goto L_0x0406
            zd0 r1 = r12.a
            r21 = r1
            goto L_0x0408
        L_0x0406:
            r21 = 0
        L_0x0408:
            r9.getClass()
            pn1 r1 = new pn1
            r15 = r1
            r16 = r14
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r13.<init>(r1)
            r9 = r13
            r0 = r33
        L_0x041b:
            boolean r1 = r0.b(r8, r9)
            if (r1 == 0) goto L_0x0424
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0424:
            r2 = r35
            r7 = r0
            r4 = r3
            r5 = r22
            r6 = r32
            r0 = r34
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
