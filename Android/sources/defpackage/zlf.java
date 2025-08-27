package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* renamed from: zlf  reason: default package */
public final class zlf extends qi0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 21) {
            byteBuffer2 = k((i2 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i3 == 22) {
            byteBuffer2 = k(i2);
            while (position < limit) {
                l((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), byteBuffer2);
                position += 4;
            }
        } else if (i3 == 1342177280) {
            byteBuffer2 = k((i2 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i3 == 1610612736) {
            byteBuffer2 = k(i2);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final j60 g(j60 j60) {
        int i2 = j60.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new j60(j60.a, j60.b, 4) : j60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }
}
