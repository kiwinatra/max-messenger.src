package defpackage;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: jge  reason: default package */
public abstract class jge {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
