package defpackage;

/* renamed from: upf  reason: default package */
public final class upf {
    public static final upf d = new upf(new spf[0]);
    public static final String e = Integer.toString(0, 36);
    public final int a;
    public final k0d b;
    public int c;

    static {
        int i = v0g.a;
    }

    public upf(spf... spfArr) {
        this.b = tb7.q(spfArr);
        this.a = spfArr.length;
        int i = 0;
        while (true) {
            k0d k0d = this.b;
            if (i < k0d.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < k0d.size(); i3++) {
                    if (((spf) k0d.get(i)).equals(k0d.get(i3))) {
                        i8b.p("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final spf a(int i) {
        return (spf) this.b.get(i);
    }

    public final int b(spf spf) {
        int indexOf = this.b.indexOf(spf);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || upf.class != obj.getClass()) {
            return false;
        }
        upf upf = (upf) obj;
        return this.a == upf.a && this.b.equals(upf.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
