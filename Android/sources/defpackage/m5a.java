package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Trace;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.UByte;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.logout.a;

/* renamed from: m5a  reason: default package */
public abstract class m5a implements e6a {
    public static boolean a;
    public static final djd b = new djd(11);
    public static final bpa c = new bpa(10, "NO_VALUE");
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089 A[SYNTHETIC, Splitter:B:20:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A(android.net.Uri r15) {
        /*
            java.lang.String r0 = "r"
            ym r1 = defpackage.ym.v
            android.content.ContentResolver r1 = r1.getContentResolver()
            r2 = 1
            r3 = 0
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            int r6 = defpackage.o5a.f     // Catch:{ IOException -> 0x007d }
            ab5 r6 = new ab5     // Catch:{ IOException -> 0x007d }
            r6.<init>((java.io.FileDescriptor) r5)     // Catch:{ IOException -> 0x007d }
            java.lang.String r5 = "Orientation"
            int r5 = r6.e(r2, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Point r6 = defpackage.o5a.l(r6, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x007d }
            r7.<init>()     // Catch:{ IOException -> 0x007d }
            r8 = 2048(0x800, float:2.87E-42)
            int r6 = defpackage.o5a.q(r6, r8, r8)     // Catch:{ IOException -> 0x007d }
            r7.inSampleSize = r6     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r7)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            int r1 = defpackage.o5a.w(r5)     // Catch:{ IOException -> 0x007d }
            if (r1 != 0) goto L_0x0059
            defpackage.j4b.j(r4)
            r3 = r0
            goto L_0x00c1
        L_0x0059:
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ IOException -> 0x007d }
            r13.<init>()     // Catch:{ IOException -> 0x007d }
            float r1 = (float) r1     // Catch:{ IOException -> 0x007d }
            r13.setRotate(r1)     // Catch:{ IOException -> 0x007d }
            int r11 = r0.getWidth()     // Catch:{ IOException -> 0x007d }
            int r12 = r0.getHeight()     // Catch:{ IOException -> 0x007d }
            r10 = 0
            r14 = 1
            r9 = 0
            r8 = r0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x007d }
            r0.recycle()     // Catch:{ IOException -> 0x007d }
            defpackage.j4b.j(r4)
            r3 = r1
            goto L_0x00c1
        L_0x007a:
            r15 = move-exception
            r3 = r4
            goto L_0x00c2
        L_0x007d:
            r0 = move-exception
            goto L_0x0083
        L_0x007f:
            r15 = move-exception
            goto L_0x00c2
        L_0x0081:
            r0 = move-exception
            r4 = r3
        L_0x0083:
            boolean r1 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "m5a"
            if (r1 == 0) goto L_0x00bb
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x007a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a6 }
            r0.<init>(r15)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "file by path %s not exists"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x00a6 }
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)     // Catch:{ all -> 0x00a6 }
            defpackage.z68.n(r5, r3, r0, r15)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r15 = move-exception
            goto L_0x00b2
        L_0x00a8:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00a6 }
            r0.<init>()     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r15, r0)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "getBitmapFromExternalStorage fail"
            defpackage.z68.o(r5, r0, r15)     // Catch:{ all -> 0x007a }
        L_0x00b7:
            defpackage.j4b.j(r4)
            goto L_0x00c1
        L_0x00bb:
            java.lang.String r15 = "getBitmapFromPath: failed to get bitmap"
            defpackage.z68.f(r5, r15, r0)     // Catch:{ all -> 0x007a }
            goto L_0x00b7
        L_0x00c1:
            return r3
        L_0x00c2:
            defpackage.j4b.j(r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5a.A(android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = defpackage.q8.j((r0 = r0.getResourceId(r4, 0)), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList B(android.content.Context r2, defpackage.g6d r3, int r4) {
        /*
            java.lang.Object r0 = r3.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L_0x0018
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r2 = defpackage.q8.j(r0, r2)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            android.content.res.ColorStateList r2 = r3.o(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5a.B(android.content.Context, g6d, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.q8.j((r0 = r2.getResourceId(r3, 0)), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList C(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = defpackage.q8.j(r0, r1)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5a.C(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    public static int D(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.iq.D(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable E(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = defpackage.iq.D(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5a.E(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [do1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, z3d] */
    public static go1 F(eo1 eo1) {
        ? obj = new Object();
        obj.c = new Object();
        go1 go1 = new go1(obj);
        obj.b = go1;
        obj.a = eo1.getClass();
        try {
            Object r = eo1.r(obj);
            if (r != null) {
                obj.a = r;
            }
        } catch (Exception e2) {
            go1.b.j(e2);
        }
        return go1;
    }

    public static final int G(usd usd, yo7 yo7, String str) {
        boolean z = yo7.a.m;
        Object obj = null;
        djd djd = b;
        li3 li3 = yo7.c;
        if (!z || !Intrinsics.areEqual((Object) usd.getKind(), (Object) zsd.p)) {
            L(yo7, usd);
            int d2 = usd.d(str);
            if (d2 != -3 || !yo7.a.l) {
                return d2;
            }
            j35 j35 = new j35(17, (Object) usd, (Object) yo7);
            ConcurrentHashMap concurrentHashMap = li3.a;
            Map map = (Map) concurrentHashMap.get(usd);
            Object obj2 = map != null ? map.get(djd) : null;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == null) {
                obj = j35.invoke();
                Object obj3 = concurrentHashMap.get(usd);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(usd, obj3);
                }
                ((Map) obj3).put(djd, obj);
            }
            Integer num = (Integer) ((Map) obj).get(str);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        j35 j352 = new j35(17, (Object) usd, (Object) yo7);
        ConcurrentHashMap concurrentHashMap2 = li3.a;
        Map map2 = (Map) concurrentHashMap2.get(usd);
        Object obj4 = map2 != null ? map2.get(djd) : null;
        if (obj4 != null) {
            obj = obj4;
        }
        if (obj == null) {
            obj = j352.invoke();
            Object obj5 = concurrentHashMap2.get(usd);
            if (obj5 == null) {
                obj5 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(usd, obj5);
            }
            ((Map) obj5).put(djd, obj);
        }
        Integer num2 = (Integer) ((Map) obj).get(lowerCase);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int H(usd usd, yo7 yo7, String str, String str2) {
        int G = G(usd, yo7, str);
        if (G != -3) {
            return G;
        }
        throw new IllegalArgumentException(usd.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void I(Throwable th, CoroutineContext coroutineContext) {
        Throwable th2;
        for (s04 m0 : t04.a) {
            try {
                m0.m0(th, coroutineContext);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ExceptionsKt.addSuppressed(th2, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        try {
            ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean J(zx3 zx3) {
        return zx3.viewState != null;
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final void L(yo7 yo7, usd usd) {
        if (Intrinsics.areEqual((Object) usd.getKind(), (Object) hye.o)) {
            yo7.a.getClass();
        }
    }

    public static int M(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        byte b2 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b2;
            }
            b2 = (bArr[i] & UByte.MAX_VALUE) | (b2 << 8);
            i += i3;
            i2 = i4;
        }
    }

    public static z9c N(byte[] bArr) {
        l8b l8b = new l8b(bArr);
        if (l8b.c < 32) {
            return null;
        }
        l8b.G(0);
        int a2 = l8b.a();
        int g = l8b.g();
        if (g != a2) {
            i8b.V("Advertised atom size (" + g + ") does not match buffer size: " + a2);
            return null;
        }
        int g2 = l8b.g();
        if (g2 != 1886614376) {
            i2a.m(g2, "Atom type is not pssh: ");
            return null;
        }
        int y = ty.y(l8b.g());
        if (y > 1) {
            i2a.m(y, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(l8b.o(), l8b.o());
        if (y == 1) {
            int y2 = l8b.y();
            UUID[] uuidArr = new UUID[y2];
            for (int i = 0; i < y2; i++) {
                uuidArr[i] = new UUID(l8b.o(), l8b.o());
            }
        }
        int y3 = l8b.y();
        int a3 = l8b.a();
        if (y3 != a3) {
            i8b.V("Atom data size (" + y3 + ") does not match the bytes left: " + a3);
            return null;
        }
        byte[] bArr2 = new byte[y3];
        l8b.e(0, bArr2, y3);
        return new z9c(uuid, y, bArr2);
    }

    public static byte[] O(UUID uuid, byte[] bArr) {
        z9c N = N(bArr);
        if (N == null) {
            return null;
        }
        UUID uuid2 = N.a;
        if (uuid.equals(uuid2)) {
            return N.c;
        }
        i8b.V("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static void P(Context context, String str, cg8 cg8, boolean z) {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        View inflate = z ? LayoutInflater.from(context).inflate(ujc.dialog_progress_with_text, (ViewGroup) null) : LayoutInflater.from(context).inflate(ujc.dialog_progress_horizontal, (ViewGroup) null);
        if (z) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(lic.dialog_progress__text);
            if (appCompatTextView != null) {
                appCompatTextView.setText(str);
                appCompatTextView.setTextColor(k0.K);
                appCompatTextView.setTextSize(13.0f);
            }
        } else {
            cg8.a.f = str;
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(lic.dialog_progress__progress);
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
            progressBar.setMax(100);
            iq.h(k0, progressBar);
        }
        cg8.s(inflate);
    }

    public static long Q(int i, long j) {
        long j2 = (long) i;
        bs0.m("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }

    public static final void R(fwf fwf) {
        fqc.S(fwf);
        fwf.e(e98.class, new rid(7));
        fwf.e(v13.class, new rid(8));
        fwf.e(rl.class, new vid(11));
        fwf.e(yx6.class, new wid(28));
        fwf.e(ipg.class, new xid(9));
        fwf.e(eef.class, new xid(20));
        fwf.e(bef.class, new yid(1));
        fwf.e(die.class, new yid(12));
        fwf.e(r23.class, new yid(23));
        fwf.e(th4.class, new zid(4));
        fwf.e(gd4.class, new zid(15));
        fwf.e(jxd.class, new sid(1));
        fwf.e(yh3.class, new sid(12));
        fwf.e(hxd.class, new sid(23));
        fwf.e(o6a.class, new tid(4));
        fwf.e(nh3.class, new tid(15));
        fwf.e(zbf.class, new tid(26));
        fwf.e(pbf.class, new uid(7));
        fwf.e(owd.class, new uid(18));
        fwf.e(ocf.class, new uid(29));
        fwf.e(jd8.class, new vid(10));
        fwf.e(sv0.class, new vid(22));
        fwf.e(jqg.class, new wid(3));
        fwf.e(ycf.class, new wid(14));
        fwf.e(a74.class, new wid(21));
        fwf.e(s74.class, new wid(22));
        fwf.e(bjd.class, new wid(23));
        fwf.e(djd.class, new wid(24));
        fwf.e(ejd.class, new wid(25));
        fwf.e(cya.class, new wid(26));
        fwf.e(j6d.class, new wid(27));
        fwf.e(k78.class, new wid(29));
        Class<s98> cls = s98.class;
        fwf.c(cls, new xoa(28));
        fwf.e(nd.class, new xid(0));
        fwf.e(fjd.class, new xid(1));
        fwf.e(ay6.class, new qid(7));
        fwf.e(ffa.class, new qid(8));
        fwf.e(vlb.class, new xid(2));
        fwf.e(vdg.class, new xid(3));
        fwf.e(ch.class, new xid(4));
        fwf.e(eu3.class, new xid(5));
        fwf.e(ph4.class, new xid(6));
        fwf.e(ptb.class, new xid(7));
        fwf.c(cls, new xoa(29));
        fwf.e(rtb.class, new xid(8));
        fwf.e(ttb.class, new xid(10));
        fwf.e(km3.class, new xid(11));
        fwf.e(hsb.class, new xid(12));
        fwf.e(esb.class, new xid(13));
        fwf.e(ff9.class, new xid(14));
        fwf.e(cd9.class, new xid(15));
        fwf.e(j89.class, new rid(9));
        fwf.e(eq2.class, new xid(16));
        fwf.e(gb9.class, new xid(17));
        fwf.e(to9.class, new xid(18));
        fwf.e(d6b.class, new xid(19));
        fwf.e(fa9.class, new xid(21));
        fwf.e(o82.class, new xid(22));
        fwf.e(d3d.class, new xid(23));
        fwf.e(qa2.class, new xid(24));
        fwf.e(r62.class, new xid(25));
        fwf.e(my2.class, new xid(26));
        fwf.e(qx2.class, new xid(27));
        fwf.e(edd.class, new xid(28));
        fwf.c(cls, new qid(0));
        fwf.e(rl2.class, new rid(10));
        fwf.e(ur2.class, new rid(11));
        fwf.e(fu2.class, new xid(29));
        fwf.e(lz1.class, new yid(0));
        fwf.e(jz1.class, new yid(2));
        fwf.e(d1d.class, new yid(3));
        fwf.e(is9.class, new yid(4));
        fwf.c(cls, new qid(1));
        fwf.e(iaa.class, new yid(5));
        fwf.c(cls, new qid(2));
        fwf.e(is3.class, new yid(6));
        fwf.e(ln5.class, new yid(7));
        fwf.e(moe.class, new yid(8));
        fwf.e(bte.class, new yid(9));
        fwf.e(nre.class, new yid(10));
        fwf.e(hud.class, new yid(11));
        fwf.e(rm.class, new yid(13));
        fwf.e(gvc.class, new yid(14));
        fwf.e(gl5.class, new yid(15));
        fwf.e(z88.class, new yid(16));
        fwf.e(vqe.class, new yid(17));
        fwf.c(cls, new qid(3));
        fwf.e(vi5.class, new yid(18));
        fwf.e(ai5.class, new yid(19));
        fwf.c(cls, new qid(4));
        fwf.e(su.class, new yid(20));
        fwf.e(u82.class, new yid(21));
        fwf.c(cls, new qid(5));
        fwf.e(hw9.class, new yid(22));
        fwf.e(t20.class, new yid(24));
        fwf.e(uk5.class, new yid(25));
        fwf.e(ocd.class, new yid(26));
        fwf.e(sz4.class, new yid(27));
        fwf.e(hje.class, new yid(28));
        fwf.e(rla.class, new yid(29));
        fwf.e(vaf.class, new zid(0));
        fwf.e(hz.class, new zid(1));
        fwf.e(ae9.class, new zid(2));
        fwf.e(ysc.class, new zid(3));
        fwf.e(y13.class, new zid(5));
        fwf.e(e1d.class, new zid(6));
        fwf.e(f32.class, new zid(7));
        fwf.e(no3.class, new zid(8));
        fwf.e(sa2.class, new zid(9));
        fwf.e(gc1.class, new zid(10));
        fwf.e(rf9.class, new zid(11));
        fwf.e(kvb.class, new zid(12));
        fwf.e(m98.class, new zid(13));
        fwf.e(d18.class, new zid(14));
        fwf.e(ief.class, new jcb(21));
        fwf.e(g6d.class, new jcb(22));
        fwf.e(c7d.class, new jcb(23));
        fwf.e(z6d.class, new jcb(24));
        fwf.e(f6d.class, new jcb(25));
        fwf.e(p7d.class, new jcb(26));
        fwf.e(o7d.class, new jcb(27));
        fwf.e(fzf.class, new jcb(28));
        fwf.e(yf9.class, new jcb(29));
        fwf.e(ju4.class, new sid(0));
        fwf.e(v4g.class, new sid(2));
        fwf.e(pq3.class, new sid(3));
        fwf.e(cc2.class, new sid(4));
        fwf.e(ere.class, new sid(5));
        fwf.e(fi5.class, new sid(6));
        fwf.e(rh5.class, new sid(7));
        fwf.e(wuc.class, new sid(8));
        fwf.e(ze4.class, new sid(9));
        fwf.e(ic1.class, new sid(10));
        fwf.e(gk.class, new sid(11));
        fwf.e(rk.class, new sid(13));
        fwf.e(oj7.class, new sid(14));
        fwf.e(gcf.class, new sid(15));
        fwf.e(qi5.class, new sid(16));
        fwf.e(mi5.class, new sid(17));
        fwf.e(acf.class, new sid(18));
        fwf.e(ed2.class, new sid(19));
        fwf.e(ybf.class, new sid(20));
        fwf.e(fba.class, new sid(21));
        fwf.e(qfa.class, new sid(22));
        fwf.c(cls, new qid(6));
        fwf.e(wba.class, new sid(24));
        fwf.e(dbe.class, new sid(25));
        fwf.e(oca.class, new sid(26));
        fwf.e(vtd.class, new sid(27));
        fwf.e(ne7.class, new sid(28));
        fwf.e(icf.class, new sid(29));
        fwf.e(bba.class, new tid(0));
        fwf.e(jba.class, new tid(1));
        fwf.e(mba.class, new tid(2));
        fwf.e(yaa.class, new tid(3));
        fwf.e(waa.class, new tid(5));
        fwf.e(yba.class, new tid(6));
        fwf.e(uaa.class, new tid(7));
        fwf.e(hba.class, new tid(8));
        fwf.e(paa.class, new tid(9));
        fwf.e(eba.class, new tid(10));
        fwf.e(aca.class, new tid(11));
        fwf.e(tba.class, new tid(12));
        fwf.e(ce0.class, new tid(13));
        fwf.e(z84.class, new tid(14));
        fwf.e(mq0.class, new tid(16));
        fwf.e(bu4.class, new tid(17));
        fwf.e(t4g.class, new tid(18));
        fwf.e(p1f.class, new tid(19));
        fwf.e(iz.class, new tid(20));
        fwf.e(tld.class, new tid(21));
        fwf.e(meb.class, new tid(22));
        fwf.e(deb.class, new tid(23));
        fwf.c(cls, new xoa(19));
        fwf.e(hp4.class, new tid(24));
        fwf.e(ur4.class, new tid(25));
        fwf.e(iac.class, new tid(27));
        fwf.c(cls, new xoa(20));
        fwf.e(mfa.class, new tid(28));
        fwf.c(cls, new xoa(21));
        fwf.e(hga.class, new tid(29));
        fwf.e(po9.class, new uid(0));
        fwf.e(mo9.class, new uid(1));
        fwf.e(pl5.class, new uid(2));
        fwf.e(kf4.class, new uid(3));
        fwf.e(rl5.class, new uid(4));
        fwf.e(drd.class, new uid(5));
        fwf.e(ns3.class, new uid(6));
        fwf.e(yk3.class, new uid(8));
        fwf.e(hl3.class, new uid(9));
        fwf.e(yr3.class, new uid(10));
        fwf.e(rs3.class, new uid(11));
        fwf.e(zk3.class, new uid(12));
        fwf.e(zr3.class, new uid(13));
        fwf.e(mn4.class, new uid(14));
        fwf.e(rj5.class, new uid(15));
        fwf.c(cls, new xoa(22));
        fwf.e(gj5.class, new uid(16));
        fwf.c(cls, new xoa(23));
        fwf.e(qj5.class, new uid(17));
        fwf.c(cls, new xoa(24));
        fwf.e(jac.class, new uid(19));
        fwf.e(iga.class, new uid(20));
        fwf.e(pga.class, new uid(21));
        fwf.c(cls, new xoa(25));
        fwf.e(dl2.class, new uid(22));
        fwf.e(h38.class, new uid(23));
        fwf.e(kj5.class, new uid(24));
        fwf.e(efa.class, new uid(25));
        fwf.e(bfa.class, new uid(26));
        fwf.d(taf.class, new uid(27));
        fwf.d(bl3.class, new uid(28));
        fwf.d(ghf.class, new vid(0));
        fwf.d(s97.class, new vid(1));
        fwf.d(ve8.class, new vid(2));
        fwf.d(zq6.class, new vid(3));
        fwf.d(r50.class, new vid(4));
        fwf.d(ece.class, new vid(5));
        fwf.d(m18.class, new vid(6));
        fwf.d(fd8.class, new vid(7));
        fwf.d(wc8.class, new vid(8));
        fwf.d(js9.class, new vid(9));
        fwf.d(pj2.class, new vid(12));
        fwf.d(lm5.class, new vid(13));
        fwf.d(ve4.class, new vid(14));
        fwf.b(cls, new xoa(26));
        fwf.d(gga.class, new vid(15));
        fwf.d(f1d.class, new vid(16));
        fwf.d(hm5.class, new vid(17));
        fwf.d(lyf.class, new vid(18));
        fwf.d(sz.class, new vid(19));
        fwf.d(lr6.class, new vid(20));
        fwf.d(q5e.class, new vid(21));
        fwf.d(ruc.class, new vid(23));
        fwf.d(p99.class, new vid(24));
        fwf.d(br6.class, new vid(25));
        fwf.d(xrd.class, new vid(26));
        fwf.d(dw1.class, new vid(27));
        fwf.d(st3.class, new vid(28));
        fwf.d(zp1.class, new vid(29));
        fwf.b(cls, new xoa(27));
        fwf.d(v02.class, new wid(0));
        fwf.d(we2.class, new wid(1));
        fwf.d(o29.class, new wid(2));
        fwf.d(jk3.class, new wid(4));
        fwf.d(bk3.class, new wid(5));
        fwf.d(ir3.class, new wid(6));
        fwf.d(ooe.class, new wid(7));
        fwf.d(pz3.class, new wid(8));
        fwf.d(c48.class, new wid(9));
        fwf.d(evb.class, new wid(10));
        fwf.d(pa2.class, new wid(11));
        fwf.d(qw7.class, new wid(12));
        fwf.d(cb2.class, new wid(13));
        fwf.d(ds7.class, new wid(15));
        fwf.d(wc9.class, new rid(12));
        fwf.d(na9.class, new rid(13));
        fwf.d(i99.class, new rid(14));
        fwf.d(wo9.class, new rid(15));
        fwf.d(swf.class, new rid(0));
        fwf.d(rk5.class, new rid(1));
        fwf.d(x88.class, new wid(16));
        fwf.d(a.class, new wid(17));
        fwf.d(ns2.class, new wid(18));
        fwf.d(bo3.class, new rid(2));
        fwf.d(mq6.class, new qid(9));
        fwf.d(gq6.class, new wid(19));
        fwf.d(jje.class, new rid(3));
        fwf.d(h4f.class, new rid(4));
        fwf.d(h00.class, new wid(20));
        fwf.d(qe3.class, new rid(5));
        fwf.d(ywf.class, new qid(10));
        fwf.d(pwf.class, new qid(11));
        fwf.d(cjd.class, new rid(6));
    }

    public static final m2g S(float f) {
        return f >= ((float) 16) ? m2g.BIG : m2g.SMALL;
    }

    public static final n6e a(int i, int i2, cu0 cu0) {
        if (i < 0) {
            throw new IllegalArgumentException(wj6.h(i, "replay cannot be negative, but was ").toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException(wj6.h(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        } else if (i > 0 || i2 > 0 || cu0 == cu0.a) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = IntCompanionObject.MAX_VALUE;
            }
            return new n6e(i, i3, cu0);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + cu0).toString());
        }
    }

    public static /* synthetic */ n6e b(int i, int i2, cu0 cu0, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            cu0 = cu0.a;
        }
        return a(i, i2, cu0);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static void e(StringBuilder sb, String str) {
        sb.append(Typography.quote);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(Typography.quote);
    }

    public static void f(String str) {
        if (t0g.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final void g(LinkedHashMap linkedHashMap, usd usd, String str, int i) {
        String str2 = Intrinsics.areEqual((Object) usd.getKind(), (Object) zsd.p) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("The suggested name '" + str + "' for " + str2 + ' ' + usd.f(i) + " is already one of the names for " + str2 + ' ' + usd.f(((Number) MapsKt.getValue(linkedHashMap, str)).intValue()) + " in " + usd);
    }

    public static byte[] h(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static final Layout i(Context context, ds7 ds7, CharSequence charSequence, int i, TextPaint textPaint, Function1 function1) {
        Context context2 = context;
        int i2 = i;
        Function1 function12 = function1;
        m2g S = S(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(8288);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(new n2g(context2, S, false, function12), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int b2 = ds7.a(spannableStringBuilder, textPaint, i, IntCompanionObject.MAX_VALUE, false, TextUtils.TruncateAt.END).getLineCount() > 1 ? i2 - g63.b((float) S.b, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) S.a) * vo4.c().getDisplayMetrics().density)) : i2;
        int i3 = b2;
        Layout b3 = ds7.a(spannableStringBuilder, textPaint, b2, 1, false, TextUtils.TruncateAt.END);
        if (i3 == i2) {
            return b3;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b3.getText().subSequence(0, b3.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append(8288);
        spannableStringBuilder2.append(" ");
        spannableStringBuilder2.setSpan(new n2g(context2, S, false, function12), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return ds7.a(spannableStringBuilder2, textPaint, i, 1, false, TextUtils.TruncateAt.END);
    }

    public static void j(t33 t33, l20 l20) {
        m7f m7f;
        if (l20.f()) {
            File l = ((qra) ym.e()).p().l(l20.q);
            if (!l.exists()) {
                synchronized (t33) {
                    m7f = t33.o;
                }
                GifImage gifImage = (GifImage) m7f.a;
                if (gifImage != null) {
                    x10 x10 = l20.b;
                    Bitmap createBitmap = Bitmap.createBitmap(x10.c, x10.o, Bitmap.Config.ARGB_8888);
                    gifImage.d(0).g(x10.c, x10.o, createBitmap);
                    o5a.d0(l.getAbsolutePath(), createBitmap, ym.v.c().b);
                    createBitmap.recycle();
                }
            }
        }
    }

    public static void k(androidx.fragment.app.a aVar, jbf jbf, Uri uri, po5 po5) {
        uu0 uu0 = new uu0(uri, po5, aVar, 2);
        jbf.getClass();
        kbf kbf = (kbf) jbf;
        jbd.b(uu0, kbf.a(), new vl6(aVar), new n77(2), kbf.c());
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void m(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
    }

    public static a20 n(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 3);
    }

    public static void o(Context context, Uri uri, String str) {
        File r = ((qra) ym.e()).p().r(str);
        if (!r.exists() && uri != null) {
            j4b.R(context.getContentResolver().openInputStream(uri), r);
        }
    }

    public static mb3 p(String str, String str2) {
        gb0 gb0 = new gb0(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pac.a(gb0.class));
        return new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ms1(20, gb0), hashSet3);
    }

    public static mfe q(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        mfe mfe;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                mfe = new mfe(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                mfe = new mfe(str, unsatisfiedLinkError.toString());
            }
        } else {
            mfe = new mfe(str, unsatisfiedLinkError.toString());
        }
        mfe.initCause(unsatisfiedLinkError);
        return mfe;
    }

    public static String r(String str, Rect rect, bud bud) {
        String str2 = str;
        Rect rect2 = rect;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2, (BitmapFactory.Options) null);
        if (decodeFile != null) {
            int i = rect2.left;
            int i2 = rect2.top;
            int width = rect.width();
            int height = rect.height();
            z68.c("m5a", "cropImage: sourceWidth=%d, sourceHeight=%d, x=%d, y=%d, width=%d, height=%d", Integer.valueOf(decodeFile.getWidth()), Integer.valueOf(decodeFile.getHeight()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height));
            if (i + width > decodeFile.getWidth() || i2 + height > decodeFile.getHeight()) {
                ((uta) ((qra) ym.e()).o()).c(new Exception("wrong image crop params"), true);
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, i, i2, width, height);
            if (createBitmap != decodeFile) {
                decodeFile.recycle();
            }
            akd akd = (akd) bud;
            akd.getClass();
            int r = (int) akd.r(PmsKey.f79minimagesidesize, (long) 64);
            if (createBitmap.getWidth() < r || createBitmap.getHeight() < r) {
                z68.f("m5a", "Crop width and height must be >= 64", (Throwable) null);
                Locale locale = Locale.ENGLISH;
                ((uta) ((qra) ym.e()).o()).c(new Exception("Crop rect = " + rect2 + " doesn't fit. Crop width and height must be >= 64"), true);
                double d2 = (double) r;
                int max = Math.max((int) Math.ceil(d2 / ((double) createBitmap.getWidth())), (int) Math.ceil(d2 / ((double) createBitmap.getHeight())));
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth() * max, createBitmap.getHeight() * max, false);
                if (createScaledBitmap != createBitmap) {
                    createBitmap.recycle();
                }
                createBitmap = createScaledBitmap;
            }
            po5 p = ((qra) ym.e()).p();
            p.getClass();
            File o = p.o((String) null, "jpg");
            o5a.d0(o.getAbsolutePath(), createBitmap, ym.v.c().b);
            return o.getAbsolutePath();
        }
        z68.f("m5a", "cropImage: failed, no file at path " + str2, (Throwable) null);
        return null;
    }

    public static void s() {
        if (t0g.a >= 18) {
            Trace.endSection();
        }
    }

    public static synchronized void t() {
        synchronized (m5a.class) {
            if (!a) {
                o5a.P("native-imagetranscoder");
                a = true;
            }
        }
    }

    public static long u(int i, long j) {
        long j2 = (long) i;
        bs0.m("sampleRate must be greater than 0.", j2 > 0);
        return (TimeUnit.SECONDS.toNanos(1) * j) / j2;
    }

    public static mb3 v(String str, ip5 ip5) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pac.a(gb0.class));
        for (Class cls : new Class[0]) {
            q8.c(cls, "Null interface");
            hashSet.add(pac.a(cls));
        }
        bm4 a2 = bm4.a(Context.class);
        if (!hashSet.contains(a2.a)) {
            hashSet2.add(a2);
            return new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ib4(28, str, ip5), hashSet3);
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public static final HashSet w(String str) {
        HashSet hashSet = new HashSet();
        try {
            for (String add : StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) {
                hashSet.add(add);
            }
        } catch (Throwable th) {
            z68.f("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
        }
        return hashSet;
    }

    public static /* synthetic */ bs5 x(lj6 lj6, CoroutineContext coroutineContext, int i, cu0 cu0, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            cu0 = cu0.a;
        }
        return lj6.f(coroutineContext, i, cu0);
    }

    public static final bs5 y(k6e k6e, CoroutineContext coroutineContext, int i, cu0 cu0) {
        return ((i == 0 || i == -3) && cu0 == cu0.a) ? k6e : new m12(k6e, coroutineContext, i, cu0);
    }

    public static final wog z(xpg xpg) {
        return new wog(xpg.a, xpg.t);
    }
}
