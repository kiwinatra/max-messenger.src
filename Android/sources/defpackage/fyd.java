package defpackage;

import java.io.Serializable;

/* renamed from: fyd  reason: default package */
public final class fyd implements Serializable {
    public boolean X;
    public int Y;
    public boolean Z;
    public final int a;
    public final CharSequence b;
    public final String c;
    public final String o;
    public String v;
    public float v0 = 1.0f;
    public Object w;
    public boolean w0;
    public Object x;
    public final int y;
    public boolean z = true;

    public fyd(int i, CharSequence charSequence, String str, String str2, Object obj, int i2) {
        this.a = i;
        this.b = charSequence;
        this.c = str;
        this.o = str2;
        this.w = obj;
        this.y = i2;
    }

    public static fyd a(String str, int i, String str2, boolean z2) {
        return new fyd(i, str, str2, (String) null, Boolean.valueOf(z2), 2);
    }

    public static fyd b(String str) {
        return new fyd(0, str, "", (String) null, (Object) null, 3);
    }

    public static fyd c(int i, String str, String str2) {
        return new fyd(i, str, str2, (String) null, (Object) null, 0);
    }

    public static fyd d(int i, scf scf) {
        return new fyd(i, (CharSequence) null, (String) null, (String) null, scf, 8);
    }

    public final boolean equals(Object obj) {
        fyd fyd;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyd) || this.a != (fyd = (fyd) obj).a || this.y != fyd.y || this.z != fyd.z || this.X != fyd.X || this.Y != fyd.Y || this.Z != fyd.Z || Float.compare(fyd.v0, this.v0) != 0 || this.w0 != fyd.w0) {
            return false;
        }
        CharSequence charSequence = fyd.b;
        CharSequence charSequence2 = this.b;
        if (charSequence2 == null ? charSequence != null : !charSequence2.equals(charSequence)) {
            return false;
        }
        String str = fyd.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = fyd.o;
        String str4 = this.o;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = this.v;
        if (str5 == null ? fyd.v != null : !str5.equals(fyd.v)) {
            return false;
        }
        Object obj2 = this.w;
        if (obj2 == null ? fyd.w != null : !obj2.equals(fyd.w)) {
            return false;
        }
        Object obj3 = this.x;
        return obj3 != null ? obj3.equals(fyd.x) : fyd.x == null;
    }
}
