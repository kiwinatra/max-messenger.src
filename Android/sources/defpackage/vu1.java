package defpackage;

import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* renamed from: vu1  reason: default package */
public final class vu1 {
    public final fbf a;
    public final ArrayMap b = new ArrayMap(4);

    public vu1(wu1 wu1) {
        this.a = wu1;
    }

    public final qt1 a(String str) {
        qt1 qt1;
        synchronized (this.b) {
            qt1 = (qt1) this.b.get(str);
            if (qt1 == null) {
                try {
                    qt1 qt12 = new qt1(this.a.E(str), str);
                    this.b.put(str, qt12);
                    qt1 = qt12;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return qt1;
    }
}
