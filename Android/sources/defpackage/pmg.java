package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: pmg  reason: default package */
public final class pmg implements sf5 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final qkf b;
    public final g1g c = new g1g(3, false);
    public wf5 d;
    public byte[] e = new byte[1024];
    public int f;

    public pmg(String str, qkf qkf) {
        this.a = str;
        this.b = qkf;
    }

    public final ypf a(long j) {
        ypf B = this.d.B(0, 3);
        aa6 aa6 = new aa6();
        aa6.k = "text/vtt";
        aa6.c = this.a;
        aa6.o = j;
        B.d(aa6.a());
        this.d.v();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final void g(wf5 wf5) {
        this.d = wf5;
        wf5.K(new tq5(-9223372036854775807L));
    }

    public final boolean h(uf5 uf5) {
        gf4 gf4 = (gf4) uf5;
        gf4.q(this.e, 0, 6, false);
        byte[] bArr = this.e;
        g1g g1g = this.c;
        g1g.F(6, bArr);
        if (rmg.a(g1g)) {
            return true;
        }
        gf4.q(this.e, 6, 3, false);
        g1g.F(9, this.e);
        return rmg.a(g1g);
    }

    public final int i(uf5 uf5, yl4 yl4) {
        String i;
        this.d.getClass();
        int i2 = (int) ((gf4) uf5).c;
        int i3 = this.f;
        byte[] bArr = this.e;
        if (i3 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i4 = this.f;
        int read = ((gf4) uf5).read(bArr2, i4, bArr2.length - i4);
        if (read != -1) {
            int i5 = this.f + read;
            this.f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        g1g g1g = new g1g(this.e);
        rmg.d(g1g);
        String i6 = g1g.i();
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(i6)) {
                if (i6.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = g.matcher(i6);
                    if (!matcher2.find()) {
                        throw ParserException.a(i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), (RuntimeException) null);
                    }
                    Matcher matcher3 = h.matcher(i6);
                    if (!matcher3.find()) {
                        throw ParserException.a(i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), (RuntimeException) null);
                    }
                    String group = matcher2.group(1);
                    group.getClass();
                    j2 = rmg.c(group);
                    String group2 = matcher3.group(1);
                    group2.getClass();
                    j = (Long.parseLong(group2) * 1000000) / 90000;
                }
                i6 = g1g.i();
            } else {
                while (true) {
                    String i7 = g1g.i();
                    if (i7 == null) {
                        break;
                    } else if (rmg.a.matcher(i7).matches()) {
                        do {
                            i = g1g.i();
                            if (i == null) {
                                break;
                            }
                        } while (i.isEmpty());
                    } else {
                        Matcher matcher4 = mmg.a.matcher(i7);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c2 = rmg.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                ypf a2 = a(b2 - c2);
                byte[] bArr3 = this.e;
                int i8 = this.f;
                g1g g1g2 = this.c;
                g1g2.F(i8, bArr3);
                a2.c(this.f, g1g2);
                a2.b(b2, 1, this.f, 0, (wpf) null);
                return -1;
            }
        }
    }

    public final void release() {
    }
}
