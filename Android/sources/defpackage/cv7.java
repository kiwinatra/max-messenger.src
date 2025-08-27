package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cv7  reason: default package */
public final class cv7 {
    public final boolean a;
    public Activity b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public SparseArray g;
    public SparseArray h;
    public ArrayList i;
    public final Map j;

    public cv7(boolean z) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = z;
        this.g = sparseArray;
        this.h = sparseArray2;
        this.i = arrayList;
        this.j = linkedHashMap;
    }
}
