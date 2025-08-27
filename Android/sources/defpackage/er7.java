package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.maps.model.CameraPosition;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.UByte;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* renamed from: er7  reason: default package */
public final class er7 implements jf7, gv3, by9, vla, dn1, zd5, qk3, ReadWriteProperty, p28, BitmapLoadCallback, kfb, Provider, pr4 {
    public static final c0h c = new c0h(1);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ er7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static er7 F(je3 je3) {
        er7 er7 = new er7(10);
        je3.b(new ba(15, er7, je3));
        return er7;
    }

    public static boolean N(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static qb0 T(bb0 bb0) {
        qb0 qb0 = bb0.a;
        ha7 ha7 = (ha7) qb0.a;
        Rect rect = qb0.e;
        try {
            byte[] X = ld9.X(ha7, rect, bb0.b, qb0.f);
            try {
                na5 na5 = new na5(new ab5((InputStream) new ByteArrayInputStream(X)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                RectF rectF = grf.a;
                Matrix matrix = new Matrix(qb0.g);
                matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
                return new qb0(X, na5, 256, size, rect2, qb0.f, matrix, qb0.h);
            } catch (IOException e) {
                throw new Exception("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new Exception("Failed to encode the image to JPEG.", e2);
        }
    }

    public static void V(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public void A() {
        KProperty[] kPropertyArr = GifViewerWidget.X;
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        gifViewerWidget.h0().u(gifViewerWidget.d0(), gifViewerWidget.c0());
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [bvg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e4 B(defpackage.sf8 r6) {
        /*
            r5 = this;
            rf8 r6 = r6.a
            java.lang.Object r5 = r5.b
            wsb r5 = (defpackage.wsb) r5
            r5.getClass()
            java.lang.String r0 = "MarkerOptions must not be null."
            defpackage.vzg.n(r6, r0)     // Catch:{ RemoteException -> 0x004e }
            java.lang.Object r5 = r5.a     // Catch:{ RemoteException -> 0x004e }
            o3h r5 = (defpackage.o3h) r5     // Catch:{ RemoteException -> 0x004e }
            android.os.Parcel r0 = r5.H0()     // Catch:{ RemoteException -> 0x004e }
            defpackage.hzg.b(r0, r6)     // Catch:{ RemoteException -> 0x004e }
            r1 = 11
            android.os.Parcel r5 = r5.R(r0, r1)     // Catch:{ RemoteException -> 0x004e }
            android.os.IBinder r0 = r5.readStrongBinder()     // Catch:{ RemoteException -> 0x004e }
            int r1 = defpackage.txg.d     // Catch:{ RemoteException -> 0x004e }
            r1 = 0
            if (r0 != 0) goto L_0x002a
            r3 = r1
            goto L_0x003d
        L_0x002a:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
            android.os.IInterface r3 = r0.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x004e }
            boolean r4 = r3 instanceof defpackage.uxg     // Catch:{ RemoteException -> 0x004e }
            if (r4 == 0) goto L_0x0037
            uxg r3 = (defpackage.uxg) r3     // Catch:{ RemoteException -> 0x004e }
            goto L_0x003d
        L_0x0037:
            oxg r3 = new oxg     // Catch:{ RemoteException -> 0x004e }
            r4 = 3
            r3.<init>(r0, r2, r4)     // Catch:{ RemoteException -> 0x004e }
        L_0x003d:
            r5.recycle()     // Catch:{ RemoteException -> 0x004e }
            if (r3 == 0) goto L_0x0056
            int r5 = r6.z0     // Catch:{ RemoteException -> 0x004e }
            r6 = 1
            if (r5 != r6) goto L_0x0050
            dc r5 = new dc     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
        L_0x004c:
            r1 = r5
            goto L_0x0056
        L_0x004e:
            r5 = move-exception
            goto L_0x005e
        L_0x0050:
            mf8 r5 = new mf8     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
            goto L_0x004c
        L_0x0056:
            e4 r5 = new e4
            r6 = 24
            r5.<init>((int) r6, (java.lang.Object) r1)
            return r5
        L_0x005e:
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er7.B(sf8):e4");
    }

    public p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        long j3;
        IOException iOException2 = iOException;
        p8b p8b = (p8b) s28;
        n64 n64 = (n64) this.b;
        n64.getClass();
        long j4 = p8b.a;
        sne sne = p8b.o;
        k28 k28 = new k28(j4, p8b.b, sne.c, sne.o, j, j2, sne.b);
        n64.n.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        p01 C = j3 == -9223372036854775807L ? w28.x : w28.C(j3, false);
        n64.q.i(k28, p8b.c, iOException2, !C.a());
        return C;
    }

    public Object D(Object obj) {
        qb0 T;
        bb0 bb0 = (bb0) obj;
        qb0 qb0 = bb0.a;
        try {
            int i = qb0.c;
            Object obj2 = qb0.a;
            if (i == 35) {
                T = T(bb0);
            } else if (i == 256 || i == 4101) {
                T = S(bb0, i);
            } else {
                throw new IllegalArgumentException("Unexpected format: " + i);
            }
            ((ha7) obj2).close();
            return T;
        } catch (Throwable th) {
            ((ha7) qb0.a).close();
            throw th;
        }
    }

    public wie E() {
        return new wie(9, (Object) c5b.a((pz9) this.b));
    }

    public boolean G(String str) {
        String M = M(str);
        return "1".equals(M) || Boolean.parseBoolean(M);
    }

    public u6h H() {
        wsb wsb = (wsb) this.b;
        wsb.getClass();
        try {
            o3h o3h = (o3h) wsb.a;
            Parcel R = o3h.R(o3h.H0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = hzg.a;
            CameraPosition cameraPosition = (CameraPosition) (R.readInt() == 0 ? null : creator.createFromParcel(R));
            R.recycle();
            return new u6h(8, cameraPosition);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer I(String str) {
        String M = M(str);
        if (TextUtils.isEmpty(M)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(M));
        } catch (NumberFormatException unused) {
            V(str);
            return null;
        }
    }

    public JSONArray J(String str) {
        String M = M(str);
        if (TextUtils.isEmpty(M)) {
            return null;
        }
        try {
            return new JSONArray(M);
        } catch (JSONException unused) {
            V(str);
            return null;
        }
    }

    public int K() {
        wsb wsb = (wsb) this.b;
        wsb.getClass();
        try {
            o3h o3h = (o3h) wsb.a;
            Parcel R = o3h.R(o3h.H0(), 15);
            int readInt = R.readInt();
            R.recycle();
            if (readInt == 0) {
                return 0;
            }
            if (readInt == 1) {
                return 1;
            }
            int i = 2;
            if (readInt != 2) {
                i = 3;
                if (readInt != 3) {
                    i = 4;
                    if (readInt != 4) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown google map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(readInt)}, 1)));
                    }
                }
            }
            return i;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public String L(Resources resources, String str, String str2) {
        String[] strArr;
        String M = M(str2);
        if (!TextUtils.isEmpty(M)) {
            return M;
        }
        String M2 = M(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(M2)) {
            return null;
        }
        int identifier = resources.getIdentifier(M2, "string", str);
        if (identifier == 0) {
            V(str2.concat("_loc_key"));
            return null;
        }
        JSONArray J = J(str2.concat("_loc_args"));
        if (J == null) {
            strArr = null;
        } else {
            int length = J.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = J.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            V(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public String M(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void O(b89 b89) {
        String str = b89.x;
        z68.c("er7", "got broken message element, text: %s, elements: %s", Integer.valueOf(str != null ? str.length() : 0), b89.A0);
        ((nd) this.b).e("MENTION_BROKEN_RANGE");
    }

    public void P(gw8 gw8, nv8 nv8, ArrayList arrayList) {
        ow8 ow8 = (ow8) this.b;
        if (gw8 == ow8.u && nv8 != null) {
            qw8 qw8 = ow8.t.a;
            String c2 = nv8.c();
            rw8 rw8 = new rw8(qw8, c2, ow8.b(qw8, c2));
            rw8.i(nv8);
            if (ow8.r != rw8) {
                gw8 gw82 = ow8.u;
                rw8 rw82 = ow8.t;
                pw8 pw8 = ow8.z;
                if (pw8 != null) {
                    if (!pw8.i && !pw8.j) {
                        pw8.j = true;
                        hw8 hw8 = pw8.a;
                        if (hw8 != null) {
                            hw8.h(0);
                            hw8.d();
                        }
                    }
                    ow8.z = null;
                }
                pw8 pw82 = new pw8(ow8, rw8, gw82, 3, rw82, arrayList);
                ow8.z = pw82;
                pw82.a();
                ow8.t = null;
                ow8.u = null;
            }
        } else if (gw8 == ow8.s) {
            if (nv8 != null) {
                ow8.m(ow8.r, nv8);
            }
            ow8.r.n(arrayList);
        }
    }

    public void Q(long j, boolean z) {
        s9a s9a = CallHistoryPageScreen.X;
        n71 f0 = ((CallHistoryPageScreen) this.b).f0();
        mz6 j2 = f0.j(j);
        if (j2 != null) {
            boolean z2 = j2 instanceof kz6;
            Lazy lazy = f0.z;
            if (z2) {
                f0.c.j(((kz6) j2).a, z, new l71(j2, z));
                ((tq1) lazy.getValue()).c(rq1.HISTORY, z);
                return;
            }
            if (j2 instanceof iz6) {
                iz6 iz6 = (iz6) j2;
                if (iz6.c) {
                    f0.c.i(iz6.e, true, z, false, new m71(j2, 0));
                    tq1 tq1 = (tq1) lazy.getValue();
                    String valueOf = String.valueOf(j);
                    tq1.getClass();
                    tq1.a(tq1, "GROUP_CALL_JOIN", valueOf, (String) null, (Integer) null, (String) null, (String) null, true, 52);
                    return;
                }
            }
            if (j2 instanceof jz6) {
                f0.c.i(((jz6) j2).a, true, z, false, new m71(j2, 1));
                ((tq1) lazy.getValue()).c(rq1.HISTORY, z);
            }
        }
    }

    public Bundle R() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public qb0 S(bb0 bb0, int i) {
        byte[] bArr;
        byte b2;
        qb0 qb0 = bb0.a;
        ha7 ha7 = (ha7) qb0.a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((b8d) this.b).a) == null) {
            ByteBuffer d0 = ha7.w()[0].d0();
            bArr = new byte[d0.capacity()];
            d0.rewind();
            d0.get(bArr);
        } else {
            ByteBuffer d02 = ha7.w()[0].d0();
            int capacity = d02.capacity();
            byte[] bArr2 = new byte[capacity];
            d02.rewind();
            d02.get(bArr2);
            int i3 = 2;
            int i4 = 2;
            while (true) {
                if (i4 + 4 <= capacity && (b2 = bArr2[i4]) == -1) {
                    if (b2 == -1 && bArr2[i4 + 1] == -38) {
                        break;
                    }
                    i4 += (((bArr2[i4 + 2] & UByte.MAX_VALUE) << 8) | (bArr2[i4 + 3] & UByte.MAX_VALUE)) + 2;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 <= capacity) {
                    if (bArr2[i3] == -1 && bArr2[i5] == -40) {
                        i2 = i3;
                        break;
                    }
                    i3 = i5;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                bArr = bArr2;
            }
            bArr = Arrays.copyOfRange(bArr2, i2, d02.limit());
        }
        byte[] bArr3 = bArr;
        na5 na5 = qb0.b;
        Objects.requireNonNull(na5);
        return new qb0(bArr3, na5, i, qb0.d, qb0.e, qb0.f, qb0.g, qb0.h);
    }

    public void U(boolean z) {
        wsb wsb = (wsb) this.b;
        wsb.getClass();
        try {
            o3h o3h = (o3h) wsb.a;
            Parcel H0 = o3h.H0();
            int i = hzg.a;
            H0.writeInt(z ? 1 : 0);
            o3h.I0(H0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 11: goto L_0x005e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x005d
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0010
            goto L_0x005d
        L_0x0010:
            java.util.Iterator r9 = r9.iterator()
        L_0x0014:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r9.next()
            b89 r0 = (defpackage.b89) r0
            java.util.List r1 = r0.A0
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002b
            goto L_0x0014
        L_0x002b:
            java.lang.String r1 = r0.x
            if (r1 == 0) goto L_0x0059
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            java.util.List r2 = r0.A0
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r2.next()
            ra9 r3 = (defpackage.ra9) r3
            short r4 = r3.o
            if (r4 < 0) goto L_0x0055
            short r3 = r3.v
            int r4 = r4 + r3
            int r3 = r1.length()
            if (r4 <= r3) goto L_0x003c
        L_0x0055:
            r8.O(r0)
            goto L_0x0014
        L_0x0059:
            r8.O(r0)
            goto L_0x0014
        L_0x005d:
            return
        L_0x005e:
            bxf r9 = (defpackage.bxf) r9
            java.lang.Object r8 = r8.b
            u02 r8 = (defpackage.u02) r8
            r8.getClass()
            boolean r0 = r9.a()
            if (r0 != 0) goto L_0x006e
            goto L_0x00ce
        L_0x006e:
            vyf r9 = r9.h
            java.lang.String r9 = r9.a
            long r0 = r8.o
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r3 = r8.x
            if (r2 == 0) goto L_0x00b2
            java.lang.String r2 = "updateChatAvatar"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            r62 r2 = r8.e()
            a32 r2 = r2.G(r0)
            if (r2 == 0) goto L_0x009f
            rl r0 = r8.a()
            m72 r1 = r2.b
            long r3 = r1.a
            jna r0 = (defpackage.jna) r0
            a20 r7 = r8.v
            long r1 = r8.o
            r5 = 0
            r6 = r9
            r0.p(r1, r3, r5, r6, r7)
            goto L_0x00c5
        L_0x009f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "updateChatAvatar: chat not found, chatId="
            r9.<init>(r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r0 = 0
            defpackage.z68.f(r3, r9, r0)
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r0 = "updateProfileAvatar"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            rl r0 = r8.a()
            r5 = 0
            r6 = 0
            r1 = 0
            r2 = 0
            a20 r4 = r8.v
            r3 = r9
            long unused = ((defpackage.jna) r0).P(r1, r2, r3, r4, r5, r6, 0, defpackage.he0.o)
        L_0x00c5:
            eef r9 = r8.t()
            long r0 = r8.b
            r9.d(r0)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er7.accept(java.lang.Object):void");
    }

    public void d() {
    }

    public void e() {
        x2a x2a = ((m0a) this.b).z;
        if (x2a != null) {
            x2a.N(new zj0(21));
        }
    }

    public void f() {
        ((j50) this.b).h();
    }

    public Object get() {
        return this.b;
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object b2 = ((hdd) this.b).b("CreateChannelViewModel:channel_description");
        if (b2 == null) {
            return null;
        }
        return b2;
    }

    public void i() {
        KProperty[] kPropertyArr = GifViewerWidget.X;
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        gifViewerWidget.h0().w(gifViewerWidget.d0(), gifViewerWidget.c0());
    }

    public void j() {
    }

    public void k(ze1 ze1, Point point) {
        ze1 ze12;
        pk1 pk1;
        rk1 rk1 = (rk1) this.b;
        v4b v4b = rk1.U0;
        if (v4b != null && (ze12 = v4b.c) != null && (pk1 = rk1.W0) != null) {
            gga gga = CallScreen.J0;
            jj1 p0 = ((nh1) pk1).a.p0();
            KProperty[] kPropertyArr = jj1.O0;
            p0.r(ze12, (Point) null);
        }
    }

    public void l() {
        KProperty[] kPropertyArr = GifViewerWidget.X;
        zx3 targetController = ((GifViewerWidget) this.b).getTargetController();
        mfb mfb = targetController instanceof mfb ? (mfb) targetController : null;
        if (mfb != null) {
            ((ChatMediaViewerScreen) mfb).v0(false);
        }
    }

    public void m(ze1 ze1) {
        pk1 pk1 = ((rk1) this.b).W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            ((nh1) pk1).a.p0().o(ze1);
        }
    }

    public void n(s28 s28, long j, long j2, boolean z) {
        ((n64) this.b).r((p8b) s28, j, j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ze1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ze1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ze1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ze1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(defpackage.ze1 r5) {
        /*
            r4 = this;
            java.lang.Object r4 = r4.b
            rk1 r4 = (defpackage.rk1) r4
            pk1 r4 = r4.W0
            if (r4 == 0) goto L_0x005c
            nh1 r4 = (defpackage.nh1) r4
            gga r5 = one.me.calls.ui.ui.call.CallScreen.J0
            one.me.calls.ui.ui.call.CallScreen r4 = r4.a
            jj1 r4 = r4.p0()
            k91 r5 = r4.l()
            xme r0 = r4.D0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r1 = r5.g
            etc r2 = r4.w0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            zm1 r2 = (defpackage.zm1) r2
            ze1 r2 = r2.b
            r3 = 0
            if (r1 == 0) goto L_0x0031
            r2 = r3
            goto L_0x0057
        L_0x0031:
            boolean r5 = r5.m
            if (r5 != 0) goto L_0x0036
            goto L_0x0057
        L_0x0036:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r5.next()
            r1 = r0
            ze1 r1 = (defpackage.ze1) r1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x003e
            r3 = r0
        L_0x0054:
            r2 = r3
            ze1 r2 = (defpackage.ze1) r2
        L_0x0057:
            ap1 r4 = r4.c
            r4.f(r2)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er7.o(ze1):void");
    }

    public void onBitmapLoaded(Bitmap bitmap, ta5 ta5, String str, String str2) {
        FrgTamCropImage frgTamCropImage = (FrgTamCropImage) this.b;
        frgTamCropImage.getClass();
        new qa3(1, new p00(8, frgTamCropImage, bitmap)).l(xfd.a()).i(qe.a()).j(new ao1(0, new pi6(frgTamCropImage, 0), new oi6(frgTamCropImage, 7)));
    }

    public void onFailure(Exception exc) {
        ((FrgTamCropImage) this.b).h3();
    }

    public void p() {
        ((j50) this.b).h();
    }

    public yy9 q() {
        throw null;
    }

    public ss2 r() {
        Iterable<yq9> iterable = (List) ((AtomicReference) ((zq9) ((uua) this.b).b.getValue()).c).get();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (yq9 yq9 : iterable) {
            long j = yq9.a;
            String str = yq9.r;
            Uri parse = str != null ? Uri.parse(str) : null;
            long j2 = yq9.n;
            CharSequence charSequence = yq9.b;
            CharSequence charSequence2 = yq9.c;
            CharSequence charSequence3 = yq9.t;
            CharSequence charSequence4 = yq9.f;
            String str2 = yq9.g;
            boolean z = yq9.u;
            long j3 = yq9.h;
            CharSequence charSequence5 = yq9.q;
            xk2 xk2 = r3;
            xk2 xk22 = new xk2(j, parse, charSequence, charSequence2, charSequence3, charSequence4, (CharSequence) null, str2, false, z, j3, (wk2) wk2.x.get(yq9.i), yq9.j, yq9.k, yq9.l, yq9.m, j2, (Long) null, yq9.p, charSequence5);
            arrayList.add(xk2);
        }
        return new ss2(arrayList, true);
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        getValue(obj, kProperty);
        ((hdd) this.b).c(obj2, "CreateChannelViewModel:channel_description");
    }

    public void t(int i) {
        m0a m0a = (m0a) this.b;
        m0a.c.c = 0;
        m0a.W(m0a, false, i * 10);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [n8b, java.lang.Object] */
    public void u(s28 s28, long j, long j2) {
        long j3 = j;
        p8b p8b = (p8b) s28;
        n64 n64 = (n64) this.b;
        n64.getClass();
        long j4 = p8b.a;
        p74 p74 = p8b.b;
        sne sne = p8b.o;
        k28 k28 = new k28(j4, p74, sne.c, sne.o, j, j2, sne.b);
        n64.n.getClass();
        n64.q.f(k28, p8b.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        x54 x54 = (x54) p8b.w;
        x54 x542 = n64.H;
        int size = x542 == null ? 0 : x542.m.size();
        long j5 = x54.b(0).b;
        int i = 0;
        while (i < size && n64.H.b(i).b < j5) {
            i++;
        }
        if (x54.d) {
            if (size - i <= x54.m.size()) {
                long j6 = n64.N;
                if (j6 == -9223372036854775807L || x54.h * 1000 > j6) {
                    n64.M = 0;
                }
            }
            int i2 = n64.M;
            n64.M = i2 + 1;
            if (i2 < n64.n.o(p8b.c)) {
                n64.D.postDelayed(n64.v, (long) Math.min((n64.M - 1) * 1000, 5000));
                return;
            } else {
                n64.C = new DashManifestStaleException();
                return;
            }
        }
        n64.H = x54;
        n64.I = x54.d & n64.I;
        n64.J = j3 - j2;
        n64.K = j3;
        synchronized (n64.t) {
            try {
                if (p8b.b.a == n64.F) {
                    Uri uri = n64.H.k;
                    if (uri == null) {
                        uri = p8b.o.c;
                    }
                    n64.F = uri;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (size == 0) {
            x54 x543 = n64.H;
            if (x543.d) {
                ata ata = x543.i;
                if (ata != null) {
                    String str = (String) ata.b;
                    if (t0g.a(str, "urn:mpeg:dash:utc:direct:2014") || t0g.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            n64.L = t0g.G((String) ata.c) - n64.K;
                            n64.s(true);
                        } catch (ParserException e) {
                            iq.a("Failed to resolve time offset.", e);
                            n64.s(true);
                        }
                    } else if (t0g.a(str, "urn:mpeg:dash:utc:http-iso:2014") || t0g.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        p8b p8b2 = new p8b(n64.z, Uri.parse((String) ata.c), 5, new Object());
                        n64.q.k(new k28(p8b2.a, p8b2.b, n64.A.P(p8b2, new u6h(13, n64), 1)), p8b2.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (t0g.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || t0g.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        p8b p8b3 = new p8b(n64.z, Uri.parse((String) ata.c), 5, new sq6(10));
                        n64.q.k(new k28(p8b3.a, p8b3.b, n64.A.P(p8b3, new u6h(13, n64), 1)), p8b3.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (t0g.a(str, "urn:mpeg:dash:utc:ntp:2014") || t0g.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        n64.q();
                    } else {
                        iq.a("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                        n64.s(true);
                    }
                } else {
                    n64.q();
                }
            } else {
                n64.s(true);
            }
        } else {
            n64.O += i;
            n64.s(true);
        }
    }

    public void v() {
        ((j50) this.b).h();
    }

    public void w() {
        j50 j50 = (j50) this.b;
        Long l = (Long) j50.x;
        dy9 dy9 = (dy9) j50.c;
        long l2 = ((xy9) dy9).l();
        if (l == null || l.longValue() != l2) {
            if (((Long) j50.x) == null) {
                j50.x = Long.valueOf(((xy9) dy9).l());
            }
            if (!j50.b) {
                ((n6e) j50.o).d(new h50(new igf(bxa.a)));
                j50.h();
            }
        }
    }

    public void x() {
        j50 j50 = (j50) this.b;
        j50.h();
        ((n6e) j50.o).d(g50.a);
    }

    public void y() {
        pk1 pk1 = ((rk1) this.b).W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            ((nh1) pk1).a.p0().c.g();
        }
    }

    public iog z(View view, iog iog) {
        switch (this.a) {
            case 5:
                int a2 = iog.a();
                il0 il0 = (il0) this.b;
                il0.m = a2;
                il0.n = iog.b();
                il0.o = iog.c();
                il0.f();
                return iog;
            case 6:
                xr0 xr0 = (xr0) this.b;
                wr0 wr0 = xr0.w0;
                if (wr0 != null) {
                    xr0.w.W.remove(wr0);
                }
                wr0 wr02 = new wr0(xr0.z, iog);
                xr0.w0 = wr02;
                wr02.e(xr0.getWindow());
                xr0.w.w(xr0.w0);
                return iog;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                if (!Objects.equals(coordinatorLayout.y0, iog)) {
                    coordinatorLayout.y0 = iog;
                    int i = 0;
                    boolean z = iog.d() > 0;
                    coordinatorLayout.z0 = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    fog fog = iog.a;
                    if (!fog.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = gag.a;
                            if (!childAt.getFitsSystemWindows() || ((wz3) childAt.getLayoutParams()).a == null || !fog.m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return iog;
        }
    }

    public er7(int i) {
        y1h y1h;
        this.a = i;
        switch (i) {
            case 1:
                try {
                    y1h = (y1h) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
                } catch (Exception unused) {
                    y1h = c;
                }
                s1h s1h = new s1h(c0h.b, y1h);
                Charset charset = y0h.a;
                this.b = s1h;
                return;
            case 10:
                this.b = pz9.c();
                return;
            case LangUtils.HASH_SEED /*17*/:
                this.b = (ExtraSupportedSurfaceCombinationsQuirk) qn4.a.g(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            default:
                return;
        }
    }

    public er7(Bundle bundle) {
        this.a = 29;
        this.b = new Bundle(bundle);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, b8d] */
    public er7(ykb ykb) {
        this.a = 21;
        ? obj = new Object();
        obj.a = (IncorrectJpegMetadataQuirk) ykb.g(IncorrectJpegMetadataQuirk.class);
        this.b = obj;
    }

    public er7(jr5 jr5, iq iqVar) {
        this.a = 18;
        this.b = iqVar;
    }
}
