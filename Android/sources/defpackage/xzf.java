package defpackage;

import java.util.List;

/* renamed from: xzf  reason: default package */
public final class xzf {
    public final fwd a;
    public final zzf b;
    public final hc0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public xzf(fwd fwd, zzf zzf, hc0 hc0, List list) {
        this.a = fwd;
        this.b = zzf;
        this.c = hc0;
        this.d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.b);
        sb.append(", mStreamSpec=");
        sb.append(this.c);
        sb.append(", mCaptureTypes=");
        sb.append(this.d);
        sb.append(", mAttached=");
        sb.append(this.e);
        sb.append(", mActive=");
        return wzf.l(sb, this.f, '}');
    }
}
