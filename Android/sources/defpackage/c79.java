package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: c79  reason: default package */
public class c79 {
    public final Context a;
    public final m69 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g = 8388611;
    public boolean h;
    public h79 i;
    public a79 j;
    public PopupWindow.OnDismissListener k;
    public final b79 l = new b79(0, this);

    public c79(int i2, int i3, m69 m69, Context context, View view, boolean z) {
        this.a = context;
        this.b = m69;
        this.f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [a79, i79] */
    /* JADX WARNING: type inference failed for: r8v1, types: [dje] */
    /* JADX WARNING: type inference failed for: r2v4, types: [rx1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.a79 a() {
        /*
            r15 = this;
            a79 r0 = r15.j
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "window"
            android.content.Context r1 = r15.a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            int r2 = defpackage.nec.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003f
            rx1 r0 = new rx1
            android.view.View r4 = r15.f
            int r6 = r15.e
            boolean r7 = r15.c
            android.content.Context r3 = r15.a
            int r5 = r15.d
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0051
        L_0x003f:
            dje r0 = new dje
            android.view.View r13 = r15.f
            int r10 = r15.e
            boolean r14 = r15.c
            android.content.Context r12 = r15.a
            m69 r11 = r15.b
            int r9 = r15.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x0051:
            m69 r1 = r15.b
            r0.k(r1)
            b79 r1 = r15.l
            r0.r(r1)
            android.view.View r1 = r15.f
            r0.n(r1)
            h79 r1 = r15.i
            r0.f(r1)
            boolean r1 = r15.h
            r0.o(r1)
            int r1 = r15.g
            r0.p(r1)
            r15.j = r0
        L_0x0071:
            a79 r15 = r15.j
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c79.a():a79");
    }

    public final boolean b() {
        a79 a79 = this.j;
        return a79 != null && a79.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z, boolean z2) {
        a79 a2 = a();
        a2.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.b();
    }
}
