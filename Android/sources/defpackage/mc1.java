package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mc1  reason: default package */
public final class mc1 {
    public final ef1 a;
    public final voc b;
    public final Function2 c;
    public final nfd d;
    public final Function0 e;
    public final l48 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public kz9 i = new kz9();

    public mc1(ef1 ef1, voc voc, r6 r6Var, nfd nfd, cz0 cz0, l48 l48) {
        this.a = ef1;
        this.b = voc;
        this.c = r6Var;
        this.d = nfd;
        this.e = cz0;
        this.f = l48;
    }

    public static ft8 a(et8 et8, ft8 ft8, List list, ArrayList arrayList, boolean z) {
        if (ft8 == null) {
            return ft8.a;
        }
        int i2 = lc1.$EnumSwitchMapping$0[ft8.ordinal()];
        return i2 != 1 ? (i2 == 2 && z) ? ft8.a : ft8 : (list.contains(xe1.a) || list.contains(xe1.b)) ? ft8.b : arrayList.contains(et8) ? ft8.o : ft8;
    }

    public static boolean d(MutablePropertyReference0Impl mutablePropertyReference0Impl) {
        Object obj = mutablePropertyReference0Impl.get();
        ft8 ft8 = ft8.c;
        if (obj == ft8) {
            return false;
        }
        if (mutablePropertyReference0Impl.get() == ft8.b) {
            mutablePropertyReference0Impl.set(ft8.a);
        }
        if (mutablePropertyReference0Impl.get() != ft8.o) {
            return true;
        }
        mutablePropertyReference0Impl.set(ft8);
        return true;
    }

