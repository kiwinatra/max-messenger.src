package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* renamed from: jm  reason: default package */
public interface jm {
    public static final im a = new Object();

    void debugApiException(xl xlVar, hm hmVar, ApiException apiException) {
    }

    void debugApiRequest(xl xlVar, hm hmVar, yl ylVar) {
    }

    sp7 debugApiResponseFail(xl xlVar, hm hmVar, sp7 sp7) {
        return sp7;
    }

    sp7 debugApiResponseOk(xl xlVar, hm hmVar, sp7 sp7) {
        return sp7;
    }

    void debugIoException(xl xlVar, hm hmVar, IOException iOException) {
    }
}
