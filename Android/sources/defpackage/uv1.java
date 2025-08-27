package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: uv1  reason: default package */
public final class uv1 {
    public static final Object l = new Object();
    public static final SparseArray m = new SparseArray();
    public final p7d a = new p7d();
    public final Object b = new Object();
    public final vv1 c;
    public final Executor d;
    public final Handler e;
    public vf2 f;
    public ox0 g;
    public xs1 h;
    public final a5d i;
    public final go1 j;
    public int k;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uv1(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            p7d r0 = new p7d
            r0.<init>()
            r7.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.b = r0
            r0 = 1
            r7.k = r0
            android.content.Context r1 = defpackage.hd8.w(r8)
        L_0x0018:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            r3 = 0
            if (r2 == 0) goto L_0x002b
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L_0x0024
            android.app.Application r1 = (android.app.Application) r1
            goto L_0x002b
        L_0x0024:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0018
        L_0x002b:
            r1 = 640(0x280, float:8.97E-43)
            android.content.Context r2 = defpackage.hd8.w(r8)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r6 = androidx.camera.core.impl.MetadataHolderService.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            if (r2 == 0) goto L_0x004b
            java.lang.String r4 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            goto L_0x004c
        L_0x004b:
            r2 = r3
        L_0x004c:
            if (r2 != 0) goto L_0x0050
        L_0x004e:
            r2 = r3
            goto L_0x005e
        L_0x0050:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
            androidx.camera.camera2.Camera2Config$DefaultProvider r2 = (androidx.camera.camera2.Camera2Config$DefaultProvider) r2     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x004e }
        L_0x005e:
            if (r2 == 0) goto L_0x01b5
            vv1 r2 = r2.getCameraXConfig()
            r7.c = r2
            la0 r4 = defpackage.vv1.Y
            c5b r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.n(r4)     // Catch:{ IllegalArgumentException -> 0x0072 }
            goto L_0x0073
        L_0x0072:
            r2 = r3
        L_0x0073:
            jcc r2 = (defpackage.jcc) r2
            if (r2 == 0) goto L_0x007b
            r2.toString()
            goto L_0x0098
        L_0x007b:
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.Class<mcc> r5 = defpackage.mcc.class
            r4.<init>(r8, r5)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.ServiceInfo r1 = r2.getServiceInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x008e }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x008e }
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            r2 = r3
            goto L_0x0095
        L_0x0090:
            jcc r1 = defpackage.ncc.a(r8, r1)     // Catch:{ NameNotFoundException -> 0x008e }
            r2 = r1
        L_0x0095:
            java.util.Objects.toString(r2)
        L_0x0098:
            if (r2 != 0) goto L_0x009f
            jcc r2 = defpackage.lcc.b
            java.util.Objects.toString(r2)
        L_0x009f:
            lcc r1 = defpackage.lcc.c
            bs6 r1 = r1.a
            r1.s(r2)
            vv1 r1 = r7.c
            la0 r2 = defpackage.vv1.v
            c5b r1 = r1.a
            r1.getClass()
            java.lang.Object r1 = r1.n(r2)     // Catch:{ IllegalArgumentException -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
            r1 = r3
        L_0x00b5:
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            vv1 r2 = r7.c
            la0 r4 = defpackage.vv1.w
            c5b r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.n(r4)     // Catch:{ IllegalArgumentException -> 0x00c5 }
            goto L_0x00c6
        L_0x00c5:
            r2 = r3
        L_0x00c6:
            android.os.Handler r2 = (android.os.Handler) r2
            if (r1 != 0) goto L_0x00cf
            ju1 r1 = new ju1
            r1.<init>()
        L_0x00cf:
            r7.d = r1
            if (r2 != 0) goto L_0x00ea
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "CameraX-scheduler"
            r4 = 10
            r1.<init>(r2, r4)
            r1.start()
            android.os.Looper r1 = r1.getLooper()
            android.os.Handler r1 = android.os.Handler.createAsync(r1)
            r7.e = r1
            goto L_0x00ec
        L_0x00ea:
            r7.e = r2
        L_0x00ec:
            vv1 r1 = r7.c
            la0 r2 = defpackage.vv1.x
            java.lang.Object r1 = r1.k(r2, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = l
            monitor-enter(r2)
            if (r1 != 0) goto L_0x0100
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x0162
        L_0x00fd:
            r7 = move-exception
            goto L_0x01b3
        L_0x0100:
            int r3 = r1.intValue()     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "minLogLevel"
            r5 = 6
            r6 = 3
            defpackage.bs0.o(r3, r4, r6, r5)     // Catch:{ all -> 0x00fd }
            android.util.SparseArray r3 = m     // Catch:{ all -> 0x00fd }
            int r4 = r1.intValue()     // Catch:{ all -> 0x00fd }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x00fd }
            if (r4 == 0) goto L_0x0127
            int r4 = r1.intValue()     // Catch:{ all -> 0x00fd }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x00fd }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00fd }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00fd }
            int r4 = r4 + r0
            goto L_0x0128
        L_0x0127:
            r4 = r0
        L_0x0128:
            int r1 = r1.intValue()     // Catch:{ all -> 0x00fd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00fd }
            r3.put(r1, r4)     // Catch:{ all -> 0x00fd }
            int r1 = r3.size()     // Catch:{ all -> 0x00fd }
            if (r1 != 0) goto L_0x013c
            defpackage.o54.m = r6     // Catch:{ all -> 0x00fd }
            goto L_0x0161
        L_0x013c:
            java.lang.Object r1 = r3.get(r6)     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x0145
            defpackage.o54.m = r6     // Catch:{ all -> 0x00fd }
            goto L_0x0161
        L_0x0145:
            r1 = 4
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x00fd }
            if (r4 == 0) goto L_0x014f
            defpackage.o54.m = r1     // Catch:{ all -> 0x00fd }
            goto L_0x0161
        L_0x014f:
            r1 = 5
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x00fd }
            if (r4 == 0) goto L_0x0159
            defpackage.o54.m = r1     // Catch:{ all -> 0x00fd }
            goto L_0x0161
        L_0x0159:
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x0161
            defpackage.o54.m = r5     // Catch:{ all -> 0x00fd }
        L_0x0161:
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
        L_0x0162:
            vv1 r1 = r7.c
            r1.getClass()
            la0 r2 = defpackage.vv1.X
            iv1 r3 = defpackage.a5d.a
            c5b r1 = r1.a
            r1.getClass()
            java.lang.Object r3 = r1.n(r2)     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x0174:
            a5d r3 = (defpackage.a5d) r3
            java.util.Objects.requireNonNull(r3)
            long r1 = r3.a()
            boolean r4 = r3 instanceof defpackage.iv1
            if (r4 == 0) goto L_0x0188
            iv1 r3 = (defpackage.iv1) r3
            a5d r1 = r3.c(r1)
            goto L_0x018e
        L_0x0188:
            pkf r4 = new pkf
            r4.<init>(r1, r3)
            r1 = r4
        L_0x018e:
            r7.i = r1
            java.lang.Object r1 = r7.b
            monitor-enter(r1)
            int r2 = r7.k     // Catch:{ all -> 0x01b0 }
            if (r2 != r0) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            java.lang.String r2 = "CameraX.initInternal() should only be called once per instance"
            defpackage.bs0.r(r2, r0)     // Catch:{ all -> 0x01b0 }
            r0 = 2
            r7.k = r0     // Catch:{ all -> 0x01b0 }
            ba r0 = new ba     // Catch:{ all -> 0x01b0 }
            r2 = 14
            r0.<init>(r2, r7, r8)     // Catch:{ all -> 0x01b0 }
            go1 r8 = defpackage.m5a.F(r0)     // Catch:{ all -> 0x01b0 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            r7.j = r8
            return
        L_0x01b0:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            throw r7
        L_0x01b3:
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            throw r7
        L_0x01b5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv1.<init>(android.content.Context):void");
    }
}
