package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.PopupMenu;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;

/* renamed from: we8  reason: default package */
public final class we8 {
    public long a;
    public Object b;
    public Object c = ((qra) ym.e()).c();
    public Object d;
    public Object e;
    public Object f;

    public we8(hj2 hj2, a32 a32, ij2 ij2) {
        this.d = hj2;
        this.e = a32;
        this.f = ij2;
    }

    public static ViewPager2 d(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public void a(PopupMenu popupMenu) {
        if (!((a32) this.e).L() || !((a32) this.e).b.e()) {
            popupMenu.getMenu().add(0, lic.menu_chat_member_delete, 0, qad.a1);
        } else {
            popupMenu.getMenu().add(0, lic.menu_chat_member_delete_and_block, 0, qad.b1);
        }
    }

    public qf9 b() {
        return new qf9(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = defpackage.ij2.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(long r3) {
        /*
            r2 = this;
            id3 r0 = defpackage.ym.e()
            long r0 = r0.a()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            ij2 r0 = defpackage.ij2.BLOCKED_MEMBER
            java.lang.Object r1 = r2.f
            ij2 r1 = (defpackage.ij2) r1
            if (r1 != r0) goto L_0x001e
            java.lang.Object r0 = r2.e
            a32 r0 = (defpackage.a32) r0
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x003c
        L_0x001e:
            java.lang.Object r0 = r2.e
            a32 r0 = (defpackage.a32) r0
            boolean r0 = r0.s()
            if (r0 != 0) goto L_0x003c
            java.lang.Object r0 = r2.e
            a32 r0 = (defpackage.a32) r0
            boolean r0 = r0.A()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r2.e
            a32 r2 = (defpackage.a32) r2
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L_0x003e
        L_0x003c:
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we8.c(long):boolean");
    }

    public void e(long j, String str, View view) {
        this.a = j;
        this.b = str;
        Context context = view.getContext();
        Context context2 = view.getContext();
        Lazy lazy = scf.b0;
        PopupMenu popupMenu = new PopupMenu(new kx3(context, j4b.k0(context2).c ? uad.a : uad.b), view);
        ij2 ij2 = ij2.BLOCKED_MEMBER;
        ij2 ij22 = (ij2) this.f;
        if (ij22 != ij2 || !((a32) this.e).A()) {
            boolean s = ((a32) this.e).s();
            ij2 ij23 = ij2.ADMIN;
            if (s) {
                boolean G = ((a32) this.e).G(j);
                if (ij22 == ij23 && G) {
                    popupMenu.getMenu().add(0, lic.menu_chat_member_setup_admin_permissions, 0, qad.q9);
                }
                if (G) {
                    popupMenu.getMenu().add(0, lic.menu_chat_member_make_non_admin, 0, qad.k1);
                } else {
                    popupMenu.getMenu().add(0, lic.menu_chat_member_make_admin, 0, qad.g1);
                }
                if (((a32) this.e).A() && ij22 != ij23) {
                    a(popupMenu);
                }
            } else if (((a32) this.e).A() && ij22 != ij23 && ((a32) this.e).c(j)) {
                a(popupMenu);
            }
        } else {
            popupMenu.getMenu().add(0, lic.menu_chat_member_unblock, 0, qad.l1);
        }
        popupMenu.setOnMenuItemClickListener(new gj2(this));
        popupMenu.show();
    }

    public void f(boolean z) {
        int currentItem;
        a aVar;
        it8 it8 = (it8) this.f;
        if (!it8.v.Q() && ((ViewPager2) this.e).getScrollState() == 0) {
            ya8 ya8 = it8.w;
            if (ya8.k() != 0) {
                List list = it8.v0;
                if (list.size() != 0 && (currentItem = ((ViewPager2) this.e).getCurrentItem()) < list.size()) {
                    long j = (long) currentItem;
                    if ((j != this.a || z) && (aVar = (a) ya8.f(j)) != null && aVar.a2()) {
                        this.a = j;
                        c cVar = it8.v;
                        cVar.getClass();
                        xe0 xe0 = new xe0(cVar);
                        ArrayList arrayList = new ArrayList();
                        a aVar2 = null;
                        for (int i = 0; i < ya8.k(); i++) {
                            long h = ya8.h(i);
                            a aVar3 = (a) ya8.l(i);
                            if (aVar3.a2()) {
                                if (h != this.a) {
                                    xe0.l(aVar3, iu7.o);
                                    xg0 xg0 = it8.X;
                                    xg0.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = xg0.a.iterator();
                                    if (!it.hasNext()) {
                                        arrayList.add(arrayList2);
                                    } else {
                                        rae.w(it.next());
                                        throw null;
                                    }
                                } else {
                                    aVar2 = aVar3;
                                }
                                aVar3.N2(h == this.a);
                            }
                        }
                        if (aVar2 != null) {
                            xe0.l(aVar2, iu7.v);
                            xg0 xg02 = it8.X;
                            xg02.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = xg02.a.iterator();
                            if (!it2.hasNext()) {
                                arrayList.add(arrayList3);
                            } else {
                                rae.w(it2.next());
                                throw null;
                            }
                        }
                        if (!xe0.a.isEmpty()) {
                            xe0.f();
                            Collections.reverse(arrayList);
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                it8.X.getClass();
                                xg0.a((List) it3.next());
                            }
                        }
                    }
                }
            }
        }
    }
}
