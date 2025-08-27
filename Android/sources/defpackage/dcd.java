package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.List;

/* renamed from: dcd  reason: default package */
public abstract class dcd {
    public final g0a a;
    public final int b;
    public final sp9 c;
    public boolean d;

    public dcd(ea6 ea6, g0a g0a) {
        this.a = g0a;
        this.c = ea6.k;
        this.b = y7e.y(ea6.n);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [cc7, jb7] */
    public static String i(ea6 ea6, List list) {
        String str;
        String str2 = ea6.n;
        n79.j(str2);
        boolean k = vq9.k(str2);
        ? jb7 = new jb7(4);
        jb7.j(str2);
        if (k) {
            jb7.j("video/hevc");
            jb7.j("video/avc");
        }
        jb7.k(list);
        tb7 b2 = jb7.l().b();
        int i = 0;
        while (true) {
            int size = b2.size();
            m53 m53 = ea6.A;
            if (i < size) {
                String str3 = (String) b2.get(i);
                if (list.contains(str3)) {
                    if (!k || !m53.g(m53)) {
                        if (!k65.f(str3).isEmpty()) {
                            return str3;
                        }
                    } else if (!k65.g(str3, m53).isEmpty()) {
                        return str3;
                    }
                }
                i++;
            } else {
                boolean k2 = vq9.k(str2);
                if (!k2 || !m53.g(m53)) {
                    str = "No MIME type is supported by both encoder and muxer.";
                } else {
                    str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + m53;
                }
                throw ExportException.c(new IllegalArgumentException(str), 4003, new ci3(ea6.toString(), (String) null, k2, false));
            }
        }
    }

    public abstract gu6 j(e05 e05, ea6 ea6, int i);

    public abstract ba4 k();

    public abstract ea6 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void o();

    public abstract void p();
}
