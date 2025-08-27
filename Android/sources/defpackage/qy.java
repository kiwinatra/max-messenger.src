package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: qy  reason: default package */
public final class qy extends ty {
    public final long c;
    public final ArrayList o = new ArrayList();
    public final ArrayList v = new ArrayList();

    public qy(int i, long j) {
        super(i, 1);
        this.c = j;
    }

    public final sy A(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) arrayList.get(i2);
            if (syVar.b == i) {
                return syVar;
            }
        }
        return null;
    }

    public final String toString() {
        return ty.g(this.b) + " leaves: " + Arrays.toString(this.o.toArray()) + " containers: " + Arrays.toString(this.v.toArray());
    }

    public final qy z(int i) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qy qyVar = (qy) arrayList.get(i2);
            if (qyVar.b == i) {
                return qyVar;
            }
        }
        return null;
    }
}
