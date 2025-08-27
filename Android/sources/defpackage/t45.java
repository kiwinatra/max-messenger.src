package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: t45  reason: default package */
public final class t45 extends vyc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) this.b).H0();
                return;
            case 1:
                ((sb0) this.b).e();
                return;
            case 3:
                ((we8) this.b).f(true);
                return;
            case 4:
                ((av6) this.b).a();
                return;
            case 5:
                lw9 lw9 = (lw9) ((y35) this.b).b;
                lw9.v.clear();
                lw9.x = null;
                lw9.y = -1;
                lw9.m();
                return;
            case 6:
                b6a b6a = (b6a) this.b;
                b6a.e = b6a.c.j();
                sd3 sd3 = b6a.d;
                ((rd3) sd3.e).m();
                sd3.d();
                return;
            case 7:
                ((RecyclerAutofitGridView) this.b).H0();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                recyclerView.q1.g = true;
                recyclerView.m0(true);
                if (!recyclerView.v.A()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 10:
                ((m56) this.b).i();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 1:
                a();
                return;
            case 3:
                a();
                return;
            case 4:
                ((av6) this.b).a();
                return;
            case 5:
                lw9 lw9 = (lw9) ((y35) this.b).b;
                lw9.a.d(lw9.G((tyc) lw9.w.get(this)) + i, i2, (Object) null);
                return;
            case 6:
                b6a b6a = (b6a) this.b;
                sd3 sd3 = b6a.d;
                ((rd3) sd3.e).a.d(sd3.e(b6a) + i, i2, (Object) null);
                return;
            case 9:
                ((Function0) this.b).invoke();
                return;
            case 10:
                ((m56) this.b).i();
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 1:
                a();
                return;
            case 3:
                a();
                return;
            case 4:
                ((av6) this.b).a();
                return;
            case 6:
                b6a b6a = (b6a) this.b;
                sd3 sd3 = b6a.d;
                ((rd3) sd3.e).a.d(sd3.e(b6a) + i, i2, obj);
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                u9 u9Var = recyclerView.v;
                if (i2 < 1) {
                    u9Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) u9Var.o;
                arrayList.add(u9Var.D(obj, 4, i, i2));
                u9Var.b |= 4;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 9:
                ((Function0) this.b).invoke();
                return;
            case 10:
                ((m56) this.b).i();
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        if (r5.r != null) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            int r2 = r5.a
            switch(r2) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x00d2;
                case 2: goto L_0x008c;
                case 3: goto L_0x0088;
                case 4: goto L_0x0080;
                case 5: goto L_0x0067;
                case 6: goto L_0x0041;
                case 7: goto L_0x0007;
                case 8: goto L_0x0018;
                case 9: goto L_0x0010;
                case 10: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r5 = r5.b
            m56 r5 = (defpackage.m56) r5
            r5.i()
            return
        L_0x0010:
            java.lang.Object r5 = r5.b
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r5.invoke()
            return
        L_0x0018:
            java.lang.Object r2 = r5.b
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.n(r1)
            u9 r2 = r2.v
            if (r7 >= r0) goto L_0x0027
            r2.getClass()
            goto L_0x0040
        L_0x0027:
            java.lang.Object r3 = r2.o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            t9 r6 = r2.D(r1, r0, r6, r7)
            r3.add(r6)
            int r6 = r2.b
            r6 = r6 | r0
            r2.b = r6
            int r6 = r3.size()
            if (r6 != r0) goto L_0x0040
            r5.h()
        L_0x0040:
            return
        L_0x0041:
            java.lang.Object r5 = r5.b
            b6a r5 = (defpackage.b6a) r5
            int r0 = r5.e
            int r0 = r0 + r7
            r5.e = r0
            sd3 r0 = r5.d
            int r1 = r0.e(r5)
            java.lang.Object r2 = r0.e
            rd3 r2 = (defpackage.rd3) r2
            int r6 = r6 + r1
            r2.o(r6, r7)
            int r6 = r5.e
            if (r6 <= 0) goto L_0x0066
            tyc r5 = r5.c
            int r5 = r5.c
            r6 = 2
            if (r5 != r6) goto L_0x0066
            r0.d()
        L_0x0066:
            return
        L_0x0067:
            java.lang.Object r0 = r5.b
            y35 r0 = (defpackage.y35) r0
            java.lang.Object r0 = r0.b
            lw9 r0 = (defpackage.lw9) r0
            java.util.HashMap r1 = r0.w
            java.lang.Object r5 = r1.get(r5)
            tyc r5 = (defpackage.tyc) r5
            int r5 = r0.G(r5)
            int r5 = r5 + r6
            r0.o(r5, r7)
            return
        L_0x0080:
            java.lang.Object r5 = r5.b
            av6 r5 = (defpackage.av6) r5
            r5.a()
            return
        L_0x0088:
            r5.a()
            return
        L_0x008c:
            kotlin.reflect.KProperty[] r6 = one.me.chats.search.ChatsListSearchScreen.F0
            java.lang.Object r5 = r5.b
            one.me.chats.search.ChatsListSearchScreen r5 = (one.me.chats.search.ChatsListSearchScreen) r5
            ov2 r6 = r5.d0()
            etc r6 = r6.D0
            ome r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            vu2 r6 = (defpackage.vu2) r6
            java.util.List r6 = r6.d
            int r6 = r6.size()
            if (r6 != r7) goto L_0x00ab
            r5.g0()
        L_0x00ab:
            kotlin.reflect.KProperty[] r6 = one.me.chats.search.ChatsListSearchScreen.F0
            r6 = r6[r0]
            kotlin.properties.ReadOnlyProperty r1 = r5.C0
            java.lang.Object r6 = r1.getValue(r5, r6)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r6 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r6
            if (r7 <= 0) goto L_0x00cd
            ov2 r5 = r5.d0()
            fd8 r5 = r5.o
            ao1 r7 = r5.k
            boolean r7 = defpackage.jbd.d(r7)
            if (r7 != 0) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r5 = r5.r
            if (r5 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            r6.setRefreshingNext(r0)
            return
        L_0x00d2:
            r5.a()
            return
        L_0x00d6:
            java.lang.Class<t45> r6 = defpackage.t45.class
            java.lang.String r7 = r6.getName()
            java.lang.Object r0 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r0 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r0
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00e5
            goto L_0x00fa
        L_0x00e5:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00fa
            w78 r3 = defpackage.w78.o
            boolean r0 = r0.b0()
            java.lang.String r4 = "onItemRangeInserted start. isComputingLayout:"
            java.lang.String r0 = defpackage.i2a.i(r4, r0)
            r2.d(r3, r7, r0, r1)
        L_0x00fa:
            java.lang.Object r7 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r7 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r7
            r7.H0()
            java.lang.String r6 = r6.getName()
            java.lang.Object r5 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r5 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r5
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x010e
            goto L_0x0123
        L_0x010e:
            boolean r0 = r7.c()
            if (r0 == 0) goto L_0x0123
            w78 r0 = defpackage.w78.o
            boolean r5 = r5.b0()
            java.lang.String r2 = "onItemRangeInserted end. isComputingLayout:"
            java.lang.String r5 = defpackage.i2a.i(r2, r5)
            r7.d(r0, r6, r5, r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t45.d(int, int):void");
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 1:
                a();
                return;
            case 3:
                a();
                return;
            case 4:
                ((av6) this.b).a();
                return;
            case 5:
                lw9 lw9 = (lw9) ((y35) this.b).b;
                int G = lw9.G((tyc) lw9.w.get(this));
                uyc uyc = lw9.a;
                uyc.d(i + G, 1, (Object) null);
                uyc.d(i2 + G, 1, (Object) null);
                return;
            case 6:
                b6a b6a = (b6a) this.b;
                sd3 sd3 = b6a.d;
                int e = sd3.e(b6a);
                ((rd3) sd3.e).n(i + e, i2 + e);
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                u9 u9Var = recyclerView.v;
                u9Var.getClass();
                if (i != i2) {
                    ArrayList arrayList = (ArrayList) u9Var.o;
                    arrayList.add(u9Var.D((Object) null, 8, i, i2));
                    u9Var.b |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((Function0) this.b).invoke();
                return;
            case 10:
                ((m56) this.b).i();
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) obj).H0();
                return;
            case 1:
                a();
                return;
            case 2:
                KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                if (((vu2) chatsListSearchScreen.d0().D0.a.getValue()).d.isEmpty()) {
                    ((EndlessRecyclerView2) chatsListSearchScreen.C0.getValue(chatsListSearchScreen, ChatsListSearchScreen.F0[1])).setRefreshingNext(false);
                    return;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                ((av6) obj).a();
                return;
            case 5:
                lw9 lw9 = (lw9) ((y35) obj).b;
                lw9.q(lw9.G((tyc) lw9.w.get(this)) + i, i2);
                return;
            case 6:
                b6a b6a = (b6a) obj;
                b6a.e -= i2;
                sd3 sd3 = b6a.d;
                ((rd3) sd3.e).q(i + sd3.e(b6a), i2);
                if (b6a.e < 1 && b6a.c.c == 2) {
                    sd3.d();
                    return;
                }
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                u9 u9Var = recyclerView.v;
                if (i2 < 1) {
                    u9Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) u9Var.o;
                arrayList.add(u9Var.D((Object) null, 2, i, i2));
                u9Var.b |= 2;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 9:
                ((Function0) obj).invoke();
                return;
            case 10:
                ((m56) obj).i();
                return;
            default:
                return;
        }
    }

    public void g() {
        tyc tyc;
        switch (this.a) {
            case 6:
                ((b6a) this.b).d.d();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.o != null && (tyc = recyclerView.y0) != null) {
                    int y = tr1.y(tyc.c);
                    if (y != 1) {
                        if (y == 2) {
                            return;
                        }
                    } else if (tyc.j() <= 0) {
                        return;
                    }
                    recyclerView.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h() {
        boolean z = RecyclerView.O1;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!z || !recyclerView.F0 || !recyclerView.E0) {
            recyclerView.M0 = true;
            recyclerView.requestLayout();
            return;
        }
        WeakHashMap weakHashMap = gag.a;
        recyclerView.postOnAnimation(recyclerView.z);
    }
}
