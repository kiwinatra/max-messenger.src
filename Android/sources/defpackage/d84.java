package defpackage;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.time.DurationKt;
import org.apache.http.HttpStatus;

/* renamed from: d84  reason: default package */
public final class d84 implements Comparable, Serializable {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer o;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public int y;

    public d84(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.o = num4;
        this.v = num5;
        this.w = num6;
        this.x = num7;
        d(1, 9999, num, "Year");
        d(1, 12, this.b, "Month");
        d(1, 31, this.c, "Day");
        int i = 0;
        d(0, 23, this.o, "Hour");
        d(0, 59, this.v, "Minute");
        d(0, 59, this.w, "Second");
        d(0, 999999999, this.x, "Nanosecond");
        Integer num8 = this.a;
        Integer num9 = this.b;
        Integer num10 = this.c;
        Object[] objArr = {num8, num9, num10};
        while (i < 3) {
            if (objArr[i] != null) {
                i++;
            } else {
                return;
            }
        }
        if (num10.intValue() > i(num8, num9).intValue()) {
            throw new lc3("The day-of-the-month value '" + num10 + "' exceeds the number of days in the month: " + i(num8, num9), 1);
        }
    }

    public static void a(String str, Object obj, StringBuilder sb) {
        StringBuilder m = g63.m(str, ":");
        m.append(String.valueOf(obj));
        m.append(" ");
        sb.append(m.toString());
    }

    public static void d(int i, int i2, Integer num, String str) {
        if (num == null) {
            return;
        }
        if (num.intValue() < i || num.intValue() > i2) {
            throw new lc3(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num, 1);
        }
    }

