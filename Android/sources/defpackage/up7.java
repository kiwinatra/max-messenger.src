package defpackage;

import kotlin.text.Typography;

/* renamed from: up7  reason: default package */
public abstract class up7 {
    public int a;
    public int b;

    public abstract String a();

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a == 2;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final String e() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                sb.append('{');
                String a2 = a();
                if (a2 != null) {
                    sb.append(Typography.quote);
                    int[] iArr = t22.h;
                    int length = iArr.length;
                    int length2 = a2.length();
                    while (i2 < length2) {
                        char charAt = a2.charAt(i2);
                        if (charAt >= length || iArr[charAt] == 0) {
                            sb.append(charAt);
                        } else {
                            sb.append('\\');
                            int i3 = iArr[charAt];
                            if (i3 < 0) {
                                sb.append("u00");
                                char[] cArr = t22.a;
                                sb.append(cArr[charAt >> 4]);
                                sb.append(cArr[charAt & 15]);
                            } else {
                                sb.append((char) i3);
                            }
                        }
                        i2++;
                    }
                    sb.append(Typography.quote);
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i4 = this.b;
                if (i4 >= 0) {
                    i2 = i4;
                }
                sb.append(i2);
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
