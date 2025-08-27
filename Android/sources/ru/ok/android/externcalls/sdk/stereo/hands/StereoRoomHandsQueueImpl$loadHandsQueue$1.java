package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@SourceDebugExtension({"SMAP\nStereoRoomHandsQueueImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl$loadHandsQueue$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl$loadHandsQueue$1\n*L\n47#1:103\n47#1:104,3\n*E\n"})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "totalCount", "", "hasMore", "", "Lrn1;", "queue", "", "invoke", "(IZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl$loadHandsQueue$1 extends Lambda implements Function3<Integer, Boolean, List<? extends rn1>, Unit> {
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$loadHandsQueue$1(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, Function0<Unit> function0) {
        super(3);
        this.this$0 = stereoRoomHandsQueueImpl;
        this.$onSuccess = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (List<rn1>) (List) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, boolean z, final List<rn1> list) {
        this.this$0.totalCount = i;
        this.this$0.hasMore = z;
        Function2 access$getIdsResolverHelper$p = this.this$0.idsResolverHelper;
        Iterable<rn1> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (rn1 rn1 : iterable) {
            arrayList.add(rn1.b);
        }
        final Function0<Unit> function0 = this.$onSuccess;
        final StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
        access$getIdsResolverHelper$p.invoke(arrayList, new Function0<Unit>() {
            public final void invoke() {
                StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = stereoRoomHandsQueueImpl;
                for (rn1 rn1 : list) {
                    ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(rn1.b);
                    if (participantId != null) {
                        stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, rn1.a), true);
                    }
                }
                function0.invoke();
                stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
            }
        });
    }
}
