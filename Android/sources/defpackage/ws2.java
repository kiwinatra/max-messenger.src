package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: ws2  reason: default package */
public final class ws2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ ws2(int i, Lazy lazy) {
        this.a = i;
        this.b = lazy;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((ct2) this.b.getValue()).a().b());
            default:
                Lazy lazy = this.b;
                e0g h = ((fn4) lazy.getValue()).h();
                e0g h2 = ((fn4) lazy.getValue()).h();
                e0g h3 = ((fn4) lazy.getValue()).h();
                e0g h4 = ((fn4) lazy.getValue()).h();
                StringBuilder sb = new StringBuilder("OKMessages/");
                sb.append(h.b);
                sb.append(" (");
                sb.append(h2.e);
                sb.append("; ");
                sb.append(h3.h);
                sb.append("; ");
                String n = wj6.n(sb, h4.i, ")");
                try {
                    return URLEncoder.encode(n, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return n;
                }
        }
    }
}
