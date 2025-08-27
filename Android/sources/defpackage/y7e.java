package defpackage;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Insets;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Lazy;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: y7e  reason: default package */
public abstract class y7e {
    public static volatile x7e a;
    public static volatile ArrayList b;
    public static final bpa c = new bpa(10, "UNDEFINED");
    public static final bpa d = new bpa(10, "REUSABLE_CLAIMED");
    public static volatile sd8 e = new t9a(14);
    public static final Object f = new Object();

    /* JADX WARNING: type inference failed for: r3v3, types: [x7e, java.lang.Object] */
    public static x7e A(Context context) {
        if (a == null) {
            try {
                a = (x7e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, y7e.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new Object();
            }
        }
        return a;
    }

    public static final String B(aeb aeb, String str) {
        teb e2 = aeb.e(str);
        if (!aeb.m(e2)) {
            return null;
        }
        String replace = new Regex("\\d").replace((CharSequence) new Regex("^\\+\\d{1,3}\\s?|[\\(\\)]").replace((CharSequence) aeb.d(e2, 2), ""), String.valueOf('X'));
        StringBuilder sb = new StringBuilder();
        int length = replace.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = replace.charAt(i2);
            if (charAt == 'X') {
                sb.append(i);
                i = (i + 1) % 10;
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final void C(ViewStub viewStub, View view, Function0 function0) {
        if (!I(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int indexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = view.getLayoutParams().height;
            layoutParams.width = view.getLayoutParams().width;
            view.setId(viewStub.getId());
            viewGroup.addView(view, indexOfChild, layoutParams);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final bz9 D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        bz9 bz9 = new bz9();
        int i16 = i;
        bz9.e(1, i);
        int i17 = i2;
        bz9.e(2, i2);
        int i18 = i3;
        bz9.e(4, i3);
        int i19 = i4;
        bz9.e(8, i4);
        int i20 = i5;
        bz9.e(16, i5);
        int i21 = i6;
        bz9.e(64, i6);
        int i22 = i7;
        bz9.e(Uuid.SIZE_BITS, i7);
        int i23 = i8;
        bz9.e(256, i8);
        int i24 = i9;
        int i25 = i10;
        bz9.e(i9, i10);
        int i26 = i11;
        int i27 = i12;
        bz9.e(i11, i12);
        int i28 = i13;
        bz9.e(2048, i13);
        bz9.e(ConstantsKt.DEFAULT_BUFFER_SIZE, i14);
        bz9.e(65536, i15);
        return bz9;
    }

    public static final bz9 E(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        bz9 bz9 = new bz9();
        int i19 = i;
        bz9.e(1, i);
        int i20 = i2;
        bz9.e(2, i2);
        int i21 = i3;
        bz9.e(4, i3);
        int i22 = i4;
        bz9.e(8, i4);
        int i23 = i5;
        bz9.e(65536, i5);
        int i24 = i6;
        bz9.e(16, i6);
        int i25 = i7;
        bz9.e(32768, i7);
        int i26 = i8;
        bz9.e(32, i8);
        int i27 = i9;
        bz9.e(64, i9);
        int i28 = i10;
        bz9.e(256, i10);
        int i29 = i11;
        bz9.e(Uuid.SIZE_BITS, i11);
        int i30 = i12;
        int i31 = i13;
        bz9.e(i12, i13);
        bz9.e(i14, i15);
        bz9.e(i16, i17);
        bz9.e(2048, i18);
        return bz9;
    }

    public static final boolean F(View view) {
        Object tag = view.getTag(qqa.b);
        boolean areEqual = Intrinsics.areEqual(tag, (Object) "fade_in");
        boolean areEqual2 = Intrinsics.areEqual(tag, (Object) "fade_out");
        if (tag == null) {
            if (view.getVisibility() != 0) {
                return false;
            }
        } else if (!areEqual && (areEqual2 || view.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static boolean G(vu1 vu1, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) vu1.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e2) {
            throw new Exception(new Exception(e2));
        }
    }

    public static boolean H(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static final boolean I(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static boolean J(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean K(XmlPullParser xmlPullParser, String str) {
        return J(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final boolean L(Lazy lazy) {
        return lazy.isInitialized() && ((View) lazy.getValue()).getVisibility() == 0;
    }

    public static int M(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static float N(tb7 tb7, ea6 ea6) {
        int i = ea6.w;
        int i2 = i % 180;
        int i3 = ea6.u;
        int i4 = ea6.t;
        int i5 = i2 == 0 ? i4 : i3;
        int i6 = i % 180 == 0 ? i3 : i4;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < tb7.size(); i7++) {
            hh8 hh8 = (hh8) tb7.get(i7);
            if (!(hh8 instanceof hh8)) {
                return -1.0f;
            }
            if (hh8 instanceof udd) {
                udd udd = (udd) hh8;
                udd.getClass();
                float f3 = udd.a;
                if (f3 % 90.0f != c44.DEFAULT_ASPECT_RATIO) {
                    return -1.0f;
                }
                f2 += f3;
                int i8 = ((f2 % 180.0f) > c44.DEFAULT_ASPECT_RATIO ? 1 : ((f2 % 180.0f) == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
                i5 = i8 == 0 ? i4 : i3;
                i6 = i8 == 0 ? i3 : i4;
            } else if (!hh8.c(i5, i6)) {
                return -1.0f;
            }
        }
        float f4 = f2 % 360.0f;
        if (f4 % 90.0f == c44.DEFAULT_ASPECT_RATIO) {
            return f4;
        }
        return -1.0f;
    }

    public static void O(g0a g0a, tb7 tb7, ea6 ea6) {
        float N = N(tb7, ea6);
        if (N == 90.0f || N == 180.0f || N == 270.0f) {
            int round = 360 - Math.round(N);
            n79.m("The additional rotation cannot be changed after adding track formats.", g0a.e.size() == 0 || g0a.v == round);
            g0a.v = round;
        }
    }

    public static final boolean P(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != c44.DEFAULT_ASPECT_RATIO;
        }
        return false;
    }

    public static final void Q(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }

    public static void R(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, c44.DEFAULT_ASPECT_RATIO);
        Matrix.rotateM(fArr, 0, f2, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, c44.DEFAULT_ASPECT_RATIO);
    }

    public static void S(float[] fArr) {
        Matrix.translateM(fArr, 0, c44.DEFAULT_ASPECT_RATIO, 0.5f, c44.DEFAULT_ASPECT_RATIO);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, c44.DEFAULT_ASPECT_RATIO);
    }

    public static int T(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int d0 = iq.d0(obj);
        int i4 = d0 & i;
        int Y = Y(i4, obj3);
        if (Y == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = d0 & i5;
        int i7 = -1;
        while (true) {
            i2 = Y - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !cjf.n(obj, objArr[i2]) || (objArr2 != null && !cjf.n(obj2, objArr2[i2]))) {
                int i8 = i3 & i;
                if (i8 == 0) {
                    return -1;
                }
                int i9 = i8;
                i7 = i2;
                Y = i9;
            }
        }
        int i10 = i3 & i;
        if (i7 == -1) {
            Z(i4, i10, obj3);
        } else {
            iArr[i7] = M(iArr[i7], i10, i);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r5.l0() != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        if (r5.l0() != false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void U(kotlin.coroutines.Continuation r6, java.lang.Object r7, kotlin.jvm.functions.Function1 r8) {
        /*
            boolean r0 = r6 instanceof defpackage.zp4
            if (r0 == 0) goto L_0x00bf
            zp4 r6 = (defpackage.zp4) r6
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r7)
            if (r0 != 0) goto L_0x0016
            if (r8 == 0) goto L_0x0014
            kb3 r0 = new kb3
            r0.<init>(r7, r8)
            goto L_0x001d
        L_0x0014:
            r0 = r7
            goto L_0x001d
        L_0x0016:
            jb3 r8 = new jb3
            r1 = 0
            r8.<init>(r0, r1)
            r0 = r8
        L_0x001d:
            q04 r8 = r6.o
            kotlin.coroutines.Continuation r1 = r6.v
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            boolean r8 = r8.r0(r2)
            r2 = 1
            if (r8 == 0) goto L_0x003b
            r6.w = r0
            r6.c = r2
            kotlin.coroutines.CoroutineContext r7 = r1.getContext()
            q04 r8 = r6.o
            r8.p0(r7, r6)
            goto L_0x00c2
        L_0x003b:
            a95 r8 = defpackage.lif.a()
            boolean r3 = r8.x0()
            if (r3 == 0) goto L_0x004e
            r6.w = r0
            r6.c = r2
            r8.u0(r6)
            goto L_0x00c2
        L_0x004e:
            r8.w0(r2)
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()     // Catch:{ all -> 0x0079 }
            om7 r5 = defpackage.om7.a     // Catch:{ all -> 0x0079 }
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r5)     // Catch:{ all -> 0x0079 }
            pm7 r4 = (defpackage.pm7) r4     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x007b
            boolean r5 = r4.isActive()     // Catch:{ all -> 0x0079 }
            if (r5 != 0) goto L_0x007b
            java.util.concurrent.CancellationException r7 = r4.n()     // Catch:{ all -> 0x0079 }
            r6.b(r0, r7)     // Catch:{ all -> 0x0079 }
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)     // Catch:{ all -> 0x0079 }
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)     // Catch:{ all -> 0x0079 }
            r6.resumeWith(r7)     // Catch:{ all -> 0x0079 }
            goto L_0x009f
        L_0x0079:
            r7 = move-exception
            goto L_0x00b6
        L_0x007b:
            java.lang.Object r0 = r6.x     // Catch:{ all -> 0x0079 }
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = defpackage.eif.b(r4, r0)     // Catch:{ all -> 0x0079 }
            bpa r5 = defpackage.eif.a     // Catch:{ all -> 0x0079 }
            if (r0 == r5) goto L_0x008e
            ivf r5 = defpackage.o04.c(r1, r4, r0)     // Catch:{ all -> 0x0079 }
            goto L_0x008f
        L_0x008e:
            r5 = r3
        L_0x008f:
            r1.resumeWith(r7)     // Catch:{ all -> 0x00a9 }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x009c
            boolean r7 = r5.l0()     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x009f
        L_0x009c:
            defpackage.eif.a(r4, r0)     // Catch:{ all -> 0x0079 }
        L_0x009f:
            boolean r7 = r8.z0()     // Catch:{ all -> 0x0079 }
            if (r7 != 0) goto L_0x009f
        L_0x00a5:
            r8.t0(r2)
            goto L_0x00c2
        L_0x00a9:
            r7 = move-exception
            if (r5 == 0) goto L_0x00b2
            boolean r1 = r5.l0()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x00b5
        L_0x00b2:
            defpackage.eif.a(r4, r0)     // Catch:{ all -> 0x0079 }
        L_0x00b5:
            throw r7     // Catch:{ all -> 0x0079 }
        L_0x00b6:
            r6.g(r7, r3)     // Catch:{ all -> 0x00ba }
            goto L_0x00a5
        L_0x00ba:
            r6 = move-exception
            r8.t0(r2)
            throw r6
        L_0x00bf:
            r6.resumeWith(r7)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.U(kotlin.coroutines.Continuation, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    public static final int V(apd apd, int i) {
        int i2;
        int[] iArr = apd.w;
        int i3 = i + 1;
        int length = apd.v.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static boolean W(ea6 ea6, gd3 gd3, int i, hrf hrf, f43 f43, g0a g0a) {
        sp9 sp9;
        if (gd3.a.size() <= 1) {
            tb7 tb7 = gd3.a;
            if (((f05) tb7.get(i)).a.size() <= 1) {
                if (f43.p()) {
                    return true;
                }
                String str = hrf.b;
                if (str != null && !str.equals(ea6.n)) {
                    return true;
                }
                if (hrf.b == null && !g0a.h(ea6.n)) {
                    return true;
                }
                e05 e05 = (e05) ((f05) tb7.get(i)).a.get(0);
                if (e05.d && (sp9 = ea6.k) != null) {
                    int i2 = 0;
                    while (true) {
                        qp9[] qp9Arr = sp9.a;
                        if (i2 >= qp9Arr.length) {
                            break;
                        } else if (qp9Arr[i2] instanceof hee) {
                            return true;
                        } else {
                            i2++;
                        }
                    }
                }
                return !e05.g.a.isEmpty() || !gd3.c.a.isEmpty();
            }
        }
        return !gd3.e;
    }

    public static boolean X(ea6 ea6, gd3 gd3, int i, hrf hrf, f43 f43, g0a g0a) {
        if (gd3.a.size() <= 1) {
            tb7 tb7 = gd3.a;
            if (((f05) tb7.get(i)).a.size() <= 1) {
                e05 e05 = (e05) ((f05) tb7.get(i)).a.get(0);
                if (f43.l() || hrf.d != 0) {
                    return true;
                }
                String str = hrf.c;
                if (str != null && !str.equals(ea6.n)) {
                    return true;
                }
                if ((str == null && !g0a.h(ea6.n)) || ea6.x != 1.0f) {
                    return true;
                }
                tb7 tb72 = e05.g.b;
                return !tb72.isEmpty() && N(tb72, ea6) == -1.0f;
            }
        }
        return !gd3.f;
    }

    public static int Y(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & UByte.MAX_VALUE : obj instanceof short[] ? ((short[]) obj)[i] & UShort.MAX_VALUE : ((int[]) obj)[i];
    }

    public static void Z(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final ArrayList a(sqd sqd) {
        boolean z = sqd.k == 2;
        ArrayList arrayList = new ArrayList(sqd.a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uqd uqd = (uqd) it.next();
            k48 N = cvg.N(uqd.a);
            String g = sqd.g(uqd);
            arrayList2.add(new tqd(N, z, N.Y, Uri.parse((g == null ? sqd.n(uqd) : sqd.k(uqd.a.a, g)).b), (Uri) null, 240));
        }
        return arrayList2;
    }

    public static final void a0(fwf fwf) {
        fwf.c(oa4.class, new sm4(23));
    }

    public static final void b(List list, View view, boolean z) {
        float f2 = 1.0f;
        float f3 = c44.DEFAULT_ASPECT_RATIO;
        float f4 = z ? 0.0f : 1.0f;
        if (!z) {
            f2 = 0.0f;
        }
        float f5 = z ? -(vo4.c().getDisplayMetrics().density * 50.0f) : 0.0f;
        if (!z) {
            f3 = -(vo4.c().getDisplayMetrics().density * 50.0f);
        }
        view.setTranslationY(f5);
        list.add(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f4, f2}));
        list.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f5, f3}));
    }

    public static final void c(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final ObjectAnimator e(View view, boolean z, float f2, float f3, long j) {
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2, f3});
        ofFloat.setStartDelay(z ? j - 50 : 0);
        ofFloat.setDuration(50);
        return ofFloat;
    }

    public static final void f(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(wj6.h(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static Object g(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException(wj6.h(i, "must be power of 2 between 2^1 and 2^30: "));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int h(defpackage.f8d r17, defpackage.v3d r18, defpackage.j55 r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = defpackage.j55.V(r19)
            r3 = 1
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r2 = defpackage.j55.V(r19)
            java.lang.String r4 = "Check failed."
            if (r2 == 0) goto L_0x011a
            if (r0 == 0) goto L_0x00a3
            int r2 = r0.b
            if (r2 <= 0) goto L_0x00a3
            int r5 = r0.a
            if (r5 <= 0) goto L_0x00a3
            r19.m0()
            int r6 = r1.w
            if (r6 == 0) goto L_0x00a3
            r19.m0()
            int r6 = r1.x
            if (r6 != 0) goto L_0x002e
            goto L_0x00a3
        L_0x002e:
            r17.getClass()
            r19.m0()
            int r6 = r1.o
            r7 = 270(0x10e, float:3.78E-43)
            r8 = 90
            if (r6 == 0) goto L_0x004f
            if (r6 == r8) goto L_0x004f
            r9 = 180(0xb4, float:2.52E-43)
            if (r6 == r9) goto L_0x004f
            if (r6 != r7) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x004f:
            if (r6 == r8) goto L_0x0056
            if (r6 != r7) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r4 = 0
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            if (r4 == 0) goto L_0x005f
            r19.m0()
            int r6 = r1.x
            goto L_0x0064
        L_0x005f:
            r19.m0()
            int r6 = r1.w
        L_0x0064:
            if (r4 == 0) goto L_0x006c
            r19.m0()
            int r4 = r1.w
            goto L_0x0071
        L_0x006c:
            r19.m0()
            int r4 = r1.x
        L_0x0071:
            float r7 = (float) r5
            float r8 = (float) r6
            float r7 = r7 / r8
            float r8 = (float) r2
            float r9 = (float) r4
            float r8 = r8 / r9
            float r9 = kotlin.ranges.RangesKt.coerceAtLeast((float) r7, (float) r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            java.lang.Float r14 = java.lang.Float.valueOf(r7)
            java.lang.Float r15 = java.lang.Float.valueOf(r8)
            java.lang.Float r16 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r4 = "DownsampleUtil"
            java.lang.String r5 = "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f"
            defpackage.bg5.j(r4, r5, r2)
            goto L_0x00a5
        L_0x00a3:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            r19.m0()
            h97 r2 = r1.c
            h97 r4 = defpackage.eg4.a
            r5 = 2
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r2 != r4) goto L_0x00cd
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            goto L_0x00e8
        L_0x00bc:
            r3 = r5
        L_0x00bd:
            int r2 = r3 * 2
            double r4 = (double) r2
            double r4 = r7 / r4
            double r10 = (double) r6
            double r10 = r10 * r4
            double r10 = r10 + r4
            double r4 = (double) r9
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00cb
            goto L_0x00e8
        L_0x00cb:
            r3 = r2
            goto L_0x00bd
        L_0x00cd:
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d2
            goto L_0x00e8
        L_0x00d2:
            double r10 = (double) r5
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 - r10
            double r12 = r7 / r12
            double r10 = r7 / r10
            double r14 = (double) r6
            double r12 = r12 * r14
            double r12 = r12 + r10
            double r10 = (double) r9
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0115
            int r3 = r5 + -1
        L_0x00e8:
            r19.m0()
            int r2 = r1.x
            r19.m0()
            int r4 = r1.w
            int r2 = java.lang.Math.max(r2, r4)
            if (r0 == 0) goto L_0x00fb
            float r0 = r0.c
            goto L_0x00fe
        L_0x00fb:
            r10 = r20
            float r0 = (float) r10
        L_0x00fe:
            int r4 = r2 / r3
            float r4 = (float) r4
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0114
            r19.m0()
            h97 r4 = r1.c
            h97 r5 = defpackage.eg4.a
            if (r4 != r5) goto L_0x0111
            int r3 = r3 * 2
            goto L_0x00fe
        L_0x0111:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0114:
            return r3
        L_0x0115:
            r10 = r20
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.h(f8d, v3d, j55, int):int");
    }

    public static String i(SSLSocket sSLSocket, String str) {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            int length = peerCertificates.length;
            StringBuilder sb = new StringBuilder("host=" + str + ", certificates(" + length + ")=\n");
            int length2 = peerCertificates.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                Certificate certificate = peerCertificates[i];
                sb.append("#" + i2 + " " + certificate + "\n");
                i++;
                i2++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return a81.m("failed to retrieve certificates, host=", str);
        }
    }

    public static final void j(View view, boolean z, long j, Function1 function1) {
        int i = qqa.b;
        Object tag = view.getTag(i);
        if (tag == null) {
            boolean z2 = false;
            if ((view.getVisibility() == 0) == z) {
                if (function1 != null) {
                    if (view.getVisibility() == 0) {
                        z2 = true;
                    }
                    function1.invoke(Boolean.valueOf(z2));
                    return;
                }
                return;
            }
        }
        boolean areEqual = Intrinsics.areEqual(tag, (Object) "fade_in");
        boolean areEqual2 = Intrinsics.areEqual(tag, (Object) "fade_out");
        if (areEqual && z) {
            return;
        }
        if (!areEqual2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float f2 = z ? 0.0f : 1.0f;
            float f3 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f3).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new ah(view, i, str, f2, f3, z, function1)).start();
        }
    }

    public static /* synthetic */ void k(View view, boolean z, long j, Function1 function1, int i) {
        if ((i & 2) != 0) {
            j = 150;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        j(view, z, j, function1);
    }

    public static void l(StringBuilder sb, X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            if (x509Certificate.getSubjectDN() != null) {
                sb.append("subjectDN=");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("; ");
            }
            if (x509Certificate.getIssuerDN() != null) {
                sb.append("issuerDN=");
                sb.append(x509Certificate.getIssuerDN().getName());
                sb.append("; ");
            }
            if (x509Certificate.getNotBefore() != null) {
                sb.append("notBefore=");
                sb.append(x509Certificate.getNotBefore());
                sb.append("; ");
            }
            if (x509Certificate.getNotAfter() != null) {
                sb.append("notAfter=");
                sb.append(x509Certificate.getNotAfter());
                sb.append("; ");
            }
            sb.append("\n");
        }
    }

    public static final View m(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static bnf n(RecyclerView recyclerView) {
        bnf bnf = new bnf(new bv1(4));
        bnf.v(recyclerView);
        return bnf;
    }

    public static final String o(aeb aeb, String str, String str2, String str3, int i) {
        try {
            teb t = aeb.t(str2, str3);
            if (aeb.m(t)) {
                str2 = aeb.d(t, 2);
            }
        } catch (NumberParseException unused) {
        }
        if (Intrinsics.areEqual((Object) StringsKt.take(str2, str.length()), (Object) str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(charAt);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                i2++;
            }
        }
        return StringsKt.trim((CharSequence) sb.toString()).toString();
    }

    public static final Application p(zy9 zy9) {
        Object obj = zy9.a.get(cbg.d);
        if (obj != null) {
            return (Application) obj;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final Integer r(View view) {
        Insets c2;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (c2 = rootWindowInsets.getInsets(8)) == null) {
                return null;
            }
            return Integer.valueOf(c2.bottom);
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 != null) {
            return Integer.valueOf(rootWindowInsets2.getSystemWindowInsetBottom());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String s(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            if (r8 == 0) goto L_0x002c
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x002a }
            if (r9 == 0) goto L_0x002c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x002a }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalArgumentException -> 0x002a }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            r7 = r8
            goto L_0x0040
        L_0x002a:
            r9 = move-exception
            goto L_0x0036
        L_0x002c:
            if (r8 == 0) goto L_0x003f
        L_0x002e:
            r8.close()
            goto L_0x003f
        L_0x0032:
            r9 = move-exception
            goto L_0x0040
        L_0x0034:
            r9 = move-exception
            r8 = r7
        L_0x0036:
            java.util.Locale.getDefault()     // Catch:{ all -> 0x0027 }
            r9.getMessage()     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x003f
            goto L_0x002e
        L_0x003f:
            return r7
        L_0x0040:
            if (r7 == 0) goto L_0x0045
            r7.close()
        L_0x0045:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.s(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static final View t(Lazy lazy) {
        if (L(lazy)) {
            return (View) lazy.getValue();
        }
        return null;
    }

    public static final GridLayoutManager u(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (GridLayoutManager) layoutManager;
        }
        return null;
    }

    public static final LinearLayoutManager v(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static final int w(Lazy lazy) {
        if (lazy.isInitialized()) {
            return ((View) lazy.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int x(aeb aeb, String str) {
        teb e2 = aeb.e(str);
        if (!aeb.m(e2)) {
            return IntCompanionObject.MAX_VALUE;
        }
        String d2 = aeb.d(e2, 1);
        int i = e2.a;
        return StringsKt.trim((CharSequence) StringsKt__StringsKt.removePrefix(d2, (CharSequence) "+" + i)).toString().length();
    }

    public static int y(String str) {
        int g = vq9.g(str);
        if (g == 4) {
            return 2;
        }
        return g;
    }

    public static List z(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, Uuid.SIZE_BITS)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        rae.w(Class.forName(string, false, y7e.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                        arrayList.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }
}
