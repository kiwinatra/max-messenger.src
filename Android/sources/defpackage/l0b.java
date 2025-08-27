package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: l0b  reason: default package */
public abstract class l0b {
    public static final Handler a = new Handler(Looper.getMainLooper(), new Object());
    public static k0b b;
    public static k0b c;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(k0b k0b, g0b g0b) {
        WeakReference weakReference;
        h0b h0b;
        if (k0b != null && (weakReference = k0b.b) != null && (h0b = (h0b) weakReference.get()) != null) {
            a.removeCallbacksAndMessages(h0b);
            h0b.a.d(g0b);
        }
    }

    public static void b(h0b h0b, g0b g0b) {
        AtomicBoolean atomicBoolean = d;
        boolean z = false;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            k0b k0b = b;
            if (k0b != null ? Intrinsics.areEqual(k0b.b.get(), (Object) h0b) : false) {
                a(b, g0b);
                return;
            }
            k0b k0b2 = c;
            if (k0b2 != null) {
                z = Intrinsics.areEqual(k0b2.b.get(), (Object) h0b);
            }
            if (z) {
                a(c, g0b);
            }
        }
    }

    public static void c() {
        h0b h0b;
        c1b c1b;
        k0b k0b = c;
        if (k0b != null) {
            b = k0b;
            f6f f6f = null;
            c = null;
            WeakReference weakReference = k0b.b;
            if (weakReference == null || (h0b = (h0b) weakReference.get()) == null) {
                b = null;
                return;
            }
            j50 j50 = h0b.a;
            f6f f6f2 = (f6f) j50.v;
            if (f6f2 != null) {
                f6f2.d();
            } else {
                WeakReference weakReference2 = (WeakReference) j50.c;
                if (f6f2 == null) {
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    Context context = viewGroup != null ? viewGroup.getContext() : null;
                    if (context != null) {
                        z0b z0b = (z0b) j50.o;
                        ViewGroup viewGroup2 = (ViewGroup) weakReference2.get();
                        Context context2 = viewGroup2 != null ? viewGroup2.getContext() : null;
                        if (context2 == null) {
                            c1b = null;
                        } else {
                            c1b = new c1b(context2, (AttributeSet) null);
                            c1b.setTitle(z0b.b);
                            c1b.setCaption(z0b.c);
                            c1b.setLeftElement(z0b.a);
                            y0b y0b = z0b.o;
                            c1b.setRightElement(y0b);
                            if (y0b instanceof v0b) {
                                c1b.setRightBtnAction$snackbar_release((View.OnClickListener) null);
                            } else {
                                c1b.setRightBtnAction$snackbar_release(new u99(11, (Object) j50));
                            }
                        }
                        if (c1b != null) {
                            f6f = new f6f(context);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            n0b n0b = ((z0b) j50.o).v;
                            int i = n0b.a;
                            layoutParams.gravity = (i & 1) != 0 ? 48 : 80;
                            if ((i & 1) != 0) {
                                layoutParams.topMargin = n0b.b;
                            } else {
                                layoutParams.bottomMargin = n0b.c;
                            }
                            f6f.setLayoutParams(layoutParams);
                            if (f6f.isAttachedToWindow()) {
                                f6f.requestApplyInsets();
                            } else {
                                f6f.addOnAttachStateChangeListener(new p50(6, f6f, f6f));
                            }
                            int i2 = pq7.a;
                            j50.b = pq7.b(pq7.c);
                            g18 g18 = new g18(29, j50, context);
                            WeakHashMap weakHashMap = gag.a;
                            v9g.u(f6f, g18);
                            f6f.addView(c1b);
                            float f = (float) 12;
                            f6f.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                            f6f.setClipToPadding(false);
                            f6f.setClipChildren(false);
                            f6f.setClipToOutline(false);
                            f6f.setElevation(10.0f);
                            f6f.setCallback(new i0b(j50, c1b, f6f));
                            u3b.a(f6f, new tj7(17, f6f, f6f));
                            j50.v = f6f;
                        }
                    }
                    f6f2 = f6f;
                }
                if (f6f2 != null) {
                    ViewGroup viewGroup3 = (ViewGroup) weakReference2.get();
                    if (viewGroup3 != null) {
                        viewGroup3.addView(f6f2);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) weakReference2.get();
                    if (viewGroup4 != null) {
                        viewGroup4.addOnAttachStateChangeListener((el) j50.x);
                    }
                }
            }
            if (d.compareAndSet(true, false)) {
                k0b k0b2 = b;
                if (k0b2 != null ? Intrinsics.areEqual(k0b2.b.get(), (Object) (h0b) j50.y) : false) {
                    k0b k0b3 = b;
                    Handler handler = a;
                    handler.removeCallbacksAndMessages(k0b3);
                    handler.sendMessageDelayed(Message.obtain(handler, 0, k0b3), k0b3 != null ? k0b3.a : 3500);
                }
            }
        }
    }
}
