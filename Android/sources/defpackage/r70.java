package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: r70  reason: default package */
public final class r70 extends j3h {
    public static final int[] v = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int o;

    public final boolean n1(g1g g1g) {
        if (!this.b) {
            int v2 = g1g.v();
            int i = (v2 >> 4) & 15;
            this.o = i;
            ypf ypf = (ypf) this.a;
            if (i == 2) {
                int i2 = v[(v2 >> 2) & 3];
                aa6 aa6 = new aa6();
                aa6.k = "audio/mpeg";
                aa6.x = 1;
                aa6.y = i2;
                ypf.d(aa6.a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                aa6 aa62 = new aa6();
                aa62.k = str;
                aa62.x = 1;
                aa62.y = 8000;
                ypf.d(aa62.a());
                this.c = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException(i2a.h(39, this.o, "Audio format not supported: "));
            }
            this.b = true;
        } else {
            g1g.I(1);
        }
        return true;
    }

    public final boolean o1(long j, g1g g1g) {
        g1g g1g2 = g1g;
        int i = this.o;
        ypf ypf = (ypf) this.a;
        if (i == 2) {
            int c2 = g1g.c();
            ypf.c(c2, g1g2);
            ((ypf) this.a).b(j, 1, c2, 0, (wpf) null);
            return true;
        }
        int v2 = g1g.v();
        if (v2 == 0 && !this.c) {
            int c3 = g1g.c();
            byte[] bArr = new byte[c3];
            g1g2.g(0, bArr, c3);
            e J = q8.J(new ky1(bArr, (byte) 0, c3, 1), false);
            aa6 aa6 = new aa6();
            aa6.k = "audio/mp4a-latm";
            aa6.h = J.c;
            aa6.x = J.b;
            aa6.y = J.a;
            aa6.m = Collections.singletonList(bArr);
            ypf.d(new ca6(aa6));
            this.c = true;
            return false;
        } else if (this.o == 10 && v2 != 1) {
            return false;
        } else {
            int c4 = g1g.c();
            ypf.c(c4, g1g2);
            ((ypf) this.a).b(j, 1, c4, 0, (wpf) null);
            return true;
        }
    }
}
