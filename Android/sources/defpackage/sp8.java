package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: sp8  reason: default package */
public final class sp8 {
    public final vo8 a;
    public final mob b;
    public final vs8 c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public sp8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.emptyList();
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public sp8(vo8 vo8, mob mob, vs8 vs8, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = vo8;
        this.b = mob;
        this.c = vs8;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public sp8(sp8 sp8) {
        this.a = sp8.a;
        this.b = sp8.b;
        this.c = sp8.c;
        this.d = sp8.d;
        this.e = sp8.e;
        this.f = sp8.f;
        this.g = sp8.g;
        this.h = sp8.h;
    }
}
