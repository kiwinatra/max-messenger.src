package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.StringsKt;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: soc  reason: default package */
public final class soc implements cc3, uye {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;

    public /* synthetic */ soc() {
        this.a = 1;
    }

    public static soc l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        soc soc = new soc(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) soc.v)) {
            try {
                ((ArrayDeque) soc.v).clear();
                String string = ((SharedPreferences) soc.b).getString((String) soc.c, "");
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) soc.o)) {
                        String[] split = string.split((String) soc.o, -1);
                        int length = split.length;
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) soc.v).add(str);
                            }
                        }
                    }
                }
            } finally {
            }
        }
        return soc;
    }

    public Object a(Class cls) {
        if (((Set) this.b).contains(pac.a(cls))) {
            Object a2 = ((cc3) this.w).a(cls);
            if (!cls.equals(fac.class)) {
                return a2;
            }
            fac fac = (fac) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public Set b(pac pac) {
        if (((Set) this.o).contains(pac)) {
            return ((cc3) this.w).b(pac);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + pac + ">.");
    }

    public m9c c(Class cls) {
        return f(pac.a(cls));
    }

    public int d(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = t0g.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public m9c e(pac pac) {
        if (((Set) this.v).contains(pac)) {
            return ((cc3) this.w).e(pac);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + pac + ">>.");
    }

    public m9c f(pac pac) {
        if (((Set) this.c).contains(pac)) {
            return ((cc3) this.w).f(pac);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + pac + ">.");
    }

    public Object g(pac pac) {
        if (((Set) this.b).contains(pac)) {
            return ((cc3) this.w).g(pac);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + pac + ".");
    }

    public long h(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            ((voc) this.b).logException("RTCDeprecatedStat", "stat.parse", e);
            return -1;
        }
    }

    public z90 i() {
        String str = ((Range) this.b) == null ? " bitrate" : "";
        if (((Integer) this.c) == null) {
            str = str.concat(" sourceFormat");
        }
        if (((Integer) this.o) == null) {
            str = tr1.j(str, " source");
        }
        if (((Range) this.v) == null) {
            str = tr1.j(str, " sampleRate");
        }
        if (((Integer) this.w) == null) {
            str = tr1.j(str, " channelCount");
        }
        if (str.isEmpty()) {
            return new z90((Range) this.b, ((Integer) this.c).intValue(), ((Integer) this.o).intValue(), (Range) this.v, ((Integer) this.w).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean j(int i, String[] strArr, int[] iArr) {
        String[] l = n54.l();
        int i2 = qad.M6;
        if (!n54.X((FrgBase) this.b, strArr, iArr, l, i, i2)) {
            return false;
        }
        return n54.X((FrgBase) this.b, strArr, iArr, n54.e, i, i2);
    }

    public long k(int i) {
        return ((long[]) this.c)[i];
    }

    public void m(String str, boolean z, boolean z2, boolean z3) {
        jf8[] jf8Arr;
        hff hff;
        hff hff2 = (hff) this.v;
        if (hff2 != null) {
            hff2.a(false, false, false, false, false);
        }
        if (str != null && str.length() == 0) {
            hff hff3 = (hff) this.v;
            if (hff3 != null) {
                hff3.a(false, false, true, false, false);
            }
        } else if (str != null && !StringsKt.isBlank(str) && !z && z2) {
            hff hff4 = (hff) this.v;
            if (hff4 != null) {
                hff4.a(false, false, true, true, false);
            }
        } else if (str != null && !StringsKt.isBlank(str) && !z) {
            hff hff5 = (hff) this.v;
            if (hff5 != null) {
                hff5.a(false, false, false, true, false);
            }
        } else if (str != null && !StringsKt.isBlank(str) && z && !z2) {
            hff hff6 = (hff) this.v;
            if (hff6 != null) {
                hff6.a(true, true, false, false, true);
            }
        } else if (str == null || StringsKt.isBlank(str) || !z || !z2) {
            hff hff7 = (hff) this.v;
            if (hff7 != null) {
                hff7.a(true, true, true, false, true);
            }
        } else {
            hff hff8 = (hff) this.v;
            if (hff8 != null) {
                hff8.a(true, true, true, false, true);
            }
        }
        boolean z4 = false;
        if (z3 && (hff = (hff) this.v) != null) {
            FrameLayout frameLayout = hff.k;
            ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -2;
            }
            if (frameLayout != null) {
                frameLayout.setLayoutParams(layoutParams);
            }
            hff.setWidth(-2);
            hff.update();
            LinearLayout linearLayout = hff.m;
            linearLayout.setVisibility(0);
            linearLayout.setAlpha(1.0f);
            RecyclerView recyclerView = hff.l;
            recyclerView.setVisibility(8);
            recyclerView.setAdapter((tyc) null);
        }
        hff hff9 = (hff) this.v;
        if (hff9 != null) {
            EditText editText = (EditText) this.c;
            int lineForOffset = editText.getLayout().getLineForOffset(editText.getSelectionStart());
            int lineAscent = editText.getLayout().getLineAscent(lineForOffset) + editText.getLayout().getLineBaseline(lineForOffset);
            int[] iArr = new int[2];
            editText.getLocationOnScreen(iArr);
            Point point = new Point(0, ((iArr[1] - ((int) ((Context) this.b).getResources().getDimension(zdc.popup_offset))) + lineAscent) - editText.getScrollY());
            Editable text = editText.getText();
            if (!(text == null || (jf8Arr = (jf8[]) text.getSpans(0, text.length(), jf8.class)) == null)) {
                if (jf8Arr.length == 0) {
                    z4 = true;
                }
                z4 = !z4;
            }
            xw3 xw3 = hff9.o;
            xw3.x = z4;
            xw3.m();
            hff9.showAtLocation(hff9.b, ct.z(hff9.m) ^ true ? 8388659 : 8388661, point.x, point.y);
        }
    }

    public List p(long j) {
        utf utf = (utf) this.b;
        utf.getClass();
        ArrayList arrayList = new ArrayList();
        utf.g(j, utf.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        utf.i(j2, false, utf.h, treeMap);
        Map map = (Map) this.v;
        utf.h(j2, (Map) this.o, map, utf.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.w).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                xtf xtf = (xtf) map.get(pair.first);
                xtf.getClass();
                arrayList2.add(new m44((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, xtf.c, 0, xtf.e, xtf.b, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, xtf.f, xtf.g, false, -16777216, xtf.j, c44.DEFAULT_ASPECT_RATIO));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            xtf xtf2 = (xtf) map.get(entry.getKey());
            xtf2.getClass();
            k44 k44 = (k44) entry.getValue();
            CharSequence charSequence = k44.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (wl4 wl4 : (wl4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wl4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(wl4), spannableStringBuilder.getSpanEnd(wl4), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            k44.e = xtf2.c;
            k44.f = xtf2.d;
            k44.g = xtf2.e;
            k44.h = xtf2.b;
            k44.l = xtf2.f;
            k44.k = xtf2.i;
            k44.j = xtf2.h;
            k44.p = xtf2.j;
            arrayList2.add(k44.a());
        }
        return arrayList2;
    }

    public int t() {
        return ((long[]) this.c).length;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append(10);
                for (Field field : soc.class.getDeclaredFields()) {
                    try {
                        sb.append(field.getName());
                        sb.append('=');
                        sb.append(field.get(this));
                        sb.append(10);
                    } catch (IllegalAccessException e) {
                        sb.append("\nCaught ");
                        sb.append(e.getMessage());
                        sb.append(10);
                    }
                }
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + ((String) this.c) + ", mProviderPackage: " + ((String) this.o) + ", mQuery: " + ((String) this.v) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.b;
                    if (i < list.size()) {
                        sb2.append(" [");
                        List list2 = (List) list.get(i);
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            sb2.append(" \"");
                            sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                            sb2.append("\"");
                        }
                        sb2.append(" ]");
                        i++;
                    } else {
                        sb2.append("}mCertificatesArray: 0");
                        return sb2.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public soc(defpackage.voc r17, org.webrtc.StatsReport[] r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r0 = 0
            r1.a = r0
            r16.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            int r4 = r3.length
            r6 = 0
        L_0x0013:
            if (r6 >= r4) goto L_0x0236
            r7 = r3[r6]
            java.lang.String r0 = r7.type
            java.lang.String r8 = "VideoBwe"
            boolean r0 = r0.equals(r8)
            java.lang.String r8 = "stat.parse"
            java.lang.String r9 = "RTCDeprecatedStat"
            if (r0 == 0) goto L_0x00ae
            org.webrtc.StatsReport$Value[] r10 = r7.values
            int r11 = r10.length
            r12 = 0
        L_0x0029:
            if (r12 >= r11) goto L_0x00ae
            r0 = r10[r12]
            java.lang.String r13 = r0.name     // Catch:{ NumberFormatException -> 0x0053 }
            int r14 = r13.hashCode()     // Catch:{ NumberFormatException -> 0x0053 }
            r5 = -1709278787(0xffffffff9a1e79bd, float:-3.2771974E-23)
            r15 = 2
            if (r14 == r5) goto L_0x0069
            r5 = -1197172950(0xffffffffb8a4972a, float:-7.848286E-5)
            if (r14 == r5) goto L_0x005f
            r5 = 1074688577(0x400e7241, float:2.2257235)
            if (r14 == r5) goto L_0x0055
            r5 = 1093751428(0x41315284, float:11.082645)
            if (r14 == r5) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.String r5 = "googTargetEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 0
            goto L_0x0074
        L_0x0053:
            r0 = move-exception
            goto L_0x00a7
        L_0x0055:
            java.lang.String r5 = "googActualEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = r15
            goto L_0x0074
        L_0x005f:
            java.lang.String r5 = "googRetransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 3
            goto L_0x0074
        L_0x0069:
            java.lang.String r5 = "googTransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = -1
        L_0x0074:
            if (r5 == 0) goto L_0x009d
            r13 = 1
            if (r5 == r13) goto L_0x0093
            if (r5 == r15) goto L_0x0089
            r13 = 3
            if (r5 == r13) goto L_0x007f
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0089:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0093:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x00a7:
            r2.logException(r9, r8, r0)
        L_0x00aa:
            int r12 = r12 + 1
            goto L_0x0029
        L_0x00ae:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            org.webrtc.StatsReport$Value[] r0 = r7.values
            int r10 = r0.length
            r11 = 0
        L_0x00b7:
            if (r11 >= r10) goto L_0x00c5
            r12 = r0[r11]
            java.lang.String r13 = r12.name
            java.lang.String r12 = r12.value
            r5.put(r13, r12)
            int r11 = r11 + 1
            goto L_0x00b7
        L_0x00c5:
            java.lang.String r0 = r7.type
            java.lang.String r10 = "ssrc"
            boolean r0 = r0.equals(r10)
            java.lang.String r11 = "video"
            java.lang.String r12 = "mediaType"
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r7.id
            java.lang.String r13 = "recv"
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            java.lang.String r13 = "googJitterBufferMs"
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "googNacksSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googPlisSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googFirsSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "framesDecoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "framesReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            goto L_0x0135
        L_0x012c:
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
        L_0x0135:
            java.lang.String r0 = r7.type
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r7.id
            java.lang.String r10 = "send"
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "framesEncoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googNacksReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googPlisReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googFirsReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "googAvgEncodeMs"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googAdaptationChanges"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googFrameWidthSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "googFrameHeightSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r0 == 0) goto L_0x01b6
            if (r10 == 0) goto L_0x01b6
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b2 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.min(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.max(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01b6:
            java.lang.String r0 = "bytesSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.h(r0)
            java.lang.String r0 = "packetsLost"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "packetsSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01e0
            if (r0 == 0) goto L_0x01e0
            java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x01dc }
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01e0:
            java.lang.String r0 = r7.type
            java.lang.String r7 = "googCandidatePair"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "googActiveConnection"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "true"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = "googRtt"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googTransportType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googRemoteCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.c = r0
            java.lang.String r0 = "googLocalCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.o = r0
        L_0x021e:
            java.lang.String r0 = "googLocalAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.v = r0
            java.lang.String r0 = "googRemoteAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.w = r0
        L_0x0232:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soc.<init>(voc, org.webrtc.StatsReport[]):void");
    }

    public soc(FrgBase frgBase, ni3 ni3, k1a k1a, s60 s60, dm4 dm4) {
        this.a = 4;
        this.b = frgBase;
        this.c = ni3;
        this.o = k1a;
        this.v = s60;
        this.w = dm4;
    }

    public soc(mb3 mb3, cc3 cc3) {
        this.a = 5;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (bm4 bm4 : mb3.c) {
            int i = bm4.c;
            boolean z = i == 0;
            int i2 = bm4.b;
            pac pac = bm4.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(pac);
                } else {
                    hashSet.add(pac);
                }
            } else if (i == 2) {
                hashSet3.add(pac);
            } else if (i2 == 2) {
                hashSet5.add(pac);
            } else {
                hashSet2.add(pac);
            }
        }
        if (!mb3.g.isEmpty()) {
            hashSet.add(pac.a(fac.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.o = Collections.unmodifiableSet(hashSet4);
        this.v = Collections.unmodifiableSet(hashSet5);
        this.w = cc3;
    }

    public soc(Context context, EditText editText, od6 od6, gaf gaf, yu9 yu9) {
        this.a = 2;
        this.b = context;
        this.c = editText;
        this.o = yu9;
        xme a2 = f6e.a((Object) null);
        this.w = a2;
        this.v = new hff(context, editText, new zw3(this, 0), new zw3(this, 1));
        od6.b();
        od6.v.a(new qyc(3, this));
        bs5 F = bs0.F(new ps5(bs0.v(bs0.w(new on2(a2, 28)), 400), new ax3(this, (Continuation) null), 5), ((osa) gaf).c());
        od6.b();
        bs0.K(F, i8b.t(od6.v));
    }

    public soc(utf utf, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 7;
        this.b = utf;
        this.v = hashMap2;
        this.w = hashMap3;
        this.o = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        utf.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public soc(String str, String str2, String str3, List list) {
        this.a = 3;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.o = str2;
        this.v = str3;
        list.getClass();
        this.b = list;
        this.w = str + "-" + str2 + "-" + str3;
    }

    public soc(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 6;
        this.v = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.o = ",";
        this.w = scheduledThreadPoolExecutor;
    }
}
