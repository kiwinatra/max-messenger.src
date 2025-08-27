package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: qvb  reason: default package */
public final class qvb {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final k3d f;
    public final String g;
    public final ArrayList h;
    public final zz7 i;
    public int j = -1;

    public qvb(zw1 zw1, Rect rect, int i2, int i3, Matrix matrix, k3d k3d, go1 go1, int i4) {
        this.a = i4;
        this.d = i3;
        this.c = i2;
        this.b = rect;
        this.e = matrix;
        this.f = k3d;
        this.g = String.valueOf(zw1.hashCode());
        this.h = new ArrayList();
        List<kx1> list = zw1.a;
        Objects.requireNonNull(list);
        for (kx1 kx1 : list) {
            ArrayList arrayList = this.h;
            kx1.getClass();
            arrayList.add(0);
        }
        this.i = go1;
    }
}
