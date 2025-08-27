package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: y12  reason: default package */
public final class y12 extends qi0 {
    public int[] i;
    public int[] j;

    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                k.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    public final j60 g(j60 j60) {
        int[] iArr = this.i;
        if (iArr == null) {
            return j60.e;
        }
        if (j60.c == 2) {
            int length = iArr.length;
            int i2 = j60.b;
            boolean z = i2 != length;
            int i3 = 0;
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 < i2) {
                    z |= i4 != i3;
                    i3++;
                } else {
                    throw new AudioProcessor$UnhandledAudioFormatException(j60);
                }
            }
            return z ? new j60(j60.a, iArr.length, 2) : j60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }

    public final void h() {
        this.j = this.i;
    }

    public final void j() {
        this.j = null;
        this.i = null;
    }
}
