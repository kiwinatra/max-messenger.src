package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import java.lang.reflect.Field;

/* renamed from: cz4  reason: default package */
public final class cz4 {
    public static final wc8 b = new Object();
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static final ThreadLocal h = new ThreadLocal();
    public static final qv0 i = new qv0(11);
    public static final sx6 j = new sx6(22);
    public static o6h k;
    public static x6h l;
    public final Context a;

    public cz4(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (kne.o(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String.valueOf(declaredField.get((Object) null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: qv0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: r3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: r3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: r3} */
    /* JADX WARNING: type inference failed for: r7v0, types: [d6h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cz4 b(android.content.Context r16, defpackage.wc8 r17, java.lang.String r18) {
        /*
            r0 = r16
            r1 = r18
            java.lang.String r2 = "No acceptable module "
            java.lang.String r3 = "VersionPolicy returned invalid code:"
            android.content.Context r4 = r16.getApplicationContext()
            if (r4 == 0) goto L_0x0238
            java.lang.ThreadLocal r5 = h
            java.lang.Object r6 = r5.get()
            d6h r6 = (defpackage.d6h) r6
            d6h r7 = new d6h
            r7.<init>()
            r5.set(r7)
            qv0 r8 = i
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r10 = r9.longValue()
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0186 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0186 }
            r8.set(r14)     // Catch:{ all -> 0x0186 }
            sx6 r8 = j     // Catch:{ all -> 0x0186 }
            r14 = r17
            r3 r8 = r14.t(r0, r1, r8)     // Catch:{ all -> 0x0186 }
            int r14 = r8.a     // Catch:{ all -> 0x0186 }
            int r15 = r8.b     // Catch:{ all -> 0x0186 }
            int r12 = r8.c     // Catch:{ all -> 0x0186 }
            if (r12 == 0) goto L_0x01f1
            r13 = -1
            if (r12 != r13) goto L_0x004b
            if (r14 == 0) goto L_0x01f1
            r12 = r13
        L_0x004b:
            r14 = 1
            if (r12 != r14) goto L_0x0050
            if (r15 == 0) goto L_0x01f1
        L_0x0050:
            if (r12 != r13) goto L_0x0064
            java.lang.String r0 = "Selected local version of "
            r0.concat(r1)     // Catch:{ all -> 0x0186 }
            cz4 r0 = new cz4     // Catch:{ all -> 0x0186 }
            r0.<init>(r4)     // Catch:{ all -> 0x0186 }
        L_0x005c:
            r1 = 0
            goto L_0x01bb
        L_0x0060:
            r1 = 0
            goto L_0x021c
        L_0x0064:
            if (r12 != r14) goto L_0x01df
            r2 = 0
            java.lang.Class<cz4> r3 = defpackage.cz4.class
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            boolean r12 = e(r16)     // Catch:{ all -> 0x0172 }
            if (r12 == 0) goto L_0x0174
            java.lang.Boolean r12 = c     // Catch:{ all -> 0x0172 }
            monitor-exit(r3)     // Catch:{ all -> 0x0172 }
            if (r12 == 0) goto L_0x016a
            boolean r3 = r12.booleanValue()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r12 = 2
            if (r3 == 0) goto L_0x00fc
            java.lang.Class<cz4> r3 = defpackage.cz4.class
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            x6h r14 = l     // Catch:{ all -> 0x00f9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f9 }
            if (r14 == 0) goto L_0x00f1
            java.lang.Object r3 = r5.get()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            d6h r3 = (defpackage.d6h) r3     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r3 == 0) goto L_0x00e9
            android.database.Cursor r5 = r3.a     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r5 == 0) goto L_0x00e9
            android.content.Context r0 = r16.getApplicationContext()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            android.database.Cursor r3 = r3.a     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r13 = 0
            r5.<init>(r13)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.Class<cz4> r5 = defpackage.cz4.class
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            int r13 = f     // Catch:{ all -> 0x00e6 }
            if (r13 < r12) goto L_0x00a5
            r12 = 1
            goto L_0x00a6
        L_0x00a5:
            r12 = r2
        L_0x00a6:
            monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
            if (r12 == 0) goto L_0x00b8
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            hha r0 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            p67 r0 = r14.K0(r5, r1, r15, r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            goto L_0x00c6
        L_0x00b8:
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            hha r0 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            p67 r0 = r14.J0(r5, r1, r15, r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00c6:
            java.lang.Object r0 = defpackage.hha.M0(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r0 == 0) goto L_0x00de
            cz4 r3 = new cz4     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r3.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00d3:
            r0 = r3
            goto L_0x005c
        L_0x00d5:
            r0 = move-exception
            goto L_0x017e
        L_0x00d8:
            r0 = move-exception
            goto L_0x018b
        L_0x00db:
            r0 = move-exception
            goto L_0x018c
        L_0x00de:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "Failed to get module context"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00e9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "No result cursor"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00f1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x00fc:
            o6h r3 = f(r16)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r3 == 0) goto L_0x0162
            android.os.Parcel r13 = r3.H0()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r14 = 6
            android.os.Parcel r13 = r3.l(r13, r14)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            int r14 = r13.readInt()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r13.recycle()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r13 = 3
            if (r14 < r13) goto L_0x0136
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            d6h r5 = (defpackage.d6h) r5     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r5 == 0) goto L_0x012e
            hha r12 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r12.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            android.database.Cursor r0 = r5.a     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            p67 r0 = r3.K0(r12, r1, r15, r5)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            goto L_0x014b
        L_0x012e:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "No cached result cursor holder"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x0136:
            if (r14 != r12) goto L_0x0142
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            p67 r0 = r3.L0(r5, r1, r15)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            goto L_0x014b
        L_0x0142:
            hha r5 = new hha     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            p67 r0 = r3.J0(r5, r1, r15)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x014b:
            java.lang.Object r0 = defpackage.hha.M0(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            if (r0 == 0) goto L_0x015a
            cz4 r3 = new cz4     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            r3.<init>(r0)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            goto L_0x00d3
        L_0x015a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "Failed to load remote module."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x0162:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "Failed to create IDynamiteLoader."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x016a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r3 = "Failed to determine which loading route to use."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x0172:
            r0 = move-exception
            goto L_0x017c
        L_0x0174:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0172 }
            java.lang.String r5 = "Remote loading disabled"
            r0.<init>(r5)     // Catch:{ all -> 0x0172 }
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x017c:
            monitor-exit(r3)     // Catch:{ all -> 0x0172 }
            throw r0     // Catch:{ RemoteException -> 0x00db, DynamiteModule$LoadingException -> 0x00d8, all -> 0x00d5 }
        L_0x017e:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r3 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
            java.lang.String r5 = "Failed to load remote module."
            r3.<init>(r5, r0)     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
            throw r3     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
        L_0x0186:
            r0 = move-exception
            goto L_0x0060
        L_0x0189:
            r0 = move-exception
            goto L_0x0194
        L_0x018b:
            throw r0     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
        L_0x018c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r3 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
            java.lang.String r5 = "Failed to load remote module."
            r3.<init>(r5, r0)     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
            throw r3     // Catch:{ DynamiteModule$LoadingException -> 0x0189 }
        L_0x0194:
            r0.getMessage()     // Catch:{ all -> 0x0186 }
            int r3 = r8.a     // Catch:{ all -> 0x0186 }
            if (r3 == 0) goto L_0x01d7
            r3 r5 = new r3     // Catch:{ all -> 0x0186 }
            r5.<init>()     // Catch:{ all -> 0x0186 }
            r5.b = r2     // Catch:{ all -> 0x0186 }
            r5.a = r3     // Catch:{ all -> 0x0186 }
            if (r3 == 0) goto L_0x01aa
            r2 = -1
            r5.c = r2     // Catch:{ all -> 0x0186 }
            goto L_0x01ab
        L_0x01aa:
            r2 = -1
        L_0x01ab:
            int r3 = r5.c     // Catch:{ all -> 0x0186 }
            if (r3 != r2) goto L_0x01d7
            java.lang.String r0 = "Selected local version of "
            r0.concat(r1)     // Catch:{ all -> 0x0186 }
            cz4 r0 = new cz4     // Catch:{ all -> 0x0186 }
            r0.<init>(r4)     // Catch:{ all -> 0x0186 }
            goto L_0x005c
        L_0x01bb:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01c5
            qv0 r1 = i
            r1.remove()
            goto L_0x01ca
        L_0x01c5:
            qv0 r1 = i
            r1.set(r9)
        L_0x01ca:
            android.database.Cursor r1 = r7.a
            if (r1 == 0) goto L_0x01d1
            r1.close()
        L_0x01d1:
            java.lang.ThreadLocal r1 = h
            r1.set(r6)
            return r0
        L_0x01d7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0186 }
            throw r1     // Catch:{ all -> 0x0186 }
        L_0x01df:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            r1.<init>(r3)     // Catch:{ all -> 0x0186 }
            r1.append(r12)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0186 }
            r0.<init>(r1)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x01f1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0186 }
            int r3 = r8.a     // Catch:{ all -> 0x0186 }
            int r4 = r8.b     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            r5.<init>(r2)     // Catch:{ all -> 0x0186 }
            r5.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = " found. Local version is "
            r5.append(r1)     // Catch:{ all -> 0x0186 }
            r5.append(r3)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = " and remote version is "
            r5.append(r1)     // Catch:{ all -> 0x0186 }
            r5.append(r4)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "."
            r5.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0186 }
            r0.<init>(r1)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x021c:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0226
            qv0 r1 = i
            r1.remove()
            goto L_0x022b
        L_0x0226:
            qv0 r1 = i
            r1.set(r9)
        L_0x022b:
            android.database.Cursor r1 = r7.a
            if (r1 == 0) goto L_0x0232
            r1.close()
        L_0x0232:
            java.lang.ThreadLocal r1 = h
            r1.set(r6)
            throw r0
        L_0x0238:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.b(android.content.Context, wc8, java.lang.String):cz4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00b6 }
            qv0 r8 = i     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00b6 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x00b6 }
            long r2 = r8.longValue()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r8 = "api_force_staging"
            java.lang.String r4 = "api"
            r7 = 1
            if (r7 == r10) goto L_0x0019
            r8 = r4
        L_0x0019:
            android.net.Uri$Builder r10 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b6 }
            r10.<init>()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r10 = r10.scheme(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r10 = r10.authority(r4)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri$Builder r8 = r10.path(r8)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri$Builder r8 = r8.appendPath(r9)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r9 = "requestStartTime"
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r10)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r2 = r8.build()     // Catch:{ Exception -> 0x00b6 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00b6 }
            if (r8 == 0) goto L_0x00be
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            if (r9 == 0) goto L_0x00be
            r9 = 0
            int r10 = r8.getInt(r9)     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            if (r10 <= 0) goto L_0x00a6
            java.lang.Class<cz4> r1 = defpackage.cz4.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            r2 = 2
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0070 }
            d = r2     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "loaderVersion"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x0070 }
            if (r2 < 0) goto L_0x0072
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x0070 }
            f = r2     // Catch:{ all -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r9 = move-exception
            goto L_0x00a0
        L_0x0072:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x0070 }
            if (r2 < 0) goto L_0x0086
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0082
            r2 = r7
            goto L_0x0083
        L_0x0082:
            r2 = r9
        L_0x0083:
            e = r2     // Catch:{ all -> 0x0070 }
            goto L_0x0087
        L_0x0086:
            r2 = r9
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            java.lang.ThreadLocal r1 = h     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            d6h r1 = (defpackage.d6h) r1     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            if (r1 == 0) goto L_0x0099
            android.database.Cursor r3 = r1.a     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            if (r3 != 0) goto L_0x0099
            r1.a = r8     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            goto L_0x009a
        L_0x0099:
            r7 = r9
        L_0x009a:
            if (r7 == 0) goto L_0x009e
        L_0x009c:
            r9 = r2
            goto L_0x00a7
        L_0x009e:
            r0 = r8
            goto L_0x009c
        L_0x00a0:
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            throw r9     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
        L_0x00a2:
            r9 = move-exception
            goto L_0x00c6
        L_0x00a4:
            r9 = move-exception
            goto L_0x00c9
        L_0x00a6:
            r0 = r8
        L_0x00a7:
            if (r11 == 0) goto L_0x00b8
            if (r9 != 0) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r9 = "forcing fallback to container DynamiteLoader impl"
            r8.<init>(r9)     // Catch:{ Exception -> 0x00b6 }
            throw r8     // Catch:{ Exception -> 0x00b6 }
        L_0x00b4:
            r8 = move-exception
            goto L_0x00eb
        L_0x00b6:
            r8 = move-exception
            goto L_0x00cb
        L_0x00b8:
            if (r0 == 0) goto L_0x00bd
            r0.close()
        L_0x00bd:
            return r10
        L_0x00be:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10)     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
            throw r9     // Catch:{ Exception -> 0x00a4, all -> 0x00a2 }
        L_0x00c6:
            r0 = r8
            r8 = r9
            goto L_0x00eb
        L_0x00c9:
            r0 = r8
            r8 = r9
        L_0x00cb:
            boolean r9 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x00d0
            throw r8     // Catch:{ all -> 0x00b4 }
        L_0x00d0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = r8.getMessage()     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r11.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "V2 version check failed: "
            r11.append(r1)     // Catch:{ all -> 0x00b4 }
            r11.append(r10)     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00b4 }
            r9.<init>(r10, r8)     // Catch:{ all -> 0x00b4 }
            throw r9     // Catch:{ all -> 0x00b4 }
        L_0x00eb:
            if (r0 == 0) goto L_0x00f0
            r0.close()
        L_0x00f0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.c(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [bvg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.lang.ClassLoader r3) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            r1 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            if (r3 != 0) goto L_0x0016
            goto L_0x0029
        L_0x0016:
            android.os.IInterface r1 = r3.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            boolean r2 = r1 instanceof defpackage.x6h     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            if (r2 == 0) goto L_0x0023
            x6h r1 = (defpackage.x6h) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r3 = move-exception
            goto L_0x002c
        L_0x0023:
            x6h r1 = new x6h     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            r2 = 1
            r1.<init>(r3, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
        L_0x0029:
            l = r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0021 }
            return
        L_0x002c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.d(java.lang.ClassLoader):void");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (et6.b.b(10000000, context) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                e = true;
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [bvg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.o6h f(android.content.Context r5) {
        /*
            java.lang.Class<cz4> r0 = defpackage.cz4.class
            monitor-enter(r0)
            o6h r1 = k     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r1
        L_0x0009:
            r5 = move-exception
            goto L_0x0049
        L_0x000b:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch:{ Exception -> 0x0034 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0034 }
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x0034 }
            if (r5 != 0) goto L_0x0027
            r2 = r1
            goto L_0x003e
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch:{ Exception -> 0x0034 }
            boolean r3 = r2 instanceof defpackage.o6h     // Catch:{ Exception -> 0x0034 }
            if (r3 == 0) goto L_0x0036
            o6h r2 = (defpackage.o6h) r2     // Catch:{ Exception -> 0x0034 }
            goto L_0x003e
        L_0x0034:
            r5 = move-exception
            goto L_0x0044
        L_0x0036:
            o6h r2 = new o6h     // Catch:{ Exception -> 0x0034 }
            java.lang.String r3 = "com.google.android.gms.dynamite.IDynamiteLoader"
            r4 = 1
            r2.<init>(r5, r3, r4)     // Catch:{ Exception -> 0x0034 }
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            k = r2     // Catch:{ Exception -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r2
        L_0x0044:
            r5.getMessage()     // Catch:{ all -> 0x0009 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r1
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.f(android.content.Context):o6h");
    }
}
