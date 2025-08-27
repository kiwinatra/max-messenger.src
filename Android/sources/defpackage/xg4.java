package defpackage;

import android.content.Context;

/* renamed from: xg4  reason: default package */
public final class xg4 implements gn8 {
    public final Context a;

    public /* synthetic */ xg4(Context context) {
        this.a = context;
    }

    public in8 h(en8 en8) {
        Context context;
        int i = v0g.a;
        if (i < 23 || (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new ece(19).h(en8);
        }
        int g = vq9.g(en8.c.n);
        i8b.F("Creating an asynchronous MediaCodec adapter for track type " + v0g.H(g));
        he heVar = new he(g);
        heVar.b = true;
        return heVar.h(en8);
    }
}
