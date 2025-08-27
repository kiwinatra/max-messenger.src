package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

public final class Status extends h3 implements u4d, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new ivg(25);
    public static final Status v = new Status(0, (String) null, (PendingIntent) null, (bi3) null);
    public static final Status w = new Status(14, (String) null, (PendingIntent) null, (bi3) null);
    public static final Status x = new Status(8, (String) null, (PendingIntent) null, (bi3) null);
    public static final Status y = new Status(15, (String) null, (PendingIntent) null, (bi3) null);
    public static final Status z = new Status(16, (String) null, (PendingIntent) null, (bi3) null);
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final bi3 o;

    public Status(int i, String str, PendingIntent pendingIntent, bi3 bi3) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.o = bi3;
    }

    public final Status a() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x002e
            java.lang.String r0 = r3.b
            java.lang.String r2 = r4.b
            boolean r0 = defpackage.kne.o(r0, r2)
            if (r0 == 0) goto L_0x002e
            android.app.PendingIntent r0 = r3.c
            android.app.PendingIntent r2 = r4.c
            boolean r0 = defpackage.kne.o(r0, r2)
            if (r0 == 0) goto L_0x002e
            bi3 r3 = r3.o
            bi3 r4 = r4.o
            boolean r3 = defpackage.kne.o(r3, r4)
            if (r3 == 0) goto L_0x002e
            r3 = 1
            return r3
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o});
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        String str = this.b;
        if (str == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    str = "INTERRUPTED";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = wj6.h(i, "unknown status code: ");
                    break;
            }
        }
        fjVar.k(str, "statusCode");
        fjVar.k(this.c, "resolution");
        return fjVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.w0(parcel, 2, this.b);
        tf6.u0(parcel, 3, this.c, i);
        tf6.u0(parcel, 4, this.o, i);
        tf6.E0(parcel, B0);
    }
}
