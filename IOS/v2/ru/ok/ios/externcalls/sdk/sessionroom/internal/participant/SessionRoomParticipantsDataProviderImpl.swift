package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001J\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0010\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010*\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130-2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020&2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020&002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0-\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b6\u0010+JE\u0010:\u001a\u00020&2\n\u00109\u001a\u000607j\u0002`82\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b:\u0010;JG\u0010>\u001a\u00020&2\n\u0010<\u001a\u000607j\u0002`82\u0016\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b>\u0010;J3\u0010A\u001a\u0016\u0012\b\u0012\u000607j\u0002`8\u0012\b\u0012\u00060\u0012j\u0002`\u00130@2\u0010\u0010?\u001a\f\u0012\b\u0012\u000607j\u0002`80\u0011¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lywd;", "getRoomIds", "()Ljava/util/Set;", "roomId", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRoomParticipantIds", "(Lywd;)Ljava/util/Collection;", "getAllRoomParticipantIds", "()Ljava/util/Collection;", "Lzwd;", "internalIds", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "mapInternalIdsToSessionRoomParticipants", "(Lzwd;Ljava/util/Collection;)Ljava/util/Collection;", "internalId", "mapInternalIdToSessionRoomParticipant", "(Lue1;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "mapConversationParticipantToSessionRoomParticipant", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "", "onSuccess", "", "onError", "getMainCallParticipantIds", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "participantIds", "", "getUnresolvedExternalIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lkotlin/Function0;", "onResolve", "resolveParticipantIds", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getRoomParticipants", "(Lzwd;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAllInRoomParticipants", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "externalId", "onIdResolved", "resolveInternalIdByExternal", "externalIds", "", "getInternalIdsByExternal", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "", "Ltwd;", "knownSessionRooms", "Ljava/util/Map;", "ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "roomsListener", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSessionRoomParticipantsDataProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRoomParticipantsDataProviderImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1855#2,2:247\n1603#2,9:249\n1855#2:258\n1856#2:260\n1612#2:261\n1855#2,2:262\n766#2:264\n857#2,2:265\n1549#2:267\n1620#2,3:268\n1#3:259\n*S KotlinDebug\n*F\n+ 1 SessionRoomParticipantsDataProviderImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl\n*L\n131#1:247,2\n151#1:249,9\n151#1:258\n151#1:260\n151#1:261\n161#1:262,2\n205#1:264\n205#1:265,2\n207#1:267\n207#1:268,3\n151#1:259\n*E\n"})
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    /* access modifiers changed from: private */
    public final Map<ywd, twd> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        SessionRoomParticipantsDataProviderImpl$roomsListener$1 sessionRoomParticipantsDataProviderImpl$roomsListener$1 = new SessionRoomParticipantsDataProviderImpl$roomsListener$1(this);
        this.roomsListener = sessionRoomParticipantsDataProviderImpl$roomsListener$1;
        sessionRoomListenerManagerImpl.addListener(sessionRoomParticipantsDataProviderImpl$roomsListener$1);
    }

    private final Collection<ue1> getAllRoomParticipantIds() {
        ArrayList arrayList = new ArrayList();
        for (twd twd : this.knownSessionRooms.values()) {
            List list = twd.e;
            if (list != null) {
                arrayList.add(list);
            }
        }
        return CollectionsKt.flatten(arrayList);
    }

    private final void getMainCallParticipantIds(Function1<? super SessionRoomParticipants, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Set set = CollectionsKt.toSet(getAllRoomParticipantIds());
        ParticipantStore participantStore = this.store;
        xwd xwd = xwd.a;
        ArrayList arrayList = new ArrayList();
        for (Object next : participantStore.getParticipants(xwd)) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) next;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !set.contains(conversationParticipant.getInternalId())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant((ConversationParticipant) it.next()));
        }
        function1.invoke(new SessionRoomParticipants(xwd, arrayList2));
    }

    private final Set<ywd> getRoomIds() {
        return CollectionsKt.toSet(this.knownSessionRooms.keySet());
    }

    /* access modifiers changed from: private */
    public final Collection<ue1> getRoomParticipantIds(ywd ywd) {
        List emptyList;
        List list;
        twd twd = this.knownSessionRooms.get(ywd);
        if (twd == null || (list = twd.e) == null || (emptyList = CollectionsKt.toList(list)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    private final List<ue1> getUnresolvedExternalIds(Collection<ue1> collection) {
        ArrayList arrayList = new ArrayList();
        for (ue1 next : collection) {
            if (this.idMappingWrapper.getByInternal(next) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant conversationParticipant) {
        return new SessionRoomParticipants.Participant(conversationParticipant.getExternalId(), this.store.getParticipantRoomId(conversationParticipant), conversationParticipant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(ue1 ue1) {
        ConversationParticipant byInternal = this.store.getByInternal(ue1);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(ue1);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, (zwd) null, (ConversationParticipant) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(zwd zwd, Collection<ue1> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ue1 mapInternalIdToSessionRoomParticipant : collection) {
            SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant2 = mapInternalIdToSessionRoomParticipant(mapInternalIdToSessionRoomParticipant);
            if (mapInternalIdToSessionRoomParticipant2 != null) {
                linkedHashMap.put(mapInternalIdToSessionRoomParticipant2.getId(), mapInternalIdToSessionRoomParticipant2);
            }
        }
        for (ConversationParticipant next : this.store.getParticipants(zwd)) {
            if (!linkedHashMap.containsKey(next.getExternalId()) && (next.isAdmin() || next.isCreator())) {
                linkedHashMap.put(next.getExternalId(), mapConversationParticipantToSessionRoomParticipant(next));
            }
        }
        return linkedHashMap.values();
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$0(Function1 function1, Function1 function12, ParticipantId participantId, ue1 ue1) {
        if (ue1 != null) {
            function1.invoke(ue1);
        } else if (function12 != null) {
            function12.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$1(Function1 function1, ParticipantId participantId) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<ue1> collection, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        if (collection.isEmpty()) {
            function0.invoke();
            return;
        }
        List<ue1> unresolvedExternalIds = getUnresolvedExternalIds(collection);
        if (unresolvedExternalIds.isEmpty()) {
            function0.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new si0(8, function0), new axd(0, function1));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$8(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$9(Function1 function1) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    public void getAllInRoomParticipants(Function1<? super List<SessionRoomParticipants>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Set<ywd> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            function1.invoke(CollectionsKt.emptyList());
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1(roomIds, this, function1), function12);
        }
    }

    public final Map<ParticipantId, ue1> getInternalIdsByExternal(Collection<ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : collection) {
            ue1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal != null) {
                linkedHashMap.put(participantId, byExternal);
            } else {
                throw new RuntimeException("Unresolved external participant id " + participantId);
            }
        }
        return linkedHashMap;
    }

    public void getParticipantRoomId(ParticipantId participantId, Function1<? super zwd, Unit> function1, Function1<? super Throwable, Unit> function12) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal != null) {
            zwd participantRoomId = this.store.getParticipantRoomId(byExternal);
            if (participantRoomId != null) {
                function1.invoke(participantRoomId);
            } else if (function12 != null) {
                function12.invoke(new RuntimeException("Can't find room data for participant " + participantId));
            }
        } else if (function12 != null) {
            function12.invoke(new RuntimeException("Participant " + participantId + " not found"));
        }
    }

    public void getRoomParticipants(zwd zwd, Function1<? super SessionRoomParticipants, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (zwd instanceof xwd) {
            getMainCallParticipantIds(function1, function12);
        } else if (zwd instanceof ywd) {
            Collection<ue1> roomParticipantIds = getRoomParticipantIds((ywd) zwd);
            resolveParticipantIds(roomParticipantIds, new SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(function1, zwd, this, roomParticipantIds), function12);
        }
    }

    public final void resolveInternalIdByExternal(ParticipantId participantId, Function1<? super ue1, Unit> function1, Function1<? super Throwable, Unit> function12) {
        this.idMappingResolver.withInternalId(participantId, new wh4(function1, function12, participantId, 2), new ovb(28, function12, participantId));
    }
}
