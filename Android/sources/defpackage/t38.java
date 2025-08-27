package defpackage;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: t38  reason: default package */
public final class t38 extends ee6 {
    public final om0 f = om0.H();
    public or7 g;
    public final MediaMetadataRetriever h = new MediaMetadataRetriever();
    public final int i;
    public volatile long j;

    public t38(jbf jbf, m95 m95, hn4 hn4) {
        super(jbf, m95);
        kn4 b = hn4.b();
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            this.i = 5;
        } else if (ordinal == 1) {
            this.i = 10;
        } else if (ordinal == 2) {
            this.i = 20;
        } else {
            throw new IllegalStateException("unknown performance class " + b);
        }
    }

    public final boolean b() {
        f4g f4g = this.e;
        if (f4g != null) {
            Uri h2 = ((ol0) f4g).h();
            int i2 = t0g.a;
            String scheme = h2.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                return true;
            }
        }
        return false;
    }
}
