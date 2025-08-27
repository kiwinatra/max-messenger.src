package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrof;", "invoke", "()Lrof;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class TracerLiteFacade$crashReport$2 extends Lambda implements Function0<rof> {
    final /* synthetic */ TracerLiteFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$crashReport$2(TracerLiteFacade tracerLiteFacade) {
        super(0);
        this.this$0 = tracerLiteFacade;
    }

    public final rof invoke() {
        return new rof(this.this$0.getTracerLite());
    }
}
