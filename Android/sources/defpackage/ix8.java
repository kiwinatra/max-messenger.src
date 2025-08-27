package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaSession;
import android.view.KeyEvent;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ix8  reason: default package */
public final class ix8 extends Binder implements h67 {
    public static final /* synthetic */ int d = 0;
    public final AtomicReference c;

    public ix8(kx8 kx8) {
        attachInterface(this, IMediaSession.DESCRIPTOR);
        this.c = new AtomicReference(kx8);
    }

    public final void C0(zp8 zp8) {
        throw new AssertionError();
    }

    public final void T(String str, Bundle bundle, nx8 nx8) {
        throw new AssertionError();
    }

    public final void W(e67 e67) {
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 != null && e67 != null) {
            jx8.f.unregister(e67);
            Binder.getCallingPid();
            Binder.getCallingUid();
            synchronized (jx8.d) {
            }
        }
    }

    public final void adjustVolume(int i, int i2, String str) {
        throw new AssertionError();
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void f0(e67 e67) {
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 != null && e67 != null) {
            jx8.f.register(e67, new ly8("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (jx8.d) {
            }
        }
    }

    public final void fastForward() {
        throw new AssertionError();
    }

    public final Bundle getExtras() {
        throw new AssertionError();
    }

    public final long getFlags() {
        throw new AssertionError();
    }

    public final PendingIntent getLaunchPendingIntent() {
        throw new AssertionError();
    }

    public final vs8 getMetadata() {
        throw new AssertionError();
    }

    public final String getPackageName() {
        throw new AssertionError();
    }

    public final mob getPlaybackState() {
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 == null) {
            return null;
        }
        mob mob = jx8.g;
        vs8 vs8 = jx8.i;
        if (mob == null) {
            return mob;
        }
        long j = mob.b;
        long j2 = -1;
        if (j == -1) {
            return mob;
        }
        int i = mob.a;
        if (i != 3 && i != 4 && i != 5) {
            return mob;
        }
        long j3 = mob.y;
        if (j3 <= 0) {
            return mob;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (mob.o * ((float) (elapsedRealtime - j3)))) + j;
        if (vs8 != null && vs8.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j2 = vs8.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        long j5 = (j2 < 0 || j4 <= j2) ? j4 < 0 ? 0 : j4 : j2;
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = mob.z;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new mob(mob.a, j5, mob.c, mob.o, mob.v, mob.w, mob.x, elapsedRealtime, arrayList, mob.X, mob.Y);
    }

    public final List getQueue() {
        return null;
    }

    public final CharSequence getQueueTitle() {
        throw new AssertionError();
    }

    public final int getRatingType() {
        jx8 jx8 = (jx8) this.c.get();
        return 0;
    }

    public final int getRepeatMode() {
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 != null) {
            return jx8.j;
        }
        return -1;
    }

    public final Bundle getSessionInfo() {
        Bundle bundle;
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 == null || (bundle = jx8.e) == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final int getShuffleMode() {
        jx8 jx8 = (jx8) this.c.get();
        if (jx8 != null) {
            return jx8.k;
        }
        return -1;
    }

    public final String getTag() {
        throw new AssertionError();
    }

    public final j8b getVolumeAttributes() {
        throw new AssertionError();
    }

    public final boolean isCaptioningEnabled() {
        jx8 jx8 = (jx8) this.c.get();
        return false;
    }

    public final boolean isTransportControlEnabled() {
        throw new AssertionError();
    }

    public final void j0(zp8 zp8) {
        throw new AssertionError();
    }

    public final void k(upc upc, Bundle bundle) {
        throw new AssertionError();
    }

    public final void n(upc upc) {
        throw new AssertionError();
    }

    public final void next() {
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nx8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.view.KeyEvent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: upc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: zp8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: zp8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: zp8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [e67] */
    /* JADX WARNING: type inference failed for: r4v8, types: [d67, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v11, types: [e67] */
    /* JADX WARNING: type inference failed for: r4v12, types: [d67, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v51 */
    /* JADX WARNING: type inference failed for: r4v52 */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r4v54 */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r4v58 */
    /* JADX WARNING: type inference failed for: r4v59 */
    /* JADX WARNING: type inference failed for: r4v60 */
    /* JADX WARNING: type inference failed for: r4v61 */
    /* JADX WARNING: type inference failed for: r4v62 */
    /* JADX WARNING: type inference failed for: r4v63 */
    /* JADX WARNING: type inference failed for: r4v64 */
    /* JADX WARNING: type inference failed for: r4v65 */
    /* JADX WARNING: type inference failed for: r4v66 */
    /* JADX WARNING: type inference failed for: r4v67 */
    /* JADX WARNING: type inference failed for: r4v68 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r1 = 1
            java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
            if (r6 == r0) goto L_0x04cd
            java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
            r3 = 0
            r4 = 0
            switch(r6) {
                case 1: goto L_0x049d;
                case 2: goto L_0x047d;
                case 3: goto L_0x0454;
                case 4: goto L_0x042b;
                case 5: goto L_0x041a;
                case 6: goto L_0x0409;
                case 7: goto L_0x03f8;
                case 8: goto L_0x03de;
                case 9: goto L_0x03cd;
                case 10: goto L_0x03b3;
                case 11: goto L_0x039a;
                case 12: goto L_0x0381;
                case 13: goto L_0x0374;
                case 14: goto L_0x0354;
                case 15: goto L_0x0334;
                case 16: goto L_0x0308;
                case 17: goto L_0x02f7;
                case 18: goto L_0x02ea;
                case 19: goto L_0x02dd;
                case 20: goto L_0x02d0;
                case 21: goto L_0x02c3;
                case 22: goto L_0x02b6;
                case 23: goto L_0x02a9;
                case 24: goto L_0x0298;
                case 25: goto L_0x027c;
                case 26: goto L_0x025c;
                case 27: goto L_0x0240;
                case 28: goto L_0x0226;
                case 29: goto L_0x0215;
                case 30: goto L_0x01fb;
                case 31: goto L_0x01e1;
                case 32: goto L_0x01d0;
                case 33: goto L_0x01c3;
                case 34: goto L_0x01a3;
                case 35: goto L_0x0183;
                case 36: goto L_0x0157;
                case 37: goto L_0x0146;
                case 38: goto L_0x0139;
                case 39: goto L_0x0128;
                case 40: goto L_0x011b;
                case 41: goto L_0x00ff;
                case 42: goto L_0x00df;
                case 43: goto L_0x00c3;
                case 44: goto L_0x00b2;
                case 45: goto L_0x00a1;
                case 46: goto L_0x008d;
                case 47: goto L_0x007c;
                case 48: goto L_0x006b;
                case 49: goto L_0x005a;
                case 50: goto L_0x0040;
                case 51: goto L_0x0014;
                default: goto L_0x000f;
            }
        L_0x000f:
            boolean r5 = super.onTransact(r6, r7, r8, r9)
            return r5
        L_0x0014:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x0026
            android.os.Parcelable$Creator<upc> r6 = defpackage.upc.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            upc r6 = (defpackage.upc) r6
            goto L_0x0027
        L_0x0026:
            r6 = r4
        L_0x0027:
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0036
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x0036:
            r5.k(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0040:
            r7.enforceInterface(r2)
            android.os.Bundle r5 = r5.getSessionInfo()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x0056
            r8.writeInt(r1)
            r5.writeToParcel(r8, r1)
            goto L_0x0059
        L_0x0056:
            r8.writeInt(r3)
        L_0x0059:
            return r1
        L_0x005a:
            r7.enforceInterface(r2)
            float r6 = r7.readFloat()
            r5.setPlaybackSpeed(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x006b:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            r5.setShuffleMode(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x007c:
            r7.enforceInterface(r2)
            int r5 = r5.getShuffleMode()
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x008d:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x0097
            r3 = r1
        L_0x0097:
            r5.setCaptioningEnabled(r3)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x00a1:
            r7.enforceInterface(r2)
            boolean r5 = r5.isCaptioningEnabled()
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x00b2:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            r5.removeQueueItemAt(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x00c3:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x00d5
            android.os.Parcelable$Creator<zp8> r6 = defpackage.zp8.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            r4 = r6
            zp8 r4 = (defpackage.zp8) r4
        L_0x00d5:
            r5.j0(r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x00df:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x00f1
            android.os.Parcelable$Creator<zp8> r6 = defpackage.zp8.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            r4 = r6
            zp8 r4 = (defpackage.zp8) r4
        L_0x00f1:
            int r6 = r7.readInt()
            r5.u0(r4, r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x00ff:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x0111
            android.os.Parcelable$Creator<zp8> r6 = defpackage.zp8.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            r4 = r6
            zp8 r4 = (defpackage.zp8) r4
        L_0x0111:
            r5.C0(r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x011b:
            r7.enforceInterface(r2)
            r7.readInt()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0128:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            r5.setRepeatMode(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0139:
            r7.enforceInterface(r2)
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r3)
            return r1
        L_0x0146:
            r7.enforceInterface(r2)
            int r5 = r5.getRepeatMode()
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x0157:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x0169
            android.os.Parcelable$Creator r6 = android.net.Uri.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            android.net.Uri r6 = (android.net.Uri) r6
            goto L_0x016a
        L_0x0169:
            r6 = r4
        L_0x016a:
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0179
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x0179:
            r5.prepareFromUri(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0183:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0199
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x0199:
            r5.prepareFromSearch(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x01a3:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x01b9
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x01b9:
            r5.prepareFromMediaId(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x01c3:
            r7.enforceInterface(r2)
            r5.prepare()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x01d0:
            r7.enforceInterface(r2)
            int r5 = r5.getRatingType()
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x01e1:
            r7.enforceInterface(r2)
            android.os.Bundle r5 = r5.getExtras()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x01f7
            r8.writeInt(r1)
            r5.writeToParcel(r8, r1)
            goto L_0x01fa
        L_0x01f7:
            r8.writeInt(r3)
        L_0x01fa:
            return r1
        L_0x01fb:
            r7.enforceInterface(r2)
            java.lang.CharSequence r5 = r5.getQueueTitle()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x0211
            r8.writeInt(r1)
            android.text.TextUtils.writeToParcel(r5, r8, r1)
            goto L_0x0214
        L_0x0211:
            r8.writeInt(r3)
        L_0x0214:
            return r1
        L_0x0215:
            r7.enforceInterface(r2)
            java.util.List r5 = r5.getQueue()
            r8.getClass()
            r8.writeNoException()
            r8.writeTypedList(r5)
            return r1
        L_0x0226:
            r7.enforceInterface(r2)
            mob r5 = r5.getPlaybackState()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x023c
            r8.writeInt(r1)
            r5.writeToParcel(r8, r1)
            goto L_0x023f
        L_0x023c:
            r8.writeInt(r3)
        L_0x023f:
            return r1
        L_0x0240:
            r7.enforceInterface(r2)
            vs8 r5 = r5.getMetadata()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x0258
            r8.writeInt(r1)
            android.os.Bundle r5 = r5.a
            r8.writeBundle(r5)
            goto L_0x025b
        L_0x0258:
            r8.writeInt(r3)
        L_0x025b:
            return r1
        L_0x025c:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x0272
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x0272:
            r5.sendCustomAction(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x027c:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x028e
            android.os.Parcelable$Creator<upc> r6 = defpackage.upc.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            r4 = r6
            upc r4 = (defpackage.upc) r4
        L_0x028e:
            r5.n(r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0298:
            r7.enforceInterface(r2)
            long r6 = r7.readLong()
            r5.seekTo(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02a9:
            r7.enforceInterface(r2)
            r5.rewind()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02b6:
            r7.enforceInterface(r2)
            r5.fastForward()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02c3:
            r7.enforceInterface(r2)
            r5.previous()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02d0:
            r7.enforceInterface(r2)
            r5.next()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02dd:
            r7.enforceInterface(r2)
            r5.stop()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02ea:
            r7.enforceInterface(r2)
            r5.pause()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x02f7:
            r7.enforceInterface(r2)
            long r6 = r7.readLong()
            r5.skipToQueueItem(r6)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0308:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x031a
            android.os.Parcelable$Creator r6 = android.net.Uri.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            android.net.Uri r6 = (android.net.Uri) r6
            goto L_0x031b
        L_0x031a:
            r6 = r4
        L_0x031b:
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x032a
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x032a:
            r5.playFromUri(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0334:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x034a
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x034a:
            r5.playFromSearch(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0354:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x036a
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r7 = r9.createFromParcel(r7)
            r4 = r7
            android.os.Bundle r4 = (android.os.Bundle) r4
        L_0x036a:
            r5.playFromMediaId(r6, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0374:
            r7.enforceInterface(r2)
            r5.play()
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0381:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            int r9 = r7.readInt()
            java.lang.String r7 = r7.readString()
            r5.setVolumeTo(r6, r9, r7)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x039a:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            int r9 = r7.readInt()
            java.lang.String r7 = r7.readString()
            r5.adjustVolume(r6, r9, r7)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x03b3:
            r7.enforceInterface(r2)
            j8b r5 = r5.getVolumeAttributes()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x03c9
            r8.writeInt(r1)
            r5.writeToParcel(r8, r1)
            goto L_0x03cc
        L_0x03c9:
            r8.writeInt(r3)
        L_0x03cc:
            return r1
        L_0x03cd:
            r7.enforceInterface(r2)
            long r5 = r5.getFlags()
            r8.getClass()
            r8.writeNoException()
            r8.writeLong(r5)
            return r1
        L_0x03de:
            r7.enforceInterface(r2)
            android.app.PendingIntent r5 = r5.getLaunchPendingIntent()
            r8.getClass()
            r8.writeNoException()
            if (r5 == 0) goto L_0x03f4
            r8.writeInt(r1)
            r5.writeToParcel(r8, r1)
            goto L_0x03f7
        L_0x03f4:
            r8.writeInt(r3)
        L_0x03f7:
            return r1
        L_0x03f8:
            r7.enforceInterface(r2)
            java.lang.String r5 = r5.getTag()
            r8.getClass()
            r8.writeNoException()
            r8.writeString(r5)
            return r1
        L_0x0409:
            r7.enforceInterface(r2)
            java.lang.String r5 = r5.getPackageName()
            r8.getClass()
            r8.writeNoException()
            r8.writeString(r5)
            return r1
        L_0x041a:
            r7.enforceInterface(r2)
            boolean r5 = r5.isTransportControlEnabled()
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x042b:
            r7.enforceInterface(r2)
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x0435
            goto L_0x044a
        L_0x0435:
            android.os.IInterface r7 = r6.queryLocalInterface(r0)
            if (r7 == 0) goto L_0x0443
            boolean r9 = r7 instanceof defpackage.e67
            if (r9 == 0) goto L_0x0443
            r4 = r7
            e67 r4 = (defpackage.e67) r4
            goto L_0x044a
        L_0x0443:
            d67 r4 = new d67
            r4.<init>()
            r4.c = r6
        L_0x044a:
            r5.W(r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x0454:
            r7.enforceInterface(r2)
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x045e
            goto L_0x0473
        L_0x045e:
            android.os.IInterface r7 = r6.queryLocalInterface(r0)
            if (r7 == 0) goto L_0x046c
            boolean r9 = r7 instanceof defpackage.e67
            if (r9 == 0) goto L_0x046c
            r4 = r7
            e67 r4 = (defpackage.e67) r4
            goto L_0x0473
        L_0x046c:
            d67 r4 = new d67
            r4.<init>()
            r4.c = r6
        L_0x0473:
            r5.f0(r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x047d:
            r7.enforceInterface(r2)
            int r6 = r7.readInt()
            if (r6 == 0) goto L_0x048f
            android.os.Parcelable$Creator r6 = android.view.KeyEvent.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r7)
            r4 = r6
            android.view.KeyEvent r4 = (android.view.KeyEvent) r4
        L_0x048f:
            boolean r5 = r5.sendMediaButton(r4)
            r8.getClass()
            r8.writeNoException()
            r8.writeInt(r5)
            return r1
        L_0x049d:
            r7.enforceInterface(r2)
            java.lang.String r6 = r7.readString()
            int r9 = r7.readInt()
            if (r9 == 0) goto L_0x04b3
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r7)
            android.os.Bundle r9 = (android.os.Bundle) r9
            goto L_0x04b4
        L_0x04b3:
            r9 = r4
        L_0x04b4:
            int r0 = r7.readInt()
            if (r0 == 0) goto L_0x04c3
            android.os.Parcelable$Creator<nx8> r0 = defpackage.nx8.CREATOR
            java.lang.Object r7 = r0.createFromParcel(r7)
            r4 = r7
            nx8 r4 = (defpackage.nx8) r4
        L_0x04c3:
            r5.T(r6, r9, r4)
            r8.getClass()
            r8.writeNoException()
            return r1
        L_0x04cd:
            r8.getClass()
            r8.writeString(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix8.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void pause() {
        throw new AssertionError();
    }

    public final void play() {
        throw new AssertionError();
    }

    public final void playFromMediaId(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void playFromSearch(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void playFromUri(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    public final void prepare() {
        throw new AssertionError();
    }

    public final void prepareFromMediaId(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void prepareFromSearch(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void prepareFromUri(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    public final void previous() {
        throw new AssertionError();
    }

    public final void removeQueueItemAt(int i) {
        throw new AssertionError();
    }

    public final void rewind() {
        throw new AssertionError();
    }

    public final void seekTo(long j) {
        throw new AssertionError();
    }

    public final void sendCustomAction(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final boolean sendMediaButton(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    public final void setCaptioningEnabled(boolean z) {
        throw new AssertionError();
    }

    public final void setPlaybackSpeed(float f) {
        throw new AssertionError();
    }

    public final void setRepeatMode(int i) {
        throw new AssertionError();
    }

    public final void setShuffleMode(int i) {
        throw new AssertionError();
    }

    public final void setVolumeTo(int i, int i2, String str) {
        throw new AssertionError();
    }

    public final void skipToQueueItem(long j) {
        throw new AssertionError();
    }

    public final void stop() {
        throw new AssertionError();
    }

    public final void u0(zp8 zp8, int i) {
        throw new AssertionError();
    }
}
