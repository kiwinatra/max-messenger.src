package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* renamed from: ub2  reason: default package */
public final class ub2 extends tb8 {
    public final /* synthetic */ Lazy g;
    public final /* synthetic */ Lazy h;
    public final /* synthetic */ vb2 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub2(Lazy lazy, Lazy lazy2, vb2 vb2) {
        super(100);
        this.g = lazy;
        this.h = lazy2;
        this.i = vb2;
    }

    public final Object a(Object obj) {
        Object obj2;
        SpannedString spannedString;
        rb2 rb2 = (rb2) obj;
        Lazy lazy = this.g;
        Lazy lazy2 = this.h;
        vb2 vb2 = this.i;
        CharSequence charSequence = null;
        try {
            Result.Companion companion = Result.Companion;
            String d = ((ne7) lazy.getValue()).d(rb2.a);
            if (d != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(((yva) lazy2.getValue()).k.c(StringsKt.capitalize(d)), new aif(fu4.k.e(vb2.a).f(), new gl1(12)), 33);
                j4b.a(spannableStringBuilder, 8203, new bge(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density) + MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)), 33);
                spannedString = new SpannedString(spannableStringBuilder);
            } else {
                spannedString = null;
            }
            obj2 = Result.m23constructorimpl(spannedString);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r0 = Result.m26exceptionOrNullimpl(obj2);
        if (r0 != null) {
            z68.f(vb2.x, "Fail process typing", r0);
        }
        if (!Result.m29isFailureimpl(obj2)) {
            charSequence = obj2;
        }
        return charSequence;
    }
}
