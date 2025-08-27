package defpackage;

import android.net.Uri;

/* renamed from: rl0  reason: default package */
public final class rl0 {
    public final Uri a;
    public mm b = mm.o;
    public final gm c = new gm();

    public rl0(Uri uri) {
        this.a = uri;
    }

    public final sl0 a(op7 op7) {
        return new sl0(this.a, this.b, this.c, op7);
    }

    public final void b(String str, String str2) {
        this.c.a(new dye(str, str2));
    }

    public final void c(String str, boolean z) {
        this.c.a(new gq0(str, z));
    }
}
