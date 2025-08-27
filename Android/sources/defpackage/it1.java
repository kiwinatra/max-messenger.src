package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* renamed from: it1  reason: default package */
public interface it1 {
    CaptureResult B() {
        return null;
    }

    ft1 C();

    void b(ra5 ra5) {
        int i;
        int n = n();
        if (n != 1) {
            int y = tr1.y(n);
            if (y == 1) {
                i = 32;
            } else if (y == 2) {
                i = 0;
            } else if (y == 3) {
                i = 1;
            } else if (n != 1 && n != 2 && n != 3 && n != 4) {
                throw null;
            } else {
                return;
            }
            int i2 = i & 1;
            ArrayList arrayList = ra5.a;
            if (i2 == 1) {
                ra5.c("LightSource", String.valueOf(4), arrayList);
            }
            ra5.c("Flash", String.valueOf(i), arrayList);
        }
    }

    a9f d();

    long getTimestamp();

    gt1 l();

    int n();

    et1 x();
}
