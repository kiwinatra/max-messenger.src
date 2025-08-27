package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.exoplayer2.ParserException;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import one.me.android.root.RootController;
import one.me.common.bottombar.OneMeBottomBarView;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;

/* renamed from: q8  reason: default package */
public abstract class q8 {
    public static final Object a = null;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ekd d = new ekd(11);
    public static final bpa e = new bpa(10, "NULL");
    public static final bpa f = new bpa(10, "UNINITIALIZED");
    public static final bpa g = new bpa(10, "DONE");
    public static final int[] h = {16843848};
    public static Field i;
    public static Integer j;
    public static Integer k;
    public static Integer l;

    public static final void I(upd upd, long j2, Function1 function1) {
        spd spd = new spd(upd, new xma(j2), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(wma.a, 3), wpd.a, ld9.o, (SuspendLambda) function1, (Function3) null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = upd.w;
        upd.f(spd, false);
    }

    public static e J(ky1 ky1, boolean z) {
        int i2 = ky1.i(5);
        if (i2 == 31) {
            i2 = ky1.i(6) + 32;
        }
        int o = o(ky1);
        int i3 = ky1.i(4);
        String h2 = i2a.h(19, i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            o = o(ky1);
            int i4 = ky1.i(5);
            if (i4 == 31) {
                i4 = ky1.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = ky1.i(4);
            }
        }
        if (z) {
            if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7 || i2 == 17)) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(i2);
                        throw ParserException.c(sb.toString());
                }
            }
            ky1.h();
            if (ky1.h()) {
                ky1.t(14);
            }
            boolean h3 = ky1.h();
            if (i3 != 0) {
                if (i2 == 6 || i2 == 20) {
                    ky1.t(3);
                }
                if (h3) {
                    if (i2 == 22) {
                        ky1.t(16);
                    }
                    if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                        ky1.t(3);
                    }
                    ky1.t(1);
                }
                switch (i2) {
                    case LangUtils.HASH_SEED /*17*/:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i5 = ky1.i(2);
                        if (i5 == 2 || i5 == 3) {
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(i5);
                            throw ParserException.c(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i6 = c[i3];
        if (i6 != -1) {
            return new e(o, i6, h2);
        }
        throw ParserException.a((String) null, (RuntimeException) null);
    }

    public static Intent K(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i2) {
        int i3 = i2 & 2;
        if (i3 == 0 && (i2 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        } else if (i3 == 0 || (i2 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? jw3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i2) : hw3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i2);
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
    }

    public static void L(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (i3 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
                i3++;
            } else {
                throw new IllegalArgumentException(wj6.n(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
        if (size > 0) {
            if (size != strArr.length) {
                int i4 = 0;
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr2[i4] = strArr[i5];
                        i4++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof p8) {
            ((p8) activity).getClass();
        }
        m8.b(activity, strArr, i2);
    }

    public static final void M(View view, jv7 jv7) {
        view.setTag(hic.view_tree_lifecycle_owner, jv7);
    }

    public static void N(View view, float f2) {
        int integer = view.getResources().getInteger(zic.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, edc.state_liftable, -edc.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j2));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f2}).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    public static final void P(Activity activity, z0b z0b) {
        int i2;
        i9d i9d = (i9d) CollectionsKt.firstOrNull(qra.a.z().e().x().e());
        OneMeBottomBarView oneMeBottomBarView = null;
        zx3 zx3 = i9d != null ? i9d.a : null;
        Widget widget = zx3 instanceof Widget ? (Widget) zx3 : null;
        if (widget != null) {
            z68.c(activity.getClass().getName(), "detect snackbar", new Object[0]);
            n0b n0b = z0b.v;
            if (n0b.a == 2) {
                zx3 zx32 = widget;
                while (zx32.getParentController() != null) {
                    zx32 = zx32.getParentController();
                }
                View view = zx32.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    oneMeBottomBarView = (OneMeBottomBarView) view2.findViewById(mva.a);
                }
                if (oneMeBottomBarView != null) {
                    i2 = oneMeBottomBarView.getHeight();
                    e0b e0b = new e0b(widget);
                    e0b.b = z0b.a(z0b, (s0b) null, (CharSequence) null, (CharSequence) null, (y0b) null, new n0b(0, i2 + n0b.c, 3), 15);
                    e0b.j();
                    return;
                }
            }
            i2 = 0;
            e0b e0b2 = new e0b(widget);
            e0b2.b = z0b.a(z0b, (s0b) null, (CharSequence) null, (CharSequence) null, (y0b) null, new n0b(0, i2 + n0b.c, 3), 15);
            e0b2.j();
            return;
        }
        z68.p(activity.getClass().getName(), "widget is null for snackbar");
    }

    public static final void Q(Activity activity, Intent intent) {
        Object obj;
        z0b z0b;
        if (intent == null) {
            intent = activity.getIntent();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl((z0b) cjf.z(intent, "snackbar", z0b.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r0 = Result.m26exceptionOrNullimpl(obj);
        if (r0 != null) {
            z68.o(activity.getClass().getName(), "showSnackbarIfNeeded fail", r0);
        }
        if (Result.m30isSuccessimpl(obj) && (z0b = (z0b) obj) != null) {
            P(activity, z0b);
        }
    }

    public static final void R(fwf fwf) {
        fwf.e(uq7.class, new zid(27));
        fwf.e(due.class, new rid(20));
        fwf.e(iue.class, new rid(21));
    }

    public static void S(i0 i0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        y35 y35 = new y35(16);
        y35 y352 = new y35(16);
        i0Var.m(new n74(y35, countDownLatch, y352), new ep4(5));
        countDownLatch.await();
        Object obj = y352.b;
        if (obj != null) {
            throw ((Throwable) obj);
        }
    }

    public static int T(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    public static Drawable a(Context context, int i2, float f2, boolean z) {
        return z ? new aq0(context, i2, f2, true, false) : new ColorDrawable(i2);
    }

    public static final void b(RootController rootController) {
        if (!rootController.x().n()) {
            opa opa = (opa) qra.a.getAccessor().g(opa.class);
            if (opa.a()) {
                opa.b();
                return;
            }
            ta4 W0 = tc8.b.W0();
            ic8.b.getClass();
            W0.b(bb4.a(ic8.e.a), (Bundle) null);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int d(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : nea.a(new tea(context).b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static void e(long j2, l8b l8b, zpf[] zpfArr) {
        int i2;
        while (true) {
            boolean z = true;
            if (l8b.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (l8b.a() != 0) {
                        int u = l8b.u();
                        i3 += u;
                        if (u != 255) {
                            i2 = i3;
                            break;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (l8b.a() != 0) {
                        int u2 = l8b.u();
                        i4 += u2;
                        if (u2 != 255) {
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                int i5 = l8b.b + i4;
                if (i4 == -1 || i4 > l8b.a()) {
                    i8b.V("Skipping remainder of malformed SEI NAL unit.");
                    i5 = l8b.c;
                } else if (i2 == 4 && i4 >= 8) {
                    int u3 = l8b.u();
                    int A = l8b.A();
                    int g2 = A == 49 ? l8b.g() : 0;
                    int u4 = l8b.u();
                    if (A == 47) {
                        l8b.H(1);
                    }
                    boolean z2 = u3 == 181 && (A == 49 || A == 47) && u4 == 3;
                    if (A == 49) {
                        if (g2 != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        f(j2, l8b, zpfArr);
                    }
                }
                l8b.G(i5);
            } else {
                return;
            }
        }
    }

    public static void f(long j2, l8b l8b, zpf[] zpfArr) {
        l8b l8b2 = l8b;
        zpf[] zpfArr2 = zpfArr;
        int u = l8b.u();
        if ((u & 64) != 0) {
            l8b2.H(1);
            int i2 = (u & 31) * 3;
            int i3 = l8b2.b;
            for (zpf zpf : zpfArr2) {
                l8b2.G(i3);
                zpf.b(l8b2, i2, 0);
                n79.n(j2 != -9223372036854775807L);
                zpf.a(j2, 1, i2, 0, (xpf) null);
            }
        }
    }

    public static final int g(int i2, Object obj) {
        return (i2 * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static void h(Bitmap bitmap, int i2) {
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[12544];
        int i4 = 25;
        int i5 = 1;
        for (int i6 = 1; i6 < 256; i6++) {
            for (int i7 = 0; i7 < 49; i7++) {
                iArr2[i4] = i6;
                i4++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i8 = i2;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = 0;
            while (true) {
                i3 = 24;
                if (i10 >= height) {
                    break;
                }
                int i11 = width * i10;
                i10++;
                int i12 = (i10 * width) - i5;
                int i13 = width + 24;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = -24; i18 < i13; i18++) {
                    int i19 = i11 + i18;
                    if (i19 < i11) {
                        i19 = i11;
                    } else if (i19 > i12) {
                        i19 = i12;
                    }
                    int i20 = iArr[i19];
                    i14 += (i20 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i15 += (i20 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i16 += i20 & KotlinVersion.MAX_COMPONENT_VALUE;
                    i17 += i20 >>> 24;
                    if (i18 >= 24) {
                        iArr3[i18 - 24] = (iArr2[i17] << 24) | (iArr2[i14] << 16) | (iArr2[i15] << 8) | iArr2[i16];
                        int i21 = (i18 - 48) + i11;
                        if (i21 < i11) {
                            i21 = i11;
                        } else if (i21 > i12) {
                            i21 = i12;
                        }
                        int i22 = iArr[i21];
                        i14 -= (i22 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                        i15 -= (i22 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                        i16 -= i22 & KotlinVersion.MAX_COMPONENT_VALUE;
                        i17 -= i22 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i11, width);
                i5 = 1;
            }
            int i23 = 0;
            int i24 = 0;
            while (i24 < width) {
                int i25 = ((height - 1) * width) + i24;
                int i26 = i3 * width;
                int i27 = 48 * width;
                int i28 = i24 - i26;
                int i29 = i23;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                int i33 = i32;
                while (i28 <= i25 + i26) {
                    int i34 = iArr[i28 < i24 ? i24 : i28 > i25 ? i25 : i28];
                    i29 += (i34 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i30 += (i34 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i31 += i34 & KotlinVersion.MAX_COMPONENT_VALUE;
                    i3 = 24;
                    i32 += i34 >>> 24;
                    if (i28 - i26 >= i24) {
                        iArr3[i33] = (iArr2[i32] << 24) | (iArr2[i29] << 16) | (iArr2[i30] << 8) | iArr2[i31];
                        i33++;
                        int i35 = i28 - i27;
                        if (i35 < i24) {
                            i35 = i24;
                        } else if (i35 > i25) {
                            i35 = i25;
                        }
                        int i36 = iArr[i35];
                        i29 -= (i36 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                        i30 -= (i36 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                        i31 -= i36 & KotlinVersion.MAX_COMPONENT_VALUE;
                        i3 = 24;
                        i32 -= i36 >>> 24;
                    }
                    i28 += width;
                }
                int i37 = i24;
                for (int i38 = 0; i38 < height; i38++) {
                    iArr[i37] = iArr3[i38];
                    i37 += width;
                }
                i24++;
                i23 = 0;
            }
            i9++;
            i5 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static final RootController i(Activity activity) {
        t7d t7d = (t7d) activity;
        if (t7d.h().n()) {
            RootController rootController = (RootController) t7d.h().g("RootController");
            t7d.h().I();
            return rootController;
        }
        RootController rootController2 = new RootController();
        e9d h2 = t7d.h();
        i9d n = iq.n(rootController2, (ey3) null, (ey3) null);
        n.d("RootController");
        h2.R(n);
        return rootController2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5.c == r9.hashCode()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList j(int r8, android.content.Context r9) {
        /*
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            f4d r1 = new f4d
            r1.<init>(r0, r9)
            java.lang.Object r2 = defpackage.h4d.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.h4d.b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x0050
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x0050
            java.lang.Object r5 = r3.get(r8)     // Catch:{ all -> 0x003c }
            e4d r5 = (defpackage.e4d) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x0050
            android.content.res.Configuration r6 = r5.b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004d
            if (r9 != 0) goto L_0x003f
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0049
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            goto L_0x00b0
        L_0x003f:
            if (r9 == 0) goto L_0x004d
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            int r7 = r9.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004d
        L_0x0049:
            android.content.res.ColorStateList r3 = r5.a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0052
        L_0x004d:
            r3.remove(r8)     // Catch:{ all -> 0x003c }
        L_0x0050:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            goto L_0x00af
        L_0x0055:
            java.lang.ThreadLocal r2 = defpackage.h4d.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0067
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0067:
            r2 = 1
            r0.getValue(r8, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0076
            r3 = 31
            if (r2 > r3) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            android.content.res.XmlResourceParser r2 = r0.getXml(r8)
            android.content.res.ColorStateList r4 = defpackage.v53.a(r0, r2, r9)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r2 = defpackage.h4d.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.h4d.b     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0096 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x0098
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r8 = move-exception
            goto L_0x00a9
        L_0x0098:
            e4d r0 = new e4d     // Catch:{ all -> 0x0096 }
            android.content.res.Resources r1 = r1.a     // Catch:{ all -> 0x0096 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0096 }
            r0.<init>(r4, r1, r9)     // Catch:{ all -> 0x0096 }
            r3.append(r8, r0)     // Catch:{ all -> 0x0096 }
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            r3 = r4
            goto L_0x00af
        L_0x00a9:
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            throw r8
        L_0x00ab:
            android.content.res.ColorStateList r3 = defpackage.d4d.b(r0, r8, r9)
        L_0x00af:
            return r3
        L_0x00b0:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.j(int, android.content.Context):android.content.res.ColorStateList");
    }

    public static Field k() {
        if (i == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            i = declaredField;
            declaredField.setAccessible(true);
        }
        return i;
    }

    public static int l() {
        if (k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            k = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return k.intValue();
    }

    public static int m() {
        if (j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            j = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return j.intValue();
    }

    public static int n() {
        if (l == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            l = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return l.intValue();
    }

    public static int o(ky1 ky1) {
        int i2 = ky1.i(4);
        if (i2 == 15) {
            return ky1.i(24);
        }
        if (i2 < 13) {
            return b[i2];
        }
        throw ParserException.a((String) null, (RuntimeException) null);
    }

    public static String p(int i2, Context context) {
        j58 j58;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            Object systemService = context.getSystemService("locale");
            j58 = systemService != null ? new j58(new k58(l58.a(systemService))) : j58.b;
        } else {
            j58 = j58.a(y64.A(context));
        }
        if (i3 <= 32 && !j58.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            ye3.b(configuration, j58);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i2);
    }

    public static final void r(Activity activity, Intent intent) {
        Object obj;
        hac hac;
        Object obj2;
        String action;
        int hashCode;
        Object obj3;
        String obj4;
        Intent intent2 = intent;
        boolean z = false;
        qra qra = qra.a;
        opa opa = (opa) qra.getAccessor().g(opa.class);
        if (opa.a()) {
            opa.b();
            return;
        }
        Long l2 = null;
        if (intent.getAction() == null || (intent.getFlags() & 1048576) != 0 || (action = intent.getAction()) == null || ((hashCode = action.hashCode()) == -1173264947 ? !action.equals("android.intent.action.SEND") : hashCode != -58484670 || !action.equals("android.intent.action.SEND_MULTIPLE"))) {
            ((lz0) qra.getAccessor().g(lz0.class)).getClass();
            z68.c("CallActionsProcessor", "handleCallRedirectActionIntent action=" + intent.getAction(), new Object[0]);
            e9d x = qra.z().e().x();
            String action2 = intent.getAction();
            Class<Uri> cls = Uri.class;
            if (action2 == null) {
                Uri data = intent.getData();
                if (data == null) {
                    data = (Uri) cjf.z(intent2, "deep_link", cls);
                }
                if (data != null) {
                    Iterable iterable = (List) eq1.a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (StringsKt__StringsKt.contains$default((CharSequence) data.toString(), (CharSequence) (String) it.next(), false, 2, (Object) null)) {
                                z = eq1.a(x);
                                break;
                            }
                        }
                    }
                }
            } else {
                w91 f2 = o9a.f(action2);
                if (!(f2 instanceof s91) && !(f2 instanceof n91)) {
                    String str = "";
                    if (f2 instanceof t91) {
                        Lazy lazy = eq1.a;
                        String str2 = x.g(":call-incoming") != null ? ":call-incoming" : null;
                        if (str2 == null) {
                            Iterator it2 = x.e().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                String str3 = ((i9d) obj2).b;
                                if (str3 != null && StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) ":call-incoming", false, 2, (Object) null)) {
                                    break;
                                }
                            }
                            i9d i9d = (i9d) obj2;
                            str2 = i9d != null ? i9d.b : null;
                        }
                        if (str2 != null) {
                            x.D(str2);
                        }
                        if (str2 == null) {
                            String stringExtra = intent2.getStringExtra("incoming_param_name");
                            if (stringExtra != null) {
                                str = stringExtra;
                            }
                            String stringExtra2 = intent2.getStringExtra("incoming_param_avatar");
                            long longExtra = intent2.getLongExtra("incoming_param_chat_id", 0);
                            boolean booleanExtra = intent2.getBooleanExtra("incoming_param_is_video", false);
                            ta4 W0 = zb8.b.W0();
                            StringBuilder k2 = i2a.k(":call-incoming?chat_id=", longExtra, "&call_name=", str);
                            k2.append("&call_avatar=");
                            k2.append(stringExtra2);
                            k2.append("&video_enabled=");
                            k2.append(booleanExtra);
                            W0.b(k2.toString(), (Bundle) null);
                        }
                    } else if (f2 instanceof r91) {
                        if (!eq1.a(x)) {
                            String stringExtra3 = intent2.getStringExtra("link_param");
                            if (stringExtra3 != null) {
                                str = stringExtra3;
                            }
                            ta4 W02 = zb8.b.W0();
                            zqd zqd = new zqd(9);
                            zqd.b = ":call-join-preview";
                            zqd.z(str, "link");
                            W02.c(zqd.p(), (Bundle) null);
                        }
                    } else if (f2 instanceof u91) {
                        String stringExtra4 = intent2.getStringExtra("call_id");
                        if (stringExtra4 != null) {
                            str = stringExtra4;
                        }
                        boolean booleanExtra2 = intent2.getBooleanExtra("is_video", false);
                        String[] stringArrayExtra = intent2.getStringArrayExtra("sdk_reasons");
                        if (stringArrayExtra == null) {
                            stringArrayExtra = new String[0];
                        }
                        zb8 zb8 = zb8.b;
                        List list = ArraysKt.toList((T[]) stringArrayExtra);
                        zb8.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(":call-rate?call_id=" + str + "&is_video=" + booleanExtra2);
                        if (!list.isEmpty()) {
                            sb.append("&sdk_reasons=" + CollectionsKt___CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                        }
                        zb8.W0().b(sb.toString(), (Bundle) null);
                    }
                } else if (!eq1.a(x)) {
                    zb8.b.W0().b(":call-active", (Bundle) null);
                }
                z = true;
            }
            if (z) {
                z68.c(activity.getClass().getName(), "call detect", new Object[0]);
                return;
            }
            Uri data2 = intent.getData();
            if (data2 == null) {
                data2 = (Uri) cjf.z(intent2, "deep_link", cls);
            }
            if (data2 != null) {
                qra qra2 = qra.a;
                if (((ta4) qra2.getAccessor().g(ta4.class)).c(data2, (Bundle) null)) {
                    String stringExtra5 = intent2.getStringExtra("external_callback_param_arg");
                    if (stringExtra5 != null) {
                        zb8.b.W0().b(":external_callback", o54.f(TuplesKt.to("params", stringExtra5)));
                    }
                    String name = activity.getClass().getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.o, name, "deep link detect " + data2, (Throwable) null);
                    }
                    String stringExtra6 = intent2.getStringExtra("push_action");
                    if (stringExtra6 != null) {
                        Class<hga> cls2 = hga.class;
                        if (Intrinsics.areEqual((Object) stringExtra6, (Object) "push_action_open_chat")) {
                            try {
                                Result.Companion companion = Result.Companion;
                                obj = Result.m23constructorimpl((hac) cjf.z(intent2, "push_info", hac.class));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                            }
                            Throwable r1 = Result.m26exceptionOrNullimpl(obj);
                            if (r1 != null) {
                                z68.o(activity.getClass().getName(), "fail to fetch push info", r1);
                            }
                            if (Result.m30isSuccessimpl(obj) && (hac = (hac) obj) != null) {
                                iga c2 = ((hga) qra.a.getAccessor().g(cls2)).c();
                                c2.getClass();
                                String str4 = iga.d;
                                z68.c(str4, "onNotificationOpenedForChat: %s", hac);
                                String str5 = hac.b;
                                if (str5 != null) {
                                    try {
                                        c2.b().a("Action", MapsKt.mapOf(TuplesKt.to("trid", Long.valueOf(hac.a)), TuplesKt.to("eKey", str5), TuplesKt.to("p_op", "open_chat")));
                                    } catch (Exception e2) {
                                        z68.f(str4, "onNotificationOpenedForChat: failed", e2);
                                        ((uta) c2.c()).c(new Exception("failed to log notification open for chat", e2), true);
                                    }
                                }
                            }
                        } else if (Intrinsics.areEqual((Object) stringExtra6, (Object) "push_action_open_chats")) {
                            iga c3 = ((hga) qra2.getAccessor().g(cls2)).c();
                            c3.getClass();
                            String str6 = iga.d;
                            z68.c(str6, "onNotificationOpened", new Object[0]);
                            try {
                                c3.b().a("Action", MapsKt.mapOf(TuplesKt.to("p_op", "open_chats")));
                            } catch (Exception e3) {
                                z68.f(str6, "onNotificationOpened: failed", e3);
                                ((uta) c3.c()).c(new Exception("failed to log notification open", e3), true);
                            }
                        }
                    }
                }
            }
        } else {
            ox2 ox2 = ox2.b;
            ox2.getClass();
            Bundle extras = intent.getExtras();
            if (!(extras == null || (obj3 = extras.get("android.intent.extra.shortcut.ID")) == null || (obj4 = obj3.toString()) == null)) {
                l2 = StringsKt.toLongOrNull(obj4);
            }
            ta4 W03 = ox2.W0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ru.ok.tamtam.extra.DATA", intent2);
            if (l2 != null) {
                bundle.putLongArray("selected_ids", new long[]{l2.longValue()});
            }
            Unit unit = Unit.INSTANCE;
            W03.b(":chats/share", bundle);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i0, xae] */
    public static xae s(Throwable th) {
        ? i0Var = new i0();
        th.getClass();
        i0Var.j(th, (Map) null);
        return i0Var;
    }

    public static boolean t(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static void u(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i2)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static MappedByteBuffer v(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public static ConfirmationDestructiveDialog w(String str, String str2, String str3, String str4) {
        ConfirmationDestructiveDialog confirmationDestructiveDialog = new ConfirmationDestructiveDialog();
        confirmationDestructiveDialog.L2(o54.f(TuplesKt.to("destructive:title", str), TuplesKt.to("destructive:message", str2), TuplesKt.to("destructive:negative", str4), TuplesKt.to("destructive:neutral", str3), TuplesKt.to("destructive:data", null)));
        return confirmationDestructiveDialog;
    }

    public static void x(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public void A() {
    }

    public void B() {
    }

    public abstract void C(rw8 rw8);

    public void D() {
    }

    public void E(rw8 rw8) {
    }

    public void F() {
    }

    public void G(rw8 rw8) {
    }

    public void H() {
    }

    public abstract void O(Object obj, float f2);

    public abstract float q(Object obj);

    public void y() {
    }

    public void z() {
    }
}
