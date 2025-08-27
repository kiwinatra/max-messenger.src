package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nhd  reason: default package */
public final class nhd extends j3h {
    public long b;
    public long[] c;
    public long[] o;

    public static Serializable o1(int i, l8b l8b) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(l8b.o()));
        }
        boolean z = true;
        if (i == 1) {
            if (l8b.u() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return q1(l8b);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String q1 = q1(l8b);
                    int u = l8b.u();
                    if (u == 9) {
                        return hashMap;
                    }
                    Serializable o1 = o1(u, l8b);
                    if (o1 != null) {
                        hashMap.put(q1, o1);
                    }
                }
            } else if (i == 8) {
                return p1(l8b);
            } else {
                if (i == 10) {
                    int y = l8b.y();
                    ArrayList arrayList = new ArrayList(y);
                    for (int i2 = 0; i2 < y; i2++) {
                        Serializable o12 = o1(l8b.u(), l8b);
                        if (o12 != null) {
                            arrayList.add(o12);
                        }
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.longBitsToDouble(l8b.o()));
                    l8b.H(2);
                    return date;
                }
            }
        }
    }

    public static HashMap p1(l8b l8b) {
        int y = l8b.y();
        HashMap hashMap = new HashMap(y);
        for (int i = 0; i < y; i++) {
            String q1 = q1(l8b);
            Serializable o1 = o1(l8b.u(), l8b);
            if (o1 != null) {
                hashMap.put(q1, o1);
            }
        }
        return hashMap;
    }

    public static String q1(l8b l8b) {
        int A = l8b.A();
        int i = l8b.b;
        l8b.H(A);
        return new String(l8b.a, i, A);
    }

    public final boolean n1(long j, l8b l8b) {
        if (l8b.u() != 2 || !"onMetaData".equals(q1(l8b)) || l8b.a() == 0 || l8b.u() != 8) {
            return false;
        }
        HashMap p1 = p1(l8b);
        Object obj = p1.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = p1.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.o = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.o = new long[0];
                    } else {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.o[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.c = new long[0];
                this.o = new long[0];
            }
        }
        return false;
    }
}
