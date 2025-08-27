package ru.ok.android.api.http;

import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/http/HttpStatusApiException;", "Lru/ok/android/api/core/ApiException;", "odnoklassniki-android-httpapi_release"}, k = 1, mv = {1, 8, 0})
public final class HttpStatusApiException extends ApiException {
    public final int a;

    public HttpStatusApiException(int i) {
        super(wj6.h(i, "HTTP "));
        this.a = i;
    }
}
