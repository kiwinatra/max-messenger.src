package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* renamed from: vua  reason: default package */
public abstract class vua {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(CharSequence charSequence, yva yva) {
        if (charSequence.length() == 0) {
            return "";
        }
        if (yva.k.g(charSequence, 0)) {
            List a2 = yva.k.a(charSequence);
            if (!a2.isEmpty()) {
                return (CharSequence) CollectionsKt.first(a2);
            }
        }
        String replaceAll = a.matcher(charSequence).replaceAll("");
        if (replaceAll.length() == 0 || StringsKt.isBlank(replaceAll)) {
            return charSequence.length() > 0 ? String.valueOf(StringsKt.first(charSequence)) : "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : StringsKt__StringsKt.split$default((CharSequence) replaceAll, new String[]{" "}, false, 0, 6, (Object) null)) {
            if (!StringsKt.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        StringBuilder sb = new StringBuilder();
        int min = Math.min(arrayList.size(), 2);
        for (int i = 0; i < min; i++) {
            String str = (String) arrayList.get(i);
            if (str.length() != 0 && !StringsKt.isBlank(str)) {
                sb.append(Character.toUpperCase(str.charAt(0)));
            }
        }
        return sb.toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String replaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String replaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        List listOf = CollectionsKt.listOf(StringsKt.firstOrNull(replaceAll), StringsKt.firstOrNull(replaceAll2));
        for (int i2 = 0; i2 < i; i2++) {
            Character ch = (Character) CollectionsKt.getOrNull(listOf, i2);
            if (ch != null) {
                sb.append(ch.charValue());
            }
        }
        return sb.toString();
    }
}
