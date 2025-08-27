package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: qr4  reason: default package */
public final class qr4 implements m23 {
    public pr4 a;
    public final GestureDetector b;
    public int c;

    public qr4(Context context) {
        this.b = new GestureDetector(context, new q00(11, this));
    }

    public final void a() {
        this.c = 0;
    }
}
