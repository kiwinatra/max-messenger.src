package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import kotlin.uuid.Uuid;

/* renamed from: oxd  reason: default package */
public final class oxd {
    public static final String b = Integer.toString(0, 36);
    public static final String c = Integer.toString(1, 36);
    public final nxd a;

    static {
        cs8.a("media3.session");
        int i = v0g.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oxd(android.content.Context r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r11.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.n79.k(r12, r0)
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            java.lang.String r0 = r13.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0019 }
            int r0 = r0.uid     // Catch:{ NameNotFoundException -> 0x0019 }
        L_0x0017:
            r2 = r0
            goto L_0x001b
        L_0x0019:
            r0 = -1
            goto L_0x0017
        L_0x001b:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = a(r12, r0, r13)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x0028
            r12 = 2
        L_0x0026:
            r3 = r12
            goto L_0x003b
        L_0x0028:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = a(r12, r0, r13)
            if (r0 == 0) goto L_0x0032
            r12 = 1
            goto L_0x0026
        L_0x0032:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r12 = a(r12, r0, r13)
            if (r12 == 0) goto L_0x005c
            r3 = r1
        L_0x003b:
            if (r3 == r1) goto L_0x0054
            pxd r12 = new pxd
            java.lang.String r6 = r13.getPackageName()
            java.lang.String r7 = r13.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r5 = 0
            r9 = 0
            r4 = 0
            r1 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a = r12
            goto L_0x005b
        L_0x0054:
            qxd r12 = new qxd
            r12.<init>(r2, r13)
            r11.a = r12
        L_0x005b:
            return
        L_0x005c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r13 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxd.<init>(android.content.Context, android.content.ComponentName):void");
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, Uuid.SIZE_BITS);
        if (queryIntentServices != null) {
            for (int i = 0; i < queryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = queryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        nxd nxd = this.a;
        boolean z = nxd instanceof pxd;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, nxd.g());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oxd)) {
            return false;
        }
        return this.a.equals(((oxd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public oxd(int i, int i2, int i3, String str, i67 i67, Bundle bundle) {
        str.getClass();
        IBinder asBinder = i67.asBinder();
        bundle.getClass();
        this.a = new pxd(i, 0, i2, i3, str, "", (ComponentName) null, asBinder, bundle);
    }
}
