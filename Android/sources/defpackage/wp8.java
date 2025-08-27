package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;

/* renamed from: wp8  reason: default package */
public final class wp8 extends Binder implements c67 {
    public final WeakReference c;

    public wp8(np8 np8) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(np8);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [b67, c67, java.lang.Object] */
    public static c67 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c67)) {
            return (c67) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final void A(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new up8(pob.c(bundle)));
            } catch (RuntimeException e) {
                i8b.W("Ignoring malformed Bundle for Commands", e);
            }
        }
    }

    public final void D(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new td8(4, qwd.b(bundle)));
            } catch (RuntimeException e) {
                i8b.W("Ignoring malformed Bundle for SessionPositionInfo", e);
            }
        }
    }

    public final void G0(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                H0(i, swd.a(bundle));
            } catch (RuntimeException e) {
                i8b.W("Ignoring malformed Bundle for SessionResult", e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[Catch:{ RuntimeException -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[Catch:{ RuntimeException -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(int r4, android.os.Bundle r5, android.os.Bundle r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x004e
            if (r6 != 0) goto L_0x0005
            goto L_0x004e
        L_0x0005:
            java.lang.ref.WeakReference r4 = r3.c     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Object r4 = r4.get()     // Catch:{ RuntimeException -> 0x0048 }
            np8 r4 = (defpackage.np8) r4     // Catch:{ RuntimeException -> 0x0048 }
            r0 = -1
            if (r4 != 0) goto L_0x0012
        L_0x0010:
            r4 = r0
            goto L_0x001d
        L_0x0012:
            oxd r4 = r4.k     // Catch:{ RuntimeException -> 0x0048 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0010
        L_0x0017:
            nxd r4 = r4.a     // Catch:{ RuntimeException -> 0x0048 }
            int r4 = r4.f()     // Catch:{ RuntimeException -> 0x0048 }
        L_0x001d:
            if (r4 != r0) goto L_0x0020
            return
        L_0x0020:
            ppb r4 = defpackage.ppb.r(r4, r5)     // Catch:{ RuntimeException -> 0x0048 }
            npb r5 = new npb     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r0 = defpackage.npb.d     // Catch:{ RuntimeException -> 0x0041 }
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r2 = defpackage.npb.e     // Catch:{ RuntimeException -> 0x0041 }
            boolean r6 = r6.getBoolean(r2, r1)     // Catch:{ RuntimeException -> 0x0041 }
            r5.<init>(r0, r6)     // Catch:{ RuntimeException -> 0x0041 }
            g18 r6 = new g18
            r0 = 11
            r6.<init>(r0, r4, r5)
            r3.R(r6)
            return
        L_0x0041:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for BundlingExclusions"
            defpackage.i8b.W(r4, r3)
            return
        L_0x0048:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for PlayerInfo"
            defpackage.i8b.W(r4, r3)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp8.H(int, android.os.Bundle, android.os.Bundle):void");
    }

    public final void H0(int i, Object obj) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            np8 np8 = (np8) this.c.get();
            if (np8 != null) {
                np8.b.p(i, obj);
                np8.a.H0(new l40(np8, i, 12));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void M(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                H0(i, zt7.a(bundle));
            } catch (RuntimeException e) {
                i8b.W("Ignoring malformed Bundle for LibraryResult", e);
            }
        }
    }

    public final void R(vp8 vp8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            np8 np8 = (np8) this.c.get();
            if (np8 != null) {
                v0g.W(np8.a.v, new uo5(27, (Object) np8, (Object) vp8));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void b(int i) {
        R(new zc8(18));
    }

    public final void d(int i) {
        R(new zc8(19));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0181 A[Catch:{ RuntimeException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0183 A[Catch:{ RuntimeException -> 0x01a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "androidx.media3.session.IMediaController"
            r1 = 1
            if (r4 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r2) goto L_0x000d
            r5.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 == r2) goto L_0x0261
            r0 = 4001(0xfa1, float:5.607E-42)
            java.lang.String r2 = "Ignoring malformed Bundle for LibraryParams"
            if (r4 == r0) goto L_0x0227
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r4 == r0) goto L_0x01ea
            r0 = 0
            switch(r4) {
                case 3001: goto L_0x01d9;
                case 3002: goto L_0x01c8;
                case 3003: goto L_0x01b7;
                case 3004: goto L_0x0159;
                case 3005: goto L_0x0125;
                case 3006: goto L_0x011c;
                case 3007: goto L_0x0104;
                case 3008: goto L_0x00f3;
                case 3009: goto L_0x00e2;
                case 3010: goto L_0x00a7;
                case 3011: goto L_0x009e;
                case 3012: goto L_0x007e;
                case 3013: goto L_0x0067;
                case 3014: goto L_0x0047;
                case 3015: goto L_0x0025;
                default: goto L_0x0020;
            }
        L_0x0020:
            boolean r3 = super.onTransact(r4, r5, r6, r7)
            return r3
        L_0x0025:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.hi7.a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            defpackage.iwd.a(r4)     // Catch:{ RuntimeException -> 0x003f }
            zc8 r4 = new zc8
            r5 = 17
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x0260
        L_0x003f:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionError"
            defpackage.i8b.W(r4, r3)
            goto L_0x0260
        L_0x0047:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.app.PendingIntent.CREATOR
            java.lang.Object r4 = defpackage.hi7.a(r5, r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            if (r4 != 0) goto L_0x005b
            java.lang.String r3 = "Ignoring null session activity intent"
            defpackage.i8b.V(r3)
            goto L_0x0260
        L_0x005b:
            zc8 r4 = new zc8
            r5 = 21
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x0260
        L_0x0067:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.H(r4, r7, r5)
            goto L_0x0260
        L_0x007e:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.hi7.a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 != 0) goto L_0x0092
            java.lang.String r3 = "Ignoring null Bundle for extras"
            defpackage.i8b.V(r3)
            goto L_0x0260
        L_0x0092:
            zc8 r4 = new zc8
            r5 = 22
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x0260
        L_0x009e:
            int r4 = r5.readInt()
            r3.b(r4)
            goto L_0x0260
        L_0x00a7:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.hi7.a(r5, r4)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.Object r4 = defpackage.hi7.a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r6 == 0) goto L_0x0260
            if (r4 != 0) goto L_0x00be
            goto L_0x0260
        L_0x00be:
            zvd r5 = defpackage.zvd.b(r6)     // Catch:{ RuntimeException -> 0x00da }
            pob r4 = defpackage.pob.c(r4)     // Catch:{ RuntimeException -> 0x00d2 }
            g18 r6 = new g18
            r7 = 12
            r6.<init>(r7, r5, r4)
            r3.R(r6)
            goto L_0x0260
        L_0x00d2:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for Commands"
            defpackage.i8b.W(r4, r3)
            goto L_0x0260
        L_0x00da:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommands"
            defpackage.i8b.W(r4, r3)
            goto L_0x0260
        L_0x00e2:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.A(r4, r5)
            goto L_0x0260
        L_0x00f3:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.D(r4, r5)
            goto L_0x0260
        L_0x0104:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r5 = r5.readInt()
            if (r5 == 0) goto L_0x0117
            r0 = r1
        L_0x0117:
            r3.r0(r4, r6, r0)
            goto L_0x0260
        L_0x011c:
            int r4 = r5.readInt()
            r3.d(r4)
            goto L_0x0260
        L_0x0125:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            if (r7 == 0) goto L_0x0152
            if (r5 != 0) goto L_0x013c
            goto L_0x0152
        L_0x013c:
            yvd r6 = defpackage.yvd.a(r7)     // Catch:{ RuntimeException -> 0x014a }
            ob4 r7 = new ob4
            r7.<init>((int) r4, (defpackage.yvd) r6, (android.os.Bundle) r5)
            r3.R(r7)
            goto L_0x0260
        L_0x014a:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommand"
            defpackage.i8b.W(r4, r3)
            goto L_0x0260
        L_0x0152:
            java.lang.String r3 = "Ignoring custom command with null args."
            defpackage.i8b.V(r3)
            goto L_0x0260
        L_0x0159:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.util.ArrayList r5 = r5.createTypedArrayList(r6)
            if (r5 != 0) goto L_0x0167
            goto L_0x0260
        L_0x0167:
            java.lang.ref.WeakReference r6 = r3.c     // Catch:{ RuntimeException -> 0x01a0 }
            java.lang.Object r6 = r6.get()     // Catch:{ RuntimeException -> 0x01a0 }
            np8 r6 = (defpackage.np8) r6     // Catch:{ RuntimeException -> 0x01a0 }
            r7 = -1
            if (r6 != 0) goto L_0x0174
        L_0x0172:
            r6 = r7
            goto L_0x017f
        L_0x0174:
            oxd r6 = r6.k     // Catch:{ RuntimeException -> 0x01a0 }
            if (r6 != 0) goto L_0x0179
            goto L_0x0172
        L_0x0179:
            nxd r6 = r6.a     // Catch:{ RuntimeException -> 0x01a0 }
            int r6 = r6.f()     // Catch:{ RuntimeException -> 0x01a0 }
        L_0x017f:
            if (r6 != r7) goto L_0x0183
            goto L_0x0260
        L_0x0183:
            qb7 r7 = defpackage.tb7.o()     // Catch:{ RuntimeException -> 0x01a0 }
        L_0x0187:
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x01a0 }
            if (r0 >= r2) goto L_0x01a2
            java.lang.Object r2 = r5.get(r0)     // Catch:{ RuntimeException -> 0x01a0 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ RuntimeException -> 0x01a0 }
            r2.getClass()     // Catch:{ RuntimeException -> 0x01a0 }
            e63 r2 = defpackage.e63.b(r6, r2)     // Catch:{ RuntimeException -> 0x01a0 }
            r7.a(r2)     // Catch:{ RuntimeException -> 0x01a0 }
            int r0 = r0 + 1
            goto L_0x0187
        L_0x01a0:
            r3 = move-exception
            goto L_0x01b0
        L_0x01a2:
            k0d r5 = r7.j()     // Catch:{ RuntimeException -> 0x01a0 }
            ud0 r6 = new ud0
            r6.<init>(r4, r5)
            r3.R(r6)
            goto L_0x0260
        L_0x01b0:
            java.lang.String r4 = "Ignoring malformed Bundle for CommandButton"
            defpackage.i8b.W(r4, r3)
            goto L_0x0260
        L_0x01b7:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.M(r4, r5)
            goto L_0x0260
        L_0x01c8:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.G0(r4, r5)
            goto L_0x0260
        L_0x01d9:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.r(r4, r5)
            goto L_0x0260
        L_0x01ea:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0209
            java.lang.String r3 = "onSearchResultChanged(): Ignoring empty query"
            defpackage.i8b.V(r3)
            goto L_0x0260
        L_0x0209:
            if (r6 >= 0) goto L_0x0211
            java.lang.String r3 = "onSearchResultChanged(): Ignoring negative itemCount: "
        L_0x020d:
            defpackage.i2a.m(r6, r3)
            goto L_0x0260
        L_0x0211:
            if (r5 != 0) goto L_0x0214
            goto L_0x0217
        L_0x0214:
            defpackage.ds8.a(r5)     // Catch:{ RuntimeException -> 0x0222 }
        L_0x0217:
            zc8 r4 = new zc8
            r5 = 16
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x0260
        L_0x0222:
            r3 = move-exception
            defpackage.i8b.W(r2, r3)
            goto L_0x0260
        L_0x0227:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.hi7.a(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0246
            java.lang.String r3 = "onChildrenChanged(): Ignoring empty parentId"
            defpackage.i8b.V(r3)
            goto L_0x0260
        L_0x0246:
            if (r6 >= 0) goto L_0x024b
            java.lang.String r3 = "onChildrenChanged(): Ignoring negative itemCount: "
            goto L_0x020d
        L_0x024b:
            if (r5 != 0) goto L_0x024e
            goto L_0x0251
        L_0x024e:
            defpackage.ds8.a(r5)     // Catch:{ RuntimeException -> 0x025c }
        L_0x0251:
            zc8 r4 = new zc8
            r5 = 20
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x0260
        L_0x025c:
            r3 = move-exception
            defpackage.i8b.W(r2, r3)
        L_0x0260:
            return r1
        L_0x0261:
            r6.writeString(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp8.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void r(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new td8(5, gi3.a(bundle)));
            } catch (RuntimeException e) {
                i8b.W("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
                d(i);
            }
        }
    }

    public final void r0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(npb.d, z);
        bundle2.putBoolean(npb.e, true);
        H(i, bundle, bundle2);
    }
}
