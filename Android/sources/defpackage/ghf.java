package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.text.StringsKt;

/* renamed from: ghf  reason: default package */
public final class ghf {
    public static final String[] c = {"B", "kB", "MB", "GB", "TB"};
    public static final qv0 d = new qv0(8);
    public static final qv0 e = new qv0(9);
    public final Lazy a;
    public final Lazy b;

    static {
        Pattern.compile("#u([0-9a-f]{2,16})(#\\d+:\\d+)?s#");
    }

    public ghf(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public static CharSequence a(String str, vk3 vk3, yva yva, boolean z) {
        String f = vk3.f();
        int indexOf = str.indexOf(f);
        if (indexOf < 0) {
            return str;
        }
        int length = f.length() + indexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!z) {
            if (yva.g == -1) {
                Lazy lazy = scf.b0;
                yva.g = j4b.k0(yva.a).u;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(yva.g), indexOf, length, 33);
            spannableStringBuilder.setSpan(new em3(vk3.r()), indexOf, length, 33);
        }
        yva.c(spannableStringBuilder, vk3.z(), z, length);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(String str, q10 q10, vk3 vk3, yva yva, km3 km3, boolean z) {
        int indexOf;
        ws wsVar = new ws(0);
        wsVar.add(Long.valueOf(vk3.r()));
        wsVar.addAll(q10.c);
        wsVar.add(Long.valueOf(q10.b));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (yva.g == -1) {
            Lazy lazy = scf.b0;
            yva.g = j4b.k0(yva.a).u;
        }
        int i = yva.g;
        ps psVar = new ps(wsVar);
        while (psVar.hasNext()) {
            Long l = (Long) psVar.next();
            vk3 p = km3.p(l.longValue(), true);
            String f = p.f();
            if (!cvg.A(f) && (indexOf = spannableStringBuilder.toString().indexOf(f)) >= 0) {
                int length = f.length() + indexOf;
                if (!z) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), indexOf, length, 33);
                    spannableStringBuilder.setSpan(new em3(l.longValue()), indexOf, length, 33);
                }
                yva.c(spannableStringBuilder, p.z(), z, length);
            }
        }
        return spannableStringBuilder;
    }

    public static String c(Context context, Integer num, boolean z, u2f u2f) {
        String str = "";
        if (num == null) {
            return str;
        }
        if (z) {
            str = wj6.k(" ", context.getString(jad.a), " ");
        }
        if (num.intValue() > 1) {
            str = str + num + " ";
        }
        StringBuilder o = tr1.o(str);
        o.append((String) u2f.get());
        return o.toString();
    }

    public static String d(String str, String str2) {
        return g63.i(str, " ", str2);
    }

    public static String e(String str) {
        if (cvg.A(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String g(Context context, boolean z, boolean z2) {
        String string = z2 ? context.getString(tmc.tt_audio) : "";
        return z ? d("🎤", string) : StringsKt.capitalize(string);
    }

    public static String h(Context context, ha9 ha9, boolean z, boolean z2, long j) {
        String str;
        l10 d2 = ha9.d();
        if (d2 == null) {
            return "";
        }
        int i = (ha9.w > j ? 1 : (ha9.w == j ? 0 : -1));
        boolean z3 = false;
        boolean z4 = i != 0;
        boolean z5 = z4 && (d2.c() || d2.a());
        boolean z6 = d2.d() || (!z4 && d2.a());
        if (d2.c == 2) {
            z3 = true;
        }
        if (z6 && z3) {
            str = z2 ? context.getString(tmc.tt_call_outgoing_canceled_video_cap) : context.getString(tmc.tt_call_outgoing_canceled_video);
        } else if (z6) {
            str = z2 ? context.getString(tmc.tt_call_outgoing_canceled_audio_cap) : context.getString(tmc.tt_call_outgoing_canceled_audio);
        } else if (z5 && z3) {
            str = z2 ? context.getString(tmc.tt_call_missed_audio_cap) : context.getString(tmc.tt_call_missed_audio);
        } else if (z5) {
            str = z2 ? context.getString(tmc.tt_call_missed_audio_cap) : context.getString(tmc.tt_call_missed_audio);
        } else if (z4 && z3) {
            StringBuilder o = tr1.o(z2 ? context.getString(tmc.tt_call_incoming_video_cap) : context.getString(tmc.tt_call_incoming_video));
            o.append(i(d2));
            str = o.toString();
        } else if (z4) {
            StringBuilder o2 = tr1.o(z2 ? context.getString(tmc.tt_call_incoming_audio_cap) : context.getString(tmc.tt_call_incoming_audio));
            o2.append(i(d2));
            str = o2.toString();
        } else if (z3) {
            StringBuilder o3 = tr1.o(z2 ? context.getString(tmc.tt_call_outgoing_video_cap) : context.getString(tmc.tt_call_outgoing_video));
            o3.append(i(d2));
            str = o3.toString();
        } else {
            StringBuilder o4 = tr1.o(z2 ? context.getString(tmc.tt_call_outgoing_audio_cap) : context.getString(tmc.tt_call_outgoing_audio));
            o4.append(i(d2));
            str = o4.toString();
        }
        return z ? d("📞", str) : str;
    }

    public static String i(l10 l10) {
        long j = l10.e;
        return j == 0 ? "" : " ".concat(b0h.c(j));
    }

    public static String j(Context context, n10 n10, bl3 bl3, boolean z, boolean z2) {
        String str;
        try {
            str = bs0.H(bl3.b(n10), n10);
        } catch (Exception unused) {
            str = null;
        }
        if (cvg.A(str)) {
            str = context.getString(tmc.tt_contact);
        } else if (!z2) {
            str = context.getString(tmc.tt_contact_with_name, new Object[]{str});
        }
        return z ? d("👤", str) : StringsKt.capitalize(str);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v39, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v49, types: [java.lang.CharSequence] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence k(android.content.Context r15, defpackage.yva r16, defpackage.km3 r17, boolean r18, defpackage.ha9 r19, defpackage.vk3 r20, boolean r21, boolean r22, long r23) {
        /*
            r6 = r15
            r7 = r16
            r8 = r20
            r0 = 1
            java.lang.String r9 = ""
            if (r18 == 0) goto L_0x0069
            q10 r1 = r19.f()
            p10 r2 = r1.a
            int r2 = r2.ordinal()
            if (r2 == r0) goto L_0x0061
            r0 = 5
            if (r2 == r0) goto L_0x003d
            r0 = 6
            if (r2 == r0) goto L_0x0025
            r0 = 7
            if (r2 == r0) goto L_0x0021
            goto L_0x0275
        L_0x0021:
            java.lang.String r9 = r1.i
            goto L_0x0275
        L_0x0025:
            java.lang.String r0 = r1.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0035
            int r0 = defpackage.tmc.tt_control_change_icon_admin
            java.lang.String r9 = r15.getString(r0)
            goto L_0x0275
        L_0x0035:
            int r0 = defpackage.tmc.tt_control_remove_icon_admin
            java.lang.String r9 = r15.getString(r0)
            goto L_0x0275
        L_0x003d:
            java.lang.String r0 = r1.d
            java.lang.String r0 = v(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0059
            int r1 = defpackage.tmc.tt_control_change_title_admin
            java.lang.String r1 = r15.getString(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r9 = java.lang.String.format(r1, r0)
            goto L_0x0275
        L_0x0059:
            int r0 = defpackage.tmc.tt_control_remove_title_admin
            java.lang.String r9 = r15.getString(r0)
            goto L_0x0275
        L_0x0061:
            int r0 = defpackage.tmc.tt_control_create_chat_admin
            java.lang.String r9 = r15.getString(r0)
            goto L_0x0275
        L_0x0069:
            q10 r10 = r19.f()
            boolean r11 = r8.w
            long r1 = r10.b
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            java.util.ArrayList r2 = r10.c
            r12 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r13 = r12
            goto L_0x0086
        L_0x0085:
            r13 = r0
        L_0x0086:
            java.lang.String r14 = r20.f()
            p10 r1 = r10.a
            int r3 = r1.ordinal()
            switch(r3) {
                case 1: goto L_0x0236;
                case 2: goto L_0x0178;
                case 3: goto L_0x0178;
                case 4: goto L_0x0155;
                case 5: goto L_0x0101;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00c1;
                case 8: goto L_0x009d;
                case 9: goto L_0x0093;
                case 10: goto L_0x0095;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x0275
        L_0x0095:
            int r0 = defpackage.tmc.tt_bot_control_welcome_message
            java.lang.String r9 = r15.getString(r0)
            goto L_0x0275
        L_0x009d:
            int r3 = defpackage.tmc.tt_control_join_by_link_you
            int r4 = defpackage.tmc.tt_control_join_by_link_m
            int r5 = defpackage.tmc.tt_control_join_by_link_f
            int r9 = defpackage.tmc.tt_control_join_by_link
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x00b8
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x00b8:
            if (r21 == 0) goto L_0x00be
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
        L_0x00be:
            r9 = r0
            goto L_0x0275
        L_0x00c1:
            java.lang.String r9 = r10.i
            goto L_0x0275
        L_0x00c5:
            java.lang.String r0 = r10.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00df
            int r3 = defpackage.tmc.tt_control_change_icon_you
            int r4 = defpackage.tmc.tt_control_change_icon_m
            int r5 = defpackage.tmc.tt_control_change_icon_f
            int r9 = defpackage.tmc.tt_control_change_icon
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f0
        L_0x00df:
            int r3 = defpackage.tmc.tt_control_remove_icon_you
            int r4 = defpackage.tmc.tt_control_remove_icon_m
            int r5 = defpackage.tmc.tt_control_remove_icon_f
            int r9 = defpackage.tmc.tt_control_remove_icon
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
        L_0x00f0:
            if (r11 != 0) goto L_0x00fa
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x00fa:
            if (r21 == 0) goto L_0x00be
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00be
        L_0x0101:
            java.lang.String r0 = r10.d
            java.lang.String r9 = v(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0132
            int r3 = defpackage.tmc.tt_control_change_title_you
            int r4 = defpackage.tmc.tt_control_change_title_m
            int r5 = defpackage.tmc.tt_control_change_title_f
            int r10 = defpackage.tmc.tt_control_change_title
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r10
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto L_0x0129
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x014d
        L_0x0129:
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r9}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x014d
        L_0x0132:
            int r3 = defpackage.tmc.tt_control_remove_title_you
            int r4 = defpackage.tmc.tt_control_remove_title_m
            int r5 = defpackage.tmc.tt_control_remove_title_f
            int r9 = defpackage.tmc.tt_control_remove_title
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x014d
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x014d:
            if (r21 == 0) goto L_0x00be
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00be
        L_0x0155:
            int r3 = defpackage.tmc.tt_control_leave_chat_you
            int r4 = defpackage.tmc.tt_control_leave_chat_m
            int r5 = defpackage.tmc.tt_control_leave_chat_f
            int r9 = defpackage.tmc.tt_control_leave_chat
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x0170
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0170:
            if (r21 == 0) goto L_0x00be
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00be
        L_0x0178:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0186
            r12.addAll(r2)
        L_0x0186:
            long r2 = r10.b
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0195
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.add(r2)
        L_0x0195:
            long r2 = r20.r()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.remove(r2)
            int r1 = r1.ordinal()
            r2 = 2
            if (r1 == r2) goto L_0x01ae
            r2 = 3
            if (r1 == r2) goto L_0x01ae
            r4 = r17
            goto L_0x0225
        L_0x01ae:
            if (r13 == 0) goto L_0x01d2
            int r1 = r12.size()
            if (r1 == r0) goto L_0x01b8
            if (r22 == 0) goto L_0x01d2
        L_0x01b8:
            r2 = 1
            r4 = 1
            r0 = r15
            r1 = r20
            r3 = r11
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r20.f()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r4 = r17
            goto L_0x0226
        L_0x01d2:
            r2 = 0
            r4 = 0
            r0 = r15
            r1 = r20
            r3 = r11
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x01fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            int r2 = defpackage.tmc.tt_control_you
            java.lang.String r2 = r15.getString(r2)
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            r12.remove(r1)
        L_0x01fd:
            java.lang.StringBuilder r1 = defpackage.tr1.o(r9)
            r4 = r17
            java.lang.String r2 = r4.j(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r11 == 0) goto L_0x0219
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r9 = java.lang.String.format(r0, r1)
            goto L_0x0225
        L_0x0219:
            java.lang.String r2 = r20.f()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r9 = java.lang.String.format(r0, r1)
        L_0x0225:
            r0 = r9
        L_0x0226:
            if (r21 == 0) goto L_0x00be
            r5 = 0
            r1 = r10
            r2 = r20
            r3 = r16
            r4 = r17
            android.text.SpannableStringBuilder r0 = b(r0, r1, r2, r3, r4, r5)
            goto L_0x00be
        L_0x0236:
            if (r11 != 0) goto L_0x0252
            if (r22 == 0) goto L_0x0252
            r2 = 1
            r3 = 0
            r4 = 1
            r0 = r15
            r1 = r20
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r20.f()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x026d
        L_0x0252:
            int r3 = defpackage.tmc.tt_control_create_chat_you
            int r4 = defpackage.tmc.tt_control_create_chat_m
            int r5 = defpackage.tmc.tt_control_create_chat_f
            int r9 = defpackage.tmc.tt_control_create_chat
            r0 = r15
            r1 = r20
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x026d
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x026d:
            if (r21 == 0) goto L_0x00be
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00be
        L_0x0275:
            boolean r0 = defpackage.cvg.A(r9)
            if (r0 == 0) goto L_0x027f
            r0 = r19
            java.lang.String r9 = r0.y
        L_0x027f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghf.k(android.content.Context, yva, km3, boolean, ha9, vk3, boolean, boolean, long):java.lang.CharSequence");
    }

    public static String l(Context context, vk3 vk3, boolean z, boolean z2, boolean z3, q10 q10) {
        p10 p10 = q10.a;
        int ordinal = p10.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            return "";
        }
        p10 p102 = p10.c;
        if (z || z3) {
            if (p10 == p102 || p10 == p10.b) {
                return p(context, vk3, false, 0, tmc.tt_control_user_add_you_m, tmc.tt_control_user_add_you_f, tmc.tt_control_user_add_you);
            }
            int i = tmc.tt_control_user_remove_you_m;
            return p(context, vk3, false, 0, i, tmc.tt_control_user_remove_you_f, i);
        } else if (p10 == p102) {
            return p(context, vk3, z2, tmc.tt_control_you_add_user, tmc.tt_control_user_add_m, tmc.tt_control_user_add_f, tmc.tt_control_user_add);
        } else {
            return p(context, vk3, z2, tmc.tt_control_you_remove_user, tmc.tt_control_user_remove_m, tmc.tt_control_user_remove_f, tmc.tt_control_user_remove);
        }
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        int log10 = (int) (Math.log10((double) j) / Math.log10(1024.0d));
        if (log10 > 4) {
            return 4;
        }
        return log10;
    }

    public static String n(String str) {
        if (cvg.A(str)) {
            return str;
        }
        String[] split = str.trim().split("\\s");
        return split.length > 0 ? split[0] : str;
    }

    public static String o(Context context, int i, int i2, int i3, int i4) {
        return i == 2 ? context.getString(i2) : i == 3 ? context.getString(i3) : context.getString(i4);
    }

    public static String p(Context context, vk3 vk3, boolean z, int i, int i2, int i3, int i4) {
        return z ? context.getString(i) : o(context, vk3.a.c.l, i2, i3, i4);
    }

    public static String q(Context context, String str, boolean z, int i, String str2) {
        return z ? String.format(o(context, i, tmc.tt_message_sent_dialog_m, tmc.tt_message_sent_dialog_f, tmc.tt_message_sent_dialog), new Object[]{str}) : String.format(o(context, i, tmc.tt_message_sent_chat_m, tmc.tt_message_sent_chat_f, tmc.tt_message_sent_chat), new Object[]{str, str2});
    }

    public static String r(Context context, boolean z, boolean z2) {
        String string = context.getString(z ? tmc.tt_gif : tmc.tt_photo);
        return z2 ? d("📷", string) : StringsKt.capitalize(string);
    }

    public static String s(int i, int i2, Context context) {
        return String.format(context.getResources().getQuantityString(i, i2), new Object[]{Integer.valueOf(i2)});
    }

    public static String t(Context context, boolean z) {
        String string = context.getString(tmc.tt_video);
        return z ? d("🎬", string) : StringsKt.capitalize(string);
    }

    public static void u(HashMap hashMap, dhf dhf) {
        Integer num = (Integer) hashMap.get(dhf);
        hashMap.put(dhf, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static String v(String str) {
        return cvg.A(str) ? "" : wj6.k("«", str, "»");
    }

    public static String w(int i, long j, Context context, boolean z) {
        if (j <= 0) {
            return "0";
        }
        double pow = ((double) j) / Math.pow(1024.0d, (double) i);
        return g63.i(((!z || i != 0) && i != 1) ? ((DecimalFormat) e.get()).format(pow) : ((DecimalFormat) d.get()).format(pow), " ", context != null ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? context.getString(tmc.tt_file_size_unit_b) : context.getString(tmc.tt_file_size_unit_tb) : context.getString(tmc.tt_file_size_unit_gb) : context.getString(tmc.tt_file_size_unit_mb) : context.getString(tmc.tt_file_size_unit_kb) : context.getString(tmc.tt_file_size_unit_b) : c[i]);
    }

    public static String x(long j, boolean z, Context context) {
        return j <= 0 ? "0" : w(m(j), j, context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: y10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(android.content.Context r15, defpackage.yva r16, defpackage.ha9 r17, boolean r18, boolean r19, boolean r20, boolean r21, long r22, boolean r24) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r18
            boolean r3 = r17.o()
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0014
            boolean r3 = r17.r()
            if (r3 != 0) goto L_0x0014
            return r4
        L_0x0014:
            boolean r3 = r17.C()
            r5 = r17
            w28 r6 = r5.x0
            r7 = 0
            if (r3 != 0) goto L_0x0157
            boolean r3 = r17.G()
            if (r3 == 0) goto L_0x0027
            goto L_0x0157
        L_0x0027:
            boolean r3 = r17.w()
            if (r3 == 0) goto L_0x0034
            r3 = r21
            java.lang.String r0 = g(r15, r2, r3)
            return r0
        L_0x0034:
            boolean r3 = r17.x()
            if (r3 == 0) goto L_0x0047
            r3 = 1
            r0 = r15
            r1 = r17
            r2 = r18
            r4 = r22
            java.lang.String r0 = h(r0, r1, r2, r3, r4)
            return r0
        L_0x0047:
            boolean r3 = r17.F()
            r8 = 0
            if (r3 == 0) goto L_0x009b
            f20 r0 = r17.l()
            int r3 = r0.j
            android.content.Context r3 = r1.a
            int r4 = defpackage.tmc.tt_sticker
            java.lang.String r3 = r3.getString(r4)
            if (r24 == 0) goto L_0x008d
            java.util.List r0 = r0.g
            if (r0 == 0) goto L_0x0086
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0086
            java.util.Iterator r0 = r0.iterator()
        L_0x006c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            u25 r5 = r1.k
            boolean r5 = r5.g(r4, r7)
            if (r5 == 0) goto L_0x006c
            java.lang.String r0 = " "
            java.lang.String r8 = defpackage.g63.i(r4, r0, r3)
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            java.lang.String r0 = kotlin.text.StringsKt.capitalize(r8)
            goto L_0x009a
        L_0x008d:
            if (r2 == 0) goto L_0x0096
            java.lang.String r0 = "🌄"
            java.lang.String r0 = d(r0, r3)
            goto L_0x009a
        L_0x0096:
            java.lang.String r0 = kotlin.text.StringsKt.capitalize(r3)
        L_0x009a:
            return r0
        L_0x009b:
            boolean r1 = r17.E()
            if (r1 == 0) goto L_0x00ba
            if (r19 == 0) goto L_0x00a6
            int r1 = defpackage.tmc.tt_link_acs
            goto L_0x00a8
        L_0x00a6:
            int r1 = defpackage.tmc.tt_link
        L_0x00a8:
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x00b5
            java.lang.String r1 = "🔗"
            java.lang.String r0 = d(r1, r0)
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r0 = kotlin.text.StringsKt.capitalize(r0)
        L_0x00b9:
            return r0
        L_0x00ba:
            boolean r1 = r17.o()
            if (r1 == 0) goto L_0x00d7
            g20 r1 = defpackage.g20.z
            l20 r1 = r6.I(r1)
            if (r1 == 0) goto L_0x00d7
            int r1 = defpackage.tmc.tt_game
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x00d6
            java.lang.String r1 = "🎮"
            java.lang.String r0 = d(r1, r0)
        L_0x00d6:
            return r0
        L_0x00d7:
            boolean r1 = r17.A()
            if (r1 == 0) goto L_0x00ec
            s10 r0 = r17.g()
            java.lang.String r0 = r0.c
            if (r2 == 0) goto L_0x00eb
            java.lang.String r1 = "📄"
            java.lang.String r0 = d(r1, r0)
        L_0x00eb:
            return r0
        L_0x00ec:
            boolean r1 = r17.y()
            if (r1 == 0) goto L_0x0104
            n10 r1 = r17.e()
            r3 = r14
            kotlin.Lazy r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            bl3 r3 = (defpackage.bl3) r3
            java.lang.String r0 = j(r15, r1, r3, r2, r7)
            return r0
        L_0x0104:
            boolean r1 = r17.D()
            if (r1 == 0) goto L_0x012f
            boolean r1 = r17.D()
            if (r1 == 0) goto L_0x0118
            g20 r1 = defpackage.g20.Z
            l20 r1 = r6.I(r1)
            y10 r8 = r1.l
        L_0x0118:
            int r1 = r8.e
            r3 = 4
            if (r1 != r3) goto L_0x0120
            int r1 = defpackage.tmc.tt_present_accepted
            goto L_0x0122
        L_0x0120:
            int r1 = defpackage.tmc.tt_present
        L_0x0122:
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x012e
            java.lang.String r1 = "🎁"
            java.lang.String r0 = d(r1, r0)
        L_0x012e:
            return r0
        L_0x012f:
            boolean r1 = r17.B()
            if (r1 == 0) goto L_0x0149
            int r1 = defpackage.tmc.tt_location
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x0144
            java.lang.String r1 = "📍"
            java.lang.String r0 = d(r1, r0)
            goto L_0x0148
        L_0x0144:
            java.lang.String r0 = kotlin.text.StringsKt.capitalize(r0)
        L_0x0148:
            return r0
        L_0x0149:
            boolean r1 = r17.r()
            if (r1 == 0) goto L_0x0156
            int r1 = defpackage.tmc.tt_keyboard
            java.lang.String r0 = r15.getString(r1)
            return r0
        L_0x0156:
            return r4
        L_0x0157:
            g20 r1 = defpackage.g20.c
            r3 = 1
            if (r20 == 0) goto L_0x0189
            boolean r2 = r17.C()
            boolean r4 = r17.G()
            if (r2 == 0) goto L_0x0175
            if (r4 == 0) goto L_0x0175
            int r1 = defpackage.tmc.tt_photo_and_video
            java.lang.String r0 = r15.getString(r1)
            java.lang.String r1 = "📷"
            java.lang.String r0 = d(r1, r0)
            goto L_0x0188
        L_0x0175:
            if (r2 == 0) goto L_0x0184
            l20 r1 = r6.I(r1)
            x10 r1 = r1.b
            boolean r1 = r1.v
            java.lang.String r0 = r(r15, r1, r3)
            goto L_0x0188
        L_0x0184:
            java.lang.String r0 = t(r15, r3)
        L_0x0188:
            return r0
        L_0x0189:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r8 = r7
        L_0x018f:
            int r9 = r6.G()
            dhf r10 = defpackage.dhf.c
            dhf r11 = defpackage.dhf.a
            dhf r12 = defpackage.dhf.b
            if (r8 >= r9) goto L_0x01b7
            l20 r9 = r6.F(r8)
            g20 r13 = r9.a
            if (r13 != r1) goto L_0x01b1
            x10 r9 = r9.b
            boolean r9 = r9.v
            if (r9 == 0) goto L_0x01ad
            u(r5, r12)
            goto L_0x01b4
        L_0x01ad:
            u(r5, r11)
            goto L_0x01b4
        L_0x01b1:
            u(r5, r10)
        L_0x01b4:
            int r8 = r8 + 1
            goto L_0x018f
        L_0x01b7:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x01bf
            goto L_0x023c
        L_0x01bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            dhf r4 = defpackage.dhf.o
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            t52 r6 = new t52
            r6.<init>(r15, r2)
            java.lang.String r4 = c(r15, r4, r7, r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r4 = defpackage.tr1.o(r1)
            java.lang.Object r6 = r5.get(r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r1 = defpackage.cvg.A(r1)
            r1 = r1 ^ r3
            t9c r7 = new t9c
            r8 = 1
            r7.<init>(r8, r15, r2)
            java.lang.String r1 = c(r15, r6, r1, r7)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r4 = defpackage.tr1.o(r1)
            java.lang.Object r6 = r5.get(r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r1 = defpackage.cvg.A(r1)
            r1 = r1 ^ r3
            t9c r7 = new t9c
            r8 = 2
            r7.<init>(r8, r15, r2)
            java.lang.String r1 = c(r15, r6, r1, r7)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r4 = defpackage.tr1.o(r1)
            java.lang.Object r5 = r5.get(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            boolean r1 = defpackage.cvg.A(r1)
            r1 = r1 ^ r3
            t9c r3 = new t9c
            r6 = 3
            r3.<init>(r6, r15, r2)
            java.lang.String r0 = c(r15, r5, r1, r3)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
        L_0x023c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghf.f(android.content.Context, yva, ha9, boolean, boolean, boolean, boolean, long, boolean):java.lang.String");
    }
}
