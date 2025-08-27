package defpackage;

import java.util.Map;

/* renamed from: jzf  reason: default package */
public final /* synthetic */ class jzf implements za3, ri8 {
    public final /* synthetic */ kzf a;
    public final /* synthetic */ kxf b;

    public /* synthetic */ jzf(kzf kzf, kxf kxf) {
        this.a = kzf;
        this.b = kxf;
    }

    public void b(pa3 pa3) {
        ((Map) this.a.b).remove(this.b);
        pa3.b();
    }

    public void e(rh8 rh8) {
        bxf bxf = (bxf) ((Map) this.a.b).get(this.b);
        if (bxf != null) {
            if (!rh8.f()) {
                rh8.a(bxf);
            }
        } else if (!rh8.f()) {
            rh8.b();
        }
    }
}
