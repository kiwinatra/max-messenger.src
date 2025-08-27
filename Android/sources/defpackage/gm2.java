package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.chatscreen.ChatScreen;

/* renamed from: gm2  reason: default package */
public final /* synthetic */ class gm2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ gm2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARNING: type inference failed for: r1v35, types: [t5a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            java.lang.Class<x23> r2 = defpackage.x23.class
            java.lang.Class<gaf> r3 = defpackage.gaf.class
            java.lang.Class<to9> r4 = defpackage.to9.class
            r5 = 1
            r6 = 0
            one.me.chatscreen.ChatScreen r7 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x02e8;
                case 1: goto L_0x02d7;
                case 2: goto L_0x02c0;
                case 3: goto L_0x02b0;
                case 4: goto L_0x0228;
                case 5: goto L_0x0221;
                case 6: goto L_0x0212;
                case 7: goto L_0x0207;
                case 8: goto L_0x0200;
                case 9: goto L_0x01be;
                case 10: goto L_0x0184;
                case 11: goto L_0x016c;
                case 12: goto L_0x00cf;
                case 13: goto L_0x00aa;
                case 14: goto L_0x0049;
                default: goto L_0x0012;
            }
        L_0x0012:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            kotlin.Lazy r0 = defpackage.tn2.a
            un2 r0 = defpackage.un2.a
            q4 r1 = r0.getAccessor()
            kotlin.Lazy r9 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<h48> r2 = defpackage.h48.class
            kotlin.Lazy r10 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            kotlin.Lazy r11 = r1.h(r3)
            q4 r0 = r0.getAccessor()
            java.lang.Class<bud> r1 = defpackage.bud.class
            kotlin.Lazy r12 = r0.h(r1)
            il8 r0 = new il8
            gm2 r13 = new gm2
            r1 = 7
            r13.<init>(r7, r1)
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            return r0
        L_0x0049:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            lp2 r0 = r7.B0()
            etc r14 = r0.Q0
            kotlin.Lazy r0 = defpackage.tn2.a
            un2 r0 = defpackage.un2.a
            q4 r1 = r0.getAccessor()
            kotlin.Lazy r6 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            kotlin.Lazy r7 = r1.h(r3)
            q4 r1 = r0.getAccessor()
            kotlin.Lazy r9 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<eu3> r2 = defpackage.eu3.class
            kotlin.Lazy r8 = r1.h(r2)
            r52 r1 = new r52
            r2 = 25
            r1.<init>(r2)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r10 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r2, r1)
            q4 r1 = r0.getAccessor()
            java.lang.Class<yva> r3 = defpackage.yva.class
            kotlin.Lazy r11 = r1.h(r3)
            r52 r1 = new r52
            r3 = 26
            r1.<init>(r3)
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r2, r1)
            q4 r0 = r0.getAccessor()
            java.lang.Class<d6b> r1 = defpackage.d6b.class
            kotlin.Lazy r13 = r0.h(r1)
            mh9 r0 = new mh9
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00aa:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r7.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r1 = r0[r5]
            is r1 = r7.z
            java.lang.Object r1 = r1.a(r7)
            q72 r1 = (defpackage.q72) r1
            r0 = r0[r6]
            is r0 = r7.y
            java.lang.Object r0 = r0.a(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            lp2 r0 = new lp2
            r0.<init>(r2, r1)
            return r0
        L_0x00cf:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            jgd r0 = r7.p0()
            jgd r2 = defpackage.jgd.CHAT
            if (r0 == r2) goto L_0x010e
            e9d r0 = r7.getRouter()
            java.util.ArrayList r0 = r0.e()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            i9d r0 = (defpackage.i9d) r0
            if (r0 == 0) goto L_0x00ec
            zx3 r0 = r0.a
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            if (r0 == 0) goto L_0x00fa
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r2 != 0) goto L_0x00fa
            boolean r2 = r0 instanceof defpackage.t5a
            if (r2 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r0 = r1
        L_0x00fb:
            boolean r2 = r0 instanceof defpackage.t5a
            if (r2 == 0) goto L_0x0102
            r1 = r0
            t5a r1 = (defpackage.t5a) r1
        L_0x0102:
            if (r1 == 0) goto L_0x010b
            one.me.chats.tab.ChatsTabWidget r1 = (one.me.chats.tab.ChatsTabWidget) r1
            h8b r0 = r1.h0()
            goto L_0x016b
        L_0x010b:
            h8b r0 = defpackage.h8b.e
            goto L_0x016b
        L_0x010e:
            lp2 r0 = r7.B0()
            etc r0 = r0.Q0
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 != 0) goto L_0x0121
            h8b r0 = defpackage.h8b.e
            goto L_0x016b
        L_0x0121:
            boolean r2 = r0.J()
            r3 = 3
            if (r2 == 0) goto L_0x013f
            h8b r2 = new h8b
            zfe r4 = defpackage.zfe.DIALOG_BOT_ID
            vk3 r0 = r0.m()
            if (r0 == 0) goto L_0x013a
            long r0 = r0.r()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x013a:
            r2.<init>(r4, r1, r3)
        L_0x013d:
            r0 = r2
            goto L_0x016b
        L_0x013f:
            boolean r2 = r0.N()
            if (r2 == 0) goto L_0x015b
            h8b r2 = new h8b
            zfe r4 = defpackage.zfe.DIALOG_USER_ID
            vk3 r0 = r0.m()
            if (r0 == 0) goto L_0x0157
            long r0 = r0.r()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0157:
            r2.<init>(r4, r1, r3)
            goto L_0x013d
        L_0x015b:
            h8b r1 = new h8b
            zfe r2 = defpackage.zfe.CHAT_ID
            m72 r0 = r0.b
            long r4 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.<init>(r2, r0, r3)
            r0 = r1
        L_0x016b:
            return r0
        L_0x016c:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            lf1 r0 = new lf1
            gm2 r1 = new gm2
            r2 = 8
            r1.<init>(r7, r2)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            eng r2 = new eng
            r2.<init>(r7, r6)
            r0.<init>(r1, r2)
            return r0
        L_0x0184:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            h3b r0 = r7.z0()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0193
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x01bd
        L_0x0193:
            lp2 r0 = r7.B0()
            etc r2 = r0.Q0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            a32 r2 = (defpackage.a32) r2
            if (r2 != 0) goto L_0x01a4
            goto L_0x01bb
        L_0x01a4:
            gaf r3 = r0.l()
            osa r3 = (defpackage.osa) r3
            gc8 r3 = r3.c()
            gc8 r3 = r3.t0()
            no2 r4 = new no2
            r4.<init>(r2, r0, r1)
            r2 = 2
            defpackage.xag.g(r0, r3, r1, r4, r2)
        L_0x01bb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01bd:
            return r0
        L_0x01be:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r7.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r1 = r0[r5]
            is r1 = r7.z
            java.lang.Object r1 = r1.a(r7)
            q72 r1 = (defpackage.q72) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x01e0
            if (r1 != r5) goto L_0x01da
            ta2 r1 = defpackage.ta2.b
            goto L_0x01e2
        L_0x01da:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01e0:
            ta2 r1 = defpackage.ta2.a
        L_0x01e2:
            lp2 r2 = r7.B0()
            etc r2 = r2.Q0
            r0 = r0[r6]
            is r0 = r7.y
            java.lang.Object r0 = r0.a(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            alb r0 = new alb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0200:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            e9d r0 = r7.getRouter()
            return r0
        L_0x0207:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            mh9 r0 = r7.q0()
            java.lang.Long r0 = r0.k()
            return r0
        L_0x0212:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            mh9 r0 = r7.q0()
            defpackage.mh9.n(r0, r6, r5, r5)
            r7.m0()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0221:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r7.r0()
            return r0
        L_0x0228:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r7.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            r1 = r0[r5]
            is r1 = r7.z
            java.lang.Object r1 = r1.a(r7)
            r12 = r1
            q72 r12 = (defpackage.q72) r12
            r0 = r0[r6]
            is r0 = r7.y
            java.lang.Object r0 = r0.a(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            tkd r9 = new tkd
            kotlin.Lazy r0 = defpackage.rjd.a
            r9.<init>()
            fu4 r0 = new fu4
            rk2 r14 = new rk2
            lp2 r1 = r7.B0()
            etc r1 = r1.Q0
            on2 r3 = new on2
            r4 = 28
            r3.<init>(r1, r4)
            on2 r1 = new on2
            r1.<init>(r3, r6)
            sjd r3 = defpackage.sjd.a
            rl r3 = r3.d()
            r14.<init>(r1, r3)
            kotlin.Lazy r1 = defpackage.tn2.a
            un2 r1 = defpackage.un2.a
            q4 r3 = r1.getAccessor()
            java.lang.Class<fa9> r4 = defpackage.fa9.class
            kotlin.Lazy r15 = r3.h(r4)
            q4 r3 = r1.getAccessor()
            java.lang.Class<r62> r4 = defpackage.r62.class
            kotlin.Lazy r16 = r3.h(r4)
            q4 r3 = r1.getAccessor()
            kotlin.Lazy r17 = r3.h(r2)
            gaf r18 = r1.getDispatchers()
            q4 r1 = r1.getAccessor()
            java.lang.Class<m95> r2 = defpackage.m95.class
            java.lang.Object r1 = r1.g(r2)
            m95 r1 = (defpackage.m95) r1
            n95 r2 = new n95
            r2.<init>(r1)
            r13 = r0
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            wkd r1 = new wkd
            r8 = r1
            r8.<init>(r9, r10, r12, r13)
            return r1
        L_0x02b0:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            rk9 r0 = r7.s0()
            hk9 r1 = defpackage.hk9.a
            s85 r0 = r0.y
            defpackage.xag.h(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02c0:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            lp2 r0 = r7.B0()
            etc r0 = r0.Q0
            kotlin.Lazy r1 = defpackage.rjd.a
            i69 r1 = new i69
            gm2 r2 = r7.y0
            r1.<init>(r2)
            v0f r3 = new v0f
            r3.<init>(r0, r2, r1)
            return r3
        L_0x02d7:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            js9 r0 = defpackage.fu4.k
            android.content.Context r1 = r7.getContext()
            fu4 r0 = r0.e(r1)
            k2b r0 = r0.f()
            return r0
        L_0x02e8:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            jgd r0 = r7.p0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm2.invoke():java.lang.Object");
    }
}
