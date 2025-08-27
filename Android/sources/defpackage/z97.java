package defpackage;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.a;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: z97  reason: default package */
public final class z97 extends a implements Closeable, rdg {
    public final ys9 a;
    public final d b;
    public final cy3 c;

    public z97(ys9 ys9, d dVar, cy3 cy3) {
        this.a = ys9;
        this.b = dVar;
        this.c = cy3;
    }

    public final void a(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        cy3 cy3 = this.c;
        ys9 ys9 = this.a;
        d dVar = this.b;
        if (z) {
            ys9.now();
            dVar.getClass();
            wdg wdg = wdg.b;
            dVar.getClass();
            dVar.getClass();
            if (cy3.a && (copyOnWriteArrayList2 = (CopyOnWriteArrayList) cy3.h) != null && !copyOnWriteArrayList2.isEmpty()) {
                c p1 = dVar.p1();
                Iterator it = ((CopyOnWriteArrayList) cy3.h).iterator();
                while (it.hasNext()) {
                    ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(p1, wdg);
                }
                return;
            }
            return;
        }
        ys9.now();
        dVar.getClass();
        wdg wdg2 = wdg.c;
        dVar.getClass();
        dVar.getClass();
        if (cy3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) cy3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c p12 = dVar.p1();
            Iterator it2 = ((CopyOnWriteArrayList) cy3.h).iterator();
            while (it2.hasNext()) {
                ((ImagePerfDataListener) it2.next()).onImageVisibilityUpdated(p12, wdg2);
            }
        }
    }

    public final void close() {
        this.b.n1();
    }

    public final void onDraw() {
    }

    public final void onEmptyEvent(Object obj) {
        o97 o97 = o97.v;
        d dVar = this.b;
        dVar.getClass();
        this.c.m(dVar, o97);
    }

    public final void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.b = str;
        dVar.getClass();
        o97 o97 = o97.o;
        cy3 cy3 = this.c;
        cy3.m(dVar, o97);
        wdg wdg = wdg.c;
        dVar.getClass();
        dVar.getClass();
        if (cy3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) cy3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c p1 = dVar.p1();
            Iterator it = ((CopyOnWriteArrayList) cy3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(p1, wdg);
            }
        }
    }

    public final void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.getClass();
        dVar.b = str;
        dVar.v = (k97) obj;
        this.c.m(dVar, o97.c);
    }

    public final void onIntermediateImageSet(String str, Object obj) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.b = str;
        dVar.v = (k97) obj;
        this.c.m(dVar, o97.b);
    }

    public final void onRelease(String str, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.b = str;
        o97 o97 = o97.w;
        cy3 cy3 = this.c;
        cy3.m(dVar, o97);
        wdg wdg = wdg.c;
        dVar.getClass();
        dVar.getClass();
        if (cy3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) cy3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c p1 = dVar.p1();
            Iterator it = ((CopyOnWriteArrayList) cy3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(p1, wdg);
            }
        }
    }

    public final void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.o1();
        dVar.getClass();
        dVar.b = str;
        dVar.o = obj;
        dVar.getClass();
        o97 o97 = o97.a;
        cy3 cy3 = this.c;
        cy3.m(dVar, o97);
        wdg wdg = wdg.b;
        dVar.getClass();
        dVar.getClass();
        if (cy3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) cy3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c p1 = dVar.p1();
            Iterator it = ((CopyOnWriteArrayList) cy3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(p1, wdg);
            }
        }
    }
}
