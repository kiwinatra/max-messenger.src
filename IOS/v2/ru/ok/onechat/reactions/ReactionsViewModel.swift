package ru.ok.onechat.reactions;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/onechat/reactions/ReactionsViewModel;", "Lyag;", "Ldb2;", "event", "", "onEvent", "(Ldb2;)V", "La9a;", "onNewReactionEvent", "(La9a;)V", "Lkv9;", "onMessageDeleteEvent", "(Lkv9;)V", "osc", "reactions_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReactionsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactionsViewModel.kt\nru/ok/onechat/reactions/ReactionsViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Log.kt\nru/ok/tamtam/logger/Log\n+ 7 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SpanExt.kt\none/me/sdk/uikit/common/span/SpanExtKt\n+ 10 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,613:1\n49#2:614\n51#2:618\n46#3:615\n51#3:617\n105#4:616\n1#5:619\n32#6,4:620\n77#7:624\n77#7:625\n295#8,2:626\n1557#8:636\n1628#8,2:637\n1630#8:640\n8#9,8:628\n24#10:639\n*S KotlinDebug\n*F\n+ 1 ReactionsViewModel.kt\nru/ok/onechat/reactions/ReactionsViewModel\n*L\n207#1:614\n207#1:618\n207#1:615\n207#1:617\n207#1:616\n239#1:620,4\n348#1:624\n373#1:625\n494#1:626,2\n143#1:636\n143#1:637,2\n143#1:640\n564#1:628,8\n147#1:639\n*E\n"})
public final class ReactionsViewModel extends yag {
    public final dtc A;
    public final xme B;
    public final long c;
    public final qx2 d;
    public final bud e;
    public final sv0 f;
    public final zqc g;
    public final hdd h = null;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final isc q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final q3d w;
    public final HashSet x;
    public final Lazy y;
    public final n6e z;

