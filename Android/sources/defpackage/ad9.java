package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: ad9  reason: default package */
public abstract class ad9 {
    protected volatile int cachedSize = -1;

    public static final <T extends ad9> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            i43 i43 = new i43(bArr, i, i2);
            t.mergeFrom(i43);
            i43.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(ad9 ad9, ad9 ad92) {
        int serializedSize;
        if (ad9 == ad92) {
            return true;
        }
        if (ad9 == null || ad92 == null || ad9.getClass() != ad92.getClass() || ad92.getSerializedSize() != (serializedSize = ad9.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(ad9, bArr, 0, serializedSize);
        toByteArray(ad92, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(ad9 ad9, byte[] bArr, int i, int i2) {
        try {
            j43 j43 = new j43(bArr, i, i2);
            ad9.writeTo(j43);
            if (j43.a.remaining() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract int computeSerializedSize();

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract ad9 mergeFrom(i43 i43);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            n54.H((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public abstract void writeTo(j43 j43);

    public ad9 clone() throws CloneNotSupportedException {
        return (ad9) super.clone();
    }

    public static final <T extends ad9> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(ad9 ad9) {
        int serializedSize = ad9.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(ad9, bArr, 0, serializedSize);
        return bArr;
    }
}
