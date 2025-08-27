package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ls7  reason: default package */
public final class ls7 implements SharedPreferences {
    public final Lazy a;

    public ls7(Context context, en5 en5, fn5 fn5, wie wie) {
        this.a = LazyKt.lazy(new gg2(1, context.getDir("file_prefs", 0), en5, fn5, wie));
    }

    public final dn5 a() {
        return (dn5) this.a.getValue();
    }

    public final boolean contains(String str) {
        return a().d.a(str);
    }

    public final SharedPreferences.Editor edit() {
        return a().edit();
    }

    public final Map getAll() {
        return a().getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return a().getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return a().getStringSet(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
