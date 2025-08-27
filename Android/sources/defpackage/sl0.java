package defpackage;

import android.net.Uri;

/* renamed from: sl0  reason: default package */
public final class sl0 implements am {
    public final Uri a;
    public final mm b;
    public final gm c;
    public final op7 o;

    public sl0(Uri uri, mm mmVar, gm gmVar, op7 op7) {
        this.a = uri;
        this.b = mmVar;
        this.c = gmVar;
        this.o = op7;
    }

    public final op7 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        return 16;
    }

    public final mm getScope() {
        return this.b;
    }

    public final Uri getUri() {
        return this.a;
    }

    public final boolean shouldPost() {
        return this.c.c;
    }

    public final boolean willWriteParams() {
        return this.c.d;
    }

    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    public final void writeParams(zp7 zp7) {
        this.c.c(zp7);
    }

    public final void writeSupplyParams(zp7 zp7) {
        this.c.d(zp7);
    }
}
