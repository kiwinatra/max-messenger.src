package ru.ok.android.externcalls.sdk.participant;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class AddParticipantsCommands$addParticipantByLink$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    public AddParticipantsCommands$addParticipantByLink$1(Object obj) {
        super(1, obj, rk3.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        ((rk3) this.receiver).accept(th);
    }
}
