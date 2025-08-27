package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: xo9  reason: default package */
public final class xo9 {
    public final RecyclerView a;
    public final go9 b;
    public final cid c;
    public final xj9 d;
    public final rk9 e;
    public final String f = xo9.class.getName();

    public xo9(EndlessRecyclerView2 endlessRecyclerView2, go9 go9, cid cid, xj9 xj9, rk9 rk9) {
        this.a = endlessRecyclerView2;
        this.b = go9;
        this.c = cid;
        this.d = xj9;
        this.e = rk9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = r3.N(r0.W0());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.a
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.y7e.v(r0)
            if (r0 == 0) goto L_0x002d
            int r1 = r0.S0()
            xj9 r3 = r3.d
            one.me.messages.list.loader.MessageModel r1 = r3.N(r1)
            r2 = 0
            if (r1 == 0) goto L_0x002c
            int r0 = r0.W0()
            one.me.messages.list.loader.MessageModel r3 = r3.N(r0)
            if (r3 == 0) goto L_0x002c
            long r0 = r1.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            long r0 = r3.c
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            return r2
        L_0x002d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Only linear layout is supported"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo9.a(long):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r16 = this;
            r0 = r16
            cid r1 = r0.c
            tz9 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            zhd r1 = (defpackage.zhd) r1
            if (r1 == 0) goto L_0x0011
            long r4 = r1.a
            goto L_0x0013
        L_0x0011:
            r4 = 0
        L_0x0013:
            cid r1 = r0.c
            boolean r6 = r1.b
            tz9 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            zhd r1 = (defpackage.zhd) r1
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x0029
            boolean r1 = r1.e
            if (r1 != r8) goto L_0x0029
            r1 = r8
            goto L_0x002a
        L_0x0029:
            r1 = r7
        L_0x002a:
            cid r9 = r0.c
            tz9 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            zhd r9 = (defpackage.zhd) r9
            if (r9 == 0) goto L_0x0041
            boolean r9 = r9.c
            if (r9 != r8) goto L_0x0041
            xj9 r9 = r0.d
            int r9 = r9.g(r4)
            goto L_0x0047
        L_0x0041:
            xj9 r9 = r0.d
            int r9 = r9.L(r4)
        L_0x0047:
            r10 = 0
            if (r1 == 0) goto L_0x009d
            xj9 r11 = r0.d
            int r12 = r9 + 1
            one.me.messages.list.loader.MessageModel r11 = r11.N(r12)
            if (r11 == 0) goto L_0x009d
            long r13 = r11.c
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x009d
            xj9 r9 = r0.d
            int r9 = r9.j()
            kotlin.ranges.IntRange r9 = kotlin.ranges.RangesKt.until((int) r12, (int) r9)
            java.util.Iterator r9 = r9.iterator()
            r11 = r7
            r12 = r10
        L_0x006a:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x008c
            java.lang.Object r13 = r9.next()
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            xj9 r15 = r0.d
            one.me.messages.list.loader.MessageModel r14 = r15.N(r14)
            if (r14 == 0) goto L_0x006a
            long r14 = r14.c
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x006a
            r11 = r8
            r12 = r13
            goto L_0x006a
        L_0x008c:
            if (r11 == 0) goto L_0x0095
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r12.intValue()
            goto L_0x009d
        L_0x0095:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r9 >= 0) goto L_0x00da
            java.lang.String r1 = r0.f
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00a6
            goto L_0x00d9
        L_0x00a6:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00d9
            w78 r3 = defpackage.w78.w
            cid r0 = r0.c
            tz9 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            zhd r0 = (defpackage.zhd) r0
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.c
            if (r0 != r8) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r8 = r7
        L_0x00c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Scroll: Got non-existing pos="
            r0.<init>(r4)
            r0.append(r9)
            java.lang.String r4 = " wasExact="
            r0.append(r4)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2.d(r3, r1, r0, r10)
        L_0x00d9:
            return r7
        L_0x00da:
            cid r11 = r0.c
            tz9 r12 = r11.a
            java.lang.Object r13 = r12.getValue()
            zhd r13 = (defpackage.zhd) r13
            if (r13 == 0) goto L_0x00ec
            r11.b = r7
            r12.setValue(r10)
            goto L_0x00ed
        L_0x00ec:
            r13 = r10
        L_0x00ed:
            java.lang.String r7 = r0.f
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x00f4
            goto L_0x0123
        L_0x00f4:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x0123
            w78 r12 = defpackage.w78.o
            androidx.recyclerview.widget.RecyclerView r14 = r0.a
            pzc r14 = r14.M(r9)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "Scroll: vh for pos #"
            r15.<init>(r2)
            r15.append(r9)
            java.lang.String r2 = "="
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = ", event="
            r15.append(r2)
            r15.append(r13)
            java.lang.String r2 = r15.toString()
            r11.d(r12, r7, r2, r10)
        L_0x0123:
            if (r13 != 0) goto L_0x012d
            java.lang.String r0 = r0.f
            java.lang.String r1 = "Scroll: No events for scrolling, skip event"
            defpackage.z68.p(r0, r1)
            return r8
        L_0x012d:
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            androidx.recyclerview.widget.LinearLayoutManager r2 = defpackage.y7e.v(r2)
            boolean r3 = r2 instanceof one.me.messages.list.ui.recycler.MessagesLayoutManager
            if (r3 == 0) goto L_0x013a
            one.me.messages.list.ui.recycler.MessagesLayoutManager r2 = (one.me.messages.list.ui.recycler.MessagesLayoutManager) r2
            goto L_0x013b
        L_0x013a:
            r2 = r10
        L_0x013b:
            if (r2 == 0) goto L_0x013f
            r2.F = r1
        L_0x013f:
            if (r6 == 0) goto L_0x01a4
            go9 r1 = r0.b
            long r2 = r1.c
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01a4
            java.util.List r2 = r1.d
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r8
            if (r2 != 0) goto L_0x015a
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x01a4
        L_0x015a:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            boolean r2 = r1.isLaidOut()
            if (r2 == 0) goto L_0x019a
            boolean r2 = r1.isLayoutRequested()
            if (r2 != 0) goto L_0x019a
            java.lang.String r1 = r0.f
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x016f
            goto L_0x0184
        L_0x016f:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0184
            w78 r3 = defpackage.w78.o
            go9 r6 = r0.b
            long r6 = r6.c
            java.lang.String r11 = "Scroll: Highlighted from args message with id="
            java.lang.String r6 = defpackage.wj6.i(r6, r11)
            r2.d(r3, r1, r6, r10)
        L_0x0184:
            rk9 r1 = r0.e
            go9 r2 = r0.b
            long r2 = r2.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            go9 r3 = r0.b
            java.util.List r3 = r3.d
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r1.j(r2)
            goto L_0x01a4
        L_0x019a:
            dr0 r2 = new dr0
            r3 = 8
            r2.<init>(r3, r0)
            r1.addOnLayoutChangeListener(r2)
        L_0x01a4:
            boolean r1 = r0.a(r4)
            if (r1 == 0) goto L_0x01bf
            java.lang.String r0 = r0.f
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x01b1
            goto L_0x01be
        L_0x01b1:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01be
            w78 r2 = defpackage.w78.o
            java.lang.String r3 = "Scroll: vh is already visible on screen, skip event"
            r1.d(r2, r0, r3, r10)
        L_0x01be:
            return r8
        L_0x01bf:
            boolean r1 = r13.d
            if (r1 == 0) goto L_0x01c9
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.D0(r9)
            goto L_0x01ce
        L_0x01c9:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.z0(r9)
        L_0x01ce:
            java.lang.String r1 = r0.f
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x01d5
            goto L_0x01f4
        L_0x01d5:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01f4
            w78 r3 = defpackage.w78.o
            xj9 r0 = r0.d
            one.me.messages.list.loader.MessageModel r0 = r0.N(r9)
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = r0.n()
            goto L_0x01eb
        L_0x01ea:
            r0 = r10
        L_0x01eb:
            java.lang.String r4 = "Scroll: Scrolled to message="
            java.lang.String r0 = defpackage.a81.m(r4, r0)
            r2.d(r3, r1, r0, r10)
        L_0x01f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo9.b():boolean");
    }
}