    public ReactionsViewModel(long j2, qx2 qx2, bud bud, sv0 sv0, zqc zqc, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11) {
        bud bud2 = bud;
        sv0 sv02 = sv0;
        Lazy lazy12 = lazy10;
        this.c = j2;
        this.d = qx2;
        this.e = bud2;
        this.f = sv02;
        this.g = zqc;
        this.i = lazy5;
        this.j = lazy6;
        this.k = lazy7;
        this.l = lazy9;
        this.m = lazy2;
        this.n = lazy;
        this.o = lazy12;
        this.p = lazy11;
        this.q = isc.CONTEXT_MENU;
        this.r = LazyKt.lazy(new jsc(this, 0));
        this.s = LazyKt.lazy(new ksc(lazy8, this));
        this.t = LazyKt.lazy(new ksc(this, lazy12));
        this.u = LazyKt.lazy(new jsc(this, 1));
        new HashMap();
        this.v = LazyKt.lazy(new jsc(this, 2));
        this.w = new q3d(new mxb(16));
        this.x = new HashSet();
        this.y = LazyKt.lazy(new sz0((Object) this, lazy3, lazy4, 9));
        n6e b = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        this.z = b;
        this.A = new dtc(b);
        xme a = f6e.a((Object) null);
        this.B = a;
        ev0.v(b0h.C(this), ((ce4) lazy2.getValue()).a, (f14) null, new msc(this, (Continuation) null), 2);
        sv02.d(this);
        on2 on2 = new on2(a, 28);
        Duration.Companion companion = Duration.Companion;
        bs0.K(bs0.F(new ps5(new ql8(vme.a(on2, DurationKt.toDuration(300, DurationUnit.MILLISECONDS)), 29), new nsc(this, (Continuation) null), 5), ((ce4) lazy2.getValue()).a), b0h.C(this));
        ((akd) bud2).n.add(new csc(1, new WeakReference(this)));
        f6e.a(Boolean.FALSE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r11v1, types: [hj7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [hj7, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0281, code lost:
        if (r0.a(r8, r3) != r2) goto L_0x0285;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(ru.ok.onechat.reactions.ReactionsViewModel r26, defpackage.osc r27, kotlin.coroutines.Continuation r28) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r26.getClass()
            boolean r3 = r2 instanceof defpackage.ssc
            if (r3 == 0) goto L_0x001c
            r3 = r2
            ssc r3 = (defpackage.ssc) r3
            int r4 = r3.y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.y = r4
            goto L_0x0021
        L_0x001c:
            ssc r3 = new ssc
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.w
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.y
            java.lang.String r14 = "is_dialog="
            java.lang.String r13 = "param1"
            java.lang.String r11 = "value"
            java.lang.String r12 = "ACTION"
            r9 = 4
            r5 = 3
            r6 = 2
            r16 = 0
            r10 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0098
            if (r4 == r10) goto L_0x007d
            if (r4 == r6) goto L_0x006b
            if (r4 == r5) goto L_0x004f
            if (r4 != r9) goto L_0x0047
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0285
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            hqc r0 = r3.o
            xd9 r1 = r3.c
            java.lang.Object r4 = r3.b
            osc r4 = (defpackage.osc) r4
            ru.ok.onechat.reactions.ReactionsViewModel r5 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r6 = r4
            r7 = r5
            r18 = r10
            r17 = r13
            r22 = r14
            r2 = r15
            r4 = r0
            r5 = r1
            r1 = r11
            r0 = r12
            goto L_0x01dc
        L_0x006b:
            java.lang.Object r0 = r3.b
            qqc r0 = (defpackage.qqc) r0
            ru.ok.onechat.reactions.ReactionsViewModel r1 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r0
            r4 = r1
            r1 = r11
            r0 = r12
            r23 = r13
            r2 = r14
            goto L_0x0128
        L_0x007d:
            qqc r0 = r3.v
            hqc r1 = r3.o
            xd9 r4 = r3.c
            java.lang.Object r8 = r3.b
            osc r8 = (defpackage.osc) r8
            ru.ok.onechat.reactions.ReactionsViewModel r9 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r17 = r11
            r11 = r1
            r1 = r8
            r25 = r2
            r2 = r0
            r0 = r9
            r9 = r4
        L_0x0095:
            r4 = r25
            goto L_0x00db
        L_0x0098:
            kotlin.ResultKt.throwOnFailure(r2)
            xd9 r2 = r1.d
            if (r2 == 0) goto L_0x00a2
            qqc r4 = r2.c
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r3.a = r0
            r3.b = r1
            r3.c = r2
            hqc r8 = r1.a
            r3.o = r8
            r3.v = r4
            r3.y = r10
            qx2 r9 = r0.d
            my2 r9 = (defpackage.my2) r9
            r17 = r11
            long r10 = r0.c
            etc r9 = r9.o(r10)
            ome r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            a32 r9 = (defpackage.a32) r9
            if (r9 == 0) goto L_0x00d0
            m72 r9 = r9.b
            long r9 = r9.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            goto L_0x00d1
        L_0x00d0:
            r9 = r7
        L_0x00d1:
            if (r9 != r15) goto L_0x00d5
            goto L_0x028a
        L_0x00d5:
            r11 = r8
            r25 = r9
            r9 = r2
            r2 = r4
            goto L_0x0095
        L_0x00db:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0288
            long r19 = r4.longValue()
            if (r9 == 0) goto L_0x0182
            if (r2 == 0) goto L_0x0182
            hqc r4 = r2.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r11)
            if (r4 == 0) goto L_0x0182
            kotlin.Lazy r4 = r0.i
            java.lang.Object r4 = r4.getValue()
            dw1 r4 = (defpackage.dw1) r4
            long r8 = r1.b
            r3.a = r0
            r3.b = r2
            r3.c = r7
            r3.o = r7
            r3.v = r7
            r3.y = r6
            long r5 = r0.c
            long r10 = r1.c
            r7 = r8
            r21 = r10
            r9 = r19
            r1 = r17
            r17 = r0
            r0 = r12
            r11 = r21
            r23 = r13
            r13 = r2
            r26 = r2
            r2 = r14
            r14 = r3
            java.lang.Object r3 = r4.a(r5, r7, r9, r11, r13, r14)
            if (r3 != r15) goto L_0x0124
            goto L_0x028a
        L_0x0124:
            r3 = r26
            r4 = r17
        L_0x0128:
            kotlin.Lazy r5 = r4.k
            java.lang.Object r5 = r5.getValue()
            hcf r5 = (defpackage.hcf) r5
            hqc r3 = r3.b
            java.lang.CharSequence r3 = r3.a
            java.lang.String r3 = r3.toString()
            a32 r6 = r4.m()
            if (r6 == 0) goto L_0x0142
            boolean r16 = r6.N()
        L_0x0142:
            r6 = r16
            r5.getClass()
            hj7 r7 = new hj7
            r7.<init>()
            r7.v = r0
            gsc[] r0 = defpackage.gsc.a
            java.lang.String r0 = "reaction_canceled"
            r7.w = r0
            isc r0 = r4.q
            java.lang.String r0 = r0.a
            r7.b(r0, r1)
            r14 = r23
            r7.b(r3, r14)
            hsc[] r0 = defpackage.hsc.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.b(r0, r14)
            n78 r0 = r7.d()
            kotlin.Lazy r1 = r5.a
            java.lang.Object r1 = r1.getValue()
            nd r1 = (defpackage.nd) r1
            r1.j(r0)
            goto L_0x0285
        L_0x0182:
            r2 = r14
            r14 = r13
            r13 = r17
            r17 = r0
            r0 = r12
            r12 = r17
            kotlin.Lazy r4 = r12.j
            java.lang.Object r4 = r4.getValue()
            xrd r4 = (defpackage.xrd) r4
            long r5 = r1.b
            vd9 r17 = defpackage.vd9.EMOJI
            r3.a = r12
            r3.b = r1
            r3.c = r9
            r3.o = r11
            r3.v = r7
            r8 = 3
            r3.y = r8
            long r7 = r12.c
            r21 = r11
            r22 = r12
            long r11 = r1.c
            r23 = r5
            r5 = r7
            r10 = 0
            r7 = r23
            r23 = r1
            r24 = r9
            r1 = r10
            r18 = 1
            r9 = r19
            r19 = r21
            r20 = r22
            r1 = r13
            r13 = r19
            r22 = r2
            r2 = r14
            r14 = r17
            r17 = r2
            r2 = r15
            r15 = r3
            java.lang.Object r4 = r4.a(r5, r7, r9, r11, r13, r14, r15)
            if (r4 != r2) goto L_0x01d4
        L_0x01d1:
            r15 = r2
            goto L_0x028a
        L_0x01d4:
            r4 = r19
            r7 = r20
            r6 = r23
            r5 = r24
        L_0x01dc:
            kotlin.Lazy r8 = r7.k
            java.lang.Object r8 = r8.getValue()
            hcf r8 = (defpackage.hcf) r8
            java.lang.CharSequence r9 = r4.a
            java.lang.String r9 = r9.toString()
            a32 r10 = r7.m()
            if (r10 == 0) goto L_0x01f5
            boolean r10 = r10.N()
            goto L_0x01f7
        L_0x01f5:
            r10 = r16
        L_0x01f7:
            if (r5 == 0) goto L_0x01fc
            qqc r5 = r5.c
            goto L_0x01fd
        L_0x01fc:
            r5 = 0
        L_0x01fd:
            if (r5 == 0) goto L_0x0202
            r5 = r18
            goto L_0x0204
        L_0x0202:
            r5 = r16
        L_0x0204:
            r8.getClass()
            hj7 r11 = new hj7
            r11.<init>()
            r11.v = r0
            gsc[] r0 = defpackage.gsc.a
            java.lang.String r0 = "reaction_sent"
            r11.w = r0
            isc r0 = r7.q
            java.lang.String r0 = r0.a
            r11.b(r0, r1)
            r0 = r17
            r11.b(r9, r0)
            hsc[] r1 = defpackage.hsc.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r9 = r22
            r1.<init>(r9)
            r1.append(r10)
            java.lang.String r9 = ";is_changed="
            r1.append(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r11.b(r1, r0)
            n78 r0 = r11.d()
            kotlin.Lazy r1 = r8.a
            java.lang.Object r1 = r1.getValue()
            nd r1 = (defpackage.nd) r1
            r1.j(r0)
            kotlin.Lazy r0 = r7.p
            java.lang.Object r0 = r0.getValue()
            gk r0 = (defpackage.gk) r0
            java.lang.CharSequence r1 = r4.a
            java.lang.String r1 = r1.toString()
            hi r0 = r0.g(r1)
            if (r0 == 0) goto L_0x0285
            java.lang.String r14 = r0.d
            if (r14 == 0) goto L_0x0285
            n6e r0 = r7.z
            hqc r9 = r6.a
            lrc r1 = new lrc
            long r10 = r6.b
            r12 = 0
            r15 = 0
            r8 = r1
            r8.<init>(r9, r10, r12, r14, r15)
            r4 = 0
            r3.a = r4
            r3.b = r4
            r3.c = r4
            r3.o = r4
            r4 = 4
            r3.y = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r2) goto L_0x0285
            goto L_0x01d1
        L_0x0285:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            goto L_0x028a
        L_0x0288:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x028a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.j(ru.ok.onechat.reactions.ReactionsViewModel, osc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable l(defpackage.hqc r4) {
        /*
            java.lang.CharSequence r4 = r4.a
            int r0 = r4.length()
            r1 = 0
            boolean r2 = r4 instanceof android.text.Spanned     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000e
            android.text.Spanned r4 = (android.text.Spanned) r4     // Catch:{ all -> 0x0019 }
            goto L_0x000f
        L_0x000e:
            r4 = r1
        L_0x000f:
            if (r4 == 0) goto L_0x0019
            java.lang.Class<dge> r2 = defpackage.dge.class
            r3 = 0
            java.lang.Object[] r4 = r4.getSpans(r3, r0, r2)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r4 = r1
        L_0x001a:
            dge[] r4 = (defpackage.dge[]) r4
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = kotlin.collections.ArraysKt.firstOrNull((T[]) r4)
            dge r4 = (defpackage.dge) r4
            if (r4 == 0) goto L_0x002a
            android.graphics.drawable.Drawable r1 = r4.a()
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.l(hqc):android.graphics.drawable.Drawable");
    }

    public final void i() {
        z68.c("ru.ok.onechat.reactions.ReactionsViewModel", "onCleared", new Object[0]);
        try {
            Result.Companion companion = Result.Companion;
            this.f.f(this);
            Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        k();
    }

    public final void k() {
        z68.c("ru.ok.onechat.reactions.ReactionsViewModel", "cancelChatSubscribeNotifObserving", new Object[0]);
        ev0.v(b0h.C(this), caa.a.plus(((ce4) this.m.getValue()).a), (f14) null, new psc(this, (Continuation) null), 2);
    }

    public final a32 m() {
        return (a32) ((my2) this.d).o(this.c).a.getValue();
    }

    public final List n(xd9 xd9, boolean z2) {
        qqc qqc;
        Object obj;
        xd9 xd92 = xd9;
        List createListBuilder = CollectionsKt.createListBuilder();
        Lazy lazy = this.v;
        int i2 = 0;
        if (xd92 != null) {
            List list = xd92.a;
            if (list.size() >= 8) {
                int size = list.size();
                int i3 = 0;
                while (i2 < size) {
                    wd9 wd9 = (wd9) list.get(i2);
                    Iterator it = ((List) lazy.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual((Object) ((xqc) obj).b, (Object) wd9.a.b)) {
                            break;
                        }
                    }
                    xqc xqc = (xqc) obj;
                    qqc qqc2 = xd92.c;
                    if (xqc == null) {
                        hqc hqc = wd9.a.b;
                        createListBuilder.add(new xqc(((long) i3) - Long.MIN_VALUE, hqc, l(hqc), Intrinsics.areEqual((Object) hqc, (Object) qqc2 != null ? qqc2.b : null)));
                        i3++;
                    } else {
                        if (Intrinsics.areEqual((Object) xqc.b, (Object) qqc2 != null ? qqc2.b : null)) {
                            hqc hqc2 = qqc2 != null ? qqc2.b : null;
                            hqc hqc3 = xqc.b;
                            createListBuilder.add(new xqc(xqc.a, hqc3, xqc.c, Intrinsics.areEqual((Object) hqc3, (Object) hqc2)));
                        } else {
                            createListBuilder.add(xqc);
                        }
                    }
                    i2++;
                }
                return CollectionsKt.build(createListBuilder);
            }
        }
        int size2 = ((List) lazy.getValue()).size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            xqc xqc2 = (xqc) ((List) lazy.getValue()).get(i2);
            if (i2 == 7 && ((List) lazy.getValue()).size() > 8 && z2) {
                createListBuilder.add(wqc.a);
                break;
            }
            if (Intrinsics.areEqual((Object) xqc2.b, (Object) (xd92 == null || (qqc = xd92.c) == null) ? null : qqc.b)) {
                qqc qqc3 = xd92.c;
                hqc hqc4 = qqc3 != null ? qqc3.b : null;
                hqc hqc5 = xqc2.b;
                createListBuilder.add(new xqc(xqc2.a, hqc5, xqc2.c, Intrinsics.areEqual((Object) hqc5, (Object) hqc4)));
            } else {
                createListBuilder.add(xqc2);
            }
            i2++;
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final boolean o() {
        a32 m2;
        if (((Boolean) this.u.getValue()).booleanValue() && (m2 = m()) != null) {
            return (m2.E() || m2.S()) && !m2.H() && !m2.R();
        }
        return false;
    }

    @oye
    public final void onEvent(db2 db2) {
        Long l2;
        long j2 = this.c;
        z68.c("ru.ok.onechat.reactions.ReactionsViewModel", "onEvent: ChatLastReactionUpdatedEvent: chat.id = %d, event.lastReactedMessageId = %d", Long.valueOf(j2), db2.c);
        if (j2 == db2.b && (l2 = db2.c) != null) {
            long longValue = l2.longValue();
            hdd hdd = this.h;
            if (hdd != null) {
                hdd.c(Long.valueOf(longValue), "lastReactedMessageId");
            }
        }
    }

    @oye
    public final void onMessageDeleteEvent(kv9 kv9) {
        if (kv9.b == this.c) {
            this.x.addAll(kv9.v);
        }
    }

    @oye
    public final void onNewReactionEvent(a9a a9a) {
        hi g2;
        String str;
        if (this.c == a9a.b) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                a67.d(w78, "ru.ok.onechat.reactions.ReactionsViewModel", "onNewReactionEvent=" + a9a, (Throwable) null);
            }
            hqc hqc = (hqc) CollectionsKt.firstOrNull(a9a.w);
            if (hqc != null && (g2 = ((gk) this.p.getValue()).g(hqc.a.toString())) != null && (str = g2.d) != null) {
                this.z.d(new lrc(hqc, a9a.o, a9a.v, str, !a9a.c));
            }
        }
    }

    public final void p(osc osc) {
        if (((Boolean) this.u.getValue()).booleanValue() && o()) {
            hqc hqc = osc.a;
            if (StringsKt.isBlank(hqc)) {
                z68.p("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: reaction is blank!");
            } else if (!this.x.contains(Long.valueOf(osc.c))) {
                z68.c("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: %s for %d", hqc, Long.valueOf(osc.b));
                o85 o85 = new o85(osc);
                xme xme = this.B;
                xme.getClass();
                xme.m((Object) null, o85);
            }
        }
    }
}
