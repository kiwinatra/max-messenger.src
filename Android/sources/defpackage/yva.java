package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Lazy;

/* renamed from: yva  reason: default package */
public final class yva {
    public static final /* synthetic */ int t = 0;
    public final Context a;
    public final cpa b;
    public final a33 c;
    public final Lazy d;
    public final Lazy e;
    public final ghf f;
    public int g = -1;
    public String h;
    public Pattern i;
    public final jtb j;
    public final u25 k;
    public final cpa l;
    public final i51 m;
    public final m95 n;
    public final xva o;
    public final Lazy p;
    public int q = -1;
    public int r = -1;
    public int s = -1;

    public yva(Context context, jtb jtb, u25 u25, i51 i51, cpa cpa, m95 m95, Lazy lazy, Lazy lazy2, ghf ghf, xva xva, Lazy lazy3) {
        this.a = context.getApplicationContext();
        this.c = ((ltb) jtb).a;
        this.b = cpa;
        this.d = lazy;
        this.f = ghf;
        this.e = lazy2;
        this.j = jtb;
        this.k = u25;
        this.m = i51;
        this.l = cpa;
        this.n = m95;
        this.o = xva;
        this.p = lazy3;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r17, boolean r18, boolean r19, boolean r20, boolean r21, java.util.List r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r23
            java.lang.String r5 = "OneMeLinksProcessor"
            java.lang.String r6 = "ONEME-6282"
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            if (r7 == 0) goto L_0x0015
            java.lang.String r0 = ""
            return r0
        L_0x0015:
            java.lang.String r7 = r1.h
            if (r7 != 0) goto L_0x0034
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = r1.a
            int r9 = defpackage.rkc.app_scheme
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            java.lang.String r8 = "://"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r1.h = r7
        L_0x0034:
            java.util.regex.Pattern r7 = r1.i
            if (r7 != 0) goto L_0x0051
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.h
            r7.append(r8)
            java.lang.String r8 = "[^\\s]+"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r1.i = r7
        L_0x0051:
            java.util.regex.Pattern r7 = defpackage.ihf.a
            boolean r7 = r0 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x005b
            android.text.Spannable r0 = (android.text.Spannable) r0
        L_0x0059:
            r7 = r0
            goto L_0x0060
        L_0x005b:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r17)
            goto L_0x0059
        L_0x0060:
            cpa r0 = r1.l
            int r8 = r0.a(r3)
            if (r20 == 0) goto L_0x006d
            sy7 r0 = defpackage.sy7.c
            defpackage.ihf.a(r7, r0, r2, r8)
        L_0x006d:
            if (r21 == 0) goto L_0x0072
            r0 = 7
            r9 = r0
            goto L_0x0073
        L_0x0072:
            r9 = 1
        L_0x0073:
            i51 r0 = r1.m
            r0.getClass()
            kotlin.Lazy r10 = r0.a
            r11 = 0
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9)     // Catch:{ all -> 0x0080 }
            goto L_0x00b1
        L_0x0080:
            r0 = move-exception
            r12 = r0
            boolean r0 = r12 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00a2
            java.lang.CharSequence r0 = defpackage.ld8.q0(r7)     // Catch:{ all -> 0x0091 }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x0091 }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9)     // Catch:{ all -> 0x0091 }
            goto L_0x00b1
        L_0x0091:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with mask text.safeCopy() failed"
            defpackage.z68.f(r5, r9, r0)
            java.lang.Object r9 = r10.getValue()
            e24 r9 = (defpackage.e24) r9
            r9.a(r6, r0)
        L_0x00a0:
            r0 = r11
            goto L_0x00b1
        L_0x00a2:
            java.lang.String r0 = "LinkifyCompat.addLinks with mask failed"
            defpackage.z68.f(r5, r0, r12)
            java.lang.Object r0 = r10.getValue()
            e24 r0 = (defpackage.e24) r0
            r0.a(r6, r12)
            goto L_0x00a0
        L_0x00b1:
            if (r0 != 0) goto L_0x00f2
            java.util.regex.Pattern r9 = r1.i
            java.lang.String r12 = r1.h
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9, r12)     // Catch:{ all -> 0x00bc }
            goto L_0x00ed
        L_0x00bc:
            r0 = move-exception
            r13 = r0
            boolean r0 = r13 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00de
            java.lang.CharSequence r0 = defpackage.ld8.q0(r7)     // Catch:{ all -> 0x00cd }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x00cd }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9, r12)     // Catch:{ all -> 0x00cd }
            goto L_0x00ed
        L_0x00cd:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with pattern text.safeCopy() failed"
            defpackage.z68.f(r5, r9, r0)
            java.lang.Object r5 = r10.getValue()
            e24 r5 = (defpackage.e24) r5
            r5.a(r6, r0)
        L_0x00dc:
            r0 = r11
            goto L_0x00ed
        L_0x00de:
            java.lang.String r0 = "LinkifyCompat.addLinks with pattern failed"
            defpackage.z68.f(r5, r0, r13)
            java.lang.Object r0 = r10.getValue()
            e24 r0 = (defpackage.e24) r0
            r0.a(r6, r13)
            goto L_0x00dc
        L_0x00ed:
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r0 = r11
            goto L_0x00f3
        L_0x00f2:
            r0 = 1
        L_0x00f3:
            if (r0 == 0) goto L_0x0174
            int r0 = r7.length()
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r7.getSpans(r11, r0, r5)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            if (r0 == 0) goto L_0x0174
            int r5 = r0.length
            if (r5 != 0) goto L_0x0108
            goto L_0x0174
        L_0x0108:
            int r5 = r7.length()
            java.lang.Class<ky7> r6 = defpackage.ky7.class
            java.lang.Object[] r5 = r7.getSpans(r11, r5, r6)
            ky7[] r5 = (defpackage.ky7[]) r5
            if (r5 == 0) goto L_0x0174
            int r6 = r5.length
            if (r6 != 0) goto L_0x011a
            goto L_0x0174
        L_0x011a:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r5 = java.util.Arrays.asList(r5)
            r6.<init>(r5)
            int r5 = r0.length
            r9 = r11
            r10 = r9
        L_0x0126:
            if (r9 >= r5) goto L_0x0174
            r12 = r0[r9]
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L_0x0131
            goto L_0x0174
        L_0x0131:
            int r13 = r7.getSpanStart(r12)
            if (r13 >= 0) goto L_0x0138
            goto L_0x013e
        L_0x0138:
            int r14 = r7.getSpanEnd(r12)
            if (r14 >= 0) goto L_0x0140
        L_0x013e:
            r4 = 1
            goto L_0x0171
        L_0x0140:
            r15 = r11
        L_0x0141:
            int r11 = r6.size()
            if (r15 >= r11) goto L_0x016d
            java.lang.Object r11 = r6.get(r15)
            ky7 r11 = (defpackage.ky7) r11
            int r4 = r7.getSpanStart(r11)
            if (r4 >= 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            int r11 = r7.getSpanEnd(r11)
            if (r11 >= 0) goto L_0x015c
        L_0x015a:
            r4 = 1
            goto L_0x016b
        L_0x015c:
            if (r4 != r13) goto L_0x0169
            if (r11 != r14) goto L_0x0169
            r7.removeSpan(r12)
            r6.remove(r15)
            r4 = 1
            r10 = 1
            goto L_0x016e
        L_0x0169:
            r4 = 1
            r10 = 1
        L_0x016b:
            int r15 = r15 + r4
            goto L_0x0141
        L_0x016d:
            r4 = 1
        L_0x016e:
            if (r10 != 0) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            int r9 = r9 + r4
            r11 = 0
            goto L_0x0126
        L_0x0174:
            sy7 r0 = defpackage.sy7.o
            defpackage.ihf.a(r7, r0, r2, r8)
            if (r22 == 0) goto L_0x01c8
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x01c8
            java.util.Iterator r4 = r22.iterator()
        L_0x0185:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r4.next()
            r5 = r0
            ta9 r5 = (defpackage.ta9) r5
            int r0 = r5.d
            int r6 = r5.e
            int r6 = r6 + r0
            java.lang.Class<k6c> r9 = defpackage.k6c.class
            java.lang.Object[] r0 = r7.getSpans(r0, r6, r9)
            r6 = r0
            k6c[] r6 = (defpackage.k6c[]) r6
            if (r6 == 0) goto L_0x01be
            int r0 = r6.length
            if (r0 > 0) goto L_0x01a6
            goto L_0x01be
        L_0x01a6:
            int r9 = r6.length
            r10 = 0
        L_0x01a8:
            if (r10 >= r9) goto L_0x01be
            r0 = r6[r10]
            r7.removeSpan(r0)     // Catch:{ Exception | StackOverflowError -> 0x01b1 }
        L_0x01af:
            r11 = 1
            goto L_0x01bc
        L_0x01b1:
            r0 = move-exception
            boolean r11 = r0 instanceof java.lang.StackOverflowError
            if (r11 == 0) goto L_0x01af
            m95 r11 = r1.n
            r11.a(r0)
            goto L_0x01af
        L_0x01bc:
            int r10 = r10 + r11
            goto L_0x01a8
        L_0x01be:
            r11 = 1
            r6 = 0
            java.lang.CharSequence r0 = r1.b(r7, r5, r6, r3)
            r7 = r0
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L_0x0185
        L_0x01c8:
            if (r19 == 0) goto L_0x01cf
            sy7 r0 = defpackage.sy7.b
            defpackage.ihf.a(r7, r0, r2, r8)
        L_0x01cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yva.a(java.lang.CharSequence, boolean, boolean, boolean, boolean, java.util.List, boolean):java.lang.CharSequence");
    }

    public final CharSequence b(CharSequence charSequence, ta9 ta9, boolean z, boolean z2) {
        if (ta9.g.contains(ta9.c)) {
            return charSequence;
        }
        int i2 = ta9.d;
        int i3 = ta9.e;
        int i4 = i2 + i3;
        if (i4 > charSequence.length() || i2 < 0) {
            z68.n("yva", (IOException) null, "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
            return charSequence;
        } else if (z && charSequence.charAt(i2) == '@') {
            return charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new xa9(ta9, this.b.a(z2)), i2, i4, 33);
            return spannableStringBuilder;
        }
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i2) {
        if (z) {
            spannableStringBuilder.insert(i2, "⁠ ");
            spannableStringBuilder.setSpan(new n2g(this.a, m2g.SMALL, false, new x89(z2, 2)), i2 + 1, i2 + 2, 33);
        }
    }

    public final String d(long j2) {
        a33 a33 = this.c;
        p01 z = j4b.z(j2, a33.m());
        Locale u = a33.u();
        String[] strArr = ghf.c;
        int y = tr1.y(z.b);
        Context context = this.a;
        long j3 = z.c;
        switch (y) {
            case 0:
                return context.getString(tmc.tt_dates_right_now);
            case 1:
                return ghf.s(zjc.tt_dates_minutes_past, (int) j3, context);
            case 2:
                return ghf.s(zjc.tt_dates_hours_past, (int) j3, context);
            case 3:
                return String.format(context.getString(tmc.tt_dates_yesterday_at), new Object[]{j4b.s(context, j3, u)});
            case 4:
                return ghf.s(zjc.tt_dates_days_past, (int) j3, context);
            case 5:
                return ghf.s(zjc.tt_dates_weeks_past, (int) j3, context);
            case 6:
                return ghf.s(zjc.tt_dates_months_past, (int) j3, context);
            case 7:
                return j4b.A(u, j3, true);
            default:
                return "";
        }
    }

    public final int e() {
        if (this.r == -1) {
            this.r = (int) this.a.getResources().getDimension(mad.d);
        }
        return this.r;
    }

    public final SpannableString f() {
        int i2 = tmc.tt_contact_status_online;
        Context context = this.a;
        String string = context.getString(i2);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new aif(fu4.k.e(context).f(), new oo9(13)), 0, string.length(), 33);
        return spannableString;
    }

    public final String g(ij0 ij0) {
        if (!(ij0 instanceof gea)) {
            return null;
        }
        boolean z = ij0 instanceof zub;
        Lazy lazy = this.d;
        Context context = this.a;
        if (z) {
            zub zub = (zub) ij0;
            String j2 = ((km3) lazy.getValue()).j(zub.o);
            a32 G = ((r62) this.e.getValue()).G(zub.c);
            if (G == null) {
                return null;
            }
            if (G.N()) {
                return String.format(context.getString(tmc.tt_privacy_restricted_dialog), new Object[]{j2});
            }
            StringBuilder sb = new StringBuilder();
            int i2 = zjc.tt_privacy_restricted_error;
            int size = zub.o.size();
            String[] strArr = ghf.c;
            sb.append(String.format(context.getResources().getQuantityString(i2, size), new Object[]{j2}));
            sb.append(" ");
            sb.append(ghf.v(G.r()));
            return sb.toString();
        } else if (ij0 instanceof udb) {
            return context.getString(tmc.tt_message_send_error);
        } else {
            if (ij0 instanceof px3) {
                px3 px3 = (px3) ij0;
                String j3 = ((km3) lazy.getValue()).j(px3.o);
                int i3 = zjc.tt_control_message_add_error;
                int size2 = px3.o.size();
                String[] strArr2 = ghf.c;
                return String.format(context.getResources().getQuantityString(i3, size2), new Object[]{j3});
            } else if (!(ij0 instanceof gw9)) {
                return null;
            } else {
                gw9 gw9 = (gw9) ij0;
                return "error.bad.karma".equals(gw9.b.b) ? gw9.b.o : context.getString(tmc.tt_message_send_error);
            }
        }
    }

    public final int h() {
        if (this.q == -1) {
            this.q = (int) (vo4.d(((ltb) this.j).c.g.getFloat("app.extra.text.size.sp", c44.DEFAULT_ASPECT_RATIO)) + this.a.getResources().getDimension(mad.b));
        }
        return this.q;
    }

    public final int i() {
        if (this.s == -1) {
            this.s = (int) (vo4.d(((ltb) this.j).c.g.getFloat("app.extra.text.size.sp", c44.DEFAULT_ASPECT_RATIO)) + this.a.getResources().getDimension(mad.e));
        }
        return this.s;
    }

    public final isb j(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? isb.a() : new isb(this.k.c(charSequence), hhf.e(charSequence.toString(), this));
    }

    public final isb k(String str, ArrayList arrayList) {
        return TextUtils.isEmpty(str) ? isb.a() : arrayList.isEmpty() ? j(str) : new isb(l(vo4.b(18), str, arrayList), hhf.e(str.toString(), this));
    }

    public final CharSequence l(int i2, CharSequence charSequence, List list) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean a2 = ((rk) this.p.getValue()).a();
        u25 u25 = this.k;
        if (!a2) {
            return u25.e(charSequence, i2);
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                try {
                    if (((ta9) next).c == sa9.Y) {
                        arrayList2.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        if (arrayList.isEmpty()) {
            return u25.e(charSequence, i2);
        }
        return this.o.a(charSequence, arrayList, wa9.a, false, i2, true);
    }

    public final CharSequence m(CharSequence charSequence, List list) {
        CharSequence charSequence2;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = this.o.a(charSequence, list, wa9.a, true, 0, false);
        }
        if (TextUtils.isEmpty(charSequence2) || cjf.B(list)) {
            return charSequence2;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ta9 ta9 = (ta9) it.next();
            if (ta9.c == sa9.a) {
                spannableStringBuilder = b(spannableStringBuilder, ta9, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
