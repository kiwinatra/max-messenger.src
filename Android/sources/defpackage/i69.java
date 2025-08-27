package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* renamed from: i69  reason: default package */
public final class i69 {
    public final Function0 a;
    public final SpannableStringBuilder b = new SpannableStringBuilder();

    public i69(Function0 function0) {
        this.a = function0;
    }

    public static j0f a(SpannableString spannableString, int i, o0f o0f) {
        j0f j0f;
        int i2 = 0;
        j0f[] j0fArr = (j0f[]) spannableString.getSpans(0, spannableString.length(), j0f.class);
        if (j0fArr != null) {
            int length = j0fArr.length;
            while (true) {
                if (i2 >= length) {
                    j0f = null;
                    break;
                }
                j0f = j0fArr[i2];
                int spanStart = spannableString.getSpanStart(j0f);
                int spanEnd = spannableString.getSpanEnd(j0f);
                if (j0f.b.a == o0f.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                }
                i2++;
            }
            if (j0f != null) {
                return j0f;
            }
        }
        return null;
    }

    public final List b(CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return CollectionsKt.emptyList();
        }
        SpannableStringBuilder spannableStringBuilder = this.b;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), xa9.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((xa9) obj).a.c == sa9.a) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toList(arrayList);
    }
}
