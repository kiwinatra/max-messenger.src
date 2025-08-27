package defpackage;

import android.net.Uri;

/* renamed from: hm  reason: default package */
public interface hm {
    int getPriority() {
        return 16;
    }

    mm getScope();

    Uri getUri();

    boolean shouldGzip() {
        return false;
    }

    boolean shouldPost();

    boolean willWriteParams() {
        return true;
    }

    boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(zp7 zp7);

    void writeSupplyParams(zp7 zp7) {
    }
}
