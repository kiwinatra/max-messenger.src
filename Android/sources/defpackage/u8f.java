package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: u8f  reason: default package */
public abstract class u8f {
    public static boolean a(String str, String str2) {
        if (Intrinsics.areEqual((Object) str, (Object) str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return Intrinsics.areEqual((Object) StringsKt.trim((CharSequence) str.substring(1, str.length() - 1)).toString(), (Object) str2);
                }
            }
        }
        return false;
    }
}
