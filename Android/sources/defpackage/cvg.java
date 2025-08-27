package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.util.Rational;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import org.apache.http.HttpStatus;

/* renamed from: cvg  reason: default package */
public final class cvg {
    public static ClassLoader b;
    public static Thread c;
    public static final v9a d = new v9a(11);
    public static final bpa e = new bpa(10, "NO_OWNER");
    public static bvf f;
    public static final Object g = new Object();
    public static j5h h;
    public final /* synthetic */ int a;

    public /* synthetic */ cvg(int i) {
        this.a = i;
    }

    public static boolean A(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean B(Throwable th) {
        return v0g.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean C(Throwable th) {
        return v0g.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean D(CharSequence charSequence) {
        return !A(charSequence);
    }

    public static String E(Collection collection) {
        if (collection == null) {
            return null;
        }
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public static p03 F(j74 j74, int i, x2d x2d) {
        dpc dpc = x2d.x;
        tb7 tb7 = x2d.b;
        if (dpc == null) {
            return null;
        }
        ea6 ea6 = x2d.a;
        String str = ea6.m;
        nfd nfd = gze.d0;
        ov0 ov0 = new ov0((str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm"))) ? new vd6(32, nfd) : new lh8(2, nfd), i, ea6);
        try {
            dpc e2 = x2d.e();
            n79.j(e2);
            dpc d2 = x2d.d();
            if (d2 != null) {
                dpc a2 = e2.a(d2, ((ml0) tb7.get(0)).a);
                if (a2 == null) {
                    new vf7(j74, j(x2d, ((ml0) tb7.get(0)).a, e2, 0), x2d.a, 0, (Object) null, ov0).load();
                } else {
                    d2 = a2;
                }
                new vf7(j74, j(x2d, ((ml0) tb7.get(0)).a, d2, 0), x2d.a, 0, (Object) null, ov0).load();
            }
            ov0.c();
            return ov0.a();
        } catch (Throwable th) {
            ov0.c();
            throw th;
        }
    }

    public static String G(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return "";
        }
        int length = charSequence.length() / 4;
        if (length == 0) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        sb.append(charSequence.subSequence(length, charSequence.length()));
        return sb.toString();
    }

    public static dm4 H(g1g g1g) {
        g1g.I(1);
        int x = g1g.x();
        long j = ((long) g1g.b) + ((long) x);
        int i = x / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long p = g1g.p();
            if (p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = p;
            jArr2[i2] = g1g.p();
            g1g.I(2);
            i2++;
        }
        g1g.I((int) (j - ((long) g1g.b)));
        return new dm4(13, (Object) jArr, (Object) jArr2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r3d, java.lang.Object] */
    public static final r3d I(Function0 function0) {
        ? obj = new Object();
        obj.a = function0;
        obj.b = v9a.x;
        return obj;
    }

    public static ztf J(ztf ztf, String[] strArr, Map map) {
        int i = 0;
        if (ztf == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (ztf) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                ztf ztf2 = new ztf();
                int length = strArr.length;
                while (i < length) {
                    ztf2.a((ztf) map.get(strArr[i]));
                    i++;
                }
                return ztf2;
            }
        } else if (strArr != null && strArr.length == 1) {
            ztf.a((ztf) map.get(strArr[0]));
            return ztf;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                ztf.a((ztf) map.get(strArr[i]));
                i++;
            }
        }
        return ztf;
    }

    public static int K(long j) {
        return j > 2147483647L ? IntCompanionObject.MAX_VALUE : j < -2147483648L ? IntCompanionObject.MIN_VALUE : (int) j;
    }

    public static int[] L(Collection collection) {
        if (collection instanceof lj7) {
            lj7 lj7 = (lj7) collection;
            return Arrays.copyOfRange(lj7.a, lj7.b, lj7.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static d48 M(k48 k48) {
        int i;
        k48 k482 = k48;
        int ordinal = k482.Z.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            i = 1;
            if (!(ordinal == 1 || ordinal == 2)) {
                i = 3;
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i = 0;
        }
        long j = k482.a;
        String uri = k482.b.toString();
        Integer num = k482.w;
        if (num != null) {
            i2 = num.intValue();
        }
        int i3 = i2;
        Long l = k482.x;
        return new d48(i, j, uri, k482.Y.toString(), i3, l != null ? l.longValue() : 0, k482.c, k482.v, k482.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = android.net.Uri.parse(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.k48 N(defpackage.d48 r18) {
        /*
            r0 = r18
            java.lang.String r1 = r0.o
            java.lang.String r2 = r0.c
            if (r1 == 0) goto L_0x0012
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 != 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r17 = r1
            goto L_0x0017
        L_0x0012:
            android.net.Uri r1 = android.net.Uri.parse(r2)
            goto L_0x000f
        L_0x0017:
            k48 r1 = new k48
            if (r2 == 0) goto L_0x0024
            android.net.Uri r3 = android.net.Uri.parse(r2)
            if (r3 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r3
            goto L_0x0026
        L_0x0024:
            r6 = r17
        L_0x0026:
            java.lang.String r3 = r0.x
            if (r3 != 0) goto L_0x007b
            sq9 r3 = defpackage.sq9.IMAGE_JPEG
            if (r2 != 0) goto L_0x002f
            goto L_0x0077
        L_0x002f:
            java.lang.String r4 = "."
            int r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r2, (java.lang.String) r4, 0, false, 6, (java.lang.Object) null)
            r5 = -1
            if (r4 != r5) goto L_0x0039
            goto L_0x0077
        L_0x0039:
            int r5 = r2.length()     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = r2.substring(r4, r5)     // Catch:{ all -> 0x0077 }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = r2.toLowerCase(r4)     // Catch:{ all -> 0x0077 }
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r4.getMimeTypeFromExtension(r2)
            if (r2 == 0) goto L_0x0077
            int r4 = r2.length()
            if (r4 != 0) goto L_0x005a
            goto L_0x0077
        L_0x005a:
            o9a r4 = defpackage.sq9.b
            r4.getClass()
            sq9 r2 = defpackage.o9a.k(r2)
            java.lang.String r4 = r2.a
            boolean r5 = defpackage.o9a.l(r4)
            if (r5 != 0) goto L_0x0073
            boolean r4 = defpackage.o9a.m(r4)
            if (r4 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            if (r2 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r3 = r2
        L_0x0077:
            java.lang.String r2 = r3.a
            r7 = r2
            goto L_0x007c
        L_0x007b:
            r7 = r3
        L_0x007c:
            int r2 = r0.v
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            long r2 = r0.w
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            long r9 = r0.y
            r13 = 0
            long r4 = r0.b
            r8 = -1
            r14 = 0
            r15 = 0
            r3 = r1
            r3.<init>(r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvg.N(d48):k48");
    }

    public static Integer O(String str) {
        Long l;
        byte b2;
        byte b3;
        String str2 = str;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str2.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str2.charAt(i);
                if (charAt < 128) {
                    b2 = za8.a[charAt];
                } else {
                    byte[] bArr = za8.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = (long) (-b2);
                    long j2 = (long) 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str2.charAt(i2);
                            if (charAt2 < 128) {
                                b3 = za8.a[charAt2];
                            } else {
                                byte[] bArr2 = za8.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            long j5 = (long) b3;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else if (i != 0) {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l = null;
        if (l == null || l.longValue() != ((long) l.intValue())) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }

    public static boolean P(oka oka, cla cla, zi6 zi6) {
        if (!(oka instanceof t2f)) {
            return false;
        }
        try {
            Object obj = ((t2f) oka).get();
            if (obj == null) {
                p45.a(cla);
                return true;
            }
            try {
                Object apply = zi6.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                oka oka2 = (oka) apply;
                if (oka2 instanceof t2f) {
                    try {
                        Object obj2 = ((t2f) oka2).get();
                        if (obj2 == null) {
                            p45.a(cla);
                            return true;
                        }
                        jka jka = new jka(cla, obj2);
                        cla.c(jka);
                        jka.run();
                    } catch (Throwable th) {
                        hd8.Z(th);
                        p45.b(th, cla);
                        return true;
                    }
                } else {
                    oka2.a(cla);
                }
                return true;
            } catch (Throwable th2) {
                hd8.Z(th2);
                p45.b(th2, cla);
                return true;
            }
        } catch (Throwable th3) {
            hd8.Z(th3);
            p45.b(th3, cla);
            return true;
        }
    }

    public static final void Q(fwf fwf) {
        fwf.c(oa4.class, new qid(13));
        fwf.e(qq6.class, new rid(16));
        fwf.e(u1c.class, new rid(17));
    }

    public static boolean R(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static byte S(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader T() {
        /*
            java.lang.Class<cvg> r0 = defpackage.cvg.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = b     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x00a7
            java.lang.Thread r1 = c     // Catch:{ all -> 0x008f }
            r2 = 0
            if (r1 != 0) goto L_0x0093
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x008f }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x008f }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x008a
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x008f }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0041 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0041 }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x0043
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0041 }
            if (r9 == 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r1 = move-exception
            goto L_0x0091
        L_0x0041:
            r1 = move-exception
            goto L_0x0083
        L_0x0043:
            r8 = r2
        L_0x0044:
            if (r8 != 0) goto L_0x004d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x004d:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0041 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x0056:
            if (r6 >= r1) goto L_0x006a
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0041 }
            if (r7 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006a:
            r5 = r2
        L_0x006b:
            if (r5 != 0) goto L_0x0088
            yx r1 = new yx     // Catch:{ SecurityException -> 0x0081 }
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch:{ SecurityException -> 0x0081 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x007c }
            r1.start()     // Catch:{ SecurityException -> 0x007c }
            r5 = r1
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r5 = r1
            goto L_0x0085
        L_0x007f:
            r4 = r1
            goto L_0x0085
        L_0x0081:
            r1 = move-exception
            goto L_0x007f
        L_0x0083:
            r4 = r1
            r5 = r2
        L_0x0085:
            r4.getMessage()     // Catch:{ all -> 0x003f }
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            r1 = r5
        L_0x008a:
            c = r1     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0093
            goto L_0x00a2
        L_0x008f:
            r1 = move-exception
            goto L_0x00ab
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0093:
            monitor-enter(r1)     // Catch:{ all -> 0x008f }
            java.lang.Thread r3 = c     // Catch:{ SecurityException -> 0x009d }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x009d }
            goto L_0x00a1
        L_0x009b:
            r2 = move-exception
            goto L_0x00a5
        L_0x009d:
            r3 = move-exception
            r3.getMessage()     // Catch:{ all -> 0x009b }
        L_0x00a1:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
        L_0x00a2:
            b = r2     // Catch:{ all -> 0x008f }
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            throw r2     // Catch:{ all -> 0x008f }
        L_0x00a7:
            java.lang.ClassLoader r1 = b     // Catch:{ all -> 0x008f }
            monitor-exit(r0)
            return r1
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvg.T():java.lang.ClassLoader");
    }

    public static Boolean U(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static a0a a() {
        return new a0a(false);
    }

    public static final bvf b() {
        bvf bvf = f;
        if (bvf != null) {
            return bvf;
        }
        synchronized (g) {
            f = new bvf();
            Unit unit = Unit.INSTANCE;
        }
        bvf bvf2 = f;
        if (bvf2 == null) {
            return null;
        }
        return bvf2;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence != null ? charSequence.equals(charSequence2) : charSequence2 == null;
    }

    public static List d(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new lj7(iArr, 0, iArr.length);
    }

    public static e9d e(Activity activity, ViewGroup viewGroup, Bundle bundle) {
        bs0.y();
        bv7 a2 = ev7.a(activity, true);
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = a2;
        if (a2 == null) {
            if (activity instanceof b) {
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl2 = new AndroidXLifecycleHandlerImpl();
                ed6 v = ((b) activity).v();
                v.getClass();
                xe0 xe0 = new xe0(v);
                xe0.h(0, androidXLifecycleHandlerImpl2, "LifecycleHandler", 1);
                xe0.e(false);
                androidXLifecycleHandlerImpl = androidXLifecycleHandlerImpl2;
            } else {
                bob bob = new bob();
                activity.getFragmentManager().beginTransaction().add(bob, "LifecycleHandler").commit();
                androidXLifecycleHandlerImpl = bob;
            }
        }
        androidXLifecycleHandlerImpl.o1(activity);
        s8 u0 = androidXLifecycleHandlerImpl.u0(viewGroup, bundle);
        u0.I();
        u0.e = 1;
        return u0;
    }

    public static q74 j(x2d x2d, String str, dpc dpc, int i) {
        o74 o74 = new o74(1);
        o74.b = hi7.V(str, dpc.c);
        o74.g = dpc.a;
        o74.h = dpc.b;
        String a2 = x2d.a();
        if (a2 == null) {
            a2 = dpc.b(((ml0) x2d.b.get(0)).a).toString();
        }
        o74.e(a2);
        o74.c(i);
        o74.d();
        return o74.b();
    }

    public static HashMap k(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap hashMap) {
        RectF rectF;
        Rect rect2 = rect;
        int i4 = i;
        int i5 = i2;
        boolean z2 = false;
        bs0.m("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF2 = new RectF(rect);
        HashMap hashMap2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) ((hc0) entry.getValue()).a.getWidth(), (float) ((hc0) entry.getValue()).a.getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            hashMap2.put((vzf) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        Rational D = ld9.D(i4, rational);
        if (i5 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) D.getNumerator(), (float) D.getDenominator());
            if (i5 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i5 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else if (i5 == 2) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            } else {
                throw new IllegalStateException(wj6.h(i5, "Unexpected scale type: "));
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            boolean z3 = (i3 == 1) ^ z;
            boolean z4 = i4 == 0 && !z3;
            boolean z5 = i4 == 90 && z3;
            if (z4 || z5) {
                rectF3 = rectF7;
            } else {
                boolean z6 = i4 == 0 && z3;
                boolean z7 = i4 == 270 && !z3;
                if (z6 || z7) {
                    float centerX = rectF3.centerX();
                    float f2 = centerX + centerX;
                    rectF = new RectF(f2 - rectF7.right, rectF7.top, f2 - rectF7.left, rectF7.bottom);
                } else {
                    boolean z8 = i4 == 90 && !z3;
                    boolean z9 = i4 == 180 && z3;
                    if (z8 || z9) {
                        float centerY = rectF3.centerY();
                        float f3 = centerY + centerY;
                        rectF = new RectF(rectF7.left, f3 - rectF7.bottom, rectF7.right, f3 - rectF7.top);
                    } else {
                        boolean z10 = i4 == 180 && !z3;
                        if (i4 == 270 && z3) {
                            z2 = true;
                        }
                        if (z10 || z2) {
                            float centerY2 = rectF3.centerY();
                            float f4 = centerY2 + centerY2;
                            RectF rectF8 = new RectF(rectF7.left, f4 - rectF7.bottom, rectF7.right, f4 - rectF7.top);
                            float centerX2 = rectF3.centerX();
                            float f5 = centerX2 + centerX2;
                            rectF3 = new RectF(f5 - rectF8.right, rectF8.top, f5 - rectF8.left, rectF8.bottom);
                        } else {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i4);
                        }
                    }
                }
                rectF3 = rectF;
            }
        }
        HashMap hashMap3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect3 = new Rect();
            rectF9.round(rect3);
            hashMap3.put((vzf) entry2.getKey(), rect3);
        }
        return hashMap3;
    }

    public static void l(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void n(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(u(str, objArr));
        }
    }

    public static void o(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = u("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = u("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(wj6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void q(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static int r(long j) {
        int i = (int) j;
        b0h.f(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, woe] */
    public static final xoe s(scf scf, Context context) {
        ? obj = new Object();
        int i = scf.n;
        obj.a = i;
        obj.b = i;
        obj.c = scf.d();
        obj.d = scf.e();
        int i2 = scf.l;
        obj.e = i2;
        obj.f = scf.L;
        int i3 = scf.x;
        obj.g = i3;
        obj.h = scf.j;
        obj.i = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i2, i3});
        obj.j = i8b.K(Integer.valueOf(scf.I), (Integer) null, (Integer) null);
        obj.k = ew3.b(context, nad.g1);
        obj.l = ew3.b(context, nad.D1);
        obj.m = ew3.b(context, nad.z0);
        obj.n = ew3.b(context, nad.m1);
        obj.o = ew3.b(context, nad.h0);
        obj.p = ew3.b(context, nad.J);
        obj.q = ew3.b(context, nad.L);
        obj.r = scf.N;
        obj.s = ew3.b(context, nad.u1);
        obj.t = ew3.b(context, nad.n);
        obj.u = i8b.O(Integer.valueOf(scf.J), (Integer) null, (Integer) null, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
        obj.v = ew3.b(context, nad.g2);
        if (obj.a == 0) {
            obj.a = Color.parseColor("#FFE8E8E8");
        }
        if (obj.b == 0) {
            obj.b = Color.parseColor("#FFFFFFFF");
        }
        if (obj.e == 0) {
            obj.e = Color.parseColor("#FF697CFF");
        }
        if (obj.f == 0) {
            obj.f = Color.parseColor("#FFE8E8E8");
        }
        if (obj.g == 0) {
            obj.g = Color.parseColor("#FF5B5B69");
        }
        if (obj.h == 0) {
            obj.h = Color.parseColor("#26333344");
        }
        if (obj.i == null) {
            obj.i = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor("#FF5B5B69"), Color.parseColor("#FF697CFF")});
        }
        if (obj.r == 0) {
            obj.r = Color.parseColor("#FF84848E");
        }
        return new xoe(obj);
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object, fng] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fng t(defpackage.tj3 r7, int r8, java.util.ArrayList r9, defpackage.fng r10) {
        /*
            if (r8 != 0) goto L_0x0005
            int r0 = r7.n0
            goto L_0x0007
        L_0x0005:
            int r0 = r7.o0
        L_0x0007:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x002f
            if (r10 == 0) goto L_0x0011
            int r3 = r10.b
            if (r0 == r3) goto L_0x002f
        L_0x0011:
            r3 = r1
        L_0x0012:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x0032
            java.lang.Object r4 = r9.get(r3)
            fng r4 = (defpackage.fng) r4
            int r5 = r4.b
            if (r5 != r0) goto L_0x002c
            if (r10 == 0) goto L_0x002a
            r10.c(r8, r4)
            r9.remove(r10)
        L_0x002a:
            r10 = r4
            goto L_0x0032
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002f:
            if (r0 == r2) goto L_0x0032
            return r10
        L_0x0032:
            r0 = 1
            if (r10 != 0) goto L_0x008f
            boolean r3 = r7 instanceof defpackage.cy6
            if (r3 == 0) goto L_0x006f
            r3 = r7
            cy6 r3 = (defpackage.cy6) r3
            r4 = r1
        L_0x003d:
            int r5 = r3.r0
            if (r4 >= r5) goto L_0x0056
            tj3[] r5 = r3.q0
            r5 = r5[r4]
            if (r8 != 0) goto L_0x004c
            int r6 = r5.n0
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r8 != r0) goto L_0x0053
            int r6 = r5.o0
            if (r6 == r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 == r2) goto L_0x006f
            r3 = r1
        L_0x005a:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x006f
            java.lang.Object r4 = r9.get(r3)
            fng r4 = (defpackage.fng) r4
            int r5 = r4.b
            if (r5 != r6) goto L_0x006c
            r10 = r4
            goto L_0x006f
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006f:
            if (r10 != 0) goto L_0x008c
            fng r10 = new fng
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.a = r3
            r3 = 0
            r10.d = r3
            r10.e = r2
            int r2 = defpackage.fng.f
            int r3 = r2 + 1
            defpackage.fng.f = r3
            r10.b = r2
            r10.c = r8
        L_0x008c:
            r9.add(r10)
        L_0x008f:
            java.util.ArrayList r2 = r10.a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x0098
            goto L_0x00d3
        L_0x0098:
            r2.add(r7)
            boolean r2 = r7 instanceof defpackage.iv6
            if (r2 == 0) goto L_0x00ac
            r2 = r7
            iv6 r2 = (defpackage.iv6) r2
            aj3 r3 = r2.t0
            int r2 = r2.u0
            if (r2 != 0) goto L_0x00a9
            r1 = r0
        L_0x00a9:
            r3.c(r1, r10, r9)
        L_0x00ac:
            int r0 = r10.b
            if (r8 != 0) goto L_0x00bd
            r7.n0 = r0
            aj3 r0 = r7.I
            r0.c(r8, r10, r9)
            aj3 r0 = r7.K
            r0.c(r8, r10, r9)
            goto L_0x00ce
        L_0x00bd:
            r7.o0 = r0
            aj3 r0 = r7.J
            r0.c(r8, r10, r9)
            aj3 r0 = r7.M
            r0.c(r8, r10, r9)
            aj3 r0 = r7.L
            r0.c(r8, r10, r9)
        L_0x00ce:
            aj3 r7 = r7.P
            r7.c(r8, r10, r9)
        L_0x00d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvg.t(tj3, int, java.util.ArrayList, fng):fng");
    }

    public static String u(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int v(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return (bArr[3] & UByte.MAX_VALUE) | (bArr[0] << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8);
        }
        throw new IllegalArgumentException(tf6.Y("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static final lw1 w(Continuation continuation) {
        lw1 lw1;
        lw1 lw12;
        if (!(continuation instanceof zp4)) {
            return new lw1(1, continuation);
        }
        zp4 zp4 = (zp4) continuation;
        zp4.getClass();
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zp4.y;
            Object obj = atomicReferenceFieldUpdater.get(zp4);
            bpa bpa = y7e.d;
            lw1 = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(zp4, bpa);
                lw12 = null;
                break;
            } else if (obj instanceof lw1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(zp4, obj, bpa)) {
                    if (atomicReferenceFieldUpdater.get(zp4) != obj) {
                    }
                }
                lw12 = (lw1) obj;
                break loop0;
            } else if (obj != bpa && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lw12 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = lw1.x;
            Object obj2 = atomicReferenceFieldUpdater2.get(lw12);
            if (!(obj2 instanceof ib3) || ((ib3) obj2).d == null) {
                lw1.w.set(lw12, 536870911);
                atomicReferenceFieldUpdater2.set(lw12, f8.a);
                lw1 = lw12;
            } else {
                lw12.p();
            }
            if (lw1 != null) {
                return lw1;
            }
        }
        return new lw1(2, continuation);
    }

    public static final bhf x(TextView textView) {
        textView.getContext();
        return new bhf(textView, b());
    }

    public static int y(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void z(kw1 kw1, bw1 bw1) {
        if (kw1 instanceof lw1) {
            ((lw1) kw1).x(bw1);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    public ql f(Context context, Looper looper, b33 b33, Object obj, ft6 ft6, gt6 gt6) {
        switch (this.a) {
            case 0:
                g9e g9e = (g9e) obj;
                b33.getClass();
                Integer num = (Integer) b33.y;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Account) b33.a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new f9e(context, looper, b33, bundle, ft6, gt6);
            case 1:
                rae.w(obj);
                throw null;
            case 3:
                return new a(context, looper, 126, b33, ft6, gt6);
            case 5:
                return new p6h(context, looper, b33, (g80) obj, ft6, gt6);
            case 6:
                return new a3h(context, looper, b33, (GoogleSignInOptions) obj, ft6, gt6);
            default:
                return i(context, looper, b33, obj, ft6, gt6);
        }
    }

    public ql g(Context context, Looper looper, b33 b33, Object obj, ft6 ft6, gt6 gt6) {
        switch (this.a) {
            case 2:
                return new twg(context, looper, b33, (oef) obj, ft6, gt6);
            case 4:
                ol olVar = (ol) obj;
                return new i1h(context, looper, b33, ft6, gt6);
            case 7:
                ol olVar2 = (ol) obj;
                return new a(context, looper, HttpStatus.SC_MULTIPLE_CHOICES, b33, ft6, gt6);
            default:
                return h(context, looper, b33, obj, ft6, gt6);
        }
    }

    public final ql h(Context context, Looper looper, b33 b33, Object obj, ft6 ft6, gt6 gt6) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public final ql i(Context context, Looper looper, b33 b33, Object obj, ft6 ft6, gt6 gt6) {
        return g(context, looper, b33, obj, ft6, gt6);
    }
}
