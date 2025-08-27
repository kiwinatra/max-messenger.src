package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* renamed from: hl1  reason: default package */
public final class hl1 {
    public final Context a;

    public hl1(Context context) {
        this.a = context;
    }

    public static String c(Long l) {
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        long j = (long) 3600;
        long j2 = longValue / j;
        long j3 = (long) 60;
        long j4 = (longValue % j) / j3;
        long j5 = longValue % j3;
        if (j2 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final SpannableStringBuilder a(boolean z) {
        Integer valueOf = Integer.valueOf(ykc.call_incoming_video_call);
        if (!z) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : ykc.call_incoming_audio_call;
        Context context = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a81.m("   ", context.getString(intValue)));
        Drawable b = ew3.b(context, pqa.y);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new bq5(b, (vp5) null, 6), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder b(CharSequence charSequence, boolean z, lge lge, boolean z2, boolean z3, boolean z4, me5 me5) {
        Drawable drawable;
        if (charSequence == null) {
            return null;
        }
        if (z && (((me5 instanceof je5) || (me5 instanceof le5)) && z3)) {
            drawable = f();
        } else if (z || !z2 || (me5 instanceof je5) || (me5 instanceof le5)) {
            Context context = this.a;
            if (!z && z4) {
                int i = pec.ic_share_screen_20;
                int i2 = l2b.f.f;
                drawable = ew3.b(context, i);
                iq.a0(drawable, i2);
                float f = (float) 12;
                drawable.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            } else if (lge == lge.b) {
                int i3 = pec.ic_microphone_disable_12;
                int i4 = l2b.f.f;
                drawable = ew3.b(context, i3);
                iq.a0(drawable, i4);
                float f2 = (float) 12;
                drawable.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            } else if (lge == lge.a) {
                lee lee = new lee(fu4.k.e(context).f(), new gl1(0));
                float f3 = (float) 12;
                lee.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                drawable = lee;
            } else {
                drawable = null;
            }
        } else {
            drawable = f();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(charSequence));
        if (drawable != null) {
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new bq5(drawable, (vp5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String d(boolean z, boolean z2, boolean z3, me5 me5) {
        Context context = this.a;
        if (!z3 && !z2 && (((me5 instanceof je5) || (me5 instanceof le5)) && !z)) {
            return context.getString(ykc.call_waiting);
        }
        boolean z4 = me5 instanceof je5;
        if ((z4 || (me5 instanceof le5)) && !z3) {
            return context.getString(ykc.call_connecting);
        }
        if (z4 || (me5 instanceof le5)) {
            return context.getString(ykc.call_reconnecting);
        }
        if (!(me5 instanceof ge5)) {
            return null;
        }
        int ordinal = ((ge5) me5).b.ordinal();
        if (ordinal == 0) {
            return context.getString(ykc.call_opponent_unavailable);
        }
        if (ordinal == 1) {
            return context.getString(ykc.call_opponent_unavailable_busy);
        }
        if (ordinal == 2) {
            return context.getString(ykc.call_opponent_unavailable_privacy);
        }
        if (ordinal == 3) {
            return context.getString(ykc.call_opponent_failed);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder e(boolean r9, defpackage.lge r10, java.lang.CharSequence r11, boolean r12, boolean r13, boolean r14, boolean r15, defpackage.me5 r16) {
        /*
            r8 = this;
            r0 = r11
            r1 = 0
            r2 = r8
            android.content.Context r3 = r2.a
            if (r9 != 0) goto L_0x002d
            if (r15 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x0020
            r4 = 1
            char[] r4 = new char[r4]
            r5 = 32
            r6 = 0
            r4[r6] = r5
            java.util.List r0 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r11, (char[]) r4, false, 0, 6, (java.lang.Object) null)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0020:
            int r0 = defpackage.sqa.C
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = r3.getString(r0, r1)
            r5 = r10
        L_0x002b:
            r1 = r0
            goto L_0x004c
        L_0x002d:
            if (r12 != 0) goto L_0x003d
            if (r9 != 0) goto L_0x003d
            lge r4 = defpackage.lge.b
            r5 = r10
            if (r5 != r4) goto L_0x003e
            int r0 = defpackage.sqa.B
            java.lang.String r0 = r3.getString(r0)
            goto L_0x002b
        L_0x003d:
            r5 = r10
        L_0x003e:
            if (r12 != 0) goto L_0x0043
            if (r9 != 0) goto L_0x0043
            goto L_0x004c
        L_0x0043:
            if (r9 == 0) goto L_0x002b
            int r0 = defpackage.ykc.call_me_member
            java.lang.String r0 = r3.getString(r0)
            goto L_0x002b
        L_0x004c:
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            android.text.SpannableStringBuilder r0 = r0.b(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl1.e(boolean, lge, java.lang.CharSequence, boolean, boolean, boolean, boolean, me5):android.text.SpannableStringBuilder");
    }

    public final b38 f() {
        int i = pqa.w;
        l2b l2b = l2b.a;
        l2b.f.getClass();
        b38 b38 = new b38(i, -1, this.a);
        float f = (float) 12;
        b38.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        return b38;
    }

    public final String g(Long l, li1 li1) {
        String c = c(l);
        String str = null;
        if (Intrinsics.areEqual((Object) li1, (Object) li1.f)) {
            return null;
        }
        if (li1.a) {
            return c;
        }
        int i = sqa.C0;
        y8b y8b = li1.e;
        if (y8b != null) {
            str = y8b.b.getName();
        }
        return this.a.getString(i, new Object[]{str, c});
    }
}
