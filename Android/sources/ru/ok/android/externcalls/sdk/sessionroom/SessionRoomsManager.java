package ru.ok.android.externcalls.sdk.sessionroom;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002()J5\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00132\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00162\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00192\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001c2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH'¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lywd;", "roomId", "joinRoom", "(Lywd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "leaveRoom", "Le8;", "params", "activateRooms", "(Le8;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lwwf;", "updateRooms", "(Lwwf;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Ln1d;", "removeRooms", "(Ln1d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "removeListener", "OwnRoomsListener", "SessionRoomInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface SessionRoomsManager extends SessionRoomParticipantsDataProvider {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "", "onActiveRoomChanged", "", "event", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "onProposedRoomChanged", "onRoomRemoved", "onRoomUpdated", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OwnRoomsListener {
        void onActiveRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onProposedRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onRoomRemoved(SessionRoomInfo sessionRoomInfo);

        void onRoomUpdated(SessionRoomInfo sessionRoomInfo);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "Lzwd;", "roomId", "Ltwd;", "room", "<init>", "(Lzwd;Ltwd;)V", "component1", "()Lzwd;", "component2", "()Ltwd;", "copy", "(Lzwd;Ltwd;)Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzwd;", "getRoomId", "Ltwd;", "getRoom", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class SessionRoomInfo {
        private final twd room;
        private final zwd roomId;

        public SessionRoomInfo(zwd zwd, twd twd) {
            this.roomId = zwd;
            this.room = twd;
        }

        public static /* synthetic */ SessionRoomInfo copy$default(SessionRoomInfo sessionRoomInfo, zwd zwd, twd twd, int i, Object obj) {
            if ((i & 1) != 0) {
                zwd = sessionRoomInfo.roomId;
            }
            if ((i & 2) != 0) {
                twd = sessionRoomInfo.room;
            }
            return sessionRoomInfo.copy(zwd, twd);
        }

        public final zwd component1() {
            return this.roomId;
        }

        public final twd component2() {
            return this.room;
        }

        public final SessionRoomInfo copy(zwd zwd, twd twd) {
            return new SessionRoomInfo(zwd, twd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRoomInfo)) {
                return false;
            }
            SessionRoomInfo sessionRoomInfo = (SessionRoomInfo) obj;
            return Intrinsics.areEqual((Object) this.roomId, (Object) sessionRoomInfo.roomId) && Intrinsics.areEqual((Object) this.room, (Object) sessionRoomInfo.room);
        }

        public final twd getRoom() {
            return this.room;
        }

        public final zwd getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            int hashCode = this.roomId.hashCode() * 31;
            twd twd = this.room;
            return hashCode + (twd == null ? 0 : twd.hashCode());
        }

        public String toString() {
            zwd zwd = this.roomId;
            twd twd = this.room;
            return "SessionRoomInfo(roomId=" + zwd + ", room=" + twd + ")";
        }
    }

    void activateRooms(e8 e8Var, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void addListener(OwnRoomsListener ownRoomsListener);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    SessionRoomInfo getOwnActiveRoom();

    SessionRoomInfo getOwnProposedRoom();

    void joinRoom(ywd ywd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void leaveRoom(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void moveParticipant(MoveParticipantParams moveParticipantParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void removeListener(OwnRoomsListener ownRoomsListener);

    void removeRooms(n1d n1d, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void requestAttention(Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void updateRooms(wwf wwf, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
