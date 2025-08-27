package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ds1  reason: default package */
public class ds1 {
    public static final ds1 a = new Object();

    public void a(zzf zzf, u40 u40) {
        zzf zzf2 = zzf;
        u40 u402 = u40;
        bx1 bx1 = (bx1) zzf2.k(zzf.k0, (Object) null);
        je3 je3 = c5b.c;
        la0 la0 = bx1.i;
        HashSet hashSet = new HashSet();
        pz9 c = pz9.c();
        ArrayList arrayList = new ArrayList();
        uz9 a2 = uz9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        c5b a3 = c5b.a(c);
        ArrayList arrayList3 = new ArrayList(arrayList);
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        a9f a9f2 = new a9f(arrayMap);
        int i = -1;
        new bx1(arrayList2, a3, -1, false, arrayList3, false, a9f2, (it1) null);
        if (bx1 != null) {
            u402.a(bx1.e);
            i = bx1.c;
            je3 = bx1.b;
        }
        u402.f = pz9.d(je3);
        u402.c = ((Integer) zzf2.k(vs1.c, Integer.valueOf(i))).intValue();
        u402.b(new ax1((CameraCaptureSession.CaptureCallback) zzf2.k(vs1.x, new CameraCaptureSession.CaptureCallback())));
        u402.c(er7.F(zzf).E());
    }
}
