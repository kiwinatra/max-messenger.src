package net.jpountz.lz4;

import java.io.PrintStream;

public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private LZ4Factory(java.lang.String r18) throws java.lang.ClassNotFoundException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r17.<init>()
            r2 = 18
            net.jpountz.lz4.LZ4Compressor[] r2 = new net.jpountz.lz4.LZ4Compressor[r2]
            r0.highCompressors = r2
            r0.impl = r1
            java.lang.String r3 = "net.jpountz.lz4.LZ4"
            java.lang.String r4 = "Compressor"
            java.lang.String r5 = defpackage.wj6.k(r3, r1, r4)
            java.lang.Object r5 = classInstance(r5)
            net.jpountz.lz4.LZ4Compressor r5 = (net.jpountz.lz4.LZ4Compressor) r5
            r0.fastCompressor = r5
            java.lang.String r5 = "net.jpountz.lz4.LZ4HC"
            java.lang.String r4 = defpackage.wj6.k(r5, r1, r4)
            java.lang.Object r4 = classInstance(r4)
            net.jpountz.lz4.LZ4Compressor r4 = (net.jpountz.lz4.LZ4Compressor) r4
            r0.highCompressor = r4
            java.lang.String r5 = "FastDecompressor"
            java.lang.String r5 = defpackage.wj6.k(r3, r1, r5)
            java.lang.Object r5 = classInstance(r5)
            net.jpountz.lz4.LZ4FastDecompressor r5 = (net.jpountz.lz4.LZ4FastDecompressor) r5
            r0.fastDecompressor = r5
            java.lang.String r5 = "SafeDecompressor"
            java.lang.String r1 = defpackage.wj6.k(r3, r1, r5)
            java.lang.Object r1 = classInstance(r1)
            net.jpountz.lz4.LZ4SafeDecompressor r1 = (net.jpountz.lz4.LZ4SafeDecompressor) r1
            r0.safeDecompressor = r1
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)
            r3 = 9
            r2[r3] = r4
            r2 = 1
            r4 = r2
        L_0x005d:
            r5 = 17
            if (r4 > r5) goto L_0x0078
            if (r4 != r3) goto L_0x0064
            goto L_0x0076
        L_0x0064:
            net.jpountz.lz4.LZ4Compressor[] r5 = r0.highCompressors
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object r6 = r1.newInstance(r6)
            net.jpountz.lz4.LZ4Compressor r6 = (net.jpountz.lz4.LZ4Compressor) r6
            r5[r4] = r6
        L_0x0076:
            int r4 = r4 + r2
            goto L_0x005d
        L_0x0078:
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106} // fill-array
            net.jpountz.lz4.LZ4Compressor r2 = r0.fastCompressor
            net.jpountz.lz4.LZ4Compressor r3 = r0.highCompressor
            net.jpountz.lz4.LZ4Compressor[] r2 = new net.jpountz.lz4.LZ4Compressor[]{r2, r3}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x008f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r9.next()
            net.jpountz.lz4.LZ4Compressor r2 = (net.jpountz.lz4.LZ4Compressor) r2
            r10 = 20
            int r8 = r2.maxCompressedLength(r10)
            byte[] r12 = new byte[r8]
            r4 = 0
            r7 = 0
            r3 = r1
            r5 = r10
            r6 = r12
            int r14 = r2.compress((byte[]) r3, (int) r4, (int) r5, (byte[]) r6, (int) r7, (int) r8)
            byte[] r2 = new byte[r10]
            net.jpountz.lz4.LZ4FastDecompressor r3 = r0.fastDecompressor
            r5 = 0
            r4 = r12
            r6 = r2
            r8 = r10
            r3.decompress((byte[]) r4, (int) r5, (byte[]) r6, (int) r7, (int) r8)
            boolean r3 = java.util.Arrays.equals(r1, r2)
            if (r3 == 0) goto L_0x00da
            r3 = 0
            java.util.Arrays.fill(r2, r3)
            net.jpountz.lz4.LZ4SafeDecompressor r11 = r0.safeDecompressor
            r13 = 0
            r16 = 0
            r15 = r2
            int r3 = r11.decompress(r12, r13, r14, r15, r16)
            if (r3 != r10) goto L_0x00d4
            boolean r2 = java.util.Arrays.equals(r1, r2)
            if (r2 == 0) goto L_0x00d4
            goto L_0x008f
        L_0x00d4:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00da:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4Factory.<init>(java.lang.String):void");
    }

    private static <T> T classInstance(String str) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static LZ4Factory fastestInstance() {
        boolean z;
        synchronized (l5a.class) {
            z = l5a.a;
        }
        if (!z && l5a.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!w0g.b) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        printStream.println("Fastest instance is " + fastestInstance());
        printStream.println("Fastest Java instance is " + fastestJavaInstance());
    }

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (NATIVE_INSTANCE == null) {
                    NATIVE_INSTANCE = instance("JNI");
                }
                lZ4Factory = NATIVE_INSTANCE;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (JAVA_SAFE_INSTANCE == null) {
                    JAVA_SAFE_INSTANCE = instance("JavaSafe");
                }
                lZ4Factory = JAVA_SAFE_INSTANCE;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (JAVA_UNSAFE_INSTANCE == null) {
                    JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
                }
                lZ4Factory = JAVA_UNSAFE_INSTANCE;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return lZ4Factory;
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public String toString() {
        return "LZ4Factory:" + this.impl;
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.highCompressors[i];
    }
}
