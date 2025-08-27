package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: vj  reason: default package */
public final class vj extends ri0 {
    public final /* synthetic */ fk a;
    public final /* synthetic */ Map.Entry b;

    public vj(fk fkVar, Map.Entry entry) {
        this.a = fkVar;
        this.b = entry;
    }

    public final void e(i0 i0Var) {
    }

    public final void g(Bitmap bitmap) {
        if (bitmap == null) {
            int i = fk.f;
            return;
        }
        try {
            this.a.b.put(((m25) this.b.getValue()).a, bitmap);
        } catch (Exception unused) {
            int i2 = fk.f;
        }
    }
}
