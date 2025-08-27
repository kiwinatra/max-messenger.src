package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ind  reason: default package */
public final class ind {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e = LazyKt.lazy(LazyThreadSafetyMode.NONE, new red(8));

    public ind(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final yva a() {
        return (yva) this.a.getValue();
    }

    public final void b(List list, vk3 vk3, a32 a32) {
        o3c o3c;
        akd akd = (akd) ((bud) this.d.getValue());
        akd.getClass();
        if (akd.m(PmsKey.f27debugprofileinfo, false) || ((a33) ((x23) this.c.getValue())).g.getBoolean("app.debug.profile.info.enabled", false)) {
            if (vk3 == null) {
                vk3 = a32 != null ? a32.m() : null;
            }
            if (vk3 != null) {
                o3c = new o3c(vk3.r());
            } else if (a32 != null) {
                o3c = new o3c(a32.b.a);
            } else {
                return;
            }
            list.add(o3c);
        }
    }
}
