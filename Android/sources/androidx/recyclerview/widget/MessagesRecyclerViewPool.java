package androidx.recyclerview.widget;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Landroidx/recyclerview/widget/MessagesRecyclerViewPool;", "Landroidx/recyclerview/widget/b;", "<init>", "()V", "", "viewType", "Lgzc;", "getScrapDataForType", "(I)Lgzc;", "max", "", "setMaxRecycledViews", "(II)V", "Lpzc;", "getRecycledView", "(I)Lpzc;", "getRecycledViewCount", "(I)I", "scrap", "putRecycledView", "(Lpzc;)V", "", "createTimeNs", "factorInCreateTime", "(IJ)V", "bindTimeNs", "factorInBindTime", "approxCurrentNs", "deadlineNs", "", "willCreateInTime", "(IJJ)Z", "willBindInTime", "Companion", "qo9", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessagesRecyclerViewPool extends b {
    public static final qo9 Companion = new Object();
    /* access modifiers changed from: private */
    public static boolean ENABLED;

    public MessagesRecyclerViewPool() {
        ENABLED = true;
        setMaxRecycledViews(0, 10);
        setMaxRecycledViews(536870913, 20);
        setMaxRecycledViews(536870920, 10);
        setMaxRecycledViews(536870928, 10);
        setMaxRecycledViews(536870944, 10);
        setMaxRecycledViews(536870914, 10);
        setMaxRecycledViews(536870916, 10);
        setMaxRecycledViews(536870976, 10);
        setMaxRecycledViews(536871040, 10);
        setMaxRecycledViews(536871168, 10);
        setMaxRecycledViews(536871424, 10);
        setMaxRecycledViews(536875008, 10);
    }

    private final gzc getScrapDataForType(int i) {
        int i2 = i & -2013265921;
        gzc gzc = this.mScrap.get(i2);
        if (gzc != null) {
            return gzc;
        }
        gzc gzc2 = new gzc();
        this.mScrap.put(i2, gzc2);
        return gzc2;
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
        int i2;
        gzc gzc = this.mScrap.get(i & -2013265921);
        if (gzc == null) {
            return null;
        }
        ArrayList arrayList = gzc.a;
        if (!(!arrayList.isEmpty()) || arrayList.size() - 1 < 0) {
            return null;
        }
        while (true) {
            int i3 = i2 - 1;
            if (!((pzc) arrayList.get(i2)).x()) {
                pzc pzc = (pzc) arrayList.remove(i2);
                boolean z = pzc instanceof hg9;
                return pzc;
            } else if (i3 < 0) {
                return null;
            } else {
                i2 = i3;
            }
        }
    }

    public int getRecycledViewCount(int i) {
        return getScrapDataForType(i).a.size();
    }

    public void putRecycledView(pzc pzc) {
        ArrayList arrayList = getScrapDataForType(pzc.w).a;
        if (this.mScrap.get(pzc.w & -2013265921).b <= arrayList.size()) {
            z68.p("MessagesRecyclerViewPool", "could not add " + pzc);
            return;
        }
        pzc.I();
        if (pzc instanceof hg9) {
            hg9 hg9 = (hg9) pzc;
        }
        arrayList.add(pzc);
    }

    public void setMaxRecycledViews(int i, int i2) {
        gzc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
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
