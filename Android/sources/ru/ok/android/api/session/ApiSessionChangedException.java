package ru.ok.android.api.session;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/session/ApiSessionChangedException;", "Lru/ok/android/api/core/ApiInvocationException;", "odnoklassniki-android-api_release"}, k = 1, mv = {1, 8, 0})
public final class ApiSessionChangedException extends ApiInvocationException {
    public final String x;
    public final String y;

    public ApiSessionChangedException(String str, String str2, String str3) {
        super(107, str);
        this.x = str2;
        this.y = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiSessionChangedException{sessionKey=");
        sb.append(this.x);
        sb.append("sessionSecret='");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb.append(String.format(Locale.US, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.y.hashCode())}, 1)));
        sb.append("', errorCode=");
        sb.append(this.a);
        sb.append(", errorMessage='");
        sb.append(this.b);
        sb.append("', errorField='");
        sb.append(this.c);
        sb.append("', errorData='");
        sb.append(this.o);
        sb.append("', errorCustomData=");
        sb.append(this.w);
        sb.append(", errorCustomKey='");
        return wj6.n(sb, this.v, "'}");
    }
}
