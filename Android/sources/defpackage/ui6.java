package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ui6  reason: default package */
public abstract class ui6 {
    public static Set a(String str) {
        Character ch;
        if (str.length() == 0) {
            return SetsKt.emptySet();
        }
        String substring = str.substring(StringsKt__StringsKt.indexOf$default((CharSequence) str, '(', 0, false, 6, (Object) null) + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < substring.length()) {
            char charAt = substring.charAt(i2);
            int i4 = i3 + 1;
            if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == charAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (charAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                }
            } else if (charAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (charAt == ',' && arrayDeque.isEmpty()) {
                String substring2 = substring.substring(i + 1, i3);
                int length = substring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = Intrinsics.compare((int) substring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i5++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                arrayList.add(substring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(StringsKt.trim((CharSequence) substring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String[] strArr = vi6.d;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                } else if (StringsKt__StringsJVMKt.startsWith$default(str2, strArr[i6], false, 2, (Object) null)) {
                    arrayList2.add(next);
                    break;
                } else {
                    i6++;
                }
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }
}
