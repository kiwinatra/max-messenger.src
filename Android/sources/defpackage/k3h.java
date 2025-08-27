package defpackage;

import java.security.AccessController;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: k3h  reason: default package */
public abstract class k3h {
    public static final Unsafe a;
    public static final Class b = Memory.class;
    public static final j3h c;
    public static final boolean d;
    public static final boolean e;
    public static final long f = ((long) u(byte[].class));
    public static final boolean g;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r0.getType() == java.lang.Long.TYPE) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0159 A[SYNTHETIC, Splitter:B:46:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0182  */
    static {
        /*
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            sun.misc.Unsafe r0 = j()
            a = r0
            int r2 = defpackage.czg.a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = s(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = s(r4)
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            r3 = 0
            goto L_0x002d
        L_0x001e:
            if (r3 == 0) goto L_0x0026
            i3h r3 = new i3h
            r3.<init>(r0)
            goto L_0x002d
        L_0x0026:
            if (r4 == 0) goto L_0x001c
            h3h r3 = new h3h
            r3.<init>(r0)
        L_0x002d:
            c = r3
            java.lang.String r4 = "logMissingMethod"
            java.lang.String r6 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r7 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.Class<k3h> r8 = defpackage.k3h.class
            java.lang.String r9 = "address"
            java.lang.String r10 = "effectiveDirectAddress"
            java.lang.Class<java.nio.Buffer> r11 = java.nio.Buffer.class
            java.lang.String r12 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r13 = java.lang.reflect.Field.class
            java.lang.String r14 = "objectFieldOffset"
            r15 = 1
            r16 = 0
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r3 != 0) goto L_0x004d
        L_0x004a:
            r0 = r16
            goto L_0x0099
        L_0x004d:
            java.lang.Object r0 = r3.a
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0082 }
            java.lang.Class[] r3 = new java.lang.Class[]{r13}     // Catch:{ all -> 0x0082 }
            r0.getMethod(r14, r3)     // Catch:{ all -> 0x0082 }
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r2}     // Catch:{ all -> 0x0082 }
            r0.getMethod(r12, r2)     // Catch:{ all -> 0x0082 }
            java.lang.reflect.Field r0 = r11.getDeclaredField(r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 != 0) goto L_0x007d
            java.lang.reflect.Field r0 = r11.getDeclaredField(r9)     // Catch:{ all -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 == 0) goto L_0x007c
            java.lang.Class r2 = r0.getType()     // Catch:{ all -> 0x0082 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0082 }
            if (r2 != r3) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0080
            goto L_0x004a
        L_0x0080:
            r0 = r15
            goto L_0x0099
        L_0x0082:
            r0 = move-exception
            java.lang.String r2 = r8.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r7.concat(r0)
            r2.logp(r3, r6, r4, r0)
            goto L_0x004a
        L_0x0099:
            d = r0
            j3h r0 = c
            if (r0 != 0) goto L_0x00a2
        L_0x009f:
            r0 = r16
            goto L_0x0114
        L_0x00a2:
            java.lang.Object r0 = r0.a
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r2 = new java.lang.Class[]{r13}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r14, r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r3 = new java.lang.Class[]{r1}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r2, r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = "arrayIndexScale"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "getInt"
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r3 = new java.lang.Class[]{r5, r2}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "putInt"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r3 = new java.lang.Class[]{r5, r2, r3}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r1 = new java.lang.Class[]{r5, r2}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r12, r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r3 = new java.lang.Class[]{r5, r2, r2}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r5, r2}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r2, r5}     // Catch:{ all -> 0x00fd }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x00fd }
            r0 = r15
            goto L_0x0114
        L_0x00fd:
            r0 = move-exception
            java.lang.String r1 = r8.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r7.concat(r0)
            r1.logp(r2, r6, r4, r0)
            goto L_0x009f
        L_0x0114:
            e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = u(r0)
            long r0 = (long) r0
            f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            u(r0)
            a(r0)
            java.lang.Class<int[]> r0 = int[].class
            u(r0)
            a(r0)
            java.lang.Class<long[]> r0 = long[].class
            u(r0)
            a(r0)
            java.lang.Class<float[]> r0 = float[].class
            u(r0)
            a(r0)
            java.lang.Class<double[]> r0 = double[].class
            u(r0)
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            u(r0)
            a(r0)
            int r0 = defpackage.czg.a
            java.lang.reflect.Field r0 = r11.getDeclaredField(r10)     // Catch:{ all -> 0x0156 }
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            if (r0 != 0) goto L_0x0169
            java.lang.reflect.Field r0 = r11.getDeclaredField(r9)     // Catch:{ all -> 0x015e }
            goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            if (r0 == 0) goto L_0x016b
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L_0x016b
        L_0x0169:
            r5 = r0
            goto L_0x016c
        L_0x016b:
            r5 = 0
        L_0x016c:
            if (r5 == 0) goto L_0x0179
            j3h r0 = c
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r0.a
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            r0.objectFieldOffset(r5)
        L_0x0179:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r15 = r16
        L_0x0184:
            g = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3h.<clinit>():void");
    }

    public static void a(Class cls) {
        if (e) {
            ((Unsafe) c.a).arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b2) {
        j3h j3h = c;
        long j2 = -4 & j;
        int i = ((Unsafe) j3h.a).getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        ((Unsafe) j3h.a).putInt(obj, j2, ((255 & b2) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        j3h j3h = c;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        ((Unsafe) j3h.a).putInt(obj, j2, ((255 & b2) << i) | (((Unsafe) j3h.a).getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static double d(long j, Object obj) {
        return c.g1(j, obj);
    }

    public static float e(long j, Object obj) {
        return c.h1(j, obj);
    }

    public static int f(long j, Object obj) {
        return ((Unsafe) c.a).getInt(obj, j);
    }

    public static long g(long j, Object obj) {
        return ((Unsafe) c.a).getLong(obj, j);
    }

    public static Object h(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object i(long j, Object obj) {
        return ((Unsafe) c.a).getObject(obj, j);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g3h());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, boolean z) {
        c.i1(obj, j, z);
    }

    public static void l(Object obj, long j, double d2) {
        c.k1(obj, j, d2);
    }

    public static void m(Object obj, long j, float f2) {
        c.l1(obj, j, f2);
    }

    public static void n(int i, long j, Object obj) {
        ((Unsafe) c.a).putInt(obj, j, i);
    }

    public static void o(Object obj, long j, long j2) {
        ((Unsafe) c.a).putLong(obj, j, j2);
    }

    public static void p(long j, Object obj, Object obj2) {
        ((Unsafe) c.a).putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j, Object obj) {
        return ((byte) ((((Unsafe) c.a).getInt(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j, Object obj) {
        return ((byte) ((((Unsafe) c.a).getInt(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean s(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = czg.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean t(long j, Object obj) {
        return c.m1(j, obj);
    }

    public static int u(Class cls) {
        if (e) {
            return ((Unsafe) c.a).arrayBaseOffset(cls);
        }
        return -1;
    }
}
