package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.ConstantsKt;
import kotlin.io.FilesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import one.me.android.concurrent.SingleCoreActivity;

/* renamed from: f6e  reason: default package */
public final class f6e {
    public static boolean c;
    public static final int[] d = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] e = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f = {64, 112, Uuid.SIZE_BITS, 192, 224, 256, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ConstantsKt.DEFAULT_BLOCK_SIZE, 6144, 7680};
    public static final float[][] g = {new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f}, new float[]{-1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f}, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f}, new float[]{c44.DEFAULT_ASPECT_RATIO, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f}, new float[]{c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f}, new float[]{c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -1.0f, 1.0f}};
    public static final bpa h = new bpa(10, "NONE");
    public static final bpa i = new bpa(10, "PENDING");
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ f6e(int i2, Rect rect) {
        this.a = i2;
        this.b = rect;
    }

    public static final void A(ViewGroup viewGroup, View view, View view2, View view3, float f2) {
        if (view2 != null) {
            view2.setTranslationX(((float) viewGroup.getMeasuredWidth()) * f2);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - f2);
        }
        if (view != null) {
            view.setScaleX((f2 * 0.05f) + 0.95f);
        }
        if (view != null) {
            view.setScaleY((f2 * 0.05f) + 0.95f);
        }
        if (view != null) {
            view.setPivotX(c44.DEFAULT_ASPECT_RATIO);
        }
        if (view != null) {
            view.setPivotY(c44.DEFAULT_ASPECT_RATIO);
        }
    }

    public static final void B(File file, File file2) {
        if (!file.renameTo(file2)) {
            throw new IOException("Can't rename " + file + " to " + file2);
        }
    }

    public static final void C(RecyclerView recyclerView) {
        a layoutManager;
        if ((recyclerView.getMeasuredWidth() != 0 || recyclerView.getMeasuredHeight() != 0) && (layoutManager = recyclerView.getLayoutManager()) != null) {
            Parcelable m0 = layoutManager.m0();
            recyclerView.setAdapter(recyclerView.getAdapter());
            layoutManager.l0(m0);
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                recyclerView.Y(i2);
            }
        }
    }

    public static void D(Drawable drawable, int i2) {
        ru4.g(drawable, i2);
    }

    public static void E(Drawable drawable, ColorStateList colorStateList) {
        ru4.h(drawable, colorStateList);
    }

    public static void F(Drawable drawable, PorterDuff.Mode mode) {
        ru4.i(drawable, mode);
    }

    public static eud G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size() / 2);
        ArrayList arrayList5 = new ArrayList(arrayList.size() / 2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nie nie = (nie) it.next();
            int i2 = nie.a;
            int i3 = nie.b;
            if (i2 == 1) {
                if (i3 == 1) {
                    arrayList2.add((hie) nie);
                } else if (i3 == 2) {
                    arrayList3.add((iie) nie);
                } else {
                    throw new AssertionError("unreachable: " + nie);
                }
            } else if (i2 != 2) {
                throw new AssertionError("unreachable: " + nie);
            } else if (i3 == 1) {
                arrayList4.add((lie) nie);
            } else if (i3 == 2) {
                arrayList5.add((mie) nie);
            } else {
                throw new AssertionError("unreachable: " + nie);
            }
        }
        return new eud(11, arrayList2, arrayList4, arrayList3, arrayList5);
    }

    public static ArrayList H(List list, uw1 uw1) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nie nie = (nie) it.next();
            if (uw1.j.equals(nie.d)) {
                arrayList.add(nie);
            }
        }
        return arrayList;
    }

    public static final String I(String str) {
        return (str == null || str.length() == 0) ? "" : StringsKt.trim((CharSequence) StringsKt__StringsKt.removePrefix(str, (CharSequence) "https://max.ru/joincall/")).toString();
    }

    public static final String J(String str) {
        return (str == null || str.length() == 0) ? "" : a81.m("https://max.ru/joincall/", str);
    }

    public static k0d K(float[] fArr, tb7 tb7) {
        qb7 qb7 = new qb7();
        for (int i2 = 0; i2 < tb7.size(); i2++) {
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, fArr, 0, (float[]) tb7.get(i2), 0);
            float f2 = fArr2[0];
            float f3 = fArr2[3];
            fArr2[0] = f2 / f3;
            fArr2[1] = fArr2[1] / f3;
            fArr2[2] = fArr2[2] / f3;
            fArr2[3] = 1.0f;
            qb7.d(fArr2);
        }
        return qb7.j();
    }

    public static final void L(fwf fwf) {
        fwf.e(bmb.class, new fm8(20));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [kotlin.coroutines.AbstractCoroutineContextElement, mrg, kotlin.coroutines.CoroutineContext] */
    public static final Object M(Continuation continuation) {
        Object obj;
        CoroutineContext context = continuation.getContext();
        kv0.q(context);
        Continuation intercepted = IntrinsicsKt.intercepted(continuation);
        zp4 zp4 = intercepted instanceof zp4 ? (zp4) intercepted : null;
        if (zp4 == null) {
            obj = Unit.INSTANCE;
        } else {
            q04 q04 = zp4.o;
            if (q04.r0(context)) {
                zp4.w = Unit.INSTANCE;
                zp4.c = 1;
                q04.q0(context, zp4);
            } else {
                ? abstractCoroutineContextElement = new AbstractCoroutineContextElement(mrg.b);
                CoroutineContext plus = context.plus(abstractCoroutineContextElement);
                Unit unit = Unit.INSTANCE;
                zp4.w = unit;
                zp4.c = 1;
                q04.q0(plus, zp4);
                if (abstractCoroutineContextElement.a) {
                    a95 a2 = lif.a();
                    ArrayDeque arrayDeque = a2.o;
                    if (!(arrayDeque != null ? arrayDeque.isEmpty() : true)) {
                        if (a2.x0()) {
                            zp4.w = unit;
                            zp4.c = 1;
                            a2.u0(zp4);
                            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        } else {
                            a2.w0(true);
                            try {
                                zp4.run();
                                do {
                                } while (a2.z0());
                            } catch (Throwable th) {
                                a2.t0(true);
                                throw th;
                            }
                            a2.t0(true);
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    public static final xme a(Object obj) {
        if (obj == null) {
            obj = q8.e;
        }
        return new xme(obj);
    }

    public static final void b(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view.getParent() == null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public static final void c(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static boolean e(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, hr6] */
    public static wsd f(String str, kne kne, usd[] usdArr) {
        if (!(!StringsKt.isBlank(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!Intrinsics.areEqual((Object) kne, (Object) hye.o)) {
            ? obj = new Object();
            obj.a = CollectionsKt.emptyList();
            obj.b = new ArrayList();
            new HashSet();
            obj.c = new ArrayList();
            obj.o = new ArrayList();
            obj.v = new ArrayList();
            Unit unit = Unit.INSTANCE;
            return new wsd(str, kne, ((ArrayList) obj.b).size(), ArraysKt.toList((T[]) usdArr), obj);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static void g(int i2, Object[] objArr) {
        int i3 = 0;
        while (i3 < i2) {
            if (objArr[i3] != null) {
                i3++;
            } else {
                throw new NullPointerException(wj6.h(i3, "at index "));
            }
        }
    }

    public static int h(int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        int i4 = (int) j;
        if (j == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(a81.l("overflow: checkedAdd(", i2, ", ", i3, ")"));
    }

    public static final String i(Long l, Long l2) {
        int compareTo = l2.compareTo(l);
        return compareTo > 0 ? "<" : compareTo < 0 ? ">" : "=";
    }

    public static float[] j(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        n79.f("Expecting 4 plane parameters", fArr2.length == 4);
        float f2 = fArr[0];
        float f3 = fArr3[0];
        float f4 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr3[1];
        float f7 = fArr2[1];
        float f8 = fArr[2];
        float f9 = fArr3[2];
        float f10 = fArr2[2];
        float f11 = ((f8 - f9) * f10) + ((f5 - f6) * f7) + ((f2 - f3) * f4);
        float f12 = fArr4[0] - f3;
        float f13 = fArr4[1] - f6;
        float f14 = fArr4[2] - f9;
        float f15 = f11 / ((f10 * f14) + ((f7 * f13) + (f4 * f12)));
        return new float[]{(f12 * f15) + f3, (f13 * f15) + f6, (f14 * f15) + f9, 1.0f};
    }

    public static ode k(List list, int i2, int i3) {
        boolean z = true;
        n79.f("inputWidth must be positive", i2 > 0);
        if (i3 <= 0) {
            z = false;
        }
        n79.f("inputHeight must be positive", z);
        ode ode = new ode(i2, i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ode = ((hh8) list.get(i4)).d(ode.a, ode.b);
        }
        return ode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r7 == 1) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r7 == 2) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r7 == 3) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        if (r7 == 4) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r15 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r3[r15] = (byte) (r8 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r9 != r1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r15 = new byte[r9];
        java.lang.System.arraycopy(r3, 0, r15, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da A[EDGE_INSN: B:55:0x00da->B:40:0x00da ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] l(java.lang.String r15) {
        /*
            byte[] r15 = r15.getBytes()
            int r0 = r15.length
            int r1 = r0 * 3
            r2 = 4
            int r1 = r1 / r2
            byte[] r3 = new byte[r1]
            int[] r4 = defpackage.ji0.g
            r5 = 0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0012:
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 >= r0) goto L_0x00da
            if (r7 != 0) goto L_0x005f
        L_0x0019:
            int r13 = r6 + 4
            if (r13 > r0) goto L_0x005b
            byte r8 = r15[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r4[r8]
            int r8 = r8 << 18
            int r14 = r6 + 1
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 12
            r8 = r8 | r14
            int r14 = r6 + 2
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 6
            r8 = r8 | r14
            int r14 = r6 + 3
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            r8 = r8 | r14
            if (r8 < 0) goto L_0x005b
            int r6 = r9 + 2
            byte r14 = (byte) r8
            r3[r6] = r14
            int r6 = r9 + 1
            int r14 = r8 >> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 3
            r6 = r13
            goto L_0x0019
        L_0x005b:
            if (r6 < r0) goto L_0x005f
            goto L_0x00da
        L_0x005f:
            int r13 = r6 + 1
            byte r6 = r15[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r4[r6]
            r14 = -1
            if (r7 == 0) goto L_0x00d2
            if (r7 == r12) goto L_0x00cc
            r12 = -2
            if (r7 == r11) goto L_0x00b5
            r11 = 5
            if (r7 == r10) goto L_0x0085
            if (r7 == r2) goto L_0x007c
            if (r7 == r11) goto L_0x0078
            goto L_0x00d7
        L_0x0078:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x007c:
            if (r6 != r12) goto L_0x0082
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x0082:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x0085:
            if (r6 < 0) goto L_0x00a0
            int r7 = r8 << 6
            r6 = r6 | r7
            int r7 = r9 + 2
            byte r8 = (byte) r6
            r3[r7] = r8
            int r7 = r9 + 1
            int r8 = r6 >> 8
            byte r8 = (byte) r8
            r3[r7] = r8
            int r7 = r6 >> 16
            byte r7 = (byte) r7
            r3[r9] = r7
            int r9 = r9 + 3
            r7 = r5
        L_0x009e:
            r8 = r6
            goto L_0x00d7
        L_0x00a0:
            if (r6 != r12) goto L_0x00b2
            int r6 = r9 + 1
            int r7 = r8 >> 2
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r8 >> 10
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 2
            r7 = r11
            goto L_0x00d7
        L_0x00b2:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00b5:
            if (r6 < 0) goto L_0x00bd
        L_0x00b7:
            int r8 = r8 << 6
            r6 = r6 | r8
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00bd:
            if (r6 != r12) goto L_0x00c9
            int r6 = r9 + 1
            int r7 = r8 >> 4
            byte r7 = (byte) r7
            r3[r9] = r7
            r7 = r2
            r9 = r6
            goto L_0x00d7
        L_0x00c9:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00cc:
            if (r6 < 0) goto L_0x00cf
            goto L_0x00b7
        L_0x00cf:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00d2:
            if (r6 < 0) goto L_0x00d5
            goto L_0x00ba
        L_0x00d5:
            if (r6 != r14) goto L_0x0104
        L_0x00d7:
            r6 = r13
            goto L_0x0012
        L_0x00da:
            if (r7 == r12) goto L_0x0104
            if (r7 == r11) goto L_0x00f2
            if (r7 == r10) goto L_0x00e3
            if (r7 == r2) goto L_0x0104
            goto L_0x00fa
        L_0x00e3:
            int r15 = r9 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r3[r9] = r0
            int r9 = r9 + 2
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r15] = r0
            goto L_0x00fa
        L_0x00f2:
            int r15 = r9 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r9] = r0
            r9 = r15
        L_0x00fa:
            if (r9 != r1) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            byte[] r15 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r15, r5, r9)
            r3 = r15
        L_0x0103:
            return r3
        L_0x0104:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad base-64"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6e.l(java.lang.String):byte[]");
    }

    public static final void m(File file) {
        if (file.exists() && !FilesKt.deleteRecursively(file)) {
            throw new IOException("Can't delete " + file);
        }
    }

    public static float n(float f2, float f3, float f4) {
        float f5 = f2 / (f4 / 2.0f);
        float f6 = f3 / 2.0f;
        if (f5 < 1.0f) {
            return (f6 * f5 * f5 * f5) + c44.DEFAULT_ASPECT_RATIO;
        }
        float f7 = f5 - 2.0f;
        return (((f7 * f7 * f7) + 2.0f) * f6) + c44.DEFAULT_ASPECT_RATIO;
    }

    public static byte[] o(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = ji0.h;
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        if (length > 0) {
            i2 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        int i4 = 19;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            if (i6 > length) {
                break;
            }
            byte b2 = (bArr[i3 + 2] & UByte.MAX_VALUE) | ((bArr[i3] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8);
            bArr3[i5] = bArr2[(b2 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(b2 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(b2 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[b2 & 63];
            int i7 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i5 = i7;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i8 = (bArr[i3] & UByte.MAX_VALUE) << 4;
            bArr3[i5] = bArr2[(i8 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i8 & 63];
            bArr3[i5 + 2] = Base64.padSymbol;
            bArr3[i5 + 3] = Base64.padSymbol;
            bArr3[i5 + 4] = 10;
        } else if (i3 == length - 2) {
            int i9 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 2) | ((bArr[i3] & UByte.MAX_VALUE) << 10);
            bArr3[i5] = bArr2[(i9 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i9 & 63];
            bArr3[i5 + 3] = Base64.padSymbol;
            bArr3[i5 + 4] = 10;
        } else if (i5 > 0 && i4 != 19) {
            bArr3[i5] = 10;
        }
        return bArr3;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static String q(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i2 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final ViewGroup r(View view) {
        ViewGroup r;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (r = r(viewGroup)) != null) {
            return r;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static final LayoutInflater s(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static b9d t(tp6 tp6) {
        if (tp6.p == null) {
            tp6.p = new b9d();
        }
        return tp6.p;
    }

    public static m58 u(TypedArray typedArray, int i2) {
        switch (typedArray.getInt(i2, -2)) {
            case -1:
                return null;
            case 0:
                return ydd.s;
            case 1:
                return ydd.r;
            case 2:
                return ydd.p;
            case 3:
                return ydd.q;
            case 4:
                return ydd.l;
            case 5:
                return ydd.n;
            case 6:
                return ydd.m;
            case 7:
                return ydd.t;
            case 8:
                return ydd.o;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static final WindowManager v(View view) {
        return kw3.a(view.getContext());
    }

    public static boolean w(Context context) {
        Class<f6e> cls = f6e.class;
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName())) != 1) {
                z = false;
            }
            c = z;
            String name = cls.getName();
            a67 a67 = z68.b;
            if (a67 != null) {
                if (a67.c()) {
                    a67.d(w78.o, name, "isEnabled=" + c, (Throwable) null);
                }
            }
            return c;
        } catch (Throwable th) {
            z68.f(cls.getName(), "fail to get component", th);
            return false;
        }
    }

    public static boolean x(float[] fArr, float[] fArr2) {
        n79.f("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static final void y(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Can't create " + file);
        }
    }

    public final Rect z() {
        switch (this.a) {
            case 0:
                Rect rect = this.b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
            default:
                return this.b;
        }
    }
}
