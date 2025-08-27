package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.gms.internal.play_billing.zzdn;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.uuid.Uuid;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bs0  reason: default package */
public abstract class bs0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, Uuid.SIZE_BITS, 160, 192, 224, 256, 320, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final frg g = new frg("CRASH_REPORT", 2);
    public static final int[][] h = {new int[]{-46922, -30155}, new int[]{-14019, -31958}, new int[]{-15408683, -16529630}, new int[]{-16197645, -11298561}, new int[]{-4220929, -11374849}};
    public static final String[] i = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] j = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] k = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static cgd l;
    public static boolean m;

    /* JADX WARNING: type inference failed for: r0v7, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A(defpackage.ome r6, defpackage.fv5 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof defpackage.av5
            if (r0 == 0) goto L_0x0013
            r0 = r8
            av5 r0 = (defpackage.av5) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            av5 r0 = new av5
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            bpa r3 = defpackage.q8.e
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            yu5 r6 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.b
            kotlin.jvm.functions.Function2 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ AbortFlowException -> 0x0031 }
            goto L_0x0066
        L_0x0031:
            r8 = move-exception
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r3
            yu5 r2 = new yu5
            r5 = 0
            r2.<init>(r7, r8, r5)
            r0.a = r7     // Catch:{ AbortFlowException -> 0x005d }
            r0.b = r8     // Catch:{ AbortFlowException -> 0x005d }
            r0.c = r2     // Catch:{ AbortFlowException -> 0x005d }
            r0.v = r4     // Catch:{ AbortFlowException -> 0x005d }
            java.lang.Object r6 = r6.e(r2, r0)     // Catch:{ AbortFlowException -> 0x005d }
            if (r6 != r1) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            r0 = r7
            r7 = r8
            goto L_0x0066
        L_0x005d:
            r6 = move-exception
            r0 = r7
            r7 = r8
            r8 = r6
            r6 = r2
        L_0x0062:
            java.lang.Object r1 = r8.a
            if (r1 != r6) goto L_0x007f
        L_0x0066:
            T r1 = r7.element
            if (r1 == r3) goto L_0x006b
        L_0x006a:
            return r1
        L_0x006b:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x007f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.A(ome, fv5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(defpackage.bs5 r5, defpackage.v6g r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dv5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dv5 r0 = (defpackage.dv5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            dv5 r0 = new dv5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            yu5 r5 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ AbortFlowException -> 0x002d }
            goto L_0x005c
        L_0x002d:
            r7 = move-exception
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            yu5 r2 = new yu5
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.a = r7     // Catch:{ AbortFlowException -> 0x0054 }
            r0.b = r2     // Catch:{ AbortFlowException -> 0x0054 }
            r0.o = r3     // Catch:{ AbortFlowException -> 0x0054 }
            java.lang.Object r5 = r5.e(r2, r0)     // Catch:{ AbortFlowException -> 0x0054 }
            if (r5 != r1) goto L_0x0052
            goto L_0x005e
        L_0x0052:
            r6 = r7
            goto L_0x005c
        L_0x0054:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L_0x0058:
            java.lang.Object r0 = r7.a
            if (r0 != r5) goto L_0x005f
        L_0x005c:
            T r1 = r6.element
        L_0x005e:
            return r1
        L_0x005f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.B(bs5, v6g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object C(defpackage.bs5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cv5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cv5 r0 = (defpackage.cv5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            cv5 r0 = new cv5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wu5 r5 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ AbortFlowException -> 0x002d }
            goto L_0x005c
        L_0x002d:
            r6 = move-exception
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            wu5 r2 = new wu5
            r4 = 1
            r2.<init>(r6, r4)
            r0.a = r6     // Catch:{ AbortFlowException -> 0x0054 }
            r0.b = r2     // Catch:{ AbortFlowException -> 0x0054 }
            r0.o = r3     // Catch:{ AbortFlowException -> 0x0054 }
            java.lang.Object r5 = r5.e(r2, r0)     // Catch:{ AbortFlowException -> 0x0054 }
            if (r5 != r1) goto L_0x0052
            goto L_0x005e
        L_0x0052:
            r0 = r6
            goto L_0x005c
        L_0x0054:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x0058:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x005f
        L_0x005c:
            T r1 = r0.element
        L_0x005e:
            return r1
        L_0x005f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.C(bs5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final on2 D(bs5 bs5, Function2 function2) {
        int i2 = vu5.a;
        return new on2(new ps5(bs5, function2, 4), 27);
    }

    public static bs5 E(bs5 bs5) {
        int i2 = vu5.a;
        if (i2 <= 0) {
            throw new IllegalArgumentException(wj6.h(i2, "Expected positive concurrency level, but had ").toString());
        } else if (i2 == 1) {
            return new on2(bs5, 27);
        } else {
            return new k12(i2, -2, cu0.a, bs5, EmptyCoroutineContext.INSTANCE);
        }
    }

    public static final bs5 F(bs5 bs5, CoroutineContext coroutineContext) {
        if (coroutineContext.get(om7.a) == null) {
            return Intrinsics.areEqual((Object) coroutineContext, (Object) EmptyCoroutineContext.INSTANCE) ? bs5 : bs5 instanceof lj6 ? m5a.x((lj6) bs5, coroutineContext, 0, (cu0) null, 6) : new n12(0, 12, (cu0) null, bs5, coroutineContext);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static int G(int i2, int i3) {
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

    public static String H(vk3 vk3, n10 n10) {
        String f2;
        if (vk3 != null && (f2 = vk3.f()) != null && f2.length() != 0) {
            String f3 = vk3.f();
            return f3 == null ? "" : f3;
        } else if (n10.d.length() <= 0) {
            return "Unknown";
        } else {
            String str = n10.d;
            String str2 = n10.e;
            return (str2 == null || str2.isEmpty()) ? str : g63.i(str, " ", str2);
        }
    }

    public static int I(int i2) {
        return i2 <= 9 ? i2 + 48 : i2 + 87;
    }

    public static boolean J() {
        return cs0.d;
    }

    public static final pm7 K(bs5 bs5, d14 d14) {
        return ev0.v(d14, (CoroutineContext) null, (f14) null, new kt5(bs5, (Continuation) null), 3);
    }

    public static final s12 L(bs5 bs5, Function2 function2) {
        int i2 = vu5.a;
        return b0(bs5, new uu5((Object) function2, (Continuation) null, 0));
    }

    public static final g12 M(bs5... bs5Arr) {
        int i2 = vu5.a;
        return new g12(ArraysKt.asIterable((T[]) bs5Arr), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mt9 N(java.lang.String r20) {
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
            boolean r3 = defpackage.fqc.B(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.fqc.B(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = i
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = defpackage.fqc.m(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = j
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = defpackage.fqc.m(r1, r10)
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
            java.lang.String r10 = defpackage.fqc.m(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            kt9 r3 = new kt9
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            kt9 r7 = new kt9
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
            boolean r9 = defpackage.fqc.B(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            k0d r3 = O(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.fqc.B(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            k0d r3 = O(r1, r3, r9)
        L_0x00ba:
            boolean r9 = defpackage.fqc.z(r1, r2)
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
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.N(java.lang.String):mt9");
    }

    public static k0d O(XmlPullParser xmlPullParser, String str, String str2) {
        qb7 o = tb7.o();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (fqc.B(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m2 = fqc.m(xmlPullParser, concat3);
                String m3 = fqc.m(xmlPullParser, concat4);
                String m4 = fqc.m(xmlPullParser, concat5);
                String m5 = fqc.m(xmlPullParser, concat6);
                if (m2 == null || m3 == null) {
                    return k0d.v;
                }
                o.a(new kt9(m4 != null ? Long.parseLong(m4) : 0, m2, m5 != null ? Long.parseLong(m5) : 0));
            }
        } while (!fqc.z(xmlPullParser, concat2));
        return o.j();
    }

    public static final void P(Continuation continuation) {
        boolean z = k94.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j94.a;
        j94 j94 = k94.d;
        if (atomicIntegerFieldUpdater.get(j94) <= 0) {
            return;
        }
        if (!k94.a || continuation.getContext() != EmptyCoroutineContext.INSTANCE) {
            CoroutineStackFrame coroutineStackFrame = null;
            if (Intrinsics.areEqual((Object) "RUNNING", (Object) "RUNNING")) {
                if (continuation instanceof CoroutineStackFrame) {
                    coroutineStackFrame = (CoroutineStackFrame) continuation;
                }
                if (coroutineStackFrame != null && atomicIntegerFieldUpdater.get(j94) > 0) {
                    rae.w(k94.c.remove(coroutineStackFrame));
                    do {
                        coroutineStackFrame = coroutineStackFrame.getCallerFrame();
                    } while (coroutineStackFrame != null);
                    return;
                }
                return;
            }
            if (continuation instanceof CoroutineStackFrame) {
                coroutineStackFrame = (CoroutineStackFrame) continuation;
            }
            if (coroutineStackFrame != null) {
                do {
                    coroutineStackFrame = coroutineStackFrame.getCallerFrame();
                } while (coroutineStackFrame != null);
            }
        }
    }

    public static final y02 Q(x02 x02) {
        return new y02(x02, false);
    }

    public static final wb R(sbd sbd, long j2, Function2 function2) {
        if (j2 > 0) {
            return new wb(16, sbd, new cu5(j2, function2, (Continuation) null));
        }
        throw new IllegalArgumentException(wj6.i(j2, "Expected positive amount of retries, but had ").toString());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, o10] */
    public static void S(a32 a32, m5 m5Var, jqg jqg) {
        if (m5Var != null) {
            vk3 m2 = a32.m();
            if ((m2 == null || !m2.A()) && !a32.g0()) {
                int i2 = q10.p;
                ? obj = new Object();
                obj.a = p10.Y;
                obj.i = m5Var.getString(jad.o);
                obj.o = null;
                jqg.a(new lud(new kud(a32.a, obj.a(), 1), (byte) 0));
            }
        }
    }

    public static void T(r62 r62, long j2, zg6 zg6, m5 m5Var, a32 a32, jqg jqg) {
        if (a32 == null) {
            r62.P(j2, new cr0((Object) zg6, (Object) m5Var, (Object) jqg, j2, 1));
            return;
        }
        S(a32, m5Var, jqg);
        q5.U(m5Var, j2);
    }

    public static boolean U(a32 a32) {
        if (a32 != null && !a32.h0()) {
            m72 m72 = a32.b;
            return m72.a == 0 || m72.c == k72.o;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object V(defpackage.on2 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ev5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ev5 r0 = (defpackage.ev5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            ev5 r0 = new ev5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            bpa r3 = defpackage.q8.e
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            wu5 r6 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0060
        L_0x002f:
            r7 = move-exception
            goto L_0x005c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r3
            wu5 r2 = new wu5
            r5 = 2
            r2.<init>(r7, r5)
            r0.a = r7     // Catch:{ AbortFlowException -> 0x0058 }
            r0.b = r2     // Catch:{ AbortFlowException -> 0x0058 }
            r0.o = r4     // Catch:{ AbortFlowException -> 0x0058 }
            java.lang.Object r6 = r6.e(r2, r0)     // Catch:{ AbortFlowException -> 0x0058 }
            if (r6 != r1) goto L_0x0056
            goto L_0x0066
        L_0x0056:
            r0 = r7
            goto L_0x0060
        L_0x0058:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L_0x005c:
            java.lang.Object r1 = r7.a
            if (r1 != r6) goto L_0x0067
        L_0x0060:
            T r6 = r0.element
            if (r6 != r3) goto L_0x0065
            r6 = 0
        L_0x0065:
            r1 = r6
        L_0x0066:
            return r1
        L_0x0067:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.V(on2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object W(dgd dgd, dgd dgd2, Function2 function2) {
        Object obj;
        try {
            obj = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(dgd2, dgd);
        } catch (Throwable th) {
            obj = new jb3(th, false);
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object S = dgd.S(obj);
        if (S == ld9.e) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (!(S instanceof jb3)) {
            return ld9.U(S);
        }
        throw ((jb3) S).a;
    }

    public static final etc X(bs5 bs5, d14 d14, a7e a7e, Object obj) {
        dm4 dm4;
        f12 f12;
        bs5 k2;
        x02.l.getClass();
        RangesKt.coerceAtLeast(1, w02.b);
        if (!(bs5 instanceof f12) || (k2 = f12.k()) == null) {
            cu0 cu0 = cu0.a;
            dm4 = new dm4(24, (Object) bs5, (Object) EmptyCoroutineContext.INSTANCE);
        } else {
            int i2 = (f12 = (f12) bs5).b;
            if (i2 == -3 || i2 == -2 || i2 == 0) {
                cu0 cu02 = cu0.a;
            }
            dm4 = new dm4(24, (Object) k2, (Object) f12.a);
        }
        xme a2 = f6e.a(obj);
        ev0.u(d14, (CoroutineContext) dm4.c, Intrinsics.areEqual((Object) a7e, (Object) z6e.a) ? f14.a : f14.o, new hv5(a7e, (bs5) dm4.b, a2, obj, (Continuation) null));
        return new etc(a2);
    }

    public static final eu5 Y(bs5 bs5, int i2) {
        if (i2 > 0) {
            return new eu5(bs5, i2, 1);
        }
        throw new IllegalArgumentException(a81.j(i2, "Requested element count ", " should be positive").toString());
    }

    public static final JSONArray Z(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof List) {
                next = Z((List) next);
            } else if (next instanceof Map) {
                next = a0((Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static final int a(bs0 bs0, XmlPullParser xmlPullParser, String str) {
        bs0.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public static final JSONObject a0(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = Z((List) value);
            } else if (value instanceof Map) {
                value = a0((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    public static final boolean b(bs0 bs0, int i2) {
        bs0.getClass();
        return i2 != -1;
    }

    public static final s12 b0(bs5 bs5, Function3 function3) {
        int i2 = vu5.a;
        return new s12(function3, bs5, EmptyCoroutineContext.INSTANCE, -2, cu0.a);
    }

    public static final void c(OutputStream outputStream, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            outputStream.write(str.charAt(i2));
        }
    }

    public static final void c0(fwf fwf) {
        fwf.e(t39.class, new fm8(4));
        fwf.e(gh4.class, new fm8(5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0283, code lost:
        if (r2.d == r7) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r4.d == r13) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(defpackage.uj3 r36, defpackage.gw7 r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.z0
            xy1[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.A0
            xy1[] r2 = r0.B0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0714
            r1 = r15[r9]
            boolean r2 = r1.q
            tj3 r8 = r1.a
            r3 = 3
            r4 = 1
            r7 = 8
            r17 = 0
            if (r2 != 0) goto L_0x0155
            int r2 = r1.l
            int r6 = r2 * 2
            r13 = r8
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x011f
            int r5 = r1.i
            int r5 = r5 + r4
            r1.i = r5
            tj3[] r5 = r13.m0
            r5[r2] = r17
            tj3[] r5 = r13.l0
            r5[r2] = r17
            int r5 = r13.g0
            aj3[] r4 = r13.Q
            if (r5 == r7) goto L_0x00ec
            r13.j(r2)
            r5 = r4[r6]
            r5.e()
            int r5 = r6 + 1
            r23 = r4[r5]
            r23.e()
            r23 = r4[r6]
            r23.e()
            r5 = r4[r5]
            r5.e()
            tj3 r5 = r1.b
            if (r5 != 0) goto L_0x0068
            r1.b = r13
        L_0x0068:
            r1.d = r13
            int[] r5 = r13.p0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00ec
            int[] r7 = r13.t
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007e
            if (r7 == r3) goto L_0x007e
            if (r7 != r12) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r25 = r9
            goto L_0x00d0
        L_0x007e:
            int r12 = r1.j
            r22 = 1
            int r12 = r12 + 1
            r1.j = r12
            float[] r12 = r13.k0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0095
            float r3 = r1.k
            float r3 = r3 + r12
            r1.k = r3
        L_0x0095:
            int r3 = r13.g0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00c0
            r3 = 3
            if (r5 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x00a4
            if (r7 != r3) goto L_0x00c0
        L_0x00a4:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ad
            r3 = 1
            r1.n = r3
            goto L_0x00b0
        L_0x00ad:
            r3 = 1
            r1.o = r3
        L_0x00b0:
            java.util.ArrayList r3 = r1.h
            if (r3 != 0) goto L_0x00bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.h = r3
        L_0x00bb:
            java.util.ArrayList r3 = r1.h
            r3.add(r13)
        L_0x00c0:
            tj3 r3 = r1.f
            if (r3 != 0) goto L_0x00c6
            r1.f = r13
        L_0x00c6:
            tj3 r3 = r1.g
            if (r3 == 0) goto L_0x00ce
            tj3[] r3 = r3.l0
            r3[r2] = r13
        L_0x00ce:
            r1.g = r13
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            int r3 = r13.r
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e9
        L_0x00d7:
            int r3 = r13.u
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.v
            goto L_0x00e9
        L_0x00de:
            int r3 = r13.s
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r3 = r13.x
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.y
        L_0x00e9:
            r3 = r20
            goto L_0x00ef
        L_0x00ec:
            r25 = r9
            goto L_0x00e9
        L_0x00ef:
            if (r3 == r13) goto L_0x00f5
            tj3[] r3 = r3.m0
            r3[r2] = r13
        L_0x00f5:
            int r3 = r6 + 1
            r3 = r4[r3]
            aj3 r3 = r3.f
            if (r3 == 0) goto L_0x010b
            tj3 r3 = r3.d
            aj3[] r4 = r3.Q
            r4 = r4[r6]
            aj3 r4 = r4.f
            if (r4 == 0) goto L_0x010b
            tj3 r4 = r4.d
            if (r4 == r13) goto L_0x010d
        L_0x010b:
            r3 = r17
        L_0x010d:
            if (r3 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r3 = r13
            r18 = 1
        L_0x0113:
            r20 = r13
            r9 = r25
            r4 = 1
            r7 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x011f:
            r25 = r9
            tj3 r3 = r1.b
            if (r3 == 0) goto L_0x012c
            aj3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x012c:
            tj3 r3 = r1.d
            if (r3 == 0) goto L_0x0139
            int r6 = r6 + 1
            aj3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x0139:
            r1.c = r13
            if (r2 != 0) goto L_0x0144
            boolean r2 = r1.m
            if (r2 == 0) goto L_0x0144
            r1.e = r13
            goto L_0x0146
        L_0x0144:
            r1.e = r8
        L_0x0146:
            boolean r2 = r1.o
            if (r2 == 0) goto L_0x0150
            boolean r2 = r1.n
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r1.p = r2
            r2 = 1
            goto L_0x0158
        L_0x0155:
            r25 = r9
            r2 = r4
        L_0x0158:
            r1.q = r2
            if (r11 == 0) goto L_0x016d
            boolean r2 = r11.contains(r8)
            if (r2 == 0) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x0707
        L_0x016d:
            tj3 r12 = r1.c
            tj3 r13 = r1.b
            tj3 r9 = r1.d
            tj3 r2 = r1.e
            float r3 = r1.k
            int[] r4 = r0.p0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0180
            r4 = 1
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            if (r39 != 0) goto L_0x01a0
            int r5 = r2.i0
            r6 = 1
            if (r5 != 0) goto L_0x018b
            r22 = 1
            goto L_0x018d
        L_0x018b:
            r22 = 0
        L_0x018d:
            if (r5 != r6) goto L_0x0192
            r18 = r6
            goto L_0x0194
        L_0x0192:
            r18 = 0
        L_0x0194:
            if (r5 != r7) goto L_0x0198
            r5 = r6
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r26 = r3
            r7 = r8
            r20 = r22
        L_0x019e:
            r6 = 0
            goto L_0x01bc
        L_0x01a0:
            r6 = 1
            int r5 = r2.j0
            if (r5 != 0) goto L_0x01a8
            r18 = r6
            goto L_0x01aa
        L_0x01a8:
            r18 = 0
        L_0x01aa:
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r5 != r7) goto L_0x01b3
            r5 = 1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            r26 = r3
            r7 = r8
            r20 = r18
            r18 = r6
            goto L_0x019e
        L_0x01bc:
            aj3[] r3 = r0.Q
            if (r6 != 0) goto L_0x029c
            aj3[] r11 = r7.Q
            r11 = r11[r16]
            if (r5 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cb
        L_0x01c9:
            r27 = 4
        L_0x01cb:
            int r28 = r11.e()
            r29 = r6
            int[] r6 = r7.p0
            r30 = r14
            r14 = r6[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01e4
            int[] r14 = r7.t
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01e4
            r14 = 1
            goto L_0x01e5
        L_0x01e4:
            r14 = 0
        L_0x01e5:
            aj3 r15 = r11.f
            if (r15 == 0) goto L_0x01f1
            if (r7 == r8) goto L_0x01f1
            int r15 = r15.e()
            int r28 = r15 + r28
        L_0x01f1:
            r15 = r28
            if (r5 == 0) goto L_0x01fe
            if (r7 == r8) goto L_0x01fe
            if (r7 == r13) goto L_0x01fe
            r28 = r2
            r27 = 8
            goto L_0x0200
        L_0x01fe:
            r28 = r2
        L_0x0200:
            aj3 r2 = r11.f
            if (r2 == 0) goto L_0x023e
            if (r7 != r13) goto L_0x0213
            r32 = r8
            sfe r8 = r11.i
            sfe r2 = r2.i
            r33 = r1
            r1 = 6
            r10.f(r8, r2, r15, r1)
            goto L_0x0220
        L_0x0213:
            r33 = r1
            r32 = r8
            sfe r1 = r11.i
            sfe r2 = r2.i
            r8 = 8
            r10.f(r1, r2, r15, r8)
        L_0x0220:
            if (r14 == 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r27 = 5
        L_0x0226:
            if (r7 != r13) goto L_0x0232
            if (r5 == 0) goto L_0x0232
            boolean[] r1 = r7.S
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0232
            r1 = 5
            goto L_0x0234
        L_0x0232:
            r1 = r27
        L_0x0234:
            sfe r2 = r11.i
            aj3 r8 = r11.f
            sfe r8 = r8.i
            r10.e(r2, r8, r15, r1)
            goto L_0x0242
        L_0x023e:
            r33 = r1
            r32 = r8
        L_0x0242:
            aj3[] r1 = r7.Q
            if (r4 == 0) goto L_0x026f
            int r2 = r7.g0
            r8 = 8
            if (r2 == r8) goto L_0x0261
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0261
            int r2 = r16 + 1
            r2 = r1[r2]
            sfe r2 = r2.i
            r6 = r1[r16]
            sfe r6 = r6.i
            r8 = 0
            r11 = 5
            r10.f(r2, r6, r8, r11)
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            r2 = r1[r16]
            sfe r2 = r2.i
            r3 = r3[r16]
            sfe r3 = r3.i
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x026f:
            int r2 = r16 + 1
            r1 = r1[r2]
            aj3 r1 = r1.f
            if (r1 == 0) goto L_0x0285
            tj3 r1 = r1.d
            aj3[] r2 = r1.Q
            r2 = r2[r16]
            aj3 r2 = r2.f
            if (r2 == 0) goto L_0x0285
            tj3 r2 = r2.d
            if (r2 == r7) goto L_0x0287
        L_0x0285:
            r1 = r17
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            r7 = r1
            r6 = r29
            goto L_0x028e
        L_0x028d:
            r6 = 1
        L_0x028e:
            r11 = r38
            r2 = r28
            r14 = r30
            r15 = r31
            r8 = r32
            r1 = r33
            goto L_0x01bc
        L_0x029c:
            r33 = r1
            r28 = r2
            r32 = r8
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x0303
            aj3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            aj3 r1 = r1.f
            if (r1 == 0) goto L_0x0303
            aj3[] r1 = r9.Q
            r1 = r1[r2]
            int[] r6 = r9.p0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02d9
            int[] r6 = r9.t
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            aj3 r6 = r1.f
            tj3 r7 = r6.d
            if (r7 != r0) goto L_0x02d9
            sfe r7 = r1.i
            sfe r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02ef
        L_0x02d9:
            r11 = 5
            if (r5 == 0) goto L_0x02ef
            aj3 r6 = r1.f
            tj3 r7 = r6.d
            if (r7 != r0) goto L_0x02ef
            sfe r7 = r1.i
            sfe r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02ef:
            sfe r6 = r1.i
            aj3[] r7 = r12.Q
            r2 = r7[r2]
            aj3 r2 = r2.f
            sfe r2 = r2.i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x0304
        L_0x0303:
            r11 = 5
        L_0x0304:
            if (r4 == 0) goto L_0x031b
            int r1 = r16 + 1
            r2 = r3[r1]
            sfe r2 = r2.i
            aj3[] r3 = r12.Q
            r1 = r3[r1]
            sfe r3 = r1.i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x031b:
            r1 = r33
            java.util.ArrayList r2 = r1.h
            if (r2 == 0) goto L_0x043a
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x043a
            boolean r6 = r1.n
            if (r6 == 0) goto L_0x0334
            boolean r6 = r1.p
            if (r6 != 0) goto L_0x0334
            int r6 = r1.j
            float r6 = (float) r6
            goto L_0x0336
        L_0x0334:
            r6 = r26
        L_0x0336:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x043a
            java.lang.Object r15 = r2.get(r8)
            tj3 r15 = (defpackage.tj3) r15
            float[] r4 = r15.k0
            r4 = r4[r39]
            r21 = 0
            int r24 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            aj3[] r11 = r15.Q
            if (r24 >= 0) goto L_0x036b
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0364
            int r0 = r16 + 1
            r0 = r11[r0]
            sfe r0 = r0.i
            r4 = r11[r16]
            sfe r4 = r4.i
            r11 = 0
            r15 = 4
            r10.e(r0, r4, r11, r15)
            r24 = r15
            goto L_0x0382
        L_0x0364:
            r24 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0368:
            r21 = 0
            goto L_0x036e
        L_0x036b:
            r24 = 4
            goto L_0x0368
        L_0x036e:
            int r26 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x038c
            int r0 = r16 + 1
            r0 = r11[r0]
            sfe r0 = r0.i
            r4 = r11[r16]
            sfe r4 = r4.i
            r11 = 0
            r15 = 8
            r10.e(r0, r4, r11, r15)
        L_0x0382:
            r29 = r2
            r27 = r3
            r19 = r11
            r21 = 0
            goto L_0x042e
        L_0x038c:
            r19 = 0
            if (r14 == 0) goto L_0x0420
            aj3[] r14 = r14.Q
            r0 = r14[r16]
            sfe r0 = r0.i
            int r27 = r16 + 1
            r14 = r14[r27]
            sfe r14 = r14.i
            r29 = r2
            r2 = r11[r16]
            sfe r2 = r2.i
            r11 = r11[r27]
            sfe r11 = r11.i
            r27 = r3
            vs r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.b = r15
            int r21 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r21 == 0) goto L_0x03bb
            int r21 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r21 != 0) goto L_0x03c3
        L_0x03bb:
            r26 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            goto L_0x0408
        L_0x03c3:
            r21 = 0
            int r34 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r34 != 0) goto L_0x03d8
            ls r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.j(r0, r7)
            ls r0 = r3.d
            r0.j(r14, r15)
        L_0x03d5:
            r26 = r4
            goto L_0x041c
        L_0x03d8:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03e9
            ls r0 = r3.d
            r0.j(r2, r15)
            ls r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r11, r2)
            goto L_0x03d5
        L_0x03e9:
            float r7 = r7 / r6
            float r26 = r4 / r6
            float r7 = r7 / r26
            r26 = r4
            ls r4 = r3.d
            r4.j(r0, r15)
            ls r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r14, r4)
            ls r0 = r3.d
            r0.j(r11, r7)
            ls r0 = r3.d
            float r4 = -r7
            r0.j(r2, r4)
            goto L_0x041c
        L_0x0408:
            ls r7 = r3.d
            r7.j(r0, r15)
            ls r0 = r3.d
            r0.j(r14, r4)
            ls r0 = r3.d
            r0.j(r11, r15)
            ls r0 = r3.d
            r0.j(r2, r4)
        L_0x041c:
            r10.c(r3)
            goto L_0x042a
        L_0x0420:
            r29 = r2
            r27 = r3
            r26 = r4
            r33 = r15
            r21 = 0
        L_0x042a:
            r7 = r26
            r14 = r33
        L_0x042e:
            int r8 = r8 + 1
            r3 = r27
            r2 = r29
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x033a
        L_0x043a:
            r19 = 0
            r24 = 4
            if (r13 == 0) goto L_0x0447
            if (r13 == r9) goto L_0x0444
            if (r5 == 0) goto L_0x0447
        L_0x0444:
            r0 = r32
            goto L_0x044f
        L_0x0447:
            r14 = r9
            r15 = r25
            r0 = r32
            r11 = 2
            goto L_0x04a8
        L_0x044f:
            aj3[] r0 = r0.Q
            r0 = r0[r16]
            aj3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            aj3 r0 = r0.f
            if (r0 == 0) goto L_0x0461
            sfe r0 = r0.i
            r3 = r0
            goto L_0x0463
        L_0x0461:
            r3 = r17
        L_0x0463:
            aj3 r0 = r1.f
            if (r0 == 0) goto L_0x046b
            sfe r0 = r0.i
            r6 = r0
            goto L_0x046d
        L_0x046b:
            r6 = r17
        L_0x046d:
            aj3[] r0 = r13.Q
            r0 = r0[r16]
            if (r9 == 0) goto L_0x0477
            aj3[] r1 = r9.Q
            r1 = r1[r2]
        L_0x0477:
            if (r3 == 0) goto L_0x04a0
            if (r6 == 0) goto L_0x04a0
            if (r39 != 0) goto L_0x0483
            r2 = r28
            float r2 = r2.d0
        L_0x0481:
            r5 = r2
            goto L_0x0488
        L_0x0483:
            r2 = r28
            float r2 = r2.e0
            goto L_0x0481
        L_0x0488:
            int r4 = r0.e()
            int r8 = r1.e()
            sfe r2 = r0.i
            sfe r7 = r1.i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r25
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04a4
        L_0x04a0:
            r14 = r9
            r15 = r25
            r11 = 2
        L_0x04a4:
            r23 = r15
            goto L_0x06ad
        L_0x04a8:
            if (r20 == 0) goto L_0x058d
            if (r13 == 0) goto L_0x058d
            int r2 = r1.j
            if (r2 <= 0) goto L_0x04b7
            int r1 = r1.i
            if (r1 != r2) goto L_0x04b7
            r22 = 1
            goto L_0x04b9
        L_0x04b7:
            r22 = r19
        L_0x04b9:
            r8 = r13
            r9 = r8
        L_0x04bb:
            if (r9 == 0) goto L_0x04a4
            tj3[] r1 = r9.m0
            r1 = r1[r39]
            r7 = r1
        L_0x04c2:
            if (r7 == 0) goto L_0x04cf
            int r1 = r7.g0
            r6 = 8
            if (r1 != r6) goto L_0x04d1
            tj3[] r1 = r7.m0
            r7 = r1[r39]
            goto L_0x04c2
        L_0x04cf:
            r6 = 8
        L_0x04d1:
            if (r7 != 0) goto L_0x04dd
            if (r9 != r14) goto L_0x04d6
            goto L_0x04dd
        L_0x04d6:
            r21 = r7
            r23 = r8
            r11 = r9
            goto L_0x057e
        L_0x04dd:
            aj3[] r1 = r9.Q
            r2 = r1[r16]
            sfe r3 = r2.i
            aj3 r4 = r2.f
            if (r4 == 0) goto L_0x04ea
            sfe r4 = r4.i
            goto L_0x04ec
        L_0x04ea:
            r4 = r17
        L_0x04ec:
            if (r8 == r9) goto L_0x04f7
            aj3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            sfe r4 = r4.i
            goto L_0x0506
        L_0x04f7:
            if (r9 != r13) goto L_0x0506
            aj3[] r4 = r0.Q
            r4 = r4[r16]
            aj3 r4 = r4.f
            if (r4 == 0) goto L_0x0504
            sfe r4 = r4.i
            goto L_0x0506
        L_0x0504:
            r4 = r17
        L_0x0506:
            int r2 = r2.e()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.e()
            if (r7 == 0) goto L_0x051b
            aj3[] r6 = r7.Q
            r6 = r6[r16]
            sfe r11 = r6.i
            goto L_0x0528
        L_0x051b:
            aj3[] r6 = r12.Q
            r6 = r6[r5]
            aj3 r6 = r6.f
            if (r6 == 0) goto L_0x0526
            sfe r11 = r6.i
            goto L_0x0528
        L_0x0526:
            r11 = r17
        L_0x0528:
            r1 = r1[r5]
            sfe r1 = r1.i
            if (r6 == 0) goto L_0x0534
            int r6 = r6.e()
            int r21 = r6 + r21
        L_0x0534:
            aj3[] r6 = r8.Q
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            if (r11 == 0) goto L_0x04d6
            if (r1 == 0) goto L_0x04d6
            if (r9 != r13) goto L_0x0550
            aj3[] r2 = r13.Q
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0550:
            if (r9 != r14) goto L_0x055c
            aj3[] r2 = r14.Q
            r2 = r2[r5]
            int r2 = r2.e()
            r21 = r2
        L_0x055c:
            if (r22 == 0) goto L_0x0561
            r24 = 8
            goto L_0x0563
        L_0x0561:
            r24 = 5
        L_0x0563:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r11
            r11 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x057e:
            int r1 = r11.g0
            r9 = 8
            if (r1 == r9) goto L_0x0586
            r8 = r11
            goto L_0x0588
        L_0x0586:
            r8 = r23
        L_0x0588:
            r9 = r21
            r11 = 2
            goto L_0x04bb
        L_0x058d:
            r9 = 8
            if (r18 == 0) goto L_0x04a4
            if (r13 == 0) goto L_0x04a4
            int r2 = r1.j
            if (r2 <= 0) goto L_0x059e
            int r1 = r1.i
            if (r1 != r2) goto L_0x059e
            r22 = 1
            goto L_0x05a0
        L_0x059e:
            r22 = r19
        L_0x05a0:
            r8 = r13
            r11 = r8
        L_0x05a2:
            if (r11 == 0) goto L_0x0659
            tj3[] r1 = r11.m0
            r1 = r1[r39]
        L_0x05a8:
            if (r1 == 0) goto L_0x05b3
            int r2 = r1.g0
            if (r2 != r9) goto L_0x05b3
            tj3[] r1 = r1.m0
            r1 = r1[r39]
            goto L_0x05a8
        L_0x05b3:
            if (r11 == r13) goto L_0x0646
            if (r11 == r14) goto L_0x0646
            if (r1 == 0) goto L_0x0646
            if (r1 != r14) goto L_0x05be
            r7 = r17
            goto L_0x05bf
        L_0x05be:
            r7 = r1
        L_0x05bf:
            aj3[] r1 = r11.Q
            r2 = r1[r16]
            sfe r3 = r2.i
            aj3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            sfe r4 = r4.i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05eb
            aj3[] r1 = r7.Q
            r1 = r1[r16]
            sfe r9 = r1.i
            r21 = r7
            aj3 r7 = r1.f
            if (r7 == 0) goto L_0x05e8
            sfe r7 = r7.i
            goto L_0x0601
        L_0x05e8:
            r7 = r17
            goto L_0x0601
        L_0x05eb:
            r21 = r7
            aj3[] r7 = r14.Q
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05f6
            sfe r9 = r7.i
            goto L_0x05f8
        L_0x05f6:
            r9 = r17
        L_0x05f8:
            r1 = r1[r5]
            sfe r1 = r1.i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x0601:
            if (r1 == 0) goto L_0x060b
            int r1 = r1.e()
            int r1 = r1 + r6
            r23 = r1
            goto L_0x060d
        L_0x060b:
            r23 = r6
        L_0x060d:
            aj3[] r1 = r8.Q
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r22 == 0) goto L_0x061c
            r25 = 8
            goto L_0x061e
        L_0x061c:
            r25 = r24
        L_0x061e:
            if (r3 == 0) goto L_0x063d
            if (r4 == 0) goto L_0x063d
            if (r9 == 0) goto L_0x063d
            if (r7 == 0) goto L_0x063d
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r15
            r15 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0643
        L_0x063d:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x0643:
            r1 = r21
            goto L_0x064b
        L_0x0646:
            r26 = r8
            r23 = r15
            r15 = r9
        L_0x064b:
            int r2 = r11.g0
            if (r2 == r15) goto L_0x0651
            r8 = r11
            goto L_0x0653
        L_0x0651:
            r8 = r26
        L_0x0653:
            r11 = r1
            r9 = r15
            r15 = r23
            goto L_0x05a2
        L_0x0659:
            r23 = r15
            aj3[] r1 = r13.Q
            r1 = r1[r16]
            aj3[] r0 = r0.Q
            r0 = r0[r16]
            aj3 r0 = r0.f
            aj3[] r2 = r14.Q
            int r3 = r16 + 1
            r11 = r2[r3]
            aj3[] r2 = r12.Q
            r2 = r2[r3]
            aj3 r15 = r2.f
            r9 = 5
            if (r0 == 0) goto L_0x0681
            if (r13 == r14) goto L_0x0683
            sfe r2 = r1.i
            sfe r0 = r0.i
            int r1 = r1.e()
            r10.e(r2, r0, r1, r9)
        L_0x0681:
            r0 = r9
            goto L_0x069d
        L_0x0683:
            if (r15 == 0) goto L_0x0681
            sfe r2 = r1.i
            sfe r3 = r0.i
            int r4 = r1.e()
            sfe r6 = r11.i
            sfe r7 = r15.i
            int r8 = r11.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r0 = r9
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x069d:
            if (r15 == 0) goto L_0x06ad
            if (r13 == r14) goto L_0x06ad
            sfe r1 = r11.i
            sfe r2 = r15.i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r0)
        L_0x06ad:
            if (r20 != 0) goto L_0x06b1
            if (r18 == 0) goto L_0x0707
        L_0x06b1:
            if (r13 == 0) goto L_0x0707
            if (r13 == r14) goto L_0x0707
            aj3[] r0 = r13.Q
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06bd
            r9 = r13
            goto L_0x06be
        L_0x06bd:
            r9 = r14
        L_0x06be:
            int r2 = r16 + 1
            aj3[] r3 = r9.Q
            r4 = r3[r2]
            aj3 r5 = r1.f
            if (r5 == 0) goto L_0x06cb
            sfe r5 = r5.i
            goto L_0x06cd
        L_0x06cb:
            r5 = r17
        L_0x06cd:
            aj3 r6 = r4.f
            if (r6 == 0) goto L_0x06d4
            sfe r6 = r6.i
            goto L_0x06d6
        L_0x06d4:
            r6 = r17
        L_0x06d6:
            if (r12 == r9) goto L_0x06e6
            aj3[] r6 = r12.Q
            r6 = r6[r2]
            aj3 r6 = r6.f
            if (r6 == 0) goto L_0x06e4
            sfe r6 = r6.i
            r17 = r6
        L_0x06e4:
            r6 = r17
        L_0x06e6:
            if (r13 != r9) goto L_0x06ea
            r4 = r0[r2]
        L_0x06ea:
            if (r5 == 0) goto L_0x0707
            if (r6 == 0) goto L_0x0707
            int r0 = r1.e()
            r2 = r3[r2]
            int r8 = r2.e()
            sfe r2 = r1.i
            sfe r7 = r4.i
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0707:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0714:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.d(uj3, gw7, java.util.ArrayList, int):void");
    }

    public static final void d0(fwf fwf) {
        fwf.c(oa4.class, new qid(18));
    }

    public static final Object e(ma3 ma3, Continuation continuation) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        ma3.j(new abd(lw1, 0));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    public static final void e0(fwf fwf) {
        fwf.c(oa4.class, new qid(23));
    }

    public static final Object f(lbe lbe, Continuation continuation) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        lbe.l(new abd(lw1, 1));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }

    public static int f0(byte[] bArr, int i2, gv1 gv1) {
        int l0 = l0(bArr, i2, gv1);
        int i3 = gv1.a;
        if (i3 < 0) {
            throw zzdn.b();
        } else if (i3 > bArr.length - l0) {
            throw zzdn.d();
        } else if (i3 == 0) {
            gv1.c = fzg.c;
            return l0;
        } else {
            gv1.c = fzg.g(l0, bArr, i3);
            return l0 + i3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ce, cla, java.lang.Object] */
    public static final Object g(jha jha, Continuation continuation) {
        ts9 ts9 = ts9.FIRST;
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        ts9 ts92 = ts9.FIRST;
        ? obj = new Object();
        obj.o = lw1;
        obj.v = ts92;
        obj.w = null;
        jha.a(obj);
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return t;
    }

    public static int g0(int i2, byte[] bArr) {
        byte b2 = bArr[i2] & UByte.MAX_VALUE;
        byte b3 = bArr[i2 + 1] & UByte.MAX_VALUE;
        byte b4 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (b3 << 8) | b2 | (b4 << 16);
    }

    public static final Object h(nh8 nh8, ContinuationImpl continuationImpl) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuationImpl));
        lw1.u();
        nh8.a(new abd(lw1, 2));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return t;
    }

    public static int h0(l2h l2h, byte[] bArr, int i2, int i3, int i4, gv1 gv1) {
        p0h a2 = l2h.a();
        int p0 = p0(a2, l2h, bArr, i2, i3, i4, gv1);
        l2h.b(a2);
        gv1.c = a2;
        return p0;
    }

    public static final bs5 i(bs5 bs5, int i2, cu0 cu0) {
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(wj6.h(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        } else if (i2 != -1 || cu0 == cu0.a) {
            if (i2 == -1) {
                cu0 = cu0.b;
                i2 = 0;
            }
            int i3 = i2;
            cu0 cu02 = cu0;
            return bs5 instanceof lj6 ? m5a.x((lj6) bs5, (CoroutineContext) null, i3, cu02, 1) : new n12(i3, 2, cu02, bs5, (CoroutineContext) null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static int i0(l2h l2h, int i2, byte[] bArr, int i3, int i4, x0h x0h, gv1 gv1) {
        p0h a2 = l2h.a();
        int q0 = q0(a2, l2h, bArr, i3, i4, gv1);
        l2h.b(a2);
        gv1.c = a2;
        x0h.add(a2);
        while (q0 < i4) {
            int l0 = l0(bArr, q0, gv1);
            if (i2 != gv1.a) {
                break;
            }
            p0h a3 = l2h.a();
            int q02 = q0(a3, l2h, bArr, l0, i4, gv1);
            l2h.b(a3);
            gv1.c = a3;
            x0h.add(a3);
            q0 = q02;
        }
        return q0;
    }

    public static /* synthetic */ bs5 j(bs5 bs5, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        return i(bs5, i2, cu0.a);
    }

    public static int j0(byte[] bArr, int i2, x0h x0h, gv1 gv1) {
        r0h r0h = (r0h) x0h;
        int l0 = l0(bArr, i2, gv1);
        int i3 = gv1.a + l0;
        while (l0 < i3) {
            l0 = l0(bArr, l0, gv1);
            r0h.e(gv1.a);
        }
        if (l0 == i3) {
            return l0;
        }
        throw zzdn.d();
    }

    public static final co1 k(Function2 function2) {
        return new co1(function2, EmptyCoroutineContext.INSTANCE, -2, cu0.a);
    }

    public static int k0(int i2, byte[] bArr, int i3, int i4, b3h b3h, gv1 gv1) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int o0 = o0(bArr, i3, gv1);
                b3h.c(i2, Long.valueOf(gv1.b));
                return o0;
            } else if (i5 == 1) {
                b3h.c(i2, Long.valueOf(r0(i3, bArr)));
                return i3 + 8;
            } else if (i5 == 2) {
                int l0 = l0(bArr, i3, gv1);
                int i6 = gv1.a;
                if (i6 < 0) {
                    throw zzdn.b();
                } else if (i6 <= bArr.length - l0) {
                    if (i6 == 0) {
                        b3h.c(i2, fzg.c);
                    } else {
                        b3h.c(i2, fzg.g(l0, bArr, i6));
                    }
                    return l0 + i6;
                } else {
                    throw zzdn.d();
                }
            } else if (i5 == 3) {
                int i7 = (i2 & -8) | 4;
                b3h b2 = b3h.b();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int l02 = l0(bArr, i3, gv1);
                    int i9 = gv1.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = l02;
                        break;
                    }
                    int k0 = k0(i8, bArr, l02, i4, b2, gv1);
                    i8 = i9;
                    i3 = k0;
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzdn.c();
                }
                b3h.c(i2, b2);
                return i3;
            } else if (i5 == 5) {
                b3h.c(i2, Integer.valueOf(g0(i3, bArr)));
                return i3 + 4;
            } else {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(defpackage.bs5 r4, defpackage.ds5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.zt5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            zt5 r0 = (defpackage.zt5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            zt5 r0 = new zt5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x004e
        L_0x002b:
            r5 = move-exception
            r1 = r5
            goto L_0x0053
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            bu5 r2 = new bu5     // Catch:{ all -> 0x0050 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0050 }
            r0.a = r6     // Catch:{ all -> 0x0050 }
            r0.c = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r4.e(r2, r0)     // Catch:{ all -> 0x0050 }
            if (r4 != r1) goto L_0x004e
            goto L_0x0084
        L_0x004e:
            r1 = 0
            goto L_0x0084
        L_0x0050:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L_0x0053:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L_0x005f
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
            if (r5 != 0) goto L_0x0081
        L_0x005f:
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            om7 r6 = defpackage.om7.a
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
            pm7 r5 = (defpackage.pm7) r5
            if (r5 == 0) goto L_0x0082
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            java.util.concurrent.CancellationException r5 = r5.n()
            if (r5 == 0) goto L_0x0082
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            if (r5 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            if (r4 != 0) goto L_0x0085
        L_0x0084:
            return r1
        L_0x0085:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x008d
            kotlin.ExceptionsKt.addSuppressed(r4, r1)
            throw r4
        L_0x008d:
            kotlin.ExceptionsKt.addSuppressed(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.l(bs5, ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static int l0(byte[] bArr, int i2, gv1 gv1) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return m0(b2, bArr, i3, gv1);
        }
        gv1.a = b2;
        return i3;
    }

    public static void m(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static int m0(int i2, byte[] bArr, int i3, gv1 gv1) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            gv1.a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            gv1.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & ByteCompanionObject.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            gv1.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            gv1.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                gv1.a = i12;
                return i13;
            }
        }
    }

    public static void n(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int n0(int i2, byte[] bArr, int i3, int i4, x0h x0h, gv1 gv1) {
        r0h r0h = (r0h) x0h;
        int l0 = l0(bArr, i3, gv1);
        r0h.e(gv1.a);
        while (l0 < i4) {
            int l02 = l0(bArr, l0, gv1);
            if (i2 != gv1.a) {
                break;
            }
            l0 = l0(bArr, l02, gv1);
            r0h.e(gv1.a);
        }
        return l0;
    }

    public static void o(int i2, String str, int i3, int i4) {
        if (i2 < i3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i3 + ", " + i4 + "] (too low)");
        } else if (i2 > i4) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i3 + ", " + i4 + "] (too high)");
        }
    }

    public static int o0(byte[] bArr, int i2, gv1 gv1) {
        long j2 = (long) bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            gv1.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & ByteCompanionObject.MAX_VALUE)) << i5;
            int i7 = i6;
            b2 = b3;
            i4 = i7;
        }
        gv1.b = j3;
        return i4;
    }

    public static void p(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int p0(Object obj, l2h l2h, byte[] bArr, int i2, int i3, int i4, gv1 gv1) {
        int t = ((b2h) l2h).t(obj, bArr, i2, i3, i4, gv1);
        gv1.c = obj;
        return t;
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int q0(java.lang.Object r6, defpackage.l2h r7, byte[] r8, int r9, int r10, defpackage.gv1 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m0(r9, r8, r0, r11)
            int r9 = r11.a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.d(r1, r2, r3, r4, r5)
            r11.c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.play_billing.zzdn r6 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.q0(java.lang.Object, l2h, byte[], int, int, gv1):int");
    }

    public static void r(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static long r0(int i2, byte[] bArr) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public static final Object s(bs5 bs5, Continuation continuation) {
        Object e2 = bs5.e(laa.a, continuation);
        return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
    }

    public static final Object t(bs5 bs5, Function2 function2, Continuation continuation) {
        Object s = s(j(L(bs5, function2), 0, 2), continuation);
        return s == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? s : Unit.INSTANCE;
    }

    public static final wb u(bs5 bs5, bs5 bs52, bs5 bs53, Function4 function4) {
        return new wb(17, new bs5[]{bs5, bs52, bs53}, function4);
    }

    public static final bs5 v(bs5 bs5, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 >= 0) {
            return i2 == 0 ? bs5 : new fs5(0, new pt5(new hg2(j2, 1), bs5, (Continuation) null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2.c == r0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.bs5 w(defpackage.bs5 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ome
            if (r0 == 0) goto L_0x0005
            goto L_0x0021
        L_0x0005:
            ui0 r0 = defpackage.n79.f
            of3 r1 = defpackage.n79.e
            boolean r2 = r4 instanceof defpackage.wq4
            if (r2 == 0) goto L_0x0019
            r2 = r4
            wq4 r2 = (defpackage.wq4) r2
            kotlin.jvm.functions.Function1 r3 = r2.b
            if (r3 != r1) goto L_0x0019
            kotlin.jvm.functions.Function2 r1 = r2.c
            if (r1 != r0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            wq4 r1 = new wq4
            r1.<init>(r4, r0)
            r4 = r1
        L_0x001f:
            wq4 r4 = (defpackage.wq4) r4
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.w(bs5):bs5");
    }

    public static final Object x(bs5 bs5, ds5 ds5, Continuation continuation) {
        if (!(ds5 instanceof xif)) {
            Object e2 = bs5.e(ds5, continuation);
            return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
        }
        throw ((xif) ds5).a;
    }

    public static final void y() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new AndroidRuntimeException("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object z(defpackage.bs5 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.zu5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            zu5 r0 = (defpackage.zu5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            zu5 r0 = new zu5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            bpa r3 = defpackage.q8.e
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            wu5 r6 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0060
        L_0x002f:
            r7 = move-exception
            goto L_0x005c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r3
            wu5 r2 = new wu5
            r5 = 0
            r2.<init>(r7, r5)
            r0.a = r7     // Catch:{ AbortFlowException -> 0x0058 }
            r0.b = r2     // Catch:{ AbortFlowException -> 0x0058 }
            r0.o = r4     // Catch:{ AbortFlowException -> 0x0058 }
            java.lang.Object r6 = r6.e(r2, r0)     // Catch:{ AbortFlowException -> 0x0058 }
            if (r6 != r1) goto L_0x0056
            goto L_0x0064
        L_0x0056:
            r0 = r7
            goto L_0x0060
        L_0x0058:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L_0x005c:
            java.lang.Object r1 = r7.a
            if (r1 != r6) goto L_0x006d
        L_0x0060:
            T r1 = r0.element
            if (r1 == r3) goto L_0x0065
        L_0x0064:
            return r1
        L_0x0065:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L_0x006d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.z(bs5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
