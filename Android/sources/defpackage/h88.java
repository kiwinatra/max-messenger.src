package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.View;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.material.appbar.AppBarLayout;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KClass;
import kotlin.uuid.Uuid;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: h88  reason: default package */
public final class h88 {
    public static final cx4 b = new cx4(23);
    public static final Object c = new Object();
    public static volatile h88 d;
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static boolean g;
    public static long h;
    public final /* synthetic */ int a;

    public /* synthetic */ h88(int i, byte b2) {
        this.a = i;
    }

    public static final Size A(Context context) {
        Size size = new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        return size.getHeight() > size.getWidth() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final q04 B(i6d i6d) {
        Map map = i6d.k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = i6d.b;
            if (executor == null) {
                executor = null;
            }
            obj = new y95(executor);
            map.put("QueryDispatcher", obj);
        }
        return (q04) obj;
    }

    public static final q04 C(i6d i6d) {
        Map map = i6d.k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            qn qnVar = i6d.c;
            if (qnVar == null) {
                qnVar = null;
            }
            obj = new y95(qnVar);
            map.put("TransactionDispatcher", obj);
        }
        return (q04) obj;
    }

    public static final void D(sn0 sn0) {
        if (sn0.isInitialized()) {
            ((View) sn0.getValue()).setVisibility(8);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017e, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int E(java.lang.String r21) {
        /*
            r0 = r21
            r1 = 14
            r2 = 13
            r3 = 12
            r4 = 11
            r6 = 9
            r7 = 8
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = 3
            java.lang.String r13 = "audio/flac"
            java.lang.String r14 = "audio/wav"
            java.lang.String r15 = "audio/mpeg"
            r16 = 2
            r17 = 1
            r18 = 0
            r19 = -1
            if (r0 != 0) goto L_0x0024
            return r19
        L_0x0024:
            java.util.ArrayList r20 = defpackage.uq9.a
            int r20 = r21.hashCode()
            switch(r20) {
                case -1007807498: goto L_0x0048;
                case -586683234: goto L_0x003c;
                case 187090231: goto L_0x0030;
                default: goto L_0x002d;
            }
        L_0x002d:
            r5 = r19
            goto L_0x0053
        L_0x0030:
            java.lang.String r5 = "audio/mp3"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r5 = r16
            goto L_0x0053
        L_0x003c:
            java.lang.String r5 = "audio/x-wav"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            r5 = r17
            goto L_0x0053
        L_0x0048:
            java.lang.String r5 = "audio/x-flac"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x002d
        L_0x0051:
            r5 = r18
        L_0x0053:
            switch(r5) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0059;
                case 2: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x005c
        L_0x0057:
            r0 = r15
            goto L_0x005c
        L_0x0059:
            r0 = r14
            goto L_0x005c
        L_0x005b:
            r0 = r13
        L_0x005c:
            int r5 = r0.hashCode()
            switch(r5) {
                case -2123537834: goto L_0x018f;
                case -1662384011: goto L_0x0182;
                case -1662384007: goto L_0x0178;
                case -1662095187: goto L_0x016b;
                case -1606874997: goto L_0x015e;
                case -1487394660: goto L_0x0151;
                case -1248337486: goto L_0x0144;
                case -1004728940: goto L_0x0137;
                case -387023398: goto L_0x0129;
                case -43467528: goto L_0x011b;
                case 13915911: goto L_0x010d;
                case 187078296: goto L_0x00ff;
                case 187078297: goto L_0x00f1;
                case 187078669: goto L_0x00e3;
                case 187090232: goto L_0x00d6;
                case 187091926: goto L_0x00c9;
                case 187099443: goto L_0x00be;
                case 1331848029: goto L_0x00b1;
                case 1503095341: goto L_0x00a4;
                case 1504578661: goto L_0x0097;
                case 1504619009: goto L_0x008c;
                case 1504831518: goto L_0x0081;
                case 1505118770: goto L_0x0074;
                case 2039520277: goto L_0x0067;
                default: goto L_0x0063;
            }
        L_0x0063:
            r16 = r19
            goto L_0x019b
        L_0x0067:
            java.lang.String r5 = "video/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0070
            goto L_0x0063
        L_0x0070:
            r16 = 23
            goto L_0x019b
        L_0x0074:
            java.lang.String r5 = "audio/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x007d
            goto L_0x0063
        L_0x007d:
            r16 = 22
            goto L_0x019b
        L_0x0081:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0088
            goto L_0x0063
        L_0x0088:
            r16 = 21
            goto L_0x019b
        L_0x008c:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0093
            goto L_0x0063
        L_0x0093:
            r16 = 20
            goto L_0x019b
        L_0x0097:
            java.lang.String r5 = "audio/eac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0063
        L_0x00a0:
            r16 = 19
            goto L_0x019b
        L_0x00a4:
            java.lang.String r5 = "audio/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ad
            goto L_0x0063
        L_0x00ad:
            r16 = 18
            goto L_0x019b
        L_0x00b1:
            java.lang.String r5 = "video/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ba
            goto L_0x0063
        L_0x00ba:
            r16 = 17
            goto L_0x019b
        L_0x00be:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0063
        L_0x00c5:
            r16 = 16
            goto L_0x019b
        L_0x00c9:
            java.lang.String r5 = "audio/ogg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00d2
            goto L_0x0063
        L_0x00d2:
            r16 = 15
            goto L_0x019b
        L_0x00d6:
            java.lang.String r5 = "audio/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00df
            goto L_0x0063
        L_0x00df:
            r16 = r1
            goto L_0x019b
        L_0x00e3:
            java.lang.String r5 = "audio/amr"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ed
            goto L_0x0063
        L_0x00ed:
            r16 = r2
            goto L_0x019b
        L_0x00f1:
            java.lang.String r5 = "audio/ac4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fb
            goto L_0x0063
        L_0x00fb:
            r16 = r3
            goto L_0x019b
        L_0x00ff:
            java.lang.String r5 = "audio/ac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0109
            goto L_0x0063
        L_0x0109:
            r16 = r4
            goto L_0x019b
        L_0x010d:
            java.lang.String r5 = "video/x-flv"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0117
            goto L_0x0063
        L_0x0117:
            r16 = 10
            goto L_0x019b
        L_0x011b:
            java.lang.String r5 = "application/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0125
            goto L_0x0063
        L_0x0125:
            r16 = r6
            goto L_0x019b
        L_0x0129:
            java.lang.String r5 = "audio/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0133
            goto L_0x0063
        L_0x0133:
            r16 = r7
            goto L_0x019b
        L_0x0137:
            java.lang.String r5 = "text/vtt"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0141
            goto L_0x0063
        L_0x0141:
            r16 = r8
            goto L_0x019b
        L_0x0144:
            java.lang.String r5 = "application/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x014e
            goto L_0x0063
        L_0x014e:
            r16 = r9
            goto L_0x019b
        L_0x0151:
            java.lang.String r5 = "image/jpeg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x015b
            goto L_0x0063
        L_0x015b:
            r16 = r10
            goto L_0x019b
        L_0x015e:
            java.lang.String r5 = "audio/amr-wb"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0168
            goto L_0x0063
        L_0x0168:
            r16 = r11
            goto L_0x019b
        L_0x016b:
            java.lang.String r5 = "video/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0175
            goto L_0x0063
        L_0x0175:
            r16 = r12
            goto L_0x019b
        L_0x0178:
            java.lang.String r5 = "video/mp2t"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x019b
            goto L_0x0063
        L_0x0182:
            java.lang.String r5 = "video/mp2p"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x018c
            goto L_0x0063
        L_0x018c:
            r16 = r17
            goto L_0x019b
        L_0x018f:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0199
            goto L_0x0063
        L_0x0199:
            r16 = r18
        L_0x019b:
            switch(r16) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x01ab;
                case 2: goto L_0x01aa;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a8;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01a6;
                case 7: goto L_0x01a5;
                case 8: goto L_0x01a9;
                case 9: goto L_0x01a9;
                case 10: goto L_0x01a4;
                case 11: goto L_0x01ae;
                case 12: goto L_0x01a3;
                case 13: goto L_0x01a8;
                case 14: goto L_0x01a6;
                case 15: goto L_0x01a2;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01a6;
                case 18: goto L_0x01a8;
                case 19: goto L_0x01ae;
                case 20: goto L_0x01a0;
                case 21: goto L_0x019f;
                case 22: goto L_0x01a9;
                case 23: goto L_0x01a9;
                default: goto L_0x019e;
            }
        L_0x019e:
            return r19
        L_0x019f:
            return r8
        L_0x01a0:
            return r11
        L_0x01a1:
            return r3
        L_0x01a2:
            return r6
        L_0x01a3:
            return r17
        L_0x01a4:
            return r10
        L_0x01a5:
            return r2
        L_0x01a6:
            return r7
        L_0x01a7:
            return r1
        L_0x01a8:
            return r12
        L_0x01a9:
            return r9
        L_0x01aa:
            return r4
        L_0x01ab:
            r0 = 10
            return r0
        L_0x01ae:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h88.E(java.lang.String):int");
    }

    public static int F(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    private final void I(String str, String str2) {
    }

    private final void J(String str, CancellationException cancellationException) {
    }

    public static final int K(int i) {
        if (i == 0) {
            return 0;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }

    public static final boolean L(View view) {
        return view.getContext().getResources().getConfiguration().orientation == 2;
    }

    public static final boolean M(View view) {
        return view.getContext().getResources().getConfiguration().orientation == 1;
    }

    public static ytb N(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        q7a q7a = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            x7a x7a = (x7a) it.next();
            linkedHashMap.put(Integer.valueOf(i), x7a.a);
            for (p7a p7a : x7a.b) {
                long j = p7a.a;
                Boolean bool = p7a.c;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                q7a q7a2 = new q7a(j, p7a.b, i, booleanValue);
                arrayList.add(q7a2);
                if (booleanValue && q7a == null) {
                    q7a = q7a2;
                }
            }
            i = i2;
        }
        return new ytb(linkedHashMap, arrayList, q7a);
    }

    public static Integer O(JSONObject jSONObject, String str, Integer num) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0) {
            return num;
        }
        try {
            if (optString.length() == 7) {
                optString = "#FF" + StringsKt__StringsKt.removePrefix(optString, (CharSequence) "#");
            }
            return Integer.valueOf(Color.parseColor(optString));
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/optColor: error while parse color by key ".concat(str), th);
        }
    }

    public static void P(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != LongCompanionObject.MAX_VALUE) {
                j3 = j2 - j;
                if (j3 < 0) {
                    n54.D(new IllegalStateException(wj6.i(j3, "More produced than requested: ")));
                    j3 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static long Q(int i, byte[] bArr) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & ByteCompanionObject.MAX_VALUE) + ByteCompanionObject.MIN_VALUE;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & ByteCompanionObject.MAX_VALUE) + Uuid.SIZE_BITS;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String R(java.io.DataInputStream r10, defpackage.xe8 r11) {
        /*
            int r0 = r10.readUnsignedByte()
            r1 = 15
            r0 = r0 & r1
            if (r0 == r1) goto L_0x0027
            switch(r0) {
                case 8: goto L_0x0022;
                case 9: goto L_0x001d;
                case 10: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Extra too long"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0018:
            int r0 = r10.readInt()
            goto L_0x0028
        L_0x001d:
            int r0 = r10.readUnsignedShort()
            goto L_0x0028
        L_0x0022:
            int r0 = r10.readUnsignedByte()
            goto L_0x0028
        L_0x0027:
            r0 = -1
        L_0x0028:
            java.lang.Object r1 = r11.c
            byte[] r1 = (byte[]) r1
            java.lang.Object r2 = r11.b
            char[] r2 = (char[]) r2
            int r3 = r1.length
            if (r3 >= r0) goto L_0x003f
        L_0x0033:
            int r3 = r3 << 1
            if (r3 < r0) goto L_0x0033
            byte[] r1 = new byte[r3]
            r11.c = r1
            char[] r2 = new char[r3]
            r11.b = r2
        L_0x003f:
            r11 = 0
            r10.readFully(r1, r11, r0)
            r10 = r11
            r3 = r10
        L_0x0045:
            if (r10 >= r0) goto L_0x0059
            byte r4 = r1[r10]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 <= r5) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r10 = r10 + 1
            int r5 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r3 = r5
            goto L_0x0045
        L_0x0059:
            if (r10 >= r0) goto L_0x00ed
            byte r4 = r1[r10]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 >> 4
            java.lang.String r7 = "malformed input: partial character at end"
            r8 = 128(0x80, float:1.794E-43)
            java.lang.String r9 = "malformed input around byte "
            switch(r6) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00e3;
                case 8: goto L_0x006a;
                case 9: goto L_0x006a;
                case 10: goto L_0x006a;
                case 11: goto L_0x006a;
                case 12: goto L_0x00b8;
                case 13: goto L_0x00b8;
                case 14: goto L_0x0074;
                default: goto L_0x006a;
            }
        L_0x006a:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            java.lang.String r10 = defpackage.wj6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x0074:
            int r5 = r10 + 3
            if (r5 > r0) goto L_0x00b2
            int r6 = r10 + 1
            byte r6 = r1[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x00a6
            int r10 = r10 + 2
            byte r10 = r1[r10]
            r7 = r10 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x009c
            int r7 = r3 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            r6 = r6 & 63
            int r6 = r6 << 6
            r4 = r4 | r6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r7
            goto L_0x0059
        L_0x009c:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.wj6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00a6:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            int r10 = r10 + 2
            java.lang.String r10 = defpackage.wj6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x00b2:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00b8:
            int r5 = r10 + 2
            if (r5 > r0) goto L_0x00dd
            int r10 = r10 + 1
            byte r10 = r1[r10]
            r6 = r10 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L_0x00d3
            int r6 = r3 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r6
            goto L_0x0059
        L_0x00d3:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.wj6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00dd:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00e3:
            int r10 = r10 + 1
            int r4 = r3 + 1
            char r5 = (char) r5
            r2[r3] = r5
            r3 = r4
            goto L_0x0059
        L_0x00ed:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2, r11, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h88.R(java.io.DataInputStream, xe8):java.lang.String");
    }

    public static long S(int i, byte[] bArr) {
        long Q = Q(i, bArr);
        long Q2 = Q(i + 4, bArr);
        if (Q == 0 && Q2 == 0) {
            return 0;
        }
        return ((Q2 * 1000) / 4294967296L) + ((Q - 2208988800L) * 1000);
    }

    public static cvc T(Integer num) {
        int intValue = num.intValue();
        for (cvc cvc : cvc.values()) {
            if (cvc.a == intValue) {
                return cvc;
            }
        }
        return cvc.UNKNOWN;
    }

    public static final xqg U(yo7 yo7, usd usd) {
        kne kind = usd.getKind();
        if (kind instanceof lqb) {
            return xqg.POLY_OBJ;
        }
        if (Intrinsics.areEqual((Object) kind, (Object) hye.p)) {
            return xqg.LIST;
        }
        if (!Intrinsics.areEqual((Object) kind, (Object) hye.q)) {
            return xqg.OBJ;
        }
        usd i = i(usd.h(0), yo7.b);
        kne kind2 = i.getKind();
        if ((kind2 instanceof rub) || Intrinsics.areEqual((Object) kind2, (Object) zsd.p)) {
            return xqg.MAP;
        }
        if (yo7.a.d) {
            return xqg.LIST;
        }
        throw o54.b(i);
    }

    public static String V(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static final void W(fwf fwf) {
        fwf.e(lua.class, new qid(12));
    }

    private final void Y() {
    }

    public static final wm6 a(Context context) {
        Size A = A(context);
        Pair pair = context.getResources().getConfiguration().orientation == 1 ? TuplesKt.to(Integer.valueOf(A.getWidth()), Integer.valueOf(A.getHeight())) : TuplesKt.to(Integer.valueOf(A.getHeight()), Integer.valueOf(A.getWidth()));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        int max = Math.max(3, intValue / context.getResources().getDimensionPixelSize(ydc.attach_bar_thumbnail_size));
        int i = intValue / max;
        int roundToInt = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((double) ((A.getWidth() / max) - ((max - 1) * roundToInt))) * 0.8d);
        int roundToInt3 = MathKt.roundToInt(Math.ceil(((double) ((intValue2 * max) / i)) * 1.8d));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ydc.gallery_album_cover_size);
        return new wm6(max, roundToInt, i, roundToInt2, roundToInt3, dimensionPixelSize <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, dimensionPixelSize, dimensionPixelSize, 12));
    }

    public static long b() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (f) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[0];
            byte b3 = bArr[1] & UByte.MAX_VALUE;
            long S = S(24, bArr);
            long S2 = S(32, bArr);
            long S3 = S(40, bArr);
            j((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), b3, S3);
            long j7 = (j6 + (((S3 - j6) + (S2 - S)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    private final void b0(String str, String str2) {
    }

    public static long c(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, d(j2, j)));
        return j2;
    }

    private final void c0(String str, String str2, RuntimeException runtimeException) {
    }

    public static long d(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LongCompanionObject.MAX_VALUE : j3;
    }

    public static final iv7 d0(en enVar, AppBarLayout appBarLayout, jv7 jv7) {
        return new iv7(appBarLayout, jv7.getLifecycle(), enVar);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final void e0(DataOutputStream dataOutputStream, String str, guf guf, guf guf2, String str2, xe8 xe8) {
        int i;
        if (str2.length() < 21845) {
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(guf.a);
            dataOutputStream.writeUTF(str2);
            return;
        }
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeByte(guf2.a);
        int length = str2.length();
        char[] cArr = (char[]) xe8.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            xe8.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 <= 127) {
                i = 1;
            } else if (c2 <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int a2 = guf2.a();
        byte[] bArr = (byte[]) xe8.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (a2 | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (a2 | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (a2 | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[3] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutputStream.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) xe8.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            xe8.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c3 = cArr[i6];
                if (c3 <= 127) {
                    bArr2[i5] = (byte) c3;
                    i5++;
                } else if (c3 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c3 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c3 & '?') | 128);
                } else {
                    bArr2[i5] = (byte) ((c3 >> 12) | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c3 >> 6) & 63) | Uuid.SIZE_BITS);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c3 & '?') | 128);
                }
            }
        }
        dataOutputStream.write(bArr2, 0, i3);
    }

    public static final void f(View view, yh7 yh7, Function1 function1) {
        nr0 nr0 = yh7.b;
        mr0 mr0 = nr0 != null ? nr0.b : null;
        int i = mr0 == null ? -1 : ai7.$EnumSwitchMapping$0[mr0.ordinal()];
        if (i == -1 || i == 1) {
            new hne(view, yh7, function1);
        } else if (i == 2) {
            new pf(view, yh7, function1);
        } else if (i == 3) {
            new of(view, yh7, 1, function1, 40);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void g(View view) {
        f(view, new yh7(anf.a, (nr0) null, 2), (Function1) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: oo4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: oo4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: oo4} */
    /* JADX WARNING: type inference failed for: r5v0, types: [oo4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v37, types: [po4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v28, types: [po4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mo4 h(defpackage.o5a r20) {
        /*
            r0 = r20
            int r1 = r20.t()
            int r2 = r20.s()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            oo4 r5 = new oo4
            r5.<init>()
            r6 = 0
            r5.a = r6
            r5.b = r1
            r5.c = r6
            r5.d = r2
            r4.add(r5)
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 / 2
            int r1 = r1 * 2
            int r1 = r1 + r2
            int[] r5 = new int[r1]
            int r7 = r1 / 2
            int[] r1 = new int[r1]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0038:
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0271
            int r9 = r4.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r4.remove(r9)
            oo4 r9 = (defpackage.oo4) r9
            int r10 = r9.b()
            if (r10 < r2) goto L_0x01cc
            int r10 = r9.a()
            if (r10 >= r2) goto L_0x0057
            goto L_0x01cc
        L_0x0057:
            int r10 = r9.b()
            int r12 = r9.a()
            int r12 = r12 + r10
            int r12 = r12 + r2
            int r12 = r12 / 2
            int r10 = r9.a
            int r13 = r2 + r7
            r5[r13] = r10
            int r10 = r9.b
            r1[r13] = r10
            r10 = r6
        L_0x006e:
            if (r10 >= r12) goto L_0x01cc
            int r13 = r9.b()
            int r14 = r9.a()
            int r13 = r13 - r14
            int r13 = java.lang.Math.abs(r13)
            int r13 = r13 % 2
            if (r13 != r2) goto L_0x0083
            r13 = r2
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            int r14 = r9.b()
            int r15 = r9.a()
            int r14 = r14 - r15
            int r15 = -r10
            r11 = r15
        L_0x008f:
            if (r11 > r10) goto L_0x0118
            if (r11 == r15) goto L_0x00ae
            if (r11 == r10) goto L_0x00a4
            int r16 = r11 + 1
            int r16 = r16 + r7
            r2 = r5[r16]
            int r16 = r11 + -1
            int r16 = r16 + r7
            r6 = r5[r16]
            if (r2 <= r6) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r2 = r11 + -1
            int r2 = r2 + r7
            r2 = r5[r2]
            int r6 = r2 + 1
        L_0x00ab:
            r16 = r12
            goto L_0x00b5
        L_0x00ae:
            int r2 = r11 + 1
            int r2 = r2 + r7
            r2 = r5[r2]
            r6 = r2
            goto L_0x00ab
        L_0x00b5:
            int r12 = r9.c
            r17 = r4
            int r4 = r9.a
            int r4 = r6 - r4
            int r4 = r4 + r12
            int r4 = r4 - r11
            if (r10 == 0) goto L_0x00c7
            if (r6 == r2) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            int r12 = r4 + -1
            goto L_0x00c8
        L_0x00c7:
            r12 = r4
        L_0x00c8:
            r18 = r8
        L_0x00ca:
            int r8 = r9.b
            if (r6 >= r8) goto L_0x00dd
            int r8 = r9.d
            if (r4 >= r8) goto L_0x00dd
            boolean r8 = r0.d(r6, r4)
            if (r8 == 0) goto L_0x00dd
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L_0x00ca
        L_0x00dd:
            int r8 = r11 + r7
            r5[r8] = r6
            if (r13 == 0) goto L_0x0107
            int r8 = r14 - r11
            r19 = r13
            int r13 = r15 + 1
            if (r8 < r13) goto L_0x0105
            int r13 = r10 + -1
            if (r8 > r13) goto L_0x0105
            int r8 = r8 + r7
            r8 = r1[r8]
            if (r8 > r6) goto L_0x0105
            po4 r8 = new po4
            r8.<init>()
            r8.a = r2
            r8.b = r12
            r8.c = r6
            r8.d = r4
            r2 = 0
            r8.e = r2
            goto L_0x0120
        L_0x0105:
            r2 = 0
            goto L_0x010a
        L_0x0107:
            r19 = r13
            goto L_0x0105
        L_0x010a:
            int r11 = r11 + 2
            r6 = r2
            r12 = r16
            r4 = r17
            r8 = r18
            r13 = r19
            r2 = 1
            goto L_0x008f
        L_0x0118:
            r17 = r4
            r2 = r6
            r18 = r8
            r16 = r12
            r8 = 0
        L_0x0120:
            if (r8 == 0) goto L_0x0127
            r11 = r8
            r19 = r9
            goto L_0x01d3
        L_0x0127:
            int r4 = r9.b()
            int r6 = r9.a()
            int r4 = r4 - r6
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = r2
        L_0x0137:
            int r6 = r9.b()
            int r8 = r9.a()
            int r6 = r6 - r8
            r8 = r15
        L_0x0141:
            if (r8 > r10) goto L_0x01b7
            if (r8 == r15) goto L_0x015c
            if (r8 == r10) goto L_0x0154
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r8 + -1
            int r12 = r12 + r7
            r12 = r1[r12]
            if (r11 >= r12) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            int r11 = r8 + -1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r11 + -1
            goto L_0x0162
        L_0x015c:
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            r12 = r11
        L_0x0162:
            int r13 = r9.d
            int r14 = r9.b
            int r14 = r14 - r12
            int r14 = r14 - r8
            int r13 = r13 - r14
            if (r10 == 0) goto L_0x0171
            if (r12 == r11) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            int r14 = r13 + 1
            goto L_0x0172
        L_0x0171:
            r14 = r13
        L_0x0172:
            int r2 = r9.a
            if (r12 <= r2) goto L_0x018d
            int r2 = r9.c
            if (r13 <= r2) goto L_0x018d
            int r2 = r12 + -1
            r19 = r9
            int r9 = r13 + -1
            boolean r2 = r0.d(r2, r9)
            if (r2 == 0) goto L_0x018f
            int r12 = r12 + -1
            int r13 = r13 + -1
            r9 = r19
            goto L_0x0172
        L_0x018d:
            r19 = r9
        L_0x018f:
            int r2 = r8 + r7
            r1[r2] = r12
            if (r4 == 0) goto L_0x01b1
            int r2 = r6 - r8
            if (r2 < r15) goto L_0x01b1
            if (r2 > r10) goto L_0x01b1
            int r2 = r2 + r7
            r2 = r5[r2]
            if (r2 < r12) goto L_0x01b1
            po4 r2 = new po4
            r2.<init>()
            r2.a = r12
            r2.b = r13
            r2.c = r11
            r2.d = r14
            r4 = 1
            r2.e = r4
            goto L_0x01ba
        L_0x01b1:
            int r8 = r8 + 2
            r9 = r19
            r2 = 0
            goto L_0x0141
        L_0x01b7:
            r19 = r9
            r2 = 0
        L_0x01ba:
            if (r2 == 0) goto L_0x01be
            r11 = r2
            goto L_0x01d3
        L_0x01be:
            int r10 = r10 + 1
            r12 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            r2 = 1
            r6 = 0
            goto L_0x006e
        L_0x01cc:
            r17 = r4
            r18 = r8
            r19 = r9
            r11 = 0
        L_0x01d3:
            if (r11 == 0) goto L_0x0261
            int r2 = r11.a()
            if (r2 <= 0) goto L_0x0217
            int r2 = r11.d
            int r4 = r11.b
            int r2 = r2 - r4
            int r6 = r11.c
            int r8 = r11.a
            int r6 = r6 - r8
            if (r2 == r6) goto L_0x020f
            boolean r9 = r11.e
            if (r9 == 0) goto L_0x01f5
            lo4 r2 = new lo4
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x01f5:
            if (r2 <= r6) goto L_0x0203
            lo4 r2 = new lo4
            int r4 = r4 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x0203:
            lo4 r2 = new lo4
            int r8 = r8 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x020f:
            lo4 r2 = new lo4
            r2.<init>(r8, r4, r6)
        L_0x0214:
            r3.add(r2)
        L_0x0217:
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L_0x0228
            oo4 r2 = new oo4
            r2.<init>()
            r6 = r18
            r9 = r19
            r4 = 1
            goto L_0x0238
        L_0x0228:
            int r2 = r18.size()
            r4 = 1
            int r2 = r2 - r4
            r6 = r18
            java.lang.Object r2 = r6.remove(r2)
            oo4 r2 = (defpackage.oo4) r2
            r9 = r19
        L_0x0238:
            int r8 = r9.a
            r2.a = r8
            int r8 = r9.c
            r2.c = r8
            int r8 = r11.a
            r2.b = r8
            int r8 = r11.b
            r2.d = r8
            r8 = r17
            r8.add(r2)
            int r2 = r9.b
            r9.b = r2
            int r2 = r9.d
            r9.d = r2
            int r2 = r11.c
            r9.a = r2
            int r2 = r11.d
            r9.c = r2
            r8.add(r9)
            goto L_0x026b
        L_0x0261:
            r8 = r17
            r6 = r18
            r9 = r19
            r4 = 1
            r6.add(r9)
        L_0x026b:
            r2 = r4
            r4 = r8
            r8 = r6
            r6 = 0
            goto L_0x0038
        L_0x0271:
            cx4 r2 = b
            java.util.Collections.sort(r3, r2)
            mo4 r2 = new mo4
            r2.<init>((defpackage.o5a) r0, (java.util.ArrayList) r3, (int[]) r5, (int[]) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h88.h(o5a):mo4");
    }

    public static final usd i(usd usd, pk4 pk4) {
        if (!Intrinsics.areEqual((Object) usd.getKind(), (Object) zsd.o)) {
            return usd.isInline() ? i(usd.h(0), pk4) : usd;
        }
        KClass O = tf6.O(usd);
        if (O == null) {
            return usd;
        }
        CollectionsKt.emptyList();
        rae.w(((Map) pk4.a).get(O));
        return usd;
    }

    public static void j(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(i2a.h(26, b3, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(i2a.h(36, i, "SNTP: Untrusted stratum: "));
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static float k(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int l(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int m(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0) {
            return i;
        }
        try {
            if (optString.length() == 7) {
                optString = "#FF" + StringsKt__StringsKt.removePrefix(optString, (CharSequence) "#");
            }
            return Color.parseColor(optString);
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/color: error while parse color by key ".concat(str), th);
        }
    }

    public static scf n(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(ClientCookie.VERSION_ATTR);
            if (i <= 1) {
                boolean z = jSONObject.getBoolean("night");
                scf scf = z ? l9a.f0 : vi4.f0;
                JSONObject jSONObject2 = jSONObject.getJSONObject("colors");
                String string = jSONObject.getString("title");
                x53 x53 = new x53(m(jSONObject2, "accent", scf.l), m(jSONObject2, "accentText", scf.m), m(jSONObject2, "background", scf.n), m(jSONObject2, "bubbleBorder", scf.q), m(jSONObject2, "bubbleBorderHighLight", scf.o), m(jSONObject2, "bubbleClickableBackground", scf.p), m(jSONObject2, "bubbleControlBackground", scf.r), m(jSONObject2, "bubbleControlsText", scf.t), m(jSONObject2, "bubbleDecoratorBackground", scf.s), m(jSONObject2, "bubbleDecoratorText", scf.u), m(jSONObject2, "bubbleOuterBorder", scf.v), m(jSONObject2, "bubbleSecondaryText", scf.w), m(jSONObject2, "buttonTint", scf.x), m(jSONObject2, "chatBackground", scf.y), m(jSONObject2, "destructive", scf.z), m(jSONObject2, "lightBadgeBackground", scf.A), m(jSONObject2, "highlightBackground", scf.B), m(jSONObject2, "incomingBubbleBackground", scf.C), m(jSONObject2, "incomingBubbleBackgroundHighlighted", scf.D), m(jSONObject2, "outgoingBubbleBackground", scf.E), m(jSONObject2, "outgoingBubbleBackgroundHighlighted", scf.F), m(jSONObject2, "primaryText", scf.G), m(jSONObject2, "profileBackground", scf.H), m(jSONObject2, "secondaryBackground", scf.I), m(jSONObject2, "secondaryButton", scf.J), m(jSONObject2, "secondaryText", scf.K), m(jSONObject2, "separatorBackground", scf.L), m(jSONObject2, "statusBarBackground", scf.M), m(jSONObject2, "tertiaryText", scf.N), m(jSONObject2, "toolBarBackground", scf.O), m(jSONObject2, "unreadBackground", scf.P), m(jSONObject2, "unreadBackgroundMuted", scf.Q), m(jSONObject2, "unreadText", scf.R), m(jSONObject2, "callAccent", scf.S), m(jSONObject2, "callBackground", scf.T), m(jSONObject2, "callControl", scf.U), m(jSONObject2, "groupCallBackground", scf.V), O(jSONObject2, "switchThumb", scf.W), O(jSONObject2, "switchThumbChecked", scf.X), O(jSONObject2, "switchTrack", scf.Y), O(jSONObject2, "switchTrackChecked", scf.Z), O(jSONObject2, "switchTint", scf.a0));
                String string2 = jSONObject.getString("author");
                if (str2 == null) {
                    str3 = string + ".ttstyle";
                } else {
                    str3 = str2;
                }
                return new scf(string, string2, z, i, str3, x53, nfd.v, nfd.o, nfd.c);
            }
            throw new IllegalStateException();
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static z35 o(md5 md5) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = md5.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (md5.q(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new z35(1, 0, length, i, 2);
    }

    private final void r(String str, String str2) {
    }

    private final void s(String str, String str2, Throwable th) {
    }

    private final void v(String str, String str2) {
    }

    private final void w(String str, String str2, Throwable th) {
    }

    public static h88 x() {
        h88 h88;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new h88(3);
                }
                h88 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h88;
    }

    public static final ObjectAnimator y(View view, boolean z) {
        float f2 = 1.0f;
        float f3 = z ? 0.0f : 1.0f;
        if (!z) {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f3, f2});
        ofFloat.addListener(new ig(view, z));
        return ofFloat;
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.ValueAnimator z(android.widget.Space r7, defpackage.sy3 r8, defpackage.sy3 r9, int r10) {
        /*
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r8 = r1
        L_0x0006:
            r10 = r10 & 2
            if (r10 == 0) goto L_0x000b
            r9 = r1
        L_0x000b:
            java.util.List r10 = kotlin.collections.CollectionsKt.createListBuilder()
            r0 = -1
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L_0x0053
            int r4 = r8.b
            int r5 = r8.f
            int r4 = r4 - r5
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0024
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x002a
            int r5 = r5.topMargin
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            boolean r8 = r8.a
            if (r8 == 0) goto L_0x0031
            r8 = r2
            goto L_0x0032
        L_0x0031:
            r8 = r0
        L_0x0032:
            int r8 = r8 * r4
            int r8 = r8 + r5
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x003f
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x0045
            int r4 = r4.topMargin
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            int[] r8 = new int[]{r4, r8}
            java.lang.String r4 = "top"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r4, r8)
            r10.add(r8)
        L_0x0053:
            if (r9 == 0) goto L_0x0091
            int r8 = r9.b
            int r4 = r9.f
            int r8 = r8 - r4
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0065
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0066
        L_0x0065:
            r4 = r1
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            int r4 = r4.bottomMargin
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            boolean r9 = r9.a
            if (r9 == 0) goto L_0x0071
            r0 = r2
        L_0x0071:
            int r0 = r0 * r8
            int r0 = r0 + r4
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x007e
            r1 = r8
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            int r8 = r1.bottomMargin
            goto L_0x0084
        L_0x0083:
            r8 = r3
        L_0x0084:
            int[] r8 = new int[]{r8, r0}
            java.lang.String r9 = "bottom"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r9, r8)
            r10.add(r8)
        L_0x0091:
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r10)
            java.util.Collection r8 = (java.util.Collection) r8
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r3]
            java.lang.Object[] r8 = r8.toArray(r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofPropertyValuesHolder(r8)
            hg r9 = new hg
            r10 = 0
            r9.<init>(r7, r10)
            r8.addUpdateListener(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h88.z(android.widget.Space, sy3, sy3, int):android.animation.ValueAnimator");
    }

    public final void G(String str, String str2) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.i(str, str2, (Throwable) null);
                return;
        }
    }

    public final void H(String str, CancellationException cancellationException) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.i(mqg.B0, str, cancellationException);
                return;
        }
    }

    public final void X() {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.l(ForceStopRunnable$BroadcastReceiver.a, "Rescheduling alarm that keeps track of force-stops.", new Object[0]);
                return;
        }
    }

    public final void Z(String str, String str2) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.p(str, str2);
                return;
        }
    }

    public final void a0(String str, String str2, RuntimeException runtimeException) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.o(str, str2, runtimeException);
                return;
        }
    }

    public final void p(String str, String str2) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.c(str, str2, new Object[0]);
                return;
        }
    }

    public final void q(String str, String str2, Throwable th) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.b(str, str2, th);
                return;
        }
    }

    public final void t(String str, String str2) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.f(str, str2, (Throwable) null);
                return;
        }
    }

    public final void u(String str, String str2, Throwable th) {
        switch (this.a) {
            case 0:
                return;
            default:
                z68.f(str, str2, th);
                return;
        }
    }

    public h88(int i) {
        this.a = 0;
    }
}
