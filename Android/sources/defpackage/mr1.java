package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: mr1  reason: default package */
public final /* synthetic */ class mr1 implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr1 b;

    public /* synthetic */ mr1(xr1 xr1, int i) {
        this.a = i;
        this.b = xr1;
    }

    public Object r(do1 do1) {
        int i = this.a;
        xr1 xr1 = this.b;
        xr1.getClass();
        switch (i) {
            case 0:
                try {
                    xr1.c.execute(new ir1(2, xr1, do1));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    do1.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                try {
                    ArrayList arrayList = new ArrayList(xr1.a.B().b().c);
                    arrayList.add((gu1) xr1.G0.w);
                    arrayList.add(new qr1(xr1, do1));
                    vu1 vu1 = xr1.b;
                    vu1.a.Y(xr1.z.a, xr1.c, fqc.j(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    e.getMessage();
                    xr1.toString();
                    do1.d(e);
                    return "configAndCloseTask";
                }
        }
    }
}
