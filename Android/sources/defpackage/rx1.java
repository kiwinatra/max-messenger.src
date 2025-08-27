package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rx1  reason: default package */
public final class rx1 extends a79 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int K0 = vjc.abc_cascading_menu_item_layout;
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public h79 G0;
    public ViewTreeObserver H0;
    public PopupWindow.OnDismissListener I0;
    public boolean J0;
    public final ro X = new ro(2, this);
    public final el Y = new el(1, this);
    public final grg Z = new grg(8, this);
    public final Context b;
    public final int c;
    public final int o;
    public final int v;
    public int v0;
    public final boolean w;
    public int w0;
    public final Handler x;
    public View x0;
    public final ArrayList y = new ArrayList();
    public View y0;
    public final ArrayList z = new ArrayList();
    public int z0;

    public rx1(Context context, View view, int i, int i2, boolean z2) {
        int i3 = 0;
        this.v0 = 0;
        this.w0 = 0;
        this.b = context;
        this.x0 = view;
        this.o = i;
        this.v = i2;
        this.w = z2;
        this.E0 = false;
        this.z0 = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(nec.abc_config_prefDialogWidth));
        this.x = new Handler();
    }

    public final boolean a() {
        ArrayList arrayList = this.z;
        return arrayList.size() > 0 && ((qx1) arrayList.get(0)).a.I0.isShowing();
    }

    public final void b() {
        if (!a()) {
            ArrayList arrayList = this.y;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((m69) it.next());
            }
            arrayList.clear();
            View view = this.x0;
            this.y0 = view;
            if (view != null) {
                boolean z2 = this.H0 == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.H0 = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.X);
                }
                this.y0.addOnAttachStateChangeListener(this.Y);
            }
        }
    }

    public final boolean c(lye lye) {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            qx1 qx1 = (qx1) it.next();
            if (lye == qx1.b) {
                qx1.a.c.requestFocus();
                return true;
            }
        }
        if (!lye.hasVisibleItems()) {
            return false;
        }
        k(lye);
        h79 h79 = this.G0;
        if (h79 != null) {
            h79.a0(lye);
        }
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        if (size > 0) {
            qx1[] qx1Arr = (qx1[]) arrayList.toArray(new qx1[size]);
            for (int i = size - 1; i >= 0; i--) {
                qx1 qx1 = qx1Arr[i];
                if (qx1.a.I0.isShowing()) {
                    qx1.a.dismiss();
                }
            }
        }
    }

    public final void f(h79 h79) {
        this.G0 = h79;
    }

    public final void h() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((qx1) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j69) adapter).notifyDataSetChanged();
        }
    }

    public final ax4 i() {
        ArrayList arrayList = this.z;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((qx1) a81.h(1, arrayList)).a.c;
    }

    public final void k(m69 m69) {
        m69.b(this, this.b);
        if (a()) {
            v(m69);
        } else {
            this.y.add(m69);
        }
    }

    public final void m(m69 m69, boolean z2) {
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (m69 == ((qx1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((qx1) arrayList.get(i2)).b.c(false);
            }
            qx1 qx1 = (qx1) arrayList.remove(i);
            qx1.b.r(this);
            boolean z3 = this.J0;
            g79 g79 = qx1.a;
            if (z3) {
                d79.b(g79.I0, (Transition) null);
                g79.I0.setAnimationStyle(0);
            }
            g79.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.z0 = ((qx1) arrayList.get(size2 - 1)).c;
            } else {
                this.z0 = this.x0.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                h79 h79 = this.G0;
                if (h79 != null) {
                    h79.m(m69, true);
                }
                ViewTreeObserver viewTreeObserver = this.H0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.H0.removeGlobalOnLayoutListener(this.X);
                    }
                    this.H0 = null;
                }
                this.y0.removeOnAttachStateChangeListener(this.Y);
                this.I0.onDismiss();
            } else if (z2) {
                ((qx1) arrayList.get(0)).b.c(false);
            }
        }
    }

    public final void n(View view) {
        if (this.x0 != view) {
            this.x0 = view;
            this.w0 = Gravity.getAbsoluteGravity(this.v0, view.getLayoutDirection());
        }
    }

    public final void o(boolean z2) {
        this.E0 = z2;
    }

    public final void onDismiss() {
        qx1 qx1;
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                qx1 = null;
                break;
            }
            qx1 = (qx1) arrayList.get(i);
            if (!qx1.a.I0.isShowing()) {
                break;
            }
            i++;
        }
        if (qx1 != null) {
            qx1.b.c(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            this.w0 = Gravity.getAbsoluteGravity(i, this.x0.getLayoutDirection());
        }
    }

    public final void q(int i) {
        this.A0 = true;
        this.C0 = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.I0 = onDismissListener;
    }

    public final void s(boolean z2) {
        this.F0 = z2;
    }

    public final void t(int i) {
        this.B0 = true;
        this.D0 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [sz7, g79] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011f, code lost:
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0124, code lost:
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if ((r10[0] - r5) < 0) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.m69 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            j69 r4 = new j69
            boolean r5 = r0.w
            int r6 = K0
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r16.a()
            r6 = 1
            if (r5 != 0) goto L_0x0021
            boolean r5 = r0.E0
            if (r5 == 0) goto L_0x0021
            r4.c = r6
            goto L_0x002d
        L_0x0021:
            boolean r5 = r16.a()
            if (r5 == 0) goto L_0x002d
            boolean r5 = defpackage.a79.u(r17)
            r4.c = r5
        L_0x002d:
            int r5 = r0.c
            int r5 = defpackage.a79.l(r4, r2, r5)
            g79 r7 = new g79
            int r8 = r0.o
            int r9 = r0.v
            r10 = 0
            r7.<init>(r2, r10, r8, r9)
            grg r2 = r0.Z
            r7.J0 = r2
            r7.y0 = r0
            mo r2 = r7.I0
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.x0
            r7.x0 = r2
            int r2 = r0.w0
            r7.Z = r2
            r7.H0 = r6
            mo r2 = r7.I0
            r2.setFocusable(r6)
            mo r2 = r7.I0
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.p(r4)
            r7.r(r5)
            int r2 = r0.w0
            r7.Z = r2
            java.util.ArrayList r2 = r0.z
            int r4 = r2.size()
            r9 = 0
            if (r4 <= 0) goto L_0x00e1
            java.lang.Object r4 = defpackage.a81.h(r6, r2)
            qx1 r4 = (defpackage.qx1) r4
            m69 r11 = r4.b
            java.util.ArrayList r12 = r11.w
            int r12 = r12.size()
            r13 = r9
        L_0x007f:
            if (r13 >= r12) goto L_0x0095
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto L_0x0092
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r13 = r13 + 1
            goto L_0x007f
        L_0x0095:
            r14 = r10
        L_0x0096:
            if (r14 != 0) goto L_0x009a
            r6 = r10
            goto L_0x00e3
        L_0x009a:
            g79 r11 = r4.a
            ax4 r11 = r11.c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b3
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            j69 r12 = (defpackage.j69) r12
            goto L_0x00b6
        L_0x00b3:
            j69 r12 = (defpackage.j69) r12
            r13 = r9
        L_0x00b6:
            int r15 = r12.getCount()
            r8 = r9
        L_0x00bb:
            r6 = -1
            if (r8 >= r15) goto L_0x00c9
            u69 r10 = r12.getItem(r8)
            if (r14 != r10) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            int r8 = r8 + 1
            r10 = 0
            goto L_0x00bb
        L_0x00c9:
            r8 = r6
        L_0x00ca:
            if (r8 != r6) goto L_0x00cd
            goto L_0x00e2
        L_0x00cd:
            int r8 = r8 + r13
            int r6 = r11.getFirstVisiblePosition()
            int r8 = r8 - r6
            if (r8 < 0) goto L_0x00e2
            int r6 = r11.getChildCount()
            if (r8 < r6) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            android.view.View r6 = r11.getChildAt(r8)
            goto L_0x00e3
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            if (r6 == 0) goto L_0x015a
            mo r8 = r7.I0
            defpackage.e79.a(r8, r9)
            mo r8 = r7.I0
            r10 = 0
            defpackage.d79.a(r8, r10)
            int r8 = r2.size()
            r10 = 1
            int r8 = r8 - r10
            java.lang.Object r8 = r2.get(r8)
            qx1 r8 = (defpackage.qx1) r8
            g79 r8 = r8.a
            ax4 r8 = r8.c
            r10 = 2
            int[] r10 = new int[r10]
            r8.getLocationOnScreen(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.y0
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.z0
            r13 = 1
            if (r12 != r13) goto L_0x0127
            r10 = r10[r9]
            int r8 = r8.getWidth()
            int r8 = r8 + r10
            int r8 = r8 + r5
            int r10 = r11.right
            if (r8 <= r10) goto L_0x0124
        L_0x0121:
            r10 = r9
            r8 = 1
            goto L_0x012d
        L_0x0124:
            r8 = 1
            r10 = 1
            goto L_0x012d
        L_0x0127:
            r8 = r10[r9]
            int r8 = r8 - r5
            if (r8 >= 0) goto L_0x0121
            goto L_0x0124
        L_0x012d:
            if (r10 != r8) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = r9
        L_0x0132:
            r0.z0 = r10
            r7.x0 = r6
            int r10 = r0.w0
            r11 = 5
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0146
            if (r8 == 0) goto L_0x013f
            goto L_0x014f
        L_0x013f:
            int r5 = r6.getWidth()
            int r5 = 0 - r5
            goto L_0x014f
        L_0x0146:
            if (r8 == 0) goto L_0x014d
            int r5 = r6.getWidth()
            goto L_0x014f
        L_0x014d:
            int r5 = 0 - r5
        L_0x014f:
            r7.w = r5
            r5 = 1
            r7.Y = r5
            r7.X = r5
            r7.k(r9)
            goto L_0x0178
        L_0x015a:
            boolean r5 = r0.A0
            if (r5 == 0) goto L_0x0162
            int r5 = r0.C0
            r7.w = r5
        L_0x0162:
            boolean r5 = r0.B0
            if (r5 == 0) goto L_0x016b
            int r5 = r0.D0
            r7.k(r5)
        L_0x016b:
            android.graphics.Rect r5 = r0.a
            if (r5 == 0) goto L_0x0175
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5)
            goto L_0x0176
        L_0x0175:
            r10 = 0
        L_0x0176:
            r7.G0 = r10
        L_0x0178:
            qx1 r5 = new qx1
            int r6 = r0.z0
            r5.<init>(r7, r1, r6)
            r2.add(r5)
            r7.b()
            ax4 r2 = r7.c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L_0x01b4
            boolean r0 = r0.F0
            if (r0 == 0) goto L_0x01b4
            java.lang.CharSequence r0 = r1.v0
            if (r0 == 0) goto L_0x01b4
            int r0 = defpackage.vjc.abc_popup_menu_header_item_layout
            android.view.View r0 = r3.inflate(r0, r2, r9)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r9)
            java.lang.CharSequence r1 = r1.v0
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r9)
            r7.b()
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx1.v(m69):void");
    }
}
