package defpackage;

import android.content.Context;

/* renamed from: efa  reason: default package */
public final class efa {
    public final Context a;
    public final bfa b;

    public efa(Context context, bfa bfa) {
        this.a = context;
        this.b = bfa;
    }

    public final String a(String str, String str2, String str3, boolean z) {
        if (z) {
            return g63.i(str2, ": ", str3);
        }
        if (str == null || str.length() == 0) {
            String string = this.a.getString(tmc.tt_in_chat);
            return str2 + " " + string + ": " + str3;
        }
        return str2 + " | " + str + ": " + str3;
    }
}
