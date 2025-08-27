package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;

/* renamed from: lj  reason: default package */
public final class lj implements z9d {
    public final hr6 a;
    public final ic3 b;
    public u64 c;

    public lj(hr6 hr6, ic3 ic3) {
        this.a = hr6;
        this.b = ic3;
    }

    public final void a(u64 u64, byte[] bArr, int i) {
        SystemClock.elapsedRealtime();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b2 = wrap.get();
        wrap.getShort();
        wrap.getInt();
        if (b2 == 1) {
            wrap.getShort();
        } else {
            wrap.getInt();
        }
        byte b3 = wrap.get();
        ByteBuffer slice = wrap.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        int i2 = 0;
        if (b2 == 1) {
            int remaining = slice.remaining() / 4;
            float[] fArr = new float[remaining];
            while (i2 < remaining) {
                fArr[i2] = slice.getFloat();
                i2++;
            }
        } else if (b3 == 0) {
            int remaining2 = slice.remaining();
            float[] fArr2 = new float[remaining2];
            while (i2 < remaining2) {
                fArr2[i2] = ((float) (slice.get() & UByte.MAX_VALUE)) * 0.003921569f;
                i2++;
            }
        } else if (b3 != 1 && b3 == 2) {
            Color.rgb(slice.get() & UByte.MAX_VALUE, slice.get() & UByte.MAX_VALUE, slice.get() & UByte.MAX_VALUE);
        }
        ic3 ic3 = this.b;
        ((AtomicInteger) ic3.w).incrementAndGet();
        ((AtomicInteger) ic3.v).addAndGet(bArr.length);
        this.a.getClass();
    }
}
