package defpackage;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;

/* renamed from: e0  reason: default package */
public abstract class e0 implements hm {
    private volatile gm cachedParams;

    public final synchronized gm a() {
        gm gmVar = this.cachedParams;
        if (gmVar != null) {
            return gmVar;
        }
        gm gmVar2 = new gm();
        populateParams(gmVar2);
        this.cachedParams = gmVar2;
        return gmVar2;
    }

    public boolean canRepeat() {
        return a().b;
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(gm gmVar);

    public boolean shouldPost() {
        return a().c;
    }

    public final boolean willWriteParams() {
        return a().d;
    }

    public final boolean willWriteSupplyParams() {
        return a().e;
    }

    public final void writeParams(zp7 zp7) throws IOException, JsonSerializeException {
        a().c(zp7);
    }

    public final void writeSupplyParams(zp7 zp7) throws IOException, JsonSerializeException {
        a().d(zp7);
    }
}