    public static d84 g(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new d84(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * DurationKt.NANOS_IN_MILLIS));
    }

    public static Integer i(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            return 31;
        }
        if (num2.intValue() == 2) {
            return Integer.valueOf((num.intValue() % 100 != 0 ? num.intValue() % 4 != 0 : num.intValue() % HttpStatus.SC_BAD_REQUEST != 0) ? 28 : 29);
        } else if (num2.intValue() == 3) {
            return 31;
        } else {
            if (num2.intValue() == 4) {
                return 30;
            }
            if (num2.intValue() == 5) {
                return 31;
            }
            if (num2.intValue() == 6) {
                return 30;
            }
            if (num2.intValue() == 7) {
                return 31;
            }
            if (num2.intValue() == 8) {
                return 31;
            }
            if (num2.intValue() == 9) {
                return 30;
            }
            if (num2.intValue() == 10) {
                return 31;
            }
            if (num2.intValue() == 11) {
                return 30;
            }
            if (num2.intValue() == 12) {
                return 31;
            }
            throw new AssertionError("Month is out of range 1..12:" + num2);
        }
    }

    public final String b() {
        if (n(1) && m(2, 3, 4, 5, 6, 7)) {
            return "YYYY";
        }
        if (n(1, 2) && m(3, 4, 5, 6, 7)) {
            return "YYYY-MM";
        }
        if (n(1, 2, 3) && m(4, 5, 6, 7)) {
            return "YYYY-MM-DD";
        }
        if (n(1, 2, 3, 4) && m(5, 6, 7)) {
            return "YYYY-MM-DD hh";
        }
        if (n(1, 2, 3, 4, 5) && m(6, 7)) {
            return "YYYY-MM-DD hh:mm";
        }
        if (n(1, 2, 3, 4, 5, 6) && m(7)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        if (n(1, 2, 3, 4, 5, 6, 7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3) && n(4, 5, 6, 7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3, 7) && n(4, 5, 6)) {
            return "hh:mm:ss";
        }
        if (!m(1, 2, 3, 6, 7) || !n(4, 5)) {
            return null;
        }
        return "hh:mm";
    }

    public final int c() {
        int intValue = this.a.intValue();
        int intValue2 = this.b.intValue();
        int i = (intValue2 - 14) / 12;
        return (((((((intValue2 - 2) - (i * 12)) * 367) / 12) + ((((intValue + 4800) + i) * 1461) / 4)) - (((((intValue + 4900) + i) / 100) * 3) / 4)) + this.c.intValue()) - 32075;
    }

    /* renamed from: e */
    public final int compareTo(d84 d84) {
        if (this == d84) {
            return 0;
        }
        d84.getClass();
        int i = m58.i(this.a, d84.a);
        if (i != 0) {
            return i;
        }
        int i2 = m58.i(this.b, d84.b);
        if (i2 != 0) {
            return i2;
        }
        int i3 = m58.i(this.c, d84.c);
        if (i3 != 0) {
            return i3;
        }
        int i4 = m58.i(this.o, d84.o);
        if (i4 != 0) {
            return i4;
        }
        int i5 = m58.i(this.v, d84.v);
        if (i5 != 0) {
            return i5;
        }
        int i6 = m58.i(this.w, d84.w);
        if (i6 != 0) {
            return i6;
        }
        int i7 = m58.i(this.x, d84.x);
        if (i7 != 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        throw new java.lang.IllegalArgumentException("This method does not currently support arrays.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 != r7) goto L_0x0005
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0011
        L_0x0005:
            java.lang.Class<d84> r0 = defpackage.d84.class
            boolean r0 = r0.isInstance(r7)
            if (r0 != 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0061
            d84 r7 = (defpackage.d84) r7
            r7.getClass()
            java.lang.Object[] r6 = r6.j()
            java.lang.Object[] r7 = r7.j()
            r0 = 0
            r1 = r0
        L_0x0022:
            r2 = 7
            r3 = 1
            if (r1 >= r2) goto L_0x005c
            r2 = r6[r1]
            r4 = r7[r1]
            if (r2 == 0) goto L_0x0036
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L_0x0043
        L_0x0036:
            if (r4 == 0) goto L_0x004b
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "This method does not currently support arrays."
            r6.<init>(r7)
            throw r6
        L_0x004b:
            if (r2 != 0) goto L_0x0052
            if (r4 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r3 = r0
            goto L_0x0056
        L_0x0052:
            boolean r3 = r2.equals(r4)
        L_0x0056:
            if (r3 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x005c:
            r0 = r3
        L_0x005d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0061:
            boolean r6 = r0.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.equals(java.lang.Object):boolean");
    }

    public final void f() {
        if (!n(1, 2, 3)) {
            throw new lc3("DateTime does not include year/month/day.", 2);
        }
    }

    public final long h(TimeZone timeZone) {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.o;
        int i = 0;
        int intValue = num4 == null ? 0 : num4.intValue();
        Integer num5 = this.v;
        int intValue2 = num5 == null ? 0 : num5.intValue();
        Integer num6 = this.w;
        int intValue3 = num6 == null ? 0 : num6.intValue();
        Integer num7 = this.x;
        if (num7 != null) {
            i = num7.intValue();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(1, num.intValue());
        gregorianCalendar.set(2, num2.intValue() - 1);
        gregorianCalendar.set(5, num3.intValue());
        gregorianCalendar.set(11, intValue);
        gregorianCalendar.set(12, intValue2);
        gregorianCalendar.set(13, intValue3);
        gregorianCalendar.set(14, i / DurationKt.NANOS_IN_MILLIS);
        return gregorianCalendar.getTimeInMillis();
    }

    public final int hashCode() {
        if (this.y == 0) {
            Object[] j = j();
            int i = 23;
            for (int i2 = 0; i2 < 7; i2++) {
                i = m58.z(i, j[i2]);
            }
            this.y = i;
        }
        return this.y;
    }

    public final Object[] j() {
        return new Object[]{this.a, this.b, this.c, this.o, this.v, this.w, this.x};
    }

    public final int k() {
        Integer num = this.w;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.v;
        if (num2 != null) {
            intValue += num2.intValue() * 60;
        }
        Integer num3 = this.o;
        return num3 != null ? intValue + (num3.intValue() * 3600) : intValue;
    }

    public final d84 l(Integer num) {
        f();
        f();
        int intValue = num.intValue() + c() + 68569;
        int i = (intValue * 4) / 146097;
        int i2 = intValue - (((146097 * i) + 3) / 4);
        int i3 = ((i2 + 1) * 4000) / 1461001;
        int i4 = (i2 - ((i3 * 1461) / 4)) + 31;
        int i5 = (i4 * 80) / 2447;
        int i6 = i4 - ((i5 * 2447) / 80);
        int i7 = i5 / 11;
        d84 d84 = new d84(Integer.valueOf(((i - 49) * 100) + i3 + i7), Integer.valueOf((i5 + 2) - (i7 * 12)), Integer.valueOf(i6), (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        return new d84(d84.a, d84.b, d84.c, this.o, this.v, this.w, this.x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7.w == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r7.v == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r7.o == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r7.c == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        if (r7.b == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r7.a == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r7.x == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0005:
            if (r3 >= r0) goto L_0x0054
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L_0x0016
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.x
            if (r4 != 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x0051
        L_0x0014:
            r4 = r2
            goto L_0x0051
        L_0x0016:
            r6 = 6
            if (r6 != r5) goto L_0x0020
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.w
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0020:
            r6 = 5
            if (r6 != r5) goto L_0x002a
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.v
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x002a:
            r6 = 4
            if (r6 != r5) goto L_0x0034
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.o
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0034:
            r6 = 3
            if (r6 != r5) goto L_0x003e
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.c
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x003e:
            r6 = 2
            if (r6 != r5) goto L_0x0048
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.b
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0048:
            if (r1 != r5) goto L_0x0051
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.a
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.m(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7.w != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r7.v != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r7.o != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r7.c != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        if (r7.b != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r7.a != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r7.x != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0005:
            if (r3 >= r0) goto L_0x0054
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L_0x0016
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.x
            if (r4 == 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x0051
        L_0x0014:
            r4 = r2
            goto L_0x0051
        L_0x0016:
            r6 = 6
            if (r6 != r5) goto L_0x0020
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.w
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0020:
            r6 = 5
            if (r6 != r5) goto L_0x002a
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.v
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x002a:
            r6 = 4
            if (r6 != r5) goto L_0x0034
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.o
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0034:
            r6 = 3
            if (r6 != r5) goto L_0x003e
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.c
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x003e:
            r6 = 2
            if (r6 != r5) goto L_0x0048
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.b
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0048:
            if (r1 != r5) goto L_0x0051
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.a
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.n(int[]):boolean");
    }

    public final String toString() {
        if (b() != null) {
            return new g84(b()).b(this);
        }
        StringBuilder sb = new StringBuilder();
        a("Y", this.a, sb);
        a("M", this.b, sb);
        a("D", this.c, sb);
        a("h", this.o, sb);
        a("m", this.v, sb);
        a("s", this.w, sb);
        a("f", this.x, sb);
        return sb.toString().trim();
    }
}
