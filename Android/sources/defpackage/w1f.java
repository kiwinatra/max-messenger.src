package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: w1f  reason: default package */
public final /* synthetic */ class w1f {
    public final /* synthetic */ SuggestsViewModel a;

    public /* synthetic */ w1f(SuggestsViewModel suggestsViewModel) {
        this.a = suggestsViewModel;
    }

    public void a(int i) {
        SuggestsViewModel suggestsViewModel = this.a;
        if ((((o85) suggestsViewModel.r.getValue()).a instanceof z1f) && suggestsViewModel.z != null) {
            p1a p1a = suggestsViewModel.D;
            if (p1a == null) {
                p1a = null;
            }
            CharSequence Y = p1a.Y();
            SpannableStringBuilder spannableStringBuilder = Y instanceof SpannableStringBuilder ? (SpannableStringBuilder) Y : null;
            if (spannableStringBuilder != null) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class);
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        if (Intrinsics.areEqual((Object) clickableSpan, (Object) suggestsViewModel.z)) {
                            int spanStart = spannableStringBuilder.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder.getSpanEnd(clickableSpan);
                            if (spanStart <= i && i <= spanEnd) {
                                return;
                            }
                        }
                    }
                }
                suggestsViewModel.z = null;
                suggestsViewModel.o(y1f.a);
            }
        }
    }
}
