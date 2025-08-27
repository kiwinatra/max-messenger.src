package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomInactiveException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomNotAdminException;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0004¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "", "()V", "parseErrorResponse", "", "method", "", "errorResponse", "Lorg/json/JSONObject;", "onError", "Lkotlin/Function1;", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SessionRoomCommandExecutorBase {
    public final void parseErrorResponse(String str, JSONObject jSONObject, Function1<? super Throwable, Unit> function1) {
        Object obj;
        if (function1 != null) {
            String optString = jSONObject.optString("error");
            if (Intrinsics.areEqual((Object) optString, (Object) "rooms.roomInactive")) {
                obj = new SessionRoomInactiveException();
            } else if (Intrinsics.areEqual((Object) optString, (Object) "rooms.notAdmin")) {
                obj = new SessionRoomNotAdminException();
            } else {
                obj = new SessionRoomException("Error response for " + str + " command " + jSONObject, (Throwable) null, 2, (DefaultConstructorMarker) null);
            }
            function1.invoke(obj);
        }
    }
}
