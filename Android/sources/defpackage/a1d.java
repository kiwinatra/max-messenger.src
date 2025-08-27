package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a1d  reason: default package */
public final class a1d {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public a1d(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(a1d a1d) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(a1d.a).setLabel(a1d.b).setChoices(a1d.c).setAllowFreeFormInput(a1d.d).addExtras(a1d.f);
        Set<String> set = a1d.g;
        if (set != null) {
            for (String d2 : set) {
                y0d.d(addExtras, d2, true);
            }
        }
        z0d.b(addExtras, a1d.e);
        return addExtras.build();
    }
}
