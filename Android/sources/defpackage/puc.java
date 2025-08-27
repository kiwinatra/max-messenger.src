package defpackage;

/* renamed from: puc  reason: default package */
public final class puc {
    public final int a;
    public final long b;
    public final long c;
    public final web d;

    public puc(u62 u62) {
        this.a = u62.a;
        this.b = u62.b;
        this.c = u62.c;
        this.d = (web) u62.d;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [u62, java.lang.Object] */
    public static puc a(pf9 pf9) {
        int i;
        String str;
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        ? obj = new Object();
        for (int i2 = 0; i2 < e0; i2++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case 3355:
                    if (A0.equals("id")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 102340:
                    if (A0.equals("gif")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (A0.equals("type")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 238532408:
                    if (A0.equals("stickerId")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.b = pf9.x0();
                    break;
                case 1:
                    obj.d = (web) gz.b(pf9);
                    break;
                case 2:
                    String g0 = ryg.g0(pf9);
                    int[] A = tr1.A(3);
                    int length = A.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i = 1;
                        } else {
                            i = A[i3];
                            if (i == 1) {
                                str = "UNKNOWN";
                            } else if (i == 2) {
                                str = "STICKER";
                            } else if (i == 3) {
                                str = "GIF";
                            } else {
                                throw null;
                            }
                            if (!str.equals(g0)) {
                                i3++;
                            }
                        }
                    }
                    obj.a = i;
                    break;
                case 3:
                    obj.c = ryg.d0(pf9, 0);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new puc(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentItem{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "STICKER" : "UNKNOWN");
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", stickerId=");
        sb.append(this.c);
        sb.append(", gif=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
