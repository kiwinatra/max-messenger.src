package defpackage;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* renamed from: xz0  reason: default package */
public final class xz0 implements jm {
    public final void debugApiException(xl xlVar, hm hmVar, ApiException apiException) {
        Uri uri = hmVar.getUri();
        String message = apiException.getMessage();
        z68.o("ApiProviderTag", "debugApiException: " + uri + " " + message, apiException);
    }

    public final void debugApiRequest(xl xlVar, hm hmVar, yl ylVar) {
        Uri uri = hmVar.getUri();
        z68.c("ApiProviderTag", "debugApiRequest: " + uri, new Object[0]);
    }

    public final sp7 debugApiResponseFail(xl xlVar, hm hmVar, sp7 sp7) {
        Uri uri = hmVar.getUri();
        z68.p("ApiProviderTag", "debugApiResponseFail: " + uri);
        return sp7;
    }

    public final sp7 debugApiResponseOk(xl xlVar, hm hmVar, sp7 sp7) {
        Uri uri = hmVar.getUri();
        z68.c("ApiProviderTag", "debugApiResponseOk: " + uri, new Object[0]);
        return sp7;
    }

    public final void debugIoException(xl xlVar, hm hmVar, IOException iOException) {
        Uri uri = hmVar.getUri();
        String message = iOException.getMessage();
        z68.o("ApiProviderTag", "debugIoException: " + uri + " " + message, iOException);
    }
}
