package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: a22  reason: default package */
public final class a22 extends qi0 {
    public final SparseArray i = new SparseArray();

    public final void b(ByteBuffer byteBuffer) {
        b22 b22 = (b22) this.i.get(this.b.b);
        n79.o(b22);
        int remaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer k = k(this.c.d * remaining);
        ld9.M(byteBuffer, this.b, k, this.c, b22, remaining, false, true);
        k.flip();
    }

    public final j60 g(j60 j60) {
        if (j60.c == 2) {
            b22 b22 = (b22) this.i.get(j60.b);
            if (b22 != null) {
                return b22.e ? j60.e : new j60(j60.a, b22.b, 2);
            }
            throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", j60);
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }
}
