package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: s70  reason: default package */
public final class s70 extends j3h {
    public static final int[] v = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int o;

    public final boolean n1(l8b l8b) {
        if (!this.b) {
            int u = l8b.u();
            int i = (u >> 4) & 15;
            this.o = i;
            zpf zpf = (zpf) this.a;
            if (i == 2) {
                int i2 = v[(u >> 2) & 3];
                ba6 ba6 = new ba6();
                ba6.m = vq9.l("audio/mpeg");
                ba6.A = 1;
                ba6.B = i2;
                zpf.e(ba6.a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                ba6 ba62 = new ba6();
                ba62.m = vq9.l(str);
                ba62.A = 1;
                ba62.B = 8000;
                zpf.e(ba62.a());
                this.c = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.o);
            }
            this.b = true;
        } else {
            l8b.H(1);
        }
        return true;
    }

    public final boolean o1(long j, l8b l8b) {
        l8b l8b2 = l8b;
        int i = this.o;
        zpf zpf = (zpf) this.a;
        if (i == 2) {
            int a = l8b.a();
            zpf.b(l8b2, a, 0);
            ((zpf) this.a).a(j, 1, a, 0, (xpf) null);
            return true;
        }
        int u = l8b.u();
        if (u == 0 && !this.c) {
            int a2 = l8b.a();
            byte[] bArr = new byte[a2];
            l8b2.e(0, bArr, a2);
            e T = iq.T(new ky1(bArr, (byte) 0, a2, 2), false);
            ba6 ba6 = new ba6();
            ba6.m = vq9.l("audio/mp4a-latm");
            ba6.i = T.c;
            ba6.A = T.b;
            ba6.B = T.a;
            ba6.p = Collections.singletonList(bArr);
            zpf.e(new ea6(ba6));
            this.c = true;
            return false;
        } else if (this.o == 10 && u != 1) {
            return false;
        } else {
            int a3 = l8b.a();
            zpf.b(l8b2, a3, 0);
            ((zpf) this.a).a(j, 1, a3, 0, (xpf) null);
            return true;
        }
    }
}
