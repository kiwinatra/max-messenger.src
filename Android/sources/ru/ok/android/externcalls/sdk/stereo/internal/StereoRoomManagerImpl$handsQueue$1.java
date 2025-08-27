package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends FunctionReferenceImpl implements Function2<List<? extends ue1>, Function0<? extends Unit>, Unit> {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, obj, StereoRoomManagerImpl.class, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<ue1>) (List) obj, (Function0<Unit>) (Function0) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(List<ue1> list, Function0<Unit> function0) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, function0);
    }
}
