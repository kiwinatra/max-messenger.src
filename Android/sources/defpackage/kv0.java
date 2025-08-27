package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpStatus;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: kv0  reason: default package */
public abstract class kv0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final frg b = new frg("HEAP_DUMP", 2);
    public static final u9a c = new u9a(16);
    public static final tj5 d;
    public static final tj5[] e;
    public static vpa f;
    public static Context g;
    public static q1h h;

    static {
        tj5 tj5 = new tj5("CLIENT_TELEMETRY", 1);
        d = tj5;
        e = new tj5[]{tj5};
    }

    public static cz1 A(Context context) {
        go1 go1;
        context.getClass();
        cvb cvb = cvb.f;
        synchronized (cvb.a) {
            go1 = cvb.b;
            if (go1 == null) {
                go1 = m5a.F(new pbb(2, cvb, new uv1(context)));
                cvb.b = go1;
            }
        }
        bu1 bu1 = new bu1(3, new bn7(2, context));
        return hd8.b0(go1, new xv1(22, (Object) bu1), ryg.j());
    }

    public static final pm7 B(CoroutineContext coroutineContext) {
        pm7 pm7 = (pm7) coroutineContext.get(om7.a);
        if (pm7 != null) {
            return pm7;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static pq4 H(pm7 pm7, dn7 dn7) {
        return pm7 instanceof qn7 ? ((qn7) pm7).P(true, dn7) : pm7.j(dn7.h(), true, new f(29, (Object) dn7));
    }

    public static final boolean I(CoroutineContext coroutineContext) {
        pm7 pm7 = (pm7) coroutineContext.get(om7.a);
        if (pm7 != null) {
            return pm7.isActive();
        }
        return true;
    }

    public static final void J() {
        vpa vpa = f;
        if (vpa == null) {
            vpa = null;
        }
        vpa.getClass();
    }

    public static final void K() {
        vpa vpa = f;
        if (vpa == null) {
            vpa = null;
        }
        vpa.getClass();
    }

    public static final boolean M(vk3 vk3) {
        return vk3 == null || vk3.B();
    }

    public static final gz6 P(List list) {
        Object obj;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!(((gz6) obj) instanceof fz6)) {
                break;
            }
        }
        return (gz6) obj;
    }

    public static int Q(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String R(Map map, c88 c88) {
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object m = c88.m(entry.getValue(), str);
            sb.append(str);
            sb.append('=');
            sb.append(m);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, axf] */
    /* JADX WARNING: type inference failed for: r2v1, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, u05] */
    public static bxf S(lxf lxf) {
        kxf kxf;
        ? obj = new Object();
        obj.g = wyf.UNKNOWN;
        String str = lxf.b;
        no5 no5 = lxf.a;
        vyf vyf = null;
        if (no5 == null) {
            kxf = null;
        } else {
            ? obj2 = new Object();
            obj2.o = str;
            obj2.a = no5.a;
            obj2.c = (xyf) no5.b;
            obj2.b = (String) no5.c;
            kxf = new kxf(obj2);
        }
        obj.a = kxf;
        uyf uyf = lxf.i;
        if (uyf != null) {
            ? obj3 = new Object();
            obj3.a = uyf.a;
            obj3.b = uyf.b;
            vyf = new vyf(obj3);
        }
        obj.h = vyf;
        obj.g = lxf.h;
        obj.b = lxf.c;
        obj.c = lxf.d;
        obj.d = lxf.e;
        obj.f = lxf.g;
        obj.e = lxf.f;
        obj.i = lxf.j;
        return new bxf(obj);
    }

    public static void T(int i, int i2, int i3, int i4, int i5, int i6, z35 z35) {
        int min = Math.min(i, i2);
        int i7 = min / 2;
        float f2 = (float) i4;
        float f3 = (float) i3;
        int i8 = (int) ((f2 / f3) * ((float) min));
        if (min >= i7 && i8 >= i5 && i8 <= i6) {
            X(min, i8, i3, i4, z35);
        } else if (i8 < i5) {
            X(min, i5, i3, i4, z35);
        } else {
            int i9 = (int) ((f3 / f2) * ((float) i6));
            if (i9 < i7 || i6 < i5) {
                X(i7, i6, i3, i4, z35);
            } else {
                X(i9, i6, i3, i4, z35);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.r3 W(defpackage.ky1 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            r3 r1 = new r3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv0.W(ky1):r3");
    }

    public static void X(int i, int i2, int i3, int i4, z35 z35) {
        int i5;
        int i6;
        if (i3 > i4) {
            i5 = (int) ((((float) i4) / ((float) i3)) * ((float) i));
            i6 = i;
        } else {
            i6 = (int) ((((float) i3) / ((float) i4)) * ((float) i2));
            i5 = i2;
        }
        z35.b = i;
        z35.c = i2;
        z35.d = i6;
        z35.e = i5;
    }

    public static final int Y(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & KotlinVersion.MAX_COMPONENT_VALUE) << (i3 * 8);
                } else {
                    i4 <<= 8;
                    i2 = read & KotlinVersion.MAX_COMPONENT_VALUE;
                }
                i4 |= i2;
                i3++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [oz1, android.widget.FrameLayout] */
    /* JADX WARNING: type inference failed for: r0v2, types: [oz1, android.widget.FrameLayout] */
    public static final oz1 a(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new FrameLayout(context) : new FrameLayout(context, (AttributeSet) null, 0);
    }

    public static qm7 b() {
        return new qm7((pm7) null);
    }

    public static final int[] c(k2b k2b) {
        int ordinal = k2b.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new int[]{i8b.Y(0.2f, -1), 0};
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new int[]{i8b.Y(0.5f, -1), 0};
    }

    public static q1h c0(Context context) {
        vzg.m(context);
        "preferredRenderer: ".concat("null");
        q1h q1h = h;
        if (q1h != null) {
            return q1h;
        }
        int i = ot6.e;
        int a2 = ot6.a(13400000, context);
        if (a2 == 0) {
            q1h e0 = e0(0, context);
            h = e0;
            try {
                Parcel R = e0.R(e0.H0(), 9);
                int readInt = R.readInt();
                R.recycle();
                String packageName = context.getPackageName();
                if (readInt == 2 && !packageName.equals("com.google.android.apps.photos")) {
                    try {
                        q1h q1h2 = h;
                        hha hha = new hha(d0(0, context));
                        Parcel H0 = q1h2.H0();
                        hzg.c(H0, hha);
                        q1h2.I0(H0, 11);
                    } catch (UnsatisfiedLinkError unused) {
                        g = null;
                        h = e0(1, context);
                    } catch (RemoteException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                try {
                    q1h q1h3 = h;
                    hha hha2 = new hha(d0(0, context).getResources());
                    Parcel H02 = q1h3.H0();
                    hzg.c(H02, hha2);
                    H02.writeInt(19020000);
                    q1h3.I0(H02, 6);
                    return h;
                } catch (RemoteException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (RemoteException e4) {
                throw new RuntimeException(e4);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(a2);
        }
    }

    public static final void d(Appendable appendable, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
    }

    public static Context d0(int i, Context context) {
        Context context2;
        Context context3 = g;
        if (context3 != null) {
            return context3;
        }
        String str = i == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            context2 = cz4.b(context, cz4.b, str).a;
        } catch (Exception unused) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    context2 = cz4.b(context, cz4.b, "com.google.android.gms.maps_dynamite").a;
                } catch (Exception unused2) {
                    int i2 = ot6.e;
                    try {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        context2 = null;
                    }
                }
            } else {
                int i3 = ot6.e;
                context2 = context.createPackageContext("com.google.android.gms", 3);
            }
        }
        g = context2;
        if (context2 != null) {
            return context2;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static final void e(Throwable th, Appendable appendable) {
        f(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [bvg, q1h] */
    public static q1h e0(int i, Context context) {
        Class<?> loadClass;
        ClassLoader classLoader = d0(i, context).getClassLoader();
        try {
            vzg.m(classLoader);
            loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            IBinder iBinder = (IBinder) loadClass.newInstance();
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return queryLocalInterface instanceof q1h ? (q1h) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
            }
            throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()), e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()), e3);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[LOOP:1: B:16:0x0059->B:17:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[LOOP:2: B:24:0x00a6->B:25:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.Throwable r8, java.lang.Appendable r9, int r10, java.lang.String r11, java.lang.StackTraceElement[] r12, int r13, java.util.IdentityHashMap r14) {
        /*
            boolean r0 = r14.containsKey(r8)
            r1 = 10
            r2 = 1
            if (r0 == 0) goto L_0x0024
            d(r9, r2)
            java.lang.String r10 = "[CIRCULAR REFERENCE: "
            java.lang.Appendable r9 = r9.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.Appendable r8 = r9.append(r8)
            java.lang.String r9 = "]"
            java.lang.Appendable r8 = r8.append(r9)
            r8.append(r1)
            return
        L_0x0024:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r14.put(r8, r0)
            d(r9, r10)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r0 = r8.toString()
            java.lang.Appendable r11 = r11.append(r0)
            r11.append(r1)
            boolean r11 = r8 instanceof java.lang.StackOverflowError
            r0 = 0
            if (r11 == 0) goto L_0x0051
            r11 = r12[r0]
            int r3 = r12.length
        L_0x0043:
            if (r2 >= r3) goto L_0x0051
            r4 = r12[r2]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0051:
            r2 = r0
        L_0x0052:
            if (r2 <= 0) goto L_0x0056
            r11 = r2
            goto L_0x0058
        L_0x0056:
            int r11 = r12.length
            int r11 = r11 - r13
        L_0x0058:
            r3 = r0
        L_0x0059:
            if (r3 >= r11) goto L_0x0066
            r4 = r12[r3]
            int r5 = r10 + 1
            r6 = 4
            g(r4, r9, r5, r6)
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0066:
            java.lang.String r11 = "... "
            if (r2 <= 0) goto L_0x0085
            int r13 = r10 + 1
            d(r9, r13)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r2)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " calls repeat"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
            goto L_0x00a1
        L_0x0085:
            if (r13 == 0) goto L_0x00a1
            int r2 = r10 + 1
            d(r9, r2)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " more"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
        L_0x00a1:
            java.lang.Throwable[] r11 = r8.getSuppressed()
            int r13 = r11.length
        L_0x00a6:
            if (r0 >= r13) goto L_0x00be
            r1 = r11[r0]
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            int r3 = r10 + 1
            java.lang.String r4 = "Suppressed: "
            int r6 = s(r12, r5)
            r2 = r9
            r7 = r14
            f(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r0 + 1
            goto L_0x00a6
        L_0x00be:
            java.lang.Throwable r1 = r8.getCause()
            if (r1 == 0) goto L_0x00d4
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            java.lang.String r4 = "Caused by: "
            int r6 = s(r12, r5)
            r2 = r9
            r3 = r10
            r7 = r14
            f(r1, r2, r3, r4, r5, r6, r7)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv0.f(java.lang.Throwable, java.lang.Appendable, int, java.lang.String, java.lang.StackTraceElement[], int, java.util.IdentityHashMap):void");
    }

    public static void g(StackTraceElement stackTraceElement, Appendable appendable, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        d(appendable, i);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            str = "Native Method";
        } else {
            str = stackTraceElement.getFileName();
            if (str == null) {
                str = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(str);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append(10);
    }

    public static final co1 h(oka oka) {
        return bs0.k(new ebd(oka, (Continuation) null));
    }

    public static final bs5 i(u08 u08) {
        return bs0.j(bs0.k(new uv5(u08, (Continuation) null)), -1, 2);
    }

    public static x04 j(bs5 bs5, CoroutineContext coroutineContext, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        x04 X = j4b.X(coroutineContext, MultiFileUploader.UPLOAD_NEXT_INTERVAL, new vv5(bs5, (Continuation) null));
        if (bs5 instanceof ome) {
            if (gs.U().o.U()) {
                X.k(((ome) bs5).getValue());
            } else {
                X.i(((ome) bs5).getValue());
            }
        }
        return X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(java.lang.StringBuilder r2, java.lang.Object r3) {
        /*
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r2.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv0.k(java.lang.StringBuilder, java.lang.Object):void");
    }

    public static final void n(CoroutineContext coroutineContext, CancellationException cancellationException) {
        pm7 pm7 = (pm7) coroutineContext.get(om7.a);
        if (pm7 != null) {
            pm7.b(cancellationException);
        }
    }

    public static int o(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static final d7 p(Context context, Integer num) {
        d7 d7Var = new d7(context, 1);
        d7Var.setId(mhc.swipe_fade);
        d7Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        d7Var.setBackgroundColor(num != null ? num.intValue() : i8b.Y(0.5f, -16777216));
        return d7Var;
    }

    public static final void q(CoroutineContext coroutineContext) {
        pm7 pm7 = (pm7) coroutineContext.get(om7.a);
        if (pm7 != null && !pm7.isActive()) {
            throw pm7.n();
        }
    }

    public static final gz6 r(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((gz6) obj) instanceof fz6)) {
                break;
            }
        }
        return (gz6) obj;
    }

    public static final int s(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int lastIndex = ArraysKt.getLastIndex((T[]) stackTraceElementArr);
        int lastIndex2 = ArraysKt.getLastIndex((T[]) stackTraceElementArr2);
        while (lastIndex >= 0 && lastIndex2 >= 0 && Intrinsics.areEqual((Object) stackTraceElementArr[lastIndex], (Object) stackTraceElementArr2[lastIndex2])) {
            lastIndex--;
            lastIndex2--;
        }
        return ArraysKt.getLastIndex((T[]) stackTraceElementArr) - lastIndex;
    }

    public static k0d t(iv0 iv0, ArrayList arrayList) {
        qb7 o = tb7.o();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            o.a(iv0.h(bundle));
        }
        return o.j();
    }

    public static List u(iv0 iv0, ArrayList arrayList, k0d k0d) {
        return arrayList == null ? k0d : t(iv0, arrayList);
    }

    public static void v(int i, g1g g1g) {
        g1g.E(7);
        byte[] bArr = g1g.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Application w() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public abstract int C();

    public abstract int D();

    public abstract int E(View view);

    public abstract int F(CoordinatorLayout coordinatorLayout);

    public abstract int G();

    public abstract boolean L(float f2);

    public abstract boolean N(View view);

    public abstract boolean O(float f2, float f3);

    public abstract void U(Throwable th);

    public abstract void V(gq9 gq9);

    public abstract boolean Z(View view, float f2);

    public abstract void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int l(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float m(int i);

    public abstract int x(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int y();

    public abstract int z();
}
