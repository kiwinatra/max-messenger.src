package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: g51  reason: default package */
public final class g51 implements woc {
    public final Lazy a;

    public /* synthetic */ g51(Lazy lazy) {
        this.a = lazy;
    }

    public x23 a() {
        return (x23) this.a.getValue();
    }

    public void b(boolean z) {
        z68.c("SavedBackgroundThemeMigration", "Start theme background migration for theme: isDark=" + z + ".", new Object[0]);
        String b = nf0.b(a(), z);
        List list = z ? kf0.c : kf0.b;
        a33 a33 = (a33) a();
        if (z ? a33.c("app.chat.background.was.set.as.solid.color.dark", false) : a33.c("app.chat.background.was.set.as.solid.color.light", false)) {
            nf0.e((String) null, z, a());
        } else if (b == null || !list.contains(b)) {
            nf0.e((String) CollectionsKt.firstOrNull(list), z, a());
        } else {
            nf0.e(b, z, a());
        }
    }

    public boolean shouldHideSensitiveInformation() {
        ((vpa) this.a.getValue()).getClass();
        return true;
    }

    public g51() {
        this.a = LazyKt.lazy(new dle(10));
    }
}
