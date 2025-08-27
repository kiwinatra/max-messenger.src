package defpackage;

/* renamed from: xdb  reason: default package */
public final class xdb extends fj0 implements Comparable {
    public final String X;
    public final int Y;
    public final long c;
    public final int o;
    public final String v;
    public final long w;
    public final String x;
    public final String y;
    public final String z;

    public xdb(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        super(j);
        this.c = j2;
        this.o = i;
        this.v = str;
        this.w = j3;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.X = str5;
        this.Y = i2a.a(i2);
    }

    public final String a() {
        String str = this.y;
        if (cvg.D(str)) {
            String str2 = this.z;
            if (cvg.D(str2)) {
                return str + " " + str2;
            }
        }
        return str;
    }

    public final int compareTo(Object obj) {
        return a().compareTo(((xdb) obj).a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xdb.class != obj.getClass()) {
            return false;
        }
        xdb xdb = (xdb) obj;
        if (this.o != xdb.o) {
            return false;
        }
        String str = xdb.v;
        String str2 = this.v;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = xdb.y;
        String str4 = this.y;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = xdb.z;
        String str6 = this.z;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = xdb.X;
        String str8 = this.X;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final String toString() {
        return "PhoneDb{phonebookId=" + this.c + ", contactId=" + this.o + ", phone='" + this.v + "', serverPhone=" + this.w + ", firstName='" + this.y + "', lastName='" + this.z + "', type=" + i2a.s(this.Y) + '}';
    }
}
