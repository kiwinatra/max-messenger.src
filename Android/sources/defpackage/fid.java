package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: fid  reason: default package */
public final class fid implements wcg {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public fid(ox0 ox0, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = ox0;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    public final void a() {
    }

    public final void b() {
        ox0 ox0 = this.a;
        View view = (View) ox0.b;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            kne.K(recyclerView, new tjb(recyclerView, 1));
        }
        ox0.b = null;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.graphics.Rect r6, android.view.View r7) {
        /*
            r5 = this;
            ox0 r0 = r5.a
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            if (r1 != 0) goto L_0x002a
            android.view.View r1 = defpackage.ox0.w(r7)
            if (r1 != 0) goto L_0x0015
            android.view.ViewParent r1 = r7.getParent()
            android.view.View r1 = (android.view.View) r1
        L_0x0015:
            r0.b = r1
            boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r3 == 0) goto L_0x001e
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x002a
            tjb r3 = new tjb
            r4 = 2
            r3.<init>(r1, r4)
            defpackage.kne.K(r1, r3)
        L_0x002a:
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r3 = r5.b
            defpackage.rcg.d(r3, r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r4 = r1 instanceof defpackage.orb
            if (r4 == 0) goto L_0x003e
            r2 = r1
            orb r2 = (defpackage.orb) r2
        L_0x003e:
            if (r2 == 0) goto L_0x004b
            frb r1 = r2.getCallback()
            if (r1 == 0) goto L_0x004b
            int r1 = r1.c()
            goto L_0x004d
        L_0x004b:
            int r1 = r3.top
        L_0x004d:
            java.lang.Object r0 = r0.b
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r2 = r5.c
            if (r0 == 0) goto L_0x0058
            defpackage.rcg.d(r2, r0)
        L_0x0058:
            int r0 = r2.top
            int r3 = r5.e
            int r0 = r0 + r3
            android.graphics.Rect r5 = r5.d
            r5.top = r0
            int r1 = r1 - r3
            r5.bottom = r1
            int r0 = r2.left
            r5.left = r0
            int r0 = r2.right
            r5.right = r0
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x007b
            b59 r7 = defpackage.ox0.v(r7)
            if (r7 == 0) goto L_0x007b
            r7.z(r6, r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fid.c(android.graphics.Rect, android.view.View):void");
    }
}
