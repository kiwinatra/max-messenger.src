package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: he6  reason: default package */
public final class he6 extends ee6 {
    public final ba7 f;
    public final hn4 g;
    public t38 h;
    public w0d i;

    public he6(jbf jbf, m95 m95, ba7 ba7, hn4 hn4) {
        super(jbf, m95);
        this.f = ba7;
        this.g = hn4;
    }

    public final void a(f4g f4g, int i2, int i3) {
        super.a(f4g, i2, i3);
        Uri h2 = ((ol0) f4g).h();
        int i4 = t0g.a;
        String scheme = h2.getScheme();
        boolean z = TextUtils.isEmpty(scheme) || "file".equals(scheme);
        m95 m95 = this.b;
        jbf jbf = this.a;
        if (z) {
            if (this.h == null) {
                this.h = new t38(jbf, m95, this.g);
            }
            this.h.a(f4g, i2, i3);
            return;
        }
        if (this.i == null) {
            this.i = new w0d(jbf, m95, this.f);
        }
        this.i.a(f4g, i2, i3);
    }

    public final boolean b() {
        f4g f4g = this.e;
        if (f4g == null) {
            z68.f("he6", "You should call setVideoContent before prepare!", (Throwable) null);
            return false;
        }
        Uri h2 = ((ol0) f4g).h();
        int i2 = t0g.a;
        String scheme = h2.getScheme();
        return (TextUtils.isEmpty(scheme) || "file".equals(scheme)) ? this.h.b() : this.i.b();
    }
}
