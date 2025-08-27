package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.IMediaControllerCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: to8  reason: default package */
public final class to8 extends Binder implements e67 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public to8(rp8 rp8) {
        attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        this.c = new WeakReference(rp8);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void g(mob mob) {
        rp8 rp8 = (rp8) this.c.get();
        if (rp8 != null) {
            rp8.i(2, mob, (Bundle) null);
        }
    }

    public final void onExtrasChanged(Bundle bundle) {
        throw new AssertionError();
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        throw new AssertionError();
    }

    public final void onRepeatModeChanged(int i) {
        rp8 rp8 = (rp8) this.c.get();
        if (rp8 != null) {
            rp8.i(9, Integer.valueOf(i), (Bundle) null);
        }
    }

    public final void onSessionDestroyed() {
        throw new AssertionError();
    }

    public final void onShuffleModeChanged(int i) {
        rp8 rp8 = (rp8) this.c.get();
        if (rp8 != null) {
            rp8.i(12, Integer.valueOf(i), (Bundle) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: mob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: vs8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: j8b} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r1 = 1
            java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
            if (r5 == r0) goto L_0x0103
            java.lang.ref.WeakReference r0 = r4.c
            r3 = 0
            switch(r5) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00da;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a1;
                case 6: goto L_0x008b;
                case 7: goto L_0x0075;
                case 8: goto L_0x005f;
                case 9: goto L_0x0054;
                case 10: goto L_0x004d;
                case 11: goto L_0x002f;
                case 12: goto L_0x0024;
                case 13: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r4 = super.onTransact(r5, r6, r7, r8)
            return r4
        L_0x0013:
            r6.enforceInterface(r2)
            java.lang.Object r4 = r0.get()
            rp8 r4 = (defpackage.rp8) r4
            if (r4 == 0) goto L_0x0023
            r5 = 13
            r4.i(r5, r3, r3)
        L_0x0023:
            return r1
        L_0x0024:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            r4.onShuffleModeChanged(r5)
            return r1
        L_0x002f:
            r6.enforceInterface(r2)
            int r4 = r6.readInt()
            if (r4 == 0) goto L_0x003a
            r4 = r1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            java.lang.Object r5 = r0.get()
            rp8 r5 = (defpackage.rp8) r5
            if (r5 == 0) goto L_0x004c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 11
            r5.i(r6, r4, r3)
        L_0x004c:
            return r1
        L_0x004d:
            r6.enforceInterface(r2)
            r6.readInt()
            return r1
        L_0x0054:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            r4.onRepeatModeChanged(r5)
            return r1
        L_0x005f:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x0071
            android.os.Parcelable$Creator<j8b> r5 = defpackage.j8b.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            j8b r3 = (defpackage.j8b) r3
        L_0x0071:
            r4.t(r3)
            return r1
        L_0x0075:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x0087
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.os.Bundle r3 = (android.os.Bundle) r3
        L_0x0087:
            r4.onExtrasChanged(r3)
            return r1
        L_0x008b:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x009d
            android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L_0x009d:
            r4.onQueueTitleChanged(r3)
            return r1
        L_0x00a1:
            r6.enforceInterface(r2)
            android.os.Parcelable$Creator<mx8> r5 = defpackage.mx8.CREATOR
            java.util.ArrayList r5 = r6.createTypedArrayList(r5)
            r4.q(r5)
            return r1
        L_0x00ae:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x00c0
            android.os.Parcelable$Creator<vs8> r5 = defpackage.vs8.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            vs8 r3 = (defpackage.vs8) r3
        L_0x00c0:
            r4.z0(r3)
            return r1
        L_0x00c4:
            r6.enforceInterface(r2)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x00d6
            android.os.Parcelable$Creator<mob> r5 = defpackage.mob.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            mob r3 = (defpackage.mob) r3
        L_0x00d6:
            r4.g(r3)
            return r1
        L_0x00da:
            r6.enforceInterface(r2)
            r4.onSessionDestroyed()
            return r1
        L_0x00e1:
            r6.enforceInterface(r2)
            java.lang.String r4 = r6.readString()
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x00f7
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.os.Bundle r3 = (android.os.Bundle) r3
        L_0x00f7:
            java.lang.Object r5 = r0.get()
            rp8 r5 = (defpackage.rp8) r5
            if (r5 == 0) goto L_0x0102
            r5.i(r1, r4, r3)
        L_0x0102:
            return r1
        L_0x0103:
            r7.getClass()
            r7.writeString(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to8.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void q(ArrayList arrayList) {
        throw new AssertionError();
    }

    public final void t(j8b j8b) {
        throw new AssertionError();
    }

    public final void z0(vs8 vs8) {
        throw new AssertionError();
    }
}
