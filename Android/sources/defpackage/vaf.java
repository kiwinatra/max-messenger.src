package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vaf  reason: default package */
public final class vaf implements aud {
    public static final /* synthetic */ int j = 0;
    public final fn4 a;
    public final m95 b;
    public volatile boolean c;
    public final boolean d;
    public final Lazy e;
    public volatile String f;
    public volatile List g;
    public final String h;
    public rla i;

    public vaf(fn4 fn4, m95 m95, bud bud, Lazy lazy) {
        this.a = fn4;
        this.b = m95;
        akd akd = (akd) bud;
        this.d = i94.a(akd.n()) != i94.DISABLED;
        this.e = lazy;
        f(o5a.a(akd.z(PmsKey.proxy, (String) null)));
        List g2 = akd.g(PmsKey.f93proxydomains.name(), CollectionsKt.emptyList());
        synchronized (this) {
            this.g = g2;
        }
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(fn4.h().b);
        sb.append(" (");
        sb.append(fn4.h().e);
        sb.append("; ");
        sb.append(fn4.h().h);
        sb.append("; ");
        String n = wj6.n(sb, fn4.h().i, ")");
        try {
            this.h = URLEncoder.encode(n, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.h = n;
        }
    }

    public static void c(vaf vaf, sd3 sd3, boolean z) {
        int i2 = 80;
        if (!cvg.A(vaf.f)) {
            sd3.l(vaf.f);
            if (z) {
                i2 = 443;
            }
            sd3.o(i2);
            return;
        }
        vaf.b.a(new IllegalStateException("proxy is null or empty!"));
        if (z) {
            i2 = 443;
        }
        sd3.o(i2);
    }

    public final void a(String str, String str2) {
        f(str2);
    }

    public final void b(List list, List list2) {
        synchronized (this) {
            this.g = list2;
        }
    }

    public final boolean d(String str) {
        if (cvg.A(str)) {
            return false;
        }
        for (String str2 : this.g) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public final rla e() {
        if (this.i == null) {
            qla qla = new qla();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            qla.y = u0g.b(timeUnit);
            qla.z = u0g.b(timeUnit);
            srd srd = new srd(6);
            srd.a = (ExecutorService) this.e.getValue();
            qla.a = srd;
            qla.x = u0g.b(timeUnit);
            qla.c.add(new uaf(this, 1));
            uaf uaf = new uaf(this, 0);
            ArrayList arrayList = qla.d;
            arrayList.add(uaf);
            if (!this.d) {
                this.a.e();
            } else {
                arrayList.add(new js0(1, "vaf"));
            }
            this.i = new rla(qla);
        }
        return this.i;
    }

    public final synchronized void f(String str) {
        this.c = !cvg.A(str);
        this.f = str;
    }
}
