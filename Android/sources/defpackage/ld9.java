package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.util.TypedValue;
import android.view.View;
import androidx.camera.core.ImageProcessingUtil;
import androidx.recyclerview.widget.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.json.HTTP;

/* renamed from: ld9  reason: default package */
public abstract class ld9 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final bpa d = new bpa(10, "COMPLETING_ALREADY");
    public static final bpa e = new bpa(10, "COMPLETING_WAITING_CHILDREN");
    public static final bpa f = new bpa(10, "COMPLETING_RETRY");
    public static final bpa g = new bpa(10, "TOO_LATE_TO_CANCEL");
    public static final bpa h = new bpa(10, "SEALED");
    public static final m45 i = new m45(false);
    public static final m45 j = new m45(true);
    public static final bpa k = new bpa(10, "STATE_REG");
    public static final bpa l = new bpa(10, "STATE_COMPLETED");
    public static final bpa m = new bpa(10, "STATE_CANCELLED");
    public static final bpa n = new bpa(10, "NO_RESULT");
    public static final bpa o = new bpa(10, "PARAM_CLAUSE_0");
    public static lnb p = null;
    public static volatile boolean q = false;

    public static int A(View view, int i2) {
        Context context = view.getContext();
        TypedValue V = b59.V(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = V.resourceId;
        return i3 != 0 ? fw3.a(context, i3) : V.data;
    }

    public static ba7 B() {
        return ea7.g().f();
    }

    public static float C(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i2 = 32767;
        if (z2) {
            if (z) {
                return (float) byteBuffer.getShort();
            }
            float f2 = byteBuffer.getFloat();
            if (f2 < c44.DEFAULT_ASPECT_RATIO) {
                i2 = 32768;
            }
            return v0g.i(f2 * ((float) i2), -32768.0f, 32767.0f);
        } else if (!z) {
            return byteBuffer.getFloat();
        } else {
            short s = byteBuffer.getShort();
            float f3 = (float) s;
            if (s < 0) {
                i2 = 32768;
            }
            return f3 / ((float) i2);
        }
    }

    public static Rational D(int i2, Rational rational) {
        return (i2 == 90 || i2 == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static int E(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean F(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static boolean G(int i2) {
        return i2 != 0 && w53.d(i2) > 0.5d;
    }

    public static boolean H(int i2) {
        return i2 == 256 || i2 == 4101;
    }

    public static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static int K(int i2, float f2, int i3) {
        return w53.f(w53.h(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static final void L(Context context) {
        String str;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            h88.x().p(tog.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(sl.a.a(context), "androidx.work.workdb");
            String[] strArr = tog.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
            for (String str2 : strArr) {
                Pair pair = TuplesKt.to(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry entry : MapsKt.plus(linkedHashMap, TuplesKt.to(databasePath, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        h88.x().Z(tog.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    h88.x().p(tog.a, str);
                }
            }
        }
    }

    public static void M(ByteBuffer byteBuffer, j60 j60, ByteBuffer byteBuffer2, j60 j602, b22 b22, int i2, boolean z, boolean z2) {
        boolean z3;
        j60 j603;
        ByteBuffer byteBuffer3 = byteBuffer2;
        b22 b222 = b22;
        boolean z4 = true;
        if (j60.c == 2) {
            j603 = j602;
            z3 = true;
        } else {
            j603 = j602;
            z3 = false;
        }
        if (j603.c != 2) {
            z4 = false;
        }
        int i3 = b222.a;
        float[] fArr = new float[i3];
        int i4 = b222.b;
        float[] fArr2 = new float[i4];
        int i5 = i2;
        for (int i6 = 0; i6 < i5; i6++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i7 = 0; i7 < i4; i7++) {
                    fArr2[i7] = C(byteBuffer3, z4, z4);
                }
                byteBuffer3.position(position);
            }
            for (int i8 = 0; i8 < i3; i8++) {
                fArr[i8] = C(byteBuffer, z3, z4);
            }
            ByteBuffer byteBuffer4 = byteBuffer;
            for (int i9 = 0; i9 < i4; i9++) {
                for (int i10 = 0; i10 < i3; i10++) {
                    fArr2[i9] = (b222.c[(i10 * i4) + i9] * fArr[i10]) + fArr2[i9];
                }
                if (z4) {
                    byteBuffer3.putShort((short) ((int) v0g.i(fArr2[i9], -32768.0f, 32767.0f)));
                } else {
                    byteBuffer3.putFloat(z2 ? v0g.i(fArr2[i9], -1.0f, 1.0f) : fArr2[i9]);
                }
                fArr2[i9] = 0.0f;
            }
        }
    }

    public static void N(vye vye, int i2, pk3 pk3) {
        long k2 = vye.k(i2);
        List p2 = vye.p(k2);
        if (!p2.isEmpty()) {
            if (i2 != vye.t() - 1) {
                long k3 = vye.k(i2 + 1) - vye.k(i2);
                if (k3 > 0) {
                    pk3.accept(new q44(k2, k3, p2));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static z9c O(byte[] bArr) {
        int x;
        g1g g1g = new g1g(bArr);
        if (g1g.c < 32) {
            return null;
        }
        g1g.H(0);
        if (g1g.h() != g1g.c() + 4 || g1g.h() != 1886614376 || (x = ty.x(g1g.h())) > 1) {
            return null;
        }
        UUID uuid = new UUID(g1g.p(), g1g.p());
        if (x == 1) {
            g1g.I(g1g.y() * 16);
        }
        int y = g1g.y();
        if (y != g1g.c()) {
            return null;
        }
        byte[] bArr2 = new byte[y];
        g1g.g(0, bArr2, y);
        return new z9c(uuid, x, bArr2);
    }

    public static byte[] P(UUID uuid, byte[] bArr) {
        z9c O = O(bArr);
        if (O == null) {
            return null;
        }
        UUID uuid2 = O.a;
        if (uuid.equals(uuid2)) {
            return O.c;
        }
        String valueOf = String.valueOf(uuid);
        new StringBuilder(String.valueOf(uuid2).length() + valueOf.length() + 33);
        return null;
    }

    public static String Q(String str, List list, yoc yoc, voc voc) {
        String[] split = str.split(HTTP.CRLF);
        int i2 = 0;
        while (true) {
            if (i2 >= split.length) {
                i2 = -1;
                break;
            } else if (split[i2].startsWith("m=audio")) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            b(yoc, voc, "failed to find m=audio line in sdp");
            return str;
        }
        gug a2 = gug.a(i2, split[i2]);
        if (a2 == null) {
            b(yoc, voc, "failed to parse m=audio line");
            return str;
        }
        int i3 = i2 + 1;
        while (i3 < split.length && !split[i3].startsWith("m=audio")) {
            a2.e(i3, split[i3]);
            i3++;
        }
        if (!a2.d(list)) {
            b(yoc, voc, "failed to find any desired codecs");
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i4 = 0; i4 < split.length; i4++) {
            int i5 = a2.c;
            if (i4 == i5) {
                a2.f(sb, list, false);
            } else if (i4 != i5 && !a2.a.contains(Integer.valueOf(i4))) {
                sb.append(split[i4]);
                sb.append(HTTP.CRLF);
            } else if (!z) {
                a2.c(sb, list, false);
                z = true;
            }
        }
        return sb.toString();
    }

    public static void R(Widget widget) {
        KProperty[] kPropertyArr = BottomSheetWidget.v0;
        e9d e9d = null;
        ng3 a2 = b0h.a(new igf(nlc.oneme_login_sms_count_exceeded_title), (Bundle) null, 6);
        a2.f(new igf(nlc.oneme_login_sms_count_exceeded_description));
        a2.d(xgc.oneme_login_sms_code_exceeded_ok_btn, new igf(qad.E3));
        ConfirmationBottomSheet e2 = a2.e();
        e2.setTargetController(widget);
        zx3 zx3 = widget;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        e2.p0(widget);
        if (e9d != null) {
            i9d i9d = new i9d(e2, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[LOOP:0: B:21:0x0054->B:23:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void S(defpackage.vye r13, defpackage.hze r14, defpackage.pk3 r15) {
        /*
            long r0 = r14.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L_0x000e
            r4 = r5
            goto L_0x0027
        L_0x000e:
            int r4 = r13.d(r0)
            r6 = -1
            if (r4 != r6) goto L_0x0019
            int r4 = r13.t()
        L_0x0019:
            if (r4 <= 0) goto L_0x0027
            int r6 = r4 + -1
            long r6 = r13.k(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
            int r4 = r4 + -1
        L_0x0027:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            int r2 = r13.t()
            if (r4 >= r2) goto L_0x0052
            java.util.List r11 = r13.p(r0)
            long r2 = r13.k(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x0052
            long r7 = r14.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0052
            q44 r12 = new q44
            long r9 = r2 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = r5
        L_0x0053:
            r3 = r4
        L_0x0054:
            int r6 = r13.t()
            if (r3 >= r6) goto L_0x0060
            N(r13, r3, r15)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0060:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0068
            int r4 = r4 + -1
        L_0x0068:
            if (r5 >= r4) goto L_0x0070
            N(r13, r5, r15)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0070:
            if (r2 == 0) goto L_0x0089
            q44 r14 = new q44
            java.util.List r11 = r13.p(r0)
            long r7 = r13.k(r4)
            long r2 = r13.k(r4)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld9.S(vye, hze, pk3):void");
    }

    public static String T(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final Object U(Object obj) {
        oe7 oe7;
        pe7 pe7 = obj instanceof pe7 ? (pe7) obj : null;
        return (pe7 == null || (oe7 = pe7.a) == null) ? obj : oe7;
    }

    public static final void V(fwf fwf) {
        fwf.e(xgd.class, new jye(11));
        fwf.e(SystemServicesManager$PushTokenGeneratedListener.class, new jye(12));
        fwf.e(f8f.class, new jye(13));
        fwf.c(s98.class, new qid(27));
        fwf.e(g2g.class, new jye(14));
        fwf.e(udg.class, new jye(15));
        fwf.e(xq.class, new jye(16));
        fwf.e(fn4.class, new jye(17));
        fwf.e(hn4.class, new jye(18));
        fwf.e(ccb.class, new jye(19));
    }

    public static int W(int i2, Intent intent) {
        boolean z = (33554432 & i2) != 0;
        if (Build.VERSION.SDK_INT < 34) {
            return i2;
        }
        String str = intent.getPackage();
        return ((str == null || str.length() == 0 || intent.getComponent() == null) && z) ? i2 | 16777216 : i2;
    }

    public static byte[] X(ha7 ha7, Rect rect, int i2, int i3) {
        if (ha7.n0() == 35) {
            wie wie = ha7.w()[0];
            wie wie2 = ha7.w()[1];
            wie wie3 = ha7.w()[2];
            ByteBuffer d0 = wie.d0();
            ByteBuffer d02 = wie2.d0();
            ByteBuffer d03 = wie3.d0();
            d0.rewind();
            d02.rewind();
            d03.rewind();
            int remaining = d0.remaining();
            byte[] bArr = new byte[(((ha7.getHeight() * ha7.getWidth()) / 2) + remaining)];
            int i4 = 0;
            for (int i5 = 0; i5 < ha7.getHeight(); i5++) {
                d0.get(bArr, i4, ha7.getWidth());
                i4 += ha7.getWidth();
                d0.position(Math.min(remaining, wie.f0() + (d0.position() - ha7.getWidth())));
            }
            int height = ha7.getHeight() / 2;
            int width = ha7.getWidth() / 2;
            int f0 = wie3.f0();
            int f02 = wie2.f0();
            int e0 = wie3.e0();
            int e02 = wie2.e0();
            byte[] bArr2 = new byte[f0];
            byte[] bArr3 = new byte[f02];
            for (int i6 = 0; i6 < height; i6++) {
                d03.get(bArr2, 0, Math.min(f0, d03.remaining()));
                d02.get(bArr3, 0, Math.min(f02, d02.remaining()));
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < width; i9++) {
                    int i10 = i4 + 1;
                    bArr[i4] = bArr2[i7];
                    i4 += 2;
                    bArr[i10] = bArr3[i8];
                    i7 += e0;
                    i8 += e02;
                }
            }
            YuvImage yuvImage = new YuvImage(bArr, 17, ha7.getWidth(), ha7.getHeight(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            eb5[] eb5Arr = sa5.c;
            ra5 ra5 = new ra5(ByteOrder.BIG_ENDIAN);
            String valueOf = String.valueOf(1);
            ArrayList arrayList = ra5.a;
            ra5.c("Orientation", valueOf, arrayList);
            ra5.c("XResolution", "72/1", arrayList);
            ra5.c("YResolution", "72/1", arrayList);
            ra5.c("ResolutionUnit", String.valueOf(2), arrayList);
            ra5.c("YCbCrPositioning", String.valueOf(1), arrayList);
            ra5.c("Make", Build.MANUFACTURER, arrayList);
            ra5.c("Model", Build.MODEL, arrayList);
            if (ha7.getImageInfo() != null) {
                ha7.getImageInfo().b(ra5);
            }
            ra5.d(i3);
            ra5.c("ImageWidth", String.valueOf(ha7.getWidth()), arrayList);
            ra5.c("ImageLength", String.valueOf(ha7.getHeight()), arrayList);
            ArrayList list = Collections.list(new qa5(ra5));
            if (!((Map) list.get(1)).isEmpty()) {
                ra5.b("ExposureProgram", String.valueOf(0), list);
                ra5.b("ExifVersion", "0230", list);
                ra5.b("ComponentsConfiguration", "1,2,3,0", list);
                ra5.b("MeteringMode", String.valueOf(0), list);
                ra5.b("LightSource", String.valueOf(0), list);
                ra5.b("FlashpixVersion", "0100", list);
                ra5.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
                ra5.b("FileSource", String.valueOf(3), list);
                ra5.b("SceneType", String.valueOf(1), list);
                ra5.b("CustomRendered", String.valueOf(0), list);
                ra5.b("SceneCaptureType", String.valueOf(0), list);
                ra5.b("Contrast", String.valueOf(0), list);
                ra5.b("Saturation", String.valueOf(0), list);
                ra5.b("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                ra5.b("GPSVersionID", "2300", list);
                ra5.b("GPSSpeedRef", "K", list);
                ra5.b("GPSTrackRef", "T", list);
                ra5.b("GPSImgDirectionRef", "T", list);
                ra5.b("GPSDestBearingRef", "T", list);
                ra5.b("GPSDestDistanceRef", "K", list);
            }
            if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, ha7.getWidth(), ha7.getHeight()) : rect, i2, new db5(byteArrayOutputStream, new sa5(ra5.b, list)))) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new Exception("YuvImage failed to encode jpeg.");
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ha7.n0());
    }

    public static gug a(boolean z, String[] strArr, voc voc) {
        String str = z ? "m=audio " : "m=video ";
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                i2 = -1;
                break;
            } else if (strArr[i2].startsWith(str)) {
                break;
            } else {
                i2++;
            }
        }
        String str2 = "m=video";
        if (i2 == -1) {
            if (z) {
                str2 = "m=audio";
            }
            voc.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(str2));
            return null;
        }
        gug a2 = gug.a(i2, strArr[i2]);
        if (a2 == null) {
            if (z) {
                str2 = "m=audio";
            }
            voc.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(str2));
            return null;
        }
        while (true) {
            i2++;
            if (i2 >= strArr.length || strArr[i2].startsWith("m=")) {
                return a2;
            }
            a2.e(i2, strArr[i2]);
        }
        return a2;
    }

    public static void b(yoc yoc, voc voc, String str) {
        yoc.log(jme.callPreferH264Sdp, "fail", (String) null);
        voc.log("CodecPrefUtil", str);
    }

    public static final StackTraceElement c(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final void d(File file, List list) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write((String) it.next());
                outputStreamWriter.write(10);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, (Throwable) null);
        } catch (Throwable th) {
            CloseableKt.closeFinally(outputStreamWriter, th);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.yoc r25, defpackage.voc r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.String r5 = "\r\n"
            java.lang.String[] r6 = r0.split(r5)
            r7 = 0
            r8 = r7
        L_0x0012:
            int r9 = r6.length
            java.lang.String r10 = "m=audio"
            r11 = -1
            if (r8 >= r9) goto L_0x0024
            r9 = r6[r8]
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x0024:
            r8 = r11
        L_0x0025:
            if (r8 != r11) goto L_0x002d
            java.lang.String r1 = "failed to find m=audio line in sdp"
            b(r3, r4, r1)
            return r0
        L_0x002d:
            r9 = r6[r8]
            gug r9 = defpackage.gug.a(r8, r9)
            if (r9 != 0) goto L_0x003b
            java.lang.String r1 = "failed to parse m=audio line"
            b(r3, r4, r1)
            return r0
        L_0x003b:
            r11 = 1
            int r8 = r8 + r11
        L_0x003d:
            int r12 = r6.length
            if (r8 >= r12) goto L_0x0051
            r12 = r6[r8]
            boolean r12 = r12.startsWith(r10)
            if (r12 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            r12 = r6[r8]
            r9.e(r8, r12)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0051:
            java.lang.String r8 = "opus"
            java.util.ArrayList r10 = r9.b(r8)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x0064
            java.lang.String r1 = "failed to find desired codec"
            b(r3, r4, r1)
            return r0
        L_0x0064:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = r9.b(r8)
            java.util.Iterator r8 = r8.iterator()
            r12 = 0
            r13 = 0
        L_0x0073:
            boolean r14 = r8.hasNext()
            java.lang.String r15 = "a=fmtp:"
            if (r14 == 0) goto L_0x00a4
            java.lang.Object r12 = r8.next()
            dug r12 = (defpackage.dug) r12
            java.lang.String r14 = r12.a
            java.util.ArrayList r12 = r12.c
            java.util.Iterator r12 = r12.iterator()
        L_0x0089:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00a2
            java.lang.Object r16 = r12.next()
            r9 = r16
            java.lang.String r9 = (java.lang.String) r9
            r10.add(r9)
            boolean r16 = r9.startsWith(r15)
            if (r16 == 0) goto L_0x0089
            r13 = r9
            goto L_0x0089
        L_0x00a2:
            r12 = r14
            goto L_0x0073
        L_0x00a4:
            if (r12 != 0) goto L_0x00ac
            java.lang.String r1 = "failed to find desired lines"
            b(r3, r4, r1)
            return r0
        L_0x00ac:
            if (r13 == 0) goto L_0x0129
            boolean r8 = r13.startsWith(r15)
            if (r8 != 0) goto L_0x00b5
            goto L_0x00be
        L_0x00b5:
            r8 = 32
            r9 = 6
            int r8 = r13.indexOf(r8, r9)
            if (r8 >= 0) goto L_0x00c5
        L_0x00be:
            r21 = r12
            r18 = r13
            r14 = 0
            r12 = r7
            goto L_0x011a
        L_0x00c5:
            java.lang.String r9 = r13.substring(r7, r8)
            int r8 = r8 + r11
            java.lang.String r8 = r13.substring(r8)
            fdg r14 = new fdg
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r7 = ";"
            java.lang.String[] r7 = r8.split(r7)
            int r8 = r7.length
            r18 = r13
            r13 = 0
        L_0x00df:
            if (r13 >= r8) goto L_0x0114
            r19 = r7[r13]
            r20 = r7
            java.lang.String r7 = r19.trim()
            r19 = r8
            r8 = 61
            int r8 = r7.indexOf(r8)
            if (r8 >= 0) goto L_0x00f8
            r21 = r12
            r8 = 0
            r12 = 0
            goto L_0x0108
        L_0x00f8:
            r21 = r12
            r12 = 0
            java.lang.String r17 = r7.substring(r12, r8)
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)
            r8 = r7
            r7 = r17
        L_0x0108:
            r11.put(r7, r8)
            int r13 = r13 + 1
            r8 = r19
            r7 = r20
            r12 = r21
            goto L_0x00df
        L_0x0114:
            r21 = r12
            r12 = 0
            r14.<init>(r9, r11)
        L_0x011a:
            if (r14 != 0) goto L_0x011d
            return r0
        L_0x011d:
            boolean r7 = r14.a(r1, r2, r3, r4)
            if (r7 != 0) goto L_0x0124
            return r0
        L_0x0124:
            java.lang.String r0 = r14.toString()
            goto L_0x012f
        L_0x0129:
            r21 = r12
            r18 = r13
            r12 = r7
            r0 = 0
        L_0x012f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r0 != 0) goto L_0x017a
            r0 = r12
        L_0x0137:
            int r8 = r6.length
            if (r0 >= r8) goto L_0x0196
            r8 = r6[r0]
            r7.append(r8)
            r7.append(r5)
            int r0 = r0 + 1
            int r9 = r6.length
            if (r0 >= r9) goto L_0x0149
            r9 = 1
            goto L_0x014a
        L_0x0149:
            r9 = r12
        L_0x014a:
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x015b
            if (r9 == 0) goto L_0x015f
            r8 = r6[r0]
            boolean r8 = r10.contains(r8)
            if (r8 != 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            r14 = r21
            r11 = 0
            goto L_0x0177
        L_0x015f:
            fdg r8 = new fdg
            r14 = r21
            java.lang.String r9 = r15.concat(r14)
            r11 = 0
            r8.<init>(r9, r11)
            boolean r9 = r8.a(r1, r2, r3, r4)
            if (r9 == 0) goto L_0x0177
            r7.append(r8)
            r7.append(r5)
        L_0x0177:
            r21 = r14
            goto L_0x0137
        L_0x017a:
            int r1 = r6.length
        L_0x017b:
            if (r12 >= r1) goto L_0x0196
            r2 = r6[r12]
            r13 = r18
            boolean r3 = r2.equals(r13)
            if (r3 == 0) goto L_0x018b
            r7.append(r0)
            goto L_0x018e
        L_0x018b:
            r7.append(r2)
        L_0x018e:
            r7.append(r5)
            int r12 = r12 + 1
            r18 = r13
            goto L_0x017b
        L_0x0196:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld9.e(java.lang.String, java.lang.String, java.lang.String, yoc, voc):java.lang.String");
    }

    public static final Object g(ba7 ba7, qa7 qa7, long j2, Object obj, ContinuationImpl continuationImpl) {
        gk5 gk5 = new gk5(ba7.a(qa7, obj), (Continuation) null);
        return j2 == LongCompanionObject.MAX_VALUE ? e14.d(new dk5(gk5, (Continuation) null), continuationImpl) : okf.c(j2, gk5, continuationImpl);
    }

    public static final int h(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int i(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 <= 0) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static byte[] j(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean k(j60 j60) {
        if (j60.a == -1 || j60.b == -1) {
            return false;
        }
        int i2 = j60.c;
        return i2 == 2 || i2 == 4;
    }

    public static int l(int i2, int i3) {
        return w53.h(i2, (Color.alpha(i2) * i3) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int m(lzc lzc, vo7 vo7, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || lzc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(a.M(view) - a.M(view2)) + 1;
        }
        return Math.min(vo7.n(), vo7.c(view2) - vo7.f(view));
    }

    public static int n(lzc lzc, vo7 vo7, View view, View view2, a aVar, boolean z, boolean z2) {
        if (aVar.w() == 0 || lzc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (lzc.b() - Math.max(a.M(view), a.M(view2))) - 1) : Math.max(0, Math.min(a.M(view), a.M(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(vo7.c(view2) - vo7.f(view))) / ((float) (Math.abs(a.M(view) - a.M(view2)) + 1)))) + ((float) (vo7.m() - vo7.f(view))));
    }

    public static int o(lzc lzc, vo7 vo7, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || lzc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return lzc.b();
        }
        return (int) ((((float) (vo7.c(view2) - vo7.f(view))) / ((float) (Math.abs(a.M(view) - a.M(view2)) + 1))) * ((float) lzc.b()));
    }

    public static Bitmap p(ha7 ha7) {
        int n0 = ha7.n0();
        if (n0 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(ha7.getWidth(), ha7.getHeight(), Bitmap.Config.ARGB_8888);
            ha7.w()[0].d0().rewind();
            ImageProcessingUtil.e(createBitmap, ha7.w()[0].d0(), ha7.w()[0].f0());
            return createBitmap;
        } else if (n0 == 35) {
            return ImageProcessingUtil.b(ha7);
        } else {
            if (n0 != 256 && n0 != 4101) {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ha7.n0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            } else if (H(ha7.n0())) {
                ByteBuffer d0 = ha7.w()[0].d0();
                int capacity = d0.capacity();
                byte[] bArr = new byte[capacity];
                d0.rewind();
                d0.get(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, (BitmapFactory.Options) null);
                if (decodeByteArray != null) {
                    return decodeByteArray;
                }
                throw new UnsupportedOperationException("Decode jpeg byte array failed");
            } else {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ha7.n0());
            }
        }
    }

    public static float r(Context context, float f2) {
        return TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    public static void s(String str, voc voc) {
        String[] split = str.split(HTTP.CRLF);
        gug a2 = a(true, split, voc);
        if (a2 == null) {
            voc.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            voc.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            for (Map.Entry value : a2.d.entrySet()) {
                voc.log("CodecPrefUtil", "dumpCodecs: " + ((dug) value.getValue()).b);
            }
        }
        gug a3 = a(false, split, voc);
        if (a3 == null) {
            voc.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        voc.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        for (Map.Entry value2 : a3.d.entrySet()) {
            voc.log("CodecPrefUtil", "dumpCodecs: " + ((dug) value2.getValue()).b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.coroutines.jvm.internal.ContinuationImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ck5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlin.coroutines.jvm.internal.ContinuationImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ck5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.ba7 r8, defpackage.qa7 r9, long r10, java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ck5
            if (r0 == 0) goto L_0x0014
            r0 = r14
            ck5 r0 = (defpackage.ck5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.o = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            ck5 r0 = new ck5
            r0.<init>(r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.o
            r7 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r7) goto L_0x002f
            boolean r13 = r6.b
            qa7 r9 = r6.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r14)
            r6.a = r9
            r6.b = r13
            r6.o = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r14 = g(r1, r2, r3, r5, r6)
            if (r14 != r0) goto L_0x004b
            return r0
        L_0x004b:
            y33 r14 = (defpackage.y33) r14
            r8 = 0
            if (r14 != 0) goto L_0x0051
            return r8
        L_0x0051:
            java.lang.Object r10 = r14.e0()
            v33 r10 = (defpackage.v33) r10
            boolean r11 = r10 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            r12 = 0
            if (r11 == 0) goto L_0x0063
            com.facebook.imagepipeline.image.CloseableStaticBitmap r10 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r10
            android.graphics.Bitmap r9 = r10.getUnderlyingBitmap()
            goto L_0x0085
        L_0x0063:
            boolean r11 = r10 instanceof defpackage.z33
            if (r11 == 0) goto L_0x0095
            z33 r10 = (defpackage.z33) r10
            android.graphics.drawable.Drawable r10 = r10.K()
            if (r10 == 0) goto L_0x0083
            v3d r9 = r9.i
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 == 0) goto L_0x0078
            int r14 = r9.a
            goto L_0x0079
        L_0x0078:
            r14 = r11
        L_0x0079:
            if (r9 == 0) goto L_0x007d
            int r11 = r9.b
        L_0x007d:
            android.graphics.Bitmap r9 = defpackage.kne.O(r10, r14, r11)
        L_0x0081:
            r7 = r12
            goto L_0x0085
        L_0x0083:
            r9 = r8
            goto L_0x0081
        L_0x0085:
            if (r13 == 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            if (r9 == 0) goto L_0x0093
            android.graphics.Bitmap$Config r8 = r9.getConfig()
            android.graphics.Bitmap r8 = r9.copy(r8, r12)
        L_0x0093:
            return r8
        L_0x0094:
            return r9
        L_0x0095:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld9.t(ba7, qa7, long, java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object u(ba7 ba7, qa7 qa7, long j2, Object obj, Continuation continuation, int i2) {
        if ((i2 & 2) != 0) {
            j2 = LongCompanionObject.MAX_VALUE;
        }
        long j3 = j2;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return t(ba7, qa7, j3, obj, true, continuation);
    }

    public static final int v(int i2) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i2) != 0) ? i2 : i2 | 33554432;
    }

    public static final int w(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        if (z2) {
            z |= true;
        }
        if (z3) {
            z |= true;
        }
        if (z4) {
            z |= true;
        }
        if (z5) {
            z |= true;
        }
        boolean z10 = z | true;
        if (z6) {
            z10 = z | true;
        }
        if (z7) {
            z10 |= true;
        }
        if (z8) {
            z10 |= true;
        }
        if (z9) {
            z10 |= true;
        }
        if (!z10) {
            return -1;
        }
        return z10 ? 1 : 0;
    }

    public static final PendingIntent x(Context context, int i2, Intent intent) {
        return PendingIntent.getActivity(context, i2, intent, W(v(134217728), intent));
    }

    public static int y(int i2, int i3, Context context) {
        Integer num;
        TypedValue T = b59.T(i2, context);
        if (T != null) {
            int i4 = T.resourceId;
            num = Integer.valueOf(i4 != 0 ? fw3.a(context, i4) : T.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i3;
    }

    public static int z(int i2, Context context, String str) {
        TypedValue V = b59.V(i2, context, str);
        int i3 = V.resourceId;
        return i3 != 0 ? fw3.a(context, i3) : V.data;
    }

    public boolean J() {
        return false;
    }

    public ni0 f() {
        m5a.m(2, "expectedValuesPerKey");
        return new ni0(this);
    }

    public abstract Map q();
}
