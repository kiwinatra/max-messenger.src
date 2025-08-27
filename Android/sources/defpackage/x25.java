package defpackage;

import android.text.Spannable;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* renamed from: x25  reason: default package */
public final class x25 implements u25 {
    public final Lazy a;
    public final Lazy b;

    public x25(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final List a(CharSequence charSequence) {
        Iterable<Pair> d = h().d(charSequence);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(d, 10));
        for (Pair first : d) {
            arrayList.add((CharSequence) first.getFirst());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: i35} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence b(long r13, java.lang.String r15, java.lang.String r16, java.lang.CharSequence r17, int r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            r2 = r17
            r9 = r18
            java.lang.CharSequence r3 = r12.e(r2, r9)
            int r4 = r3.length()
            r5 = 0
            r10 = 0
            boolean r6 = r3 instanceof android.text.Spanned     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0018
            r6 = r3
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x0022 }
            goto L_0x0019
        L_0x0018:
            r6 = r5
        L_0x0019:
            if (r6 == 0) goto L_0x0022
            java.lang.Class<i35> r7 = defpackage.i35.class
            java.lang.Object[] r4 = r6.getSpans(r10, r4, r7)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            i35[] r4 = (defpackage.i35[]) r4
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = kotlin.collections.ArraysKt.firstOrNull((T[]) r4)
            r5 = r4
            i35 r5 = (defpackage.i35) r5
        L_0x002e:
            if (r5 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x0085
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            r0.getClass()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0085
            int r4 = r17.length()
            if (r4 != 0) goto L_0x0048
            goto L_0x0085
        L_0x0048:
            cl r11 = new cl
            kotlin.Triple r4 = new kotlin.Triple
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            if (r16 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = r16
        L_0x0055:
            r4.<init>(r6, r15, r3)
            xme r6 = defpackage.f6e.a(r4)
            ij r7 = new ij
            android.graphics.drawable.Drawable r1 = r5.w
            r7.<init>(r1)
            android.content.Context r4 = r0.b
            aj r8 = r0.a
            r3 = r11
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            r11.setBounds(r10, r10, r9, r9)
            dl r0 = new dl
            r3 = r13
            r0.<init>(r13, r11)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            int r2 = r17.length()
            r3 = 33
            r1.setSpan(r0, r10, r2, r3)
            r3 = r1
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x25.b(long, java.lang.String, java.lang.String, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    public final CharSequence c(CharSequence charSequence) {
        k45 h = h();
        h.c.getClass();
        Spannable e = h.e(charSequence, MathKt.roundToInt(TypedValue.applyDimension(2, (float) 20, vo4.c().getDisplayMetrics())));
        return e == null ? "" : e;
    }

    public final List d(CharSequence charSequence) {
        return h().d(charSequence);
    }

    public final CharSequence e(CharSequence charSequence, int i) {
        Spannable e = h().e(charSequence, i);
        return e == null ? "" : e;
    }

    public final boolean f(CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return charSequence.codePoints().allMatch(new uk3(1));
    }

    public final boolean g(CharSequence charSequence, int i) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > StringsKt.getLastIndex(charSequence)) {
            return false;
        }
        int codePointAt = charSequence.toString().codePointAt(i);
        return ev0.r(codePointAt) || codePointAt == 8205 || codePointAt == 8419;
    }

    public final k45 h() {
        return (k45) this.a.getValue();
    }
}
