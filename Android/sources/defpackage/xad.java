package defpackage;

import java.util.ArrayList;

/* renamed from: xad  reason: default package */
public final class xad {
    public gng a;
    public ArrayList b;

    public static long a(fm4 fm4, long j) {
        gng gng = fm4.d;
        if (gng instanceof by6) {
            return j;
        }
        ArrayList arrayList = fm4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            cm4 cm4 = (cm4) arrayList.get(i);
            if (cm4 instanceof fm4) {
                fm4 fm42 = (fm4) cm4;
                if (fm42.d != gng) {
                    j2 = Math.min(j2, a(fm42, ((long) fm42.f) + j));
                }
            }
        }
        if (fm4 != gng.i) {
            return j2;
        }
        long j3 = gng.j();
        fm4 fm43 = gng.h;
        long j4 = j - j3;
        return Math.min(Math.min(j2, a(fm43, j4)), j4 - ((long) fm43.f));
    }

    public static long b(fm4 fm4, long j) {
        gng gng = fm4.d;
        if (gng instanceof by6) {
            return j;
        }
        ArrayList arrayList = fm4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            cm4 cm4 = (cm4) arrayList.get(i);
            if (cm4 instanceof fm4) {
                fm4 fm42 = (fm4) cm4;
                if (fm42.d != gng) {
                    j2 = Math.max(j2, b(fm42, ((long) fm42.f) + j));
                }
            }
        }
        if (fm4 != gng.h) {
            return j2;
        }
        long j3 = gng.j();
        fm4 fm43 = gng.i;
        long j4 = j + j3;
        return Math.max(Math.max(j2, b(fm43, j4)), j4 - ((long) fm43.f));
    }
}
