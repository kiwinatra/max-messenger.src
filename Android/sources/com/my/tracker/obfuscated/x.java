package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

public class x {
    final SparseArray a = new SparseArray(50);

    private u c(int i) {
        w wVar = new w(i);
        this.a.put(i, wVar);
        return wVar;
    }

    public ArrayList a() {
        x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((v) this.a.valueAt(i));
        }
        this.a.clear();
        x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }

    public void b(int i) {
        u uVar = (u) this.a.get(i);
        if (uVar != null) {
            x2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i);
        } else {
            x2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i + ", creating new");
            uVar = c(i);
        }
        uVar.f();
        x2.c("TimeSpent: incremented count based TimeSpent, id = " + i + ", count = " + uVar.d());
    }

    public boolean a(int i) {
        return this.a.get(i) != null;
    }
}
