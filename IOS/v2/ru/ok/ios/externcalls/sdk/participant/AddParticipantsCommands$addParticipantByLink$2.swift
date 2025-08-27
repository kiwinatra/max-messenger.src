package ru.ok.android.externcalls.sdk.participant;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo9e;", "signaling", "", "invoke", "(Lo9e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AddParticipantsCommands$addParticipantByLink$2 extends Lambda implements Function1<o9e, Unit> {
    final /* synthetic */ String $link;
    final /* synthetic */ rk3 $onError;
    final /* synthetic */ Runnable $onSuccess;
    final /* synthetic */ AddParticipantsCommands this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddParticipantsCommands$addParticipantByLink$2(String str, rk3 rk3, Runnable runnable, AddParticipantsCommands addParticipantsCommands) {
        super(1);
        this.$link = str;
        this.$onError = rk3;
        this.$onSuccess = runnable;
        this.this$0 = addParticipantsCommands;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(Runnable runnable, JSONObject jSONObject) {
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1(rk3 rk3, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        rk3.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o9e) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(o9e o9e) {
        try {
            String str = this.$link;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("participantIdAsQRCodeLink", (Object) str);
            o9e.d(tf6.a(jSONObject, "add-participant"), false, new a(this.$onSuccess), new b(this.$onError, this.this$0, 0));
        } catch (JSONException e) {
            this.$onError.accept(new RuntimeException("Request preparation error", e));
        }
    }
}
