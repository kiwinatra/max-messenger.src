package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ol9  reason: default package */
public final class ol9 extends SuspendLambda implements Function2 {
    public s85 a;
    public long b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ o00 v;
    public final /* synthetic */ en9 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol9(o00 o00, en9 en9, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.v = o00;
        this.w = en9;
        this.x = j;
        this.y = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ol9 ol9 = new ol9(this.v, this.w, this.x, this.y, continuation);
        ol9.o = obj;
        return ol9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ol9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: a32} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: en9} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0297, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0298, code lost:
        r3 = (defpackage.l20) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x029a, code lost:
        if (r3 != null) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a3, code lost:
        if (r3.n.c() != false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a5, code lost:
        r0 = defpackage.en9.A1;
        r0 = r12.u();
        r1 = r12.b.a;
        r10.c = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bd, code lost:
        if (r0.a(r1, r10.x, r3.q, r6, r15) != r11) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02bf, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c0, code lost:
        r0 = (defpackage.a32) r12.k1.a.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ca, code lost:
        if (r0 == null) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02cc, code lost:
        r3 = ((defpackage.ybe) r4).b;
        r10.c = 7;
        r0 = r10.w.q(r0.a, r3, r10.x, false, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e2, code lost:
        if (r0 != r11) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e4, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e5, code lost:
        defpackage.xag.h(r12.t1, (defpackage.v5a) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f0, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f3, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031e, code lost:
        defpackage.xag.h(r12.t1, (defpackage.v5a) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b9, code lost:
        r0 = (defpackage.h4b) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c1, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) defpackage.e4b.a) != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c5, code lost:
        if ((r0 instanceof defpackage.f4b) == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c7, code lost:
        r0 = (defpackage.f4b) r0;
        defpackage.xag.h(r12.t1, new defpackage.d4b(r0.a, r0.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03db, code lost:
        if ((r0 instanceof defpackage.g4b) == false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03dd, code lost:
        r8 = r12.t1;
        r1 = r13.a;
        r0 = (defpackage.g4b) r0;
        r3 = r0.b;
        r10.o = r12;
        r10.a = r8;
        r10.c = 12;
        r0 = r12.q(r1, r3, r0.a, true, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f6, code lost:
        if (r0 != r11) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03f8, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03f9, code lost:
        r1 = defpackage.en9.A1;
        r12.getClass();
        defpackage.xag.h(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0407, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x044c, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f3, code lost:
        r0 = (defpackage.ha9) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f5, code lost:
        if (r0 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f7, code lost:
        r5 = r0.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fa, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fb, code lost:
        if (r5 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r5.q() != true) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        r5 = r5.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        r2 = r12.t1;
        r6 = defpackage.fk9.b;
        r7 = r12.b.a;
        r4 = (defpackage.vp6) r4;
        r9 = r4.a;
        r11 = r4.d;
        r13 = r4.e;
        r4 = r4.f;
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        if (r5 == null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r2 = r5.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011d, code lost:
        r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0122, code lost:
        if (r0 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0124, code lost:
        r2 = r0.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        r6.getClass();
        r2 = new java.lang.StringBuilder(":location/show?lat=");
        r2.append(r11);
        r2.append("&lon=");
        r2.append(r13);
        r2.append("&z=");
        r2.append(r4);
        defpackage.tr1.v(r2, "&chat_id=", r7, "&msg_id=");
        r2.append(r9);
        r0 = new java.lang.StringBuilder(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0155, code lost:
        if (r3 == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0157, code lost:
        r0.append("&sender_id=" + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0168, code lost:
        defpackage.a81.r(r0.toString(), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cb, code lost:
        r0 = (defpackage.ha9) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cd, code lost:
        if (r0 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cf, code lost:
        r0 = r0.x0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d1, code lost:
        if (r0 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d3, code lost:
        r0 = (java.util.List) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d7, code lost:
        if (r0 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d9, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e3, code lost:
        if (r0.hasNext() == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e5, code lost:
        r4 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4.q, (java.lang.Object) r10.y) == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f6, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f7, code lost:
        r3 = (defpackage.l20) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f9, code lost:
        if (r3 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0200, code lost:
        if (r3.i() != false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0208, code lost:
        if (r3.n.c() != false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020a, code lost:
        r0 = defpackage.en9.A1;
        r0 = r12.u();
        r1 = r12.b.a;
        r10.c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0222, code lost:
        if (r0.a(r1, r10.x, r3.q, r6, r15) != r11) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0224, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0225, code lost:
        r10.c = 4;
        r0 = defpackage.en9.A1;
        r0 = r10.w.q(r1, r3.q, r10.x, false, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0236, code lost:
        if (r0 != r11) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0238, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0239, code lost:
        defpackage.xag.h(r12.t1, (defpackage.v5a) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0244, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0269, code lost:
        r0 = ((defpackage.a89) r0).a.x0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026f, code lost:
        if (r0 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0271, code lost:
        r0 = (java.util.List) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0275, code lost:
        if (r0 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0277, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0281, code lost:
        if (r0.hasNext() == false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0283, code lost:
        r1 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0295, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.q, (java.lang.Object) ((defpackage.ybe) r4).b) == false) goto L_0x027d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r15
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.c
            d20 r6 = defpackage.d20.c
            java.lang.String r1 = "&chat_id="
            r2 = 1
            r3 = 0
            o00 r4 = r10.v
            en9 r12 = r10.w
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0062;
                case 2: goto L_0x0058;
                case 3: goto L_0x0053;
                case 4: goto L_0x004c;
                case 5: goto L_0x0045;
                case 6: goto L_0x0053;
                case 7: goto L_0x003e;
                case 8: goto L_0x0037;
                case 9: goto L_0x0053;
                case 10: goto L_0x0053;
                case 11: goto L_0x002b;
                case 12: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            s85 r0 = r10.a
            java.lang.Object r1 = r10.o
            r12 = r1
            en9 r12 = (defpackage.en9) r12
            kotlin.ResultKt.throwOnFailure(r16)
            r8 = r0
            r0 = r16
            goto L_0x03f9
        L_0x002b:
            java.lang.Object r0 = r10.o
            a32 r0 = (defpackage.a32) r0
            kotlin.ResultKt.throwOnFailure(r16)
            r13 = r0
            r0 = r16
            goto L_0x03b9
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L_0x031e
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L_0x02e5
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L_0x0269
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L_0x0239
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r16)
            goto L_0x044a
        L_0x0058:
            long r0 = r10.b
            kotlin.ResultKt.throwOnFailure(r16)
            r1 = r0
            r0 = r16
            goto L_0x01cb
        L_0x0062:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L_0x00f3
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r16)
            java.lang.Object r0 = r10.o
            d14 r0 = (defpackage.d14) r0
            boolean r5 = r4 instanceof defpackage.i01
            if (r5 == 0) goto L_0x00de
            i01 r4 = (defpackage.i01) r4
            g01 r0 = r4.e
            boolean r1 = r0 instanceof defpackage.f01
            if (r1 == 0) goto L_0x00a7
            f01 r0 = (defpackage.f01) r0
            boolean r1 = r0.b
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            boolean r1 = r1.booleanValue()
            kotlin.Lazy r2 = r12.a1
            java.lang.Object r2 = r2.getValue()
            tq1 r2 = (defpackage.tq1) r2
            rq1 r3 = defpackage.rq1.ATTACH
            r2.c(r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            l4b r1 = new l4b
            long r2 = r0.a
            boolean r0 = r0.b
            r1.<init>(r2, r0)
            s85 r0 = r12.t1
            defpackage.xag.h(r0, r1)
            goto L_0x044a
        L_0x00a7:
            boolean r1 = r0 instanceof defpackage.e01
            if (r1 == 0) goto L_0x00d8
            e01 r0 = (defpackage.e01) r0
            boolean r1 = r0.b
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            boolean r1 = r1.booleanValue()
            kotlin.Lazy r2 = r12.a1
            java.lang.Object r2 = r2.getValue()
            tq1 r2 = (defpackage.tq1) r2
            rq1 r3 = defpackage.rq1.ATTACH
            r2.c(r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            z3b r1 = new z3b
            long r2 = r0.a
            boolean r4 = r0.b
            java.lang.String r0 = r0.c
            r1.<init>(r2, r0, r4)
            s85 r0 = r12.t1
            defpackage.xag.h(r0, r1)
            goto L_0x044a
        L_0x00d8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00de:
            boolean r5 = r4 instanceof defpackage.vp6
            long r7 = r10.x
            if (r5 == 0) goto L_0x0172
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            to9 r0 = r12.t()
            r10.c = r2
            java.lang.Object r0 = r0.a(r7, r15)
            if (r0 != r11) goto L_0x00f3
            return r11
        L_0x00f3:
            ha9 r0 = (defpackage.ha9) r0
            if (r0 == 0) goto L_0x00fa
            ha9 r5 = r0.A0
            goto L_0x00fb
        L_0x00fa:
            r5 = r3
        L_0x00fb:
            if (r5 == 0) goto L_0x0106
            boolean r6 = r5.q()
            if (r6 != r2) goto L_0x0106
            ha9 r5 = r5.A0
            goto L_0x00fb
        L_0x0106:
            s85 r2 = r12.t1
            fk9 r6 = defpackage.fk9.b
            go9 r7 = r12.b
            long r7 = r7.a
            vp6 r4 = (defpackage.vp6) r4
            long r9 = r4.a
            double r11 = r4.d
            double r13 = r4.e
            float r4 = r4.f
            r15 = r2
            if (r5 == 0) goto L_0x0122
            long r2 = r5.w
        L_0x011d:
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            goto L_0x0127
        L_0x0122:
            if (r0 == 0) goto L_0x0127
            long r2 = r0.w
            goto L_0x011d
        L_0x0127:
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = ":location/show?lat="
            r2.<init>(r5)
            r2.append(r11)
            java.lang.String r5 = "&lon="
            r2.append(r5)
            r2.append(r13)
            java.lang.String r5 = "&z="
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "&msg_id="
            defpackage.tr1.v(r2, r1, r7, r4)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            if (r3 == 0) goto L_0x0168
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&sender_id="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x0168:
            java.lang.String r0 = r0.toString()
            r1 = r15
            defpackage.a81.r(r0, r1)
            goto L_0x044a
        L_0x0172:
            boolean r5 = r4 instanceof defpackage.toe
            if (r5 == 0) goto L_0x01a8
            s85 r0 = r12.t1
            fk9 r2 = defpackage.fk9.b
            toe r4 = (defpackage.toe) r4
            gpe r3 = r4.a
            long r3 = r3.a
            go9 r5 = r12.b
            long r5 = r5.a
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = ":stickers/preview?sticker_id="
            r2.<init>(r9)
            r2.append(r3)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = "&forward_id="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            defpackage.a81.r(r1, r0)
            goto L_0x044a
        L_0x01a8:
            boolean r1 = r4 instanceof defpackage.o43
            if (r1 == 0) goto L_0x0248
            etc r0 = r12.k1
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x0245
            to9 r1 = r12.t()
            long r4 = r0.a
            r10.b = r4
            r0 = 2
            r10.c = r0
            java.lang.Object r0 = r1.a(r7, r15)
            if (r0 != r11) goto L_0x01ca
            return r11
        L_0x01ca:
            r1 = r4
        L_0x01cb:
            ha9 r0 = (defpackage.ha9) r0
            if (r0 == 0) goto L_0x0242
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x0242
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0242
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01df:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f7
            java.lang.Object r4 = r0.next()
            r5 = r4
            l20 r5 = (defpackage.l20) r5
            java.lang.String r5 = r5.q
            java.lang.String r7 = r10.y
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x01df
            r3 = r4
        L_0x01f7:
            l20 r3 = (defpackage.l20) r3
            if (r3 != 0) goto L_0x01fc
            goto L_0x0242
        L_0x01fc:
            boolean r0 = r3.i()
            if (r0 != 0) goto L_0x0225
            d20 r0 = r3.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0225
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            swf r0 = r12.u()
            go9 r1 = r12.b
            long r1 = r1.a
            r4 = 3
            r10.c = r4
            long r4 = r10.x
            java.lang.String r7 = r3.q
            r3 = r4
            r5 = r7
            r7 = r15
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r11) goto L_0x044a
            return r11
        L_0x0225:
            r0 = 4
            r10.c = r0
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            r6 = 0
            en9 r0 = r10.w
            java.lang.String r3 = r3.q
            long r4 = r10.x
            r7 = r15
            java.lang.Object r0 = r0.q(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x0239
            return r11
        L_0x0239:
            v5a r0 = (defpackage.v5a) r0
            s85 r1 = r12.t1
            defpackage.xag.h(r1, r0)
            goto L_0x044a
        L_0x0242:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0245:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0248:
            boolean r1 = r4 instanceof defpackage.ybe
            if (r1 == 0) goto L_0x02f4
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            kotlin.Lazy r0 = r12.O0
            java.lang.Object r0 = r0.getValue()
            c48 r0 = (defpackage.c48) r0
            r1 = r4
            ybe r1 = (defpackage.ybe) r1
            long r7 = r1.a
            mka r0 = r0.a(r7, r2)
            r1 = 5
            r10.c = r1
            java.lang.Object r0 = defpackage.bs0.f(r0, r15)
            if (r0 != r11) goto L_0x0269
            return r11
        L_0x0269:
            a89 r0 = (defpackage.a89) r0
            ha9 r0 = r0.a
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02f1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x027d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0298
            java.lang.Object r1 = r0.next()
            r2 = r1
            l20 r2 = (defpackage.l20) r2
            java.lang.String r2 = r2.q
            r5 = r4
            ybe r5 = (defpackage.ybe) r5
            java.lang.String r5 = r5.b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r2 == 0) goto L_0x027d
            r3 = r1
        L_0x0298:
            l20 r3 = (defpackage.l20) r3
            if (r3 != 0) goto L_0x029d
            goto L_0x02f1
        L_0x029d:
            d20 r0 = r3.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x02c0
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            swf r0 = r12.u()
            go9 r1 = r12.b
            long r1 = r1.a
            r4 = 6
            r10.c = r4
            long r4 = r10.x
            java.lang.String r7 = r3.q
            r3 = r4
            r5 = r7
            r7 = r15
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r11) goto L_0x044a
            return r11
        L_0x02c0:
            etc r0 = r12.k1
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x02ee
            ybe r4 = (defpackage.ybe) r4
            java.lang.String r3 = r4.b
            r1 = 7
            r10.c = r1
            r6 = 0
            en9 r1 = r10.w
            long r4 = r0.a
            long r7 = r10.x
            r0 = r1
            r1 = r4
            r4 = r7
            r7 = r15
            java.lang.Object r0 = r0.q(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x02e5
            return r11
        L_0x02e5:
            v5a r0 = (defpackage.v5a) r0
            s85 r1 = r12.t1
            defpackage.xag.h(r1, r0)
            goto L_0x044a
        L_0x02ee:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02f1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02f4:
            boolean r1 = r4 instanceof defpackage.ede
            if (r1 == 0) goto L_0x032a
            etc r0 = r12.k1
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x0327
            ede r4 = (defpackage.ede) r4
            java.lang.String r3 = r4.b
            r1 = 8
            r10.c = r1
            r6 = 0
            en9 r1 = r10.w
            long r4 = r0.a
            long r7 = r10.x
            r0 = r1
            r1 = r4
            r4 = r7
            r7 = r15
            java.lang.Object r0 = r0.q(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x031e
            return r11
        L_0x031e:
            v5a r0 = (defpackage.v5a) r0
            s85 r1 = r12.t1
            defpackage.xag.h(r1, r0)
            goto L_0x044a
        L_0x0327:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x032a:
            boolean r1 = r4 instanceof defpackage.bl5
            if (r1 == 0) goto L_0x0425
            etc r0 = r12.k1
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            a32 r13 = (defpackage.a32) r13
            if (r13 != 0) goto L_0x033e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x033e:
            bl5 r4 = (defpackage.bl5) r4
            zk5 r0 = r4.i
            boolean r0 = r0 instanceof defpackage.yk5
            kotlin.Lazy r1 = r12.R0
            if (r0 == 0) goto L_0x0368
            java.lang.Object r0 = r1.getValue()
            rk5 r0 = (defpackage.rk5) r0
            long r5 = r4.b
            long r7 = r4.a
            java.lang.String r9 = r4.c
            java.lang.String r12 = r4.d
            r1 = 9
            r10.c = r1
            long r1 = r13.a
            r3 = r5
            r5 = r7
            r7 = r9
            r8 = r12
            r9 = r15
            java.lang.Object r0 = r0.c(r1, r3, r5, r7, r8, r9)
            if (r0 != r11) goto L_0x044a
            return r11
        L_0x0368:
            ome r0 = r4.n
            java.lang.Object r3 = r0.getValue()
            boolean r3 = r3 instanceof defpackage.b00
            if (r3 != 0) goto L_0x0408
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof defpackage.e00
            if (r0 == 0) goto L_0x037c
            goto L_0x0408
        L_0x037c:
            zk5 r0 = r4.i
            boolean r0 = r0 instanceof defpackage.wk5
            if (r0 == 0) goto L_0x044a
            java.lang.Object r0 = r1.getValue()
            rk5 r0 = (defpackage.rk5) r0
            long r5 = r4.b
            java.lang.String r7 = r4.c
            java.lang.String r8 = r4.d
            java.lang.String r9 = r4.h
            al5 r1 = r4.j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x03a1
            if (r1 == r2) goto L_0x039e
            cl5 r1 = defpackage.cl5.c
        L_0x039c:
            r14 = r1
            goto L_0x03a4
        L_0x039e:
            cl5 r1 = defpackage.cl5.b
            goto L_0x039c
        L_0x03a1:
            cl5 r1 = defpackage.cl5.a
            goto L_0x039c
        L_0x03a4:
            r10.o = r13
            r1 = 11
            r10.c = r1
            long r1 = r13.a
            r3 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r14
            r9 = r15
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7, r8, r9)
            if (r0 != r11) goto L_0x03b9
            return r11
        L_0x03b9:
            h4b r0 = (defpackage.h4b) r0
            e4b r1 = defpackage.e4b.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x044a
            boolean r1 = r0 instanceof defpackage.f4b
            if (r1 == 0) goto L_0x03d9
            s85 r1 = r12.t1
            d4b r2 = new d4b
            f4b r0 = (defpackage.f4b) r0
            android.content.Intent r3 = r0.a
            android.net.Uri r0 = r0.b
            r2.<init>(r3, r0)
            defpackage.xag.h(r1, r2)
            goto L_0x044a
        L_0x03d9:
            boolean r1 = r0 instanceof defpackage.g4b
            if (r1 == 0) goto L_0x0402
            s85 r8 = r12.t1
            long r1 = r13.a
            g4b r0 = (defpackage.g4b) r0
            java.lang.String r3 = r0.b
            r10.o = r12
            r10.a = r8
            r4 = 12
            r10.c = r4
            r6 = 1
            long r4 = r0.a
            r0 = r12
            r7 = r15
            java.lang.Object r0 = r0.q(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x03f9
            return r11
        L_0x03f9:
            kotlin.reflect.KProperty[] r1 = defpackage.en9.A1
            r12.getClass()
            defpackage.xag.h(r8, r0)
            goto L_0x044a
        L_0x0402:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0408:
            java.lang.Object r0 = r1.getValue()
            rk5 r0 = (defpackage.rk5) r0
            long r5 = r4.b
            long r7 = r4.a
            java.lang.String r9 = r4.c
            r1 = 10
            r10.c = r1
            long r1 = r13.a
            r3 = r5
            r5 = r7
            r7 = r9
            r8 = r15
            java.lang.Object r0 = r0.b(r1, r3, r5, r7, r8)
            if (r0 != r11) goto L_0x044a
            return r11
        L_0x0425:
            boolean r1 = r4 instanceof defpackage.w4e
            if (r1 == 0) goto L_0x0431
            w4e r4 = (defpackage.w4e) r4
            java.lang.String r0 = r4.b
            r12.x(r0)
            goto L_0x044a
        L_0x0431:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Didn't handle attach click:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
        L_0x044a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
