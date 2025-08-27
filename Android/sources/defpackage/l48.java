package defpackage;

import android.content.Context;

/* renamed from: l48  reason: default package */
public final class l48 {
    public final Context a;
    public final voc b;
    public volatile boolean c;
    public volatile boolean d;

    public l48(Context context, voc voc) {
        this.a = context;
        this.b = voc;
        boolean z = false;
        this.c = q8.d(context, "android.permission.RECORD_AUDIO") == 0;
        this.d = q8.d(context, "android.permission.CAMERA") == 0 ? true : z;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = q8.d(this.a, "android.permission.RECORD_AUDIO") == 0;
        boolean z3 = q8.d(this.a, "android.permission.CAMERA") == 0;
        this.b.log("LocalMediaPermissionProvider", "call permissions state updated, audio: " + this.c + "->" + z2 + ", video: " + this.d + "->" + z3);
        if (this.c != z2) {
            this.c = z2;
            z = true;
        }
        if (this.d == z3) {
            return z;
        }
        this.d = z3;
        return true;
    }
}
