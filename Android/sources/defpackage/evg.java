package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* renamed from: evg  reason: default package */
public final class evg implements obb {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ m8g b;

    public evg(m8g m8g, BasePendingResult basePendingResult) {
        this.b = m8g;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        ((Map) this.b.a).remove(this.a);
    }
}
