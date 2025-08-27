package defpackage;

import java.util.HashMap;

/* renamed from: al3  reason: default package */
public final class al3 extends gz {
    public final String X;
    public final String o;
    public final long v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public al3(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3) {
        super(b10.CONTACT, z2, z3);
        this.o = str;
        this.v = j;
        this.w = str2;
        this.z = str5;
        this.X = str6;
        this.x = str3;
        this.y = str4;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.o;
        if (!cvg.A(str)) {
            a.put("vcfBody", str);
        }
        long j = this.v;
        if (j != 0) {
            a.put("contactId", Long.valueOf(j));
        }
        return a;
    }
}
