package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandExecutionException;

/* renamed from: o9a  reason: default package */
public final class o9a implements fc3, c43, zi6, xxf, a7e, x34, v0h {
    public static o9a b;
    public static final o9a c = new o9a(2);
    public static final o9a o = new o9a(3);
    public static final o9a v = new o9a(4);
    public static final o9a w = new o9a(5);
    public static final o9a x = new o9a(6);
    public final /* synthetic */ int a;

    public /* synthetic */ o9a(int i) {
        this.a = i;
    }

    public static w9d a(JSONObject jSONObject) {
        String string = jSONObject.getString("response");
        string.getClass();
        Integer num = null;
        if (string.equals("report-perf-stat")) {
            if (jSONObject.has("estimatedPerformanceIndex")) {
                num = Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex"));
            }
            return new r2d(num);
        } else if (!string.equals("update-display-layout")) {
            return null;
        } else {
            if (!jSONObject.has("errorCodeByParticipantId")) {
                return new mwf(Collections.emptyMap());
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(tf6.b0(next), jSONObject2.getInt(next) == -1 ? lwf.b : lwf.a);
            }
            return new mwf(hashMap);
        }
    }

    public static JSONObject c(long j, n9d n9d) {
        String str;
        if (n9d instanceof q2d) {
            q2d q2d = (q2d) n9d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", q2d.a);
            jSONObject.put("framesDecoded", q2d.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", (Object) "report-perf-stat");
            jSONObject2.put("report", (Object) jSONObject);
            return jSONObject2;
        } else if (n9d instanceof kwf) {
            kwf kwf = (kwf) n9d;
            JSONObject jSONObject3 = new JSONObject();
            for (otd otd : kwf.a) {
                ntd ntd = otd.b;
                if (ntd.a) {
                    str = "ss";
                } else {
                    str = "sz=" + ntd.b + "x" + ntd.c + ":fit=" + i2a.d(ntd.d);
                }
                jSONObject3.put(tf6.S(otd), (Object) str);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", (Object) "update-display-layout");
            jSONObject4.put("layouts", (Object) jSONObject3);
            if (kwf.b) {
                jSONObject4.put("snapshot", true);
            }
            return jSONObject4;
        } else if (n9d instanceof z2d) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("sequence", j);
            jSONObject5.put("command", (Object) "request-asr");
            jSONObject5.put("start", ((z2d) n9d).a);
            return jSONObject5;
        } else if (!(n9d instanceof p2d)) {
            return null;
        } else {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("sequence", j);
            jSONObject6.put("command", (Object) "report-network-stat");
            throw null;
        }
    }

    public static final x03 d(o9a o9a, String str) {
        x03 x03 = new x03(str);
        x03.c.put(str, x03);
        return x03;
    }

    public static final void e(o9a o9a, String str) {
        w78 w78;
        o9a.getClass();
        int y = tr1.y(2);
        if (y == 0) {
            w78 = w78.o;
        } else if (y == 1) {
            w78 = w78.v;
        } else if (y == 2) {
            w78 = w78.w;
        } else if (y == 3) {
            w78 = w78.x;
        } else if (y != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            return;
        }
        z68.k(w78, "Scout", str);
    }

    public static w91 f(String str) {
        return Intrinsics.areEqual((Object) str, (Object) "action-open-call") ? s91.a : Intrinsics.areEqual((Object) str, (Object) "action-accept-call") ? n91.a : Intrinsics.areEqual((Object) str, (Object) "action-finished-call") ? q91.a : Intrinsics.areEqual((Object) str, (Object) "action-decline-call") ? p91.a : Intrinsics.areEqual((Object) str, (Object) "action-open-incoming") ? t91.a : Intrinsics.areEqual((Object) str, (Object) "action-join-link") ? r91.a : Intrinsics.areEqual((Object) str, (Object) "action-microphone-state") ? o91.a : Intrinsics.areEqual((Object) str, (Object) "action-rate-call") ? u91.a : v91.a;
    }

    public static o9a h(int i, Context context) {
        bs0.m("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, tnc.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(tnc.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(tnc.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(tnc.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(tnc.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList C = m5a.C(context, obtainStyledAttributes, tnc.MaterialCalendarItem_itemFillColor);
        ColorStateList C2 = m5a.C(context, obtainStyledAttributes, tnc.MaterialCalendarItem_itemTextColor);
        ColorStateList C3 = m5a.C(context, obtainStyledAttributes, tnc.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(tnc.MaterialCalendarItem_itemStrokeWidth, 0);
        j4e c2 = j4e.a(context, obtainStyledAttributes.getResourceId(tnc.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(tnc.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new d0((float) 0)).c();
        obtainStyledAttributes.recycle();
        return new o9a(C, C2, C3, dimensionPixelSize, c2, rect);
    }

    public static sq9 k(String str) {
        sq9 sq9;
        sq9[] values = sq9.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                sq9 = null;
                break;
            }
            sq9 = values[i];
            if (StringsKt__StringsJVMKt.equals(sq9.a, str, true)) {
                break;
            }
            i++;
        }
        return sq9 == null ? sq9.UNKNOWN : sq9;
    }

    public static boolean l(String str) {
        return str != null && str.length() != 0 && StringsKt__StringsJVMKt.startsWith(str, "image/", true) && !StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "djvu", true);
    }

    public static boolean m(String str) {
        return (str == null || str.length() == 0 || !StringsKt__StringsJVMKt.startsWith(str, "video/", true)) ? false : true;
    }

    public static void q() {
        xc7 xc7 = xc7.a;
        qc7 r = qra.a.r();
        if (r != null) {
            r.b(xc7);
        }
    }

    public static String r(String str) {
        if (StringsKt__StringsJVMKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder("SSL_");
            if (str != null) {
                sb.append(str.substring(4));
                return sb.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (!StringsKt__StringsJVMKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder("TLS_");
            if (str != null) {
                sb2.append(str.substring(4));
                return sb2.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public static gef t(int i) {
        Object obj;
        gef.b.getClass();
        Iterator it = gef.x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gef) obj).a == i) {
                break;
            }
        }
        gef gef = (gef) obj;
        if (gef != null) {
            return gef;
        }
        throw new IllegalArgumentException(a81.j(i, "No such value ", " for TaskStatus"));
    }

    public static idb u(int i) {
        Object obj;
        idb.b.getClass();
        Iterator it = idb.c1.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((idb) obj).a == i) {
                break;
            }
        }
        idb idb = (idb) obj;
        if (idb != null) {
            return idb;
        }
        throw new IllegalArgumentException(a81.j(i, "No such value ", " for PersistableTaskType"));
    }

    public Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (ouc ouc : (List) obj) {
            String str = null;
            d35 d35 = ouc instanceof d35 ? (d35) ouc : null;
            if (d35 != null) {
                str = d35.c;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public bs5 b(ome ome) {
        return new fs5(3, y6e.a);
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(bf0.class, Executor.class)));
    }

    public jz2 i(int i, byte[] bArr) {
        if (i == 0) {
            throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        } else if (i == 1) {
            try {
                String str = new String(bArr);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        Long valueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                        String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                        if ("response".equals(string)) {
                            if (valueOf != null) {
                                try {
                                    w9d a2 = a(jSONObject);
                                    if (a2 == null) {
                                        return null;
                                    }
                                    return new jz2(valueOf.longValue(), (Object) a2, 8);
                                } catch (Throwable th) {
                                    throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                                }
                            } else {
                                throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                            }
                        } else if (!"error".equals(string)) {
                            return null;
                        } else {
                            jSONObject.optString("error", "");
                            boolean optBoolean = jSONObject.optBoolean("recoverable", false);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            throw new RtcCommandExecutionException(valueOf, optBoolean, hashMap);
                        }
                    } catch (Throwable th2) {
                        throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                    }
                } catch (Throwable th3) {
                    throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
                }
            } catch (Throwable th4) {
                throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as string", th4));
            }
        } else {
            throw new RtcCommandException((Long) null, false, new UnsupportedOperationException("Only text format is supported"));
        }
    }

    public synchronized x03 j(String str) {
        x03 x03;
        try {
            LinkedHashMap linkedHashMap = x03.c;
            x03 = (x03) linkedHashMap.get(str);
            if (x03 == null) {
                x03 = (x03) linkedHashMap.get(r(str));
                if (x03 == null) {
                    x03 = new x03(str);
                }
                linkedHashMap.put(str, x03);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return x03;
    }

    public List n(String str) {
        try {
            return ArraysKt.toList((T[]) InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(a81.m("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [n1, zz7, java.lang.Object] */
    public zz7 o(ex8 ex8, cx8 cx8, List list) {
        ArrayList<ir8> arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ir8 ir8 = (ir8) it.next();
            xq8 xq8 = ir8.b;
            if (xq8 != null) {
                nq8 a2 = ir8.a();
                a2.g = vzg.G(xq8.a, ir8).toString();
                ir8 = a2.a();
            }
            arrayList.add(ir8);
        }
        for (ir8 ir82 : arrayList) {
            if (ir82.b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ? obj = new Object();
                obj.m(unsupportedOperationException);
                return obj;
            }
        }
        return o5a.F(arrayList);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [qae, ts] */
    public ibf p(pf9 pf9) {
        int i;
        String str;
        int i2;
        if (!pf9.m()) {
            return null;
        }
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        ? qae = new qae(0);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th2) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th2);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 == 0) {
                    str = null;
                } else if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (Intrinsics.areEqual((Object) str, (Object) "messagesReactions")) {
                    try {
                        i2 = ryg.e0(pf9);
                    } catch (Throwable th3) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = ytd.a.iterator();
                        while (it3.hasNext()) {
                            ((xm) it3.next()).a(th3);
                        }
                        xtd.a.getClass();
                        int ordinal3 = xtd.b.ordinal();
                        if (ordinal3 == 0) {
                            i2 = 0;
                        } else if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        long j = 0;
                        try {
                            j = ryg.d0(pf9, 0);
                        } catch (Throwable th4) {
                            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = ytd.a.iterator();
                            while (it4.hasNext()) {
                                ((xm) it4.next()).a(th4);
                            }
                            xtd.a.getClass();
                            int ordinal4 = xtd.b.ordinal();
                            if (ordinal4 != 0) {
                                if (ordinal4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                        }
                        ud9 a2 = td9.a(pf9);
                        if (a2 != null) {
                            qae.put(Long.valueOf(j), a2);
                        }
                    }
                    continue;
                } else {
                    Unit unit = Unit.INSTANCE;
                    try {
                        pf9.A();
                    } catch (Throwable th5) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = ytd.a.iterator();
                        while (it5.hasNext()) {
                            ((xm) it5.next()).a(th5);
                        }
                        xtd.a.getClass();
                        int ordinal5 = xtd.b.ordinal();
                        if (ordinal5 != 0) {
                            if (ordinal5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new vv9(qae);
    }

    public ni0 s(long j, n9d n9d) {
        if (n9d != null) {
            try {
                JSONObject c2 = c(j, n9d);
                if (c2 != null) {
                    return new ni0(1, c2.toString().getBytes());
                }
                Long valueOf = Long.valueOf(j);
                throw new RtcCommandException(valueOf, false, new IllegalStateException("No serializer for command: " + n9d.getClass()));
            } catch (JSONException e) {
                Long valueOf2 = Long.valueOf(j);
                throw new RtcCommandException(valueOf2, false, new IllegalArgumentException("Unable to serialize command: " + n9d.getClass(), e));
            }
        } else {
            throw new RtcCommandException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public o9a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, j4e j4e, Rect rect) {
        this.a = 8;
        bs0.p(rect.left);
        bs0.p(rect.top);
        bs0.p(rect.right);
        bs0.p(rect.bottom);
    }
}
