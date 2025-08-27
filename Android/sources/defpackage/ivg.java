package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ivg  reason: default package */
public final class ivg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ivg(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v49, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, com.google.android.gms.maps.GoogleMapOptions] */
    /* JADX WARNING: type inference failed for: r3v57, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v58, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v88, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v58, types: [java.lang.Object, z03] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.lang.Object, com.google.android.gms.auth.api.signin.SignInAccount] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x091b;
                case 1: goto L_0x08b1;
                case 2: goto L_0x0871;
                case 3: goto L_0x0831;
                case 4: goto L_0x07c7;
                case 5: goto L_0x077e;
                case 6: goto L_0x072d;
                case 7: goto L_0x06e8;
                case 8: goto L_0x06bf;
                case 9: goto L_0x0691;
                case 10: goto L_0x0641;
                case 11: goto L_0x05f0;
                case 12: goto L_0x04c0;
                case 13: goto L_0x046e;
                case 14: goto L_0x0436;
                case 15: goto L_0x0369;
                case 16: goto L_0x0341;
                case 17: goto L_0x0307;
                case 18: goto L_0x02d1;
                case 19: goto L_0x028c;
                case 20: goto L_0x0241;
                case 21: goto L_0x01fc;
                case 22: goto L_0x01b8;
                case 23: goto L_0x019d;
                case 24: goto L_0x0158;
                case 25: goto L_0x010f;
                case 26: goto L_0x0105;
                case 27: goto L_0x008f;
                case 28: goto L_0x0057;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = defpackage.n79.Y(r46)
            java.lang.String r2 = ""
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x0012:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x003e
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 4
            if (r6 == r7) goto L_0x0039
            r7 = 7
            if (r6 == r7) goto L_0x0030
            r7 = 8
            if (r6 == r7) goto L_0x002b
            defpackage.n79.T(r1, r5)
            goto L_0x0012
        L_0x002b:
            java.lang.String r3 = defpackage.n79.u(r1, r5)
            goto L_0x0012
        L_0x0030:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r4 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = defpackage.n79.t(r1, r5, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            goto L_0x0012
        L_0x0039:
            java.lang.String r2 = defpackage.n79.u(r1, r5)
            goto L_0x0012
        L_0x003e:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.auth.api.signin.SignInAccount r0 = new com.google.android.gms.auth.api.signin.SignInAccount
            r0.<init>()
            r0.b = r4
            java.lang.String r1 = "8.3 and 8.4 SDKs require non-null email"
            defpackage.vzg.j(r2, r1)
            r0.a = r2
            java.lang.String r1 = "8.3 and 8.4 SDKs require non-null userId"
            defpackage.vzg.j(r3, r1)
            r0.c = r3
            return r0
        L_0x0057:
            int r0 = defpackage.n79.Y(r46)
            r2 = -1
            r4 = 0
            r5 = 0
        L_0x005f:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0086
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0081
            r8 = 2
            if (r7 == r8) goto L_0x007c
            r8 = 3
            if (r7 == r8) goto L_0x0077
            defpackage.n79.T(r1, r6)
            goto L_0x005f
        L_0x0077:
            long r2 = defpackage.n79.O(r1, r6)
            goto L_0x005f
        L_0x007c:
            int r4 = defpackage.n79.N(r1, r6)
            goto L_0x005f
        L_0x0081:
            java.lang.String r5 = defpackage.n79.u(r1, r6)
            goto L_0x005f
        L_0x0086:
            defpackage.n79.z(r1, r0)
            tj5 r0 = new tj5
            r0.<init>(r4, r5, r2)
            return r0
        L_0x008f:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r3
            r8 = r4
            r9 = r8
            r10 = r5
            r3 = r2
            r4 = r7
            r5 = r4
            r6 = r5
        L_0x00a0:
            int r12 = r46.dataPosition()
            if (r12 >= r0) goto L_0x00ea
            int r12 = r46.readInt()
            char r13 = (char) r12
            switch(r13) {
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00cd;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00be;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00b2;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            defpackage.n79.T(r1, r12)
            goto L_0x00a0
        L_0x00b2:
            android.os.Parcelable$Creator<mab> r3 = defpackage.mab.CREATOR
            java.util.ArrayList r3 = defpackage.n79.w(r1, r12, r3)
            goto L_0x00a0
        L_0x00b9:
            boolean r7 = defpackage.n79.I(r1, r12)
            goto L_0x00a0
        L_0x00be:
            boolean r6 = defpackage.n79.I(r1, r12)
            goto L_0x00a0
        L_0x00c3:
            float r9 = defpackage.n79.K(r1, r12)
            goto L_0x00a0
        L_0x00c8:
            int r5 = defpackage.n79.N(r1, r12)
            goto L_0x00a0
        L_0x00cd:
            int r4 = defpackage.n79.N(r1, r12)
            goto L_0x00a0
        L_0x00d2:
            float r8 = defpackage.n79.K(r1, r12)
            goto L_0x00a0
        L_0x00d7:
            r10 = 8
            defpackage.n79.b0(r1, r12, r10)
            double r10 = r46.readDouble()
            goto L_0x00a0
        L_0x00e1:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r12, r2)
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            goto L_0x00a0
        L_0x00ea:
            defpackage.n79.z(r1, r0)
            z03 r0 = new z03
            r0.<init>()
            r0.a = r2
            r0.b = r10
            r0.c = r8
            r0.o = r4
            r0.v = r5
            r0.w = r9
            r0.x = r6
            r0.y = r7
            r0.z = r3
            return r0
        L_0x0105:
            android.os.IBinder r0 = r46.readStrongBinder()
            k0h r1 = new k0h
            r1.<init>(r0)
            return r1
        L_0x010f:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x0118:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x014f
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x014a
            r8 = 2
            if (r7 == r8) goto L_0x0145
            r8 = 3
            if (r7 == r8) goto L_0x013c
            r8 = 4
            if (r7 == r8) goto L_0x0133
            defpackage.n79.T(r1, r6)
            goto L_0x0118
        L_0x0133:
            android.os.Parcelable$Creator<bi3> r4 = defpackage.bi3.CREATOR
            android.os.Parcelable r4 = defpackage.n79.t(r1, r6, r4)
            bi3 r4 = (defpackage.bi3) r4
            goto L_0x0118
        L_0x013c:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r6, r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            goto L_0x0118
        L_0x0145:
            java.lang.String r2 = defpackage.n79.u(r1, r6)
            goto L_0x0118
        L_0x014a:
            int r5 = defpackage.n79.N(r1, r6)
            goto L_0x0118
        L_0x014f:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x0158:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x0161:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0194
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x018f
            r8 = 2
            if (r7 == r8) goto L_0x018a
            r8 = 3
            if (r7 == r8) goto L_0x0181
            r8 = 4
            if (r7 == r8) goto L_0x017c
            defpackage.n79.T(r1, r6)
            goto L_0x0161
        L_0x017c:
            java.lang.String r3 = defpackage.n79.u(r1, r6)
            goto L_0x0161
        L_0x0181:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r6, r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L_0x0161
        L_0x018a:
            int r5 = defpackage.n79.N(r1, r6)
            goto L_0x0161
        L_0x018f:
            int r4 = defpackage.n79.N(r1, r6)
            goto L_0x0161
        L_0x0194:
            defpackage.n79.z(r1, r0)
            bi3 r0 = new bi3
            r0.<init>(r4, r5, r2, r3)
            return r0
        L_0x019d:
            java.lang.Class<f5d> r0 = defpackage.f5d.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            int r1 = r46.readInt()
            if (r1 == 0) goto L_0x01b1
            r1 = 1
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            bxg r2 = new bxg
            r2.<init>(r0, r1)
            return r2
        L_0x01b8:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        L_0x01c0:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x01e7
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x01e2
            r8 = 3
            if (r7 == r8) goto L_0x01dd
            r8 = 4
            if (r7 == r8) goto L_0x01d8
            defpackage.n79.T(r1, r6)
            goto L_0x01c0
        L_0x01d8:
            java.lang.Float r5 = defpackage.n79.L(r1, r6)
            goto L_0x01c0
        L_0x01dd:
            android.os.IBinder r4 = defpackage.n79.M(r1, r6)
            goto L_0x01c0
        L_0x01e2:
            int r3 = defpackage.n79.N(r1, r6)
            goto L_0x01c0
        L_0x01e7:
            defpackage.n79.z(r1, r0)
            ww1 r0 = new ww1
            if (r4 != 0) goto L_0x01ef
            goto L_0x01f8
        L_0x01ef:
            p67 r1 = defpackage.hha.L0(r4)
            y35 r2 = new y35
            r2.<init>((defpackage.p67) r1)
        L_0x01f8:
            r0.<init>(r3, r2, r5)
            return r0
        L_0x01fc:
            int r0 = defpackage.n79.Y(r46)
            r2 = -1
            r4 = 1
            r8 = r2
            r10 = r8
            r6 = r4
            r7 = r6
        L_0x0207:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0237
            int r2 = r46.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x0232
            r5 = 2
            if (r3 == r5) goto L_0x022d
            r5 = 3
            if (r3 == r5) goto L_0x0227
            r5 = 4
            if (r3 == r5) goto L_0x0221
            defpackage.n79.T(r1, r2)
            goto L_0x0207
        L_0x0221:
            long r2 = defpackage.n79.O(r1, r2)
            r10 = r2
            goto L_0x0207
        L_0x0227:
            long r2 = defpackage.n79.O(r1, r2)
            r8 = r2
            goto L_0x0207
        L_0x022d:
            int r7 = defpackage.n79.N(r1, r2)
            goto L_0x0207
        L_0x0232:
            int r6 = defpackage.n79.N(r1, r2)
            goto L_0x0207
        L_0x0237:
            defpackage.n79.z(r1, r0)
            xxg r0 = new xxg
            r5 = r0
            r5.<init>(r6, r7, r8, r10)
            return r0
        L_0x0241:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x024b:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0282
            int r2 = r46.readInt()
            char r3 = (char) r2
            r9 = 1
            if (r3 == r9) goto L_0x027d
            r9 = 2
            if (r3 == r9) goto L_0x0278
            r9 = 3
            if (r3 == r9) goto L_0x0273
            r9 = 4
            if (r3 == r9) goto L_0x026e
            r9 = 5
            if (r3 == r9) goto L_0x0269
            defpackage.n79.T(r1, r2)
            goto L_0x024b
        L_0x0269:
            int r6 = defpackage.n79.N(r1, r2)
            goto L_0x024b
        L_0x026e:
            int r5 = defpackage.n79.N(r1, r2)
            goto L_0x024b
        L_0x0273:
            boolean r8 = defpackage.n79.I(r1, r2)
            goto L_0x024b
        L_0x0278:
            boolean r7 = defpackage.n79.I(r1, r2)
            goto L_0x024b
        L_0x027d:
            int r4 = defpackage.n79.N(r1, r2)
            goto L_0x024b
        L_0x0282:
            defpackage.n79.z(r1, r0)
            c8d r0 = new c8d
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x028c:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0297:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x02c7
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x02c2;
                case 2: goto L_0x02bd;
                case 3: goto L_0x02b8;
                case 4: goto L_0x02b3;
                case 5: goto L_0x02ae;
                case 6: goto L_0x02a9;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            defpackage.n79.T(r1, r2)
            goto L_0x0297
        L_0x02a9:
            boolean r9 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02ae:
            boolean r8 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02b3:
            boolean r7 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02b8:
            boolean r6 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02bd:
            boolean r5 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02c2:
            boolean r4 = defpackage.n79.I(r1, r2)
            goto L_0x0297
        L_0x02c7:
            defpackage.n79.z(r1, r0)
            l68 r0 = new l68
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x02d1:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = r2
        L_0x02d7:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x02fe
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x02f5
            r6 = 2
            if (r5 == r6) goto L_0x02ec
            defpackage.n79.T(r1, r4)
            goto L_0x02d7
        L_0x02ec:
            android.os.Parcelable$Creator<l68> r3 = defpackage.l68.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r4, r3)
            l68 r3 = (defpackage.l68) r3
            goto L_0x02d7
        L_0x02f5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r4, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            goto L_0x02d7
        L_0x02fe:
            defpackage.n79.z(r1, r0)
            k68 r0 = new k68
            r0.<init>(r2, r3)
            return r0
        L_0x0307:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x030f:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0338
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0331
            r7 = 2
            if (r6 == r7) goto L_0x032c
            r7 = 3
            if (r6 == r7) goto L_0x0327
            defpackage.n79.T(r1, r5)
            goto L_0x030f
        L_0x0327:
            boolean r3 = defpackage.n79.I(r1, r5)
            goto L_0x030f
        L_0x032c:
            boolean r2 = defpackage.n79.I(r1, r5)
            goto L_0x030f
        L_0x0331:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r4 = com.google.android.gms.location.LocationRequest.CREATOR
            java.util.ArrayList r4 = defpackage.n79.w(r1, r5, r4)
            goto L_0x030f
        L_0x0338:
            defpackage.n79.z(r1, r0)
            j68 r0 = new j68
            r0.<init>(r4, r2, r3)
            return r0
        L_0x0341:
            int r0 = defpackage.n79.Y(r46)
            java.util.List r2 = com.google.android.gms.location.LocationResult.b
        L_0x0347:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0360
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0359
            defpackage.n79.T(r1, r3)
            goto L_0x0347
        L_0x0359:
            android.os.Parcelable$Creator r2 = android.location.Location.CREATOR
            java.util.ArrayList r2 = defpackage.n79.w(r1, r3, r2)
            goto L_0x0347
        L_0x0360:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.location.LocationResult r0 = new com.google.android.gms.location.LocationResult
            r0.<init>(r2)
            return r0
        L_0x0369:
            int r0 = defpackage.n79.Y(r46)
            android.os.WorkSource r2 = new android.os.WorkSource
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = -1
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r13 = 600000(0x927c0, double:2.964394E-318)
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 102(0x66, float:1.43E-43)
            r38 = r2
            r39 = r3
            r32 = r4
            r35 = r32
            r36 = r35
            r37 = r36
            r33 = r5
            r31 = r7
            r30 = r8
            r26 = r9
            r28 = r26
            r24 = r11
            r22 = r13
            r20 = r15
            r19 = r17
        L_0x03a7:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x042b
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0423;
                case 2: goto L_0x041c;
                case 3: goto L_0x0415;
                case 4: goto L_0x03b5;
                case 5: goto L_0x040e;
                case 6: goto L_0x0407;
                case 7: goto L_0x0400;
                case 8: goto L_0x03f9;
                case 9: goto L_0x03f2;
                case 10: goto L_0x03eb;
                case 11: goto L_0x03e4;
                case 12: goto L_0x03dd;
                case 13: goto L_0x03d6;
                case 14: goto L_0x03b5;
                case 15: goto L_0x03cf;
                case 16: goto L_0x03c4;
                case 17: goto L_0x03b9;
                default: goto L_0x03b5;
            }
        L_0x03b5:
            defpackage.n79.T(r1, r2)
            goto L_0x03a7
        L_0x03b9:
            android.os.Parcelable$Creator<o1h> r3 = defpackage.o1h.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            o1h r2 = (defpackage.o1h) r2
            r39 = r2
            goto L_0x03a7
        L_0x03c4:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            android.os.WorkSource r2 = (android.os.WorkSource) r2
            r38 = r2
            goto L_0x03a7
        L_0x03cf:
            boolean r2 = defpackage.n79.I(r1, r2)
            r37 = r2
            goto L_0x03a7
        L_0x03d6:
            int r2 = defpackage.n79.N(r1, r2)
            r36 = r2
            goto L_0x03a7
        L_0x03dd:
            int r2 = defpackage.n79.N(r1, r2)
            r35 = r2
            goto L_0x03a7
        L_0x03e4:
            long r2 = defpackage.n79.O(r1, r2)
            r33 = r2
            goto L_0x03a7
        L_0x03eb:
            long r2 = defpackage.n79.O(r1, r2)
            r28 = r2
            goto L_0x03a7
        L_0x03f2:
            boolean r2 = defpackage.n79.I(r1, r2)
            r32 = r2
            goto L_0x03a7
        L_0x03f9:
            long r2 = defpackage.n79.O(r1, r2)
            r24 = r2
            goto L_0x03a7
        L_0x0400:
            float r2 = defpackage.n79.K(r1, r2)
            r31 = r2
            goto L_0x03a7
        L_0x0407:
            int r2 = defpackage.n79.N(r1, r2)
            r30 = r2
            goto L_0x03a7
        L_0x040e:
            long r2 = defpackage.n79.O(r1, r2)
            r26 = r2
            goto L_0x03a7
        L_0x0415:
            long r2 = defpackage.n79.O(r1, r2)
            r22 = r2
            goto L_0x03a7
        L_0x041c:
            long r2 = defpackage.n79.O(r1, r2)
            r20 = r2
            goto L_0x03a7
        L_0x0423:
            int r2 = defpackage.n79.N(r1, r2)
            r19 = r2
            goto L_0x03a7
        L_0x042b:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.location.LocationRequest r0 = new com.google.android.gms.location.LocationRequest
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r35, r36, r37, r38, r39)
            return r0
        L_0x0436:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r4 = 0
        L_0x043d:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0465
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x045c
            r7 = 3
            if (r6 == r7) goto L_0x0452
            defpackage.n79.T(r1, r5)
            goto L_0x043d
        L_0x0452:
            r2 = 8
            defpackage.n79.b0(r1, r5, r2)
            double r2 = r46.readDouble()
            goto L_0x043d
        L_0x045c:
            android.os.Parcelable$Creator<gye> r4 = defpackage.gye.CREATOR
            android.os.Parcelable r4 = defpackage.n79.t(r1, r5, r4)
            gye r4 = (defpackage.gye) r4
            goto L_0x043d
        L_0x0465:
            defpackage.n79.z(r1, r0)
            kye r0 = new kye
            r0.<init>(r4, r2)
            return r0
        L_0x046e:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r2
            r7 = r3
            r8 = r7
            r9 = r8
            r6 = r4
        L_0x047a:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x04b6
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 2
            if (r3 == r4) goto L_0x04b1
            r4 = 3
            if (r3 == r4) goto L_0x04ac
            r4 = 4
            if (r3 == r4) goto L_0x04a7
            r4 = 5
            if (r3 == r4) goto L_0x04a2
            r4 = 6
            if (r3 == r4) goto L_0x0498
            defpackage.n79.T(r1, r2)
            goto L_0x047a
        L_0x0498:
            android.os.Parcelable$Creator<yie> r3 = defpackage.yie.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r10 = r2
            yie r10 = (defpackage.yie) r10
            goto L_0x047a
        L_0x04a2:
            boolean r9 = defpackage.n79.I(r1, r2)
            goto L_0x047a
        L_0x04a7:
            int r8 = defpackage.n79.N(r1, r2)
            goto L_0x047a
        L_0x04ac:
            int r7 = defpackage.n79.N(r1, r2)
            goto L_0x047a
        L_0x04b1:
            float r6 = defpackage.n79.K(r1, r2)
            goto L_0x047a
        L_0x04b6:
            defpackage.n79.z(r1, r0)
            gye r0 = new gye
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x04c0:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r5 = r2
            r6 = -1
            r7 = -1
            r8 = 0
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
        L_0x04e0:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0577
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 2: goto L_0x0571;
                case 3: goto L_0x056b;
                case 4: goto L_0x0565;
                case 5: goto L_0x055a;
                case 6: goto L_0x0555;
                case 7: goto L_0x0550;
                case 8: goto L_0x054b;
                case 9: goto L_0x0546;
                case 10: goto L_0x0541;
                case 11: goto L_0x053c;
                case 12: goto L_0x0537;
                case 13: goto L_0x04ee;
                case 14: goto L_0x0532;
                case 15: goto L_0x052d;
                case 16: goto L_0x0528;
                case 17: goto L_0x0523;
                case 18: goto L_0x0518;
                case 19: goto L_0x0513;
                case 20: goto L_0x04fc;
                case 21: goto L_0x04f7;
                case 22: goto L_0x04ee;
                case 23: goto L_0x04f2;
                default: goto L_0x04ee;
            }
        L_0x04ee:
            defpackage.n79.T(r1, r3)
            goto L_0x04e0
        L_0x04f2:
            int r5 = defpackage.n79.N(r1, r3)
            goto L_0x04e0
        L_0x04f7:
            java.lang.String r44 = defpackage.n79.u(r1, r3)
            goto L_0x04e0
        L_0x04fc:
            int r3 = defpackage.n79.P(r1, r3)
            if (r3 != 0) goto L_0x0505
            r43 = 0
            goto L_0x04e0
        L_0x0505:
            defpackage.n79.a0(r1, r3)
            int r3 = r46.readInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r43 = r3
            goto L_0x04e0
        L_0x0513:
            byte r18 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0518:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r4 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r3, r4)
            r42 = r3
            com.google.android.gms.maps.model.LatLngBounds r42 = (com.google.android.gms.maps.model.LatLngBounds) r42
            goto L_0x04e0
        L_0x0523:
            java.lang.Float r41 = defpackage.n79.L(r1, r3)
            goto L_0x04e0
        L_0x0528:
            java.lang.Float r40 = defpackage.n79.L(r1, r3)
            goto L_0x04e0
        L_0x052d:
            byte r17 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0532:
            byte r16 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0537:
            byte r15 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x053c:
            byte r14 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0541:
            byte r13 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0546:
            byte r12 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x054b:
            byte r11 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0550:
            byte r10 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0555:
            byte r9 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x055a:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r4 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r3, r4)
            r8 = r3
            com.google.android.gms.maps.model.CameraPosition r8 = (com.google.android.gms.maps.model.CameraPosition) r8
            goto L_0x04e0
        L_0x0565:
            int r2 = defpackage.n79.N(r1, r3)
            goto L_0x04e0
        L_0x056b:
            byte r7 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0571:
            byte r6 = defpackage.n79.J(r1, r3)
            goto L_0x04e0
        L_0x0577:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r0.<init>()
            r1 = -1
            r0.c = r1
            r1 = 0
            r0.w0 = r1
            r0.x0 = r1
            r0.y0 = r1
            r0.A0 = r1
            r0.B0 = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r6)
            r0.a = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r7)
            r0.b = r1
            r0.c = r2
            r0.o = r8
            java.lang.Boolean r1 = defpackage.cvg.U(r9)
            r0.v = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r10)
            r0.w = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r11)
            r0.x = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r12)
            r0.y = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r13)
            r0.z = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r14)
            r0.X = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r15)
            r0.Y = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r16)
            r0.Z = r1
            java.lang.Boolean r1 = defpackage.cvg.U(r17)
            r0.v0 = r1
            r3 = r40
            r0.w0 = r3
            r3 = r41
            r0.x0 = r3
            r3 = r42
            r0.y0 = r3
            java.lang.Boolean r1 = defpackage.cvg.U(r18)
            r0.z0 = r1
            r3 = r43
            r0.A0 = r3
            r3 = r44
            r0.B0 = r3
            r0.C0 = r5
            return r0
        L_0x05f0:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r13 = r2
            r11 = r3
            r9 = r5
            r10 = r9
            r8 = r6
        L_0x05ff:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0637
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0631;
                case 2: goto L_0x062b;
                case 3: goto L_0x0625;
                case 4: goto L_0x061f;
                case 5: goto L_0x0615;
                case 6: goto L_0x0611;
                default: goto L_0x060d;
            }
        L_0x060d:
            defpackage.n79.T(r1, r2)
            goto L_0x05ff
        L_0x0611:
            defpackage.n79.I(r1, r2)
            goto L_0x05ff
        L_0x0615:
            android.os.Parcelable$Creator<xxg> r3 = defpackage.xxg.CREATOR
            java.lang.Object[] r2 = defpackage.n79.v(r1, r2, r3)
            xxg[] r2 = (defpackage.xxg[]) r2
            r13 = r2
            goto L_0x05ff
        L_0x061f:
            int r2 = defpackage.n79.N(r1, r2)
            r8 = r2
            goto L_0x05ff
        L_0x0625:
            long r2 = defpackage.n79.O(r1, r2)
            r11 = r2
            goto L_0x05ff
        L_0x062b:
            int r2 = defpackage.n79.N(r1, r2)
            r10 = r2
            goto L_0x05ff
        L_0x0631:
            int r2 = defpackage.n79.N(r1, r2)
            r9 = r2
            goto L_0x05ff
        L_0x0637:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.location.LocationAvailability r0 = new com.google.android.gms.location.LocationAvailability
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13)
            return r0
        L_0x0641:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = r2
            r9 = r3
            r10 = r9
            r7 = r4
        L_0x0650:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0687
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0681
            r4 = 2
            if (r3 == r4) goto L_0x067b
            r4 = 3
            if (r3 == r4) goto L_0x0675
            r4 = 5
            if (r3 == r4) goto L_0x066b
            defpackage.n79.T(r1, r2)
            goto L_0x0650
        L_0x066b:
            android.os.Parcelable$Creator<o1h> r3 = defpackage.o1h.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            o1h r2 = (defpackage.o1h) r2
            r11 = r2
            goto L_0x0650
        L_0x0675:
            boolean r2 = defpackage.n79.I(r1, r2)
            r10 = r2
            goto L_0x0650
        L_0x067b:
            int r2 = defpackage.n79.N(r1, r2)
            r9 = r2
            goto L_0x0650
        L_0x0681:
            long r2 = defpackage.n79.O(r1, r2)
            r7 = r2
            goto L_0x0650
        L_0x0687:
            defpackage.n79.z(r1, r0)
            vr7 r0 = new vr7
            r6 = r0
            r6.<init>(r7, r9, r10, r11)
            return r0
        L_0x0691:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
        L_0x0697:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x06b6
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x06b1
            r6 = 2
            if (r5 == r6) goto L_0x06ac
            defpackage.n79.T(r1, r4)
            goto L_0x0697
        L_0x06ac:
            java.lang.String r2 = defpackage.n79.u(r1, r4)
            goto L_0x0697
        L_0x06b1:
            int r3 = defpackage.n79.N(r1, r4)
            goto L_0x0697
        L_0x06b6:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r3, r2)
            return r0
        L_0x06bf:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
        L_0x06c4:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x06df
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x06d6
            defpackage.n79.T(r1, r3)
            goto L_0x06c4
        L_0x06d6:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r3, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x06c4
        L_0x06df:
            defpackage.n79.z(r1, r0)
            b43 r0 = new b43
            r0.<init>(r2)
            return r0
        L_0x06e8:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x06f1:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0724
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x071b
            r8 = 3
            if (r7 == r8) goto L_0x0716
            r8 = 4
            if (r7 == r8) goto L_0x0711
            r8 = 5
            if (r7 == r8) goto L_0x070c
            defpackage.n79.T(r1, r6)
            goto L_0x06f1
        L_0x070c:
            float r4 = defpackage.n79.K(r1, r6)
            goto L_0x06f1
        L_0x0711:
            float r3 = defpackage.n79.K(r1, r6)
            goto L_0x06f1
        L_0x0716:
            float r2 = defpackage.n79.K(r1, r6)
            goto L_0x06f1
        L_0x071b:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r5 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r5 = defpackage.n79.t(r1, r6, r5)
            com.google.android.gms.maps.model.LatLng r5 = (com.google.android.gms.maps.model.LatLng) r5
            goto L_0x06f1
        L_0x0724:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = new com.google.android.gms.maps.model.CameraPosition
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x072d:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r9 = r8
            r6 = r3
            r7 = r6
        L_0x0738:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0774
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x076f
            r4 = 2
            if (r3 == r4) goto L_0x076a
            r4 = 3
            if (r3 == r4) goto L_0x0760
            r4 = 4
            if (r3 == r4) goto L_0x075b
            r4 = 5
            if (r3 == r4) goto L_0x0756
            defpackage.n79.T(r1, r2)
            goto L_0x0738
        L_0x0756:
            boolean r9 = defpackage.n79.I(r1, r2)
            goto L_0x0738
        L_0x075b:
            boolean r8 = defpackage.n79.I(r1, r2)
            goto L_0x0738
        L_0x0760:
            android.os.Parcelable$Creator<bi3> r3 = defpackage.bi3.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r7 = r2
            bi3 r7 = (defpackage.bi3) r7
            goto L_0x0738
        L_0x076a:
            android.os.IBinder r6 = defpackage.n79.M(r1, r2)
            goto L_0x0738
        L_0x076f:
            int r5 = defpackage.n79.N(r1, r2)
            goto L_0x0738
        L_0x0774:
            defpackage.n79.z(r1, r0)
            xwg r0 = new xwg
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x077e:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x0787:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x07be
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x07b9
            r8 = 2
            if (r7 == r8) goto L_0x07b0
            r8 = 3
            if (r7 == r8) goto L_0x07ab
            r8 = 4
            if (r7 == r8) goto L_0x07a2
            defpackage.n79.T(r1, r6)
            goto L_0x0787
        L_0x07a2:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r6, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            goto L_0x0787
        L_0x07ab:
            int r5 = defpackage.n79.N(r1, r6)
            goto L_0x0787
        L_0x07b0:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r6, r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            goto L_0x0787
        L_0x07b9:
            int r4 = defpackage.n79.N(r1, r6)
            goto L_0x0787
        L_0x07be:
            defpackage.n79.z(r1, r0)
            wwg r0 = new wwg
            r0.<init>(r4, r2, r5, r3)
            return r0
        L_0x07c7:
            int r0 = defpackage.n79.Y(r46)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r17 = r10
            r15 = r4
            r16 = r15
            r11 = r5
            r13 = r11
        L_0x07dc:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0827
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0821;
                case 2: goto L_0x081b;
                case 3: goto L_0x0815;
                case 4: goto L_0x080f;
                case 5: goto L_0x0809;
                case 6: goto L_0x0803;
                case 7: goto L_0x07fc;
                case 8: goto L_0x07f5;
                case 9: goto L_0x07ee;
                default: goto L_0x07ea;
            }
        L_0x07ea:
            defpackage.n79.T(r1, r2)
            goto L_0x07dc
        L_0x07ee:
            int r2 = defpackage.n79.N(r1, r2)
            r18 = r2
            goto L_0x07dc
        L_0x07f5:
            int r2 = defpackage.n79.N(r1, r2)
            r17 = r2
            goto L_0x07dc
        L_0x07fc:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r16 = r2
            goto L_0x07dc
        L_0x0803:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r15 = r2
            goto L_0x07dc
        L_0x0809:
            long r2 = defpackage.n79.O(r1, r2)
            r13 = r2
            goto L_0x07dc
        L_0x080f:
            long r2 = defpackage.n79.O(r1, r2)
            r11 = r2
            goto L_0x07dc
        L_0x0815:
            int r2 = defpackage.n79.N(r1, r2)
            r10 = r2
            goto L_0x07dc
        L_0x081b:
            int r2 = defpackage.n79.N(r1, r2)
            r9 = r2
            goto L_0x07dc
        L_0x0821:
            int r2 = defpackage.n79.N(r1, r2)
            r8 = r2
            goto L_0x07dc
        L_0x0827:
            defpackage.n79.z(r1, r0)
            lq9 r0 = new lq9
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r0
        L_0x0831:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x0839:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0868
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0863
            r7 = 2
            if (r6 == r7) goto L_0x085a
            r7 = 3
            if (r6 == r7) goto L_0x0851
            defpackage.n79.T(r1, r5)
            goto L_0x0839
        L_0x0851:
            android.os.Parcelable$Creator<xwg> r3 = defpackage.xwg.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r5, r3)
            xwg r3 = (defpackage.xwg) r3
            goto L_0x0839
        L_0x085a:
            android.os.Parcelable$Creator<bi3> r2 = defpackage.bi3.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r5, r2)
            bi3 r2 = (defpackage.bi3) r2
            goto L_0x0839
        L_0x0863:
            int r4 = defpackage.n79.N(r1, r5)
            goto L_0x0839
        L_0x0868:
            defpackage.n79.z(r1, r0)
            rwg r0 = new rwg
            r0.<init>(r4, r2, r3)
            return r0
        L_0x0871:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0878:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x08a8
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0892
            r7 = 2
            if (r6 == r7) goto L_0x088d
            defpackage.n79.T(r1, r5)
            goto L_0x0878
        L_0x088d:
            java.lang.String r4 = defpackage.n79.u(r1, r5)
            goto L_0x0878
        L_0x0892:
            int r3 = defpackage.n79.P(r1, r5)
            int r5 = r46.dataPosition()
            if (r3 != 0) goto L_0x089e
            r3 = r2
            goto L_0x0878
        L_0x089e:
            java.util.ArrayList r6 = r46.createStringArrayList()
            int r5 = r5 + r3
            r1.setDataPosition(r5)
            r3 = r6
            goto L_0x0878
        L_0x08a8:
            defpackage.n79.z(r1, r0)
            mwg r0 = new mwg
            r0.<init>(r4, r3)
            return r0
        L_0x08b1:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r11 = r7
            r12 = r11
            r14 = r12
            r5 = r3
            r8 = r5
            r9 = r8
            r10 = r9
        L_0x08c0:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x090d
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x0908;
                case 2: goto L_0x0901;
                case 3: goto L_0x08f7;
                case 4: goto L_0x08f2;
                case 5: goto L_0x08ed;
                case 6: goto L_0x08e8;
                case 7: goto L_0x08e3;
                case 8: goto L_0x08de;
                case 9: goto L_0x08d7;
                case 10: goto L_0x08d2;
                default: goto L_0x08ce;
            }
        L_0x08ce:
            defpackage.n79.T(r1, r3)
            goto L_0x08c0
        L_0x08d2:
            java.lang.String r14 = defpackage.n79.u(r1, r3)
            goto L_0x08c0
        L_0x08d7:
            android.os.Parcelable$Creator<qt6> r2 = defpackage.qt6.CREATOR
            java.util.ArrayList r2 = defpackage.n79.w(r1, r3, r2)
            goto L_0x08c0
        L_0x08de:
            java.lang.String r12 = defpackage.n79.u(r1, r3)
            goto L_0x08c0
        L_0x08e3:
            java.lang.String r11 = defpackage.n79.u(r1, r3)
            goto L_0x08c0
        L_0x08e8:
            boolean r10 = defpackage.n79.I(r1, r3)
            goto L_0x08c0
        L_0x08ed:
            boolean r9 = defpackage.n79.I(r1, r3)
            goto L_0x08c0
        L_0x08f2:
            boolean r8 = defpackage.n79.I(r1, r3)
            goto L_0x08c0
        L_0x08f7:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r3, r4)
            r7 = r3
            android.accounts.Account r7 = (android.accounts.Account) r7
            goto L_0x08c0
        L_0x0901:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r6 = defpackage.n79.w(r1, r3, r4)
            goto L_0x08c0
        L_0x0908:
            int r5 = defpackage.n79.N(r1, r3)
            goto L_0x08c0
        L_0x090d:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.HashMap r13 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.c(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x091b:
            int r0 = defpackage.n79.Y(r46)
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r3
            r7 = r5
        L_0x0933:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0997
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0991;
                case 2: goto L_0x098b;
                case 3: goto L_0x0985;
                case 4: goto L_0x097f;
                case 5: goto L_0x0979;
                case 6: goto L_0x096f;
                case 7: goto L_0x0969;
                case 8: goto L_0x0963;
                case 9: goto L_0x095c;
                case 10: goto L_0x0953;
                case 11: goto L_0x094c;
                case 12: goto L_0x0945;
                default: goto L_0x0941;
            }
        L_0x0941:
            defpackage.n79.T(r1, r2)
            goto L_0x0933
        L_0x0945:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r19 = r2
            goto L_0x0933
        L_0x094c:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r18 = r2
            goto L_0x0933
        L_0x0953:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r2 = defpackage.n79.w(r1, r2, r3)
            r17 = r2
            goto L_0x0933
        L_0x095c:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r16 = r2
            goto L_0x0933
        L_0x0963:
            long r2 = defpackage.n79.O(r1, r2)
            r14 = r2
            goto L_0x0933
        L_0x0969:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r13 = r2
            goto L_0x0933
        L_0x096f:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L_0x0933
        L_0x0979:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r11 = r2
            goto L_0x0933
        L_0x097f:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r10 = r2
            goto L_0x0933
        L_0x0985:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r9 = r2
            goto L_0x0933
        L_0x098b:
            java.lang.String r2 = defpackage.n79.u(r1, r2)
            r8 = r2
            goto L_0x0933
        L_0x0991:
            int r2 = defpackage.n79.N(r1, r2)
            r7 = r2
            goto L_0x0933
        L_0x0997:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivg.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GoogleSignInAccount[i];
            case 1:
                return new GoogleSignInOptions[i];
            case 2:
                return new mwg[i];
            case 3:
                return new rwg[i];
            case 4:
                return new lq9[i];
            case 5:
                return new wwg[i];
            case 6:
                return new xwg[i];
            case 7:
                return new CameraPosition[i];
            case 8:
                return new b43[i];
            case 9:
                return new Scope[i];
            case 10:
                return new vr7[i];
            case 11:
                return new LocationAvailability[i];
            case 12:
                return new GoogleMapOptions[i];
            case 13:
                return new gye[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new kye[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new LocationRequest[i];
            case 16:
                return new LocationResult[i];
            case LangUtils.HASH_SEED /*17*/:
                return new j68[i];
            case 18:
                return new k68[i];
            case 19:
                return new l68[i];
            case 20:
                return new c8d[i];
            case 21:
                return new xxg[i];
            case 22:
                return new ww1[i];
            case 23:
                return new f5d[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new bi3[i];
            case 25:
                return new Status[i];
            case 26:
                return new k0h[i];
            case 27:
                return new z03[i];
            case 28:
                return new tj5[i];
            default:
                return new SignInAccount[i];
        }
    }
}
