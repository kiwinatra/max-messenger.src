package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;

/* renamed from: en9  reason: default package */
public final class en9 extends xag {
    public static final /* synthetic */ KProperty[] A1;
    public final q04 A0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final Lazy S0;
    public final Lazy T0;
    public final Lazy U0;
    public final Lazy V0;
    public final Lazy W0;
    public final hr6 X;
    public final Lazy X0;
    public final xe8 Y;
    public final Lazy Y0;
    public final vcd Z;
    public final Lazy Z0;
    public final Lazy a1;
    public final go9 b;
    public final Lazy b1;
    public final lf1 c;
    public final d19 c1;
    public final wie d1;
    public final wie e1;
    public final wie f1;
    public final wie g1;
    public final wie h1;
    public final wie i1;
    public final wie j1;
    public final etc k1;
    public final xme l1;
    public final etc m1;
    public final etc n1;
    public final ek9 o;
    public final xme o1;
    public final etc p1;
    public final s85 q1;
    public final s85 r1;
    public final cid s1;
    public final s85 t1;
    public final ConcurrentHashMap u1;
    public final we8 v;
    public final ay2 v0;
    public final HashSet v1;
    public final gaf w;
    public final srd w0;
    public final Lazy w1;
    public final cpb x;
    public final x23 x0;
    public final bs5 x1;
    public final qx2 y;
    public final j00 y0;
    public final xme y1;
    public final nbg z;
    public final String z0 = en9.class.getName();
    public final etc z1;

