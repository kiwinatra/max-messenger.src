package ru.ok.android.api.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/core/ApiInvocationException;", "Lru/ok/android/api/core/ApiException;", "odnoklassniki-android-api_release"}, k = 1, mv = {1, 8, 0})
public class ApiInvocationException extends ApiException {
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final String v;
    public final String w;

    public ApiInvocationException(int i, String str) {
        this(str, (String) null, i, (String) null, (String) null, (String) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApiInvocationException{errorCode=");
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

    public ApiInvocationException(String str, String str2, int i, String str3, String str4, String str5) {
        super(i + ' ' + str);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = str4;
        this.w = str5;
    }
}
