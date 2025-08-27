package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Lazy;

/* renamed from: jwa  reason: default package */
public final class jwa {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public jwa(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public static int a(long j) {
        int abs = Math.abs(Long.hashCode(j));
        return abs <= 1000 ? abs + 1000 : abs;
    }

    public final jca b() {
        return (jca) this.e.getValue();
    }

    public final void c() {
        fu4.k.e(this.a).f().c().a.getClass();
    }

    public final hea d(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        Uri build = new Uri.Builder().scheme("content").authority("one.me.android.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build();
        o9a o9a = sq9.b;
        return new hea(str, z, build);
    }
}
