package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002fgBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010!J3\u0010#\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010!J3\u0010$\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010!J?\u0010(\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b*\u0010)J?\u0010+\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b+\u0010)J?\u0010,\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00182\u0006\u0010/\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010/\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010)J?\u0010@\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b@\u0010)J?\u0010A\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bA\u0010)J#\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`D2\n\u0010B\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\n\u0010G\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020\u00182\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Cj\u0002`D0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002¢\u0006\u0004\bM\u0010NJA\u0010O\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bO\u0010)JX\u0010R\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d2%\u0010L\u001a!\u0012\u0017\u0012\u00150Cj\u0002`D¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u001a\u0010^\u001a\u00020]8\u0016X\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR$\u0010c\u001a\u00020;2\u0006\u0010b\u001a\u00020;8\u0016@RX\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010e¨\u0006h"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lwn1;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lvoc;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idResolver", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "grantRolesRequest", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lrjf;", "timeProvider", "<init>", "(Lvoc;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lrjf;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "listener", "", "removeListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "revokePromotion", "rejectPromotionRequest", "unpromoteParticipant", "addListener", "Lsn1;", "event", "onAttendee", "(Lsn1;)V", "Lun1;", "onHandUp", "(Lun1;)V", "Ltn1;", "onFeedback", "(Ltn1;)V", "Lvn1;", "onPromotionUpdated", "(Lvn1;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "grantAdmin", "revokeAdmin", "revokeRoles", "externalId", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lue1;", "internalId", "getExternalId", "(Lue1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "", "ids", "block", "resolveIdsAndThen", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "unpromoteParticipantImpl", "Lkotlin/ParameterName;", "name", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "idNotResolved", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lkotlin/jvm/functions/Function1;)V", "Lvoc;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "<set-?>", "isMePromoted", "Z", "()Z", "Companion", "GrantRolesRequest", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStereoRoomManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n37#2,2:282\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 StereoRoomManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl\n*L\n212#1:282,2\n227#1:284,2\n*E\n"})
public final class StereoRoomManagerImpl implements StereoRoomManager, wn1, StereoRoomListenerManager {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    /* access modifiers changed from: private */
    public final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    /* access modifiers changed from: private */
    public final StereoRoomListenerManagerImpl listenersManager;
    private final voc logger;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "revoke", "", "Lxe1;", "roles", "Ljava/lang/Runnable;", "onSuccess", "onError", "", "grantRoles", "(Lue1;Z[Lxe1;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface GrantRolesRequest {
        void grantRoles(ue1 ue1, boolean z, xe1[] xe1Arr, Runnable runnable, Runnable runnable2);
    }

    public StereoRoomManagerImpl(voc voc, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest2, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper2, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, rjf rjf) {
        this.logger = voc;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest2;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper2;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, rjf);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getExternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.sdk.id.ParticipantId getExternalId(defpackage.ue1 r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByInternal(r2)
            if (r0 == 0) goto L_0x000e
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r0.getExternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r1.getByInternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getExternalId(ue1):ru.ok.android.externcalls.sdk.id.ParticipantId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getInternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ue1 getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByExternal(r2)
            if (r0 == 0) goto L_0x000e
            ue1 r0 = r0.getInternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            ue1 r0 = r1.getByExternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId):ue1");
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$0(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$1(Function1 function1) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    private final void idNotResolved(ParticipantId participantId, Function1<? super Throwable, Unit> function1) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    /* access modifiers changed from: private */
    public final void resolveIdsAndThen(List<ue1> list, Function0<Unit> function0) {
        ArrayList arrayList = new ArrayList();
        for (ue1 ue1 : list) {
            if (getExternalId(ue1) == null) {
                arrayList.add(ue1);
            }
        }
        if (arrayList.isEmpty()) {
            function0.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new si0(10, function0), new jh3(16, this, arrayList, list, function0));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$10(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, Function0 function0) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$9(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$3(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$4(Function1 function1) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        ye1 callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            function0.invoke();
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xe1 xe1 = xe1.b;
        List list = callParticipant.e;
        if (list.contains(xe1)) {
            linkedHashSet.add(xe1);
        }
        xe1 xe12 = xe1.c;
        if (list.contains(xe12)) {
            linkedHashSet.add(xe12);
        }
        if (linkedHashSet.isEmpty()) {
            function0.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest2 = this.grantRolesRequest;
        ue1 ue1 = callParticipant.a;
        if (ue1 != null) {
            grantRolesRequest2.grantRoles(ue1, true, (xe1[]) linkedHashSet.toArray(new xe1[0]), new si0(9, function0), new axd(1, function1));
        }
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$6(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$7(Function1 function1) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    /* access modifiers changed from: private */
    public final void unpromoteParticipantImpl(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        withInternalId(participantId, function1, new StereoRoomManagerImpl$unpromoteParticipantImpl$1(this, function0, function1));
    }

    private final void withInternalId(ParticipantId participantId, Function1<? super Throwable, Unit> function1, Function1<? super ue1, Unit> function12) {
        this.idResolver.withInternalId(participantId, new ok3(4, function12), new o6d((Object) this, (Object) participantId, (Object) function1, 6));
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$11(Function1 function1, ue1 ue1) {
        function1.invoke(ue1);
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$12(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, Function1 function1) {
        stereoRoomManagerImpl.idNotResolved(participantId, function1);
    }

    public void acceptPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), function0, function1);
    }

    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.addListener(stereoRoomManagerListener);
        stereoRoomManagerListener.onOwnPromotionChanged(isMePromoted());
    }

    public void cancelPromotionRequest(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), function0, function1);
    }

    public void grantAdmin(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ue1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new xe1[]{xe1.b}, new si0(11, function0), new axd(2, function1));
        }
    }

    public boolean isMePromoted() {
        return this.isMePromoted;
    }

    public void onAttendee(sn1 sn1) {
        resolveIdsAndThen(CollectionsKt.plus(sn1.b, sn1.c), new StereoRoomManagerImpl$onAttendee$1(this, sn1));
    }

    public void onFeedback(tn1 tn1) {
    }

    public void onHandUp(un1 un1) {
        getHandsQueue().onHandUp(un1);
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        this.isMePromoted = !z;
        this.listenersManager.onOwnPromotionChanged(isMePromoted());
    }

    public void onPromotionUpdated(vn1 vn1) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(vn1.a));
    }

    public void promoteParticipant(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        withInternalId(participantId, function1, new StereoRoomManagerImpl$promoteParticipant$1(this, function0, function1));
    }

    public void rejectPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), function0, function1);
    }

    public void rejectPromotionRequest(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        unpromoteParticipantImpl(participantId, function0, function1);
    }

    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.removeListener(stereoRoomManagerListener);
    }

    public void requestPromotion(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), function0, function1);
    }

    public void revokeAdmin(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ue1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new xe1[]{xe1.b}, new si0(12, function0), new axd(3, function1));
        }
    }

    public void revokePromotion(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        unpromoteParticipantImpl(participantId, function0, function1);
    }

    public void unpromoteParticipant(ParticipantId participantId, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        revokeRoles(participantId, new StereoRoomManagerImpl$unpromoteParticipant$1(this, participantId, function0, function1), function1);
    }

    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }
}
