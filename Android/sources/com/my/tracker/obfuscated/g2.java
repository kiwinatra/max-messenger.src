package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

public abstract class g2 {
    final SparseArray a = new SparseArray(20);
    final SparseArray b = new SparseArray(20);

    public final ArrayList a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((e2) this.b.valueAt(i));
        }
        return arrayList;
    }

    public final int b() {
        return this.a.size();
    }

    public final String a(boolean z) {
        return z ? "[FOREGROUND] " : "[BACKGROUND] ";
    }

    public final boolean b(int i) {
        return this.a.get(i) != null;
    }

    public final d2 a(int i) {
        d2 d2Var = (d2) this.b.get(i);
        if (d2Var != null) {
            return d2Var;
        }
        f2 f2Var = new f2(i);
        this.b.put(i, f2Var);
        return f2Var;
    }

    public final void a(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            ((u1) this.a.valueAt(i)).b(j);
        }
    }
}
