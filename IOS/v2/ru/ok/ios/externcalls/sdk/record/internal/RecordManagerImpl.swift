package ru.ok.android.externcalls.sdk.record.internal;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00152\u000e\u0010)\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J=\u0010>\u001a\u00020\u00152\u0006\u00105\u001a\u0002082\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\b>\u0010?J=\u0010A\u001a\u00020\u00152\u0006\u00105\u001a\u00020@2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0EH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010\u001bJ\u0017\u0010M\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R0\u0010`\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d`_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010b\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F`_8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl;", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "Lxj1;", "Lkg1;", "Lvoc;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "deprecatedRecordListener", "<init>", "(Lvoc;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "Lzwd;", "oldRoomId", "newRoomId", "", "notifyListenersWhenActiveRoomChanged", "(Lzwd;Lzwd;)V", "Lig1;", "info", "applyRecordStarted", "(Lig1;)V", "Lgg1;", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "toRecordDescription", "(Lgg1;)Lru/ok/android/externcalls/sdk/record/RecordDescription;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiatorId", "sessionRoomId", "current", "setMyRecordHistory", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzwd;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "reportStarted", "()V", "whoStoppedRecordId", "reportStopped", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "", "description", "reportError", "(Ljava/lang/String;)V", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "Ltj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "getRecordAdmin", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onRecordStarted", "Ljg1;", "onRecordStopped", "(Ljg1;)V", "Lhg1;", "onRecordError", "(Lhg1;)V", "Lvoc;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "Lpvc;", "commandParamsCreator", "Lpvc;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sessionRoomToRecordInfo", "Ljava/util/HashMap;", "sessionRoomToRecordInfoHistory", "activeRoomId", "Lzwd;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRecordManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordManagerImpl.kt\nru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1#2:234\n1855#3,2:235\n1855#3,2:237\n1855#3,2:239\n*S KotlinDebug\n*F\n+ 1 RecordManagerImpl.kt\nru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl\n*L\n211#1:235,2\n217#1:237,2\n224#1:239,2\n*E\n"})
public final class RecordManagerImpl implements RecordManager, xj1, kg1 {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "RecordManagerImpl";
    private zwd activeRoomId = xwd.a;
    private final pvc commandParamsCreator = new Object();
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final voc logger;
    private final ParticipantStore participantStore;
    private final HashMap<zwd, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<zwd, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private final SignalingProvider signalingProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, pvc] */
    public RecordManagerImpl(voc voc, ParticipantStore participantStore2, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2, SignalingProvider signalingProvider2, RecordEventListener recordEventListener) {
        this.logger = voc;
        this.participantStore = participantStore2;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        this.signalingProvider = signalingProvider2;
        this.deprecatedRecordListener = recordEventListener;
    }

    private final void applyRecordStarted(ig1 ig1) {
        RecordDescription recordDescription = toRecordDescription(ig1.b);
        if (recordDescription != null) {
            ParticipantId initiator = recordDescription.getInitiator();
            zwd zwd = ig1.a;
            setMyRecordHistory(initiator, zwd, recordDescription);
            this.sessionRoomToRecordInfo.put(zwd, recordDescription);
            if (Intrinsics.areEqual((Object) zwd, (Object) this.activeRoomId)) {
                reportStarted();
            }
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(zwd zwd, zwd zwd2) {
        if (this.sessionRoomToRecordInfo.get(zwd) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(zwd);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(zwd2) != null) {
            reportStarted();
        }
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$4(RecordManagerImpl recordManagerImpl, ig1 ig1) {
        recordManagerImpl.applyRecordStarted(ig1);
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$5(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String str) {
        this.deprecatedRecordListener.onRecordError(str);
        for (RecordEventListener onRecordError : this.listeners) {
            onRecordError.onRecordError(str);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        for (RecordEventListener onRecordStarted : this.listeners) {
            onRecordStarted.onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId participantId) {
        ConversationParticipant byExternal = participantId != null ? this.participantStore.getByExternal(participantId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        for (RecordEventListener onRecordStopped : this.listeners) {
            onRecordStopped.onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId participantId, zwd zwd, RecordDescription recordDescription) {
        ConversationParticipant me2 = this.participantStore.getMe();
        RecordDescription recordDescription2 = null;
        if (Intrinsics.areEqual((Object) participantId, (Object) me2 != null ? me2.getExternalId() : null)) {
            HashMap<zwd, RecordDescriptionHistory> hashMap = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = hashMap.get(zwd);
            if (recordDescriptionHistory != null) {
                recordDescription2 = recordDescriptionHistory.getCurrentState();
            }
            hashMap.put(zwd, new RecordDescriptionHistory(recordDescription, recordDescription2));
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, Function1 function1, JSONObject jSONObject) {
        if (Intrinsics.areEqual((Object) "error", (Object) jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        if (function1 != null) {
            function1.invoke(new RuntimeException("Can't start record " + jSONObject));
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$3(RecordManagerImpl recordManagerImpl, Function1 function1, JSONObject jSONObject) {
        if (Intrinsics.areEqual((Object) "error", (Object) jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        if (function1 != null) {
            function1.invoke(new RuntimeException("Can't stop record " + jSONObject));
        }
    }

    private final RecordDescription toRecordDescription(gg1 gg1) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(gg1.c);
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(gg1.c)) == null) {
            return null;
        }
        return new RecordDescription(byInternal, gg1.b, gg1.d, gg1.a, gg1.e, gg1.f);
    }

    public void addRecordListener(RecordEventListener recordEventListener) {
        this.listeners.add(recordEventListener);
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    public Map<zwd, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        if (!Intrinsics.areEqual((Object) tj1.a, (Object) this.activeRoomId)) {
            zwd zwd = this.activeRoomId;
            zwd zwd2 = tj1.a;
            this.activeRoomId = zwd2;
            notifyListenersWhenActiveRoomChanged(zwd, zwd2);
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(uj1 uj1) {
    }

    public void onRecordError(hg1 hg1) {
        reportError(hg1.a);
    }

    public void onRecordStarted(ig1 ig1) {
        if (this.participantStore.getByInternal(ig1.b.c) != null) {
            applyRecordStarted(ig1);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(CollectionsKt.listOf(ig1.b.c), new ovb(9, this, ig1), new o99(25, this));
        }
    }

    public void onRecordStopped(jg1 jg1) {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(jg1.a);
        ParticipantId participantId = null;
        ParticipantId initiator = recordDescription != null ? recordDescription.getInitiator() : null;
        zwd zwd = jg1.a;
        setMyRecordHistory(initiator, zwd, (RecordDescription) null);
        this.sessionRoomToRecordInfo.remove(zwd);
        if (Intrinsics.areEqual((Object) zwd, (Object) this.activeRoomId)) {
            ue1 ue1 = jg1.b;
            ConversationParticipant byInternal = ue1 != null ? this.participantStore.getByInternal(ue1) : null;
            if (byInternal != null) {
                participantId = byInternal.getExternalId();
            }
            reportStopped(participantId);
        }
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(vj1 vj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(wj1 wj1) {
    }

    public void removeRecordListener(RecordEventListener recordEventListener) {
        this.listeners.remove(recordEventListener);
    }

    public void startRecord(RecordManager.StartParams startParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Function1<? super Throwable, Unit> function12 = function1;
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function12);
        if (o9e != null) {
            pvc pvc = this.commandParamsCreator;
            boolean isStream = startParams.isStream();
            Long movieId = startParams.getMovieId();
            zwd sessionRoomId = startParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            Long groupId = startParams.getGroupId();
            String name = startParams.getName();
            String description = startParams.getDescription();
            String privacy = startParams.getPrivacy();
            String albumId = startParams.getAlbumId();
            pvc.getClass();
            Calendar instance = Calendar.getInstance();
            if (name == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                name = String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13))}, 6));
            }
            try {
                rp6 a = tf6.a(new JSONObject().put("movieId", (Object) movieId).put("name", (Object) name).put("description", (Object) description).put("privacy", (Object) privacy).put("groupId", (Object) groupId).put("albumId", (Object) albumId).put("streamMovie", isStream), "record-start");
                if (sessionRoomId instanceof ywd) {
                    a.b(((ywd) sessionRoomId).a, "roomId");
                }
                o9e.d(a, false, new jt(9, function0), new zxc(this, function12, 1));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopRecord(RecordManager.StopParams stopParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            pvc pvc = this.commandParamsCreator;
            zwd sessionRoomId = stopParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            pvc.getClass();
            rp6 a = tf6.a((JSONObject) null, "record-stop");
            a.a.put("command", (Object) "record-stop");
            if (sessionRoomId instanceof ywd) {
                a.b(((ywd) sessionRoomId).a, "roomId");
            }
            o9e.d(a, false, new jt(8, function0), new zxc(this, function1, 0));
        }
    }
}
