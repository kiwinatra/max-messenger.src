package ru.ok.android.api.http;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/api/http/NoHttpApiEndpointException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "odnoklassniki-android-httpapi_release"}, k = 1, mv = {1, 8, 0})
public final class NoHttpApiEndpointException extends NoSuchElementException {
    public NoHttpApiEndpointException(String str) {
        super(a81.m("No endpoint for authority ", str));
    }
}
