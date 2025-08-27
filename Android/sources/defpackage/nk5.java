package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: nk5  reason: default package */
public final class nk5 extends gz {
    public final long o;
    public final long v;
    public final String w;
    public final gz x;
    public final String y;

    public nk5(long j, long j2, String str, gz gzVar, boolean z, String str2, boolean z2) {
        super(b10.FILE, z, z2);
        this.o = j;
        this.v = j2;
        this.w = str;
        this.x = gzVar;
        this.y = str2;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.y;
        if (!cvg.A(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("fileId", Long.valueOf(this.o));
        }
        return a;
    }
}
