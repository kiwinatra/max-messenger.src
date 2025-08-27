package com.my.tracker.obfuscated;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

public abstract class r1 {
    private static final Charset b = StandardCharsets.UTF_8;
    protected final OutputStream a;

    public r1(OutputStream outputStream) {
        this.a = outputStream;
    }

    public int a(int i, double d) {
        return b(i, 1) + a(d);
    }

    public int b(byte[] bArr) {
        this.a.write(bArr);
        return bArr.length;
    }

    private int b(int i, int i2) {
        return a((i << 3) | i2);
    }

    public int a(int i, float f) {
        return b(i, 5) + a(f);
    }

    private int b(int i) {
        return i < 0 ? a((long) i) : a(i);
    }

    public int a(int i, int i2) {
        return b(i, 0) + b(i2);
    }

    public int a(int i, long j) {
        return b(i, 0) + a(j);
    }

    public int a(int i, q qVar) {
        if (qVar == null) {
            return 0;
        }
        int b2 = b(i, 2);
        int b3 = qVar.b();
        int b4 = b(b3) + b3 + b2;
        qVar.a(this.a);
        return b4;
    }

    public int a(int i, String str) {
        if (str == null) {
            return 0;
        }
        return b(i, 2) + a(str.getBytes(b));
    }

    public int a(int i, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return b(i, 2) + a(bArr);
    }

    private int a(byte[] bArr) {
        int b2 = b(bArr.length) + bArr.length;
        this.a.write(bArr);
        return b2;
    }

    public int a(int i, Map map, q qVar) {
        int i2 = 0;
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                qVar.a();
                qVar.a(1, str);
                qVar.a(2, (String) map.get(str));
                if (qVar.b() > 0) {
                    i2 += a(i, qVar);
                }
            }
        }
        return i2;
    }

    private int a(int i) {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & -128) == 0) {
                this.a.write(i);
                return i2;
            }
            this.a.write((i & 127) | Uuid.SIZE_BITS);
            i >>>= 7;
        }
    }

    private int a(long j) {
        int i = 0;
        while (true) {
            i++;
            if ((-128 & j) == 0) {
                this.a.write((int) j);
                return i;
            }
            this.a.write(((int) (127 & j)) | Uuid.SIZE_BITS);
            j >>>= 7;
        }
    }

    public int a(int i, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int i2 = 0;
        for (String a2 : strArr) {
            i2 += a(i, a2);
        }
        return i2;
    }

    private int a(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        this.a.write(((int) doubleToRawLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (doubleToRawLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 8;
    }

    private int a(float f) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        this.a.write(floatToRawIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((floatToRawIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((floatToRawIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((floatToRawIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 4;
    }
}
