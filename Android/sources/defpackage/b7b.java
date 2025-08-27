package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: b7b  reason: default package */
public final class b7b {
    public static final byte[] h = new byte[0];
    public final byte a;
    public final byte b;
    public final short c;
    public final short d;
    public final byte e;
    public final byte[] f;
    public final int g;

    public b7b(byte b2, short s, short s2, byte[] bArr, int i) {
        this.a = 10;
        this.b = b2;
        this.c = s;
        this.d = s2;
        this.e = 0;
        this.f = bArr;
        this.g = i;
    }

    public static b7b a(fbf fbf, byte b2, short s) {
        byte[] bArr;
        int size = ((HashMap) fbf.b).size();
        HashMap hashMap = (HashMap) fbf.b;
        if (size > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ryg.i0(hashMap, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            bArr = h;
        }
        byte[] bArr2 = bArr;
        return new b7b(b2, s, fbf.N(), bArr2, hashMap.size() > 0 ? bArr2.length : 0);
    }

    public final byte[] b(short s) {
        int i = this.g;
        ByteBuffer allocate = ByteBuffer.allocate(i + 10);
        allocate.put(this.a);
        allocate.put(this.b);
        allocate.putShort(s);
        allocate.putShort(this.d);
        allocate.putInt(i);
        if (i > 0) {
            allocate.put(this.f);
        }
        return allocate.array();
    }

    public final byte[] c(short s) {
        int i = this.g;
        if (i < 32) {
            return b(s);
        }
        int maxCompressedLength = kr7.u().fastCompressor().maxCompressedLength(i);
        byte[] bArr = new byte[maxCompressedLength];
        int compress = kr7.u().fastCompressor().compress(this.f, 0, this.g, bArr, 0, maxCompressedLength);
        ByteBuffer allocate = ByteBuffer.allocate(compress + 10);
        allocate.put(this.a);
        allocate.put(this.b);
        allocate.putShort(s);
        allocate.putShort(this.d);
        allocate.putInt((((i / compress) + 1) << 24) | compress);
        if (compress > 0) {
            allocate.put(bArr, 0, compress);
        }
        return allocate.array();
    }

    public final String toString() {
        String b2 = x3b.b(this.d);
        StringBuilder sb = new StringBuilder("Packet{ver=");
        sb.append(this.a);
        sb.append(", cmd=");
        sb.append(this.b);
        sb.append(", seq=");
        sb.append(this.c);
        sb.append(", opcode=");
        sb.append(b2);
        sb.append(", cof=");
        sb.append(this.e);
        sb.append(", payloadLength=");
        return wj6.l(sb, this.g, "}");
    }

    public b7b(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.a = wrap.get();
        this.b = wrap.get();
        this.c = wrap.getShort();
        this.d = wrap.getShort();
        int i = wrap.getInt();
        this.e = (byte) (i >> 24);
        int i2 = i & 16777215;
        this.g = i2;
        if (i2 > 0) {
            this.f = new byte[i2];
        } else {
            this.f = h;
        }
    }
}
