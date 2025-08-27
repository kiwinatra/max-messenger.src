package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.versionedparcelable.ParcelImpl;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.math.MathKt;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: i8b  reason: default package */
public abstract class i8b {
    public static final Object a = new Object();
    public static volatile String b;
    public static final Object c = new Object();
    public static final int[] d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static t2g A(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(i8b.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static CharSequence B(Context context, CharSequence charSequence, List list) {
        if (list == null || list.isEmpty()) {
            return charSequence;
        }
        Lazy lazy = scf.b0;
        return D(charSequence, list, j4b.k0(context).m, j4b.k0(context).l);
    }

    public static SpannableString C(int i, String str, String str2) {
        int i2 = fhf.a;
        String replaceAll = str.replaceAll("[\\n\\r]", " ").replaceAll("\\s{2,}", " ");
        return D(replaceAll, ((qra) ym.e()).B().e(replaceAll, str2), i, 0);
    }

    public static SpannableString D(CharSequence charSequence, List list, int i, int i2) {
        List d2 = ((qra) ym.e()).B().d(charSequence.toString(), list);
        if (cvg.A(charSequence)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        E(charSequence, d2, i, i2, new y3a(27, (Object) spannableString));
        return spannableString;
    }

    public static void E(CharSequence charSequence, List list, int i, int i2, y3a y3a) {
        ForegroundColorSpan foregroundColorSpan;
        if (!cvg.A(charSequence) && !cjf.B(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sld sld = (sld) it.next();
                BackgroundColorSpan backgroundColorSpan = null;
                if (i != 0) {
                    foregroundColorSpan = new ForegroundColorSpan(i);
                    y3a.e(foregroundColorSpan, sld.a, sld.b);
                } else {
                    foregroundColorSpan = null;
                }
                if (i2 != 0) {
                    backgroundColorSpan = new BackgroundColorSpan(i2);
                    y3a.e(backgroundColorSpan, sld.a, sld.b);
                }
                y3a.e(new fld(foregroundColorSpan, backgroundColorSpan), sld.a, sld.b);
            }
        }
    }

    public static void F(String str) {
        synchronized (c) {
            d(str, (Throwable) null);
        }
    }

    public static float G(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final RippleDrawable H(int i, int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        ColorDrawable colorDrawable = i != 0 ? new ColorDrawable(i) : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-65536);
        return new RippleDrawable(valueOf, colorDrawable, shapeDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0.length() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String I(android.content.Context r7) {
        /*
            java.lang.String r0 = "tracer"
            r1 = 0
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r0, r1)
            java.lang.String r2 = "device_id"
            r3 = 0
            java.lang.String r4 = r1.getString(r2, r3)
            if (r4 != 0) goto L_0x0013
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            goto L_0x0014
        L_0x0013:
            r5 = r4
        L_0x0014:
            java.io.File r7 = r7.getFilesDir()     // Catch:{ IOException -> 0x007d }
            java.io.File r7 = kotlin.io.FilesKt.resolve((java.io.File) r7, (java.lang.String) r0)     // Catch:{ IOException -> 0x007d }
            defpackage.f6e.y(r7)     // Catch:{ IOException -> 0x007d }
            java.lang.String r0 = "device_id.txt"
            java.io.File r7 = kotlin.io.FilesKt.resolve((java.io.File) r7, (java.lang.String) r0)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = r3
            goto L_0x003f
        L_0x002d:
            java.lang.String r0 = kotlin.io.FilesKt__FileReadWriteKt.readText$default(r7, (java.nio.charset.Charset) null, 1, (java.lang.Object) null)     // Catch:{ IOException -> 0x002b }
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)     // Catch:{ IOException -> 0x002b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x002b }
            int r6 = r0.length()     // Catch:{ IOException -> 0x002b }
            if (r6 <= 0) goto L_0x002b
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            return r0
        L_0x0042:
            if (r4 != 0) goto L_0x004d
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{  }
            r6.<init>(r7)     // Catch:{  }
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0076 }
            byte[] r7 = r0.getBytes(r7)     // Catch:{ all -> 0x0076 }
            r6.write(r7)     // Catch:{ all -> 0x0076 }
            java.io.FileDescriptor r7 = r6.getFD()     // Catch:{ all -> 0x0076 }
            r7.sync()     // Catch:{ all -> 0x0076 }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0076 }
            kotlin.io.CloseableKt.closeFinally(r6, r3)     // Catch:{  }
            if (r4 == 0) goto L_0x0075
            android.content.SharedPreferences$Editor r7 = r1.edit()
            android.content.SharedPreferences$Editor r7 = r7.remove(r2)
            r7.apply()
        L_0x0075:
            return r0
        L_0x0076:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8b.I(android.content.Context):java.lang.String");
    }

    public static final RippleDrawable J(int i, int i2) {
        return new RippleDrawable(ColorStateList.valueOf(i2), T(K(Integer.valueOf(i), (Integer) null, (Integer) null), (GradientDrawable) null, (GradientDrawable) null), K(-65536, (Integer) null, (Integer) null));
    }

    public static final GradientDrawable K(Integer num, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final Object L(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void M(Bundle bundle, t2g t2g) {
        if (t2g != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", new ParcelImpl(t2g));
            bundle.putParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN, bundle2);
        }
    }

    public static final RippleDrawable N(int i, int i2, float f, float f2, float f3, float f4) {
        return new RippleDrawable(ColorStateList.valueOf(i2), T(P(Integer.valueOf(i), (Integer) null, (Integer) null, new float[]{f, f, f2, f2, f3, f3, f4, f4}), (GradientDrawable) null, (GradientDrawable) null), P(-65536, (Integer) null, (Integer) null, new float[]{f, f, f2, f2, f3, f3, f4, f4}));
    }

    public static final GradientDrawable O(Integer num, Integer num2, Integer num3, int i) {
        float f = (float) i;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = f;
        }
        return P(num, num2, num3, fArr);
    }

    public static final GradientDrawable P(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final List Q(View view, float f, float f2, long j, long j2) {
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(c(view, View.SCALE_X, f, f2, j, j2, 96));
        createListBuilder.add(c(view, View.SCALE_Y, f, f2, j, j2, 96));
        return CollectionsKt.build(createListBuilder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fc, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean R(defpackage.uf5 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            long r1 = r21.w()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 4096(0x1000, double:2.0237E-320)
            if (r5 == 0) goto L_0x0014
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r6 = r1
        L_0x0014:
            int r6 = (int) r6
            g1g r7 = new g1g
            r8 = 64
            r7.<init>((int) r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x002f
            r12 = 8
            r7.E(r12)
            byte[] r13 = r7.a
            boolean r13 = r0.q(r13, r8, r12, r11)
            if (r13 != 0) goto L_0x0033
        L_0x002f:
            r5 = r8
            r8 = r11
            goto L_0x00fe
        L_0x0033:
            long r13 = r7.w()
            int r15 = r7.h()
            r16 = 1
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x0053
            byte[] r13 = r7.a
            r0.m(r12, r13, r12)
            r13 = 16
            r7.G(r13)
            long r16 = r7.p()
            r3 = r13
            r13 = r16
            goto L_0x006b
        L_0x0053:
            r16 = 0
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x006a
            long r16 = r21.w()
            int r18 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r18 == 0) goto L_0x006a
            long r13 = r21.r()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L_0x006a:
            r3 = r12
        L_0x006b:
            long r11 = (long) r3
            int r19 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r19 >= 0) goto L_0x0071
            return r8
        L_0x0071:
            int r9 = r9 + r3
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r3) goto L_0x0084
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r5 == 0) goto L_0x0081
            long r3 = (long) r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            int r6 = (int) r1
        L_0x0081:
            r3 = -1
            goto L_0x001f
        L_0x0084:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r3) goto L_0x008e
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r3) goto L_0x0092
        L_0x008e:
            r5 = r8
            r8 = 1
            goto L_0x00fc
        L_0x0092:
            r3 = r5
            long r4 = (long) r9
            long r4 = r4 + r13
            long r4 = r4 - r11
            r20 = r9
            long r8 = (long) r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00a1
            r5 = 0
            r8 = 1
            goto L_0x00fe
        L_0x00a1:
            long r13 = r13 - r11
            int r4 = (int) r13
            int r9 = r20 + r4
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r5) goto L_0x00f3
            r5 = 8
            if (r4 >= r5) goto L_0x00b0
            r5 = 0
            return r5
        L_0x00b0:
            r5 = 0
            r7.E(r4)
            byte[] r8 = r7.a
            r0.m(r5, r8, r4)
            int r4 = r4 / 4
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00ed
            r8 = 1
            if (r5 != r8) goto L_0x00c6
            r11 = 4
            r7.I(r11)
            goto L_0x00ea
        L_0x00c6:
            int r11 = r7.h()
            int r12 = r11 >>> 8
            r13 = 3368816(0x336770, float:4.720717E-39)
            if (r12 != r13) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            r12 = 1751476579(0x68656963, float:4.333464E24)
            if (r11 != r12) goto L_0x00da
            if (r23 == 0) goto L_0x00da
            goto L_0x00e5
        L_0x00da:
            int[] r12 = d
            r13 = 0
        L_0x00dd:
            r14 = 29
            if (r13 >= r14) goto L_0x00ea
            r14 = r12[r13]
            if (r14 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = r8
            goto L_0x00ed
        L_0x00e7:
            int r13 = r13 + 1
            goto L_0x00dd
        L_0x00ea:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00ed:
            if (r10 != 0) goto L_0x00f1
            r5 = 0
            return r5
        L_0x00f1:
            r5 = 0
            goto L_0x00f9
        L_0x00f3:
            r5 = 0
            if (r4 == 0) goto L_0x00f9
            r0.s(r4)
        L_0x00f9:
            r8 = r5
            r5 = r3
            goto L_0x0081
        L_0x00fc:
            r0 = r8
            goto L_0x00ff
        L_0x00fe:
            r0 = r5
        L_0x00ff:
            if (r10 == 0) goto L_0x0106
            r1 = r22
            if (r1 != r0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r8 = r5
        L_0x0107:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8b.R(uf5, boolean, boolean):boolean");
    }

    public static rog S(apg apg, Integer num, hqg hqg) {
        BacklogWorker backlogWorker;
        w3b w3b = (w3b) ((v3b) new v3b(BacklogWorker.class).setBackoffCriteria(ag0.b, num.longValue(), TimeUnit.SECONDS)).build();
        if (!(hqg == null || (backlogWorker = BacklogWorker.w) == null)) {
            synchronized (backlogWorker.c) {
                z68.c("BACKLOG_WORKER", "stayAlive, isRunning = %b", Boolean.valueOf(backlogWorker.v));
                backlogWorker.o.add(hqg.a);
            }
        }
        fb5 fb5 = fb5.b;
        apg.getClass();
        List singletonList = Collections.singletonList(w3b);
        dpg dpg = (dpg) apg;
        if (!singletonList.isEmpty()) {
            return new rog(dpg, "BACKLOG_WORKER", fb5, singletonList);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public static final StateListDrawable T(Drawable drawable, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable != null) {
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
            stateListDrawable.addState(new int[]{16842908}, gradientDrawable);
            stateListDrawable.addState(new int[]{16843518}, gradientDrawable);
        }
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        }
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public static final void U(fwf fwf) {
        fwf.e(y6g.class, new rid(24));
        fwf.e(s6g.class, new rid(25));
        fwf.e(t60.class, new rid(26));
    }

    public static void V(String str) {
        synchronized (c) {
            d(str, (Throwable) null);
        }
    }

    public static void W(String str, Throwable th) {
        synchronized (c) {
            d(str, th);
        }
    }

    public static void X(File file, qn5 qn5) {
        qn5.i(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    X(file2, qn5);
                } else {
                    qn5.d(file2);
                }
            }
        }
        qn5.j(file);
    }

    public static final int Y(float f, int i) {
        return Color.argb(MathKt.roundToInt(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final ObjectAnimator b(View view, Property property, float f, float f2, long j, long j2, int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ofFloat.setRepeatMode(i);
        ofFloat.setRepeatCount(i2);
        return ofFloat;
    }

    public static /* synthetic */ ObjectAnimator c(View view, Property property, float f, float f2, long j, long j2, int i) {
        return b(view, property, f, f2, j, (i & 16) != 0 ? 0 : j2, 1, 0);
    }

    public static void d(String str, Throwable th) {
        String z = z(th);
        if (!TextUtils.isEmpty(z)) {
            z.replace("\n", "\n  ");
        }
    }

    public static boolean e(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static final RippleDrawable f(int i, int i2, int i3, int i4) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) i4);
        return g(i, i2, i3, fArr);
    }

    public static final RippleDrawable g(int i, int i2, int i3, float[] fArr) {
        return new RippleDrawable(ColorStateList.valueOf(i2), T(P(Integer.valueOf(i), (Integer) null, (Integer) null, fArr), (GradientDrawable) null, P(Integer.valueOf(i3), (Integer) null, (Integer) null, fArr)), P(-65536, (Integer) null, (Integer) null, fArr));
    }

    public static int h(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = dq.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                i = dq.c((AppOpsManager) dq.a(context, AppOpsManager.class), d2, packageName);
            } else {
                AppOpsManager c2 = eq.c(context);
                i = eq.a(c2, d2, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = eq.a(c2, d2, myUid, eq.b(context));
                }
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final vu0 i(qa7 qa7, vu0 vu0, vu0 vu02, xb7 xb7) {
        String str;
        oa7 oa7 = qa7.a;
        if (oa7 == oa7.a) {
            return vu0;
        }
        if (oa7 == oa7.b) {
            return vu02;
        }
        if (oa7 != oa7.c || xb7 == null || (str = qa7.u) == null) {
            return null;
        }
        return (vu0) xb7.get(str);
    }

    public static final ColorStateList j(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{i2, i});
    }

    public static z35 k(ld5 ld5) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = ld5.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (ld5.s(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new z35(1, 0, length, i, 1);
    }

    public static void l(Exception exc, String str) {
        synchronized (c) {
            d(str, exc);
        }
    }

    public static void m(String str) {
        synchronized (c) {
            d(str, (Throwable) null);
        }
    }

    public static boolean n(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File n : listFiles) {
                n(n);
            }
        }
        return file.delete();
    }

    public static void o(String str) {
        synchronized (c) {
            d(str, (Throwable) null);
        }
    }

    public static void p(String str, Throwable th) {
        synchronized (c) {
            d(str, th);
        }
    }

    public static final Object q(i6d i6d, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        CoroutineContext coroutineContext;
        if (i6d.n() && i6d.k()) {
            return callable.call();
        }
        xqf xqf = (xqf) continuation.getContext().get(xqf.c);
        if (xqf == null || (coroutineContext = xqf.a) == null) {
            coroutineContext = h88.B(i6d);
        }
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        lw1.k(new o14(0, cancellationSignal, ev0.v(ys6.a, coroutineContext, (f14) null, new p14(callable, lw1, (Continuation) null), 2)));
        Object t = lw1.t();
        if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return t;
        }
        DebugProbesKt.probeCoroutineSuspended(continuation);
        return t;
    }

    public static final Object r(i6d i6d, Callable callable, Continuation continuation) {
        CoroutineContext coroutineContext;
        if (i6d.n() && i6d.k()) {
            return callable.call();
        }
        xqf xqf = (xqf) continuation.getContext().get(xqf.c);
        if (xqf == null || (coroutineContext = xqf.a) == null) {
            coroutineContext = h88.C(i6d);
        }
        return ev0.I(coroutineContext, new n14(callable, (Continuation) null), continuation);
    }

    public static aqg s(l20 l20) {
        k20 k20 = l20.d;
        String str = l20.r;
        if (k20 != null && k20.a > 0) {
            String str2 = k20.g;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return new aqg(str2, 18);
            }
        }
        File file = !TextUtils.isEmpty(str) ? new File(str) : null;
        if (file != null) {
            boolean exists = file.exists();
            if (!exists && (k20 == null || k20.a == 0)) {
                return new aqg(Boolean.TRUE);
            }
            if (exists) {
                return new aqg(file);
            }
        }
        if (k20 != null) {
            File t = ((qra) ym.e()).p().t(k20.a);
            if (t.exists()) {
                return new aqg(t);
            }
        }
        return new aqg(Boolean.FALSE);
    }

    public static final vu7 t(ju7 ju7) {
        while (true) {
            vu7 vu7 = (vu7) ju7.a.get();
            if (vu7 != null) {
                return vu7;
            }
            q2f b2 = kr7.b();
            bi4 bi4 = dq4.a;
            vu7 vu72 = new vu7(ju7, CoroutineContext.Element.DefaultImpls.plus(b2, lc8.a.t0()));
            AtomicReference atomicReference = ju7.a;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, vu72)) {
                    bi4 bi42 = dq4.a;
                    ev0.v(vu72, lc8.a.t0(), (f14) null, new uu7(vu72, (Continuation) null), 2);
                    return vu72;
                } else if (atomicReference.get() != null) {
                }
            }
        }
    }

    public static final String u(Context context) {
        String str = b;
        if (str != null) {
            return str;
        }
        synchronized (a) {
            String str2 = b;
            if (str2 != null) {
                return str2;
            }
            String I = I(context.getApplicationContext());
            b = I;
            return I;
        }
    }

    public static CharSequence v(Context context, List list, String str, String str2, TextView textView) {
        return (CharSequence) new mia(new yia(new mha(jha.r(new yia(jha.n(list), new qbb(28), 3), jha.q(str)), new a62(str2, 8), 1), new fkd(context, textView, str2, 0), 3)).b();
    }

    public static Intent w(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String y = y(activity, activity.getComponentName());
            if (y == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, y);
            try {
                return y(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent x(Context context, ComponentName componentName) {
        String y = y(context, componentName);
        if (y == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), y);
        return y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String y(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String z(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (c) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                }
                try {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }
}
