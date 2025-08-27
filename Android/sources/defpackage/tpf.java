package defpackage;

/* renamed from: tpf  reason: default package */
public final class tpf implements jv0 {
    public static final tpf o = new tpf(new rpf[0]);
    public final int a;
    public final k0d b;
    public int c;

    public tpf(rpf... rpfArr) {
        this.b = tb7.q(rpfArr);
        this.a = rpfArr.length;
        int i = 0;
        while (true) {
            k0d k0d = this.b;
            if (i < k0d.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < k0d.size(); i3++) {
                    if (((rpf) k0d.get(i)).equals(k0d.get(i3))) {
                        iq.y(new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final rpf a(int i) {
        return (rpf) this.b.get(i);
    }

    public final int b(rpf rpf) {
        int indexOf = this.b.indexOf(rpf);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tpf.class != obj.getClass()) {
            return false;
        }
        tpf tpf = (tpf) obj;
        return this.a == tpf.a && this.b.equals(tpf.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
