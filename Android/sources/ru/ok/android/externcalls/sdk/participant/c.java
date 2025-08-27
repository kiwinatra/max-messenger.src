package ru.ok.android.externcalls.sdk.participant;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public final /* synthetic */ class c implements n9e {
    public final /* synthetic */ AddParticipantsCommands a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ c(AddParticipantsCommands addParticipantsCommands, Function1 function1, Function1 function12) {
        this.a = addParticipantsCommands;
        this.b = function1;
        this.c = function12;
    }

    public final void k(JSONObject jSONObject) {
        AddParticipantsCommands$addParticipants$1.invoke$lambda$4(this.a, this.b, this.c, jSONObject);
    }
}
