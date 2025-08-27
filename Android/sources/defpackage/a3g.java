package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: a3g  reason: default package */
public final class a3g extends gz {
    public final String X;
    public final String Y;
    public final byte[] Z;
    public final Long o;
    public final Long v;
    public final Long v0;
    public final String w;
    public final String w0;
    public final Integer x;
    public final x3g x0;
    public final Integer y;
    public final boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a3g(long j, Long l, String str, Integer num, Integer num2, boolean z2, String str2, String str3, byte[] bArr, Long l2, boolean z3, String str4, x3g x3g, boolean z4) {
        super(b10.VIDEO, z3, z4);
        this.o = Long.valueOf(j);
        this.v = l;
        this.w = str;
        this.x = num;
        this.y = num2;
        this.z = z2;
        this.X = str2;
        this.Y = str3;
        this.v0 = l2;
        this.Z = bArr;
        this.w0 = str4;
        this.x0 = x3g;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.w0;
        if (!cvg.A(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("videoId", this.o);
        }
        return a;
    }
}
