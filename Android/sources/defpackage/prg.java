package defpackage;

import android.content.Context;
import kotlin.text.Regex;

/* renamed from: prg  reason: default package */
public final class prg extends pl0 {
    public static final Regex c = new Regex("\\p{Graph}+?");
    public final String a;
    public final org b;

    public prg(Context context, String str) {
        this.a = str;
        this.b = new org(context);
    }

    public static final boolean b(String str) {
        return new Regex(org.j).matches(str) || new Regex(org.k).matches(str) || c.matches(str);
    }

    public final lbe a() {
        return new mka(1, new jrf(17, (Object) this));
    }
}
