package defpackage;

import java.util.Objects;

/* renamed from: ue1  reason: default package */
public final class ue1 {
    public final long a;
    public final int b;
    public final int c;

    public ue1(int i, int i2, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public static ue1 a(String str) {
        long j = 0;
        int i = 1;
        int i2 = 0;
        for (String str2 : str.split(":")) {
            if (str2.startsWith("d")) {
                i2 = Integer.parseInt(str2.substring(1));
            } else {
                boolean startsWith = str2.startsWith("g");
                boolean startsWith2 = str2.startsWith("u");
                if (startsWith || startsWith2) {
                    i = startsWith ? 2 : 1;
                    j = Long.parseLong(str2.substring(1));
                } else {
                    char charAt = str2.charAt(0);
                    if (Character.isDigit(charAt) || charAt == '-') {
                        j = Long.parseLong(str2);
                    }
                }
            }
        }
        return new ue1(i, i2, j);
    }

    public static ue1 b(String str) {
        try {
            return a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String c() {
        return String.valueOf(a81.b(this.b)) + this.a + ":d" + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ue1.class != obj.getClass()) {
            return false;
        }
        ue1 ue1 = (ue1) obj;
        if (this.a == ue1.a && this.c == ue1.c) {
            return this.b == ue1.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), tr1.a(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return c();
    }
}
