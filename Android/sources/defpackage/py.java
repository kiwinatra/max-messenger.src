package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: py  reason: default package */
public final class py extends ty {
    public final long c;
    public final ArrayList o = new ArrayList();
    public final ArrayList v = new ArrayList();

    public py(int i, long j) {
        super(i, 0);
        this.c = j;
    }

    public final ry A(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ry ryVar = (ry) arrayList.get(i2);
            if (ryVar.b == i) {
                return ryVar;
            }
        }
        return null;
    }

    public final String toString() {
        String f = ty.f(this.b);
        String arrays = Arrays.toString(this.o.toArray());
        String arrays2 = Arrays.toString(this.v.toArray());
        StringBuilder sb = new StringBuilder(g63.f(g63.f(g63.f(22, f), arrays), arrays2));
        sb.append(f);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final py z(int i) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            py pyVar = (py) arrayList.get(i2);
            if (pyVar.b == i) {
                return pyVar;
            }
        }
        return null;
    }
}
