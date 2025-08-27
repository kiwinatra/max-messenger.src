package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: t97  reason: default package */
public final class t97 extends bj0 {
    public final u97 b;
    public long c = -1;

    public t97(h94 h94) {
        this.b = h94;
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        u97 u97 = this.b;
        if (u97 != null) {
            h94 h94 = (h94) u97;
            h94.B0 = currentTimeMillis - this.c;
            h94.invalidateSelf();
        }
    }

    public final void c(Object obj, String str) {
        this.c = System.currentTimeMillis();
    }
}
