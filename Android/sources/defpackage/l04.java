package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;

/* renamed from: l04  reason: default package */
public final class l04 implements nof {
    public final Map a;
    public final int b;

    public l04(xe8 xe8) {
        xe8.getClass();
        this.a = MapsKt.toMap((LinkedHashMap) xe8.b);
        Integer num = (Integer) xe8.c;
        this.b = num != null ? num.intValue() : -1;
    }

    public static String b() {
        Object obj;
        String str = null;
        try {
            obj = Result.m23constructorimpl((Object) null);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m29isFailureimpl(obj)) {
            str = obj;
        }
        String str2 = str;
        return str2 == null ? "https://sdk-api.apptracer.ru" : str2;
    }

    public final frg a() {
        return iq.c;
    }
}
