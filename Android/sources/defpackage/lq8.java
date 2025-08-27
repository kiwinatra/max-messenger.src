package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lq8  reason: default package */
public final class lq8 {
    public final Context a;
    public final String b;

    public lq8(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public jq8 a(Uri uri) {
        tf5 tf5;
        boolean z;
        iq8 iq8 = new iq8(this.a, uri);
        jf4 jf4 = new jf4();
        synchronized (jf4) {
            jf4.b = 1;
        }
        synchronized (jf4) {
            jf4.c = 6;
        }
        Uri uri2 = iq8.a.getUri();
        if (uri2 != null) {
            tf5[] d = jf4.d(uri2, MapsKt.emptyMap());
            if (d.length == 1) {
                return new jq8(d[0], iq8);
            }
            int length = d.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tf5 = null;
                    break;
                }
                tf5 = d[i];
                try {
                    hf4 hf4 = iq8.b;
                    if (hf4 != null) {
                        z = tf5.n(hf4);
                        hf4 hf42 = iq8.b;
                        if (hf42 != null) {
                            hf42.w = 0;
                        }
                        if (z) {
                            break;
                        }
                        i++;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Throwable unused) {
                    hf4 hf43 = iq8.b;
                    if (hf43 != null) {
                        hf43.w = 0;
                    }
                    z = false;
                }
            }
            for (tf5 tf52 : d) {
                if (!Intrinsics.areEqual((Object) tf52, (Object) tf5)) {
                    tf52.release();
                }
            }
            if (tf5 != null) {
                return new jq8(tf5, iq8);
            }
            iq8.close();
            return null;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public SharedPreferences b() {
        return this.a.getSharedPreferences("tracer-" + this.b, 0);
    }

    public lq8(Context context) {
        this.a = context.getApplicationContext();
        this.b = lq8.class.getName();
    }
}
