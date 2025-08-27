package defpackage;

import java.util.List;

/* renamed from: eu  reason: default package */
public final class eu extends ij0 {
    public final int b;
    public final List c;

    public eu(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = list;
    }

    public final String toString() {
        return "AssetsGetByIdsEvent{type=" + tr1.z(this.b) + ", ids=" + this.c + '}';
    }
}
