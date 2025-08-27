package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

class DirectBufferAccess {
    static Constructor<?> byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method mInvokeCleaner;
    static Method memoryBlockWrapFromJni;

    /* renamed from: org.msgpack.core.buffer.DirectBufferAccess$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType[] r0 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = r0
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT_REF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x001d }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.DirectBufferAccess.AnonymousClass4.<clinit>():void");
        }
    }

    public enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = directByteBufferClass;
        r4 = java.lang.Integer.TYPE;
        r2 = r2.getDeclaredConstructor(new java.lang.Class[]{r4, r4});
        r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = java.lang.Class.forName("java.nio.MemoryBlock");
        r5 = java.lang.Integer.TYPE;
        r4 = r2.getDeclaredMethod("wrapFromJni", new java.lang.Class[]{r5, java.lang.Long.TYPE});
        r4.setAccessible(true);
        r2 = directByteBufferClass.getDeclaredConstructor(new java.lang.Class[]{r2, r5, r5});
        r5 = r4;
        r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = directByteBufferClass.getDeclaredConstructor(new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Integer.TYPE});
        r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    static {
        /*
            r0 = 1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x001e }
            java.lang.Class r2 = r1.getClass()     // Catch:{ Exception -> 0x001e }
            directByteBufferClass = r2     // Catch:{ Exception -> 0x001e }
            r3 = 0
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6}     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT_REF     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x001c:
            r5 = r3
            goto L_0x0067
        L_0x001e:
            r0 = move-exception
            goto L_0x0095
        L_0x0021:
            java.lang.Class<?> r2 = directByteBufferClass     // Catch:{ NoSuchMethodException -> 0x0032 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x0032 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0032 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5}     // Catch:{ NoSuchMethodException -> 0x0032 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0032 }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT     // Catch:{ NoSuchMethodException -> 0x0032 }
            goto L_0x001c
        L_0x0032:
            java.lang.Class<?> r2 = directByteBufferClass     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r4}     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0041 }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r4 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT     // Catch:{ NoSuchMethodException -> 0x0041 }
            goto L_0x001c
        L_0x0041:
            java.lang.String r2 = "java.nio.MemoryBlock"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x001e }
            java.lang.String r4 = "wrapFromJni"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x001e }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x001e }
            java.lang.Class[] r6 = new java.lang.Class[]{r5, r6}     // Catch:{ Exception -> 0x001e }
            java.lang.reflect.Method r4 = r2.getDeclaredMethod(r4, r6)     // Catch:{ Exception -> 0x001e }
            r4.setAccessible(r0)     // Catch:{ Exception -> 0x001e }
            java.lang.Class<?> r6 = directByteBufferClass     // Catch:{ Exception -> 0x001e }
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r5, r5}     // Catch:{ Exception -> 0x001e }
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x001e }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r5 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT     // Catch:{ Exception -> 0x001e }
            r7 = r5
            r5 = r4
            r4 = r7
        L_0x0067:
            byteBufferConstructor = r2     // Catch:{ Exception -> 0x001e }
            directBufferConstructorType = r4     // Catch:{ Exception -> 0x001e }
            memoryBlockWrapFromJni = r5     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x008d
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x001e }
            java.lang.Class<?> r2 = directByteBufferClass     // Catch:{ Exception -> 0x001e }
            java.lang.String r4 = "address"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch:{ Exception -> 0x001e }
            mGetAddress = r2     // Catch:{ Exception -> 0x001e }
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x001e }
            int r0 = org.msgpack.core.buffer.MessageBuffer.javaVersion     // Catch:{ Exception -> 0x001e }
            r2 = 8
            if (r0 > r2) goto L_0x0089
            setupCleanerJava6(r1)     // Catch:{ Exception -> 0x001e }
            goto L_0x008c
        L_0x0089:
            setupCleanerJava9(r1)     // Catch:{ Exception -> 0x001e }
        L_0x008c:
            return
        L_0x008d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x001e }
            java.lang.String r1 = "Constructor of DirectByteBuffer is not found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x001e }
            throw r0     // Catch:{ Exception -> 0x001e }
        L_0x0095:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.DirectBufferAccess.<clinit>():void");
    }

    private DirectBufferAccess() {
    }

    public static void clean(Object obj) {
        try {
            if (MessageBuffer.javaVersion <= 8) {
                mClean.invoke(mCleaner.invoke(obj, (Object[]) null), (Object[]) null);
                return;
            }
            mInvokeCleaner.invoke(MessageBuffer.unsafe, new Object[]{obj});
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, (Object[]) null)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: private */
    public static Object getCleanMethod(ByteBuffer byteBuffer, Method method) {
        try {
            Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", (Class[]) null);
            Object invoke = method.invoke(byteBuffer, (Object[]) null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(invoke, (Object[]) null);
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return e;
        }
    }

    /* access modifiers changed from: private */
    public static Object getCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", (Class[]) null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, (Object[]) null);
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return e;
        }
    }

    /* access modifiers changed from: private */
    public static Object getInvokeCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Unsafe unsafe = MessageBuffer.unsafe;
            Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", new Class[]{ByteBuffer.class});
            declaredMethod.invoke(unsafe, new Object[]{byteBuffer});
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return e;
        }
    }

    public static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    public static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            int i3 = AnonymousClass4.$SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[directBufferConstructorType.ordinal()];
            if (i3 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer});
            }
            if (i3 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)});
            }
            if (i3 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Integer.valueOf(((int) j) + i), Integer.valueOf(i2)});
            }
            if (i3 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{memoryBlockWrapFromJni.invoke((Object) null, new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)}), Integer.valueOf(i2), 0});
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static void setupCleanerJava6(final ByteBuffer byteBuffer) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public Object run() {
                return DirectBufferAccess.getCleanerMethod(byteBuffer);
            }
        });
        if (!(doPrivileged instanceof Throwable)) {
            mCleaner = (Method) doPrivileged;
            Object doPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public Object run() {
                    return DirectBufferAccess.getCleanMethod(byteBuffer, DirectBufferAccess.mCleaner);
                }
            });
            if (!(doPrivileged2 instanceof Throwable)) {
                mClean = (Method) doPrivileged2;
                return;
            }
            throw new RuntimeException((Throwable) doPrivileged2);
        }
        throw new RuntimeException((Throwable) doPrivileged);
    }

    private static void setupCleanerJava9(final ByteBuffer byteBuffer) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public Object run() {
                return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
            }
        });
        if (!(doPrivileged instanceof Throwable)) {
            mInvokeCleaner = (Method) doPrivileged;
            return;
        }
        throw new RuntimeException((Throwable) doPrivileged);
    }
}
