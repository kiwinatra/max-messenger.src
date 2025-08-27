package defpackage;

import android.graphics.Bitmap;

/* renamed from: po0  reason: default package */
public final /* synthetic */ class po0 implements t5g {
    public final /* synthetic */ so0 a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ je6 c;
    public final /* synthetic */ skf d;

    public /* synthetic */ po0(so0 so0, Bitmap bitmap, je6 je6, skf skf) {
        this.a = so0;
        this.b = bitmap;
        this.c = je6;
        this.d = skf;
    }

    public final void run() {
        so0 so0 = this.a;
        so0.getClass();
        skf skf = this.d;
        n79.f("Bitmap queued but no timestamps provided.", skf.hasNext());
        so0.o.add(new ro0(this.b, this.c, skf));
        so0.Z();
        so0.X = false;
    }
}
