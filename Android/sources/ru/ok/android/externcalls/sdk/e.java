package ru.ok.android.externcalls.sdk;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ e(ConversationImpl conversationImpl, Serializable serializable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = serializable;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.lambda$withInternalIds$35((ArrayList) this.c);
            default:
                return this.b.lambda$withInternalId$33((ParticipantId) this.c);
        }
    }
}
