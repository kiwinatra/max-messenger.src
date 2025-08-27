package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: y2  reason: default package */
public abstract class y2 {
    public final String e;
    public final Context f;
    public final ls7 g;

    public y2(Context context, String str, fn5 fn5) {
        this.f = context;
        this.e = "Prefs/" + str.replace(".prefs", "");
        k63 k63 = k63.a;
        this.g = new ls7(context, new en5(str), fn5, new wie(1, (Object) this));
    }

    public static void h(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            editor.putFloat(str, ((Double) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
        } else if (obj instanceof Map) {
            editor.putString(str, bs0.a0((Map) obj).toString());
        } else if (obj instanceof List) {
            editor.putString(str, bs0.Z((List) obj).toString());
        }
    }

    public void b() {
        z68.c(this.e, "clear: %s", getClass().getSimpleName());
        cn5 cn5 = (cn5) this.g.edit();
        cn5.clear();
        cn5.commit();
    }

    public boolean c(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }

    public final int d(String str, int i) {
        return this.g.getInt(str, i);
    }

    public final long e(String str, long j) {
        return this.g.getLong(str, j);
    }

    public final String f(String str, String str2) {
        return this.g.getString(str, str2);
    }

    public final List g(String str, List list) {
        JSONArray jSONArray = null;
        String f2 = f(str, (String) null);
        if (f2 != null) {
            try {
                jSONArray = new JSONArray(f2);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final void i(String str, boolean z) {
        cn5 cn5 = (cn5) this.g.edit();
        cn5.putBoolean(str, z);
        cn5.apply();
    }

    public final void j(int i, String str) {
        cn5 cn5 = (cn5) this.g.edit();
        cn5.putInt(str, i);
        cn5.apply();
    }

    public final void k(String str, Long l) {
        cn5 cn5 = (cn5) this.g.edit();
        cn5.putLong(str, l.longValue());
        cn5.apply();
    }

    public final void l(String str, String str2) {
        cn5 cn5 = (cn5) this.g.edit();
        cn5.putString(str, str2);
        cn5.apply();
    }
}
