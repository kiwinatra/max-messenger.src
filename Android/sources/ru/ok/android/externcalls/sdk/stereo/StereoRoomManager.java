package ru.ok.android.externcalls.sdk.stereo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J.\u0010\u0010\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u0015\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J.\u0010\u0016\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u0017\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J.\u0010\u0018\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u0019\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u001a\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J:\u0010\u001b\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "isMePromoted", "", "()Z", "acceptPromotion", "", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "cancelPromotionRequest", "grantAdmin", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "promoteParticipant", "rejectPromotion", "rejectPromotionRequest", "requestPromotion", "revokeAdmin", "revokePromotion", "unpromoteParticipant", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StereoRoomManager extends StereoRoomListenerManager {
    static /* synthetic */ void acceptPromotion$default(StereoRoomManager stereoRoomManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            stereoRoomManager.acceptPromotion(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptPromotion");
    }

    static /* synthetic */ void cancelPromotionRequest$default(StereoRoomManager stereoRoomManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            stereoRoomManager.cancelPromotionRequest(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelPromotionRequest");
    }

    static /* synthetic */ void grantAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.grantAdmin(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: grantAdmin");
    }

    static /* synthetic */ void promoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.promoteParticipant(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: promoteParticipant");
    }

    static /* synthetic */ void rejectPromotion$default(StereoRoomManager stereoRoomManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            stereoRoomManager.rejectPromotion(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotion");
    }

    static /* synthetic */ void rejectPromotionRequest$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.rejectPromotionRequest(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotionRequest");
    }

    static /* synthetic */ void requestPromotion$default(StereoRoomManager stereoRoomManager, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            stereoRoomManager.requestPromotion(function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPromotion");
    }

    static /* synthetic */ void revokeAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.revokeAdmin(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokeAdmin");
    }

    static /* synthetic */ void revokePromotion$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.revokePromotion(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokePromotion");
    }

    static /* synthetic */ void unpromoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            stereoRoomManager.unpromoteParticipant(participantId, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unpromoteParticipant");
    }

    void acceptPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void cancelPromotionRequest(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    StereoRoomHandsQueue getHandsQueue();

    void grantAdmin(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    boolean isMePromoted();

    void promoteParticipant(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void rejectPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void rejectPromotionRequest(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void requestPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void revokeAdmin(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void revokePromotion(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void unpromoteParticipant(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
