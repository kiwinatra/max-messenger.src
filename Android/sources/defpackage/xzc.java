package defpackage;

import android.util.SparseArray;

/* renamed from: xzc  reason: default package */
public final class xzc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yzc b;

    public /* synthetic */ xzc(yzc yzc, int i) {
        this.a = i;
        this.b = yzc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((a0d) sparseArray.valueAt(i)).getClass();
                }
                sparseArray.clear();
                return;
            default:
                yzc yzc = this.b;
                d0d d0d = yzc.i;
                if (d0d.w0 == yzc) {
                    if (d0d.z0) {
                        d0d.toString();
                    }
                    d0d.k();
                    return;
                }
                return;
        }
    }
}
