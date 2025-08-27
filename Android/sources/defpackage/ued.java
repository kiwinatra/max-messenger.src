package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: ued  reason: default package */
public final /* synthetic */ class ued implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ued(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v14, types: [int] */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01a5;
                case 3: goto L_0x0191;
                case 4: goto L_0x0107;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00a3;
                case 8: goto L_0x005b;
                case 9: goto L_0x0038;
                case 10: goto L_0x002a;
                default: goto L_0x000c;
            }
        L_0x000c:
            j10 r1 = (defpackage.j10) r1
            java.lang.Object r2 = r0.c
            swf r2 = (defpackage.swf) r2
            kotlin.Lazy r2 = r2.c
            java.lang.Object r2 = r2.getValue()
            x23 r2 = (defpackage.x23) r2
            qjd r2 = (defpackage.qjd) r2
            long r2 = r2.m()
            java.lang.Object r0 = r0.b
            d20 r0 = (defpackage.d20) r0
            defpackage.kr7.Q(r1, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x002a:
            zsf r2 = new zsf
            java.lang.Object r3 = r0.b
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r0 = r0.c
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.<init>(r1, r3, r0)
            return r2
        L_0x0038:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.b
            l15 r1 = (defpackage.l15) r1
            java.lang.Object r1 = r1.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0053
            return r3
        L_0x0053:
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            java.lang.String r1 = "An operation is not implemented: Указать тут задачу  с кастомными темами"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            bj2 r1 = (defpackage.bj2) r1
            java.lang.Object r2 = r0.b
            gy8 r2 = (defpackage.gy8) r2
            r2.getClass()
            fo3 r3 = r1.a
            java.lang.String r4 = r3.Z
            java.lang.String r9 = defpackage.hhf.c(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            fo3 r4 = r1.a
            java.util.List r4 = r4.v
            defpackage.gy8.n(r8, r4)
            java.lang.String r11 = r3.b()
            ntb r1 = r1.b
            mtb r12 = defpackage.qe8.l(r1)
            java.lang.Object r1 = r2.v
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            drd r1 = (defpackage.drd) r1
            long r4 = r3.a
            erd r13 = r1.a(r4)
            long r6 = r3.a
            java.lang.Object r0 = r0.c
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r2.b
            r5 = r0
            zqd r5 = (defpackage.zqd) r5
            tze r0 = r5.r(r6, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x00a3:
            vk3 r1 = (defpackage.vk3) r1
            long r5 = r1.r()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r0.b
            java.util.Set r5 = (java.util.Set) r5
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L_0x00c5
            boolean r1 = r1.x()
            if (r1 != 0) goto L_0x00c4
            java.lang.Object r0 = r0.c
            kq9 r0 = (defpackage.kq9) r0
            r0.getClass()
        L_0x00c4:
            r2 = r4
        L_0x00c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x00ca:
            vk3 r1 = (defpackage.vk3) r1
            java.lang.Object r2 = r0.b
            kee r2 = (defpackage.kee) r2
            ij2 r2 = r2.b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00e7
            if (r2 == r4) goto L_0x00db
            goto L_0x00e7
        L_0x00db:
            long r1 = r1.r()
            java.lang.Object r0 = r0.c
            a32 r0 = (defpackage.a32) r0
            boolean r4 = r0.G(r1)
        L_0x00e7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x00ec:
            java.lang.String r1 = (java.lang.String) r1
            ls7 r1 = new ls7
            java.lang.Object r2 = r0.b
            v6e r2 = (defpackage.v6e) r2
            android.content.Context r4 = r2.a
            en5 r5 = new en5
            k63 r6 = defpackage.k63.a
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r5.<init>(r0)
            u6e r0 = r2.c
            r1.<init>(r4, r5, r0, r3)
            return r1
        L_0x0107:
            java.lang.Object r5 = r0.b
            evd r5 = (defpackage.evd) r5
            java.lang.Object r0 = r0.c
            kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref.IntRef) r0
            java.util.List r1 = (java.util.List) r1
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x018e
            rl r6 = r5.a()
            boolean r13 = r5.b
            jna r6 = (defpackage.jna) r6
            r6.getClass()
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x012d
            goto L_0x0168
        L_0x012d:
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.windowed(r7, 100, 100, true)
            int r15 = r14.size()
            long[] r12 = new long[r15]
        L_0x013a:
            if (r2 >= r15) goto L_0x0168
            java.lang.Object r7 = r14.get(r2)
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            jtb r7 = r6.D()
            ltb r7 = (defpackage.ltb) r7
            a33 r7 = r7.a
            long r8 = r7.n()
            d78 r11 = new d78
            r16 = 0
            r7 = r11
            r3 = r11
            r11 = r16
            r16 = r12
            r12 = r13
            r7.<init>(r8, r10, r11, r12)
            long r7 = defpackage.jna.z(r6, r3)
            r16[r2] = r7
            int r2 = r2 + r4
            r12 = r16
            r3 = 0
            goto L_0x013a
        L_0x0168:
            int r2 = r0.element
            int r3 = r1.size()
            int r3 = r3 + r2
            r0.element = r3
            java.lang.String r0 = r5.o
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0178
            goto L_0x018e
        L_0x0178:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x018e
            w78 r3 = defpackage.w78.o
            int r1 = r1.size()
            java.lang.String r4 = "sending events entries count="
            java.lang.String r1 = defpackage.wj6.h(r1, r4)
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x018e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0191:
            yf7 r1 = (defpackage.yf7) r1
            java.lang.Object r2 = r0.c
            dw0 r2 = (defpackage.dw0) r2
            int r3 = r2.a
            int r2 = r2.b
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            defpackage.kr7.L(r1, r0, r3, r2, r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01a5:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.b
            dld r2 = (defpackage.dld) r2
            yva r3 = r2.b
            isb r1 = r3.j(r1)
            java.lang.CharSequence r3 = r1.a
            java.lang.String r3 = r3.toString()
            java.lang.Object r0 = r0.c
            ald r0 = (defpackage.ald) r0
            java.util.List r0 = r0.c
            java.util.List r0 = defpackage.n54.j(r3, r0)
            js9 r3 = defpackage.fu4.k
            android.content.Context r2 = r2.a
            fu4 r2 = r3.e(r2)
            k2b r2 = r2.f()
            android.text.SpannableString r0 = defpackage.n54.p(r2, r1, r0)
            isb r2 = new isb
            java.lang.String[] r1 = r1.b
            r2.<init>(r0, r1)
            return r2
        L_0x01d9:
            ykd r1 = (defpackage.ykd) r1
            java.lang.Object r1 = r0.b
            c73 r1 = (defpackage.c73) r1
            java.lang.Object r1 = r1.w
            dkd r1 = (defpackage.dkd) r1
            one.me.chats.search.ChatsListSearchScreen r1 = (one.me.chats.search.ChatsListSearchScreen) r1
            java.lang.Object r0 = r0.c
            ykd r0 = (defpackage.ykd) r0
            r1.e0(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01ef:
            xed r1 = (defpackage.xed) r1
            boolean r2 = r1 instanceof defpackage.ved
            if (r2 == 0) goto L_0x0203
            java.lang.Object r0 = r0.b
            sk3 r0 = (defpackage.sk3) r0
            if (r0 == 0) goto L_0x020e
            ved r1 = (defpackage.ved) r1
            android.os.Parcelable r1 = r1.a
            r0.accept(r1)
            goto L_0x020e
        L_0x0203:
            boolean r2 = r1 instanceof defpackage.wed
            if (r2 == 0) goto L_0x0211
            java.lang.Object r0 = r0.c
            sk3 r0 = (defpackage.sk3) r0
            r0.accept(r1)
        L_0x020e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0211:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ued.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ ued(Function1 function1, Function1 function12) {
        this.a = 10;
        veg veg = veg.a;
        this.b = function1;
        this.c = function12;
    }
}
