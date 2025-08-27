package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qr1  reason: default package */
public final class qr1 extends CameraDevice.StateCallback {
    public final /* synthetic */ do1 a;
    public final /* synthetic */ xr1 b;

    public qr1(xr1 xr1, do1 do1) {
        this.b = xr1;
        this.a = do1;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        CameraDevice cameraDevice2 = cameraDevice;
        xr1 xr1 = this.b;
        xr1.toString();
        jx1 jx1 = new jx1(xr1.N0, new ykb(Collections.emptyList()), false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        za7 za7 = new za7(surface);
        hd8.J(za7.e).d(new ir1(1, surface, surfaceTexture), ryg.j());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        pz9 c = pz9.c();
        ArrayList arrayList = new ArrayList();
        uz9 a2 = uz9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        vy4 vy4 = vy4.d;
        kwd a3 = dc0.a(za7);
        a3.f = vy4;
        linkedHashSet.add(a3.b());
        xr1.toString();
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        c5b a4 = c5b.a(c);
        ArrayList arrayList10 = new ArrayList(arrayList);
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (Iterator it = map.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap.put(str, map.get(str));
        }
        fwd fwd = new fwd(arrayList5, arrayList6, arrayList7, arrayList8, new bx1(arrayList9, a4, 1, false, arrayList10, false, new a9f(arrayMap), (it1) null), (dwd) null, (InputConfiguration) null, 0, (dc0) null);
        kwd kwd = xr1.H0;
        oj6 a5 = oj6.a(m5a.F(new sj6(jx1.l(fwd, cameraDevice2, new u6f((ykb) kwd.e, (ykb) kwd.f, (kq9) kwd.d, (Executor) kwd.a, (ScheduledExecutorService) kwd.b, (Handler) kwd.c)), 0)));
        ba baVar = new ba(10, jx1, za7);
        a5.getClass();
        tsd tsd = xr1.c;
        cz1 b0 = hd8.b0(a5, baVar, tsd);
        Objects.requireNonNull(cameraDevice);
        b0.d(new pr1(0, cameraDevice2), tsd);
    }
}
