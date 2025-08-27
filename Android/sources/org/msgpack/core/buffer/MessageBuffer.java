package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion = getJavaVersion();
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r0 = java.lang.Class.forName(r2);
        r2 = java.lang.Integer.TYPE;
        r2 = r0.getDeclaredConstructor(new java.lang.Class[]{r4, r2, r2});
        r2.setAccessible(true);
        mbArrConstructor = r2;
        r0 = r0.getDeclaredConstructor(new java.lang.Class[]{r1});
        r0.setAccessible(true);
        mbBBConstructor = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        r0.printStackTrace(java.lang.System.err);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0138, code lost:
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013a, code lost:
        r0 = DEFAULT_MESSAGE_BUFFER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013b, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0142, code lost:
        mbArrConstructor = null;
        mbBBConstructor = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r0 = java.lang.Class.forName(r2);
        r2 = java.lang.Integer.TYPE;
        r2 = r0.getDeclaredConstructor(new java.lang.Class[]{r4, r2, r2});
        r2.setAccessible(true);
        mbArrConstructor = r2;
        r0 = r0.getDeclaredConstructor(new java.lang.Class[]{r1});
        r0.setAccessible(true);
        mbBBConstructor = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0169, code lost:
        r0.printStackTrace(java.lang.System.err);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0173, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061 A[Catch:{ Exception -> 0x005a, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd A[SYNTHETIC, Splitter:B:50:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc A[SYNTHETIC, Splitter:B:59:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0147 A[SYNTHETIC, Splitter:B:73:0x0147] */
    static {
        /*
            java.lang.String r0 = "org.msgpack.core.buffer.MessageBufferBE"
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.String r2 = "org.msgpack.core.buffer.MessageBufferU"
            java.lang.String r3 = "org.msgpack.core.buffer.MessageBuffer"
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.String r5 = "Byte array index scale must be 1, but is "
            int r6 = getJavaVersion()
            javaVersion = r6
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 16
            java.lang.String r10 = "sun.misc.Unsafe"
            java.lang.Class.forName(r10)     // Catch:{ Exception -> 0x0022, all -> 0x001e }
            r10 = r8
            goto L_0x0023
        L_0x001e:
            r5 = move-exception
            r10 = r7
            goto L_0x0129
        L_0x0022:
            r10 = r6
        L_0x0023:
            java.lang.String r11 = "java.runtime.name"
            java.lang.String r12 = ""
            java.lang.String r11 = java.lang.System.getProperty(r11, r12)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            java.lang.String r11 = r11.toLowerCase()     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            java.lang.String r12 = "android"
            boolean r11 = r11.contains(r12)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            java.lang.String r12 = "com.google.appengine.runtime.version"
            java.lang.String r12 = java.lang.System.getProperty(r12)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            if (r12 == 0) goto L_0x003f
            r12 = r8
            goto L_0x0040
        L_0x003f:
            r12 = r6
        L_0x0040:
            java.lang.String r13 = "msgpack.universal-buffer"
            java.lang.String r14 = "false"
            java.lang.String r13 = java.lang.System.getProperty(r13, r14)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            boolean r13 = java.lang.Boolean.parseBoolean(r13)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            if (r13 != 0) goto L_0x005e
            if (r11 != 0) goto L_0x005e
            if (r12 != 0) goto L_0x005e
            int r11 = javaVersion     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            r12 = 7
            if (r11 < r12) goto L_0x005e
            if (r10 != 0) goto L_0x005f
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r10 = r7
            goto L_0x00ea
        L_0x005e:
            r6 = r8
        L_0x005f:
            if (r6 != 0) goto L_0x009e
            java.lang.Class<sun.misc.Unsafe> r10 = sun.misc.Unsafe.class
            java.lang.String r11 = "theUnsafe"
            java.lang.reflect.Field r10 = r10.getDeclaredField(r11)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            r10.setAccessible(r8)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            java.lang.Object r10 = r10.get(r7)     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            sun.misc.Unsafe r10 = (sun.misc.Unsafe) r10     // Catch:{ Exception -> 0x005a, all -> 0x001e }
            if (r10 == 0) goto L_0x0096
            int r9 = r10.arrayBaseOffset(r4)     // Catch:{ Exception -> 0x0094 }
            int r11 = r10.arrayIndexScale(r4)     // Catch:{ Exception -> 0x0094 }
            if (r11 != r8) goto L_0x007f
            goto L_0x009f
        L_0x007f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0094 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0094 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x0094 }
            r13.append(r11)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x0094 }
            r12.<init>(r5)     // Catch:{ Exception -> 0x0094 }
            throw r12     // Catch:{ Exception -> 0x0094 }
        L_0x0091:
            r5 = move-exception
            goto L_0x0129
        L_0x0094:
            r5 = move-exception
            goto L_0x00ea
        L_0x0096:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0094 }
            java.lang.String r11 = "Unsafe is unavailable"
            r5.<init>(r11)     // Catch:{ Exception -> 0x0094 }
            throw r5     // Catch:{ Exception -> 0x0094 }
        L_0x009e:
            r10 = r7
        L_0x009f:
            unsafe = r10
            ARRAY_BYTE_BASE_OFFSET = r9
            isUniversalBuffer = r6
            if (r6 == 0) goto L_0x00a8
            goto L_0x00b2
        L_0x00a8:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r5) goto L_0x00b1
            r0 = r3
        L_0x00b1:
            r2 = r0
        L_0x00b2:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x00bd
        L_0x00b8:
            mbArrConstructor = r7
            mbBBConstructor = r7
            goto L_0x011c
        L_0x00bd:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00de }
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r2, r2}     // Catch:{ Exception -> 0x00de }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x00de }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x00de }
            mbArrConstructor = r2     // Catch:{ Exception -> 0x00de }
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ Exception -> 0x00de }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x00de }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x00de }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x00de }
            goto L_0x011c
        L_0x00de:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00ea:
            java.io.PrintStream r11 = java.lang.System.err     // Catch:{ all -> 0x0091 }
            r5.printStackTrace(r11)     // Catch:{ all -> 0x0091 }
            unsafe = r10
            ARRAY_BYTE_BASE_OFFSET = r9
            isUniversalBuffer = r8
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x00fc
            goto L_0x00b8
        L_0x00fc:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x011d }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x011d }
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r2, r2}     // Catch:{ Exception -> 0x011d }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x011d }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x011d }
            mbArrConstructor = r2     // Catch:{ Exception -> 0x011d }
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ Exception -> 0x011d }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x011d }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x011d }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x011d }
        L_0x011c:
            return
        L_0x011d:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0129:
            unsafe = r10
            ARRAY_BYTE_BASE_OFFSET = r9
            isUniversalBuffer = r6
            if (r6 == 0) goto L_0x0132
            goto L_0x013c
        L_0x0132:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r6) goto L_0x013b
            r0 = r3
        L_0x013b:
            r2 = r0
        L_0x013c:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x0147
            mbArrConstructor = r7
            mbBBConstructor = r7
            goto L_0x0167
        L_0x0147:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0168 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0168 }
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r2, r2}     // Catch:{ Exception -> 0x0168 }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x0168 }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x0168 }
            mbArrConstructor = r2     // Catch:{ Exception -> 0x0168 }
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ Exception -> 0x0168 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0168 }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x0168 }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x0168 }
        L_0x0167:
            throw r5
        L_0x0168:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = (long) (ARRAY_BYTE_BASE_OFFSET + i);
        this.size = i2;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int indexOf = property.indexOf(46);
        if (indexOf != -1) {
            try {
                int parseInt = Integer.parseInt(property.substring(0, indexOf));
                return parseInt > 1 ? parseInt : Integer.parseInt(property.substring(indexOf + 1));
            } catch (NumberFormatException e) {
                e.printStackTrace(System.err);
                return 6;
            }
        } else {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e2) {
                e2.printStackTrace(System.err);
                return 6;
            }
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            } else if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            } else {
                throw new IllegalStateException(e3.getCause());
            }
        }
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Constructor<?> constructor = mbBBConstructor;
        if (constructor != null) {
            return newInstance(constructor, byteBuffer);
        }
        return new MessageBuffer(byteBuffer);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!isUniversalBuffer && !messageBuffer.hasArray()) {
            if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
                DirectBufferAccess.clean(messageBuffer.reference);
            } else {
                unsafe.freeMemory(messageBuffer.address);
            }
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, messageBuffer.address + ((long) i2), (long) i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), (long) i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            unsafe.copyMemory(array, (long) (byteBuffer.position() + ARRAY_BYTE_BASE_OFFSET), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else if (hasArray()) {
            byteBuffer.get((byte[]) this.base, i, i2);
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                unsafe.putByte(this.base, this.address + ((long) i), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, this.address + ((long) i), Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i + i2 <= size()) {
            return new MessageBuffer(this.base, this.address + ((long) i), i2);
        }
        throw new IllegalArgumentException();
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        if (hasArray()) {
            return ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2);
        }
        return DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, (long) ARRAY_BYTE_BASE_OFFSET, (long) size());
        return bArr;
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(getByte(i3))}));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= i2) {
            byteBuffer.put(sliceAsByteBuffer(i, i2));
            return;
        }
        throw new BufferOverflowException();
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        Constructor<?> constructor = mbArrConstructor;
        if (constructor != null) {
            return newInstance(constructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return new MessageBuffer(bArr, i, i2);
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position());
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
        } else if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = (long) (byteBuffer.position() + byteBuffer.arrayOffset() + ARRAY_BYTE_BASE_OFFSET);
            this.size = byteBuffer.remaining();
            this.reference = null;
        } else {
            throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
        }
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }
}
