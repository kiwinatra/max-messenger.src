package defpackage;

import java.util.LinkedHashSet;
import kotlin.Lazy;

/* renamed from: xy6  reason: default package */
public final class xy6 implements wy6 {
    public final Lazy a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public uy6 d;

    public xy6(Lazy lazy) {
        this.a = lazy;
    }

    public final void a(uy6 uy6) {
        this.d = uy6;
        boolean z = false;
        boolean z2 = false;
        for (vy6 vy6 : this.b) {
            boolean a0 = ((d99) vy6).a0(uy6, new zw(22, (Object) this));
            if (!z2) {
                z2 = a0;
            }
        }
        if (uy6 != null && !z2) {
            z = true;
        }
        this.c = z;
    }
}
