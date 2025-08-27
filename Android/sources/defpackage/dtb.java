package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

/* renamed from: dtb  reason: default package */
public final class dtb {
    public final Context a;
    public long b = 0;
    public SharedPreferences c;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public PreferenceFragmentCompat h;
    public PreferenceFragmentCompat i;
    public PreferenceFragmentCompat j;

    public dtb(Context context) {
        this.a = context;
        this.f = context.getPackageName() + "_preferences";
        this.c = null;
    }

    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return b().edit();
        }
        if (this.d == null) {
            this.d = b().edit();
        }
        return this.d;
    }

    public final SharedPreferences b() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
}
