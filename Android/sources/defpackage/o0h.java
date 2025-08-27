package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o0h  reason: default package */
public final class o0h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ o0h(int i) {
        this.a = i;
    }

    public static void a(nr6 nr6, Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        int i2 = nr6.a;
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(i2);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(nr6.b);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(nr6.c);
        tf6.w0(parcel, 4, nr6.o);
        tf6.t0(parcel, 5, nr6.v);
        tf6.x0(parcel, 6, nr6.w, i);
        tf6.r0(parcel, 7, nr6.x);
        tf6.u0(parcel, 8, nr6.y, i);
        tf6.x0(parcel, 10, nr6.z, i);
        tf6.x0(parcel, 11, nr6.X, i);
        tf6.G0(parcel, 12, 4);
        parcel.writeInt(nr6.Y ? 1 : 0);
        tf6.G0(parcel, 13, 4);
        parcel.writeInt(nr6.Z);
        boolean z = nr6.v0;
        tf6.G0(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        tf6.w0(parcel, 15, nr6.w0);
        tf6.E0(parcel, B0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v22, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v23, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v27, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, h5h] */
    /* JADX WARNING: type inference failed for: r3v28, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v48, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v49, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v50, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v51, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v27, types: [rf8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v68, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v76, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v77, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x05a1;
                case 1: goto L_0x0550;
                case 2: goto L_0x04e0;
                case 3: goto L_0x048a;
                case 4: goto L_0x042d;
                case 5: goto L_0x03dc;
                case 6: goto L_0x0371;
                case 7: goto L_0x0348;
                case 8: goto L_0x0312;
                case 9: goto L_0x0277;
                case 10: goto L_0x0240;
                case 11: goto L_0x021b;
                case 12: goto L_0x010b;
                case 13: goto L_0x00dd;
                case 14: goto L_0x0060;
                case 15: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = r2
        L_0x000f:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x0032
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x002d
            r6 = 5
            if (r5 == r6) goto L_0x0024
            defpackage.n79.T(r1, r4)
            goto L_0x000f
        L_0x0024:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r4, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r3
            goto L_0x000f
        L_0x002d:
            java.lang.String r2 = defpackage.n79.u(r1, r4)
            goto L_0x000f
        L_0x0032:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r0 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r0.<init>(r2, r3)
            return r0
        L_0x003b:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
        L_0x0040:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0057
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x0052
            defpackage.n79.T(r1, r3)
            goto L_0x0040
        L_0x0052:
            android.os.IBinder r2 = defpackage.n79.M(r1, r3)
            goto L_0x0040
        L_0x0057:
            defpackage.n79.z(r1, r0)
            yie r0 = new yie
            r0.<init>(r2)
            return r0
        L_0x0060:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = r2
            r13 = r6
            r14 = r13
            r16 = r14
            r17 = r16
            r8 = r3
            r10 = r8
            r11 = r10
            r12 = r11
            r15 = r12
            r7 = r4
            r9 = r7
        L_0x0075:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x00d3
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00a4;
                case 10: goto L_0x009a;
                case 11: goto L_0x0095;
                case 12: goto L_0x008e;
                case 13: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            defpackage.n79.T(r1, r2)
            goto L_0x0075
        L_0x0087:
            android.os.Parcelable$Creator<kye> r3 = defpackage.kye.CREATOR
            java.util.ArrayList r17 = defpackage.n79.w(r1, r2, r3)
            goto L_0x0075
        L_0x008e:
            android.os.Parcelable$Creator<mab> r3 = defpackage.mab.CREATOR
            java.util.ArrayList r16 = defpackage.n79.w(r1, r2, r3)
            goto L_0x0075
        L_0x0095:
            int r15 = defpackage.n79.N(r1, r2)
            goto L_0x0075
        L_0x009a:
            android.os.Parcelable$Creator<ww1> r3 = defpackage.ww1.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r14 = r2
            ww1 r14 = (defpackage.ww1) r14
            goto L_0x0075
        L_0x00a4:
            android.os.Parcelable$Creator<ww1> r3 = defpackage.ww1.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r13 = r2
            ww1 r13 = (defpackage.ww1) r13
            goto L_0x0075
        L_0x00ae:
            boolean r12 = defpackage.n79.I(r1, r2)
            goto L_0x0075
        L_0x00b3:
            boolean r11 = defpackage.n79.I(r1, r2)
            goto L_0x0075
        L_0x00b8:
            boolean r10 = defpackage.n79.I(r1, r2)
            goto L_0x0075
        L_0x00bd:
            float r9 = defpackage.n79.K(r1, r2)
            goto L_0x0075
        L_0x00c2:
            int r8 = defpackage.n79.N(r1, r2)
            goto L_0x0075
        L_0x00c7:
            float r7 = defpackage.n79.K(r1, r2)
            goto L_0x0075
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            java.util.ArrayList r6 = defpackage.n79.w(r1, r2, r3)
            goto L_0x0075
        L_0x00d3:
            defpackage.n79.z(r1, r0)
            jqb r0 = new jqb
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x00dd:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
        L_0x00e3:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x0102
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x00fd
            r6 = 3
            if (r5 == r6) goto L_0x00f8
            defpackage.n79.T(r1, r4)
            goto L_0x00e3
        L_0x00f8:
            java.lang.Float r2 = defpackage.n79.L(r1, r4)
            goto L_0x00e3
        L_0x00fd:
            int r3 = defpackage.n79.N(r1, r4)
            goto L_0x00e3
        L_0x0102:
            defpackage.n79.z(r1, r0)
            mab r0 = new mab
            r0.<init>(r3, r2)
            return r0
        L_0x010b:
            int r0 = defpackage.n79.Y(r28)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1056964608(0x3f000000, float:0.5)
            r13 = r4
            r14 = r13
            r15 = r14
            r23 = r15
            r24 = r23
            r21 = r5
            r19 = r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
        L_0x0131:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x01a7
            int r3 = r28.readInt()
            char r2 = (char) r3
            switch(r2) {
                case 2: goto L_0x019d;
                case 3: goto L_0x0198;
                case 4: goto L_0x0193;
                case 5: goto L_0x018e;
                case 6: goto L_0x0189;
                case 7: goto L_0x0184;
                case 8: goto L_0x017f;
                case 9: goto L_0x017a;
                case 10: goto L_0x0175;
                case 11: goto L_0x0170;
                case 12: goto L_0x016b;
                case 13: goto L_0x0166;
                case 14: goto L_0x0161;
                case 15: goto L_0x015c;
                case 16: goto L_0x013f;
                case 17: goto L_0x0157;
                case 18: goto L_0x0152;
                case 19: goto L_0x014d;
                case 20: goto L_0x0148;
                case 21: goto L_0x0143;
                default: goto L_0x013f;
            }
        L_0x013f:
            defpackage.n79.T(r1, r3)
            goto L_0x0131
        L_0x0143:
            float r26 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0148:
            java.lang.String r25 = defpackage.n79.u(r1, r3)
            goto L_0x0131
        L_0x014d:
            int r24 = defpackage.n79.N(r1, r3)
            goto L_0x0131
        L_0x0152:
            android.os.IBinder r16 = defpackage.n79.M(r1, r3)
            goto L_0x0131
        L_0x0157:
            int r23 = defpackage.n79.N(r1, r3)
            goto L_0x0131
        L_0x015c:
            float r22 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0161:
            float r21 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0166:
            float r20 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x016b:
            float r19 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0170:
            float r18 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0175:
            boolean r15 = defpackage.n79.I(r1, r3)
            goto L_0x0131
        L_0x017a:
            boolean r14 = defpackage.n79.I(r1, r3)
            goto L_0x0131
        L_0x017f:
            boolean r13 = defpackage.n79.I(r1, r3)
            goto L_0x0131
        L_0x0184:
            float r12 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x0189:
            float r11 = defpackage.n79.K(r1, r3)
            goto L_0x0131
        L_0x018e:
            android.os.IBinder r10 = defpackage.n79.M(r1, r3)
            goto L_0x0131
        L_0x0193:
            java.lang.String r9 = defpackage.n79.u(r1, r3)
            goto L_0x0131
        L_0x0198:
            java.lang.String r8 = defpackage.n79.u(r1, r3)
            goto L_0x0131
        L_0x019d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r3, r2)
            r7 = r2
            com.google.android.gms.maps.model.LatLng r7 = (com.google.android.gms.maps.model.LatLng) r7
            goto L_0x0131
        L_0x01a7:
            defpackage.n79.z(r1, r0)
            rf8 r0 = new rf8
            r0.<init>()
            r0.v = r6
            r0.w = r5
            r1 = 1
            r0.y = r1
            r0.z = r4
            r1 = 0
            r0.X = r1
            r0.Y = r6
            r0.Z = r1
            r0.v0 = r5
            r0.x0 = r4
            r0.a = r7
            r0.b = r8
            r0.c = r9
            if (r10 != 0) goto L_0x01cf
            r1 = 0
            r0.o = r1
            goto L_0x01db
        L_0x01cf:
            r1 = 0
            y35 r2 = new y35
            p67 r3 = defpackage.hha.L0(r10)
            r2.<init>((defpackage.p67) r3)
            r0.o = r2
        L_0x01db:
            r0.v = r11
            r0.w = r12
            r0.x = r13
            r0.y = r14
            r0.z = r15
            r2 = r18
            r0.X = r2
            r6 = r19
            r0.Y = r6
            r2 = r20
            r0.Z = r2
            r5 = r21
            r0.v0 = r5
            r2 = r22
            r0.w0 = r2
            r4 = r24
            r0.z0 = r4
            r4 = r23
            r0.x0 = r4
            p67 r2 = defpackage.hha.L0(r16)
            if (r2 != 0) goto L_0x0209
            r3 = r1
            goto L_0x0210
        L_0x0209:
            java.lang.Object r1 = defpackage.hha.M0(r2)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
        L_0x0210:
            r0.y0 = r3
            r3 = r25
            r0.A0 = r3
            r2 = r26
            r0.B0 = r2
            return r0
        L_0x021b:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
        L_0x0220:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0237
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x0232
            defpackage.n79.T(r1, r3)
            goto L_0x0220
        L_0x0232:
            java.lang.String r2 = defpackage.n79.u(r1, r3)
            goto L_0x0220
        L_0x0237:
            defpackage.n79.z(r1, r0)
            be8 r0 = new be8
            r0.<init>(r2)
            return r0
        L_0x0240:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r4 = r2
        L_0x0247:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x026e
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 2
            r9 = 8
            if (r7 == r8) goto L_0x0266
            r8 = 3
            if (r7 == r8) goto L_0x025e
            defpackage.n79.T(r1, r6)
            goto L_0x0247
        L_0x025e:
            defpackage.n79.b0(r1, r6, r9)
            double r4 = r28.readDouble()
            goto L_0x0247
        L_0x0266:
            defpackage.n79.b0(r1, r6, r9)
            double r2 = r28.readDouble()
            goto L_0x0247
        L_0x026e:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r2, r4)
            return r0
        L_0x0277:
            int r0 = defpackage.n79.Y(r28)
            com.google.android.gms.common.api.Scope[] r2 = defpackage.nr6.x0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            tj5[] r4 = defpackage.nr6.y0
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x029a:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0308
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0303;
                case 2: goto L_0x02fe;
                case 3: goto L_0x02f9;
                case 4: goto L_0x02f4;
                case 5: goto L_0x02ef;
                case 6: goto L_0x02e5;
                case 7: goto L_0x02e0;
                case 8: goto L_0x02d6;
                case 9: goto L_0x02a8;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02c0;
                case 12: goto L_0x02bb;
                case 13: goto L_0x02b6;
                case 14: goto L_0x02b1;
                case 15: goto L_0x02ac;
                default: goto L_0x02a8;
            }
        L_0x02a8:
            defpackage.n79.T(r1, r2)
            goto L_0x029a
        L_0x02ac:
            java.lang.String r21 = defpackage.n79.u(r1, r2)
            goto L_0x029a
        L_0x02b1:
            boolean r20 = defpackage.n79.I(r1, r2)
            goto L_0x029a
        L_0x02b6:
            int r19 = defpackage.n79.N(r1, r2)
            goto L_0x029a
        L_0x02bb:
            boolean r18 = defpackage.n79.I(r1, r2)
            goto L_0x029a
        L_0x02c0:
            android.os.Parcelable$Creator<tj5> r3 = defpackage.tj5.CREATOR
            java.lang.Object[] r2 = defpackage.n79.v(r1, r2, r3)
            r17 = r2
            tj5[] r17 = (defpackage.tj5[]) r17
            goto L_0x029a
        L_0x02cb:
            android.os.Parcelable$Creator<tj5> r3 = defpackage.tj5.CREATOR
            java.lang.Object[] r2 = defpackage.n79.v(r1, r2, r3)
            r16 = r2
            tj5[] r16 = (defpackage.tj5[]) r16
            goto L_0x029a
        L_0x02d6:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x029a
        L_0x02e0:
            android.os.Bundle r14 = defpackage.n79.s(r1, r2)
            goto L_0x029a
        L_0x02e5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = defpackage.n79.v(r1, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x029a
        L_0x02ef:
            android.os.IBinder r12 = defpackage.n79.M(r1, r2)
            goto L_0x029a
        L_0x02f4:
            java.lang.String r11 = defpackage.n79.u(r1, r2)
            goto L_0x029a
        L_0x02f9:
            int r10 = defpackage.n79.N(r1, r2)
            goto L_0x029a
        L_0x02fe:
            int r9 = defpackage.n79.N(r1, r2)
            goto L_0x029a
        L_0x0303:
            int r8 = defpackage.n79.N(r1, r2)
            goto L_0x029a
        L_0x0308:
            defpackage.n79.z(r1, r0)
            nr6 r0 = new nr6
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x0312:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = r2
        L_0x0318:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x033f
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x0336
            r6 = 3
            if (r5 == r6) goto L_0x032d
            defpackage.n79.T(r1, r4)
            goto L_0x0318
        L_0x032d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r4, r3)
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            goto L_0x0318
        L_0x0336:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r4, r2)
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            goto L_0x0318
        L_0x033f:
            defpackage.n79.z(r1, r0)
            com.google.android.gms.maps.model.LatLngBounds r0 = new com.google.android.gms.maps.model.LatLngBounds
            r0.<init>(r2, r3)
            return r0
        L_0x0348:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
        L_0x034d:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0368
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x035f
            defpackage.n79.T(r1, r3)
            goto L_0x034d
        L_0x035f:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            goto L_0x034d
        L_0x0368:
            defpackage.n79.z(r1, r0)
            q5h r0 = new q5h
            r0.<init>(r2)
            return r0
        L_0x0371:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r10 = r8
            r6 = r3
            r7 = r6
            r9 = r7
        L_0x037d:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x03d2
            int r3 = r28.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x03c8;
                case 2: goto L_0x03c3;
                case 3: goto L_0x03be;
                case 4: goto L_0x03a9;
                case 5: goto L_0x03a4;
                case 6: goto L_0x038f;
                default: goto L_0x038b;
            }
        L_0x038b:
            defpackage.n79.T(r1, r3)
            goto L_0x037d
        L_0x038f:
            int r3 = defpackage.n79.P(r1, r3)
            int r4 = r28.dataPosition()
            if (r3 != 0) goto L_0x039b
            r10 = r2
            goto L_0x037d
        L_0x039b:
            int[] r10 = r28.createIntArray()
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            goto L_0x037d
        L_0x03a4:
            int r9 = defpackage.n79.N(r1, r3)
            goto L_0x037d
        L_0x03a9:
            int r3 = defpackage.n79.P(r1, r3)
            int r4 = r28.dataPosition()
            if (r3 != 0) goto L_0x03b5
            r8 = r2
            goto L_0x037d
        L_0x03b5:
            int[] r8 = r28.createIntArray()
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            goto L_0x037d
        L_0x03be:
            boolean r7 = defpackage.n79.I(r1, r3)
            goto L_0x037d
        L_0x03c3:
            boolean r6 = defpackage.n79.I(r1, r3)
            goto L_0x037d
        L_0x03c8:
            android.os.Parcelable$Creator<c8d> r4 = defpackage.c8d.CREATOR
            android.os.Parcelable r3 = defpackage.n79.t(r1, r3, r4)
            r5 = r3
            c8d r5 = (defpackage.c8d) r5
            goto L_0x037d
        L_0x03d2:
            defpackage.n79.z(r1, r0)
            ki3 r0 = new ki3
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x03dc:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x03e5:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x041c
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0417
            r8 = 2
            if (r7 == r8) goto L_0x040e
            r8 = 3
            if (r7 == r8) goto L_0x0409
            r8 = 4
            if (r7 == r8) goto L_0x0400
            defpackage.n79.T(r1, r6)
            goto L_0x03e5
        L_0x0400:
            android.os.Parcelable$Creator<ki3> r4 = defpackage.ki3.CREATOR
            android.os.Parcelable r4 = defpackage.n79.t(r1, r6, r4)
            ki3 r4 = (defpackage.ki3) r4
            goto L_0x03e5
        L_0x0409:
            int r5 = defpackage.n79.N(r1, r6)
            goto L_0x03e5
        L_0x040e:
            android.os.Parcelable$Creator<tj5> r3 = defpackage.tj5.CREATOR
            java.lang.Object[] r3 = defpackage.n79.v(r1, r6, r3)
            tj5[] r3 = (defpackage.tj5[]) r3
            goto L_0x03e5
        L_0x0417:
            android.os.Bundle r2 = defpackage.n79.s(r1, r6)
            goto L_0x03e5
        L_0x041c:
            defpackage.n79.z(r1, r0)
            h5h r0 = new h5h
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r5
            r0.o = r4
            return r0
        L_0x042d:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r5 = r3
        L_0x0439:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0480
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x047b
            r4 = 3
            if (r3 == r4) goto L_0x0476
            r4 = 4
            if (r3 == r4) goto L_0x0471
            r4 = 6
            if (r3 == r4) goto L_0x046c
            r4 = 7
            if (r3 == r4) goto L_0x0462
            r4 = 8
            if (r3 == r4) goto L_0x045b
            defpackage.n79.T(r1, r2)
            goto L_0x0439
        L_0x045b:
            android.os.Parcelable$Creator<tj5> r3 = defpackage.tj5.CREATOR
            java.util.ArrayList r9 = defpackage.n79.w(r1, r2, r3)
            goto L_0x0439
        L_0x0462:
            android.os.Parcelable$Creator<o1h> r3 = defpackage.o1h.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r10 = r2
            o1h r10 = (defpackage.o1h) r10
            goto L_0x0439
        L_0x046c:
            java.lang.String r8 = defpackage.n79.u(r1, r2)
            goto L_0x0439
        L_0x0471:
            java.lang.String r7 = defpackage.n79.u(r1, r2)
            goto L_0x0439
        L_0x0476:
            java.lang.String r6 = defpackage.n79.u(r1, r2)
            goto L_0x0439
        L_0x047b:
            int r5 = defpackage.n79.N(r1, r2)
            goto L_0x0439
        L_0x0480:
            defpackage.n79.z(r1, r0)
            o1h r0 = new o1h
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x048a:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 1
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r5 = r3
        L_0x0497:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x04d6
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x04d1;
                case 2: goto L_0x04c7;
                case 3: goto L_0x04c2;
                case 4: goto L_0x04b8;
                case 5: goto L_0x04b3;
                case 6: goto L_0x04ae;
                case 7: goto L_0x04a5;
                case 8: goto L_0x04a9;
                default: goto L_0x04a5;
            }
        L_0x04a5:
            defpackage.n79.T(r1, r2)
            goto L_0x0497
        L_0x04a9:
            java.lang.String r11 = defpackage.n79.u(r1, r2)
            goto L_0x0497
        L_0x04ae:
            android.os.IBinder r10 = defpackage.n79.M(r1, r2)
            goto L_0x0497
        L_0x04b3:
            android.os.IBinder r8 = defpackage.n79.M(r1, r2)
            goto L_0x0497
        L_0x04b8:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r9 = r2
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x0497
        L_0x04c2:
            android.os.IBinder r7 = defpackage.n79.M(r1, r2)
            goto L_0x0497
        L_0x04c7:
            android.os.Parcelable$Creator<x1h> r3 = defpackage.x1h.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r6 = r2
            x1h r6 = (defpackage.x1h) r6
            goto L_0x0497
        L_0x04d1:
            int r5 = defpackage.n79.N(r1, r2)
            goto L_0x0497
        L_0x04d6:
            defpackage.n79.z(r1, r0)
            z1h r0 = new z1h
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x04e0:
            int r0 = defpackage.n79.Y(r28)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = 0
            r13 = r2
            r7 = r4
            r8 = r7
            r9 = r5
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x04f2:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0546
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x053c
            r4 = 5
            if (r3 == r4) goto L_0x0534
            r4 = 8
            if (r3 == r4) goto L_0x052e
            r4 = 9
            if (r3 == r4) goto L_0x0528
            switch(r3) {
                case 11: goto L_0x0522;
                case 12: goto L_0x051c;
                case 13: goto L_0x0518;
                case 14: goto L_0x0512;
                default: goto L_0x050e;
            }
        L_0x050e:
            defpackage.n79.T(r1, r2)
            goto L_0x04f2
        L_0x0512:
            long r2 = defpackage.n79.O(r1, r2)
            r13 = r2
            goto L_0x04f2
        L_0x0518:
            defpackage.n79.u(r1, r2)
            goto L_0x04f2
        L_0x051c:
            boolean r2 = defpackage.n79.I(r1, r2)
            r12 = r2
            goto L_0x04f2
        L_0x0522:
            boolean r2 = defpackage.n79.I(r1, r2)
            r11 = r2
            goto L_0x04f2
        L_0x0528:
            boolean r2 = defpackage.n79.I(r1, r2)
            r10 = r2
            goto L_0x04f2
        L_0x052e:
            boolean r2 = defpackage.n79.I(r1, r2)
            r9 = r2
            goto L_0x04f2
        L_0x0534:
            android.os.Parcelable$Creator<t23> r3 = defpackage.t23.CREATOR
            java.util.ArrayList r2 = defpackage.n79.w(r1, r2, r3)
            r8 = r2
            goto L_0x04f2
        L_0x053c:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r3 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            com.google.android.gms.location.LocationRequest r2 = (com.google.android.gms.location.LocationRequest) r2
            r7 = r2
            goto L_0x04f2
        L_0x0546:
            defpackage.n79.z(r1, r0)
            x1h r0 = new x1h
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0550:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r5 = r3
        L_0x055b:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0597
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0592
            r4 = 2
            if (r3 == r4) goto L_0x058d
            r4 = 3
            if (r3 == r4) goto L_0x0588
            r4 = 4
            if (r3 == r4) goto L_0x057e
            r4 = 6
            if (r3 == r4) goto L_0x0579
            defpackage.n79.T(r1, r2)
            goto L_0x055b
        L_0x0579:
            java.lang.String r9 = defpackage.n79.u(r1, r2)
            goto L_0x055b
        L_0x057e:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.n79.t(r1, r2, r3)
            r8 = r2
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            goto L_0x055b
        L_0x0588:
            android.os.IBinder r7 = defpackage.n79.M(r1, r2)
            goto L_0x055b
        L_0x058d:
            android.os.IBinder r6 = defpackage.n79.M(r1, r2)
            goto L_0x055b
        L_0x0592:
            int r5 = defpackage.n79.N(r1, r2)
            goto L_0x055b
        L_0x0597:
            defpackage.n79.z(r1, r0)
            u1h r0 = new u1h
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x05a1:
            int r0 = defpackage.n79.Y(r28)
            r2 = 0
            r3 = 0
        L_0x05a7:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x05c6
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x05c1
            r6 = 2
            if (r5 == r6) goto L_0x05bc
            defpackage.n79.T(r1, r4)
            goto L_0x05a7
        L_0x05bc:
            int r3 = defpackage.n79.N(r1, r4)
            goto L_0x05a7
        L_0x05c1:
            java.lang.String r2 = defpackage.n79.u(r1, r4)
            goto L_0x05a7
        L_0x05c6:
            defpackage.n79.z(r1, r0)
            tzg r0 = new tzg
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0h.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tzg[i];
            case 1:
                return new u1h[i];
            case 2:
                return new x1h[i];
            case 3:
                return new z1h[i];
            case 4:
                return new o1h[i];
            case 5:
                return new h5h[i];
            case 6:
                return new ki3[i];
            case 7:
                return new q5h[i];
            case 8:
                return new LatLngBounds[i];
            case 9:
                return new nr6[i];
            case 10:
                return new LatLng[i];
            case 11:
                return new be8[i];
            case 12:
                return new rf8[i];
            case 13:
                return new mab[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new jqb[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new yie[i];
            default:
                return new SignInConfiguration[i];
        }
    }
}
