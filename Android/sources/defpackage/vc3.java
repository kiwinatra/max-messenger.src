package defpackage;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: vc3  reason: default package */
public final class vc3 implements qsd {
    public final k0d a;
    public long b;

    public vc3(List list, List list2) {
        qb7 o = tb7.o();
        n79.g(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            o.a(new uc3((qsd) list.get(i), (List) list2.get(i)));
        }
        this.a = o.j();
        this.b = -9223372036854775807L;
    }

    public final void A(long j) {
        int i = 0;
        while (true) {
            k0d k0d = this.a;
            if (i < k0d.size()) {
                ((uc3) k0d.get(i)).A(j);
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            k0d k0d = this.a;
            if (i >= k0d.size()) {
                return false;
            }
            if (((uc3) k0d.get(i)).d()) {
                return true;
            }
            i++;
        }
    }

    public final long i() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            k0d k0d = this.a;
            if (i >= k0d.size()) {
                break;
            }
            long i2 = ((uc3) k0d.get(i)).i();
            if (i2 != Long.MIN_VALUE) {
                j = Math.min(j, i2);
            }
            i++;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean k(d38 d38) {
        boolean z;
        boolean z2 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            int i2 = 0;
            z = false;
            while (true) {
                k0d k0d = this.a;
                if (i2 >= k0d.size()) {
                    break;
                }
                long i3 = ((uc3) k0d.get(i2)).i();
                boolean z3 = i3 != Long.MIN_VALUE && i3 <= d38.a;
                if (i3 == i || z3) {
                    z |= ((uc3) k0d.get(i2)).k(d38);
                }
                i2++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long y() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            k0d k0d = this.a;
            if (i >= k0d.size()) {
                break;
            }
            uc3 uc3 = (uc3) k0d.get(i);
            long y = uc3.y();
            if ((uc3.a().contains(1) || uc3.a().contains(2) || uc3.a().contains(4)) && y != Long.MIN_VALUE) {
                j = Math.min(j, y);
            }
            if (y != Long.MIN_VALUE) {
                j2 = Math.min(j2, y);
            }
            i++;
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            this.b = j;
            return j;
        } else if (j2 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.b;
            return j3 != -9223372036854775807L ? j3 : j2;
        }
    }
}
