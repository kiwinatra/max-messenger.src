package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UShort;
import kotlin.ranges.RangesKt;

/* renamed from: u05  reason: default package */
public final class u05 implements h57, aq9 {
    public static final long[] v = new long[0];
    public long a;
    public Object b;
    public Object c;
    public Object o;

    public u05(no5 no5) {
        this.o = no5;
        this.b = new d15();
        this.c = new ap0(0);
    }

    public int K() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return byteBuffer.getInt();
    }

    public void R(int i) {
        while (i > 0) {
            int skip = (int) ((InputStream) this.o).skip((long) i);
            if (skip >= 1) {
                i -= skip;
                this.a += (long) skip;
            } else {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
        }
    }

    public long W() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public void a(long j) {
        if (this.a != j) {
            this.a = j;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((no5) this.o).a = elapsedRealtime;
            ap0 ap0 = (ap0) this.c;
            long coerceAtLeast = RangesKt.coerceAtLeast(j - ap0.b, 0);
            long j2 = ap0.c;
            double millis = j2 == 0 ? Double.NaN : ((double) (TimeUnit.SECONDS.toMillis(1) * coerceAtLeast)) / ((double) RangesKt.coerceAtLeast(elapsedRealtime - j2, 1));
            ap0.b = j;
            ap0.c = elapsedRealtime;
            double d = millis * ((double) 8);
            d15 d15 = (d15) this.b;
            double d2 = d15.b;
            if (!Double.isNaN(d2)) {
                double d3 = d > d2 ? 0.3d : d15.a;
                d = (d * d3) + ((1.0d - d3) * d2);
            }
            d15.b = d;
        }
    }

    public void b(hq9 hq9, int i) {
        boolean z = true;
        if (i < 1 || i > 7) {
            z = false;
        }
        bs0.m("Invalid metering mode " + i, z);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(hq9);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(hq9);
        }
    }

    public void c(int i) {
        if (((InputStream) this.o).read((byte[]) this.b, 0, i) == i) {
            this.a += (long) i;
            return;
        }
        throw new IOException("read failed");
    }

    public long getContentLength() {
        return this.a;
    }

    public String getContentType() {
        return (String) this.o;
    }

    public long h() {
        return this.a;
    }

    public int readUnsignedShort() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public void writeTo(OutputStream outputStream) {
        Iterator it = ((List) this.c).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = (String) this.b;
            if (hasNext) {
                g57 g57 = (g57) it.next();
                outputStream.write(e57.b);
                e57.c(outputStream, str);
                byte[] bArr = e57.a;
                outputStream.write(bArr);
                e57.c(outputStream, g57.b);
                outputStream.write(bArr);
                g57.a.writeTo(outputStream);
                outputStream.write(bArr);
            } else {
                byte[] bArr2 = e57.b;
                outputStream.write(bArr2);
                e57.c(outputStream, str);
                outputStream.write(bArr2);
                return;
            }
        }
    }

    public u05(String str, List list) {
        long j;
        this.b = str;
        this.c = list;
        this.o = "multipart/form-data; boundary=".concat(str);
        Iterable iterable = list;
        long j2 = -1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((g57) it.next()).a.getContentLength() < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        long length = ((long) e57.b.length) + ((long) e57.b((String) this.b)) + ((long) e57.a.length);
        for (g57 g57 : (List) this.c) {
            long length2 = length + ((long) e57.b.length) + ((long) e57.b((String) this.b));
            byte[] bArr = e57.a;
            long length3 = length2 + ((long) bArr.length);
            h57 h57 = g57.a;
            if (h57.getContentLength() < 0) {
                j = -1;
            } else {
                j = h57.getContentLength() + ((long) (e57.b(g57.b) + bArr.length)) + ((long) bArr.length);
            }
            length = length3 + j;
        }
        j2 = length;
        this.a = j2;
    }
}
