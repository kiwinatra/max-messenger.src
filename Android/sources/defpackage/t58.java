package defpackage;

/* renamed from: t58  reason: default package */
public final class t58 {
    public final s58 a;
    public final long b;

    public t58(s58 s58, long j) {
        this.a = s58;
        this.b = j;
    }

    public static t58 a(pf9 pf9) {
        pf9 pf92 = pf9;
        int e0 = ryg.e0(pf9);
        Double valueOf = Double.valueOf(1.401298464324817E-45d);
        Float valueOf2 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
        double d = 1.401298464324817E-45d;
        double d2 = 1.401298464324817E-45d;
        long j = 0;
        double d3 = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i < e0; i++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c = 65535;
            switch (A0.hashCode()) {
                case 96681:
                    if (A0.equals("alt")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100650:
                    if (A0.equals("epu")) {
                        c = 1;
                        break;
                    }
                    break;
                case 103154:
                    if (A0.equals("hdn")) {
                        c = 2;
                        break;
                    }
                    break;
                case 106911:
                    if (A0.equals("lat")) {
                        c = 3;
                        break;
                    }
                    break;
                case 107301:
                    if (A0.equals("lng")) {
                        c = 4;
                        break;
                    }
                    break;
                case 114087:
                    if (A0.equals("spd")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3560141:
                    if (A0.equals("time")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    d3 = ryg.a0(pf92, Double.valueOf(0.0d)).doubleValue();
                    break;
                case 1:
                    f = ryg.b0(pf92, valueOf2).floatValue();
                    break;
                case 2:
                    f2 = ryg.b0(pf92, valueOf2).floatValue();
                    break;
                case 3:
                    d = ryg.a0(pf92, valueOf).doubleValue();
                    break;
                case 4:
                    d2 = ryg.a0(pf92, valueOf).doubleValue();
                    break;
                case 5:
                    f3 = ryg.b0(pf92, valueOf2).floatValue();
                    break;
                case 6:
                    j = ryg.d0(pf92, 0);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new t58(new s58(d, d2, d3, f, f2, f3), j);
    }

    public final String toString() {
        return "LocationInfo{location=" + this.a + ", time=" + this.b + "}";
    }
}
