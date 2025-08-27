package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hr2  reason: default package */
public final class hr2 implements ng4, gnf, ir2 {
    public final ViewStub a;
    public final View b;
    public jr2 c;
    public final ArrayList o = new ArrayList();
    public final hq v;
    public boolean w;
    public final boolean x = true;

    public hr2(ViewStub viewStub, View view, hq hqVar) {
        this.a = viewStub;
        this.b = view;
        this.v = hqVar;
    }

    public final hnf a(Class cls) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            hnf hnf = (hnf) it.next();
            if (cls.isAssignableFrom(hnf.getClass())) {
                return hnf;
            }
        }
        return null;
    }

    public final void b() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            y64.B(new pr1(13, this));
        } else {
            c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[LOOP:1: B:29:0x0092->B:32:0x00a0, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.x
            if (r1 == 0) goto L_0x002e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = r0.o
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r2.next()
            hnf r3 = (defpackage.hnf) r3
            java.util.List r3 = r3.d()
            if (r3 == 0) goto L_0x0011
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x002a
            goto L_0x0011
        L_0x002a:
            r1.addAll(r3)
            goto L_0x0011
        L_0x002e:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0032:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003d
            jr2 r2 = r0.c
            if (r2 != 0) goto L_0x003d
            return
        L_0x003d:
            v00 r2 = new v00
            r3 = 13
            r2.<init>(r3)
            java.util.Collections.sort(r1, r2)
            jr2 r2 = r0.c
            if (r2 != 0) goto L_0x005a
            android.view.ViewStub r2 = r0.a
            android.view.View r2 = r2.inflate()
            jr2 r2 = (defpackage.jr2) r2
            r0.c = r2
            android.view.View r3 = r0.b
            r2.setAnimationAnchor(r3)
        L_0x005a:
            jr2 r2 = r0.c
            r2.setListenerProvider(r0)
            boolean r2 = r0.w
            r3 = 0
            if (r2 == 0) goto L_0x006f
            hq r2 = r0.v
            boolean r2 = r2.u()
            if (r2 == 0) goto L_0x006f
            r2 = 1
            r9 = r2
            goto L_0x0070
        L_0x006f:
            r9 = r3
        L_0x0070:
            jr2 r0 = r0.c
            ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl r0 = (ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl) r0
            java.util.List r2 = r0.a
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0085
            java.lang.String r0 = "ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl"
            java.lang.String r1 = "setTopPanels: skip, same panels list"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x0211
        L_0x0085:
            r0.a = r1
            yx9 r2 = r0.b
            r2.getClass()
            dnf r2 = defpackage.dnf.w
            java.util.Iterator r4 = r1.iterator()
        L_0x0092:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r5 = r4.next()
            n18 r5 = (defpackage.n18) r5
            dnf r5 = r5.b
            if (r5 != r2) goto L_0x0092
        L_0x00a2:
            java.lang.String r2 = "yx9"
            java.lang.String r4 = "hideMusicPanel()"
            defpackage.z68.c(r2, r4, new java.lang.Object[0])
            kid r2 = r0.c
            r2.getClass()
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00c0
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00c0
            java.util.List r4 = java.util.Collections.emptyList()
            goto L_0x00eb
        L_0x00c0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x00c9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00eb
            java.lang.Object r6 = r5.next()
            r7 = r6
            n18 r7 = (defpackage.n18) r7     // Catch:{ all -> 0x00e4 }
            java.util.Set r8 = defpackage.n18.k     // Catch:{ all -> 0x00e4 }
            dnf r7 = r7.b     // Catch:{ all -> 0x00e4 }
            boolean r7 = r8.contains(r7)     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x00c9
            r4.add(r6)     // Catch:{ all -> 0x00e4 }
            goto L_0x00c9
        L_0x00e4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00eb:
            boolean r5 = r4.isEmpty()
            r16 = 0
            java.lang.Object r6 = r2.a
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r2.b
            mqf r7 = (defpackage.mqf) r7
            if (r5 == 0) goto L_0x0110
            androidx.recyclerview.widget.RecyclerView r2 = r2.x
            if (r2 != 0) goto L_0x0101
            goto L_0x01ed
        L_0x0101:
            android.content.res.Resources r3 = r6.getResources()
            int r4 = defpackage.ydc.chat_top_panel_height
            int r3 = r3.getDimensionPixelOffset(r4)
            r7.U(r3, r2, r9)
            goto L_0x01ed
        L_0x0110:
            androidx.recyclerview.widget.RecyclerView r5 = r2.x
            if (r5 != 0) goto L_0x0175
            android.view.ViewStub r5 = r2.v
            android.view.View r5 = r5.inflate()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r2.x = r5
            defpackage.ct.b(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r13 = r5.widthPixels
            fnf r5 = new fnf
            java.lang.Object r8 = r2.o
            r12 = r8
            ir2 r12 = (defpackage.ir2) r12
            int r14 = r2.w
            java.lang.Object r8 = r2.c
            r15 = r8
            ro4 r15 = (defpackage.ro4) r15
            r10 = r5
            r11 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r2.y = r5
            androidx.recyclerview.widget.RecyclerView r8 = r2.x
            r8.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r2.x
            ym r8 = defpackage.ym.v
            kotlin.Lazy r10 = defpackage.scf.b0
            scf r8 = defpackage.j4b.k0(r8)
            int r8 = r8.O
            r5.setBackgroundColor(r8)
            androidx.recyclerview.widget.RecyclerView r5 = r2.x
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.<init>(r3, r3)
            r5.setLayoutManager(r8)
            androidx.recyclerview.widget.RecyclerView r3 = r2.x
            boolean r5 = defpackage.ct.z(r3)
            inf r8 = new inf
            int r10 = r2.w
            r8.<init>(r10, r5)
            r3.j(r8)
            androidx.recyclerview.widget.RecyclerView r3 = r2.x
            r5 = 8
            r3.setVisibility(r5)
        L_0x0175:
            fnf r3 = r2.y
            java.util.List r5 = r3.y
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0180
            goto L_0x0185
        L_0x0180:
            r3.y = r4
            r3.m()
        L_0x0185:
            androidx.recyclerview.widget.RecyclerView r2 = r2.x
            android.content.res.Resources r3 = r6.getResources()
            int r4 = defpackage.ydc.chat_top_panel_height
            int r3 = r3.getDimensionPixelOffset(r4)
            r7.getClass()
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "mqf"
            java.lang.String r6 = "scheduleShow: view %s animate %b"
            defpackage.z68.c(r5, r6, r4)
            java.lang.Object r4 = r7.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c4
            java.lang.Object r5 = r4.next()
            or2 r5 = (defpackage.or2) r5
            android.view.View r6 = r5.a
            if (r6 != r2) goto L_0x01b3
            goto L_0x01c6
        L_0x01c4:
            r5 = r16
        L_0x01c6:
            java.lang.Object r4 = r7.c
            r10 = r4
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r5 == 0) goto L_0x01d9
            boolean r4 = r5.c
            if (r4 == 0) goto L_0x01d2
            goto L_0x01ed
        L_0x01d2:
            boolean r4 = r5.e
            if (r4 != 0) goto L_0x01d9
            r10.remove(r5)
        L_0x01d9:
            int r4 = r2.getVisibility()
            if (r4 != 0) goto L_0x01e0
            goto L_0x01ed
        L_0x01e0:
            or2 r11 = new or2
            r8 = 1
            r4 = r11
            r5 = r7
            r6 = r2
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r10.add(r11)
        L_0x01ed:
            ua r2 = r0.o
            r2.getClass()
            dnf r2 = defpackage.dnf.c
            java.util.Iterator r1 = r1.iterator()
        L_0x01f8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x020a
            java.lang.Object r3 = r1.next()
            n18 r3 = (defpackage.n18) r3
            dnf r4 = r3.b
            if (r4 != r2) goto L_0x01f8
            r16 = r3
        L_0x020a:
            if (r16 != 0) goto L_0x0212
            mqf r0 = r0.v
            r0.T()
        L_0x0211:
            return
        L_0x0212:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr2.c():void");
    }

    public final void j() {
        b();
    }

    public final void onPause(jv7 jv7) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((hnf) it.next()).b();
        }
        this.w = false;
    }

    public final void onResume(jv7 jv7) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((hnf) it.next()).c();
        }
        b();
        this.w = true;
    }
}
