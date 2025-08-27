package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l3d  reason: default package */
public final class l3d implements Parcelable {
    public static final Parcelable.Creator<l3d> CREATOR = new w0b(29);
    public final int a;

    public l3d(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5.hasCapability(16) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r10) {
        /*
            r9 = this;
            int r9 = r9.a
            r0 = r9 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            r0 = r2
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            r3 = 16
            r4 = 2
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            r0 = r1
            goto L_0x0051
        L_0x0012:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r5 = r0.getActiveNetworkInfo()
            if (r5 == 0) goto L_0x004f
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L_0x004f
            int r5 = defpackage.v0g.a
            r6 = 24
            if (r5 >= r6) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            android.net.Network r5 = r0.getActiveNetwork()
            if (r5 != 0) goto L_0x0037
            goto L_0x004f
        L_0x0037:
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch:{ SecurityException -> 0x0043 }
            if (r5 == 0) goto L_0x004f
            boolean r5 = r5.hasCapability(r3)     // Catch:{ SecurityException -> 0x0043 }
            if (r5 == 0) goto L_0x004f
        L_0x0043:
            r5 = r9 & 2
            if (r5 == 0) goto L_0x0010
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L_0x0010
            r0 = r4
            goto L_0x0051
        L_0x004f:
            r0 = r9 & 3
        L_0x0051:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0057
            r5 = r2
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            r6 = 0
            if (r5 == 0) goto L_0x0078
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r7)
            android.content.Intent r5 = r10.registerReceiver(r6, r5)
            if (r5 != 0) goto L_0x0069
            goto L_0x0076
        L_0x0069:
            java.lang.String r7 = "status"
            r8 = -1
            int r5 = r5.getIntExtra(r7, r8)
            if (r5 == r4) goto L_0x0078
            r4 = 5
            if (r5 != r4) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r0 = r0 | 8
        L_0x0078:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x007e
            r4 = r2
            goto L_0x007f
        L_0x007e:
            r4 = r1
        L_0x007f:
            if (r4 == 0) goto L_0x00b0
            java.lang.String r4 = "power"
            java.lang.Object r4 = r10.getSystemService(r4)
            r4.getClass()
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            int r5 = defpackage.v0g.a
            r7 = 23
            if (r5 < r7) goto L_0x0097
            boolean r4 = r4.isDeviceIdleMode()
            goto L_0x00ac
        L_0x0097:
            r7 = 20
            if (r5 < r7) goto L_0x00a5
            boolean r4 = r4.isInteractive()
            if (r4 != 0) goto L_0x00a3
        L_0x00a1:
            r4 = r2
            goto L_0x00ac
        L_0x00a3:
            r4 = r1
            goto L_0x00ac
        L_0x00a5:
            boolean r4 = r4.isScreenOn()
            if (r4 != 0) goto L_0x00a3
            goto L_0x00a1
        L_0x00ac:
            if (r4 != 0) goto L_0x00b0
            r0 = r0 | 4
        L_0x00b0:
            r9 = r9 & r3
            if (r9 == 0) goto L_0x00b5
            r9 = r2
            goto L_0x00b6
        L_0x00b5:
            r9 = r1
        L_0x00b6:
            if (r9 == 0) goto L_0x00ca
            android.content.IntentFilter r9 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_LOW"
            r9.<init>(r3)
            android.content.Intent r9 = r10.registerReceiver(r6, r9)
            if (r9 != 0) goto L_0x00c6
            r1 = r2
        L_0x00c6:
            if (r1 != 0) goto L_0x00ca
            r0 = r0 | 16
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3d.a(android.content.Context):int");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l3d.class != obj.getClass()) {
            return false;
        }
        return this.a == ((l3d) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
