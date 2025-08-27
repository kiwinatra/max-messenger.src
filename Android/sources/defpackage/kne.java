package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;

/* renamed from: kne  reason: default package */
public abstract class kne {
    public static boolean b;
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, 112, Uuid.SIZE_BITS, 192, 224, 256, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ConstantsKt.DEFAULT_BLOCK_SIZE, 6144, 7680};
    public static final int[] f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] g = {5, 8, 10, 12};
    public static final int[] h = {6, 9, 12, 15};
    public static final int[] i = {2, 4, 6, 8};
    public static final int[] j = {9, 11, 13, 16};
    public static final int[] k = {5, 8, 10, 12};
    public static final fj l = new fj((Bundle) null);
    public static final w2f m = new w2f();
    public static Boolean n;
    public final /* synthetic */ int a;

    public /* synthetic */ kne(int i2) {
        this.a = i2;
    }

    public static pob A(pob pob, pob pob2) {
        if (pob == null || pob2 == null) {
            return pob.b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i2 = 0; i2 < pob.e(); i2++) {
            xq5 xq5 = pob.a;
            if (pob2.a(xq5.b(i2))) {
                int b2 = xq5.b(i2);
                n79.n(!false);
                sparseBooleanArray.append(b2, true);
            }
        }
        n79.n(!false);
        return new pob(new xq5(sparseBooleanArray));
    }

    public static final void B(hn hnVar, boolean z) {
        if (z) {
            hnVar.getWindow().addFlags(Uuid.SIZE_BITS);
        } else {
            hnVar.getWindow().clearFlags(Uuid.SIZE_BITS);
        }
        hnVar.setShowWhenLocked(z);
        hnVar.setTurnScreenOn(z);
    }

    public static Pair C(ppb ppb, npb npb, ppb ppb2, npb npb2, pob pob) {
        boolean z = npb2.a;
        boolean z2 = npb2.b;
        if (z && pob.a(17) && !npb.a) {
            ppb2 = ppb2.l(ppb.j);
            npb2 = new npb(false, z2);
        }
        if (z2 && pob.a(30) && !npb.b) {
            ppb2 = ppb2.b(ppb.D);
            npb2 = new npb(npb2.a, false);
        }
        return new Pair(ppb2, npb2);
    }

    public static gsf D(int i2, yrf... yrfArr) {
        gsf gsf = new gsf();
        for (yrf yrf : yrfArr) {
            if (yrf != null) {
                gsf.S(yrf);
            }
        }
        gsf.V(i2);
        return gsf;
    }

    public static void E(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    String absolutePath = file.getAbsolutePath();
                    IOException iOException = new IOException(file.getAbsolutePath());
                    IOException iOException2 = new IOException(absolutePath);
                    iOException2.initCause(iOException);
                    throw iOException2;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(file.getAbsolutePath());
        }
    }

    public static int G(ky1 ky1, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && ky1.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return ky1.i(iArr[i2]) + i4;
    }

    public static void H(File file, File file2) {
        file.getClass();
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileNotFoundException(file.getAbsolutePath()) : new IOException(file2.getAbsolutePath());
            IOException iOException = new IOException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
            iOException.initCause(fileNotFoundException);
            throw iOException;
        }
    }

    public static final ArrayList I(Iterable iterable, Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Object next : iterable) {
            if (Intrinsics.areEqual(next, obj)) {
                next = obj2;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public static void J(yrf yrf, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int i2 = 0;
        if (yrf instanceof gsf) {
            gsf gsf = (gsf) yrf;
            int size = gsf.Q0.size();
            while (i2 < size) {
                J(gsf.T(i2), list, arrayList);
                i2++;
            }
            return;
        }
        ArrayList arrayList3 = yrf.v;
        if (!(!(arrayList3 == null || arrayList3.isEmpty())) && (arrayList2 = yrf.w) != null && arrayList2.size() == list.size() && arrayList2.containsAll(list)) {
            int size2 = arrayList == null ? 0 : arrayList.size();
            while (i2 < size2) {
                yrf.c((View) arrayList.get(i2));
                i2++;
            }
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                yrf.E((View) list.get(size3));
            }
        }
    }

    public static void K(RecyclerView recyclerView, Runnable runnable) {
        d(recyclerView, 0, 5, runnable, (Runnable) null);
    }

    public static final void L(View view, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new lr0(f2));
    }

    public static void M(vob vob, dx8 dx8) {
        int i2 = dx8.b;
        tb7 tb7 = dx8.a;
        if (i2 != -1) {
            boolean J0 = vob.J0(20);
            long j2 = dx8.c;
            if (J0) {
                vob.t0(dx8.b, j2, tb7);
            } else if (!tb7.isEmpty()) {
                vob.p((ir8) tb7.get(0), j2);
            }
        } else if (vob.J0(20)) {
            vob.z0(tb7);
        } else if (!tb7.isEmpty()) {
            vob.o0((ir8) tb7.get(0));
        }
    }

    public static int N(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(wj6.h(i2, "Unsupported surface rotation: "));
    }

    public static Bitmap O(Drawable drawable, int i2, int i3) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static void P(RippleDrawable rippleDrawable, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = rippleDrawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i3 = rippleDrawable.getBounds().top;
        }
        int i6 = rippleDrawable.getBounds().right;
        if ((i5 & 8) != 0) {
            i4 = rippleDrawable.getBounds().bottom;
        }
        rippleDrawable.setBounds(i2, i3, i6, i4);
    }

    public static final void Q(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.bottomMargin = i2;
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void R(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.topMargin = i2;
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void S(ViewGroup viewGroup, boolean z) {
        int i2 = z ? 0 : 4;
        if (viewGroup.getVisibility() != i2) {
            viewGroup.setVisibility(i2);
        }
    }

    public static final void T(fwf fwf) {
        fwf.c(oa4.class, new qid(20));
        fwf.e(p24.class, new rid(18));
        fwf.e(kgb.class, new rid(19));
    }

    public static final pg6 a(Context context, Function0 function0) {
        GestureDetector gestureDetector = new GestureDetector(context, new cq6(0, function0));
        gestureDetector.setIsLongpressEnabled(false);
        return new pg6(gestureDetector, 2);
    }

    public static sa3 b() {
        return new sa3((pm7) null);
    }

    public static void c(yrf yrf, ArrayList arrayList) {
        if (yrf != null) {
            int i2 = 0;
            if (yrf instanceof gsf) {
                gsf gsf = (gsf) yrf;
                int size = gsf.Q0.size();
                while (i2 < size) {
                    c(gsf.T(i2), arrayList);
                    i2++;
                }
                return;
            }
            ArrayList arrayList2 = yrf.v;
            if (!(!(arrayList2 == null || arrayList2.isEmpty()))) {
                ArrayList arrayList3 = yrf.w;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        yrf.c((View) arrayList.get(i2));
                        i2++;
                    }
                }
            }
        }
    }

    public static final void d(RecyclerView recyclerView, int i2, int i3, Runnable runnable, Runnable runnable2) {
        if (recyclerView != null) {
            Handler handler = recyclerView.getHandler();
            if (handler != null && handler.hasMessages(61453)) {
                recyclerView.getHandler().removeMessages(61453, runnable);
            }
            if (!recyclerView.b0() && Looper.getMainLooper().isCurrentThread()) {
                runnable.run();
            } else if (i2 != i3) {
                szc szc = new szc(recyclerView, i2, i3, runnable, runnable2);
                Message obtain = Message.obtain(recyclerView.getHandler(), szc);
                obtain.what = 61453;
                obtain.obj = runnable;
                Handler handler2 = recyclerView.getHandler();
                if (handler2 != null) {
                    handler2.sendMessageAtFrontOfQueue(obtain);
                } else {
                    recyclerView.post(szc);
                }
            } else if (runnable2 != null) {
                runnable2.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public static boolean e(qwd qwd, qwd qwd2) {
        uob uob = qwd.a;
        int i2 = uob.b;
        uob uob2 = qwd2.a;
        return i2 == uob2.b && uob.e == uob2.e && uob.h == uob2.h && uob.i == uob2.i;
    }

    public static zmb f(Context context, float f2, float f3, int i2, int i3, nmb nmb) {
        wgd m2 = te8.m(context);
        float f4 = (float) 16;
        return new zmb((-f2) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4)), ((((float) m2.b) - f2) - ((float) i2)) - ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4)), (-f3) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4)) + ((float) m2.c) + ((float) nmb.a), (((((float) (m2.a - m2.d)) - f3) - ((float) i3)) - ((float) MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density))) - ((float) nmb.b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[SYNTHETIC, Splitter:B:21:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050 A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006a A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007e A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0083 A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0097 A[Catch:{ Exception -> 0x00ff }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098 A[Catch:{ Exception -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence g(java.lang.CharSequence r7, android.widget.TextView r8, int r9) {
        /*
            if (r7 == 0) goto L_0x0107
            boolean r0 = kotlin.text.StringsKt.isBlank(r7)
            if (r0 == 0) goto L_0x000a
            goto L_0x0107
        L_0x000a:
            r0 = 1
            if (r9 > 0) goto L_0x0016
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r9)
            r8.setMaxLines(r0)
            return r7
        L_0x0016:
            r1 = 0
            r8.setEllipsize(r1)     // Catch:{ Exception -> 0x00ff }
            int r2 = r7.length()     // Catch:{ Exception -> 0x00ff }
            int r2 = r2 - r0
            int r3 = r7.length()     // Catch:{ Exception -> 0x00ff }
            java.lang.CharSequence r2 = r7.subSequence(r2, r3)     // Catch:{ Exception -> 0x00ff }
            int r3 = r2.length()     // Catch:{ Exception -> 0x00ff }
            r4 = 0
            boolean r5 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0034
            r5 = r2
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x003e }
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            if (r5 == 0) goto L_0x003e
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r3 = r5.getSpans(r4, r3, r6)     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            if (r3 != 0) goto L_0x0043
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ff }
        L_0x0043:
            int r3 = r3.length     // Catch:{ Exception -> 0x00ff }
            if (r3 != 0) goto L_0x0048
            r3 = r0
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r2 == 0) goto L_0x0070
            int r3 = r2.length()     // Catch:{ Exception -> 0x00ff }
            boolean r5 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x005b
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0065 }
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            if (r2 == 0) goto L_0x0065
            java.lang.Class<android.text.style.ImageSpan> r5 = android.text.style.ImageSpan.class
            java.lang.Object[] r2 = r2.getSpans(r4, r3, r5)     // Catch:{ all -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            android.text.style.ImageSpan[] r2 = (android.text.style.ImageSpan[]) r2     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r1 = kotlin.collections.ArraysKt.firstOrNull((T[]) r2)     // Catch:{ Exception -> 0x00ff }
            android.text.style.ImageSpan r1 = (android.text.style.ImageSpan) r1     // Catch:{ Exception -> 0x00ff }
        L_0x0070:
            if (r1 == 0) goto L_0x0083
            android.graphics.drawable.Drawable r2 = r1.getDrawable()     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0083
            android.graphics.Rect r2 = r2.getBounds()     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0083
            int r2 = r2.width()     // Catch:{ Exception -> 0x00ff }
            goto L_0x0084
        L_0x0083:
            r2 = r4
        L_0x0084:
            android.text.TextPaint r3 = r8.getPaint()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x00ff }
            float r3 = r3.measureText(r5)     // Catch:{ Exception -> 0x00ff }
            float r5 = (float) r2     // Catch:{ Exception -> 0x00ff }
            float r3 = r3 + r5
            float r5 = (float) r9     // Catch:{ Exception -> 0x00ff }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0098
            return r7
        L_0x0098:
            int r3 = r7.length()     // Catch:{ Exception -> 0x00ff }
            android.text.TextPaint r5 = r8.getPaint()     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = android.text.StaticLayout.Builder.obtain(r7, r4, r3, r5, r9)     // Catch:{ Exception -> 0x00ff }
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = r3.setAlignment(r5)     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = r3.setIncludePad(r4)     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = r3.setMaxLines(r0)     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = r3.setBreakStrategy(r4)     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r3 = r3.setHyphenationFrequency(r4)     // Catch:{ Exception -> 0x00ff }
            int r9 = r9 - r2
            android.text.StaticLayout$Builder r9 = r3.setEllipsizedWidth(r9)     // Catch:{ Exception -> 0x00ff }
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout$Builder r9 = r9.setEllipsize(r2)     // Catch:{ Exception -> 0x00ff }
            android.text.StaticLayout r9 = r9.build()     // Catch:{ Exception -> 0x00ff }
            java.lang.CharSequence r2 = r9.getText()     // Catch:{ Exception -> 0x00ff }
            int r3 = r9.getLineStart(r4)     // Catch:{ Exception -> 0x00ff }
            int r9 = r9.getLineEnd(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.CharSequence r9 = r2.subSequence(r3, r9)     // Catch:{ Exception -> 0x00ff }
            java.lang.CharSequence r9 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r9)     // Catch:{ Exception -> 0x00ff }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x00e4
            return r7
        L_0x00e4:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x00ff }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00ff }
            if (r1 == 0) goto L_0x00fe
            java.lang.String r9 = " "
            r2.append(r9)     // Catch:{ Exception -> 0x00ff }
            int r9 = r2.length()     // Catch:{ Exception -> 0x00ff }
            int r9 = r9 - r0
            int r3 = r2.length()     // Catch:{ Exception -> 0x00ff }
            r4 = 18
            r2.setSpan(r1, r9, r3, r4)     // Catch:{ Exception -> 0x00ff }
        L_0x00fe:
            return r2
        L_0x00ff:
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r9)
            r8.setMaxLines(r0)
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kne.g(java.lang.CharSequence, android.widget.TextView, int):java.lang.CharSequence");
    }

    public static int h(long j2, long j3) {
        if (j2 == -9223372036854775807L || j3 == -9223372036854775807L) {
            return 0;
        }
        if (j3 == 0) {
            return 100;
        }
        return v0g.j((int) ((j2 * 100) / j3), 0, 100);
    }

    public static final void i(View view, Rect rect, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new a9d(rect, f2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: jog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(android.app.Activity r6, boolean r7) {
        /*
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            js9 r1 = defpackage.fu4.k
            fu4 r1 = r1.e(r6)
            k2b r1 = r1.f()
            p53 r1 = r1.g()
            p53 r2 = defpackage.p53.b
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x001e
            r1 = r3
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            android.view.Window r2 = r6.getWindow()
            if (r7 == 0) goto L_0x002a
            df0 r5 = defpackage.l2b.d
            int r5 = r5.i
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r2.setNavigationBarColor(r5)
            android.view.Window r6 = r6.getWindow()
            p3a r2 = new p3a
            r2.<init>((android.view.View) r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x0049
            kog r0 = new kog
            android.view.WindowInsetsController r5 = r6.getInsetsController()
            r0.<init>(r5, r2)
            r0.x0 = r6
            goto L_0x004e
        L_0x0049:
            jog r0 = new jog
            r0.<init>(r6, r2)
        L_0x004e:
            if (r7 == 0) goto L_0x0052
        L_0x0050:
            r3 = r4
            goto L_0x0054
        L_0x0052:
            if (r1 != 0) goto L_0x0050
        L_0x0054:
            r0.s0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kne.j(android.app.Activity, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: jog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(android.app.Activity r6, boolean r7) {
        /*
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            js9 r1 = defpackage.fu4.k
            fu4 r1 = r1.e(r6)
            k2b r1 = r1.f()
            p53 r1 = r1.g()
            p53 r2 = defpackage.p53.b
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x001e
            r1 = r3
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            android.view.Window r6 = r6.getWindow()
            p3a r2 = new p3a
            r2.<init>((android.view.View) r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x003a
            kog r0 = new kog
            android.view.WindowInsetsController r5 = r6.getInsetsController()
            r0.<init>(r5, r2)
            r0.x0 = r6
            goto L_0x003f
        L_0x003a:
            jog r0 = new jog
            r0.<init>(r6, r2)
        L_0x003f:
            if (r7 == 0) goto L_0x0043
        L_0x0041:
            r3 = r4
            goto L_0x0045
        L_0x0043:
            if (r1 != 0) goto L_0x0041
        L_0x0045:
            r0.t0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kne.k(android.app.Activity, boolean):void");
    }

    public static int l(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static synchronized void n() {
        synchronized (kne.class) {
            if (!b) {
                o5a.P("static-webp");
                b = true;
            }
        }
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static View q(View view, String str) {
        WeakHashMap weakHashMap = gag.a;
        if (str.equals(v9g.k(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View q = q(viewGroup.getChildAt(i2), str);
            if (q != null) {
                return q;
            }
        }
        return null;
    }

    public static void r(ts tsVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = gag.a;
            String k2 = v9g.k(view);
            if (k2 != null) {
                tsVar.put(k2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    r(tsVar, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static final ch s(Context context) {
        return ((dh) context.getApplicationContext()).d();
    }

    public static final int t(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int u(Cursor cursor, String str) {
        String str2;
        int t = t(cursor, str);
        if (t >= 0) {
            return t;
        }
        try {
            str2 = ArraysKt___ArraysKt.joinToString$default((Object[]) cursor.getColumnNames(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException(g63.j("column '", str, "' does not exist. Available columns: ", str2));
    }

    public static ky1 w(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ky1(bArr, (byte) 0, bArr.length, 2);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        ky1 ky1 = new ky1(copyOf, (byte) 0, copyOf.length, 2);
        if (copyOf[0] == 31) {
            ky1 ky12 = new ky1(copyOf, (byte) 0, copyOf.length, 2);
            while (ky12.b() >= 16) {
                ky12.t(2);
                int i4 = ky12.i(14) & 16383;
                int min = Math.min(8 - ky1.d, 14);
                int i5 = ky1.d;
                int i6 = (8 - i5) - min;
                byte[] bArr2 = ky1.b;
                int i7 = ky1.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - min;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    ky1.b[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = ky1.b;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                ky1.t(14);
                ky1.a();
            }
        }
        ky1.o(copyOf.length, copyOf);
        return ky1;
    }

    public static int x(int i2, int i3, boolean z) {
        int i4 = z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
        if (o54.C(2, "CameraOrientationUtil")) {
            StringBuilder n2 = a81.n("getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", i3, ", isOppositeFacing=");
            n2.append(z);
            n2.append(", result=");
            n2.append(i4);
        }
        return i4;
    }

    public static final PointF y(Context context) {
        wgd m2 = te8.m(context);
        int roundToInt = m2.b - MathKt.roundToInt(((float) 118) * vo4.c().getDisplayMetrics().density);
        float f2 = (float) 16;
        return new PointF((float) a81.e(f2, vo4.c().getDisplayMetrics().density, roundToInt), (float) (a81.e(f2, vo4.c().getDisplayMetrics().density, m2.a - MathKt.roundToInt(((float) 174) * vo4.c().getDisplayMetrics().density)) - m2.d));
    }

    public static long z(ppb ppb, long j2, long j3, long j4) {
        boolean equals = ppb.c.equals(qwd.l);
        qwd qwd = ppb.c;
        boolean z = equals || j3 < qwd.c;
        if (!ppb.v) {
            return (z || j2 == -9223372036854775807L) ? qwd.a.f : j2;
        }
        if (!z && j2 != -9223372036854775807L) {
            return j2;
        }
        if (j4 == -9223372036854775807L) {
            j4 = SystemClock.elapsedRealtime() - qwd.c;
        }
        long j5 = qwd.a.f + ((long) (((float) j4) * ppb.g.a));
        long j6 = qwd.d;
        return j6 != -9223372036854775807L ? Math.min(j5, j6) : j5;
    }

    public abstract void F(lk5 lk5);

    public int hashCode() {
        switch (this.a) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract lk5 m(zi0 zi0, yvb yvb);

    public abstract void p(lk5 lk5, p7d p7d);

    public String toString() {
        switch (this.a) {
            case 18:
                return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
            default:
                return super.toString();
        }
    }

    public abstract HashMap v(lk5 lk5, int i2);
}
