package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: iq8  reason: default package */
public final class iq8 implements j74 {
    public final j74 a;
    public hf4 b;

    public iq8(Context context, Uri uri) {
        this.a = new wd4(context);
        Map emptyMap = Collections.emptyMap();
        n79.p(uri, "The uri must be set.");
        G(new q74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null));
    }

    public final long G(q74 q74) {
        long G = this.a.G(q74);
        this.b = new hf4(this, q74.f, G != -1 ? q74.f + G : G);
        return G;
    }

    public final void H(brf brf) {
        this.a.H(brf);
    }

    public final void close() {
        this.b = null;
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
