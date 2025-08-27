package defpackage;

/* renamed from: xod  reason: default package */
public final class xod extends yad {
    public final vod X;
    public final byte[] Y;
    public final by0 Z;
    public final wod y;
    public final jx0 z;

    public xod(wod wod, jx0 jx0, vod vod, byte[] bArr) {
        this.y = wod;
        this.z = jx0;
        this.X = vod;
        this.Y = bArr;
        this.Z = new by0(jx0, wod.b, bArr, vod);
    }

    public final void b() {
        this.Z.j = true;
    }

    public final Object c() {
        this.Z.a();
        vod vod = this.X;
        if (vod == null) {
            return null;
        }
        vod.v++;
        ((dt4) vod.a).b(vod.a(), vod.b, vod.o);
        return null;
    }
}
