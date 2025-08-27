package defpackage;

/* renamed from: dr4  reason: default package */
public final class dr4 {
    public final String a;

    public /* synthetic */ dr4(String str) {
        this.a = str;
    }

    public static dr4 a(g1g g1g) {
        String str;
        g1g.I(2);
        int v = g1g.v();
        int i = v >> 1;
        int v2 = ((g1g.v() >> 3) & 31) | ((v & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = v2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(v2);
        return new dr4(sb.toString());
    }
}
