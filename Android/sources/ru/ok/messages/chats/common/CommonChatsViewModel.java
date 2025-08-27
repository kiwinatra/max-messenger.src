package ru.ok.messages.chats.common;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/chats/common/CommonChatsViewModel;", "Lyag;", "o83", "n83", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCommonChatsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonChatsViewModel.kt\nru/ok/messages/chats/common/CommonChatsViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n*L\n1#1,296:1\n49#2:297\n51#2:301\n46#3:298\n51#3:300\n105#4:299\n77#5:302\n*S KotlinDebug\n*F\n+ 1 CommonChatsViewModel.kt\nru/ok/messages/chats/common/CommonChatsViewModel\n*L\n70#1:297\n70#1:301\n70#1:298\n70#1:300\n70#1:299\n262#1:302\n*E\n"})
public final class CommonChatsViewModel extends yag {
    public final long c;
    public final r62 d;
    public final yva e;
    public final rl f;
    public final nd g;
    public final jbf h;
    public final gaf i;
    public final sv0 j;
    public final c48 k;
    public final long[] l;
    public final xme m;
    public final etc n;
    public HashSet o = new HashSet();
    public final xme p;
    public final x04 q;
    public final x04 r;
    public final u83 s;
    public aje t;

    public CommonChatsViewModel(long j2, r62 r62, yva yva, rl rlVar, nd ndVar, jbf jbf, gaf gaf, jd8 jd8, c48 c48) {
        this.c = j2;
        this.d = r62;
        this.e = yva;
        this.f = rlVar;
        this.g = ndVar;
        this.h = jbf;
        this.i = gaf;
        this.j = jd8;
        this.k = c48;
        this.l = new long[]{j2};
        xme a = f6e.a(w73.a);
        this.m = a;
        this.n = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.p = a2;
        this.q = kv0.j(new etc(a2), (CoroutineContext) null, 3);
        this.r = kv0.j(bs0.w(new on2(a, 12)), (CoroutineContext) null, 3);
        u83 u83 = new u83(this);
        this.s = u83;
        ev0.v(b0h.C(this), ((osa) gaf).a(), (f14) null, new m83(this, (Continuation) null), 2);
        jd8.d(u83);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(ru.ok.messages.chats.common.CommonChatsViewModel r5, long r6) {
        /*
            r62 r0 = r5.d
            a32 r0 = r0.G(r6)
            if (r0 != 0) goto L_0x0009
            goto L_0x006a
        L_0x0009:
            m72 r1 = r0.b
            java.util.Map r1 = r1.e
            long r2 = r5.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x001a
            goto L_0x006a
        L_0x001a:
            java.util.HashSet r1 = r5.o
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1.add(r6)
            xme r6 = r5.m
            i83 r7 = r5.l()
            e83 r1 = new e83
            r0.l0()
            java.lang.CharSequence r2 = r0.X
            yva r5 = r5.e
            m72 r3 = r0.b
            int r3 = r3.c()
            android.content.Context r5 = r5.a
            int r4 = defpackage.zjc.tt_chat_subtitle_count
            java.lang.String r5 = defpackage.ghf.s(r4, r3, r5)
            r1.<init>(r0, r2, r5)
            r7.getClass()
            boolean r5 = r7 instanceof defpackage.y73
            r0 = 0
            if (r5 == 0) goto L_0x004f
            r5 = r7
            y73 r5 = (defpackage.y73) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 != 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            java.util.List r7 = r5.a
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.toMutableList(r7)
            r2 = 0
            r7.add(r2, r1)
            r1 = 6
            y73 r7 = defpackage.y73.b(r5, r7, r1)
        L_0x0064:
            r6.getClass()
            r6.m(r0, r7)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.chats.common.CommonChatsViewModel.j(ru.ok.messages.chats.common.CommonChatsViewModel, long):void");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(ru.ok.messages.chats.common.CommonChatsViewModel r9, long r10) {
        /*
            java.util.HashSet r0 = r9.o
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0.remove(r1)
            i83 r0 = r9.l()
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.y73
            r2 = 0
            if (r1 == 0) goto L_0x0019
            r1 = r0
            y73 r1 = (defpackage.y73) r1
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            if (r1 != 0) goto L_0x001d
            goto L_0x0055
        L_0x001d:
            java.util.List r3 = r1.a
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x002b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0045
            java.lang.Object r6 = r4.next()
            r7 = r6
            g83 r7 = (defpackage.g83) r7
            long r7 = r7.getId()
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r5.add(r6)
            goto L_0x002b
        L_0x0045:
            int r10 = r5.size()
            int r11 = r3.size()
            if (r10 != r11) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r10 = 6
            y73 r0 = defpackage.y73.b(r1, r5, r10)
        L_0x0055:
            xme r9 = r9.m
            r9.getClass()
            r9.m(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.chats.common.CommonChatsViewModel.k(ru.ok.messages.chats.common.CommonChatsViewModel, long):void");
    }

    public final void i() {
        this.j.f(this.s);
    }

    public final i83 l() {
        return (i83) this.m.getValue();
    }
}
