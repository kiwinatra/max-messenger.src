package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: lq  reason: default package */
public final class lq extends e24 implements eva {
    public static final lq a = new Object();
    public static Lazy b;
    public static final String[] c = {"Prefs", "FilePrefs", px2.b, "chats-list-job-executor"};
    public static final Lazy d = LazyKt.lazy(new m(7));
    public static final Lazy e = LazyKt.lazy(new m(8));

    /* JADX WARNING: type inference failed for: r0v0, types: [lq, java.lang.Object] */
    static {
        qx2.m.getClass();
    }

    public static pof d() {
        return (pof) e.getValue();
    }

    public final void a(String str, Throwable th) {
        Lazy lazy;
        cud cud;
        if (str == null || str.length() == 0) {
            if (((th instanceof Error) || !((lazy = b) == null || (cud = (cud) lazy.getValue()) == null || !cud.m(PmsKey.f114tracernonfatalcrashedenabled, false))) && d() != null) {
                pof.b((e4e) null, th, (String) null);
            }
        } else if (d() != null) {
            pof.b((e4e) null, th, str);
        }
    }

    public final void b(String str, String str2) {
        if (((kof) d.getValue()) != null) {
            kof kof = kof.a;
            Map mapOf = MapsKt.mapOf(TuplesKt.to(str, str2));
            if (!kof.b) {
                try {
                    kxd kxd = kof.e;
                    if (kxd == null) {
                        kxd = null;
                    }
                    kxd.f(mapOf);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void c(String str) {
        if (((kof) d.getValue()) != null) {
            try {
                kxd kxd = kof.e;
                if (kxd == null) {
                    kxd = null;
                }
                kxd.getClass();
                kxd.f(MapsKt.mapOf(TuplesKt.to("userId", str)));
            } catch (Exception unused) {
            }
        }
    }
}
