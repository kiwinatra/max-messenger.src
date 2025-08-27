package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: gdf  reason: default package */
public final class gdf implements nx3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gdf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                fdf fdf = (fdf) this.b;
                fdf.getClass();
                boolean isCancelled = task.isCancelled();
                rdf rdf = fdf.b;
                if (isCancelled) {
                    rdf.a();
                    return null;
                } else if (task.isFaulted()) {
                    rdf.b(task.getError());
                    return null;
                } else {
                    rdf.c(task.getResult());
                    return null;
                }
            default:
                Collection<Task> collection = (Collection) this.b;
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task result : collection) {
                    arrayList.add(result.getResult());
                }
                return arrayList;
        }
    }
}
