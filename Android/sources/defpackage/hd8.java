package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: hd8  reason: default package */
public abstract class hd8 {
    public static volatile Handler a;
    public static final byte[] b = {0, 0, 0, 1};
    public static final String[] c = {"", "A", "B", "C"};
    public static final tj6 d = new Object();
    public static boolean e;

    public static Object A(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final void B(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            C(activity, currentFocus);
        }
    }

    public static final void C(Context context, View view) {
        view.clearFocus();
        try {
            Result.Companion companion = Result.Companion;
            Result.m23constructorimpl(Boolean.valueOf(((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final ArrayList D(int i) {
        IntRange intRange = new IntRange(i, 23);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(new ejf(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public static xa7 E(Object obj) {
        return obj == null ? xa7.c : new xa7(0, obj);
    }

    public static void F(g72 g72, long j, bl4 bl4) {
        if (((f72) r(j, g72.d(bl4)).getSecond()) == null) {
            g72.a(new f72(j, j), bl4);
        }
    }

    public static boolean G(long j, f72 f72) {
        return f72 != null && f72.a <= j && j <= f72.b;
    }

    public static void H(ArrayList arrayList) {
        Iterator it;
        ArrayList arrayList2 = arrayList;
        int i = 1;
        if (arrayList.size() > 1) {
            ArrayList arrayList3 = null;
            boolean z = true;
            while (z && arrayList.size() > i) {
                Iterator it2 = arrayList.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    f72 f72 = (f72) it2.next();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    } else {
                        arrayList3.clear();
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            break;
                        }
                        f72 f722 = (f72) it3.next();
                        if (f72 != f722) {
                            long j = f72.a;
                            long j2 = f722.a;
                            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                            long j3 = f72.b;
                            it = it2;
                            long j4 = f722.b;
                            if ((i2 >= 0 && j <= j4) || (j3 >= j2 && j3 <= j4)) {
                                f72 f723 = new f72(Math.min(j, j2), Math.max(j3, j4));
                                arrayList3.add(f72);
                                arrayList3.add(f722);
                                arrayList2.add(f723);
                                z2 = true;
                            }
                            if (z2) {
                                break;
                            }
                            it2 = it;
                        }
                    }
                    arrayList2.removeAll(arrayList3);
                    if (z2) {
                        break;
                    }
                    it2 = it;
                }
                z = z2;
                i = 1;
            }
            Collections.sort(arrayList2, new v00(17));
        }
    }

    public static final ArrayList I(int i) {
        IntRange intRange = new IntRange(i, 59);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(new ejf(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public static zz7 J(zz7 zz7) {
        zz7.getClass();
        return zz7.isDone() ? zz7 : m5a.F(new sj6(zz7, 1));
    }

    public static int K(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static String L(f72 f72) {
        if (f72 == null) {
            return null;
        }
        Date date = new Date(f72.a);
        Date date2 = new Date(f72.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], millis[%d - %d]", new Object[]{date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime())});
    }

    public static String M(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() <= 0) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(L((f72) it.next()));
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void N(zz7 zz7, do1 do1) {
        O(true, zz7, do1, ryg.j());
    }

    public static void O(boolean z, zz7 zz7, do1 do1, ep4 ep4) {
        zz7.getClass();
        do1.getClass();
        ep4.getClass();
        a(zz7, new npg(do1), ep4);
        if (z) {
            do1.a(new cf(26, zz7), ryg.j());
        }
    }

    public static void R(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            ru4.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static View S(Context context, d3b d3b, f3b f3b) {
        if (d3b instanceof a3b) {
            OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
            oneMeButton.d(Integer.valueOf(((a3b) d3b).a), true);
            ct.G(oneMeButton, 300, new dte(3, d3b));
            return oneMeButton;
        } else if (d3b instanceof b3b) {
            b3b b3b = (b3b) d3b;
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(ew3.b(context, b3b.a));
            int roundToInt = MathKt.roundToInt(((float) b3b.b) * vo4.c().getDisplayMetrics().density);
            imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            float f = (float) 32;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
            imageView.setOutlineProvider(new n04(b3b.c * vo4.c().getDisplayMetrics().density));
            ct.G(imageView, 300, new dte(4, b3b));
            return imageView;
        } else if (d3b instanceof c3b) {
            pza pza = new pza(context);
            pza.setPadding(0, 0, 0, 0);
            pza.setListener(new aqg(pza, f3b, d3b));
            return pza;
        } else if (d3b == null) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void T(xe0 xe0, int i, int i2) {
        if (((qra) ym.e()).d().q()) {
            xe0.b = i;
            xe0.c = 0;
            xe0.d = 0;
            xe0.e = i2;
        }
    }

    public static void U(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            lng.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }

    public static void V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = gag.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static kz7 W(ArrayList arrayList) {
        return new kz7(new ArrayList(arrayList), false, ryg.j());
    }

    public static final long X(long j, long j2, long j3, String str) {
        String str2;
        int i = z7f.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(str2);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            tr1.v(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int Y(int i, int i2, int i3, int i4, String str) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = IntCompanionObject.MAX_VALUE;
        }
        return (int) X((long) i, (long) i2, (long) i3, str);
    }

    public static void Z(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void a(zz7 zz7, nj6 nj6, Executor executor) {
        nj6.getClass();
        zz7.d(new vj6(0, (Object) zz7, (Object) nj6), executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r5.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.l21 a0(defpackage.y11 r5) {
        /*
            java.lang.Long r0 = r5.a
            java.lang.Long r1 = r5.d
            if (r1 == 0) goto L_0x0014
            java.lang.CharSequence r2 = r5.e
            if (r2 == 0) goto L_0x0014
            long r3 = r1.longValue()
            gd0 r1 = new gd0
            r1.<init>(r2, r3)
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            zd0 r2 = new zd0
            java.lang.String r3 = r5.c
            r2.<init>(r1, r3)
            l21 r1 = new l21
            java.lang.CharSequence r5 = r5.b
            r1.<init>(r0, r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd8.a0(y11):l21");
    }

    public static kz7 b(Collection collection) {
        return new kz7(new ArrayList(collection), true, ryg.j());
    }

    public static cz1 b0(zz7 zz7, vu vuVar, Executor executor) {
        cz1 cz1 = new cz1(vuVar, zz7);
        zz7.d(cz1, executor);
        return cz1;
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                ru4.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                ru4.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                ru4.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void d(g3f g3f, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                byte[] bArr = objArr[i];
                i++;
                if (bArr == null) {
                    g3f.X(i);
                } else if (bArr instanceof byte[]) {
                    g3f.l(i, bArr);
                } else if (bArr instanceof Float) {
                    g3f.T((double) ((Number) bArr).floatValue(), i);
                } else if (bArr instanceof Double) {
                    g3f.T(((Number) bArr).doubleValue(), i);
                } else if (bArr instanceof Long) {
                    g3f.k(i, ((Number) bArr).longValue());
                } else if (bArr instanceof Integer) {
                    g3f.k(i, (long) ((Number) bArr).intValue());
                } else if (bArr instanceof Short) {
                    g3f.k(i, (long) ((Number) bArr).shortValue());
                } else if (bArr instanceof Byte) {
                    g3f.k(i, (long) ((Number) bArr).byteValue());
                } else if (bArr instanceof String) {
                    g3f.h(i, (String) bArr);
                } else if (bArr instanceof Boolean) {
                    g3f.k(i, ((Boolean) bArr).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static String e(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {c[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = v0g.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    public static int f(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : IntCompanionObject.MAX_VALUE;
        }
        m5a.m(i, "expectedSize");
        return i + 1;
    }

    public static ArrayList j(g72 g72, long j, bl4 bl4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = g72.d(bl4).iterator();
        while (it.hasNext()) {
            f72 f72 = (f72) it.next();
            if (f72.b >= j) {
                if (f72.a > j) {
                    arrayList.add(f72);
                } else if (G(j, f72)) {
                    long j2 = 1 + j;
                    long j3 = f72.b;
                    if (j2 <= j3) {
                        if (j2 == -1) {
                            z68.o("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        if (j3 == -1) {
                            z68.o("Chunk.Builder", "", new IllegalStateException("end time is -1"));
                        }
                        arrayList.add(new f72(j2, j3));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ImageView.ScaleType m(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static int n(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static boolean o(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r9 > 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r13 > 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r13 > 0) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList p(java.util.List r5, java.util.List r6, long r7, int r9, long r10, int r12, long r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 0
            if (r5 <= 0) goto L_0x008b
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            b89 r5 = (defpackage.b89) r5
            r3 = 1
            java.lang.Object r6 = defpackage.a81.i(r3, r6)
            b89 r6 = (defpackage.b89) r6
            cl4 r3 = r5.B0
            if (r3 == 0) goto L_0x0022
            long r3 = r3.a
            goto L_0x0024
        L_0x0022:
            long r3 = r5.b
        L_0x0024:
            cl4 r5 = r6.B0
            if (r5 == 0) goto L_0x002b
            long r5 = r5.a
            goto L_0x002d
        L_0x002b:
            long r5 = r6.b
        L_0x002d:
            if (r9 <= 0) goto L_0x0061
            if (r12 <= 0) goto L_0x0061
            int r9 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0044
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            if (r9 <= 0) goto L_0x0042
            long r9 = java.lang.Math.max(r10, r3)
            r10 = r9
            goto L_0x0048
        L_0x0042:
            r10 = r3
            goto L_0x0048
        L_0x0044:
            long r10 = java.lang.Math.min(r7, r3)
        L_0x0048:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x005b
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0053
            if (r9 <= 0) goto L_0x0059
            goto L_0x0095
        L_0x0053:
            if (r9 <= 0) goto L_0x0059
            long r5 = java.lang.Math.min(r13, r5)
        L_0x0059:
            r13 = r5
            goto L_0x0095
        L_0x005b:
            long r5 = java.lang.Math.max(r7, r5)
            r7 = r5
            goto L_0x0096
        L_0x0061:
            if (r12 <= 0) goto L_0x0077
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x006e
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x006c
            goto L_0x0098
        L_0x006c:
            r13 = r5
            goto L_0x0098
        L_0x006e:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x006c
            long r5 = java.lang.Math.min(r13, r5)
            goto L_0x006c
        L_0x0077:
            if (r9 <= 0) goto L_0x008a
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x007e
            goto L_0x0096
        L_0x007e:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            long r5 = java.lang.Math.max(r10, r3)
            r10 = r5
            goto L_0x0096
        L_0x0088:
            r10 = r3
            goto L_0x0096
        L_0x008a:
            return r0
        L_0x008b:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r10 = r7
        L_0x0091:
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0096
        L_0x0095:
            r7 = r13
        L_0x0096:
            r13 = r7
            r7 = r10
        L_0x0098:
            r5 = -1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r10 = ""
            java.lang.String r11 = "Chunk.Builder"
            if (r9 != 0) goto L_0x00ac
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r12 = "start time is -1"
            r9.<init>(r12)
            defpackage.z68.o(r11, r10, r9)
        L_0x00ac:
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00ba
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "end time is -1"
            r5.<init>(r6)
            defpackage.z68.o(r11, r10, r5)
        L_0x00ba:
            f72 r5 = new f72
            r5.<init>(r7, r13)
            r0.add(r5)
            H(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd8.p(java.util.List, java.util.List, long, int, long, int, long):java.util.ArrayList");
    }

    public static boolean q(g72 g72, long j, long j2, bl4 bl4) {
        Pair r = r(j, g72.d(bl4));
        if (r.getSecond() == null) {
            return false;
        }
        ap0 c2 = ((f72) r.getSecond()).c();
        c2.b(j2);
        g72.d(bl4).remove(((Integer) r.getFirst()).intValue());
        g72.e(bl4);
        g72.a(c2.a(), bl4);
        return true;
    }

    public static Pair r(long j, ArrayList arrayList) {
        f72 f72;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                f72 = null;
                i = -1;
                break;
            }
            f72 = (f72) arrayList.get(i);
            long j2 = f72.a;
            long j3 = f72.b;
            if (j2 != j3) {
                if (j >= j2 && j <= j3) {
                    break;
                }
            } else if (j == j2) {
                break;
            }
            i++;
        }
        return new Pair(Integer.valueOf(i), f72);
    }

    public static f72 s(long j, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        f72 f72 = null;
        while (it.hasNext()) {
            f72 f722 = (f72) it.next();
            long j2 = f722.b;
            if (j2 < j && (f72 == null || j2 > f72.b)) {
                f72 = f722;
            }
        }
        return f72;
    }

    public static Pair t(ArrayList arrayList) {
        f72 f72 = null;
        int i = -1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            f72 f722 = (f72) arrayList.get(i2);
            if (f72 != null) {
                if (f72.b > f722.b) {
                }
            }
            i = i2;
            f72 = f722;
        }
        return new Pair(Integer.valueOf(i), f72);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h20, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r7 != 2) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.boe u(defpackage.f20 r7) {
        /*
            h20 r0 = new h20
            r0.<init>()
            long r1 = r7.a
            r0.a = r1
            int r1 = r7.c
            r0.b = r1
            int r1 = r7.d
            r0.c = r1
            java.lang.String r1 = r7.b
            r0.d = r1
            long r1 = r7.i
            r0.e = r1
            java.lang.String r1 = r7.e
            r0.f = r1
            java.lang.String r1 = r7.f
            r0.g = r1
            java.lang.String r1 = r7.h
            r0.h = r1
            java.util.List r1 = r7.g
            r0.n = r1
            int r1 = r7.j
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0030:
            r1 = r4
            goto L_0x0042
        L_0x0032:
            int r1 = defpackage.tr1.y(r1)
            if (r1 == r4) goto L_0x0041
            if (r1 == r3) goto L_0x003f
            if (r1 == r2) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            r1 = 4
            goto L_0x0042
        L_0x003f:
            r1 = r2
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            r0.i = r1
            long r5 = r7.k
            r0.k = r5
            java.lang.String r1 = r7.l
            r0.o = r1
            boolean r1 = r7.m
            r0.l = r1
            int r7 = r7.n
            if (r7 != 0) goto L_0x0056
        L_0x0054:
            r2 = r4
            goto L_0x0060
        L_0x0056:
            int r7 = defpackage.tr1.y(r7)
            if (r7 == r4) goto L_0x005f
            if (r7 == r3) goto L_0x0060
            goto L_0x0054
        L_0x005f:
            r2 = r3
        L_0x0060:
            r0.m = r2
            boe r7 = r0.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd8.u(f20):boe");
    }

    public static y8c v(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "http/1.0")) {
            return y8c.HTTP_1_0;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "http/1.1")) {
            return y8c.HTTP_1_1;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "h2_prior_knowledge")) {
            return y8c.H2_PRIOR_KNOWLEDGE;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "h2")) {
            return y8c.HTTP_2;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "spdy/3.1")) {
            return y8c.SPDY_3;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "quic")) {
            return y8c.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static Context w(Context context) {
        int c2;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (c2 = wn0.c(context)) != wn0.c(applicationContext)) {
            applicationContext = wn0.a(c2, applicationContext);
        }
        if (i < 30) {
            return applicationContext;
        }
        String b2 = lx3.b(context);
        return !Objects.equals(b2, lx3.b(applicationContext)) ? lx3.a(applicationContext, b2) : applicationContext;
    }

    public static int x(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i == 2) {
            return 2;
        }
        return ((rotation == 1 || rotation == 3) && i == 1) ? 2 : 1;
    }

    public static Object y(Future future) {
        boolean isDone = future.isDone();
        bs0.r("Future was expected to be done, " + future, isDone);
        return A(future);
    }

    public static Handler z() {
        if (a != null) {
            return a;
        }
        synchronized (hd8.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return a;
    }

    public abstract void P(f3 f3Var, f3 f3Var2);

    public abstract void Q(f3 f3Var, Thread thread);

    public abstract void c0(wu0 wu0);

    public abstract boolean g(g3 g3Var, c3 c3Var, c3 c3Var2);

    public abstract boolean h(g3 g3Var, Object obj, Object obj2);

    public abstract boolean i(g3 g3Var, f3 f3Var, f3 f3Var2);

    public abstract long k();

    public abstract f19 l();
}
