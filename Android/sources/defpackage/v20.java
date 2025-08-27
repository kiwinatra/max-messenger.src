package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: v20  reason: default package */
public final class v20 extends gz {
    public final int X;
    public final Long o;
    public final String v;
    public final Long w;
    public final byte[] x;
    public final String y;
    public final String z;

    public v20(long j, String str, long j2, byte[] bArr, boolean z2, String str2, String str3, boolean z3, int i) {
        super(b10.AUDIO, z2, z3);
        this.w = Long.valueOf(j2);
        this.o = Long.valueOf(j);
        this.v = str;
        this.x = bArr;
        this.y = str2;
        this.z = str3;
        this.X = i;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.y;
        if (!cvg.A(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("audioId", this.o);
        }
        return a;
    }
}
