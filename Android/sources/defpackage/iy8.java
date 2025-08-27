package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: iy8  reason: default package */
public final class iy8 extends f0 {
    public static final int z0 = (v0g.a >= 31 ? 33554432 : 0);
    public final px8 X;
    public final ao Y;
    public final ComponentName Z;
    public final m7f v;
    public to0 v0;
    public final yx8 w;
    public volatile long w0 = 300000;
    public final ny8 x;
    public mj6 x0;
    public final gy8 y;
    public int y0;
    public final hy z;

    /* JADX WARNING: type inference failed for: r0v2, types: [gy8, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r1.equals(r0) == false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iy8(defpackage.yx8 r11, android.net.Uri r12, android.os.Handler r13) {
        /*
            r10 = this;
            r0 = 3
            r10.<init>(r0)
            r10.w = r11
            android.content.Context r2 = r11.f
            ny8 r0 = defpackage.ny8.a(r2)
            r10.x = r0
            gy8 r0 = new gy8
            r0.<init>()
            r0.v = r10
            us8 r1 = defpackage.us8.J
            r0.a = r1
            java.lang.String r1 = ""
            r0.b = r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.o = r3
            r10.y = r0
            m7f r0 = new m7f
            r0.<init>((defpackage.yx8) r11)
            r10.v = r0
            r3 = 300000(0x493e0, double:1.482197E-318)
            r10.w0 = r3
            hy r1 = new hy
            android.os.Handler r3 = r11.l
            android.os.Looper r3 = r3.getLooper()
            r1.<init>((android.os.Looper) r3, (defpackage.m7f) r0)
            r10.z = r1
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            r1.<init>(r3)
            java.lang.String r4 = r2.getPackageName()
            r1.setPackage(r4)
            r4 = 0
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r4)
            int r1 = r0.size()
            r5 = 1
            r6 = 0
            if (r1 != r5) goto L_0x0071
            java.lang.Object r0 = r0.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r7 = r0.packageName
            java.lang.String r0 = r0.name
            r1.<init>(r7, r0)
            r0 = r1
            goto L_0x0078
        L_0x0071:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0140
            r0 = r6
        L_0x0078:
            r10.Z = r0
            r7 = 31
            if (r0 == 0) goto L_0x0086
            int r1 = defpackage.v0g.a
            if (r1 >= r7) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r1 = r0
        L_0x0084:
            r5 = r4
            goto L_0x009c
        L_0x0086:
            java.lang.String r1 = "androidx.media3.session.MediaLibraryService"
            android.content.ComponentName r1 = W(r2, r1)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = "androidx.media3.session.MediaSessionService"
            android.content.ComponentName r1 = W(r2, r1)
        L_0x0094:
            if (r1 == 0) goto L_0x0084
            boolean r8 = r1.equals(r0)
            if (r8 != 0) goto L_0x0084
        L_0x009c:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r3, r12)
            if (r1 != 0) goto L_0x00dd
            ao r1 = new ao
            r5 = 9
            r1.<init>(r5, r10)
            r10.Y = r1
            android.content.IntentFilter r5 = new android.content.IntentFilter
            r5.<init>(r3)
            java.lang.String r12 = r12.getScheme()
            r5.addDataScheme(r12)
            int r12 = defpackage.v0g.a
            r3 = 33
            if (r12 >= r3) goto L_0x00c2
            r2.registerReceiver(r1, r5)
            goto L_0x00c6
        L_0x00c2:
            r12 = 4
            r2.registerReceiver(r1, r5, r12)
        L_0x00c6:
            java.lang.String r12 = r2.getPackageName()
            r8.setPackage(r12)
            int r12 = z0
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r2, r4, r8, r12)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class r3 = r2.getClass()
            r1.<init>(r2, r3)
            goto L_0x00fe
        L_0x00dd:
            r8.setComponent(r1)
            if (r5 == 0) goto L_0x00f6
            int r12 = defpackage.v0g.a
            r3 = 26
            if (r12 < r3) goto L_0x00ef
            int r12 = z0
            android.app.PendingIntent r12 = android.app.PendingIntent.getForegroundService(r2, r4, r8, r12)
            goto L_0x00fc
        L_0x00ef:
            int r12 = z0
            android.app.PendingIntent r12 = android.app.PendingIntent.getService(r2, r4, r8, r12)
            goto L_0x00fc
        L_0x00f6:
            int r12 = z0
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r2, r4, r8, r12)
        L_0x00fc:
            r10.Y = r6
        L_0x00fe:
            java.lang.String r3 = r11.i
            java.lang.String r4 = "androidx.media3.session.id"
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            java.lang.String r4 = "."
            java.lang.String r3 = android.text.TextUtils.join(r4, r3)
            px8 r8 = new px8
            int r9 = defpackage.v0g.a
            if (r9 >= r7) goto L_0x0114
            r4 = r1
            goto L_0x0115
        L_0x0114:
            r4 = r6
        L_0x0115:
            if (r9 >= r7) goto L_0x0119
            r5 = r12
            goto L_0x011a
        L_0x0119:
            r5 = r6
        L_0x011a:
            oxd r12 = r11.j
            nxd r12 = r12.a
            android.os.Bundle r6 = r12.getExtras()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r10.X = r8
            if (r9 < r7) goto L_0x012f
            if (r0 == 0) goto L_0x012f
            defpackage.ey8.a(r8, r0)
        L_0x012f:
            android.app.PendingIntent r11 = r11.t
            if (r11 == 0) goto L_0x013a
            kx8 r12 = r8.a
            android.media.session.MediaSession r12 = r12.a
            r12.setSessionActivity(r11)
        L_0x013a:
            kx8 r11 = r8.a
            r11.c(r10, r13)
            return
        L_0x0140:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found "
            r11.<init>(r12)
            int r12 = r0.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy8.<init>(yx8, android.net.Uri, android.os.Handler):void");
    }

    /* JADX INFO: finally extract failed */
    public static void P(px8 px8, vs8 vs8) {
        kx8 kx8 = px8.a;
        kx8.i = vs8;
        MediaMetadata mediaMetadata = vs8.b;
        if (mediaMetadata == null) {
            Parcel obtain = Parcel.obtain();
            try {
                vs8.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                vs8.b = mediaMetadata2;
                obtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        kx8.a.setMetadata(mediaMetadata);
    }

    public static void Q(iy8 iy8, ypb ypb) {
        iy8.getClass();
        int i = ypb.J0(20) ? 4 : 0;
        if (iy8.y0 != i) {
            iy8.y0 = i;
            iy8.X.a.a.setFlags(i | 3);
        }
    }

    public static void R(px8 px8, ArrayList arrayList) {
        if (arrayList != null) {
            px8.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mx8 mx8 = (mx8) it.next();
                if (mx8 != null) {
                    long j = mx8.b;
                    if (hashSet.contains(Long.valueOf(j))) {
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(j));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        kx8 kx8 = px8.a;
        kx8.h = arrayList;
        MediaSession mediaSession = kx8.a;
        if (arrayList == null) {
            mediaSession.setQueue((List) null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            mx8 mx82 = (mx8) it2.next();
            MediaSession.QueueItem queueItem = mx82.c;
            if (queueItem == null) {
                queueItem = lx8.a(mx82.a.b(), mx82.b);
                mx82.c = queueItem;
            }
            queueItem.getClass();
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [jk3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [qq8, sq8] */
    public static ir8 S(String str, Uri uri, String str2, Bundle bundle) {
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        Collections.emptyList();
        k0d k0d2 = k0d.v;
        uq8 uq8 = new uq8();
        ar8 ar8 = ar8.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        ? obj = new Object();
        obj.a = uri;
        obj.b = str2;
        obj.c = bundle;
        return new ir8(str3, new qq8(oq8), (xq8) null, new wq8(uq8), us8.J, new ar8(obj));
    }

    public static ComponentName W(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void A(float f) {
        if (f > c44.DEFAULT_ASPECT_RATIO) {
            T(13, new qb4(this, f), this.X.b(), true);
        }
    }

    public final void B(upc upc) {
        C(upc);
    }

    public final void C(upc upc) {
        rpc q = ft7.q(upc);
        if (q == null) {
            i8b.V("Ignoring invalid RatingCompat " + upc);
            return;
        }
        V((yvd) null, 40010, new zx8(this, q), this.X.b());
    }

    public final void D(int i) {
        T(15, new cy8(this, i, 0), this.X.b(), true);
    }

    public final void E(int i) {
        T(14, new cy8(this, i, 1), this.X.b(), true);
    }

    public final void F() {
        boolean J0 = this.w.s.J0(9);
        px8 px8 = this.X;
        if (J0) {
            T(9, new zx8(this, 8), px8.b(), true);
        } else {
            T(8, new zx8(this, 9), px8.b(), true);
        }
    }

    public final void G() {
        boolean J0 = this.w.s.J0(7);
        px8 px8 = this.X;
        if (J0) {
            T(7, new zx8(this, 2), px8.b(), true);
        } else {
            T(6, new zx8(this, 3), px8.b(), true);
        }
    }

    public final void H(long j) {
        if (j >= 0) {
            T(10, new ay8(this, j, 0), this.X.b(), true);
        }
    }

    public final void I() {
        T(3, new zx8(this, 6), this.X.b(), true);
    }

    public final void T(int i, hy8 hy8, ly8 ly8, boolean z2) {
        yx8 yx8 = this.w;
        if (!yx8.i()) {
            if (ly8 == null) {
                i8b.m("RemoteUserInfo is null, ignoring command=" + i);
                return;
            }
            v0g.W(yx8.l, new dy8(this, i, ly8, hy8, z2));
        }
    }

    public final void V(yvd yvd, int i, hy8 hy8, ly8 ly8) {
        if (ly8 == null) {
            StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = yvd;
            if (yvd == null) {
                obj = Integer.valueOf(i);
            }
            sb.append(obj);
            i8b.m(sb.toString());
            return;
        }
        v0g.W(this.w.l, new uy0(this, yvd, i, ly8, hy8, 3));
    }

    public final void X(ir8 ir8, boolean z2) {
        T(31, new ij5(this, ir8, z2, 5), this.X.b(), false);
    }

    public final cx8 Y(ly8 ly8) {
        cx8 k = this.v.k(ly8);
        if (k == null) {
            ly8 ly82 = ly8;
            k = new cx8(ly82, 0, 0, this.x.b(ly8), new fy8(ly8), Bundle.EMPTY);
            ax8 l = this.w.l(k);
            this.v.c(ly8, k, l.a, l.b);
        }
        hy hyVar = this.z;
        long j = this.w0;
        hyVar.removeMessages(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, k);
        hyVar.sendMessageDelayed(hyVar.obtainMessage(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, k), j);
        return k;
    }

    public final void Z(ypb ypb) {
        v0g.W(this.w.l, new by8(this, ypb, 1));
    }

    public final void i(zp8 zp8) {
        if (zp8 != null) {
            T(20, new oj0((Object) this, (Object) zp8, -1, 9), this.X.b(), false);
        }
    }

    public final void j(zp8 zp8, int i) {
        if (zp8 == null) {
            return;
        }
        if (i == -1 || i >= 0) {
            T(20, new oj0((Object) this, (Object) zp8, i, 9), this.X.b(), false);
        }
    }

    public final void k(String str, Bundle bundle, ResultReceiver resultReceiver) {
        n79.o(str);
        if (!TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) || resultReceiver == null) {
            yvd yvd = new yvd(str, Bundle.EMPTY);
            V(yvd, 0, new u00(this, yvd, bundle, resultReceiver), this.X.b());
            return;
        }
        resultReceiver.send(0, this.w.j.b());
    }

    public final void l(String str, Bundle bundle) {
        yvd yvd = new yvd(str, Bundle.EMPTY);
        V(yvd, 0, new g18(this, yvd, bundle, 13), this.X.b());
    }

    public final void m() {
        T(12, new zx8(this, 0), this.X.b(), true);
    }

    public final boolean n(Intent intent) {
        ly8 b = this.X.b();
        b.getClass();
        return this.w.n(new cx8(b, 0, 0, false, (bx8) null, Bundle.EMPTY), intent);
    }

    public final void o() {
        T(1, new zx8(this, 11), this.X.b(), true);
    }

    public final void p() {
        T(1, new zx8(this, 10), this.X.b(), false);
    }

    public final void q(String str, Bundle bundle) {
        X(S(str, (Uri) null, (String) null, bundle), true);
    }

    public final void r(String str, Bundle bundle) {
        X(S((String) null, (Uri) null, str, bundle), true);
    }

    public final void s(Uri uri, Bundle bundle) {
        X(S((String) null, uri, (String) null, bundle), true);
    }

    public final void t() {
        T(2, new zx8(this, 5), this.X.b(), true);
    }

    public final void u(String str, Bundle bundle) {
        X(S(str, (Uri) null, (String) null, bundle), false);
    }

    public final void v(String str, Bundle bundle) {
        X(S((String) null, (Uri) null, str, bundle), false);
    }

    public final void w(Uri uri, Bundle bundle) {
        X(S((String) null, uri, (String) null, bundle), false);
    }

    public final void x(zp8 zp8) {
        if (zp8 != null) {
            T(20, new g18(14, this, zp8), this.X.b(), true);
        }
    }

    public final void y() {
        T(11, new zx8(this, 4), this.X.b(), true);
    }

    public final void z(long j) {
        T(5, new ay8(this, j, 1), this.X.b(), true);
    }
}
