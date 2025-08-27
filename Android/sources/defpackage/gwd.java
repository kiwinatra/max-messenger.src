package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: gwd  reason: default package */
public final class gwd {
    public final SessionConfiguration a;
    public final List b;

    public gwd(int i, ArrayList arrayList, Executor executor, kt1 kt1) {
        e6b e6b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((e6b) it.next()).a.c());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, executor, kt1);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration next : outputConfigurations) {
            if (next == null) {
                e6b = null;
            } else {
                e6b = new e6b(Build.VERSION.SDK_INT >= 33 ? new g6b(next) : new g6b(new f6b(next)));
            }
            arrayList3.add(e6b);
        }
        this.b = Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gwd)) {
            return false;
        }
        return Objects.equals(this.a, ((gwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
