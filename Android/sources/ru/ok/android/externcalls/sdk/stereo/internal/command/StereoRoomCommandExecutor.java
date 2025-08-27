package ru.ok.android.externcalls.sdk.stereo.internal.command;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0003\u001e\u001f J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011Jx\u0010\u001c\u001a\u00020\u00052Q\u0010\u0006\u001aM\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00050\u00122\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "totalCount", "", "hasMore", "", "Lrn1;", "participantIds", "getHandsQueue", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "AcceptPromotionParams", "PromoteParticipantParams", "RequestPromotionParams", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface StereoRoomCommandExecutor {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "", "reject", "", "(Z)V", "getReject", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AcceptPromotionParams {
        private final boolean reject;

        public AcceptPromotionParams(boolean z) {
            this.reject = z;
        }

        public static /* synthetic */ AcceptPromotionParams copy$default(AcceptPromotionParams acceptPromotionParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = acceptPromotionParams.reject;
            }
            return acceptPromotionParams.copy(z);
        }

        public final boolean component1() {
            return this.reject;
        }

        public final AcceptPromotionParams copy(boolean z) {
            return new AcceptPromotionParams(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AcceptPromotionParams) && this.reject == ((AcceptPromotionParams) obj).reject;
        }

        public final boolean getReject() {
            return this.reject;
        }

        public int hashCode() {
            return Boolean.hashCode(this.reject);
        }

        public String toString() {
            boolean z = this.reject;
            return "AcceptPromotionParams(reject=" + z + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "promote", "<init>", "(Lue1;Z)V", "component1", "()Lue1;", "component2", "()Z", "copy", "(Lue1;Z)Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lue1;", "getParticipantId", "Z", "getPromote", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PromoteParticipantParams {
        private final ue1 participantId;
        private final boolean promote;

        public PromoteParticipantParams(ue1 ue1, boolean z) {
            this.participantId = ue1;
            this.promote = z;
        }

        public static /* synthetic */ PromoteParticipantParams copy$default(PromoteParticipantParams promoteParticipantParams, ue1 ue1, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                ue1 = promoteParticipantParams.participantId;
            }
            if ((i & 2) != 0) {
                z = promoteParticipantParams.promote;
            }
            return promoteParticipantParams.copy(ue1, z);
        }

        public final ue1 component1() {
            return this.participantId;
        }

        public final boolean component2() {
            return this.promote;
        }

        public final PromoteParticipantParams copy(ue1 ue1, boolean z) {
            return new PromoteParticipantParams(ue1, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoteParticipantParams)) {
                return false;
            }
            PromoteParticipantParams promoteParticipantParams = (PromoteParticipantParams) obj;
            return Intrinsics.areEqual((Object) this.participantId, (Object) promoteParticipantParams.participantId) && this.promote == promoteParticipantParams.promote;
        }

        public final ue1 getParticipantId() {
            return this.participantId;
        }

        public final boolean getPromote() {
            return this.promote;
        }

        public int hashCode() {
            return Boolean.hashCode(this.promote) + (this.participantId.hashCode() * 31);
        }

        public String toString() {
            ue1 ue1 = this.participantId;
            boolean z = this.promote;
            return "PromoteParticipantParams(participantId=" + ue1 + ", promote=" + z + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "", "unrequest", "", "(Z)V", "getUnrequest", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequestPromotionParams {
        private final boolean unrequest;

        public RequestPromotionParams(boolean z) {
            this.unrequest = z;
        }

        public static /* synthetic */ RequestPromotionParams copy$default(RequestPromotionParams requestPromotionParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = requestPromotionParams.unrequest;
            }
            return requestPromotionParams.copy(z);
        }

        public final boolean component1() {
            return this.unrequest;
        }

        public final RequestPromotionParams copy(boolean z) {
            return new RequestPromotionParams(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestPromotionParams) && this.unrequest == ((RequestPromotionParams) obj).unrequest;
        }

        public final boolean getUnrequest() {
            return this.unrequest;
        }

        public int hashCode() {
            return Boolean.hashCode(this.unrequest);
        }

        public String toString() {
            boolean z = this.unrequest;
            return "RequestPromotionParams(unrequest=" + z + ")";
        }
    }

    void acceptPromotion(AcceptPromotionParams acceptPromotionParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void getHandsQueue(Function3<? super Integer, ? super Boolean, ? super List<rn1>, Unit> function3, Function1<? super Throwable, Unit> function1);

    void promoteParticipant(PromoteParticipantParams promoteParticipantParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void requestPromotion(RequestPromotionParams requestPromotionParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
