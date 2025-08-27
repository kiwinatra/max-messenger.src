package defpackage;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* renamed from: jn1  reason: default package */
public final class jn1 {
    public final String a;
    public final Function0 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final String e;
    public int f;
    public long g;
    public long h;
    public long i;

    public jn1(String str, ve veVar) {
        this.a = str;
        this.b = veVar;
        this.e = a81.m("CallOpenGL_stat_", str);
    }

    public final void a(voc voc) {
        AtomicInteger atomicInteger;
        String str;
        long j;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        long j2 = nanoTime - this.g;
        if (j2 > 0) {
            boolean booleanValue = ((Boolean) this.b.invoke()).booleanValue();
            AtomicInteger atomicInteger2 = this.c;
            if (!booleanValue || atomicInteger2.get() != 0) {
                float nanos = ((float) (TimeUnit.SECONDS.toNanos(1) * ((long) this.f))) / ((float) j2);
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long millis = timeUnit.toMillis(j2);
                int i2 = atomicInteger2.get();
                AtomicInteger atomicInteger3 = this.d;
                int i3 = atomicInteger3.get();
                int i4 = this.f;
                String format = decimalFormat.format((double) nanos);
                long j3 = this.h;
                int i5 = this.f;
                String str2 = "-";
                if (i5 <= 0) {
                    atomicInteger = atomicInteger2;
                    str = str2;
                } else {
                    atomicInteger = atomicInteger2;
                    str = timeUnit.toMicros(j3 / ((long) i5)) + " us";
                }
                long j4 = this.i;
                int i6 = this.f;
                if (i6 <= 0) {
                    j = nanoTime;
                } else {
                    j = nanoTime;
                    str2 = timeUnit.toMicros(j4 / ((long) i6)) + " us";
                }
                voc.log(this.e, this.a + " -> Duration: " + millis + " ms. received: " + i2 + ", dropped: " + i3 + ", rendered: " + i4 + ", fps: " + format + ",avg render time: " + str + ", avg swapBuffer time: " + str2 + ".");
                this.g = j;
                this.f = 0;
                this.h = 0;
                this.i = 0;
                atomicInteger.set(0);
                atomicInteger3.set(0);
            }
        }
    }
}
