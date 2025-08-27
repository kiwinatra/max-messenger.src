package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: j05  reason: default package */
public final class j05 implements m05 {
    public final n05 a;
    public cfb b;
    public xe8 c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = false;

    public j05(n05 n05) {
        this.a = n05;
        n05.setListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r5 = (java.lang.Integer) r4.get(r5.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.h05 a() {
        /*
            r11 = this;
            n05 r0 = r11.a
            java.util.List r1 = r0.getLayers()
            java.util.ArrayList r11 = r11.d
            android.graphics.Rect r2 = r0.getBounds()
            boolean r0 = r0.w0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 1
        L_0x001d:
            boolean r6 = r1.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r1.next()
            g05 r6 = (defpackage.g05) r6
            boolean r8 = r6 instanceof defpackage.rv4
            if (r8 == 0) goto L_0x0045
            r7 = r6
            rv4 r7 = (defpackage.rv4) r7
            android.graphics.Paint r8 = r7.c
            int r8 = r8.getColor()
            android.graphics.Paint r9 = r7.c
            float r9 = r9.getStrokeWidth()
            java.util.ArrayList r7 = r7.a
            bs7 r10 = new bs7
            r10.<init>(r5, r8, r9, r7)
            r7 = r10
        L_0x0045:
            if (r7 == 0) goto L_0x001d
            r3.add(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.put(r6, r7)
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0054:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x005d:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r11.next()
            pa r5 = (defpackage.pa) r5
            boolean r6 = r5 instanceof defpackage.pa
            if (r6 == 0) goto L_0x0081
            g05 r5 = r5.a
            java.lang.Object r5 = r4.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0081
            int r5 = r5.intValue()
            h63 r6 = new h63
            r6.<init>((int) r5)
            goto L_0x0082
        L_0x0081:
            r6 = r7
        L_0x0082:
            if (r6 == 0) goto L_0x005d
            r1.add(r6)
            goto L_0x005d
        L_0x0088:
            h05 r11 = new h05
            r11.<init>(r3, r1, r2, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j05.a():h05");
    }

    public final void b() {
        cfb cfb = this.b;
        if (cfb != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = this.h;
            ffb ffb = cfb.e;
            ffb.getClass();
            ffb ffb2 = new ffb(z, !arrayList.isEmpty(), !arrayList.isEmpty(), ffb.o, ffb.v, z2, ffb.x);
            cfb.e = ffb2;
            cfb.a.a(ffb2);
        }
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        n05 n05 = this.a;
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getY();
            List<g05> layers = n05.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                g05 g05 = layers.get(size);
            }
            rv4 rv4 = new rv4(this.f, this.g);
            xe8 xe8 = new xe8(rv4);
            this.c = xe8;
            ((ArrayList) xe8.c).add(new tv4(motionEvent.getX(), motionEvent.getY()));
            n05.a.add(rv4);
            n05.invalidate();
            cfb cfb = this.b;
            if (cfb != null) {
                ((BrushWidthViewImpl) cfb.a.z).setVisibility(8);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xe8 xe82 = this.c;
            if (xe82 != null) {
                xe82.w(motionEvent);
            }
            xe8 xe83 = this.c;
            if (xe83 != null) {
                pa k = xe83.k();
                this.e.clear();
                this.d.add(k);
            }
            this.c = null;
            this.h = true;
            b();
        } else {
            xe8 xe84 = this.c;
            if (xe84 != null) {
                xe84.w(motionEvent);
            }
        }
        n05.invalidate();
    }
}
