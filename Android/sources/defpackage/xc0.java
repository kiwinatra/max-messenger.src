package defpackage;

import android.util.Range;

/* renamed from: xc0  reason: default package */
public final class xc0 {
    public zqd a;
    public Range b;
    public Range c;
    public Integer d;

    public final yc0 a() {
        String str = this.a == null ? " qualitySelector" : "";
        if (this.b == null) {
            str = str.concat(" frameRate");
        }
        if (this.c == null) {
            str = tr1.j(str, " bitrate");
        }
        if (this.d == null) {
            str = tr1.j(str, " aspectRatio");
        }
        if (str.isEmpty()) {
            return new yc0(this.a, this.b, this.c, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void b(zqd zqd) {
        if (zqd != null) {
            this.a = zqd;
            return;
        }
        throw new NullPointerException("Null qualitySelector");
    }
}
