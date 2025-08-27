package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010F¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater;", "Lrz0;", "Ljf1;", "Lxj1;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "listener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "statesManager", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "mappingUpdater", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "meChanger", "Lte1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;Lte1;)V", "Lff1;", "params", "", "onCallParticipantsAdded", "(Lff1;)V", "Lmz0;", "onActiveParticipantsAdded", "(Lmz0;)V", "Lgf1;", "onCallParticipantsChanged", "(Lgf1;)V", "Lnz0;", "onActiveParticipantsChanged", "(Lnz0;)V", "Lhf1;", "onCallParticipantsDeAnonimized", "(Lhf1;)V", "Loz0;", "onActiveParticipantsDeAnonimized", "(Loz0;)V", "Lif1;", "onCallParticipantsRemoved", "(Lif1;)V", "Lpz0;", "onActiveParticipantsRemoved", "(Lpz0;)V", "Lqz0;", "onActiveParticipantUpdated", "(Lqz0;)V", "Ltj1;", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "Lwj1;", "onRoomUpdated", "(Lwj1;)V", "Luj1;", "onCurrentParticipantInvitedToRoom", "(Luj1;)V", "Lvj1;", "onRoomRemoved", "(Lvj1;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "Lte1;", "MappingUpdater", "MeChanger", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nParticipantsUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParticipantsUpdater.kt\nru/ok/android/externcalls/sdk/participant/ParticipantsUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1864#2,3:206\n*S KotlinDebug\n*F\n+ 1 ParticipantsUpdater.kt\nru/ok/android/externcalls/sdk/participant/ParticipantsUpdater\n*L\n63#1:206,3\n*E\n"})
public final class ParticipantsUpdater implements rz0, jf1, xj1 {
    private final te1 callParams;
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "", "reportIfApplicable", "", "triggerMapUpdate", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "", "updateMyExternalId", "", "participantExternalId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper2, LocalIdMappings localIdMappings2, MappingUpdater mappingUpdater2, MeChanger meChanger2, te1 te1) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper2;
        this.localIdMappings = localIdMappings2;
        this.mappingUpdater = mappingUpdater2;
        this.meChanger = meChanger2;
        this.callParams = te1;
    }

    public void onActiveParticipantUpdated(qz0 qz0) {
        this.store.setActiveSessionRoom(qz0.c, qz0.d);
        this.listener.onParticipantsUpdated(TypeIntrinsics.asMutableCollection(qz0.b));
    }

    public void onActiveParticipantsAdded(mz0 mz0) {
    }

    public void onActiveParticipantsChanged(nz0 nz0) {
    }

    public void onActiveParticipantsDeAnonimized(oz0 oz0) {
    }

    public void onActiveParticipantsRemoved(pz0 pz0) {
    }

    public void onCallParticipantsAdded(ff1 ff1) {
        List<ye1> list = ff1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (ye1 ye1 : list) {
            ParticipantStore participantStore = this.store;
            ue1 ue1 = ye1.a;
            if (ue1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ue1);
                ParticipantId convert = CallExternalIdConverter.convert(ye1.p);
                if (convert != null) {
                    this.idMappingWrapper.addMapping(convert, ye1.a);
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(convert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ye1 ye12 = (ye1) next;
            ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
            if (conversationParticipant == null) {
                ue1 ue12 = ye12.a;
                if (ue12 != null) {
                    ConversationParticipant createConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(ue12, this.idMappingWrapper);
                    ConversationParticipantExtensionsKt.setCallParticipantExt(createConversationParticipantFromInternal, ye12, this.localIdMappings);
                    this.store.add(createConversationParticipantFromInternal, ff1.a);
                    z = true;
                }
            } else {
                if (conversationParticipant.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, ye12, this.localIdMappings);
                }
                z2 = true;
            }
            i = i2;
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    public void onCallParticipantsChanged(gf1 gf1) {
        ParticipantId convert;
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (ye1 ye1 : gf1.a) {
            ParticipantStore participantStore = this.store;
            ue1 ue1 = ye1.a;
            if (ue1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ue1);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, ye1, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else if (!(!this.callParams.B.j || (convert = CallExternalIdConverter.convert(ye1.p)) == null || (participantById = this.store.getParticipantById(convert)) == null)) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, ye1, this.localIdMappings);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsChanged(arrayList);
        }
    }

    public void onCallParticipantsDeAnonimized(hf1 hf1) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ye1 ye1 : hf1.a) {
            ParticipantStore participantStore = this.store;
            ue1 ue1 = ye1.a;
            if (ue1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ue1);
                e51 e51 = ye1.p;
                if (!(byInternal == null || e51 == null)) {
                    if (!Intrinsics.areEqual((Object) e51.a, (Object) byInternal.getExternalId().id)) {
                        ParticipantId externalId = byInternal.getExternalId();
                        ParticipantId convert = CallExternalIdConverter.convert(e51);
                        if (convert != null) {
                            ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, ye1, externalId, convert, this.localIdMappings);
                            ue1 ue12 = ye1.a;
                            ConversationParticipant me2 = this.store.getMe();
                            if (Intrinsics.areEqual((Object) ue12, (Object) me2 != null ? me2.getInternalId() : null)) {
                                this.meChanger.updateMyExternalId(convert);
                            }
                            if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                                arrayList.add(byInternal);
                                linkedHashMap.put(convert, externalId);
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
        }
    }

    public void onCallParticipantsRemoved(if1 if1) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ye1 ye1 : if1.a) {
            ue1 ue1 = ye1.a;
            if (!(ue1 == null || (byInternal = this.store.getByInternal(ue1)) == null)) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, ye1, this.localIdMappings);
                }
                hashSet.add(ue1);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal((Collection<ue1>) hashSet);
        if (!arrayList.isEmpty()) {
            this.statesManager.onParticipantsRemoved(arrayList);
            this.listener.onParticipantsRemoved(arrayList);
        }
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        this.store.setActiveSessionRoom(tj1.a, tj1.b);
        this.mappingUpdater.reportIfApplicable();
    }

    public void onCurrentParticipantInvitedToRoom(uj1 uj1) {
        this.store.setProposedSessionRoom(uj1.b, uj1.c);
    }

    public void onRoomRemoved(vj1 vj1) {
        boolean areEqual = Intrinsics.areEqual((Object) this.store.getProposedRoomId(), (Object) vj1.a);
        xwd xwd = xwd.a;
        if (areEqual) {
            this.store.setProposedSessionRoom(xwd, (twd) null);
        }
        if (Intrinsics.areEqual((Object) this.store.getActiveRoomId(), (Object) vj1.a)) {
            this.store.setActiveSessionRoom(xwd, (twd) null);
        }
    }

    public void onRoomUpdated(wj1 wj1) {
        this.store.maybeUpdateRoom(wj1.b);
    }
}
