package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012F\u0010\u000e\u001aB\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u0004\u0012\u001e\u0010\u0012\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J;\u0010-\u001a\u00020\f2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fH\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103RT\u0010\u000e\u001aB\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R,\u0010\u0012\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R8\u0010:\u001a&\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u001e08j\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u001e`98\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010+\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010>¨\u0006?"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/ParameterName;", "name", "ids", "Lkotlin/Function0;", "", "block", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lrjf;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lrjf;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "item", "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lun1;", "event", "onHandUp", "(Lun1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lrjf;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStereoRoomHandsQueueImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n135#2,9:103\n215#2:112\n216#2:114\n144#2:115\n1#3:113\n1045#4:116\n*S KotlinDebug\n*F\n+ 1 StereoRoomHandsQueueImpl.kt\nru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl\n*L\n23#1:103,9\n23#1:112\n23#1:114\n23#1:115\n23#1:113\n23#1:116\n*E\n"})
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    /* access modifiers changed from: private */
    public final Function1<ue1, ParticipantId> getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    /* access modifiers changed from: private */
    public boolean hasMore = true;
    /* access modifiers changed from: private */
    public final Function2<List<ue1>, Function0<Unit>, Unit> idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    /* access modifiers changed from: private */
    public final rjf timeProvider;
    /* access modifiers changed from: private */
    public int totalCount;

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, Function2<? super List<ue1>, ? super Function0<Unit>, Unit> function2, Function1<? super ue1, ParticipantId> function1, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, rjf rjf) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = function2;
        this.getExternalId = function1;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = rjf;
    }

    private final void loadHandsQueue(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.getHandsQueue(new StereoRoomHandsQueueImpl$loadHandsQueue$1(this, function0), function1);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(function0, function1);
    }

    /* access modifiers changed from: private */
    public final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* access modifiers changed from: private */
    public final void participantHandChanged(StereoHandQueueItem stereoHandQueueItem, boolean z) {
        if (z) {
            this.handQueue.put(stereoHandQueueItem.getParticipantId(), stereoHandQueueItem);
        } else {
            this.handQueue.remove(stereoHandQueueItem.getParticipantId());
        }
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void loadMoreElements(Function1<? super StereoRoomHandsQueue, Unit> function1, Function1<? super Throwable, Unit> function12) {
        loadHandsQueue(new StereoRoomHandsQueueImpl$loadMoreElements$1(function1, this), function12);
    }

    public final void onHandUp(un1 un1) {
        this.idsResolverHelper.invoke(CollectionsKt.plus(un1.b, un1.c), new StereoRoomHandsQueueImpl$onHandUp$1(un1, this));
    }

    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> hashMap = this.handQueue;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ParticipantId, StereoHandQueueItem> value : hashMap.entrySet()) {
            StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) value.getValue();
            if (stereoHandQueueItem != null) {
                arrayList.add(stereoHandQueueItem);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1());
    }
}
