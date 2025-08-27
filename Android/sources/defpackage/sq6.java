package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import org.apache.http.HttpHost;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sq6  reason: default package */
public final class sq6 implements b4d, qk3, n8b, rb5, ds6, c88, t0d {
    public static final sq6 b = new sq6(1);
    public static final sq6 c = new sq6(2);
    public static final sq6 o = new sq6(3);
    public static final sq6 v = new sq6(4);
    public static final sq6 w = new sq6(5);
    public static final /* synthetic */ sq6 x = new sq6(22);
    public final /* synthetic */ int a;

    public /* synthetic */ sq6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [gge, android.text.SpannableString] */
    public static gge A(CharSequence charSequence, boolean z) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(charSequence);
            ld8.f(spannableString, z);
        } catch (IndexOutOfBoundsException unused) {
            if (charSequence instanceof Spannable) {
                ld8.f((Spannable) charSequence, z);
            }
            spannableString = new SpannableString(charSequence);
        }
        return new SpannableString(spannableString);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, rt0] */
    public static String B(int i, String str, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i6 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                ? obj = new Object();
                obj.z0(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                        int q = u0g.q(str.charAt(i4 + 1));
                        int q2 = u0g.q(str.charAt(i5));
                        if (!(q == -1 || q2 == -1)) {
                            obj.u0((q << 4) + q2);
                            i4 = Character.charCount(codePointAt) + i5;
                        }
                    } else if (codePointAt == 43 && z) {
                        obj.u0(32);
                        i4++;
                    }
                    obj.A0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return obj.q0();
            }
            i6 = i4 + 1;
        }
        return str.substring(i, i2);
    }

    public static ArrayList C(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int k = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) Typography.amp, i, false, 4, (Object) null);
            if (k == -1) {
                k = str.length();
            }
            int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
            if (k2 == -1 || k2 > k) {
                arrayList.add(str.substring(i, k));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, k2));
                arrayList.add(str.substring(k2 + 1, k));
            }
            i = k + 1;
        }
        return arrayList;
    }

    public static qe9 D(int i) {
        for (qe9 qe9 : qe9.values()) {
            if (qe9.a == i) {
                return qe9;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: rt0} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, rt0] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String q(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            r0 = r17
            r1 = r20
            r2 = r25 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = r3
            goto L_0x000d
        L_0x000b:
            r2 = r18
        L_0x000d:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0016
            int r4 = r17.length()
            goto L_0x0018
        L_0x0016:
            r4 = r19
        L_0x0018:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r3
            goto L_0x0020
        L_0x001e:
            r5 = r21
        L_0x0020:
            r6 = r25 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r3
            goto L_0x0028
        L_0x0026:
            r6 = r22
        L_0x0028:
            r7 = r25 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r3
            goto L_0x0030
        L_0x002e:
            r7 = r23
        L_0x0030:
            r8 = r25 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r3
            goto L_0x0038
        L_0x0036:
            r8 = r24
        L_0x0038:
            r9 = r2
        L_0x0039:
            if (r9 >= r4) goto L_0x0112
            int r10 = r0.codePointAt(r9)
            r11 = 32
            r12 = 128(0x80, float:1.794E-43)
            r13 = 43
            r14 = 37
            r15 = 127(0x7f, float:1.78E-43)
            if (r10 < r11) goto L_0x006f
            if (r10 == r15) goto L_0x006f
            if (r10 < r12) goto L_0x0051
            if (r8 == 0) goto L_0x006f
        L_0x0051:
            char r12 = (char) r10
            boolean r12 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (char) r12, false, 2, (java.lang.Object) null)
            if (r12 != 0) goto L_0x006f
            if (r10 != r14) goto L_0x0064
            if (r5 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x0064
            boolean r12 = z(r9, r4, r0)
            if (r12 == 0) goto L_0x006f
        L_0x0064:
            if (r10 != r13) goto L_0x0069
            if (r7 == 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            int r10 = java.lang.Character.charCount(r10)
            int r9 = r9 + r10
            goto L_0x0039
        L_0x006f:
            rt0 r10 = new rt0
            r10.<init>()
            r10.z0(r2, r9, r0)
            r2 = 0
        L_0x0078:
            if (r9 >= r4) goto L_0x010d
            int r12 = r0.codePointAt(r9)
            if (r5 == 0) goto L_0x0094
            r14 = 9
            if (r12 == r14) goto L_0x0091
            r14 = 10
            if (r12 == r14) goto L_0x0091
            r14 = 12
            if (r12 == r14) goto L_0x0091
            r14 = 13
            if (r12 == r14) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x00ca
        L_0x0094:
            if (r12 != r13) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x009d
            java.lang.String r14 = "+"
            goto L_0x009f
        L_0x009d:
            java.lang.String r14 = "%2B"
        L_0x009f:
            int r13 = r14.length()
            r10.z0(r3, r13, r14)
            goto L_0x0091
        L_0x00a7:
            if (r12 < r11) goto L_0x00cd
            if (r12 == r15) goto L_0x00cd
            r13 = 128(0x80, float:1.794E-43)
            if (r12 < r13) goto L_0x00b1
            if (r8 == 0) goto L_0x00cf
        L_0x00b1:
            char r14 = (char) r12
            boolean r14 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (char) r14, false, 2, (java.lang.Object) null)
            if (r14 != 0) goto L_0x00cf
            r14 = 37
            if (r12 != r14) goto L_0x00c7
            if (r5 == 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00c7
            boolean r14 = z(r9, r4, r0)
            if (r14 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            r10.A0(r12)
        L_0x00ca:
            r11 = 37
            goto L_0x0100
        L_0x00cd:
            r13 = 128(0x80, float:1.794E-43)
        L_0x00cf:
            if (r2 != 0) goto L_0x00d6
            rt0 r2 = new rt0
            r2.<init>()
        L_0x00d6:
            r2.A0(r12)
        L_0x00d9:
            boolean r14 = r2.C()
            if (r14 != 0) goto L_0x00ca
            byte r14 = r2.readByte()
            r3 = r14 & 255(0xff, float:3.57E-43)
            r11 = 37
            r10.u0(r11)
            char[] r16 = defpackage.m57.k
            int r3 = r3 >> 4
            r3 = r3 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = r14 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = 0
            r11 = 32
            goto L_0x00d9
        L_0x0100:
            int r3 = java.lang.Character.charCount(r12)
            int r9 = r9 + r3
            r14 = r11
            r3 = 0
            r11 = 32
            r13 = 43
            goto L_0x0078
        L_0x010d:
            java.lang.String r0 = r10.q0()
            goto L_0x0116
        L_0x0112:
            java.lang.String r0 = r0.substring(r2, r4)
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq6.q(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static a3d t(byte[] bArr, f19 f19, int i) {
        if ((i & 1) != 0) {
            f19 = null;
        }
        int length = bArr.length;
        long length2 = (long) bArr.length;
        long j = (long) 0;
        long j2 = (long) length;
        byte[] bArr2 = u0g.a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new a3d(bArr, f19, length, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static int u(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return 80;
        }
        return -1;
    }

    public static File x(Context context, frg frg) {
        File y = y(context);
        f6e.y(y);
        return FilesKt.resolve(y, frg.b + '_' + System.currentTimeMillis() + ".bin");
    }

    public static File y(Context context) {
        String str;
        String r = o54.r();
        if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
        }
        return new File(context.getCacheDir(), str);
    }

    public static boolean z(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && u0g.q(str.charAt(i + 1)) != -1 && u0g.q(str.charAt(i3)) != -1;
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public void accept(Object obj, Object obj2) {
        tj5 tj5;
        qdf qdf = (qdf) obj2;
        i1h i1h = (i1h) obj;
        vr7 vr7 = new vr7(LongCompanionObject.MAX_VALUE, 0, false, (o1h) null);
        tj5[] h = i1h.h();
        tj5 tj52 = null;
        if (h != null) {
            int i = 0;
            while (true) {
                if (i >= h.length) {
                    tj5 = null;
                    break;
                }
                tj5 = h[i];
                if ("location_updates_with_callback".equals(tj5.a)) {
                    break;
                }
                i++;
            }
            if (tj5 != null && tj5.b() >= 1) {
                j7h j7h = (j7h) i1h.o();
                u1h u1h = new u1h(4, (IBinder) null, new s0h(1, qdf), (PendingIntent) null, (String) null);
                Parcel H0 = j7h.H0();
                gzg.b(H0, vr7);
                gzg.b(H0, u1h);
                j7h.I0(H0, 90);
                return;
            }
        }
        tj5[] h2 = i1h.h();
        if (h2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= h2.length) {
                    break;
                }
                tj5 tj53 = h2[i2];
                if ("get_last_location_with_request".equals(tj53.a)) {
                    tj52 = tj53;
                    break;
                }
                i2++;
            }
            if (tj52 != null && tj52.b() >= 1) {
                j7h j7h2 = (j7h) i1h.o();
                s0h s0h = new s0h(1, qdf);
                Parcel H02 = j7h2.H0();
                gzg.b(H02, vr7);
                H02.writeStrongBinder(s0h);
                j7h2.I0(H02, 82);
                return;
            }
        }
        j7h j7h3 = (j7h) i1h.o();
        Parcel H03 = j7h3.H0();
        Parcel obtain = Parcel.obtain();
        try {
            j7h3.d.transact(7, H03, obtain, 0);
            obtain.readException();
            H03.recycle();
            obtain.recycle();
            qdf.b((Location) gzg.a(obtain, Location.CREATOR));
        } catch (RuntimeException e) {
            obtain.recycle();
            throw e;
        } catch (Throwable th) {
            H03.recycle();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
    }

    public pb5 c() {
        throw new IllegalStateException();
    }

    public g44 d(byte[] bArr) {
        throw new IllegalStateException();
    }

    public byte[] e() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public boolean f(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void h(byte[] bArr) {
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public nb5 k(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public int l() {
        return 1;
    }

    public Object m(Object obj, String str) {
        String p;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2132092408:
                if (str.equals("mt_instanceid")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1690743503:
                if (str.equals("messageIds")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1033517562:
                if (str.equals("verifyCode")) {
                    c2 = 3;
                    break;
                }
                break;
            case -989040443:
                if (str.equals("phones")) {
                    c2 = 4;
                    break;
                }
                break;
            case -778929409:
                if (str.equals("pushToken")) {
                    c2 = 5;
                    break;
                }
                break;
            case -738997328:
                if (str.equals("attachments")) {
                    c2 = 6;
                    break;
                }
                break;
            case -567451565:
                if (str.equals("contacts")) {
                    c2 = 7;
                    break;
                }
                break;
            case -8339209:
                if (str.equals("elements")) {
                    c2 = 8;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c2 = 9;
                    break;
                }
                break;
            case 95844769:
                if (str.equals("draft")) {
                    c2 = 10;
                    break;
                }
                break;
            case 110541305:
                if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    c2 = 11;
                    break;
                }
                break;
            case 139855480:
                if (str.equals("contactIds")) {
                    c2 = 12;
                    break;
                }
                break;
            case 739093568:
                if (str.equals("chatIds")) {
                    c2 = 13;
                    break;
                }
                break;
            case 831145840:
                if (str.equals("configHash")) {
                    c2 = 14;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c2 = 15;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c2 = 16;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 3:
            case 5:
            case 9:
            case 11:
            case Protos.Attaches.Attach.LOCATION:
            case 16:
                dbe.w.getClass();
                return "***";
            case 1:
            case 12:
            case 13:
                if (obj instanceof Iterable) {
                    Iterable iterable = (Iterable) obj;
                    if (iterable != null) {
                        p = CollectionsKt___CollectionsKt.joinToString(iterable, ",", "[", "]", -1, "...", new wg7(8));
                        return p;
                    }
                } else if (!(obj instanceof long[])) {
                    return obj;
                } else {
                    long[] jArr = (long[]) obj;
                    if (!(jArr == null || jArr.length == 0)) {
                        p = ArraysKt___ArraysKt.joinToString(jArr, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", -1, (CharSequence) "...", (Function1<? super Long, ? extends CharSequence>) new wg7(9));
                        return p;
                    }
                }
                return "[]";
            case 2:
                return "[]";
            case 4:
            case 6:
            case 7:
            case 8:
                return obj instanceof Collection ? Integer.valueOf(((Collection) obj).size()) : obj instanceof Map ? Integer.valueOf(((Map) obj).size()) : obj instanceof long[] ? Integer.valueOf(((long[]) obj).length) : obj;
            case 10:
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return obj instanceof Map ? kv0.R((Map) obj, fbf.o) : obj;
            default:
                return obj;
        }
    }

    public void n(b8d b8d) {
    }

    public Object o(Object obj) {
        na5 na5;
        vb0 vb0 = (vb0) obj;
        ha7 ha7 = vb0.b;
        qvb qvb = vb0.a;
        if (ld9.H(ha7.n0())) {
            try {
                qv0 qv0 = na5.b;
                ByteBuffer d0 = ha7.w()[0].d0();
                d0.rewind();
                byte[] bArr = new byte[d0.capacity()];
                d0.get(bArr);
                na5 = new na5(new ab5((InputStream) new ByteArrayInputStream(bArr)));
                ha7.w()[0].d0().rewind();
            } catch (IOException e) {
                throw new Exception("Failed to extract EXIF data.", e);
            }
        } else {
            na5 = null;
        }
        if (((ImageCaptureRotationOptionQuirk) nn4.a.g(ImageCaptureRotationOptionQuirk.class)) != null) {
            la0 la0 = bx1.i;
        } else if (ld9.H(ha7.n0())) {
            bs0.q(na5, "JPEG image must have exif.");
            Size size = new Size(ha7.getWidth(), ha7.getHeight());
            int a2 = qvb.c - na5.a();
            Size size2 = grf.c(grf.h(a2)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix a3 = grf.a(new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) size.getWidth(), (float) size.getHeight()), new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) size2.getWidth(), (float) size2.getHeight()), a2, false);
            RectF rectF = new RectF(qvb.b);
            a3.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int a4 = na5.a();
            Matrix matrix = new Matrix(qvb.e);
            matrix.postConcat(a3);
            it1 ece = ha7.getImageInfo() instanceof jt1 ? ((jt1) ha7.getImageInfo()).a : new ece(8);
            ha7.n0();
            return new qb0(ha7, na5, ha7.n0(), size2, rect, a4, matrix, ece);
        }
        Rect rect2 = qvb.b;
        ece ece2 = ha7.getImageInfo() instanceof jt1 ? ((jt1) ha7.getImageInfo()).a : new ece(8);
        int i = qvb.c;
        Matrix matrix2 = qvb.e;
        Size size3 = new Size(ha7.getWidth(), ha7.getHeight());
        if (ld9.H(ha7.n0())) {
            bs0.q(na5, "JPEG image must have Exif.");
        }
        return new qb0(ha7, na5, ha7.n0(), size3, rect2, i, matrix2, ece2);
    }

    public void release() {
    }

    public Object s(Uri uri, l74 l74) {
        return Long.valueOf(t0g.G(new BufferedReader(new InputStreamReader(l74)).readLine()));
    }

    public sq6() {
        this.a = 8;
        new LinkedHashSet(20);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                z68.f("rj5", "onLogout: clear failed", (Throwable) obj);
                return;
            default:
                z68.f(iac.A0, "notifyTracker: failed", (Throwable) obj);
                return;
        }
    }
}
