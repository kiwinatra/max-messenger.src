package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xjd  reason: default package */
public abstract class xjd extends y2 {
    public final akd h;

    public xjd(Context context, fn5 fn5, akd akd) {
        super(context, "features_prefs", fn5);
        this.h = akd;
    }

    public final boolean m(PmsKey pmsKey, boolean z) {
        boolean contains = this.g.contains(pmsKey.name());
        this = this;
        if (!contains) {
            this = this.h;
        }
        return this.c(pmsKey.name(), z);
    }
}
