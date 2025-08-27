package defpackage;

import android.text.TextUtils;

/* renamed from: er4  reason: default package */
public final class er4 implements a35, h3f {
    public final String a;

    public /* synthetic */ er4(String str) {
        this.a = str;
    }

    public static er4 a(l8b l8b) {
        String str;
        l8b.H(2);
        int u = l8b.u();
        int i = u >> 1;
        int u2 = ((l8b.u() >> 3) & 31) | ((u & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (u2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u2);
        return new er4(sb.toString());
    }

    public Object l() {
        return this;
    }

    public String m() {
        return this.a;
    }

    public void n(g3f g3f) {
    }

    public boolean r(CharSequence charSequence, int i, int i2, juf juf) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        juf.c = (juf.c & 3) | 4;
        return false;
    }
}
