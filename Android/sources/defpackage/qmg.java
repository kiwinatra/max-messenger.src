package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qmg  reason: default package */
public final class qmg implements tf5 {
    public static final Pattern X = Pattern.compile("MPEGTS:(-?\\d+)");
    public static final Pattern z = Pattern.compile("LOCAL:([^,]+)");
    public final String a;
    public final rkf b;
    public final l8b c = new l8b();
    public final gze o;
    public final boolean v;
    public xf5 w;
    public byte[] x = new byte[1024];
    public int y;

    public qmg(String str, rkf rkf, ece ece, boolean z2) {
        this.a = str;
        this.b = rkf;
        this.o = ece;
        this.v = z2;
    }

    public final void U(xf5 xf5) {
        this.w = this.v ? new jk3(xf5, this.o) : xf5;
        xf5.M(new me0(-9223372036854775807L));
    }

    public final zpf a(long j) {
        zpf B = this.w.B(0, 3);
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("text/vtt");
        ba6.d = this.a;
        ba6.r = j;
        B.e(ba6.a());
        this.w.v();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final int g(vf5 vf5, yl4 yl4) {
        String h;
        this.w.getClass();
        int i = (int) ((hf4) vf5).c;
        int i2 = this.y;
        byte[] bArr = this.x;
        if (i2 == bArr.length) {
            this.x = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.x;
        int i3 = this.y;
        int read = ((hf4) vf5).read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.y + read;
            this.y = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        l8b l8b = new l8b(this.x);
        smg.d(l8b);
        String h2 = l8b.h(x22.c);
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h2)) {
                if (h2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = z.matcher(h2);
                    if (matcher2.find()) {
                        Matcher matcher3 = X.matcher(h2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j2 = smg.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h2), (RuntimeException) null);
                        }
                    } else {
                        throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h2), (RuntimeException) null);
                    }
                }
                h2 = l8b.h(x22.c);
            } else {
                while (true) {
                    String h3 = l8b.h(x22.c);
                    if (h3 == null) {
                        break;
                    } else if (smg.a.matcher(h3).matches()) {
                        do {
                            h = l8b.h(x22.c);
                            if (h == null) {
                                break;
                            }
                        } while (h.isEmpty());
                    } else {
                        Matcher matcher4 = nmg.a.matcher(h3);
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
                long c2 = smg.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                zpf a2 = a(b2 - c2);
                byte[] bArr3 = this.x;
                int i5 = this.y;
                l8b l8b2 = this.c;
                l8b2.E(i5, bArr3);
                a2.b(l8b2, this.y, 0);
                a2.a(b2, 1, this.y, 0, (xpf) null);
                return -1;
            }
        }
    }

    public final boolean n(vf5 vf5) {
        hf4 hf4 = (hf4) vf5;
        hf4.q(this.x, 0, 6, false);
        byte[] bArr = this.x;
        l8b l8b = this.c;
        l8b.E(6, bArr);
        if (smg.a(l8b)) {
            return true;
        }
        hf4.q(this.x, 6, 3, false);
        l8b.E(9, this.x);
        return smg.a(l8b);
    }

    public final void release() {
    }
}