    public static void e(MutablePropertyReference0Impl mutablePropertyReference0Impl) {
        ft8 ft8 = (ft8) mutablePropertyReference0Impl.get();
        if (ft8 == ft8.c) {
            mutablePropertyReference0Impl.set(ft8.b);
        } else if (ft8 == ft8.o) {
            mutablePropertyReference0Impl.set(ft8.a);
        }
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.d.getClass();
        zwd s = nfd.s(jSONObject);
        ef1 ef1 = this.a;
        ue1 ue1 = ef1.a.a;
        String C = ct.C(jSONObject2, "adminId");
        ue1 b2 = C != null ? ue1.b(C) : null;
        String C2 = ct.C(jSONObject2, "participantId");
        ue1 b3 = C2 != null ? ue1.b(C2) : null;
        boolean optBoolean = jSONObject2.optBoolean("muteAll", false);
        if (b3 != null && !Intrinsics.areEqual((Object) b3, (Object) ue1)) {
            ef1.f(new v8b(b3, new v9a(16), new xga(1, f(jSONObject, b3, "handleMuteParticipant", jSONObject2.has("muteStates") ? tf6.p(jSONObject) : MapsKt.emptyMap(), false)), new v9a(16), new v9a(16), new v9a(16), new v9a(16)), (zwd) null);
        } else if (b2 != null && Intrinsics.areEqual((Object) b2, (Object) ue1)) {
            m(jSONObject, "handleMuteParticipant", kc1.b, s, false);
            ArrayList arrayList = new ArrayList(ef1.r());
            for (ue1 ue12 : ef1.d(s).keySet()) {
                arrayList.add(new v8b(ue12, new v9a(16), new xga(1, f(jSONObject, ue12, "handleMuteParticipant", MapsKt.emptyMap(), false)), new v9a(16), new v9a(16), new v9a(16), new v9a(16)));
            }
            ef1.g(s, arrayList);
        } else if (optBoolean) {
            c(jSONObject2, s, true);
            m(jSONObject, "handleMuteParticipant", kc1.b, s, false);
            ArrayList arrayList2 = new ArrayList(ef1.r());
            for (ue1 ue13 : ef1.d(s).keySet()) {
                arrayList2.add(new v8b(ue13, new v9a(16), new xga(1, f(jSONObject, ue13, "handleMuteParticipant", MapsKt.emptyMap(), false)), new v9a(16), new v9a(16), new v9a(16), new v9a(16)));
            }
            ef1.g(s, arrayList2);
        } else {
            c(jSONObject2, s, false);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122 A[Catch:{ JSONException -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(org.json.JSONObject r20, defpackage.zwd r21, boolean r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            java.lang.String r10 = "SCREEN_SHARING"
            java.lang.String r11 = "VIDEO"
            java.lang.String r12 = "AUDIO"
            java.lang.String r13 = "MOVIE_SHARING"
            r16 = 0
            r6 = 1
            kotlin.jvm.functions.Function0 r0 = r8.e
            java.lang.Object r0 = r0.invoke()
            r5 = r21
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            r17 = 0
            java.lang.String r0 = "mediaOptions"
            boolean r1 = r9.has(r0)     // Catch:{ JSONException -> 0x008d }
            if (r1 != 0) goto L_0x002e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x008d }
            goto L_0x009b
        L_0x002e:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x008d }
            r1.<init>()     // Catch:{ JSONException -> 0x008d }
            org.json.JSONArray r0 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x008d }
            r2 = r16
        L_0x0039:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x008d }
            if (r2 >= r3) goto L_0x008b
            java.lang.String r3 = r0.getString(r2)     // Catch:{ JSONException -> 0x008d }
            if (r3 != 0) goto L_0x0048
        L_0x0045:
            r3 = r17
            goto L_0x0084
        L_0x0048:
            int r4 = r3.hashCode()
            switch(r4) {
                case -214017395: goto L_0x006c;
                case 62628790: goto L_0x0063;
                case 81665115: goto L_0x005a;
                case 1982835689: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            r3 = -1
            goto L_0x0075
        L_0x0051:
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x0058
            goto L_0x004f
        L_0x0058:
            r3 = 3
            goto L_0x0075
        L_0x005a:
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            r3 = 2
            goto L_0x0075
        L_0x0063:
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x006a
            goto L_0x004f
        L_0x006a:
            r3 = r6
            goto L_0x0075
        L_0x006c:
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x0073
            goto L_0x004f
        L_0x0073:
            r3 = r16
        L_0x0075:
            switch(r3) {
                case 0: goto L_0x0082;
                case 1: goto L_0x007f;
                case 2: goto L_0x007c;
                case 3: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0045
        L_0x0079:
            et8 r3 = defpackage.et8.c     // Catch:{ JSONException -> 0x008d }
            goto L_0x0084
        L_0x007c:
            et8 r3 = defpackage.et8.b     // Catch:{ JSONException -> 0x008d }
            goto L_0x0084
        L_0x007f:
            et8 r3 = defpackage.et8.a     // Catch:{ JSONException -> 0x008d }
            goto L_0x0084
        L_0x0082:
            et8 r3 = defpackage.et8.o     // Catch:{ JSONException -> 0x008d }
        L_0x0084:
            if (r3 == 0) goto L_0x0089
            r1.add(r3)     // Catch:{ JSONException -> 0x008d }
        L_0x0089:
            int r2 = r2 + r6
            goto L_0x0039
        L_0x008b:
            r0 = r1
            goto L_0x009b
        L_0x008d:
            r0 = move-exception
            java.lang.String r1 = "media options parsing error"
            voc r2 = r8.b
            java.lang.String r3 = "CallMediaOptionsDelegate"
            r2.logException(r3, r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x009b:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00ee
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00ae
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
            r4 = r1
            goto L_0x00d6
        L_0x00ae:
            java.util.HashMap r1 = defpackage.tf6.p(r20)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00bb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d5
            java.lang.Object r4 = r3.next()
            et8 r4 = (defpackage.et8) r4
            java.lang.Object r18 = r1.get(r4)
            r7 = r18
            ft8 r7 = (defpackage.ft8) r7
            if (r7 == 0) goto L_0x00bb
            r2.put(r4, r7)
            goto L_0x00bb
        L_0x00d5:
            r4 = r2
        L_0x00d6:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r6
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = "unmuteOptions"
            boolean r1 = r9.has(r1)
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = "unmute"
            boolean r1 = r9.has(r1)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r15 = r6
            r14 = 2
            goto L_0x0105
        L_0x00f1:
            r7 = 0
            r18 = 0
            java.lang.String r3 = "handleMuteParticipant"
            r1 = r19
            r2 = r20
            r5 = r7
            r7 = r6
            r6 = r21
            r15 = r7
            r14 = 2
            r7 = r18
            r1.n(r2, r3, r4, r5, r6, r7)
        L_0x0105:
            kz9 r1 = r8.i
            ft8 r2 = r1.a
            ft8 r3 = r1.b
            ft8 r4 = r1.c
            ft8 r1 = r1.d
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ JSONException -> 0x016e }
            r5.<init>()     // Catch:{ JSONException -> 0x016e }
            java.lang.String r6 = "requestedMedia"
            org.json.JSONArray r6 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x016e }
            r7 = r16
        L_0x011c:
            int r9 = r6.length()     // Catch:{ JSONException -> 0x016e }
            if (r7 >= r9) goto L_0x0172
            java.lang.String r9 = r6.getString(r7)     // Catch:{ JSONException -> 0x016e }
            if (r9 != 0) goto L_0x012b
        L_0x0128:
            r9 = r17
            goto L_0x0167
        L_0x012b:
            int r18 = r9.hashCode()
            switch(r18) {
                case -214017395: goto L_0x014f;
                case 62628790: goto L_0x0146;
                case 81665115: goto L_0x013d;
                case 1982835689: goto L_0x0134;
                default: goto L_0x0132;
            }
        L_0x0132:
            r9 = -1
            goto L_0x0158
        L_0x0134:
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x013b
            goto L_0x0132
        L_0x013b:
            r9 = 3
            goto L_0x0158
        L_0x013d:
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0144
            goto L_0x0132
        L_0x0144:
            r9 = r14
            goto L_0x0158
        L_0x0146:
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x014d
            goto L_0x0132
        L_0x014d:
            r9 = r15
            goto L_0x0158
        L_0x014f:
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x0156
            goto L_0x0132
        L_0x0156:
            r9 = r16
        L_0x0158:
            switch(r9) {
                case 0: goto L_0x0165;
                case 1: goto L_0x0162;
                case 2: goto L_0x015f;
                case 3: goto L_0x015c;
                default: goto L_0x015b;
            }
        L_0x015b:
            goto L_0x0128
        L_0x015c:
            et8 r9 = defpackage.et8.c     // Catch:{ JSONException -> 0x016e }
            goto L_0x0167
        L_0x015f:
            et8 r9 = defpackage.et8.b     // Catch:{ JSONException -> 0x016e }
            goto L_0x0167
        L_0x0162:
            et8 r9 = defpackage.et8.a     // Catch:{ JSONException -> 0x016e }
            goto L_0x0167
        L_0x0165:
            et8 r9 = defpackage.et8.o     // Catch:{ JSONException -> 0x016e }
        L_0x0167:
            if (r9 == 0) goto L_0x016c
            r5.add(r9)     // Catch:{ JSONException -> 0x016e }
        L_0x016c:
            int r7 = r7 + r15
            goto L_0x011c
        L_0x016e:
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0172:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r15
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0180:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01b5
            java.lang.Object r9 = r0.next()
            et8 r9 = (defpackage.et8) r9
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x01ae
            if (r9 == r15) goto L_0x01a7
            if (r9 == r14) goto L_0x01a0
            r10 = 3
            if (r9 == r10) goto L_0x019a
            goto L_0x0180
        L_0x019a:
            et8 r9 = defpackage.et8.o
            r7.put(r9, r1)
            goto L_0x0180
        L_0x01a0:
            r10 = 3
            et8 r9 = defpackage.et8.c
            r7.put(r9, r4)
            goto L_0x0180
        L_0x01a7:
            r10 = 3
            et8 r9 = defpackage.et8.b
            r7.put(r9, r3)
            goto L_0x0180
        L_0x01ae:
            r10 = 3
            et8 r9 = defpackage.et8.a
            r7.put(r9, r2)
            goto L_0x0180
        L_0x01b5:
            et8 r0 = defpackage.et8.a
            ft8 r9 = defpackage.ft8.c
            if (r2 != r9) goto L_0x01c7
            boolean r2 = r5.contains(r0)
            if (r2 == 0) goto L_0x01c7
            r5.remove(r0)
            r7.remove(r0)
        L_0x01c7:
            et8 r0 = defpackage.et8.b
            if (r3 != r9) goto L_0x01d7
            boolean r2 = r5.contains(r0)
            if (r2 == 0) goto L_0x01d7
            r5.remove(r0)
            r7.remove(r0)
        L_0x01d7:
            et8 r0 = defpackage.et8.c
            if (r4 != r9) goto L_0x01e7
            boolean r2 = r5.contains(r0)
            if (r2 == 0) goto L_0x01e7
            r5.remove(r0)
            r7.remove(r0)
        L_0x01e7:
            et8 r0 = defpackage.et8.o
            if (r1 != r9) goto L_0x01f7
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x01f7
            r5.remove(r0)
            r7.remove(r0)
        L_0x01f7:
            if (r6 == 0) goto L_0x0200
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0200
            return
        L_0x0200:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x020c
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x021f
        L_0x020c:
            wz9 r0 = new wz9
            vz9 r1 = new vz9
            r1.<init>(r7)
            r2 = r22
            r0.<init>(r1, r2)
            b51 r1 = defpackage.b51.I0
            kotlin.jvm.functions.Function2 r2 = r8.c
            r2.invoke(r1, r0)
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc1.c(org.json.JSONObject, zwd, boolean):void");
    }

    public final kz9 f(JSONObject jSONObject, ue1 ue1, String str, Map map, boolean z) {
        HashMap hashMap;
        List list;
        ef1 ef1 = this.a;
        List list2 = null;
        ye1 j = ue1 != null ? ef1.j(ue1) : null;
        boolean z2 = !map.isEmpty();
        voc voc = this.b;
        if (z2) {
            hashMap = new HashMap(et8.values().length);
            et8 et8 = et8.a;
            ft8 ft8 = this.i.a;
            ft8 ft82 = (ft8) map.get(et8);
            if (ft82 != null) {
                ft8 = ft82;
            }
            hashMap.put(et8, ft8);
            et8 et82 = et8.b;
            ft8 ft83 = this.i.b;
            ft8 ft84 = (ft8) map.get(et82);
            if (ft84 != null) {
                ft83 = ft84;
            }
            hashMap.put(et82, ft83);
            et8 et83 = et8.c;
            ft8 ft85 = this.i.c;
            ft8 ft86 = (ft8) map.get(et83);
            if (ft86 != null) {
                ft85 = ft86;
            }
            hashMap.put(et83, ft85);
            et8 et84 = et8.o;
            ft8 ft87 = this.i.d;
            ft8 ft88 = (ft8) map.get(et84);
            if (ft88 != null) {
                ft87 = ft88;
            }
            hashMap.put(et84, ft87);
        } else if (Intrinsics.areEqual((Object) ue1, (Object) ef1.a.a)) {
            hashMap = new HashMap(et8.values().length);
            hashMap.put(et8.a, this.i.a);
            hashMap.put(et8.b, this.i.b);
            hashMap.put(et8.c, this.i.c);
            hashMap.put(et8.o, this.i.d);
        } else {
            if ((j != null ? j.b : null) != null) {
                hashMap = new HashMap(et8.values().length);
                hashMap.put(et8.a, j.b.a);
                et8 et85 = et8.b;
                kz9 kz9 = j.b;
                hashMap.put(et85, kz9.b);
                hashMap.put(et8.c, kz9.c);
                hashMap.put(et8.o, kz9.d);
            } else {
                hashMap = new LinkedHashMap();
                voc.log("CallMediaOptionsDelegate", "createParticipantMediaOptions null participant or null media options");
            }
        }
        if (z) {
            for (Map.Entry entry : tf6.p(jSONObject).entrySet()) {
                et8 et86 = (et8) entry.getKey();
                ft8 ft89 = (ft8) entry.getValue();
                if (ft89 != null) {
                    hashMap.put(et86, ft89);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("unmuteOptions");
        if (optJSONArray != null) {
            try {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        arrayList.add(et8.valueOf((String) optJSONArray.get(i2)));
                    } catch (IllegalArgumentException e2) {
                        voc.logException("CallMediaOptionsDelegate", "invalid MediaOption in " + str, e2);
                    }
                }
            } catch (JSONException e3) {
                voc.logException("CallMediaOptionsDelegate", str, e3);
            }
        }
        boolean optBoolean = jSONObject.optBoolean("unmute", false);
        if (jSONObject.has("roles")) {
            try {
                list = tf6.A(jSONObject);
            } catch (Exception unused) {
                if (j != null) {
                    list2 = j.e;
                }
                if (list2 == null) {
                    list = CollectionsKt.emptyList();
                }
            }
        } else {
            if (j != null) {
                list2 = j.e;
            }
            if (list2 == null) {
                list = CollectionsKt.emptyList();
            }
            list = list2;
        }
        kz9 kz92 = new kz9();
        et8 et87 = et8.a;
        kz92.a = a(et87, (ft8) hashMap.get(et87), list, arrayList, optBoolean);
        et8 et88 = et8.b;
        kz92.b = a(et88, (ft8) hashMap.get(et88), list, arrayList, optBoolean);
        et8 et89 = et8.c;
        kz92.c = a(et89, (ft8) hashMap.get(et89), list, arrayList, optBoolean);
        et8 et810 = et8.o;
        kz92.d = a(et810, (ft8) hashMap.get(et810), list, arrayList, optBoolean);
        return kz92;
    }

    public final Map g(zwd zwd, kc1 kc1) {
        int i2 = lc1.$EnumSwitchMapping$1[kc1.ordinal()];
        if (i2 == 1) {
            return h(zwd).a();
        }
        if (i2 != 2) {
            return MapsKt.emptyMap();
        }
        Map map = (Map) this.g.get(zwd);
        return map == null ? MapsKt.emptyMap() : map;
    }

    public final kz9 h(zwd zwd) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(zwd);
        if (obj == null) {
            obj = new kz9();
            linkedHashMap.put(zwd, obj);
        }
        return (kz9) obj;
    }

    public final void i(ue1 ue1, boolean z) {
        if (!z && Intrinsics.areEqual((Object) this.a.a.a, (Object) ue1)) {
            mo1 mo1 = new mo1(4, this.i);
            Object obj = mo1.get();
            ft8 ft8 = ft8.c;
            if (obj == ft8) {
                mo1.set(ft8.o);
            }
            mo1 mo12 = new mo1(5, this.i);
            if (mo12.get() == ft8) {
                mo12.set(ft8.o);
            }
            mo1 mo13 = new mo1(6, this.i);
            if (mo13.get() == ft8) {
                mo13.set(ft8.o);
            }
            mo1 mo14 = new mo1(7, this.i);
            if (mo14.get() == ft8) {
                mo14.set(ft8.o);
            }
        }
    }

    public final void j(ArrayList arrayList, ue1 ue1) {
        ye1 ye1 = this.a.a;
        if (Intrinsics.areEqual((Object) ue1, (Object) ye1.a)) {
            ArrayList arrayList2 = ye1.d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (arrayList.contains(xe1.b)) {
                e(new mo1(8, this.i));
                e(new mo1(9, this.i));
                e(new mo1(10, this.i));
                e(new mo1(11, this.i));
            }
        }
    }

    public final void k() {
        EnumMap a2 = this.i.a();
        b51 b51 = b51.O0;
        SetsKt.emptySet();
        this.c.invoke(b51, new vz9(a2));
    }

    public final void l(Map map, JSONObject jSONObject, String str, kc1 kc1, zwd zwd, boolean z) {
        kz9 kz9 = new kz9();
        et8 et8 = et8.a;
        ft8 ft8 = (ft8) map.get(et8);
        if (ft8 != null) {
            kz9.a = ft8;
        }
        et8 et82 = et8.b;
        ft8 ft82 = (ft8) map.get(et82);
        if (ft82 != null) {
            kz9.b = ft82;
        }
        et8 et83 = et8.c;
        ft8 ft83 = (ft8) map.get(et83);
        if (ft83 != null) {
            kz9.c = ft83;
        }
        et8 et84 = et8.o;
        ft8 ft84 = (ft8) map.get(et84);
        if (ft84 != null) {
            kz9.d = ft84;
        }
        kz9 h2 = h(zwd);
        EnumMap enumMap = new EnumMap(et8.class);
        ft8 ft85 = kz9.a;
        if (ft85 != h2.a) {
            enumMap.put(et8, ft85);
        }
        ft8 ft86 = kz9.b;
        if (ft86 != h2.b) {
            enumMap.put(et82, ft86);
        }
        ft8 ft87 = kz9.c;
        if (ft87 != h2.c) {
            enumMap.put(et83, ft87);
        }
        ft8 ft88 = kz9.d;
        if (ft88 != h2.d) {
            enumMap.put(et84, ft88);
        }
        if (!enumMap.isEmpty()) {
            this.g.put(zwd, enumMap);
            this.h.put(zwd, kz9);
            if (z) {
                n(jSONObject, str, g(zwd, kc1), false, zwd, (zwd) null);
            }
        }
    }

    public final void m(JSONObject jSONObject, String str, kc1 kc1, zwd zwd, boolean z) {
        Map emptyMap;
        if (jSONObject.has("muteStates")) {
            emptyMap = tf6.p(jSONObject);
        } else if (!jSONObject.has("requestedMedia")) {
            emptyMap = MapsKt.emptyMap();
        } else {
            return;
        }
        l(emptyMap, jSONObject, str, kc1, zwd, z);
    }

    public final void n(JSONObject jSONObject, String str, Map map, boolean z, zwd zwd, zwd zwd2) {
        if (zwd2 == null) {
            zwd2 = (zwd) this.e.invoke();
        }
        if (Intrinsics.areEqual((Object) zwd, (Object) zwd2)) {
            kz9 f2 = f(jSONObject, this.a.a.a, str, map, z);
            if (!Intrinsics.areEqual((Object) f2, (Object) this.i)) {
                this.i = f2;
                k();
            }
            this.g.put(zwd, MapsKt.emptyMap());
        }
    }
}
