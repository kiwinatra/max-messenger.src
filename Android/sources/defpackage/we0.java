package defpackage;

import android.window.BackEvent;

/* renamed from: we0  reason: default package */
public final class we0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public we0(BackEvent backEvent) {
        vl vlVar = vl.a;
        float d2 = vlVar.d(backEvent);
        float e = vlVar.e(backEvent);
        float b2 = vlVar.b(backEvent);
        int c2 = vlVar.c(backEvent);
        this.a = d2;
        this.b = e;
        this.c = b2;
        this.d = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return tr1.k(sb, this.d, '}');
    }
}
