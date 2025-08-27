package defpackage;

import android.content.Context;

/* renamed from: xd4  reason: default package */
public final class xd4 implements f74 {
    public final Context a;
    public final arf b;
    public final f74 c;

    public xd4(Context context, String str, vc4 vc4) {
        wf4 wf4 = new wf4();
        wf4.b = str;
        this.a = context.getApplicationContext();
        this.b = vc4;
        this.c = wf4;
    }

    public final h74 a() {
        vd4 vd4 = new vd4(this.a, this.c.a());
        arf arf = this.b;
        if (arf != null) {
            vd4.O(arf);
        }
        return vd4;
    }
}
