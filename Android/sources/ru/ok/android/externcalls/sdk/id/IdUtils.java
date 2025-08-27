package ru.ok.android.externcalls.sdk.id;

import ru.ok.android.externcalls.sdk.api.InternalIdResponse;

public final class IdUtils {
    private IdUtils() {
        throw new AssertionError("utility class");
    }

    public static sl0 resolveInternalRequest(String str, boolean z) {
        rl0 y = hsg.y("vchat.getOkIdByExternalId");
        y.b = mm.c;
        y.b("externalId", str);
        y.c("anonym", z);
        return y.a(InternalIdResponse.PARSER);
    }
}
