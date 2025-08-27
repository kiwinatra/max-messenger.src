package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;

/* renamed from: bl3  reason: default package */
public final class bl3 {
    public final Lazy a;
    public final Lazy b;

    public bl3(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final String a(vk3 vk3, n10 n10) {
        if (vk3 != null) {
            return vk3.u(((qjd) ((x23) this.b.getValue())).p(), kl0.c);
        }
        if (n10.d.length() > 0) {
            String str = n10.g;
            int length = str.length();
            String str2 = n10.h;
            if (length > 0 || str2.length() > 0) {
                if (str2.length() != 0) {
                    str = str2;
                }
                return o5a.z(str);
            }
        }
        return null;
    }

    public final vk3 b(n10 n10) {
        if (!(n10.b != 0)) {
            return null;
        }
        km3 km3 = ((eu3) this.a.getValue()).a;
        ConcurrentHashMap concurrentHashMap = km3.a;
        long j = n10.b;
        vk3 vk3 = (vk3) concurrentHashMap.get(Long.valueOf(j));
        if (vk3 == null) {
            vk3 = km3.p(j, false);
        }
        if (vk3 == null || vk3.B() || vk3.n() != 0) {
            return null;
        }
        return vk3;
    }

    public final CharSequence c(n10 n10) {
        vk3 b2 = b(n10);
        if (b2 != null && ((String) b2.q()).length() > 0) {
            return b2.q();
        }
        String str = n10.d;
        if (str.length() <= 0) {
            return vua.b("Unknown", (CharSequence) null);
        }
        Pattern pattern = vua.a;
        return vua.b(str, n10.e);
    }
}
