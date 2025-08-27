package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.ExceptionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.HttpStatus;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ev0  reason: default package */
public abstract class ev0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, Uuid.SIZE_BITS, 160, 192, 224, 256, 320, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final frg g = new frg("DISK_USAGE", 2);
    public static final boolean[] h = new boolean[3];
    public static final String[] i = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] j = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] k = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int l = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mt9 A(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = defpackage.y7e.K(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.y7e.K(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = i
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = defpackage.y7e.q(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = j
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = defpackage.y7e.q(r1, r10)
            if (r10 == 0) goto L_0x0061
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0061:
            int r8 = r8 + r0
            goto L_0x004c
        L_0x0063:
            r8 = r5
        L_0x0064:
            java.lang.String[] r3 = k
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0090
            r10 = r3[r7]
            java.lang.String r10 = defpackage.y7e.q(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            lt9 r3 = new lt9
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            lt9 r7 = new lt9
            java.lang.String r14 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r15)
            k0d r3 = defpackage.tb7.u(r3, r7)
            goto L_0x0094
        L_0x008e:
            int r7 = r7 + r0
            goto L_0x0066
        L_0x0090:
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
        L_0x0094:
            r7 = r8
            goto L_0x00ba
        L_0x0096:
            int r8 = r8 + r0
            goto L_0x0038
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = defpackage.y7e.K(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            k0d r3 = B(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.y7e.K(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            k0d r3 = B(r1, r3, r9)
        L_0x00ba:
            boolean r9 = defpackage.y7e.H(r1, r2)
            if (r9 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c7
            return r4
        L_0x00c7:
            mt9 r0 = new mt9
            r0.<init>(r7, r3)
            return r0
        L_0x00cd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.A(java.lang.String):mt9");
    }

    public static k0d B(XmlPullParser xmlPullParser, String str, String str2) {
        qb7 o = tb7.o();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (y7e.K(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String q = y7e.q(xmlPullParser, concat3);
                String q2 = y7e.q(xmlPullParser, concat4);
                String q3 = y7e.q(xmlPullParser, concat5);
                String q4 = y7e.q(xmlPullParser, concat6);
                if (q == null || q2 == null) {
                    return k0d.v;
                }
                o.a(new lt9(q3 != null ? Long.parseLong(q3) : 0, q, q4 != null ? Long.parseLong(q4) : 0));
            }
        } while (!y7e.H(xmlPullParser, concat2));
        return o.j();
    }

    public static final Object C(CoroutineContext coroutineContext, Function2 function2) {
        CoroutineContext coroutineContext2;
        a95 a95;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(key);
        if (continuationInterceptor == null) {
            a95 = lif.a();
            coroutineContext2 = o04.a(EmptyCoroutineContext.INSTANCE, coroutineContext.plus(a95), true);
            bi4 bi4 = dq4.a;
            if (coroutineContext2 != bi4 && coroutineContext2.get(key) == null) {
                coroutineContext2 = coroutineContext2.plus(bi4);
            }
        } else {
            if (continuationInterceptor instanceof a95) {
                a95 a952 = (a95) continuationInterceptor;
            }
            a95 = (a95) lif.a.get();
            coroutineContext2 = o04.a(EmptyCoroutineContext.INSTANCE, coroutineContext, true);
            bi4 bi42 = dq4.a;
            if (coroutineContext2 != bi42 && coroutineContext2.get(key) == null) {
                coroutineContext2 = coroutineContext2.plus(bi42);
            }
        }
        rp0 rp0 = new rp0(coroutineContext2, currentThread, a95);
        rp0.j0(f14.a, rp0, function2);
        a95 a953 = rp0.v;
        if (a953 != null) {
            int i2 = a95.v;
            a953.w0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long y0 = a953 != null ? a953.y0() : LongCompanionObject.MAX_VALUE;
                if (!rp0.e0()) {
                    LockSupport.parkNanos(rp0, y0);
                } else {
                    if (a953 != null) {
                        int i3 = a95.v;
                        a953.t0(false);
                    }
                    Object U = ld9.U(qn7.a.get(rp0));
                    jb3 jb3 = U instanceof jb3 ? (jb3) U : null;
                    if (jb3 == null) {
                        return U;
                    }
                    throw jb3.a;
                }
            } catch (Throwable th) {
                if (a953 != null) {
                    int i4 = a95.v;
                    a953.t0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        rp0.z(interruptedException);
        throw interruptedException;
    }

    public static void E(Runnable runnable) {
        if (s()) {
            runnable.run();
        } else {
            bs0.r("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static String F(l20 l20) {
        int i2 = 5;
        while (true) {
            g20 g20 = l20.a;
            int i3 = g20 == null ? -1 : b6e.$EnumSwitchMapping$0[g20.ordinal()];
            if (i3 == 1) {
                return l20.b.a();
            }
            if (i3 == 2) {
                return l20.d.c;
            }
            if (i3 != 3) {
                return null;
            }
            c20 c20 = l20.g;
            if (c20.a()) {
                x10 x10 = c20.f;
                if (x10 != null) {
                    return x10.a();
                }
                return null;
            } else if (!c20.b() || i2 < 0 || (l20 = c20.g) == null) {
                return null;
            } else {
                i2--;
            }
        }
    }

    public static ArrayList G(Collection collection, yi6 yi6) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            arrayList.add((Bundle) yi6.apply(apply));
        }
        return arrayList;
    }

    public static final void H(fwf fwf) {
        fwf.c(oa4.class, new qid(24));
    }

    /* JADX INFO: finally extract failed */
    public static final Object I(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object obj;
        CoroutineContext context = continuation.getContext();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new ui0(6))).booleanValue() ? context.plus(coroutineContext) : o04.a(context, coroutineContext, false);
        kv0.q(plus);
        if (plus != context) {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (!Intrinsics.areEqual((Object) plus.get(key), (Object) context.get(key))) {
                dgd dgd = new dgd(continuation, plus);
                qw1.b(function2, dgd, dgd);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = aq4.v;
                    int i2 = atomicIntegerFieldUpdater.get(dgd);
                    if (i2 == 0) {
                        if (atomicIntegerFieldUpdater.compareAndSet(dgd, 0, 1)) {
                            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            break;
                        }
                    } else if (i2 == 2) {
                        obj = ld9.U(qn7.a.get(dgd));
                        if (obj instanceof jb3) {
                            throw ((jb3) obj).a;
                        }
                    } else {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                }
            } else {
                ivf ivf = new ivf(continuation, plus);
                CoroutineContext coroutineContext2 = ivf.c;
                Object b2 = eif.b(coroutineContext2, (Object) null);
                try {
                    Object W = bs0.W(ivf, ivf, function2);
                    eif.a(coroutineContext2, b2);
                    obj = W;
                } catch (Throwable th) {
                    eif.a(coroutineContext2, b2);
                    throw th;
                }
            }
        } else {
            dgd dgd2 = new dgd(continuation, plus);
            obj = bs0.W(dgd2, dgd2, function2);
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj;
    }

    public static final b10 a(xyf xyf) {
        int ordinal = xyf.ordinal();
        if (ordinal == 0) {
            return b10.UNKNOWN;
        }
        if (ordinal == 1) {
            return b10.VIDEO;
        }
        if (ordinal != 2) {
            if (ordinal == 4) {
                return b10.FILE;
            }
            if (ordinal == 5) {
                return b10.AUDIO;
            }
            if (ordinal != 6) {
                return ordinal != 7 ? b10.UNKNOWN : b10.STICKER;
            }
        }
        return b10.PHOTO;
    }

    public static final int b(int i2, int i3, int i4) {
        return Math.min(Math.max(0, i4 - i2), i3);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [g0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.nk4 c(defpackage.d14 r1, kotlin.coroutines.CoroutineContext r2, defpackage.f14 r3, kotlin.jvm.functions.Function2 r4) {
        /*
            kotlin.coroutines.CoroutineContext r1 = defpackage.o04.b(r1, r2)
            r3.getClass()
            f14 r2 = defpackage.f14.b
            if (r3 != r2) goto L_0x0011
            ks7 r2 = new ks7
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            nk4 r2 = new nk4
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.j0(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.c(d14, kotlin.coroutines.CoroutineContext, f14, kotlin.jvm.functions.Function2):nk4");
    }

    public static /* synthetic */ nk4 d(d14 d14, q04 q04, Function2 function2, int i2) {
        CoroutineContext coroutineContext = q04;
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return c(d14, coroutineContext, f14.a, function2);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(android.graphics.drawable.StateListDrawable r3, defpackage.k2b r4) {
        /*
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            int r0 = r3.findStateDrawableIndex(r0)
            android.graphics.drawable.Drawable r0 = r3.getStateDrawable(r0)
            boolean r1 = r0 instanceof one.me.sdk.richvector.EnhancedVectorDrawable
            r2 = 0
            if (r1 == 0) goto L_0x0017
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = (one.me.sdk.richvector.EnhancedVectorDrawable) r0
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            r1 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1}
            int r1 = r3.findStateDrawableIndex(r1)
            android.graphics.drawable.Drawable r3 = r3.getStateDrawable(r1)
            boolean r1 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x0031
            r2 = r3
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            return
        L_0x0034:
            u67 r3 = r4.getIcon()
            r3.getClass()
            r3 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            java.lang.String r1 = "circle_background"
            defpackage.hi7.Y(r0, r1, r3)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r3 = r3 * r0
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            fye r4 = r4.h()
            int r4 = r4.j
            r2.setStroke(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.e(android.graphics.drawable.StateListDrawable, k2b):void");
    }

    public static final void f(int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        cvg.n(i5 >= 0, "count (%d) ! >= 0", Integer.valueOf(i5));
        cvg.n(i2 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i2));
        cvg.n(i4 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i4));
        cvg.n(i2 + i5 <= i6, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6));
        if (i4 + i5 <= i3) {
            z = true;
        }
        cvg.n(z, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3));
    }

    public static void g() {
        bs0.r("Not in application's main thread", s());
    }

    public static void h(uj3 uj3, gw7 gw7, tj3 tj3) {
        tj3.o = -1;
        tj3.p = -1;
        int i2 = uj3.p0[0];
        int[] iArr = tj3.p0;
        if (i2 != 2 && iArr[0] == 4) {
            aj3 aj3 = tj3.I;
            int i3 = aj3.g;
            int q = uj3.q();
            aj3 aj32 = tj3.K;
            int i4 = q - aj32.g;
            aj3.i = gw7.k(aj3);
            aj32.i = gw7.k(aj32);
            gw7.d(aj3.i, i3);
            gw7.d(aj32.i, i4);
            tj3.o = 2;
            tj3.Y = i3;
            int i5 = i4 - i3;
            tj3.U = i5;
            int i6 = tj3.b0;
            if (i5 < i6) {
                tj3.U = i6;
            }
        }
        if (uj3.p0[1] != 2 && iArr[1] == 4) {
            aj3 aj33 = tj3.J;
            int i7 = aj33.g;
            int k2 = uj3.k();
            aj3 aj34 = tj3.L;
            int i8 = k2 - aj34.g;
            aj33.i = gw7.k(aj33);
            aj34.i = gw7.k(aj34);
            gw7.d(aj33.i, i7);
            gw7.d(aj34.i, i8);
            if (tj3.a0 > 0 || tj3.g0 == 8) {
                aj3 aj35 = tj3.M;
                sfe k3 = gw7.k(aj35);
                aj35.i = k3;
                gw7.d(k3, tj3.a0 + i7);
            }
            tj3.p = 2;
            tj3.Z = i7;
            int i9 = i8 - i7;
            tj3.V = i9;
            int i10 = tj3.c0;
            if (i9 < i10) {
                tj3.V = i10;
            }
        }
    }

    public static StateListDrawable i(Context context) {
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, zec.ic_check_filled_24);
        js9 js9 = fu4.k;
        js9.e(context).f().getIcon().getClass();
        hi7.Y(enhancedVectorDrawable, "circle_background", -16745729);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        float f2 = (float) 24;
        gradientDrawable.setSize(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), js9.e(context).f().h().j);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        return stateListDrawable;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r9 != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        if (r3 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        r3 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        r8.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[Catch:{ all -> 0x0093 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.ds5 r7, defpackage.wtc r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.jt5
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jt5 r0 = (defpackage.jt5) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            jt5 r0 = new jt5
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r9 = r0.o
            lu0 r7 = r0.c
            wtc r8 = r0.b
            ds5 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0037 }
        L_0x0034:
            r10 = r7
            r7 = r2
            goto L_0x0058
        L_0x0037:
            r7 = move-exception
            goto L_0x0092
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            boolean r9 = r0.o
            lu0 r7 = r0.c
            wtc r8 = r0.b
            ds5 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0037 }
            goto L_0x006d
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r7 instanceof defpackage.xif
            if (r10 != 0) goto L_0x00ad
            lu0 r10 = r8.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0058:
            r0.a = r7     // Catch:{ all -> 0x0037 }
            r0.b = r8     // Catch:{ all -> 0x0037 }
            r0.c = r10     // Catch:{ all -> 0x0037 }
            r0.o = r9     // Catch:{ all -> 0x0037 }
            r0.w = r5     // Catch:{ all -> 0x0037 }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x0037 }
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L_0x006d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0037 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x008a
            java.lang.Object r10 = r7.c()     // Catch:{ all -> 0x0037 }
            r0.a = r2     // Catch:{ all -> 0x0037 }
            r0.b = r8     // Catch:{ all -> 0x0037 }
            r0.c = r7     // Catch:{ all -> 0x0037 }
            r0.o = r9     // Catch:{ all -> 0x0037 }
            r0.w = r4     // Catch:{ all -> 0x0037 }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x0037 }
            if (r10 != r1) goto L_0x0034
            return r1
        L_0x008a:
            if (r9 == 0) goto L_0x008f
            r8.b(r3)
        L_0x008f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x0092:
            throw r7     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r10 = move-exception
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L_0x009d
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L_0x009d:
            if (r3 != 0) goto L_0x00a9
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        L_0x00a9:
            r8.b(r3)
        L_0x00ac:
            throw r10
        L_0x00ad:
            xif r7 = (defpackage.xif) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.j(ds5, wtc, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean k(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final boolean l(dz6 dz6, dz6 dz62) {
        if (dz6.g() != dz62.g() || dz6.h() != dz62.h() || dz6.i().size() != dz62.i().size()) {
            return false;
        }
        int size = dz6.i().size();
        for (int i2 = 0; i2 < size; i2++) {
            l03 l03 = (l03) dz6.i().get(i2);
            l03 l032 = (l03) dz62.i().get(i2);
            if (l03.a() != l032.a() || l03.b() != l032.b()) {
                return false;
            }
        }
        return true;
    }

    public static k0d m(yi6 yi6, List list) {
        qb7 o = tb7.o();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            o.a(yi6.apply(bundle));
        }
        return o.j();
    }

    public static int n(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final int o(int i2) {
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static String p(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static final void q(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            try {
                n54.D(th);
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
                u04.a(th, coroutineContext);
            }
        }
    }

    public static final boolean r(int i2) {
        return (8400 <= i2 && i2 < 8448) || (8596 <= i2 && i2 < 8601) || ((9100 <= i2 && i2 < 9301) || ((9723 <= i2 && i2 < 9727) || ((9728 <= i2 && i2 < 9984) || ((9984 <= i2 && i2 < 10176) || ((65024 <= i2 && i2 < 65040) || ((127462 <= i2 && i2 < 127488) || ((127744 <= i2 && i2 < 128512) || ((128512 <= i2 && i2 < 128592) || ((128640 <= i2 && i2 < 128768) || ((128992 <= i2 && i2 < 129004) || ((129648 <= i2 && i2 < 129661) || ((129664 <= i2 && i2 < 129734) || ((129742 <= i2 && i2 < 129756) || ((129760 <= i2 && i2 < 129769) || ((129776 <= i2 && i2 < 129785) || ((129280 <= i2 && i2 < 129536) || ((127000 <= i2 && i2 < 127601) || ((917536 <= i2 && i2 < 917632) || i2 == 126980 || i2 == 129008 || i2 == 8252 || i2 == 8265 || i2 == 8482 || i2 == 8505 || i2 == 8601 || i2 == 8617 || i2 == 8618 || i2 == 8986 || i2 == 8987 || i2 == 9000 || i2 == 9410 || i2 == 9642 || i2 == 9643 || i2 == 9654 || i2 == 9664 || i2 == 10548 || i2 == 10549 || i2 == 11013 || i2 == 11014 || i2 == 11015 || i2 == 11035 || i2 == 11036 || i2 == 11088 || i2 == 11093 || i2 == 12336 || i2 == 12349 || i2 == 12951 || i2 == 12953 || i2 == 169 || i2 == 174))))))))))))))))));
    }

    public static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final boolean t(ur7 ur7) {
        return ur7 == null || StringsKt.isBlank(ur7.a);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [g0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.aje u(defpackage.d14 r1, kotlin.coroutines.CoroutineContext r2, defpackage.f14 r3, kotlin.jvm.functions.Function2 r4) {
        /*
            kotlin.coroutines.CoroutineContext r1 = defpackage.o04.b(r1, r2)
            r3.getClass()
            f14 r2 = defpackage.f14.b
            if (r3 != r2) goto L_0x0011
            ns7 r2 = new ns7
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            aje r2 = new aje
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.j0(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.u(d14, kotlin.coroutines.CoroutineContext, f14, kotlin.jvm.functions.Function2):aje");
    }

    public static /* synthetic */ aje v(d14 d14, CoroutineContext coroutineContext, f14 f14, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            f14 = f14.a;
        }
        return u(d14, coroutineContext, f14, function2);
    }

    public static final void w(View view, int i2, int i3, int i4, int i5) {
        View view2 = (View) view.getParent();
        if (ct.y(view.getContext())) {
            view.layout(view2.getMeasuredWidth() - i4, i3, view2.getMeasuredWidth() - i2, i5);
        } else {
            view.layout(i2, i3, i4, i5);
        }
    }

    public static /* synthetic */ void x(View view, int i2, int i3, int i4, int i5) {
        int measuredWidth = view.getMeasuredWidth() + i2;
        if ((i5 & 8) != 0) {
            i4 = view.getMeasuredHeight() + i3;
        }
        w(view, i2, i3, measuredWidth, i4);
    }

    public static final String y(zx3 zx3) {
        String name = zx3.getClass().getName();
        int hashCode = zx3.hashCode();
        return name + "@" + hashCode;
    }

    public static final void z(BottomSheetWidget bottomSheetWidget, String str, Function2 function2) {
        by7 by7 = (by7) e3e.a.getAccessor().h(by7.class).getValue();
        by7.getClass();
        function2.invoke(new on2(new ql8(by7.e(Uri.parse(str)), 15), 28), new l(21, bottomSheetWidget));
    }
}
