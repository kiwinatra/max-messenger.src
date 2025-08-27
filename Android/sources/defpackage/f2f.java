package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: f2f  reason: default package */
public final class f2f extends SuspendLambda implements Function2 {
    public SuggestsViewModel X;
    public int Y;
    public /* synthetic */ Object Z;
    public g0f a;
    public u1f b;
    public u1f c;
    public scf o;
    public SuggestsViewModel v;
    public final /* synthetic */ SuggestsViewModel v0;
    public Collection w;
    public final /* synthetic */ String w0;
    public Iterator x;
    public final /* synthetic */ b33 x0;
    public scf y;
    public s1f z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f2f(SuggestsViewModel suggestsViewModel, String str, b33 b33, Continuation continuation) {
        super(2, continuation);
        this.v0 = suggestsViewModel;
        this.w0 = str;
        this.x0 = b33;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f2f f2f = new f2f(this.v0, this.w0, this.x0, continuation);
        f2f.Z = obj;
        return f2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f2f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: d14} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0174, code lost:
        if (r2 == 0) goto L_0x0176;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.Y
            y1f r3 = defpackage.y1f.a
            r6 = 2
            r7 = 1
            ru.ok.messages.suggests.SuggestsViewModel r8 = r0.v0
            if (r2 == 0) goto L_0x0052
            if (r2 == r7) goto L_0x0044
            if (r2 != r6) goto L_0x003c
            ru.ok.messages.suggests.SuggestsViewModel r2 = r0.X
            s1f r9 = r0.z
            scf r10 = r0.y
            java.util.Iterator r11 = r0.x
            java.util.Collection r12 = r0.w
            java.util.Collection r12 = (java.util.Collection) r12
            ru.ok.messages.suggests.SuggestsViewModel r13 = r0.v
            scf r14 = r0.o
            u1f r15 = r0.c
            u1f r5 = r0.b
            g0f r4 = r0.a
            java.lang.Object r6 = r0.Z
            d14 r6 = (defpackage.d14) r6
            kotlin.ResultKt.throwOnFailure(r28)
            r7 = r28
            r17 = r8
            r8 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x0127
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            u1f r2 = r0.b
            g0f r4 = r0.a
            java.lang.Object r5 = r0.Z
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r28)
            r6 = r28
            goto L_0x00b7
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r28)
            java.lang.Object r2 = r0.Z
            r5 = r2
            d14 r5 = (defpackage.d14) r5
            defpackage.e14.e(r5)
            p1a r2 = r8.D
            if (r2 != 0) goto L_0x0062
            r2 = 0
        L_0x0062:
            int r12 = r2.X()
            u1f r2 = r8.t
            java.lang.String r2 = r2.a
            java.lang.String r4 = r0.w0
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 != 0) goto L_0x0076
            u1f r2 = defpackage.u1f.g
            r8.t = r2
        L_0x0076:
            a32 r2 = r8.j
            if (r2 == 0) goto L_0x0081
            m72 r2 = r2.b
            if (r2 == 0) goto L_0x0081
            l72 r2 = r2.b
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            g0f r4 = defpackage.p3a.s(r4, r12, r2)
            g0f r2 = defpackage.g0f.v
            if (r4 != r2) goto L_0x0090
            r8.o(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0090:
            u1f r2 = r8.t
            r0.Z = r5
            r0.a = r4
            r0.b = r2
            r0.Y = r7
            b33 r13 = r0.x0
            java.lang.Object r6 = r13.b
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.a()
            d0f r15 = new d0f
            r14 = 0
            java.lang.String r11 = r0.w0
            r9 = r15
            r10 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r6 = defpackage.ev0.I(r6, r15, r0)
            if (r6 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            u1f r6 = (defpackage.u1f) r6
            defpackage.e14.e(r5)
            tcf r9 = r8.g
            scf r9 = r9.c()
            java.util.List r10 = r6.d
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
            r15 = r6
            r12 = r11
            r6 = r5
            r11 = r10
            r5 = r2
            r2 = r8
            r10 = r9
        L_0x00d6:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L_0x01f9
            java.lang.Object r9 = r11.next()
            s1f r9 = (defpackage.s1f) r9
            kotlin.Lazy r13 = r2.i
            java.lang.Object r13 = r13.getValue()
            drd r13 = (defpackage.drd) r13
            tze r14 = r9.a
            r17 = r8
            long r7 = r14.a
            r0.Z = r6
            r0.a = r4
            r0.b = r5
            r0.c = r15
            r0.o = r10
            r0.v = r2
            r14 = r12
            java.util.Collection r14 = (java.util.Collection) r14
            r0.w = r14
            r0.x = r11
            r0.y = r10
            r0.z = r9
            r0.X = r2
            r14 = 2
            r0.Y = r14
            r13.getClass()
            brd r14 = new brd
            r28 = r2
            r2 = 0
            r14.<init>(r13, r7, r2)
            kotlin.coroutines.CoroutineContext r7 = r13.b
            java.lang.Object r7 = defpackage.ev0.I(r7, r14, r0)
            if (r7 != r1) goto L_0x0120
            return r1
        L_0x0120:
            r13 = r28
            r8 = r6
            r14 = r10
            r6 = r5
            r5 = r4
            r4 = r13
        L_0x0127:
            r24 = r7
            erd r24 = (defpackage.erd) r24
            int r7 = ru.ok.messages.suggests.SuggestsViewModel.I
            r4.getClass()
            tze r7 = r9.a
            java.lang.String r7 = r7.h
            if (r7 == 0) goto L_0x0146
            int r16 = r7.length()
            if (r16 != 0) goto L_0x013d
            goto L_0x0146
        L_0x013d:
            int r2 = r7.length()
            r0 = 1
            if (r2 != r0) goto L_0x0146
            r0 = 1
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            tld r2 = r4.f
            tze r4 = r9.a
            if (r0 == 0) goto L_0x0154
            r26 = r1
            java.lang.String r1 = r4.c
            r28 = r5
            goto L_0x016a
        L_0x0154:
            r26 = r1
            java.lang.String r1 = r4.c
            boolean r1 = r2.h(r1, r7)
            r28 = r5
            java.lang.String r5 = r4.c
            if (r1 == 0) goto L_0x0169
            int r1 = r10.l
            android.text.SpannableString r1 = defpackage.i8b.C(r1, r5, r7)
            goto L_0x016a
        L_0x0169:
            r1 = r5
        L_0x016a:
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = r4.d
            if (r0 == 0) goto L_0x0176
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0177
        L_0x0176:
            r0 = 0
        L_0x0177:
            r21 = r0
            goto L_0x0196
        L_0x017a:
            java.lang.String r0 = r4.d
            if (r0 == 0) goto L_0x0194
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0185
            goto L_0x0194
        L_0x0185:
            java.lang.String r0 = r4.d
            boolean r2 = r2.h(r0, r7)
            if (r2 == 0) goto L_0x0177
            int r2 = r10.l
            android.text.SpannableString r0 = defpackage.i8b.C(r2, r0, r7)
            goto L_0x0177
        L_0x0194:
            r21 = 0
        L_0x0196:
            if (r1 == 0) goto L_0x019e
            int r0 = r1.length()
            if (r0 != 0) goto L_0x01a8
        L_0x019e:
            if (r21 == 0) goto L_0x01a6
            int r0 = r21.length()
            if (r0 != 0) goto L_0x01a8
        L_0x01a6:
            r2 = 1
            goto L_0x01e4
        L_0x01a8:
            sze r0 = r4.b
            int r0 = r0.ordinal()
            r2 = 1
            if (r0 == 0) goto L_0x01b6
            if (r0 == r2) goto L_0x01b6
        L_0x01b3:
            r22 = 0
            goto L_0x01c9
        L_0x01b6:
            mtb r0 = r4.g
            if (r0 == 0) goto L_0x01b3
            kotlin.Triple r5 = new kotlin.Triple
            int r0 = r0.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r4.f
            r5.<init>(r4, r1, r0)
            r22 = r5
        L_0x01c9:
            zuf r0 = new zuf
            int r4 = r10.l
            r5 = 1041865114(0x3e19999a, float:0.15)
            int r25 = defpackage.j4b.l0(r5, r4)
            tze r4 = r9.a
            boolean r5 = r9.b
            r18 = r0
            r19 = r4
            r20 = r1
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            if (r0 == 0) goto L_0x01ea
            r12.add(r0)
        L_0x01ea:
            r0 = r27
            r4 = r28
            r7 = r2
            r5 = r6
            r6 = r8
            r2 = r13
            r10 = r14
            r8 = r17
            r1 = r26
            goto L_0x00d6
        L_0x01f9:
            r17 = r8
            java.util.List r12 = (java.util.List) r12
            defpackage.e14.e(r6)
            java.util.List r0 = r15.d
            int r0 = r0.size()
            int r1 = r12.size()
            int r0 = r0 - r1
            int r1 = r15.c
            int r1 = r1 - r0
            u1f r0 = new u1f
            int r2 = r15.b
            java.util.List r7 = r15.d
            java.lang.String r8 = r15.a
            r0.<init>(r8, r2, r1, r7)
            r1 = r17
            r1.t = r0
            kotlin.coroutines.CoroutineContext r0 = r6.U()
            defpackage.kv0.q(r0)
            u1f r0 = defpackage.u1f.g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0232
            r0 = 0
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            goto L_0x0233
        L_0x0232:
            r0 = 0
        L_0x0233:
            a32 r2 = r1.j
            if (r2 == 0) goto L_0x0244
            boolean r2 = r2.N()
            if (r2 != 0) goto L_0x0244
            c2f r2 = r1.w
            if (r2 != 0) goto L_0x0246
            c2f r2 = defpackage.c2f.a
            goto L_0x0246
        L_0x0244:
            c2f r2 = defpackage.c2f.b
        L_0x0246:
            java.util.List r5 = ru.ok.messages.suggests.SuggestsViewModel.l(r12, r2)
            a2f r7 = new a2f
            r7.<init>(r5, r0, r2)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0263
            g0f r0 = defpackage.g0f.a
            if (r4 == r0) goto L_0x0263
            g0f r0 = defpackage.g0f.b
            if (r4 == r0) goto L_0x0263
            r1.o(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0263:
            r1.w = r2
            kotlin.coroutines.CoroutineContext r0 = r6.U()
            defpackage.kv0.q(r0)
            r1.v = r12
            r1.o(r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