    static {
        Class<en9> cls = en9.class;
        A1 = new KProperty[]{rae.s(cls, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "saveVideoProgressJob", "getSaveVideoProgressJob()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, hr6] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, d19] */
    public en9(go9 go9, lf1 lf1, gx gxVar, we8 we8) {
        go9 go92 = go9;
        gx gxVar2 = gxVar;
        vi9 vi9 = vi9.a;
        gaf dispatchers = vi9.getDispatchers();
        cpb cpb = (cpb) vi9.getAccessor().g(cpb.class);
        Class<qx2> cls = qx2.class;
        Class<bud> cls2 = bud.class;
        nbg nbg = new nbg(vi9.getAccessor().h(cls2), vi9.getAccessor().h(bte.class));
        Class<gaf> cls3 = gaf.class;
        Lazy h = vi9.getAccessor().h(ocf.class);
        Lazy h2 = vi9.getAccessor().h(cls);
        Class<to9> cls4 = to9.class;
        Lazy h3 = vi9.getAccessor().h(cls4);
        ? obj = new Object();
        obj.a = (gaf) vi9.getAccessor().g(cls3);
        obj.b = hr6.class.getName();
        obj.c = h;
        obj.o = h2;
        obj.v = h3;
        xe8 xe8 = new xe8(vi9.getAccessor().h(ysc.class));
        vcd c2 = vi9.c();
        q04 b2 = ((osa) ((gaf) vi9.getAccessor().g(cls3))).b();
        Class<rh3> cls5 = rh3.class;
        Lazy h4 = vi9.getAccessor().h(cls5);
        Lazy h5 = vi9.getAccessor().h(cls4);
        vcd vcd = c2;
        Class<rl> cls6 = rl.class;
        xe8 xe82 = xe8;
        hr6 hr6 = obj;
        Class<sv0> cls7 = sv0.class;
        nbg nbg2 = nbg;
        qx2 qx2 = (qx2) vi9.getAccessor().g(cls);
        srd srd = new srd(vi9.getAccessor().h(cls6), vi9.getAccessor().h(cls7), vi9.getAccessor().h(cls4), 0);
        Lazy h6 = vi9.getAccessor().h(cls6);
        Lazy h7 = vi9.getAccessor().h(e0b.class);
        Lazy h8 = vi9.getAccessor().h(Application.class);
        Lazy h9 = vi9.getAccessor().h(cls2);
        Lazy lazy = h8;
        Lazy h10 = vi9.getAccessor().h(eu3.class);
        Lazy h11 = vi9.getAccessor().h(cls4);
        Lazy lazy2 = h10;
        Lazy h12 = vi9.getAccessor().h(j89.class);
        Lazy lazy3 = h11;
        Lazy h13 = vi9.getAccessor().h(na9.class);
        Lazy h14 = vi9.getAccessor().h(rl2.class);
        Lazy h15 = vi9.getAccessor().h(wo9.class);
        Lazy h16 = vi9.getAccessor().h(i99.class);
        Lazy h17 = vi9.getAccessor().h(c48.class);
        Lazy h18 = vi9.getAccessor().h(ur2.class);
        Lazy h19 = vi9.getAccessor().h(ap9.class);
        Lazy h20 = vi9.getAccessor().h(wc9.class);
        Lazy h21 = vi9.getAccessor().h(ae9.class);
        Lazy h22 = vi9.getAccessor().h(swf.class);
        Lazy h23 = vi9.getAccessor().h(rk5.class);
        gaf dispatchers2 = vi9.getDispatchers();
        Lazy lazy4 = h12;
        j00 j00 = (j00) vi9.getAccessor().g(j00.class);
        Lazy lazy5 = h6;
        long j = go92.a;
        cj9 cj9 = new cj9(j, (sv0) vi9.getAccessor().g(cls7), dispatchers2);
        lo9 lo9 = new lo9((sv0) vi9.getAccessor().g(cls7), vi9.getDispatchers());
        Lazy h24 = vi9.getAccessor().h(jqg.class);
        lo9 lo92 = lo9;
        Lazy h25 = vi9.getAccessor().h(cm.class);
        cj9 cj92 = cj9;
        Lazy h26 = vi9.getAccessor().h(by7.class);
        Lazy h27 = vi9.getAccessor().h(cls5);
        long j2 = j;
        Lazy h28 = vi9.getAccessor().h(gk.class);
        Lazy h29 = vi9.getAccessor().h(gq6.class);
        Lazy h30 = vi9.getAccessor().h(ed2.class);
        Lazy h31 = vi9.getAccessor().h(cdd.class);
        Lazy h32 = vi9.getAccessor().h(tq1.class);
        this.b = go92;
        this.c = lf1;
        this.o = gxVar2;
        this.v = we8;
        this.w = dispatchers;
        this.x = cpb;
        qx2 qx22 = qx2;
        this.y = qx22;
        cpb cpb2 = cpb;
        this.z = nbg2;
        this.X = hr6;
        this.Y = xe82;
        this.Z = vcd;
        this.v0 = new ay2((Context) vi9.getAccessor().g(Context.class), b2, vi9.c(), h5, h4);
        this.w0 = srd;
        this.x0 = (x23) vi9.getAccessor().g(x23.class);
        this.y0 = j00;
        osa osa = (osa) dispatchers;
        this.A0 = osa.b().s0(1, "messages-list-vm-io");
        this.B0 = lazy5;
        this.C0 = h9;
        this.D0 = lazy;
        Lazy lazy6 = lazy4;
        this.E0 = lazy6;
        this.F0 = lazy3;
        this.G0 = h15;
        this.H0 = h7;
        this.I0 = lazy2;
        this.J0 = h20;
        this.K0 = h13;
        this.L0 = h16;
        this.M0 = h14;
        this.N0 = h18;
        this.O0 = h17;
        this.P0 = h21;
        this.Q0 = h22;
        this.R0 = h23;
        this.S0 = h24;
        this.T0 = h25;
        this.U0 = h26;
        this.V0 = h27;
        this.W0 = h28;
        this.X0 = h29;
        this.Y0 = h30;
        this.Z0 = h31;
        this.a1 = h32;
        this.b1 = h19;
        Iterable listOf = CollectionsKt.listOf(new b12(1), new b12(0));
        ? obj2 = new Object();
        ArrayList arrayList = new ArrayList();
        for (Object next : listOf) {
            if (next instanceof b12) {
                arrayList.add(next);
            }
        }
        obj2.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            it.next();
        }
        obj2.c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listOf.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        obj2.a = arrayList3;
        this.c1 = obj2;
        this.d1 = o5a.U();
        this.e1 = o5a.U();
        this.f1 = o5a.U();
        this.g1 = o5a.U();
        this.h1 = o5a.U();
        this.i1 = o5a.U();
        this.j1 = o5a.U();
        etc o2 = ((my2) qx22).o(j2);
        this.k1 = o2;
        xme a = f6e.a(wj9.o);
        this.l1 = a;
        etc etc = new etc(a);
        this.m1 = etc;
        i21 i21 = new i21(o2, etc, new x2(this, (Continuation) null, 18), 4);
        List emptyList = CollectionsKt.emptyList();
        o9a o9a = z6e.a;
        this.n1 = bs0.X(i21, this.a, o9a, emptyList);
        xme a2 = f6e.a(hid.e);
        this.o1 = a2;
        this.p1 = new etc(a2);
        this.q1 = new s85(0);
        this.r1 = new s85(1);
        this.s1 = new cid();
        this.t1 = new s85(0);
        this.u1 = new ConcurrentHashMap(0);
        this.v1 = new HashSet();
        this.w1 = LazyKt.lazy(new j35(23, (Object) lazy6, (Object) this));
        this.x1 = bs0.F(new ql8(a, 5), osa.a());
        xme a3 = f6e.a((Object) null);
        this.y1 = a3;
        this.z1 = bs0.X(bs0.u(new ql8(a, 6), new on2(o2, 28), a3, new cl9(this, (Continuation) null)), this.a, o9a, (Object) null);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = go92.f;
        bs0.K(bs0.F(new ps5(new sbd(new zm9(new i21(new on2(o2, 28), gxVar2.B, new sa(3, (Continuation) null, 19), 4), (Continuation) null, this)), new sk9(this, booleanRef, (Continuation) null), 5), osa.a()), this.a);
        xag.g(this, osa.b(), (f14) null, new tk9(this, (Continuation) null), 2);
        bs0.K(new ps5(cj92.e, new uk9(this, (Continuation) null), 5), this.a);
        bs0.K(new ps5(new dtc(lo92.a), new vk9(this, (Continuation) null), 5), this.a);
        cpb cpb3 = cpb2;
        ((xy9) cpb3.a).e(cpb3.g);
        cpb3.c();
        ev0.v(this.a, (CoroutineContext) null, (f14) null, new wk9(this, (Continuation) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.en9 r20, defpackage.a32 r21, java.util.List r22, kotlin.coroutines.Continuation r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            r20.getClass()
            boolean r3 = r2 instanceof defpackage.al9
            if (r3 == 0) goto L_0x001c
            r3 = r2
            al9 r3 = (defpackage.al9) r3
            int r4 = r3.y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.y = r4
            goto L_0x0021
        L_0x001c:
            al9 r3 = new al9
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.w
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.y
            r6 = 0
            r11 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0050
            if (r5 != r7) goto L_0x0048
            kotlin.jvm.internal.Ref$BooleanRef r0 = r3.v
            kotlin.jvm.internal.Ref$BooleanRef r1 = r3.o
            java.util.List r4 = r3.c
            java.util.List r4 = (java.util.List) r4
            a32 r5 = r3.b
            en9 r3 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r19 = r5
            r5 = r0
            r0 = r3
            r3 = r2
            r2 = r1
            r1 = r19
            goto L_0x008b
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r2.element = r7
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
            r5.<init>()
            go9 r8 = r0.b
            long r9 = r8.c
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x00fa
            to9 r8 = r20.t()
            go9 r9 = r0.b
            long r9 = r9.c
            r3.a = r0
            r3.b = r1
            r12 = r22
            java.util.List r12 = (java.util.List) r12
            r3.c = r12
            r3.o = r2
            r3.v = r5
            r3.y = r7
            java.lang.Object r3 = r8.a(r9, r3)
            if (r3 != r4) goto L_0x0089
            goto L_0x01bd
        L_0x0089:
            r4 = r22
        L_0x008b:
            ha9 r3 = (defpackage.ha9) r3
            if (r3 != 0) goto L_0x00d1
            long r7 = defpackage.kr7.t(r1)
            r2.element = r11
            java.lang.String r1 = r0.z0
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x009c
            goto L_0x00ce
        L_0x009c:
            boolean r9 = r3.c()
            if (r9 == 0) goto L_0x00ce
            w78 r9 = defpackage.w78.o
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            java.lang.String r10 = defpackage.iq.U(r10)
            go9 r12 = r0.b
            long r12 = r12.c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "getMessageAnchor: Fallback on chatReadMark="
            r14.<init>(r15)
            r14.append(r10)
            java.lang.String r10 = " cause of loadMessageId="
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = " doesn't exists"
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            r3.d(r9, r1, r10, r6)
        L_0x00ce:
            r8 = r7
            goto L_0x015e
        L_0x00d1:
            java.lang.String r1 = r0.z0
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x00d8
            goto L_0x00f5
        L_0x00d8:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00f5
            w78 r8 = defpackage.w78.o
            long r9 = r3.m()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            java.lang.String r9 = defpackage.iq.U(r9)
            java.lang.String r10 = "getMessageAnchor: loadMessageIdMark="
            java.lang.String r9 = defpackage.a81.m(r10, r9)
            r7.d(r8, r1, r9, r6)
        L_0x00f5:
            long r7 = r3.m()
            goto L_0x00ce
        L_0x00fa:
            long r3 = r8.b
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x012b
            java.lang.String r1 = r0.z0
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0107
            goto L_0x0124
        L_0x0107:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0124
            w78 r4 = defpackage.w78.o
            go9 r7 = r0.b
            long r7 = r7.b
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            java.lang.String r7 = defpackage.iq.U(r7)
            java.lang.String r8 = "getMessageAnchor: loadMark="
            java.lang.String r7 = defpackage.a81.m(r8, r7)
            r3.d(r4, r1, r7, r6)
        L_0x0124:
            go9 r1 = r0.b
            long r7 = r1.b
            r4 = r22
            goto L_0x00ce
        L_0x012b:
            long r3 = defpackage.kr7.t(r21)
            r2.element = r11
            m72 r1 = r1.b
            int r1 = r1.m
            if (r1 != 0) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = r11
        L_0x0139:
            r5.element = r7
            java.lang.String r1 = r0.z0
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0142
            goto L_0x015b
        L_0x0142:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x015b
            w78 r8 = defpackage.w78.o
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            java.lang.String r9 = defpackage.iq.U(r9)
            java.lang.String r10 = "getMessageAnchor: chatReadMark="
            java.lang.String r9 = defpackage.a81.m(r10, r9)
            r7.d(r8, r1, r9, r6)
        L_0x015b:
            r8 = r3
            r4 = r22
        L_0x015e:
            boolean r1 = r2.element
            if (r1 == 0) goto L_0x017e
            cid r2 = r0.s1
            boolean r3 = r5.element
            r2.getClass()
            zhd r4 = new zhd
            r15 = 0
            r17 = 0
            r12 = r4
            r13 = r8
            r16 = r1
            r18 = r3
            r12.<init>(r13, r15, r16, r17, r18)
            tz9 r1 = r2.a
            r1.setValue(r4)
        L_0x017c:
            r5 = r8
            goto L_0x01b4
        L_0x017e:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r1 = r4.iterator()
        L_0x0184:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0198
            java.lang.Object r2 = r1.next()
            r3 = r2
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            long r3 = r3.c
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0184
            r6 = r2
        L_0x0198:
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            if (r6 == 0) goto L_0x017c
            long r1 = r6.c
            cid r3 = r0.s1
            boolean r13 = r5.element
            r3.getClass()
            zhd r4 = new zhd
            r10 = 0
            r12 = 0
            r7 = r4
            r5 = r8
            r8 = r1
            r7.<init>(r8, r10, r11, r12, r13)
            tz9 r1 = r3.a
            r1.setValue(r4)
        L_0x01b4:
            ek9 r0 = r0.o
            gx r0 = (defpackage.gx) r0
            r0.r(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x01bd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.j(en9, a32, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.en9 r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.ml9
            if (r0 == 0) goto L_0x0016
            r0 = r12
            ml9 r0 = (defpackage.ml9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            ml9 r0 = new ml9
            r0.<init>(r9, r12)
        L_0x001b:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            long r10 = r0.b
            en9 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r12)
            xme r12 = r9.l1
            java.lang.Object r12 = r12.getValue()
            wj9 r12 = (defpackage.wj9) r12
            one.me.messages.list.loader.MessageModel r12 = r12.d(r10)
            java.lang.String r2 = r9.z0
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x004f
            goto L_0x0068
        L_0x004f:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0068
            w78 r6 = defpackage.w78.o
            if (r12 == 0) goto L_0x005e
            java.lang.String r7 = r12.n()
            goto L_0x005f
        L_0x005e:
            r7 = r3
        L_0x005f:
            java.lang.String r8 = "loadIfNeedAndScrollToMessage="
            java.lang.String r7 = defpackage.a81.m(r8, r7)
            r5.d(r6, r2, r7, r3)
        L_0x0068:
            if (r12 == 0) goto L_0x0081
            cid r9 = r9.s1
            long r1 = r12.c
            r9.getClass()
            zhd r10 = new zhd
            r4 = 1
            r6 = 0
            r3 = 1
            r5 = 1
            r0 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            tz9 r9 = r9.a
            r9.setValue(r10)
            goto L_0x00d4
        L_0x0081:
            to9 r12 = r9.t()
            r0.a = r9
            r0.b = r10
            r0.v = r4
            java.lang.Object r12 = r12.a(r10, r0)
            if (r12 != r1) goto L_0x0092
            goto L_0x00d6
        L_0x0092:
            ha9 r12 = (defpackage.ha9) r12
            if (r12 != 0) goto L_0x00b1
            java.lang.String r9 = r9.z0
            a67 r12 = defpackage.z68.b
            if (r12 != 0) goto L_0x009d
            goto L_0x00ae
        L_0x009d:
            boolean r0 = r12.c()
            if (r0 == 0) goto L_0x00ae
            w78 r0 = defpackage.w78.x
            java.lang.String r1 = "Trying to scroll for non-existing messageId="
            java.lang.String r10 = defpackage.wj6.i(r10, r1)
            r12.d(r0, r9, r10, r3)
        L_0x00ae:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x00d6
        L_0x00b1:
            ek9 r10 = r9.o
            long r0 = r12.m()
            gx r10 = (defpackage.gx) r10
            r10.r(r0)
            cid r9 = r9.s1
            long r1 = r12.m()
            r9.getClass()
            zhd r10 = new zhd
            r5 = 1
            r6 = 0
            r3 = 0
            r4 = 1
            r0 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            tz9 r9 = r9.a
            r9.setValue(r10)
        L_0x00d4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.k(en9, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(defpackage.en9 r11, defpackage.ha9 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof defpackage.om9
            if (r0 == 0) goto L_0x0016
            r0 = r13
            om9 r0 = (defpackage.om9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x001b
        L_0x0016:
            om9 r0 = new om9
            r0.<init>(r11, r13)
        L_0x001b:
            java.lang.Object r13 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r7) goto L_0x004d
            if (r2 == r6) goto L_0x0032
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ee
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003f:
            l20 r11 = r0.c
            ha9 r12 = r0.b
            en9 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r11
            r7 = r12
            r6 = r2
            goto L_0x00ca
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0119
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r13)
            g20 r13 = defpackage.g20.c
            l20 r13 = r12.a(r13)
            gaf r2 = r11.w
            if (r13 == 0) goto L_0x0105
            kotlin.Lazy r8 = r11.V0
            java.lang.Object r8 = r8.getValue()
            rh3 r8 = (defpackage.rh3) r8
            boolean r8 = r8.e()
            if (r8 != 0) goto L_0x006f
            goto L_0x0105
        L_0x006f:
            boolean r7 = r13.d()
            x10 r8 = r13.b
            if (r7 == 0) goto L_0x0091
            if (r8 == 0) goto L_0x008f
            java.lang.String r7 = r8.a
            boolean r8 = defpackage.cvg.A(r7)
            if (r8 != 0) goto L_0x008f
            boolean r8 = defpackage.cvg.A(r7)
            if (r8 == 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            java.lang.String r8 = "&fn=legacy_44"
            java.lang.String r7 = defpackage.tr1.j(r7, r8)
            goto L_0x0097
        L_0x008f:
            r7 = r3
            goto L_0x0097
        L_0x0091:
            if (r8 == 0) goto L_0x008f
            java.lang.String r7 = r8.a()
        L_0x0097:
            java.lang.String r8 = r13.r
            if (r8 == 0) goto L_0x00a3
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = r8
        L_0x00a3:
            if (r7 == 0) goto L_0x00f1
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00ac
            goto L_0x00f1
        L_0x00ac:
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            sm9 r6 = new sm9
            r6.<init>(r11, r7, r13, r3)
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.w = r5
            java.lang.Object r2 = defpackage.ev0.I(r2, r6, r0)
            if (r2 != r1) goto L_0x00c6
            goto L_0x011b
        L_0x00c6:
            r6 = r11
            r7 = r12
            r9 = r13
            r13 = r2
        L_0x00ca:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r8 = r13.booleanValue()
            gaf r11 = r6.w
            osa r11 = (defpackage.osa) r11
            gc8 r11 = r11.c()
            rm9 r12 = new rm9
            r10 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.a = r3
            r0.b = r3
            r0.c = r3
            r0.w = r4
            java.lang.Object r11 = defpackage.ev0.I(r11, r12, r0)
            if (r11 != r1) goto L_0x00ee
            goto L_0x011b
        L_0x00ee:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x011b
        L_0x00f1:
            osa r2 = (defpackage.osa) r2
            gc8 r13 = r2.c()
            qm9 r2 = new qm9
            r2.<init>(r11, r12, r3)
            r0.w = r6
            java.lang.Object r11 = defpackage.ev0.I(r13, r2, r0)
            if (r11 != r1) goto L_0x00ee
            goto L_0x011b
        L_0x0105:
            osa r2 = (defpackage.osa) r2
            gc8 r13 = r2.c()
            pm9 r2 = new pm9
            r2.<init>(r11, r12, r3)
            r0.w = r7
            java.lang.Object r11 = defpackage.ev0.I(r13, r2, r0)
            if (r11 != r1) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x011b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.l(en9, ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: a32} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m(defpackage.en9 r26, defpackage.ha9 r27, kotlin.coroutines.Continuation r28) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r26.getClass()
            boolean r3 = r2 instanceof defpackage.um9
            if (r3 == 0) goto L_0x001d
            r3 = r2
            um9 r3 = (defpackage.um9) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.x = r4
        L_0x001b:
            r11 = r3
            goto L_0x0023
        L_0x001d:
            um9 r3 = new um9
            r3.<init>(r0, r2)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r2 = r11.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r11.x
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0050
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            a32 r0 = r11.o
            l20 r1 = r11.c
            ha9 r3 = r11.b
            en9 r4 = r11.a
            kotlin.ResultKt.throwOnFailure(r2)
            r12 = r0
            r2 = r1
            r1 = r3
            r0 = r4
            goto L_0x0094
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00e1
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r2)
            g20 r2 = defpackage.g20.o
            l20 r2 = r1.a(r2)
            etc r4 = r0.k1
            ome r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            r12 = r4
            a32 r12 = (defpackage.a32) r12
            if (r2 == 0) goto L_0x00ca
            if (r12 == 0) goto L_0x00ca
            kotlin.Lazy r4 = r0.V0
            java.lang.Object r4 = r4.getValue()
            rh3 r4 = (defpackage.rh3) r4
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x0077
            goto L_0x00ca
        L_0x0077:
            swf r4 = r26.u()
            d20 r10 = defpackage.d20.v
            r11.a = r0
            r11.b = r1
            r11.c = r2
            r11.o = r12
            r11.x = r5
            java.lang.String r9 = r2.q
            long r5 = r12.a
            long r7 = r1.b
            java.lang.Object r4 = r4.a(r5, r7, r9, r10, r11)
            if (r4 != r3) goto L_0x0094
            goto L_0x00e3
        L_0x0094:
            kotlin.Lazy r3 = r0.B0
            java.lang.Object r3 = r3.getValue()
            rl r3 = (defpackage.rl) r3
            k20 r4 = r2.d
            long r5 = r4.a
            m72 r7 = r12.b
            long r7 = r7.a
            long r9 = r1.c
            r13 = r3
            jna r13 = (defpackage.jna) r13
            long r11 = r1.b
            java.lang.String r1 = r4.l
            r14 = 1
            java.lang.String r3 = r2.q
            r24 = 1
            r15 = r5
            r17 = r7
            r19 = r9
            r21 = r11
            r23 = r3
            r25 = r1
            r13.W(r14, r15, r17, r19, r21, r23, r24, r25)
            java.util.concurrent.ConcurrentHashMap r0 = r0.u1
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.String r1 = r2.q
            r0.putIfAbsent(r1, r3)
            goto L_0x00e3
        L_0x00ca:
            gaf r2 = r0.w
            osa r2 = (defpackage.osa) r2
            gc8 r2 = r2.c()
            vm9 r4 = new vm9
            r5 = 0
            r4.<init>(r0, r1, r5)
            r11.x = r6
            java.lang.Object r0 = defpackage.ev0.I(r2, r4, r11)
            if (r0 != r3) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L_0x00e3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.m(en9, ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Unit A(long j, boolean z2) {
        boolean z3 = ((wj9) this.l1.getValue()).g(j) >= 0;
        String str = this.z0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "loadIfNeedAndScrollToMessageByTime: is message with time=" + j + " loaded=" + z3, (Throwable) null);
        }
        if (z3) {
            cid cid = this.s1;
            cid.getClass();
            cid.a.setValue(new zhd(j, true, true, true, z2));
        } else {
            ((gx) this.o).r(j);
            cid cid2 = this.s1;
            cid2.getClass();
            cid2.a.setValue(new zhd(j, false, true, true, z2));
        }
        return Unit.INSTANCE;
    }

    public final boolean C(o00 o00, long j, String str) {
        if (v().e()) {
            v().f(j);
            return true;
        } else if (o00 instanceof dl3) {
            return false;
        } else {
            if (((o00 instanceof o43) && str == null) || (o00 instanceof l50)) {
                return false;
            }
            f14 f14 = f14.b;
            ol9 ol9 = new ol9(o00, this, j, str, (Continuation) null);
            aje u = ev0.u(this.a, this.A0, f14, ol9);
            this.g1.setValue(this, A1[3], u);
            return true;
        }
    }

    public final boolean D(MessageModel messageModel) {
        this.e1.setValue(this, A1[1], ev0.u(this.a, this.A0, f14.b, new ql9(this, messageModel, (Continuation) null)));
        return messageModel.b != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0349, code lost:
        r7 = r13.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(int r14, java.util.List r15) {
        /*
            r13 = this;
            int r0 = defpackage.cwa.y
            s85 r1 = r13.q1
            if (r14 != r0) goto L_0x001d
            java.lang.Object r13 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L_0x001c
            long r13 = r13.longValue()
            m8e r15 = new m8e
            r15.<init>(r13)
            defpackage.xag.h(r1, r15)
            goto L_0x03b7
        L_0x001c:
            return
        L_0x001d:
            int r0 = defpackage.cwa.v
            r2 = 0
            etc r3 = r13.m1
            r4 = 1
            s85 r5 = r13.t1
            if (r14 != r0) goto L_0x006b
            int r13 = r15.size()
            if (r13 != r4) goto L_0x005d
            java.lang.Object r13 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L_0x005c
            long r13 = r13.longValue()
            ome r0 = r3.a
            java.lang.Object r0 = r0.getValue()
            wj9 r0 = (defpackage.wj9) r0
            one.me.messages.list.loader.MessageModel r13 = r0.d(r13)
            if (r13 != 0) goto L_0x0048
            return
        L_0x0048:
            fk9 r14 = defpackage.fk9.b
            xz r13 = r13.X
            o00 r13 = r13.d
            boolean r13 = r13 instanceof defpackage.bl5
            r14.getClass()
            pa4 r13 = defpackage.fk9.n1(r15, r13)
            defpackage.xag.h(r5, r13)
            goto L_0x03b7
        L_0x005c:
            return
        L_0x005d:
            fk9 r13 = defpackage.fk9.b
            r13.getClass()
            pa4 r13 = defpackage.fk9.n1(r15, r2)
            defpackage.xag.h(r5, r13)
            goto L_0x03b7
        L_0x006b:
            int r0 = defpackage.cwa.q
            r6 = 2
            r7 = 0
            gaf r8 = r13.w
            if (r14 != r0) goto L_0x0083
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            yl9 r0 = new yl9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x0083:
            int r0 = defpackage.cwa.z
            if (r14 != r0) goto L_0x0097
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            am9 r0 = new am9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x0097:
            int r0 = defpackage.cwa.w
            jx3 r9 = r13.a
            if (r14 != r0) goto L_0x00b9
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            f14 r0 = defpackage.f14.b
            cm9 r1 = new cm9
            r1.<init>(r13, r15, r7)
            aje r14 = defpackage.ev0.u(r9, r14, r0, r1)
            kotlin.reflect.KProperty[] r15 = A1
            r15 = r15[r2]
            wie r0 = r13.d1
            r0.setValue(r13, r15, r14)
            goto L_0x03b7
        L_0x00b9:
            int r0 = defpackage.cwa.s
            if (r14 != r0) goto L_0x00cd
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            dm9 r0 = new dm9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x00cd:
            int r0 = defpackage.cwa.m
            if (r14 != r0) goto L_0x00e1
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            em9 r0 = new em9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x00e1:
            int r0 = defpackage.cwa.n
            if (r14 != r0) goto L_0x00f5
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            fm9 r0 = new fm9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x00f5:
            int r0 = defpackage.cwa.k
            if (r14 != r0) goto L_0x010d
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x010c
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.SPAM
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x010c:
            return
        L_0x010d:
            int r0 = defpackage.cwa.j
            if (r14 != r0) goto L_0x0125
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0124
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.PORNO
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x0124:
            return
        L_0x0125:
            int r0 = defpackage.cwa.g
            if (r14 != r0) goto L_0x013d
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x013c
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.EXTREMISM
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x013c:
            return
        L_0x013d:
            int r0 = defpackage.cwa.h
            if (r14 != r0) goto L_0x0155
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0154
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.FAKE
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x0154:
            return
        L_0x0155:
            int r0 = defpackage.cwa.l
            if (r14 != r0) goto L_0x016d
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x016c
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.THREAT
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x016c:
            return
        L_0x016d:
            int r0 = defpackage.cwa.i
            if (r14 != r0) goto L_0x0185
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0184
            long r14 = r14.longValue()
            z93 r0 = defpackage.z93.OTHER
            r13.n(r14, r0)
            goto L_0x03b7
        L_0x0184:
            return
        L_0x0185:
            int r0 = defpackage.cwa.x
            if (r14 != r0) goto L_0x0221
            etc r13 = r13.k1
            ome r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            a32 r13 = (defpackage.a32) r13
            if (r13 != 0) goto L_0x0196
            return
        L_0x0196:
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0220
            a89 r13 = r13.v
            if (r13 == 0) goto L_0x01e1
            pg3 r13 = defpackage.d89.a
            h8e r13 = new h8e
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            int r15 = defpackage.ewa.J
            igf r0 = new igf
            r0.<init>(r15)
            pg3 r15 = new pg3
            int r2 = defpackage.cwa.o
            int r3 = defpackage.ewa.H
            igf r4 = new igf
            r4.<init>(r3)
            og3 r3 = defpackage.og3.c
            r15.<init>(r2, r4, r3)
            pg3 r2 = new pg3
            int r4 = defpackage.cwa.p
            int r5 = defpackage.ewa.I
            igf r6 = new igf
            r6.<init>(r5)
            r2.<init>(r4, r6, r3)
            pg3 r3 = defpackage.d89.a
            pg3[] r15 = new defpackage.pg3[]{r15, r2, r3}
            java.util.List r15 = kotlin.collections.CollectionsKt.listOf(r15)
            r13.<init>(r14, r0, r7, r15)
            defpackage.xag.h(r1, r13)
            goto L_0x03b7
        L_0x01e1:
            pg3 r13 = defpackage.d89.a
            h8e r13 = new h8e
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            int r15 = defpackage.ewa.G
            igf r0 = new igf
            r0.<init>(r15)
            pg3 r15 = new pg3
            int r2 = defpackage.cwa.o
            int r3 = defpackage.ewa.H
            igf r4 = new igf
            r4.<init>(r3)
            og3 r3 = defpackage.og3.c
            r15.<init>(r2, r4, r3)
            pg3 r2 = new pg3
            int r4 = defpackage.cwa.p
            int r5 = defpackage.ewa.I
            igf r6 = new igf
            r6.<init>(r5)
            r2.<init>(r4, r6, r3)
            pg3 r3 = defpackage.d89.a
            pg3[] r15 = new defpackage.pg3[]{r15, r2, r3}
            java.util.List r15 = kotlin.collections.CollectionsKt.listOf(r15)
            r13.<init>(r14, r0, r7, r15)
            defpackage.xag.h(r1, r13)
            goto L_0x03b7
        L_0x0220:
            return
        L_0x0221:
            int r0 = defpackage.cwa.o
            if (r14 != r0) goto L_0x0235
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            gm9 r0 = new gm9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x0235:
            int r0 = defpackage.cwa.p
            if (r14 != r0) goto L_0x0249
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            hm9 r0 = new hm9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x0249:
            int r0 = defpackage.cwa.C
            if (r14 != r0) goto L_0x025d
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            im9 r0 = new im9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x025d:
            int r0 = defpackage.cwa.B
            if (r14 != r0) goto L_0x0277
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0276
            long r14 = r14.longValue()
            cx9 r13 = r13.v()
            r13.f(r14)
            goto L_0x03b7
        L_0x0276:
            return
        L_0x0277:
            int r0 = defpackage.cwa.u
            if (r14 != r0) goto L_0x0292
            java.lang.Object r13 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L_0x0291
            long r13 = r13.longValue()
            j8e r15 = new j8e
            r15.<init>(r13)
            defpackage.xag.h(r1, r15)
            goto L_0x03b7
        L_0x0291:
            return
        L_0x0292:
            int r0 = defpackage.cwa.c
            if (r14 != r0) goto L_0x02a6
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            ul9 r0 = new ul9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x02a6:
            int r0 = defpackage.cwa.b
            if (r14 != r0) goto L_0x02ba
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            wl9 r15 = new wl9
            r15.<init>(r13, r7)
            defpackage.xag.g(r13, r14, r7, r15, r6)
            goto L_0x03b7
        L_0x02ba:
            int r0 = defpackage.cwa.a
            if (r14 != r0) goto L_0x02ce
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            xl9 r0 = new xl9
            r0.<init>(r13, r15, r7)
            defpackage.xag.g(r13, r14, r7, r0, r6)
            goto L_0x03b7
        L_0x02ce:
            int r0 = defpackage.cwa.A
            java.util.HashSet r1 = r13.v1
            if (r14 != r0) goto L_0x02fb
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x02fa
            long r2 = r14.longValue()
            boolean r15 = r1.contains(r14)
            if (r15 == 0) goto L_0x02e7
            return
        L_0x02e7:
            r1.add(r14)
            osa r8 = (defpackage.osa) r8
            q04 r14 = r8.b()
            bl9 r15 = new bl9
            r15.<init>(r13, r2, r7)
            defpackage.xag.g(r13, r14, r7, r15, r6)
            goto L_0x03b7
        L_0x02fa:
            return
        L_0x02fb:
            int r0 = defpackage.cwa.r
            if (r14 != r0) goto L_0x033d
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x033c
            long r2 = r14.longValue()
            boolean r15 = r1.contains(r14)
            if (r15 == 0) goto L_0x0312
            return
        L_0x0312:
            r1.add(r14)
            ay2 r14 = r13.v0
            r14.getClass()
            e04 r15 = new e04
            r15.<init>(r14, r2, r7)
            sbd r0 = new sbd
            r0.<init>(r15)
            java.lang.Object r14 = r14.x
            q04 r14 = (defpackage.q04) r14
            bs5 r14 = defpackage.bs0.F(r0, r14)
            zk9 r15 = new zk9
            r15.<init>(r13, r2, r7)
            ps5 r13 = new ps5
            r0 = 5
            r13.<init>(r14, r15, r0)
            defpackage.bs0.K(r13, r9)
            goto L_0x03b7
        L_0x033c:
            return
        L_0x033d:
            int r13 = defpackage.chc.messages_list_context_action_share_externally
            if (r14 != r13) goto L_0x03b7
            java.lang.Object r13 = kotlin.collections.CollectionsKt.firstOrNull(r15)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L_0x03b7
            long r7 = r13.longValue()
            ome r13 = r3.a
            java.lang.Object r13 = r13.getValue()
            wj9 r13 = (defpackage.wj9) r13
            one.me.messages.list.loader.MessageModel r13 = r13.d(r7)
            if (r13 != 0) goto L_0x035c
            return
        L_0x035c:
            xz r13 = r13.X
            o00 r13 = r13.d
            if (r13 != 0) goto L_0x0363
            return
        L_0x0363:
            boolean r14 = r13 instanceof defpackage.bl5
            if (r14 == 0) goto L_0x039c
            bl5 r13 = (defpackage.bl5) r13
            fk9 r14 = defpackage.fk9.b
            al5 r15 = r13.j
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x038a
            if (r15 == r4) goto L_0x0387
            if (r15 == r6) goto L_0x0384
            r0 = 3
            if (r15 != r0) goto L_0x037e
            sr4 r15 = defpackage.sr4.y
        L_0x037c:
            r12 = r15
            goto L_0x038d
        L_0x037e:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0384:
            sr4 r15 = defpackage.sr4.w
            goto L_0x037c
        L_0x0387:
            sr4 r15 = defpackage.sr4.b
            goto L_0x037c
        L_0x038a:
            sr4 r15 = defpackage.sr4.o
            goto L_0x037c
        L_0x038d:
            r14.getClass()
            long r9 = r13.a
            java.lang.String r11 = r13.c
            pa4 r13 = defpackage.fk9.p1(r7, r9, r11, r12)
            defpackage.xag.h(r5, r13)
            goto L_0x03b7
        L_0x039c:
            boolean r14 = r13 instanceof defpackage.ede
            if (r14 == 0) goto L_0x03b7
            ede r13 = (defpackage.ede) r13
            fk9 r14 = defpackage.fk9.b
            b3g r15 = r13.c
            long r9 = r15.a
            sr4 r12 = defpackage.sr4.b
            r14.getClass()
            java.lang.String r11 = r13.b
            pa4 r13 = defpackage.fk9.p1(r7, r9, r11, r12)
            defpackage.xag.h(r5, r13)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.E(int, java.util.List):void");
    }

    public final void F(long j, boolean z2, boolean z3, boolean z4) {
        this.v1.remove(Long.valueOf(j));
        if (z2) {
            int i = z3 ? ewa.o0 : z4 ? ewa.m0 : ewa.n0;
            e0b w2 = w();
            w2.f(new o0b(cad.n));
            w2.h(new igf(i));
            w2.j();
            return;
        }
        e0b w3 = w();
        w3.f(new o0b(cad.K));
        w3.h(new igf(ewa.p0));
        w3.j();
    }

    public final void G(aje aje) {
        this.i1.setValue(this, A1[5], aje);
    }

    public final void H(aje aje) {
        this.f1.setValue(this, A1[2], aje);
    }

    public final void i() {
        ((gx) this.o).h();
        this.x.a();
        this.u1.clear();
        this.v1.clear();
        j00 j00 = this.y0;
        wie wie = j00.d;
        KProperty[] kPropertyArr = j00.f;
        pm7 pm7 = (pm7) wie.getValue(j00, kPropertyArr[0]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        j00.d.setValue(j00, kPropertyArr[0], (Object) null);
        j00.e.setValue((Object) null);
    }

    public final void n(long j, z93 z93) {
        xag.g(this, ((osa) this.w).b(), (f14) null, new yk9(this, z93, j, (Continuation) null), 2);
    }

    public final ne9 o() {
        a32 a32 = (a32) this.k1.a.getValue();
        if (a32 == null) {
            return null;
        }
        boolean K = a32.K();
        m72 m72 = a32.b;
        if (K) {
            return new je9(m72.a);
        }
        if (a32.J()) {
            vk3 m = a32.m();
            if (m != null) {
                return new le9(m.r());
            }
            return null;
        } else if (!a32.N()) {
            return new ke9(m72.a);
        } else {
            vk3 m2 = a32.m();
            if (m2 != null) {
                return new me9(m2.r());
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(long r6, java.lang.String r8, long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof defpackage.dl9
            if (r0 == 0) goto L_0x0013
            r0 = r12
            dl9 r0 = (defpackage.dl9) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            dl9 r0 = new dl9
            r0.<init>(r5, r12)
        L_0x0018:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.String r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0094
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Lazy r12 = r5.C0
            java.lang.Object r12 = r12.getValue()
            bud r12 = (defpackage.bud) r12
            akd r12 = (defpackage.akd) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f86newmediaviewerenabled
            r4 = 0
            boolean r12 = r12.m(r2, r4)
            if (r12 == 0) goto L_0x007d
            fk9 r5 = defpackage.fk9.b
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = ":attach/viewer?chat_id="
            r5.<init>(r12)
            r5.append(r6)
            java.lang.String r6 = "&attach_id="
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = "&msg_id="
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = "&single="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            pa4 r6 = new pa4
            r6.<init>(r5)
            goto L_0x00b1
        L_0x007d:
            kotlin.Lazy r5 = r5.O0
            java.lang.Object r5 = r5.getValue()
            c48 r5 = (defpackage.c48) r5
            mka r5 = r5.a(r9, r3)
            r0.a = r8
            r0.o = r3
            java.lang.Object r12 = defpackage.bs0.f(r5, r0)
            if (r12 != r1) goto L_0x0094
            return r1
        L_0x0094:
            a89 r12 = (defpackage.a89) r12
            vi9 r5 = defpackage.vi9.a
            q4 r5 = r5.getAccessor()
            java.lang.Class<dt7> r6 = defpackage.dt7.class
            java.lang.Object r5 = r5.g(r6)
            dt7 r5 = (defpackage.dt7) r5
            r5.getClass()
            hd9 r5 = new hd9
            r5.<init>((defpackage.a89) r12)
            i4b r6 = new i4b
            r6.<init>(r5, r8)
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.q(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.el9
            if (r0 == 0) goto L_0x0013
            r0 = r7
            el9 r0 = (defpackage.el9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            el9 r0 = new el9
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Lazy r4 = r4.E0
            java.lang.Object r4 = r4.getValue()
            j89 r4 = (defpackage.j89) r4
            r0.c = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r7)
            wg7 r5 = new wg7
            r6 = 25
            r5.<init>(r6)
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.filterNot(r4, r5)
            hq7 r5 = new hq7
            r5.<init>()
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.map(r4, r5)
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en9.r(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final to9 t() {
        return (to9) this.F0.getValue();
    }

    public final swf u() {
        return (swf) this.Q0.getValue();
    }

    public final cx9 v() {
        return (cx9) this.w1.getValue();
    }

    public final e0b w() {
        return (e0b) this.H0.getValue();
    }

    public final void x(String str) {
        aje v2 = ev0.v(this.a, (CoroutineContext) null, f14.b, new jl9(str, this, (Continuation) null), 1);
        this.h1.setValue(this, A1[4], v2);
    }

    public final void y(String str) {
        String a;
        if (str != null && (a = ((fz7) ((cm) this.T0.getValue())).a(str)) != null) {
            x(a);
        }
    }

    public final void z(long j) {
        ev0.v(this.a, (CoroutineContext) null, (f14) null, new ll9(this, j, (Continuation) null), 3);
    }
}
