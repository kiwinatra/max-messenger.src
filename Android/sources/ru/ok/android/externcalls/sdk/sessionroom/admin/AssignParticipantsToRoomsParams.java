package ru.ok.android.externcalls.sdk.sessionroom.admin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000fBE\b\u0002\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0002\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0002¢\u0006\u0004\b\t\u0010\nR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR-\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "", "", "Lywd;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addParticipantsToRoomsMap", "removeParticipantsFromRoomsMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "getAddParticipantsToRoomsMap", "()Ljava/util/Map;", "getRemoveParticipantsFromRoomsMap", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AssignParticipantsToRoomsParams {
    private final Map<ywd, List<ParticipantId>> addParticipantsToRoomsMap;
    private final Map<ywd, List<ParticipantId>> removeParticipantsFromRoomsMap;

    @SourceDebugExtension({"SMAP\nAssignParticipantsToRoomsParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssignParticipantsToRoomsParams.kt\nru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams$Builder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,44:1\n372#2,7:45\n372#2,7:52\n*S KotlinDebug\n*F\n+ 1 AssignParticipantsToRoomsParams.kt\nru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams$Builder\n*L\n23#1:45,7\n32#1:52,7\n*E\n"})
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams$Builder;", "", "<init>", "()V", "Lywd;", "roomId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "addRoomParticipant", "(Lywd;Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams$Builder;", "removeRoomParticipant", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "build", "()Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "", "", "addParticipantsToRoomsMap", "Ljava/util/Map;", "removeParticipantsFromRoomsMap", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private final Map<ywd, List<ParticipantId>> addParticipantsToRoomsMap = new LinkedHashMap();
        private final Map<ywd, List<ParticipantId>> removeParticipantsFromRoomsMap = new LinkedHashMap();

        public final Builder addRoomParticipant(ywd ywd, ParticipantId participantId) {
            Map<ywd, List<ParticipantId>> map = this.addParticipantsToRoomsMap;
            List<ParticipantId> list = map.get(ywd);
            if (list == null) {
                list = new ArrayList<>();
                map.put(ywd, list);
            }
            list.add(participantId);
            return this;
        }

        public final AssignParticipantsToRoomsParams build() {
            return new AssignParticipantsToRoomsParams(MapsKt.toMap(this.addParticipantsToRoomsMap), MapsKt.toMap(this.removeParticipantsFromRoomsMap), (DefaultConstructorMarker) null);
        }

        public final Builder removeRoomParticipant(ywd ywd, ParticipantId participantId) {
            Map<ywd, List<ParticipantId>> map = this.removeParticipantsFromRoomsMap;
            List<ParticipantId> list = map.get(ywd);
            if (list == null) {
                list = new ArrayList<>();
                map.put(ywd, list);
            }
            list.add(participantId);
            return this;
        }
    }

    public /* synthetic */ AssignParticipantsToRoomsParams(Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, map2);
    }

    public final Map<ywd, List<ParticipantId>> getAddParticipantsToRoomsMap() {
        return this.addParticipantsToRoomsMap;
    }

    public final Map<ywd, List<ParticipantId>> getRemoveParticipantsFromRoomsMap() {
        return this.removeParticipantsFromRoomsMap;
    }

    private AssignParticipantsToRoomsParams(Map<ywd, ? extends List<ParticipantId>> map, Map<ywd, ? extends List<ParticipantId>> map2) {
        this.addParticipantsToRoomsMap = map;
        this.removeParticipantsFromRoomsMap = map2;
    }
}
