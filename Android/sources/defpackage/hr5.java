package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* renamed from: hr5  reason: default package */
public final class hr5 extends pi0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            byteBuffer2 = j((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == i4) {
                    floatToIntBits = Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i3 == 805306368) {
            byteBuffer2 = j(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO);
                }
                byteBuffer2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final i60 f(i60 i60) {
        int i2 = i60.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new i60(i60.a, i60.b, 4) : i60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i60);
    }
}
