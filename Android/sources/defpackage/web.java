package defpackage;

import java.util.HashMap;

/* renamed from: web  reason: default package */
public final class web extends gz {
    public final String X;
    public final String Y;
    public final Long Z;
    public final String o;
    public String v;
    public final String v0;
    public final Integer w;
    public final Integer x;
    public final boolean y;
    public final byte[] z;

    public web(String str, String str2, Integer num, Integer num2, boolean z2, byte[] bArr, Long l, String str3, String str4, boolean z3, boolean z4, String str5) {
        super(b10.PHOTO, z3, z4);
        this.o = str;
        this.v = str2;
        this.w = num;
        this.x = num2;
        this.y = z2;
        this.z = bArr;
        this.Z = l;
        this.Y = str3;
        this.X = str4;
        this.v0 = str5;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.X;
        if (!cvg.A(str)) {
            a.put("photoToken", str);
        }
        return a;
    }
}
