package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: is1  reason: default package */
public final class is1 implements ls1 {
    public final /* synthetic */ ks1 a;

    public is1(ks1 ks1) {
        this.a = ks1;
    }

    public final zz7 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((ls1) it.next()).a(totalCaptureResult));
        }
        kz7 b = hd8.b(arrayList);
        es1 es1 = new es1(2);
        return hd8.b0(b, new xv1(22, (Object) es1), ryg.j());
    }

    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((ls1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((ls1) it.next()).c();
        }
    }
}
