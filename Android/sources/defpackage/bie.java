package defpackage;

import android.graphics.Color;

/* renamed from: bie  reason: default package */
public final class bie {
    public final String a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public bie(String str, int i, Integer num, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            return -1;
        }
        "Ignoring unknown alignment: ".concat(valueOf);
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder(g63.f(33, str));
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            iq.a(sb.toString(), e2);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            y64.g(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(cvg.r(((parseLong >> 24) & 255) ^ 255), cvg.r(parseLong & 255), cvg.r((parseLong >> 8) & 255), cvg.r((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder(g63.f(36, str));
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            iq.a(sb.toString(), e2);
            return null;
        }
    }
}
