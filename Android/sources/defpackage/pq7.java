package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.math.MathKt;

/* renamed from: pq7  reason: default package */
public final class pq7 {
    public static final int a = MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density);
    public static final nz9 b = new nz9(6);
    public static int c;
    public static SharedPreferences d;
    public static final xme e;
    public static final xme f;

    static {
        xme a2 = f6e.a(Boolean.FALSE);
        e = a2;
        f = a2;
    }

    public static int a(Context context) {
        nz9 nz9 = b;
        String str = "pref_keyboard_height_landscape";
        if (nz9.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int max = Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
            nz9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), "pref_keyboard_height_portrait");
            nz9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), str);
        }
        if (1 == context.getResources().getConfiguration().orientation) {
            str = "pref_keyboard_height_portrait";
        }
        int a2 = nz9.a(str);
        return a2 >= 0 ? nz9.c[a2] : Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}
