package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;

/* renamed from: sj5  reason: default package */
public final class sj5 {
    public final String a = "mc";
    public final String b = "msgid";
    public final String c = "type";
    public final String d = "ConversationReadOnOtherDevice";
    public final String e = "trid";
    public final String f = "ctime";
    public final String g = "ttime";
    public final String h = "eKey";
    public final String i = "suid";
    public final String j = "largeImageUrl";
    public final String k = "fireM";
    public final String l = "err";
    public final Function1 m;

    public sj5() {
        of3 of3 = new of3(17);
        this.m = of3;
    }

    public final cj5 a(ts tsVar, long j2, long j3) {
        ts tsVar2 = tsVar;
        String str = (String) tsVar2.get(this.e);
        long parseLong = str != null ? Long.parseLong(str) : 0;
        long parseLong2 = Long.parseLong((String) MapsKt.getValue(tsVar2, this.a));
        long parseLong3 = Long.parseLong((String) MapsKt.getValue(tsVar2, this.b));
        hj5 hj5 = hj5.NOT_SENT;
        String str2 = (String) tsVar2.get(this.i);
        Long l2 = str2 != null ? (Long) this.m.invoke(Long.valueOf(Long.parseLong(str2))) : null;
        Iterator it = ((os) tsVar.entrySet()).iterator();
        long j4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Charset charset = Charsets.UTF_8;
            j4 = ((long) ((String) entry.getKey()).getBytes(charset).length) + ((long) ((String) entry.getValue()).getBytes(charset).length) + j4;
            parseLong = parseLong;
        }
        long j5 = parseLong;
        String str3 = (String) tsVar2.get(this.g);
        Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        String str4 = (String) tsVar2.get(this.h);
        String str5 = (String) tsVar2.get(this.c);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        long c2 = c(tsVar2, LongCompanionObject.MAX_VALUE);
        String str7 = (String) tsVar2.get(this.f);
        return new cj5(j5, parseLong2, parseLong3, hj5, l2, j4, valueOf, str4, j2, j3, str6, c2, str7 != null ? Long.parseLong(str7) : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mj5 b(defpackage.ts r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "gc"
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0011
            pj5 r2 = defpackage.pj5.GROUP_CHAT
        L_0x000f:
            r9 = r2
            goto L_0x002f
        L_0x0011:
            ejd r2 = defpackage.pj5.b
            java.lang.String r4 = r0.c
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0026
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r4 = r4.toString()
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            r2.getClass()
            pj5 r2 = defpackage.ejd.b(r4)
            goto L_0x000f
        L_0x002f:
            pj5 r2 = defpackage.pj5.GROUP_CHAT
            r4 = 1
            r5 = 0
            if (r9 != r2) goto L_0x0037
            r2 = r4
            goto L_0x0038
        L_0x0037:
            r2 = r5
        L_0x0038:
            r2 = r2 ^ r4
            java.lang.String r4 = r0.a
            java.lang.Object r4 = kotlin.collections.MapsKt.getValue(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x013c
            long r6 = java.lang.Long.parseLong(r4)
            mj5 r23 = new mj5
            java.lang.String r4 = r0.b
            java.lang.Object r4 = kotlin.collections.MapsKt.getValue(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            long r10 = java.lang.Long.parseLong(r4)
            java.lang.String r4 = "title"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x006e
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r12 = r4
            goto L_0x006f
        L_0x006e:
            r12 = r8
        L_0x006f:
            if (r2 == 0) goto L_0x008a
            java.lang.String r4 = "userName"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0088
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r13 = r4
            goto L_0x008b
        L_0x0088:
            r13 = r8
            goto L_0x008b
        L_0x008a:
            r13 = r3
        L_0x008b:
            r14 = 0
            if (r2 == 0) goto L_0x00b1
            java.lang.String r2 = r0.i
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00aa
            long r2 = java.lang.Long.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            kotlin.jvm.functions.Function1 r3 = r0.m
            java.lang.Object r2 = r3.invoke(r2)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x00aa:
            if (r3 == 0) goto L_0x00b1
            long r2 = r3.longValue()
            goto L_0x00b2
        L_0x00b1:
            r2 = r14
        L_0x00b2:
            long r16 = r0.c(r1, r14)
            java.lang.String r4 = "msg"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00ce
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x00cb
            goto L_0x00ce
        L_0x00cb:
            r18 = r4
            goto L_0x00d0
        L_0x00ce:
            r18 = r8
        L_0x00d0:
            java.lang.String r4 = r0.e
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00de
            long r14 = java.lang.Long.parseLong(r4)
        L_0x00de:
            r19 = r14
            java.lang.String r4 = r0.h
            java.lang.Object r4 = r1.get(r4)
            r21 = r4
            java.lang.String r21 = (java.lang.String) r21
            java.lang.String r4 = r0.j
            java.lang.Object r4 = r1.get(r4)
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r4 = r0.k
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x010b
            java.lang.Boolean r4 = kotlin.text.StringsKt.toBooleanStrictOrNull(r4)
            if (r4 == 0) goto L_0x010b
            boolean r4 = r4.booleanValue()
            r24 = r4
            goto L_0x010d
        L_0x010b:
            r24 = r5
        L_0x010d:
            java.lang.String r0 = r0.l
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0122
            java.lang.Boolean r0 = kotlin.text.StringsKt.toBooleanStrictOrNull(r0)
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.booleanValue()
            goto L_0x0123
        L_0x0122:
            r0 = r5
        L_0x0123:
            r4 = r23
            r5 = r6
            r7 = r10
            r10 = r12
            r11 = r13
            r12 = r2
            r14 = r16
            r16 = r18
            r17 = r19
            r19 = r21
            r20 = r22
            r21 = r24
            r22 = r0
            r4.<init>(r5, r7, r9, r10, r11, r12, r14, r16, r17, r19, r20, r21, r22)
            return r23
        L_0x013c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj5.b(ts):mj5");
    }

    public final long c(ts tsVar, long j2) {
        if (tsVar.containsKey("ectime")) {
            String str = (String) tsVar.get("ectime");
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0;
        }
        String str2 = this.f;
        if (!tsVar.containsKey(str2)) {
            return j2;
        }
        String str3 = (String) tsVar.get(str2);
        return (str3 != null ? Long.parseLong(str3) : 500) - ((long) 500);
    }
}
