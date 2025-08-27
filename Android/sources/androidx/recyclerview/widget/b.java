package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class b {
    private static final int DEFAULT_MAX_SCRAP = 5;
    int mAttachCountForClearing = 0;
    Set<tyc> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());
    SparseArray<gzc> mScrap = new SparseArray<>();

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(tyc tyc) {
        this.mAttachedAdaptersForPoolingContainer.add(tyc);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            gzc valueAt = this.mScrap.valueAt(i);
            Iterator it = valueAt.a.iterator();
            while (it.hasNext()) {
                tqb.a(((pzc) it.next()).a);
            }
            valueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(tyc tyc, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(tyc);
        if (this.mAttachedAdaptersForPoolingContainer.size() == 0 && !z) {
            for (int i = 0; i < this.mScrap.size(); i++) {
                SparseArray<gzc> sparseArray = this.mScrap;
                ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    tqb.a(((pzc) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        gzc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        gzc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public pzc getRecycledView(int i) {
        gzc gzc = this.mScrap.get(i);
        if (gzc == null) {
            return null;
        }
        ArrayList arrayList = gzc.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((pzc) arrayList.get(size)).x()) {
                return (pzc) arrayList.remove(size);
            }
        }
        return null;
    }

    public final gzc getScrapDataForType(int i) {
        gzc gzc = this.mScrap.get(i);
        if (gzc != null) {
            return gzc;
        }
        gzc gzc2 = new gzc();
        this.mScrap.put(i, gzc2);
        return gzc2;
    }

    public void onAdapterChanged(tyc tyc, tyc tyc2, boolean z) {
        if (tyc != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (tyc2 != null) {
            attach();
        }
    }

    public void putRecycledView(pzc pzc) {
        int i = pzc.w;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            tqb.a(pzc.a);
        } else if (!RecyclerView.J1 || !arrayList.contains(pzc)) {
            pzc.I();
            arrayList.add(pzc);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        gzc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
            ArrayList arrayList = this.mScrap.valueAt(i2).a;
            if (arrayList != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}
