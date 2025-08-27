package ru.ok.android.externcalls.sdk;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.UnwrappingParser;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.capabilities.SignalingCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.IdUtils;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;
import ru.ok.tamtam.nano.Protos;

class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final ui animojiDataSupplier;
    private String anonToken;
    private final nla api;
    private final OkApiService apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    /* access modifiers changed from: private */
    public final AsrOnlineManagerImpl asrOnlineManager;
    /* access modifiers changed from: private */
    public final int audioLevelFrequencyMs;
    /* access modifiers changed from: private */
    public final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    /* access modifiers changed from: private */
    public boolean audioSampleEnergyCalculatorRegistered;
    /* access modifiers changed from: private */
    public final hz0 call;
    private CallInfo callInfo;
    /* access modifiers changed from: private */
    public final te1 callParams;
    /* access modifiers changed from: private */
    public final Runnable callParticipantResolutionRunnable;
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    /* access modifiers changed from: private */
    public final ChatStateListener chatStateListener;
    private final kz3 cidProvider;
    private final ContactCallManagerImpl contactCallManager;
    /* access modifiers changed from: private */
    public final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    /* access modifiers changed from: private */
    public ConversationParams conversationParams;
    /* access modifiers changed from: private */
    public final ConversationStats conversationStats;
    private final ConversationFactory creator;
    private final DebugManager debugManager;
    private final DisplayLayoutSender displayLayoutSender;
    private final kc3 disposable;
    private final MultiEventListener eventListener;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final ExternalIdsResolver externalIdsResolver;
    /* access modifiers changed from: private */
    public final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final boolean hotStart;
    /* access modifiers changed from: private */
    public final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;
    private final String initialJoinLink;
    private ConversationParticipant initialOpponent;
    private final IdsMapper<ParticipantId, ue1> internalIdsMapper;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    /* access modifiers changed from: private */
    public final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    /* access modifiers changed from: private */
    public final ListenerImpl listener;
    /* access modifiers changed from: private */
    public final LocalIdMappings localIdMappings;
    private final Locale locale;
    /* access modifiers changed from: private */
    public final voc log;
    private final woc logConfiguration;
    /* access modifiers changed from: private */
    public final Handler mainThreadHandler;
    /* access modifiers changed from: private */

    /* renamed from: me  reason: collision with root package name */
    public final ConversationParticipant f133me;
    /* access modifiers changed from: private */
    public final MediaConnectionManagerImpl mediaConnectionManager;
    /* access modifiers changed from: private */
    public final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;
    private final MicrophoneManager microphoneManager;
    private final NetworkConnectionManager networkConnectionManager;
    private final NoiseSuppressionManager noiseSuppressionManager;
    /* access modifiers changed from: private */
    public final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private final PeerIdGenerator peerIdGenerator;
    private final gtb preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private meg signalingTransport;
    private final StartCallApiParams startCallApiParams;
    private final ExtLogger stat;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();
    private final StereoRoomManagerImpl stereoRoomManager;
    /* access modifiers changed from: private */
    public final ParticipantStore store;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;
    private final VideoRenderManager videoRenderManager;
    private final fl4 videoRendererProvider;
    /* access modifiers changed from: private */
    public final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    /* access modifiers changed from: private */
    public final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        /* JADX WARNING: Can't wrap try/catch for region: R(79:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(83:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(87:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(91:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0103 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x00ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x00f7 */
        static {
            /*
                b51[] r0 = defpackage.b51.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$ok$android$webrtc$CallEvents = r0
                r1 = 1
                r2 = 2
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 13
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0013 }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                r2 = 3
                r3 = 4
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0019 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r4 = 5
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x001e }
                r5[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0022 }
                r3[r2] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 6
                r3 = 18
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0029 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                r4 = 7
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x002e }
                r5[r1] = r4     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                r1 = 8
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x003a }
                r5 = 9
                r2[r5] = r5     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                r2 = 10
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0041 }
                r6 = 0
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                r5 = 11
                int[] r6 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0047 }
                r6[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x004d }
                r6 = 12
                r2[r6] = r6     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0051 }
                r2[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                r0 = 14
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0057 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                r1 = 15
                r2 = 19
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r2] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                r4 = 16
                r6 = 20
                int[] r7 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0067 }
                r7[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                r7 = 17
                r8 = 22
                int[] r9 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x006f }
                r9[r8] = r7     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                r9 = 23
                int[] r10 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0075 }
                r10[r9] = r3     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x007b }
                r10 = 24
                r3[r10] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0081 }
                r3 = 27
                r2[r3] = r6     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0089 }
                r3 = 21
                r6 = 25
                r2[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x008f }
                r3 = 26
                r2[r3] = r8     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0099 }
                r3 = 24
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x009f }
                r3 = 25
                r2[r7] = r3     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r3 = 26
                r4 = 28
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00af }
                r3 = 27
                r4 = 32
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r3 = 28
                r4 = 29
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00bf }
                r3 = 29
                r4 = 30
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r3 = 30
                r4 = 31
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00cf }
                r3 = 31
                r4 = 35
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r3 = 32
                r4 = 36
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00df }
                r3 = 33
                r4 = 37
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r3 = 34
                r4 = 38
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00ef }
                r3 = 35
                r4 = 39
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r3 = 36
                r4 = 40
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00fd }
                r3 = 37
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0103 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0103 }
            L_0x0103:
                int[] r0 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x010b }
                r1 = 39
                r2 = 21
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.AnonymousClass5.<clinit>():void");
        }
    }

    public class ListenerImpl implements ez0, dz0, t51, jd1, df1, WaitingRoomParticipants.Listener, d8e {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        /* access modifiers changed from: private */
        public ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleMuteParticipant(wz9 wz9) {
            boolean z = wz9.b;
            vz9 vz9 = wz9.a;
            if (!z || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteChanged(vz9);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(vz9);
        }

        private void handleRolesChanged(ye1 ye1) {
            e51 e51;
            ParticipantId convert;
            ue1 ue1 = ye1.a;
            ConversationParticipant byInternal = ue1 != null ? ConversationImpl.this.store.getByInternal(ue1) : null;
            if (byInternal == null && ConversationImpl.this.callParams.B.j && (e51 = ye1.p) != null && (convert = CallExternalIdConverter.convert(e51)) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(convert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(ye1, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f133me.getInternalId() != null && ConversationImpl.this.f133me.getInternalId().equals(ye1.a)) || (ConversationImpl.this.callParams.B.j && byInternal == ConversationImpl.this.f133me)) {
                    ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
                }
            }
        }

        public void onCallParticipantFingerprint(ye1 ye1, long j) {
            ye1 ye12;
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.n1.i().size() == 1) {
                ef1 ef1 = ConversationImpl.this.call.n1;
                int r = ef1.r();
                if (r == 0) {
                    ye12 = null;
                } else if (r == 1) {
                    ye12 = (ye1) ef1.i().iterator().next();
                } else {
                    throw new RuntimeException("group call");
                }
                if (ye12 == ye1 && (conversationEventsListener = this.listener) != null) {
                    conversationEventsListener.onOpponentFingerprintChanged(j);
                }
            }
        }

        public void onCallParticipantNetworkStatusChanged(List<ye1> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (ye1 next : list) {
                ue1 ue1 = next.a;
                if (!(ue1 == null || (byInternal = ConversationImpl.this.store.getByInternal(ue1)) == null)) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(next, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener != null && !arrayList.isEmpty()) {
                this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
            }
        }

        public void onCustomData(ue1 ue1, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        public void onEvent(hz0 hz0, b51 b51, Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + b51);
            if (this.listener != null) {
                boolean z = false;
                ConversationParticipant conversationParticipant = null;
                switch (b51.ordinal()) {
                    case 0:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            AudioSampleEnergyCalculator W = ConversationImpl.this.audioSampleEnergyCalculator;
                            long V = (long) ConversationImpl.this.audioLevelFrequencyMs;
                            t6e t6e = hz0.i1;
                            t6e.getClass();
                            t6e.a.execute(new ca2((Object) t6e, (Object) W, V, 6));
                            return;
                        }
                        return;
                    case 1:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onDisconnected();
                        this.listener.onDisconnected();
                        return;
                    case 2:
                    case 13:
                        this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(hz0.O0, obj));
                        ConversationEventsListener conversationEventsListener = this.listener;
                        ConversationEndReason conversationEndReason = (ConversationEndReason) hz0.i2.c;
                        if (conversationEndReason == null) {
                            conversationEndReason = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener.onCallEnded(new ConversationEndInfo(conversationEndReason));
                        return;
                    case 3:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(nw6.v, Collections.emptySet(), (String) null));
                        hz0.i2.B(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        ConversationEventsListener conversationEventsListener2 = this.listener;
                        ConversationEndReason conversationEndReason2 = (ConversationEndReason) hz0.i2.c;
                        if (conversationEndReason2 == null) {
                            conversationEndReason2 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener2.onCallEnded(new ConversationEndInfo(conversationEndReason2));
                        return;
                    case 4:
                        this.listener.onLocalMediaChanged();
                        return;
                    case 5:
                        this.listener.onOpponentMediaChanged();
                        return;
                    case 6:
                        this.listener.onCameraChanged();
                        return;
                    case 7:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        ConversationEventsListener conversationEventsListener3 = this.listener;
                        ConversationEndReason conversationEndReason3 = (ConversationEndReason) hz0.i2.c;
                        if (conversationEndReason3 == null) {
                            conversationEndReason3 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener3.onDestroyed(new ConversationDestroyedInfo(conversationEndReason3));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        return;
                    case 8:
                        ConversationImpl.this.resetSignaling();
                        return;
                    case 9:
                        if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                            this.listener.onCallAccepted();
                            this.callAcceptedForwarded = true;
                        }
                        this.callAcceptedFired = true;
                        this.listener.onCallAcceptedForAll();
                        return;
                    case 10:
                        this.listener.onOpponentRegistered();
                        return;
                    case 12:
                        this.listener.onCameraBusy();
                        return;
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        if (obj instanceof o51) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((o51) obj);
                            return;
                        }
                        return;
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        if (obj instanceof p51) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((p51) obj);
                            return;
                        }
                        return;
                    case 16:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            return;
                        }
                        return;
                    case LangUtils.HASH_SEED:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            return;
                        }
                        return;
                    case 18:
                        this.listener.onMicrophoneForciblyMuted();
                        return;
                    case 19:
                        hz0.E(true);
                        this.listener.onMicChanged(true);
                        return;
                    case 20:
                        hz0.E(false);
                        this.listener.onMicChanged(false);
                        return;
                    case 21:
                        if (obj instanceof SignalingErrors$CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors$CallIsUnfeasibleError) obj);
                            return;
                        }
                        return;
                    case 22:
                        this.listener.onCallSignalingConnected();
                        return;
                    case 23:
                        if (obj instanceof ye1) {
                            handleRolesChanged((ye1) obj);
                            return;
                        }
                        return;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        if (obj instanceof Set) {
                            for (ye1 handleRolesChanged : (Set) obj) {
                                handleRolesChanged(handleRolesChanged);
                            }
                            return;
                        }
                        return;
                    case 25:
                    case 26:
                        ue1 ue1 = obj instanceof ue1 ? (ue1) obj : null;
                        if (ue1 != null) {
                            conversationParticipant = ConversationImpl.this.store.getByInternal(ue1);
                        }
                        ConversationEventsListener conversationEventsListener4 = this.listener;
                        if (b51 == b51.H0) {
                            z = true;
                        }
                        conversationEventsListener4.onPinChanged(conversationParticipant, z);
                        return;
                    case 27:
                        if (obj instanceof wz9) {
                            handleMuteParticipant((wz9) obj);
                            return;
                        }
                        return;
                    case 28:
                        this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
                        return;
                    case 29:
                        this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
                        return;
                    case 30:
                        ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
                        return;
                    case 31:
                        ConversationImpl.this.asrOnlineManager.onAsrAvailableChanged(hz0.x0.contains(gz0.w));
                        return;
                    case 32:
                        ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
                        this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
                        return;
                    case 35:
                        if (obj instanceof vz9) {
                            vz9 vz9 = (vz9) obj;
                            this.listener.onMuteStateInitialized(vz9);
                            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(vz9);
                            return;
                        }
                        return;
                    case 36:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        return;
                    case LangUtils.HASH_OFFSET:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                            return;
                        }
                        return;
                    case 38:
                        if (obj instanceof cu9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((cu9) obj);
                            return;
                        }
                        return;
                    case 39:
                        if (obj instanceof eu9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((eu9) obj);
                            return;
                        }
                        return;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        if (obj instanceof fu9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((fu9) obj);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        public void onRateCall(JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams d0 = ConversationImpl.this.conversationParams;
            if (d0 != null && (rateCallData = d0.rateCallData) != null) {
                this.listener.onRateCall(rateCallData);
            }
        }

        public void onStateChanged(ue1 ue1, we1 we1) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(ue1);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(ue1, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, we1);
                ConversationImpl.this.participantStatesManager.onStateChanged(ue1, we1);
            }
        }

        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: sjf} */
    /* JADX WARNING: type inference failed for: r7v3, types: [lz3, kz3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r3v6, types: [rjf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationImpl(ru.ok.android.externcalls.sdk.ConversationBuilder r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r37.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.stateTransitionLock = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.mainThreadHandler = r2
            ru.ok.android.externcalls.sdk.id.local.LocalIdMappings r3 = new ru.ok.android.externcalls.sdk.id.local.LocalIdMappings
            r3.<init>()
            r0.localIdMappings = r3
            ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator r4 = new ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator
            r4.<init>()
            r0.peerIdGenerator = r4
            ru.ok.android.externcalls.sdk.n r4 = new ru.ok.android.externcalls.sdk.n
            r5 = 4
            r4.<init>(r5, r0)
            r0.callParticipantResolutionRunnable = r4
            r4 = 0
            r0.audioSampleEnergyCalculatorRegistered = r4
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            ru.ok.android.externcalls.sdk.Conversation$State r6 = ru.ok.android.externcalls.sdk.Conversation.State.None
            r5.<init>(r6)
            r0.state = r5
            ru.ok.android.externcalls.sdk.ConversationFactory r6 = r1.creator
            r0.creator = r6
            nla r6 = r1.api
            r0.api = r6
            java.util.concurrent.ExecutorService r7 = r1.executorService
            r0.executorService = r7
            java.lang.String r7 = r1.version
            r0.version = r7
            boolean r11 = r1.isCaller
            r0.isCaller = r11
            boolean r7 = r1.isAnswer
            r0.isAnswer = r7
            lz3 r7 = new lz3
            java.lang.String r8 = r1.cid
            if (r8 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            java.lang.String r8 = ""
        L_0x005c:
            r7.<init>()
            r7.a = r8
            r0.cidProvider = r7
            boolean r8 = r1.hotStart
            r0.hotStart = r8
            boolean r8 = r1.forceRelayPolicy
            r0.forceRelayPolicy = r8
            kc3 r8 = new kc3
            r8.<init>()
            r0.disposable = r8
            ru.ok.android.externcalls.sdk.log.ExtLogger r15 = r1.stat
            r0.stat = r15
            gtb r14 = new gtb
            android.content.Context r8 = r1.context
            r14.<init>(r8)
            r0.preferencesHelper = r14
            voc r13 = r1.log
            r0.log = r13
            woc r12 = r1.logConfiguration
            r0.logConfiguration = r12
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r10 = r1.idMappingWrapper
            r0.idMappingWrapper = r10
            java.lang.String r8 = r1.joinLink
            r0.initialJoinLink = r8
            ru.ok.android.externcalls.sdk.ConversationParticipant r8 = r1.f132me
            r0.f133me = r8
            r9 = 1
            r8.setReported(r9)
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r4 = new ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore
            r4.<init>(r8, r3)
            r0.store = r4
            int r9 = r1.audioLevelFrequencyMs
            r0.audioLevelFrequencyMs = r9
            te1 r9 = ru.ok.android.externcalls.sdk.CallUtil.createCallParams(r38)
            r0.callParams = r9
            r18 = r9
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r9 = r37.createStartCallApiParams(r38)
            r0.startCallApiParams = r9
            r28 = r2
            ui r2 = r1.animojiRenderProvider
            r0.animojiDataSupplier = r2
            r19 = r14
            ye1 r14 = new ye1
            r20 = r10
            ue1 r10 = r8.getInternalId()
            r23 = r12
            r12 = 0
            r14.<init>(r10, r12, r12, r12)
            r8.setCallParticipant(r14, r3)
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r1.initialOpponent
            if (r3 == 0) goto L_0x00dd
            ru.ok.android.externcalls.sdk.id.ParticipantId r3 = r3.getExternalId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r8 = r8.getExternalId()
            boolean r3 = java.util.Objects.equals(r3, r8)
            if (r3 != 0) goto L_0x00dd
            ru.ok.android.externcalls.sdk.ConversationParticipant r12 = r1.initialOpponent
        L_0x00dd:
            r0.initialOpponent = r12
            if (r12 == 0) goto L_0x00eb
            r4.addToActiveSessionRoom(r12)
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r0.initialOpponent
            r8 = 1
            r3.setReported(r8)
            goto L_0x00ec
        L_0x00eb:
            r8 = 1
        L_0x00ec:
            java.util.concurrent.CopyOnWriteArraySet r3 = new java.util.concurrent.CopyOnWriteArraySet
            r3.<init>()
            ru.ok.android.externcalls.sdk.events.ConversationEventsListener r10 = r1.eventListener
            if (r10 == 0) goto L_0x00f8
            r3.add(r10)
        L_0x00f8:
            ru.ok.android.externcalls.sdk.events.MultiEventListener r12 = new ru.ok.android.externcalls.sdk.events.MultiEventListener
            r12.<init>(r3)
            r0.eventListener = r12
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r3 = new ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl
            r3.<init>(r12)
            r0.listener = r3
            sjf r10 = new sjf
            r10.<init>()
            r29 = r6
            hz0 r6 = new hz0
            r17 = r10
            android.content.Context r10 = r1.context
            r24 = r12
            boolean r12 = r1.isJoined
            ru.ok.android.externcalls.sdk.ConversationParticipant r8 = r0.initialOpponent
            if (r8 == 0) goto L_0x011e
            r16 = 1
            goto L_0x0120
        L_0x011e:
            r16 = 0
        L_0x0120:
            boolean r26 = r9.isVideo()
            wga r8 = r1.cameraCapturerFactory
            if (r8 != 0) goto L_0x012d
            dd4 r8 = new dd4
            r8.<init>(r13)
        L_0x012d:
            r30 = r8
            boolean r8 = r0.forceRelayPolicy
            r21 = r8
            i8d r8 = r1.rotationProvider
            r22 = r8
            ru.ok.android.externcalls.analytics.CallAnalyticsSender r8 = r1.analyticsSender
            r25 = r8
            lgd r8 = r1.screenCapturePermissionProvider
            r27 = r8
            r8 = r6
            r31 = r18
            r9 = r10
            r32 = r17
            r1 = r20
            r10 = r31
            r33 = r1
            r20 = r23
            r1 = r24
            r34 = r13
            r13 = r14
            r35 = r19
            r14 = r7
            r36 = r15
            r15 = r16
            r16 = r26
            r17 = r36
            r18 = r34
            r19 = r20
            r20 = r30
            r23 = r2
            r24 = r32
            r26 = r35
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.call = r6
            ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl
            r2.<init>(r6)
            r0.screenCaptureManager = r2
            ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl
            ru.ok.android.externcalls.sdk.a r8 = new ru.ok.android.externcalls.sdk.a
            r9 = 4
            r8.<init>(r0, r9)
            ru.ok.android.externcalls.sdk.a r9 = new ru.ok.android.externcalls.sdk.a
            r10 = 5
            r9.<init>(r0, r10)
            r2.<init>(r6, r8, r9)
            r0.cameraManager = r2
            ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl
            nz3 r8 = new nz3
            r9 = 0
            r8.<init>(r5, r9)
            ru.ok.android.externcalls.sdk.renderer.ConversationRenderers r9 = new ru.ok.android.externcalls.sdk.renderer.ConversationRenderers
            r9.<init>()
            r2.<init>(r8, r6, r9, r4)
            r0.videoRendererProvider = r2
            r0.videoRenderManager = r2
            ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl r2 = new ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl
            ru.ok.android.externcalls.sdk.a r8 = new ru.ok.android.externcalls.sdk.a
            r9 = 6
            r8.<init>(r0, r9)
            r2.<init>(r6, r8)
            r0.microphoneManager = r2
            ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl r2 = new ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl
            r2.<init>(r6)
            r0.noiseSuppressionManager = r2
            ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl r2 = new ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl
            r2.<init>(r6)
            r0.networkConnectionManager = r2
            ru.ok.android.externcalls.sdk.signaling.SignalingProvider r8 = r37.createSignalingProvider()
            ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl r9 = new ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl
            r12 = r9
            r13 = r6
            r14 = r36
            r15 = r7
            r16 = r34
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r0.debugManager = r9
            ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger r7 = new ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger
            r7.<init>(r8)
            ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl r1 = r0.createParticipantStatesManager(r4, r7, r1)
            r0.participantStatesManager = r1
            ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver r7 = r37.createIdMappingResolver()
            r9 = r33
            ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants r3 = r0.createWaitingRoomParticipants(r9, r7, r3)
            r0.waitingRoomParticipants = r3
            r3 = r32
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl r10 = r0.createStereoRoomManager(r8, r7, r3)
            r0.stereoRoomManager = r10
            r10 = r9
            r9 = r38
            ru.ok.android.externcalls.sdk.id.mapping.IdsMapper<ru.ok.android.externcalls.sdk.id.ParticipantId, ue1> r11 = r9.internalIdsMapper
            if (r11 == 0) goto L_0x01f2
            goto L_0x01fd
        L_0x01f2:
            ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper r11 = new ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper
            voc r12 = r9.log
            r13 = r29
            r14 = r31
            r11.<init>(r13, r14, r12)
        L_0x01fd:
            r0.internalIdsMapper = r11
            ru.ok.android.externcalls.sdk.id.InternalIdsResolver r11 = r0.createInternalIdsResolver(r4, r10, r11)
            r0.internalIdsResolver = r11
            ru.ok.android.externcalls.sdk.id.mapping.IdsMapper<ue1, ru.ok.android.externcalls.sdk.id.ParticipantId> r11 = r9.externalIdsMapper
            ru.ok.android.externcalls.sdk.id.ExternalIdsResolver r11 = r0.createExternalIdsResolver(r4, r10, r11)
            r0.externalIdsResolver = r11
            ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands r11 = new ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands
            nz3 r12 = new nz3
            r13 = 0
            r12.<init>(r5, r13)
            r11.<init>(r8, r6, r10, r12)
            r0.addParticipantsCommands = r11
            ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl r5 = new ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl
            r5.<init>(r4)
            r0.watchTogetherListenerManager = r5
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r6 = new ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl
            r6.<init>(r4)
            ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer r5 = r0.createWatchTogetherPlayer(r5, r8)
            r0.watchTogetherPlayer = r5
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl r11 = new ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl
            r11.<init>(r0, r4, r7, r10)
            r0.feedbackListenerManager = r11
            ru.ok.android.externcalls.sdk.feedback.FeedbackManager r11 = r0.createFeedbackManager(r11, r8)
            r0.feedbackManager = r11
            ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl r11 = new ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl
            r11.<init>(r4)
            r0.asrListenerManager = r11
            ru.ok.android.externcalls.sdk.asr.AsrManager r11 = r0.createAsrManager(r11, r4, r8)
            r0.asrManager = r11
            ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl r11 = new ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl
            boolean r12 = r9.answerAsContact
            r11.<init>(r4, r12)
            r0.contactCallManager = r11
            ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl r11 = r0.createAsrOnlineManager(r4)
            r0.asrOnlineManager = r11
            ru.ok.android.externcalls.sdk.chat.ChatStateListener r11 = r9.chatStateListener
            r0.chatStateListener = r11
            ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl r11 = r37.createConversationFeatureListeners()
            r0.conversationFeatureListeners = r11
            ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl r11 = r0.createFeatureManager(r8)
            r0.conversationFeatureManager = r11
            ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl r6 = r0.createSessionRoomManager(r6, r1, r7, r8)
            r0.sessionRoomManager = r6
            ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater r6 = r0.createParticipantsUpdater(r1)
            r0.participantsUpdater = r6
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl r6 = r0.createRecordManager(r7, r10, r8)
            r0.recordManager = r6
            java.util.Locale r6 = r9.locale
            r0.locale = r6
            ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler r6 = new ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler
            r6.<init>(r4, r5)
            r0.sessionRoomWatchTogetherHandler = r6
            ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler r1 = r0.createParticipantStatesHandler(r1)
            r0.sessionRoomParticipantStatesHandler = r1
            ru.ok.android.externcalls.sdk.stat.ConversationStats r1 = r0.createConversationStats(r3)
            r0.conversationStats = r1
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl r1 = r37.createUrlSharingListenerManager()
            r0.urlSharingListenerManager = r1
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl r1 = r37.createUrlSharingManager()
            r0.urlSharingManager = r1
            ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl r1 = r0.createChatListenerManager(r4)
            r0.chatListenerManager = r1
            ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl r1 = r0.createChatManager(r4, r1)
            r0.chatManager = r1
            ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl r1 = r37.createMediaMuteListenerManager()
            r0.mediaMuteListenerManager = r1
            ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl r1 = r0.createMediaMuteManager(r8, r1)
            r0.mediaMuteManager = r1
            ru.ok.android.externcalls.sdk.api.OkApiService r1 = r9.okApiService
            r0.apiService = r1
            ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl r1 = new ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl
            rx2 r3 = new rx2
            r5 = 8
            r3.<init>(r5, r4)
            ru.ok.android.externcalls.sdk.q r4 = new ru.ok.android.externcalls.sdk.q
            r5 = 1
            r4.<init>(r0, r5)
            r1.<init>(r3, r4)
            r0.displayLayoutSender = r1
            ru.ok.android.externcalls.sdk.ConversationImpl$1 r1 = new ru.ok.android.externcalls.sdk.ConversationImpl$1
            r3 = r28
            r1.<init>(r3)
            r0.audioSampleEnergyCalculator = r1
            ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl r1 = new ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl
            voc r3 = r9.log
            ru.ok.android.externcalls.sdk.a r4 = new ru.ok.android.externcalls.sdk.a
            r5 = 7
            r4.<init>(r0, r5)
            ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings r5 = r9.mediaConnectionSettings
            r1.<init>(r3, r4, r5)
            r0.mediaConnectionManager = r1
            r2.plusAssign(r1)
            ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl r1 = new ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r2 = r9.rttRateHintConfig
            r3 = r34
            r1.<init>(r3, r2)
            r0.rateManager = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.<init>(ru.ok.android.externcalls.sdk.ConversationBuilder):void");
    }

    private void assertInited() {
        if (!this.inited) {
            throw new IllegalStateException("Conversation not initialized");
        } else if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            throw new IllegalStateException("Conversation not ready");
        } else if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private String configureSignalingCapabilities() {
        SignalingCapabilities signalingCapabilities = new SignalingCapabilities();
        signalingCapabilities.setScreenTrackProducerEnabled(true);
        signalingCapabilities.setScreenTrackConsumerEnabled(true);
        signalingCapabilities.setVideoTracksEnabled(this.callParams.g > 0);
        signalingCapabilities.setWaitingHallEnabled(this.callParams.n);
        signalingCapabilities.setFilterDefaultValues(this.callParams.o);
        signalingCapabilities.setMuteNotificationForAdmin(true);
        signalingCapabilities.setWatchTogetherEnabled(true);
        signalingCapabilities.setSessionRoomsEnabled(this.callParams.t);
        this.animojiDataSupplier.getClass();
        signalingCapabilities.setAnimojiEnabled(false);
        signalingCapabilities.setContactCallsEnabled(true);
        signalingCapabilities.setAudienceModeEnabled(this.callParams.y);
        return signalingCapabilities.getSignalingCapabilitiesValue();
    }

    private AsrManager createAsrManager(AsrListenerManager asrListenerManager2, ParticipantStore participantStore, SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager2);
    }

    private AsrOnlineManagerImpl createAsrOnlineManager(ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new a(this, 2), createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new a(this, 3));
    }

    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    private Prepare createConversationPrepare(ConversationParams conversationParams2) {
        return new Prepare(this.apiService, this.cidProvider, conversationParams2, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.callParams);
    }

    private ConversationStats createConversationStats(rjf rjf) {
        hz0 hz0 = this.call;
        Objects.requireNonNull(hz0);
        return new ConversationStats(new ny0(hz0, 5), this.stat, this.cidProvider, getCallType(), rjf);
    }

    private ExternalIdsResolver createExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, IdsMapper<ue1, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        rt3 rt3 = new rt3(7, (Object) multiEventListener);
        zb2 zb2 = new zb2(23);
        LocalIdMappings localIdMappings2 = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.api, this.callParams, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper2, rt3, zb2, localIdMappings2, idsMapper);
    }

    private ConversationFeatureManagerImpl createFeatureManager(SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    private FeedbackManager createFeedbackManager(FeedbackListenerManager feedbackListenerManager2, SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager2);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() {
            public void resolveExternalsByInternalsIds(List<ue1> list, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            public void withInternalId(ParticipantId participantId, rk3 rk3, Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, rk3, runnable);
            }
        };
    }

    private InternalIdsResolver createInternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, IdsMapper<ParticipantId, ue1> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper2, new zb2(22), this.localIdMappings, idsMapper);
    }

    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    private MediaMuteManagerImpl createMediaMuteManager(SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager2) {
        a aVar = new a(this, 1);
        q qVar = new q(this, 0);
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, aVar, qVar, new nm1(22, participantStore)), mediaMuteListenerManager2);
    }

    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new a(this, 0));
    }

    private ParticipantStatesManagerImpl createParticipantStatesManager(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener, this.mainThreadHandler);
    }

    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper2 = this.idMappingWrapper;
        LocalIdMappings localIdMappings2 = this.localIdMappings;
        AnonymousClass2 r6 = new ParticipantsUpdater.MappingUpdater() {
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f133me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper2, localIdMappings2, r6, new rt3(6, (Object) conversationParticipant), this.callParams);
    }

    private RecordManagerImpl createRecordManager(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper2, SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper2, signalingProvider, this.eventListener);
    }

    private SessionRoomsManagerImpl createSessionRoomManager(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingResolver idMappingResolver, SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        hz0 hz0 = this.call;
        Objects.requireNonNull(hz0);
        return new ry0(hz0);
    }

    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId);
    }

    private StereoRoomManagerImpl createStereoRoomManager(SignalingProvider signalingProvider, IdMappingResolver idMappingResolver, rjf rjf) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new p(this), new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), rjf);
    }

    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    private WaitingRoomParticipants createWaitingRoomParticipants(IdMappingWrapper idMappingWrapper2, IdMappingResolver idMappingResolver, final ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() {
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper2, idMappingResolver, this.log);
    }

    private WatchTogetherPlayer createWatchTogetherPlayer(WatchTogetherListenerManager watchTogetherListenerManager2, SignalingProvider signalingProvider) {
        hz0 hz0 = this.call;
        Objects.requireNonNull(hz0);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new ny0(hz0, 6)), watchTogetherListenerManager2);
    }

    private void doStartCall() {
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null) {
                    hz0 hz0 = this.call;
                    conversationParticipant.setCallParticipant(hz0.n1.j(conversationParticipant.getInternalId()), this.localIdMappings);
                }
                hz0 hz02 = this.call;
                fl4 fl4 = this.videoRendererProvider;
                if (hz02.i()) {
                    hz02.t1 = fl4;
                    if (fl4 == null) {
                        hz02.r1.s();
                    }
                }
                if (!this.isCaller) {
                    this.call.B(this.startCallApiParams.isVideo());
                }
                this.inited = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <T> void executeOnBg(Function0<T> function0, rk3 rk3, Runnable runnable) {
        this.disposable.a(CallsThreadUtilsKt.executeOnIoThread(function0, rk3, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> lbe executeWithState(Conversation.State state2, Conversation.State state3, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state2, state3)) {
            if (atomicReference.get() != state2) {
                return lbe.g(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state2));
            }
        }
        return action.execute(p);
    }

    /* access modifiers changed from: private */
    public ConversationEventsListener.CallEndInfo getCallEndInfo(nw6 nw6, Object obj) {
        String str;
        HashSet hashSet;
        if (obj instanceof lw6) {
            lw6 lw6 = (lw6) obj;
            hashSet = new HashSet();
            if (lw6.a.contains(kw6.a)) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = lw6.b;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(nw6, hashSet, str);
    }

    private ye1 getCallParticipantByExternalId(ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public ue1 getCallParticipantId(ParticipantId participantId) {
        ConversationParticipant byExternal;
        ye1 callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.a;
    }

    @Deprecated
    private ConversationParticipant getParticipantByExternalId(String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$25(rk3 rk3, JSONObject jSONObject) throws JSONException {
        if (rk3 != null) {
            rk3.accept(jSONObject.optString("error", ""));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$26(Boolean bool, boolean z, rk3 rk3, Collection collection) {
        this.call.j((ue1) collection.iterator().next(), bool, Boolean.valueOf(z), new k(rk3, 0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$27(rk3 rk3, JSONObject jSONObject) throws JSONException {
        if (rk3 != null) {
            rk3.accept(jSONObject.optString("error", ""));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$28(boolean z, rk3 rk3, InternalIdResponse internalIdResponse) throws Throwable {
        this.call.j(new ue1(1, 0, internalIdResponse.okId), Boolean.valueOf(z), Boolean.FALSE, new k(rk3, 2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$29(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipants$30(Boolean bool, boolean z, Function1 function1, Function1 function12, Collection collection) {
        this.addParticipantsCommands.addParticipants(collection, bool, z, function1, function12);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hz0 lambda$createAsrOnlineManager$5() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hz0 lambda$createAsrOnlineManager$6() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hz0 lambda$createMediaMuteManager$4() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0() {
        return Boolean.valueOf(this.inited);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$1() {
        return Boolean.valueOf(this.prepared);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$2() {
        return Boolean.valueOf(this.prepared);
    }

    /* access modifiers changed from: private */
    public Unit lambda$new$3(List list) {
        hz0 hz0 = this.call;
        hz0.getClass();
        hz0.T0.log("OKRTCCall", "updateDisplayLayout " + list);
        if (hz0.i()) {
            hz0.r1.S(list);
            hz0.C1.getClass();
            eud eud = hz0.Z1;
            ((sjf) ((rjf) eud.c)).getClass();
            xfd.a().c(new ca2((Object) eud, (Object) list, SystemClock.elapsedRealtime(), 4));
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConfroomJoin$11(ConversationParams conversationParams2, rk3 rk3, rk3 rk32, JoinByIdResponse joinByIdResponse) throws Throwable {
        this.forceRelayPolicy |= joinByIdResponse.getP2pForbidden();
        performConnect(joinByIdResponse.getEndpoint(), conversationParams2, rk3, rk32);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$19(String str) {
        this.recordManager.onRecordError(new hg1(str));
    }

    /* access modifiers changed from: private */
    public void lambda$performConnect$20() {
        if (this.listener.listener != null) {
            hangup(new mw6(nw6.a));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$21() {
        this.mainThreadHandler.post(new n(0, this));
    }

    /* access modifiers changed from: private */
    public void lambda$performConnect$22(rk3 rk3, hz0 hz0) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = hz0.P0;
        this.state.getAndSet(Conversation.State.Connected);
        ExtLogger extLogger = this.stat;
        cna simpleBuilderAny = ExtLogger.simpleBuilderAny("callForceRelay");
        simpleBuilderAny.c("vcid", ((lz3) this.cidProvider).a);
        simpleBuilderAny.c("param", this.forceRelayPolicy ? "1" : "0");
        extLogger.log(simpleBuilderAny.a());
        if (rk3 != null) {
            rk3.accept(this);
        }
        ur9.e();
        hz0.Z0 = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(boolean z, rk3 rk3, boolean z2, rk3 rk32, Prepare.PrepareResult prepareResult) throws Throwable {
        ArrayList arrayList = new ArrayList(prepareResult.getUnresolvedParticipantIds());
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!z) {
            boolean z3 = !arrayList.isEmpty();
            Iterator<ConversationParticipant> it = this.store.iterator();
            int i = 0;
            while (it.hasNext()) {
                ConversationParticipant next = it.next();
                boolean equals = Objects.equals(next.getExternalId(), this.f133me.getExternalId());
                boolean z4 = next.getInternalId() != null;
                z3 &= !z4 || equals;
                i += (!z4 || equals) ? 0 : 1;
            }
            if (z3) {
                rk3.accept(new CallFailedException("no call targets left"));
                return;
            } else if (i == 1) {
                Iterator<ConversationParticipant> it2 = this.store.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ConversationParticipant next2 = it2.next();
                    if (next2.getInternalId() != null && !Objects.equals(next2.getExternalId(), this.f133me.getExternalId())) {
                        this.initialOpponent = next2;
                        break;
                    }
                }
            }
        }
        ConversationParams conversationParams2 = prepareResult.getConversationParams();
        if (conversationParams2 == null && !this.isCaller) {
            rk3.accept(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant"));
        } else if (this.isCaller) {
            runStartConversation(conversationParams2, z, z2, rk32, rk3);
        } else if (this.expectedChat) {
            performConfroomJoin(conversationParams2, rk32, rk3);
        } else {
            performConnect(conversationParams2.endpoint, conversationParams2, rk32, rk3);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareJoinByLink$9(rk3 rk3, rk3 rk32, Prepare.PrepareResult prepareResult) throws Throwable {
        ConversationParams conversationParams2 = prepareResult.getConversationParams();
        if (conversationParams2 == null) {
            rk3.accept(new NullPointerException("Conversation parameters object MUST not be null"));
            return;
        }
        this.forceRelayPolicy |= conversationParams2.isP2PForbidden;
        performConnect(conversationParams2.endpoint, conversationParams2, rk32, rk3);
        this.call.D0 = this.initialJoinLink;
    }

    /* access modifiers changed from: private */
    public void lambda$promoteParticipant$32(boolean z, ue1 ue1) {
        hz0 hz0 = this.call;
        hz0.x.d(tf6.t(ue1, z), false, new wy0(hz0, ue1, 1), hz0.o);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$queryChatHistory$38(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ue1 E = tf6.E(optJSONObject);
                    ConversationParticipant byInternal = this.store.getByInternal(E);
                    if (byInternal == null) {
                        byInternal = ConversationParticipant.fromInternal(E, this.idMappingWrapper);
                    }
                    chatHistoryEntryArr[i] = new ChatHistoryEntry(optJSONObject.optString("message", ""), optJSONObject.optBoolean("direct", false), byInternal);
                }
            }
            chatHistoryCallback.onResponse(chatHistoryEntryArr);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshParams$13(Runnable runnable, ConversationParams conversationParams2) throws Throwable {
        this.conversationParams = conversationParams2;
        this.prepared = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeJoinLink$37(Runnable runnable, rk3 rk3, Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            runnable.run();
        } else {
            rk3.accept(new AssertionError("unreachable"));
        }
    }

    /* access modifiers changed from: private */
    public void lambda$removeParticipant$31(boolean z, ue1 ue1) {
        hz0 hz0 = this.call;
        hz0.getClass();
        hz0.T0.log("OKRTCCall", "removeParticipant, participant=" + ue1);
        if (hz0.i()) {
            ye1 j = hz0.n1.j(ue1);
            m7f m7f = hz0.Q1.g;
            Long t = ((nob) m7f.o).t();
            if (t != null) {
                long longValue = t.longValue();
                HashMap hashMap = new HashMap();
                p7d p7d = (p7d) m7f.a;
                hashMap.put("vcid", ((yoc) p7d.b).conversationId);
                hashMap.put("stat_time_delta", String.valueOf(longValue));
                hashMap.put("network_type", ur9.b((ConnectivityManager) m7f.b, (TelephonyManager) m7f.c));
                m7f.b(ue1, j, hashMap);
                ((yoc) p7d.b).log(yoc.COLLECTOR_WEBRTC, "callRemoveParticipant", (Map) hashMap);
            }
            try {
                if (ue1.equals(hz0.G1)) {
                    hz0.G1 = null;
                    hz0.k(b51.G0, (Object) null);
                }
                o9e o9e = hz0.x;
                JSONObject jSONObject = new JSONObject();
                tf6.b(ue1, jSONObject, false);
                jSONObject.put("ban", z);
                o9e.h(tf6.a(jSONObject, "remove-participant"), new wy0(hz0, ue1, 0));
            } catch (JSONException e) {
                throw new RuntimeException("Remove participant command failed", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$39(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.hostname;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean lambda$runStartConversation$15(org.webrtc.PeerConnection.IceServer r1) {
        /*
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.hostname
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "turn"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.lambda$runStartConversation$15(org.webrtc.PeerConnection$IceServer):boolean");
    }

    /* access modifiers changed from: private */
    public void lambda$runStartConversation$17(rk3 rk3, ConversationParams conversationParams2, rk3 rk32, CallInfo callInfo2) throws Throwable {
        String str;
        this.callInfo = callInfo2;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo2.isConcurrent && ((str = callInfo2.id) == null || str.equals(((lz3) this.cidProvider).a))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo2.isP2PForbidden;
        String str2 = callInfo2.id;
        if (str2 != null) {
            kz3 kz3 = this.cidProvider;
            if (kz3 instanceof lz3) {
                ((lz3) kz3).a = str2;
            }
        }
        String str3 = callInfo2.endpoint;
        if (str3 == null) {
            rk3.accept(new IllegalStateException("couldn't create call endpoint is null"));
            return;
        }
        if (conversationParams2 == null) {
            conversationParams2 = callInfo2.toParams();
        }
        performConnect(str3, conversationParams2, rk32, rk3);
        this.call.D0 = callInfo2.joinLink;
    }

    /* access modifiers changed from: private */
    public void lambda$runStartConversation$18(rk3 rk3, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder("ok.api.error.");
        sb.append(th.getClass().getSimpleName());
        if (th instanceof ApiInvocationException) {
            ApiInvocationException apiInvocationException = (ApiInvocationException) th;
            if (apiInvocationException.a == 1104) {
                ExternErrorParser.ErrorDescription parse = new ExternErrorParser(this.log).parse(apiInvocationException);
                if (parse.getErrorCode() != 0) {
                    sb.append('.');
                    sb.append(parse.getErrorCode());
                }
                rk3.accept(new ExternApiException("external service failed", apiInvocationException, parse.getErrorCode(), parse.getExtendedError()));
            } else {
                rk3.accept(th);
            }
        } else {
            rk3.accept(th);
        }
        this.stat.logSimple(jme.callError, ((lz3) this.cidProvider).a, sb.toString());
    }

    /* access modifiers changed from: private */
    public void lambda$setCallOptionEnabled$23(boolean z, gz0 gz0, rk3 rk3, JSONObject jSONObject) throws JSONException {
        if (z) {
            hz0 hz0 = this.call;
            hz0.x0.add(gz0);
            hz0.a(gz0);
        } else {
            hz0 hz02 = this.call;
            hz02.x0.remove(gz0);
            hz02.a(gz0);
        }
        if (rk3 != null) {
            rk3.accept((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCallOptionEnabled$24(rk3 rk3, JSONObject jSONObject) throws JSONException {
        if (rk3 != null) {
            rk3.accept(jSONObject.optString("error"));
        }
    }

    /* access modifiers changed from: private */
    public static void lambda$setMuteState$40(o9e o9e, boolean z, ue1 ue1) {
        try {
            o9e.i(tf6.a(new JSONObject().put("eId", (Object) ue1.c()).put("muteTarget", z), "switch-micro"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalId$33(ParticipantId participantId) {
        return this.internalIdsMapper.map(Collections.singleton(participantId));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalId$34(ParticipantId participantId, rk3 rk3, Map map) {
        ue1 ue1 = (ue1) map.get(participantId);
        if (ue1 != null) {
            rk3.accept(ue1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalIds$35(ArrayList arrayList) {
        return this.internalIdsMapper.map(arrayList);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalIds$36(rk3 rk3, ArrayList arrayList, Map map) {
        if (rk3 != null) {
            arrayList.addAll(map.values());
            rk3.accept(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public void onSignalingRefresh() {
        meg meg;
        ConversationParams conversationParams2;
        if (!this.call.y0 && (meg = this.signalingTransport) != null && (conversationParams2 = this.conversationParams) != null) {
            String str = conversationParams2.token;
            meg.n.onRestart();
            meg.g.execute(new keg(meg, str, 1));
        }
    }

    private void performConfroomJoin(ConversationParams conversationParams2, rk3 rk3, rk3 rk32) {
        kc3 kc3 = this.disposable;
        lbe retryApiCallForJoining = RetryKt.retryApiCallForJoining(this.apiService.joinToConversation(((lz3) this.cidProvider).a, this.peerIdGenerator.generatePeerId(), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, conversationParams2, rk3, rk32);
        i iVar = new i(rk32, 3);
        retryApiCallForJoining.getClass();
        ao1 ao1 = new ao1(3, tVar, iVar);
        retryApiCallForJoining.l(ao1);
        kc3.a(ao1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void performConnect(java.lang.String r30, ru.ok.android.externcalls.sdk.api.ConversationParams r31, defpackage.rk3 r32, defpackage.rk3 r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = r33
            java.lang.Object r3 = r0.stateTransitionLock
            monitor-enter(r3)
            boolean r4 = r29.isDestroyed()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0014
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r0 = move-exception
            goto L_0x0207
        L_0x0014:
            if (r1 != 0) goto L_0x002b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "No conversation parameters in performConnect()"
            r1.<init>(r4)     // Catch:{ all -> 0x0011 }
            voc r0 = r0.log     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "Conversation"
            java.lang.String r5 = "An attempt to connect without conversation parameters"
            r0.reportException(r4, r5, r1)     // Catch:{ all -> 0x0011 }
            r2.accept(r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x002b:
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r4 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            boolean r4 = r4.isMultipleDevicesEnabled()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0043
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.f133me     // Catch:{ all -> 0x0011 }
            int r5 = r1.deviceIndex     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.id.local.LocalIdMappings r6 = r0.localIdMappings     // Catch:{ all -> 0x0011 }
            r4.setDeviceIndex(r5, r6)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r4 = r0.store     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r5 = r0.f133me     // Catch:{ all -> 0x0011 }
            r4.updateMe(r5)     // Catch:{ all -> 0x0011 }
        L_0x0043:
            r0.conversationParams = r1     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r4 = r0.state     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r5 = ru.ok.android.externcalls.sdk.Conversation.State.Preparing     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r6 = ru.ok.android.externcalls.sdk.Conversation.State.Starting     // Catch:{ all -> 0x0011 }
        L_0x004b:
            boolean r7 = r4.compareAndSet(r5, r6)     // Catch:{ all -> 0x0011 }
            if (r7 == 0) goto L_0x01c9
            ru.ok.android.externcalls.sdk.stat.ConversationStats r2 = r0.conversationStats     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat r2 = r2.startedStat     // Catch:{ all -> 0x0011 }
            r2.onConversationStarted()     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f133me     // Catch:{ all -> 0x0011 }
            ye1 r2 = r2.getCallParticipant()     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.f133me     // Catch:{ all -> 0x0011 }
            ue1 r4 = r4.getInternalId()     // Catch:{ all -> 0x0011 }
            r2.a = r4     // Catch:{ all -> 0x0011 }
            boolean r4 = r0.isCaller     // Catch:{ all -> 0x0011 }
            if (r4 != 0) goto L_0x006e
            boolean r4 = r0.expectedChat     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0073
        L_0x006e:
            kotlin.Pair r4 = defpackage.ye1.r     // Catch:{ all -> 0x0011 }
            r2.e(r4)     // Catch:{ all -> 0x0011 }
        L_0x0073:
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.initialOpponent     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0088
            ue1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0088
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.initialOpponent     // Catch:{ all -> 0x0011 }
            ue1 r4 = r4.getInternalId()     // Catch:{ all -> 0x0011 }
            r2.H(r4)     // Catch:{ all -> 0x0011 }
        L_0x0088:
            boolean r2 = r0.isConcurrentByApi     // Catch:{ all -> 0x0011 }
            r4 = 1
            if (r2 == 0) goto L_0x0091
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r2.P0 = r4     // Catch:{ all -> 0x0011 }
        L_0x0091:
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r5 = r0.listener     // Catch:{ all -> 0x0011 }
            java.util.ArrayList r2 = r2.K0     // Catch:{ all -> 0x0011 }
            r2.add(r5)     // Catch:{ all -> 0x0011 }
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r5 = r0.listener     // Catch:{ all -> 0x0011 }
            r2.u1 = r5     // Catch:{ all -> 0x0011 }
            r29.subscribeCallListeners()     // Catch:{ all -> 0x0011 }
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r0.setupSessionRoomWatchTogetherHandler(r2)     // Catch:{ all -> 0x0011 }
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r0.setupSessionRoomHandHandler(r2)     // Catch:{ all -> 0x0011 }
            hz0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.r r5 = new ru.ok.android.externcalls.sdk.r     // Catch:{ all -> 0x0011 }
            r5.<init>(r0)     // Catch:{ all -> 0x0011 }
            r2.b1 = r5     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f133me     // Catch:{ all -> 0x0011 }
            ue1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x00cc
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f133me     // Catch:{ all -> 0x0011 }
            ue1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            long r5 = r2.a     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0011 }
        L_0x00ca:
            r8 = r2
            goto L_0x00ce
        L_0x00cc:
            r2 = 0
            goto L_0x00ca
        L_0x00ce:
            kz3 r2 = r0.cidProvider     // Catch:{ all -> 0x0011 }
            lz3 r2 = (defpackage.lz3) r2     // Catch:{ all -> 0x0011 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0011 }
            java.lang.String r7 = r1.token     // Catch:{ all -> 0x0011 }
            int r9 = r1.deviceIndex     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = r0.version     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r2 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            java.lang.String r12 = r2.getClientType()     // Catch:{ all -> 0x0011 }
            java.lang.String r14 = r29.configureSignalingCapabilities()     // Catch:{ all -> 0x0011 }
            java.lang.Integer r15 = r1.ispAsNo     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = r1.ispAsOrg     // Catch:{ all -> 0x0011 }
            java.lang.String r13 = r1.locCc     // Catch:{ all -> 0x0011 }
            java.lang.String r10 = r1.locReg     // Catch:{ all -> 0x0011 }
            java.util.Locale r5 = r0.locale     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r4 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            boolean r4 = r4.isMultipleDevicesEnabled()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0105
            voc r4 = r0.log     // Catch:{ all -> 0x0011 }
            r16 = r5
            java.lang.String r5 = "Conversation"
            r17 = r10
            java.lang.String r10 = "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6"
            r4.log(r5, r10)     // Catch:{ all -> 0x0011 }
            r4 = 6
            goto L_0x010a
        L_0x0105:
            r16 = r5
            r17 = r10
            r4 = 5
        L_0x010a:
            java.lang.String r5 = "conversation id must not be null"
            java.util.Objects.requireNonNull(r6, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "token must not be null"
            java.util.Objects.requireNonNull(r7, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "endpointBaseUrl must not be null"
            r10 = r30
            java.util.Objects.requireNonNull(r10, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "appVersion must not be null"
            java.util.Objects.requireNonNull(r11, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "clientType must not be null"
            java.util.Objects.requireNonNull(r12, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "capabilities must not be null"
            java.util.Objects.requireNonNull(r14, r5)     // Catch:{ all -> 0x0011 }
            a75 r28 = new a75     // Catch:{ all -> 0x0011 }
            r19 = r16
            r5 = r28
            r18 = r17
            r10 = r30
            r17 = r13
            r13 = r4
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0011 }
            rla r26 = new rla     // Catch:{ all -> 0x0011 }
            r26.<init>()     // Catch:{ all -> 0x0011 }
            te1 r2 = r0.callParams     // Catch:{ all -> 0x0011 }
            se1 r2 = r2.b     // Catch:{ all -> 0x0011 }
            r2.getClass()     // Catch:{ all -> 0x0011 }
            r2 = 30000(0x7530, float:4.2039E-41)
            long r4 = (long) r2     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.n r2 = new ru.ok.android.externcalls.sdk.n     // Catch:{ all -> 0x0011 }
            r6 = 2
            r2.<init>(r6, r0)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.ConversationStats r6 = r0.conversationStats     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r6 = r6.wsSignalingStat     // Catch:{ all -> 0x0011 }
            java.util.concurrent.ExecutorService r7 = r0.executorService     // Catch:{ all -> 0x0011 }
            voc r8 = r0.log     // Catch:{ all -> 0x0011 }
            woc r9 = r0.logConfiguration     // Catch:{ all -> 0x0011 }
            te1 r10 = r0.callParams     // Catch:{ all -> 0x0011 }
            se1 r10 = r10.b     // Catch:{ all -> 0x0011 }
            r10.getClass()     // Catch:{ all -> 0x0011 }
            te1 r10 = r0.callParams     // Catch:{ all -> 0x0011 }
            boolean r10 = r10.l     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "Signaling statistics is required"
            java.util.Objects.requireNonNull(r6, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "executor is required"
            java.util.Objects.requireNonNull(r7, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "log is required"
            java.util.Objects.requireNonNull(r8, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "log configuration is required"
            java.util.Objects.requireNonNull(r9, r11)     // Catch:{ all -> 0x0011 }
            meg r11 = new meg     // Catch:{ all -> 0x0011 }
            r18 = r11
            r19 = r4
            r21 = r2
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r27 = r10
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0011 }
            r0.signalingTransport = r11     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.b r2 = new ru.ok.android.externcalls.sdk.b     // Catch:{ all -> 0x0011 }
            r4 = 1
            r7 = r32
            r2.<init>(r0, r7, r4)     // Catch:{ all -> 0x0011 }
            hz0 r4 = r0.call     // Catch:{ all -> 0x0011 }
            java.util.List<org.webrtc.PeerConnection$IceServer> r1 = r1.stunTurnServers     // Catch:{ all -> 0x0011 }
            boolean r5 = r0.hotStart     // Catch:{ all -> 0x0011 }
            r4.r(r11, r1, r5)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants r1 = r0.waitingRoomParticipants     // Catch:{ all -> 0x0011 }
            hz0 r4 = r0.call     // Catch:{ all -> 0x0011 }
            r1.setCall(r4)     // Catch:{ all -> 0x0011 }
            r1 = 1
            r0.wantsApiHangup = r1     // Catch:{ all -> 0x0011 }
            r0.prepared = r1     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r1 = r0.state     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r4 = ru.ok.android.externcalls.sdk.Conversation.State.Connecting     // Catch:{ all -> 0x0011 }
            r1.set(r4)     // Catch:{ all -> 0x0011 }
            hz0 r0 = r0.call     // Catch:{ all -> 0x0011 }
            r0.getClass()     // Catch:{ all -> 0x0011 }
            defpackage.ur9.e()     // Catch:{ all -> 0x0011 }
            boolean r1 = r0.Z     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x01c5
            r2.a(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x01c7
        L_0x01c5:
            r0.Z0 = r2     // Catch:{ all -> 0x0011 }
        L_0x01c7:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x01c9:
            r10 = r30
            r7 = r32
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x0011 }
            if (r8 == r5) goto L_0x004b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0011 }
            r4.<init>()     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "Wrong state within performConnect(): "
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r5 = r0.state     // Catch:{ all -> 0x0011 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0011 }
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = " expected state is "
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r5 = ru.ok.android.externcalls.sdk.Conversation.State.Preparing     // Catch:{ all -> 0x0011 }
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0011 }
            r1.<init>(r4)     // Catch:{ all -> 0x0011 }
            voc r0 = r0.log     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "Conversation"
            java.lang.String r5 = "An attempt to connect while conversation not in preparing state"
            r0.reportException(r4, r5, r1)     // Catch:{ all -> 0x0011 }
            r2.accept(r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x0207:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.performConnect(java.lang.String, ru.ok.android.externcalls.sdk.api.ConversationParams, rk3, rk3):void");
    }

    private mq4 refreshParams(Runnable runnable, rk3 rk3) {
        lbe retryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(this.apiService.getConversationParams(this.anonToken, (String) null), this.callParams.B.h, this.log);
        o oVar = new o(this, runnable, 0);
        i iVar = new i(rk3, 2);
        retryApiCallForBackgroundWork.getClass();
        ao1 ao1 = new ao1(3, oVar, iVar);
        retryApiCallForBackgroundWork.l(ao1);
        return ao1;
    }

    /* access modifiers changed from: private */
    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (!(next.isReported() || next.getExternalId() == null || this.listener.listener == null)) {
                next.setReported(true);
                arrayList.add(next);
                this.store.addToActiveSessionRoom(next);
            }
        }
        if (this.listener.listener != null && !arrayList.isEmpty()) {
            this.listener.listener.onParticipantsAdded(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public void resetSignaling() {
        this.disposable.a(refreshParams(new n(3, this), new nk3(1)));
    }

    /* access modifiers changed from: private */
    public void resolveExternalsByInternalsIds(List<ue1> list, Runnable runnable, Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        xa3 i = this.externalIdsResolver.resolveIds(list).i(qe.a());
        Objects.requireNonNull(runnable);
        ao1 ao1 = new ao1(0, new o(this, runnable2, 1), new b5(9, runnable));
        i.j(ao1);
        this.disposable.a(ao1);
    }

    /* access modifiers changed from: private */
    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new n(1, this), (Runnable) null);
    }

    private void runStartConversation(ConversationParams conversationParams2, boolean z, boolean z2, rk3 rk3, rk3 rk32) {
        String join = conversationParams2 == null ? "" : TextUtils.join(",", new bm7(new bm7(conversationParams2.stunTurnServers, new Object(), 1), new Object(), 0));
        lbe retryApiCallForOutgoing = RetryKt.retryApiCallForOutgoing(this.callParams.B.j ? this.apiService.startConversationWithExternalIds(join, ((lz3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentExternalIds(this.store, this.f133me.getExternalId()), this.startCallApiParams) : this.apiService.startConversation(join, ((lz3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentInternalIds(this.store, this.f133me.getInternalId()), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, rk32, conversationParams2, rk3);
        b bVar = new b(this, rk32, 0);
        retryApiCallForOutgoing.getClass();
        ao1 ao1 = new ao1(3, tVar, bVar);
        retryApiCallForOutgoing.l(ao1);
        this.disposable.a(ao1);
    }

    private void setupSessionRoomHandHandler(hz0 hz0) {
        hz0.U1.a(this.sessionRoomParticipantStatesHandler);
        hz0.U1.a.a.add(this.sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(hz0 hz0) {
        hz0.U1.a(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        jc1 jc1 = this.call.U1;
        jc1.b.a.add(this.listener);
        jc1 jc12 = this.call.U1;
        jc12.e.a.add(this.listener);
        jc1 jc13 = this.call.U1;
        ((CopyOnWriteArraySet) jc13.c.b).add(this.participantsUpdater);
        jc1 jc14 = this.call.U1;
        jc14.a.a.add(this.participantsUpdater);
        this.call.U1.a(this.participantsUpdater);
        this.call.U1.a(this.sessionRoomManager);
        this.call.U1.a(this.recordManager);
        this.call.U1.a(this.asrListenerManager);
        jc1 jc15 = this.call.U1;
        jc15.i.a.add(this.recordManager);
        jc1 jc16 = this.call.U1;
        jc16.j.a.add(this.feedbackListenerManager);
        jc1 jc17 = this.call.U1;
        jc17.m.a.add(this.asrListenerManager);
        jc1 jc18 = this.call.U1;
        jc18.n.a.add(this.listener);
        jc1 jc19 = this.call.U1;
        jc19.o.a.add(this.asrOnlineManager);
        jc1 jc110 = this.call.U1;
        jc110.k.a.add(this.contactCallManager);
        jc1 jc111 = this.call.U1;
        jc111.p.a.add(this.listener);
        jc1 jc112 = this.call.U1;
        jc112.d.a.add(this.waitingRoomParticipants);
        jc1 jc113 = this.call.U1;
        jc113.d.a.add(this.stereoRoomManager);
        jc1 jc114 = this.call.U1;
        jc114.q.a.add(this.urlSharingListenerManager);
        this.call.U1.a(this.urlSharingListenerManager);
        jc1 jc115 = this.call.U1;
        jc115.r.a.add(this.chatListenerManager);
        jc1 jc116 = this.call.U1;
        ((CopyOnWriteArraySet) jc116.s.b).add(this.mediaMuteListenerManager);
        jc1 jc117 = this.call.U1;
        jc117.t.a.add(this.mediaConnectionManager);
        jc1 jc118 = this.call.U1;
        jc118.u.a.add(this.rateManager);
    }

    /* access modifiers changed from: private */
    public void updateTalkingParticipants() {
        hz0 hz0 = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant next : this.store.getParticipants()) {
            ye1 callParticipant = next.getCallParticipant();
            boolean z = getAdjustedAudioLevel(next) > c44.DEFAULT_ASPECT_RATIO;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.a);
            }
        }
        hz0.n1.q(arrayList);
    }

    private void withInternalId(ParticipantId participantId, rk3 rk3) {
        withInternalId(participantId, rk3, (Runnable) null);
    }

    private void withInternalIds(Collection<ParticipantId> collection, rk3 rk3) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId next : collection) {
            ue1 byExternal = this.idMappingWrapper.getByExternal(next);
            if (byExternal == null) {
                arrayList.add(next);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            executeOnBg(new e(this, arrayList, 0), new f(rk3, arrayList2), (Runnable) null);
        } else if (rk3 != null) {
            try {
                rk3.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    public void addEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    public void addParticipant(ParticipantId participantId, Boolean bool, boolean z, rk3 rk3) {
        withInternalIds(Collections.singletonList(participantId), new c(this, bool, z, rk3));
    }

    public void addParticipantByLink(String str, Runnable runnable, rk3 rk3) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, rk3);
    }

    public void addParticipants(Collection<ParticipantId> collection, Boolean bool, boolean z, Function1<AddParticipantsResult, Unit> function1, Function1<Throwable, Unit> function12) {
        withInternalIds(collection, new s(this, bool, z, function1, function12));
    }

    public void changeMyState(Map<String, String> map) {
        changeMyState(map, (n9e) null);
    }

    public void connect() {
        assertInited();
        hz0 hz0 = this.call;
        if (hz0.i() && !hz0.g2) {
            hz0.g2 = true;
            if (!hz0.l1.c) {
                mz9 mz9 = hz0.w1;
                if (mz9.e) {
                    mz9.e = false;
                    mz9.a();
                }
            }
            if (!hz0.l1.d) {
                mz9 mz92 = hz0.w1;
                if (mz92.f) {
                    mz92.f = false;
                    mz92.a();
                }
            }
            if (fbb.A().g && hz0.w1.e) {
                if (!hz0.l1.c && hz0.l1.a() && hz0.l1.c) {
                    t6e t6e = hz0.i1;
                    t6e.getClass();
                    t6e.a.execute(new r6e(t6e, 0));
                } else if (fbb.A().g) {
                    t6e t6e2 = hz0.i1;
                    t6e2.getClass();
                    t6e2.a.execute(new r6e(t6e2, 0));
                }
                t6e t6e3 = hz0.i1;
                t6e3.getClass();
                t6e3.a.execute(new q6e(t6e3, false, 0));
            }
            hz0.T0.log("OKRTCCall", "createPeerConnectionIfReady");
            ur9.e();
            if (hz0.N0) {
                hz0.T0.log("OKRTCCall", "   peerConnectionCreated");
            } else if (hz0.J0 != null) {
                hz0.T0.log("OKRTCCall", "createPeerConnectionIfReady impl");
                hz0.N0 = true;
                hz0.a1 = true;
                hz0.c(hz0.r1);
                if (hz0.l1.d) {
                    hz0.k(b51.x, (Object) null);
                }
            } else {
                throw new IllegalStateException("No ice servers");
            }
            hz0.T0.log("OKRTCCall", "apply local media settings once connection requested");
            d dVar = hz0.j1;
            dVar.v.a.add(dVar);
            dVar.j(dVar.v);
            hz0.x();
        }
    }

    public void createJoinLink(rk3 rk3, rk3 rk32) {
        kc3 kc3 = this.disposable;
        lbe retryApiCallForFastWorkRequired = RetryKt.retryApiCallForFastWorkRequired(this.apiService.createJoinLink(((lz3) this.cidProvider).a), this.callParams.B.h, this.log);
        Objects.requireNonNull(rk3);
        mz3 mz3 = new mz3(rk3, 0);
        Objects.requireNonNull(rk32);
        mz3 mz32 = new mz3(rk32, 1);
        retryApiCallForFastWorkRequired.getClass();
        ao1 ao1 = new ao1(3, mz3, mz32);
        retryApiCallForFastWorkRequired.l(ao1);
        kc3.a(ao1);
    }

    public float getAdjustedAudioLevel(ConversationParticipant conversationParticipant) {
        l60 audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        float f = audioLevel.b;
        if (conversationParticipant == this.f133me) {
            f *= 5.0f;
        }
        if (f < AUDIO_LEVEL_MIN) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        if (f > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return f / 9000.0f;
    }

    public ki getAnimojiControl() {
        return this.call.l2;
    }

    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.l60 getAudioLevel(ru.ok.android.externcalls.sdk.ConversationParticipant r3) {
        /*
            r2 = this;
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r2.f133me
            if (r0 != r3) goto L_0x000b
            ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator r2 = r2.audioSampleEnergyCalculator
            l60 r2 = r2.getProcessor()
            return r2
        L_0x000b:
            hz0 r2 = r2.call
            ye1 r3 = r3.getCallParticipant()
            boolean r0 = r2.y0
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r2 = r1
            goto L_0x002b
        L_0x0018:
            pt6 r2 = r2.h1
            if (r3 == 0) goto L_0x0027
            java.lang.Object r2 = r2.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.lang.Object r2 = r2.get(r3)
            k09 r2 = (defpackage.k09) r2
            goto L_0x002b
        L_0x0027:
            r2.getClass()
            goto L_0x0016
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            l60 r1 = r2.a
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.getAudioLevel(ru.ok.android.externcalls.sdk.ConversationParticipant):l60");
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    public Conversation.CallType getCallType() {
        return this.isAnswer ? Conversation.CallType.Incoming : this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    public lv1 getCameraStatProvider() {
        mt1 mt1;
        v48 v48 = this.call.j1.x0;
        if (v48 == null || (mt1 = v48.r) == null) {
            return null;
        }
        CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) mt1.c.b;
        if (cameraVideoCapturer instanceof cab) {
            return ((cab) cameraVideoCapturer).b;
        }
        return null;
    }

    public ChatManager getChatManager() {
        return this.chatManager;
    }

    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    public String getConversationId() {
        return ((lz3) this.cidProvider).a;
    }

    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    public String getDestroyReason() {
        return this.call.Y;
    }

    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    public String getJoinLink() {
        String str = this.call.D0;
        if (str != null) {
            return str;
        }
        CallInfo callInfo2 = this.callInfo;
        return callInfo2 != null ? callInfo2.joinLink : this.initialJoinLink;
    }

    public ConversationParticipant getMe() {
        return this.f133me;
    }

    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    public ConversationParticipant getOpponent() {
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next != this.f133me) {
                return next;
            }
        }
        return null;
    }

    public k09 getParticipantMediaStat(ConversationParticipant conversationParticipant) {
        hz0 hz0 = this.call;
        ye1 callParticipant = conversationParticipant.getCallParticipant();
        if (hz0.y0) {
            return null;
        }
        pt6 pt6 = hz0.h1;
        if (callParticipant != null) {
            return (k09) ((Hashtable) pt6.d).get(callParticipant);
        }
        pt6.getClass();
        return null;
    }

    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    public ParticipantCollection getParticipants() {
        return this.store;
    }

    public ConversationParticipant getPinnedParticipant() {
        ue1 ue1;
        hz0 hz0 = this.call;
        zwd zwd = hz0.n1.k;
        if (zwd instanceof ywd) {
            twd v = hz0.V1.v((ywd) zwd);
            ue1 = v == null ? null : v.f;
        } else {
            ue1 = hz0.G1;
        }
        if (ue1 != null) {
            return this.store.getByInternal(ue1);
        }
        return null;
    }

    public RateManager getRateManager() {
        return this.rateManager;
    }

    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    public nw6 getRejectReason() {
        return this.call.O0;
    }

    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    public Conversation.State getState() {
        return this.state.get();
    }

    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    public hz0 getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    public void grantRoles(ParticipantId participantId, boolean z, xe1... xe1Arr) {
        ue1 ue1;
        ye1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId != null && (ue1 = callParticipantByExternalId.a) != null) {
            grantRoles(ue1, z, xe1Arr, (Runnable) null, (Runnable) null);
        }
    }

    public void hangup(mw6 mw6) {
        hz0 hz0 = this.call;
        hz0.getClass();
        nw6 nw6 = mw6.a;
        if (nw6 == null) {
            boolean z = hz0.z0;
            nw6 nw62 = nw6.o;
            if (z) {
                if (!hz0.s() && hz0.A1) {
                    nw6 = nw6.v;
                }
            } else if (!hz0.s()) {
                nw6 = nw6.c;
            }
            nw6 = nw62;
        }
        hz0.d(nw6);
        this.wasHungUp = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasRegisteredParticipnats() {
        /*
            r2 = this;
            hz0 r2 = r2.call
            ef1 r2 = r2.n1
            java.util.Collection r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            ye1 r0 = (defpackage.ye1) r0
            kotlin.Pair r1 = r0.j
            if (r1 != 0) goto L_0x0024
            java.util.HashMap r0 = r0.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000c
        L_0x0024:
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.hasRegisteredParticipnats():boolean");
    }

    public void init() {
        boolean z;
        this.log.log(LOG_TAG, "init called");
        doStartCall();
        if (this.startCallApiParams.isVideo()) {
            hz0 hz0 = this.call;
            mc1 mc1 = hz0.J1;
            ft8 ft8 = mc1.i.b;
            ft8 ft82 = ft8.a;
            if (ft8 == ft82 && mc1.h(hz0.n1.k).b == ft82) {
                z = true;
                this.call.B(z);
                this.call.G(z);
            }
        }
        z = false;
        this.call.B(z);
        this.call.G(z);
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        if (z && this.isCaller) {
            ExtLogger extLogger = this.stat;
            cna simpleBuilder = ExtLogger.simpleBuilder(jme.callStartMultiparty);
            simpleBuilder.c("vcid", ((lz3) this.cidProvider).a);
            extLogger.log(simpleBuilder.a());
        }
        for (ParticipantId fromExternal : collection) {
            ConversationParticipant fromExternal2 = ConversationParticipant.fromExternal(fromExternal, this.idMappingWrapper);
            this.store.addToActiveSessionRoom(fromExternal2);
            if (!z) {
                this.initialOpponent = fromExternal2;
                fromExternal2.setReported(true);
            }
        }
    }

    public boolean isAnonJoinForbidden() {
        hz0 hz0 = this.call;
        return hz0.x0.contains(gz0.a);
    }

    public boolean isAnswered() {
        return this.call.s();
    }

    public boolean isAudioMixEnabled() {
        return this.call.r1.H(xnf.o);
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.R0.b;
    }

    public boolean isConnected() {
        return this.call.I0;
    }

    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    public boolean isFeatureAddParticipantEnabled() {
        return this.call.v1;
    }

    public boolean isFeedbackEnabled() {
        hz0 hz0 = this.call;
        return hz0.x0.contains(gz0.o);
    }

    public boolean isGroupCall() {
        return this.call.n1.r() > 1;
    }

    public boolean isInited() {
        return this.inited;
    }

    public boolean isInitialVideoEnabled() {
        return this.call.C0;
    }

    public boolean isMeCreatorOrAdmin() {
        return hz0.t(this.call.n1.a);
    }

    public boolean isMeInWaitingRoom() {
        return this.call.I1;
    }

    public boolean isMuteParticipantsPermitted() {
        return this.call.a;
    }

    @Deprecated
    public boolean isParticipantAdmin(String str) {
        ye1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        for (xe1 xe1 : callParticipant.e) {
            if (xe1 == xe1.b) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isParticipantCreator(String str) {
        ye1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        for (xe1 xe1 : callParticipant.e) {
            if (xe1 == xe1.a) {
                return true;
            }
        }
        return false;
    }

    public boolean isParticipantCreatorOrAdmin(String str) {
        ye1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        return hz0.t(callParticipant);
    }

    public boolean isPermissionsGranted() {
        l48 l48 = this.call.l1;
        return l48.d || l48.c || (l48.a() && (l48.d || l48.c));
    }

    public boolean isPrepared() {
        return this.prepared;
    }

    public boolean isRecurring() {
        hz0 hz0 = this.call;
        return hz0.x0.contains(gz0.c);
    }

    public boolean isVideoPermissionGranted() {
        hz0 hz0 = this.call;
        return hz0.l1.d || (hz0.l1.a() && hz0.l1.d);
    }

    public boolean isWaitingRoomEnabled() {
        hz0 hz0 = this.call;
        return hz0.x0.contains(gz0.b);
    }

    public void muteAll() {
        o9e o9e = this.call.x;
        if (o9e != null) {
            try {
                o9e.i(tf6.a(new JSONObject().put("all", true).put("muteTarget", true), "switch-micro"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void pinParticipant(ParticipantId participantId, boolean z) {
        ue1 ue1;
        ye1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId != null && (ue1 = callParticipantByExternalId.a) != null) {
            hz0 hz0 = this.call;
            zwd zwd = hz0.n1.k;
            hz0.r1.K(ue1, zwd, z, new ty0(hz0, z, ue1, zwd));
        }
    }

    public void prepare(ConversationParams conversationParams2, rk3 rk3, rk3 rk32) {
        prepare(conversationParams2, false, false, rk3, rk32);
    }

    public void prepareJoinByLink(rk3 rk3, rk3 rk32, String str) {
        this.anonToken = str;
        kc3 kc3 = this.disposable;
        lbe executeWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare((ConversationParams) null), new Prepare.PrepareParams.PrepareJoin(this.initialJoinLink, str));
        h hVar = new h(this, rk32, rk3);
        i iVar = new i(rk32, 0);
        executeWithState.getClass();
        ao1 ao1 = new ao1(3, hVar, iVar);
        executeWithState.l(ao1);
        kc3.a(ao1);
    }

    public void promoteParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 1));
    }

    public void queryChatHistory(Integer num, Integer num2, Conversation.ChatHistoryCallback chatHistoryCallback) {
        o9e o9e = this.call.x;
        if (o9e != null) {
            try {
                rp6 a = tf6.a((JSONObject) null, "chat-history");
                JSONObject jSONObject = a.a;
                jSONObject.put("offset", num.intValue());
                jSONObject.put(NewHtcHomeBadger.COUNT, num2.intValue());
                o9e.h(a, new g(this, chatHistoryCallback));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void release() {
        SupportedCodecsStatistics.tryToReport(this.api, this.preferencesHelper, this.log, this.callParams);
        this.rateManager.logHints();
        this.disposable.d();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    nw6 nw6 = this.call.O0;
                    if (nw6 == null) {
                        nw6 = nw6.v;
                    }
                    this.creator.hangup(nw6, ((lz3) this.cidProvider).a, this.anonToken);
                }
                this.call.u1 = null;
                hz0 hz0 = this.call;
                hz0.b1 = null;
                hz0.K0.remove(this.listener);
                hz0 hz02 = this.call;
                AudioSampleEnergyCalculator audioSampleEnergyCalculator2 = this.audioSampleEnergyCalculator;
                t6e t6e = hz02.i1;
                t6e.getClass();
                t6e.a.execute(new s6e(0, t6e, audioSampleEnergyCalculator2));
                this.call.p((nw6) null, "release");
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    public void removeJoinLink(Runnable runnable, rk3 rk3) {
        kc3 kc3 = this.disposable;
        zad c = this.api.c();
        rl0 y = hsg.y("vchat.removeJoinLink");
        y.b = mm.c;
        y.b(ApiProtocol.PARAM_CONVERSATION_ID, ((lz3) this.cidProvider).a);
        fce j = RetryKt.retryApiCallForFastWorkRequired(c.a(y.a(new UnwrappingParser("success", new n77(7)))), this.callParams.B.h, this.log).j(qe.a());
        b bVar = new b(runnable, rk3, 2);
        Objects.requireNonNull(rk3);
        ao1 ao1 = new ao1(3, bVar, new mz3(rk3, 1));
        j.l(ao1);
        kc3.a(ao1);
    }

    public void removeParticipant(ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    public void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject) {
        ue1 ue1;
        if (!this.call.y0 && conversationParticipant != null && (ue1 = conversationParticipant.getCallParticipant().a) != null) {
            this.call.x.i(tf6.l(ue1, jSONObject));
        }
    }

    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, (rk3) null);
    }

    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    public void setCallOptionEnabled(gz0 gz0, boolean z, rk3 rk3) {
        o9e o9e = this.call.x;
        if (!isMeCreatorOrAdmin()) {
            if (rk3 != null) {
                rk3.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (o9e != null) {
            Set singleton = Collections.singleton(gz0);
            o9e.d(z ? tf6.j(singleton, (Set) null) : tf6.j((Set) null, singleton), false, new m(this, z, gz0, rk3), new k(rk3, 1));
        }
    }

    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, (rk3) null);
    }

    public void setMuteState(ParticipantId participantId, boolean z) {
        o9e o9e = this.call.x;
        if (o9e != null) {
            withInternalId(participantId, new d(o9e, z, 2));
        }
    }

    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, (rk3) null);
    }

    /* access modifiers changed from: private */
    public void withInternalId(ParticipantId participantId, rk3 rk3, Runnable runnable) {
        ue1 byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            executeOnBg(new e(this, participantId, 1), new f(participantId, rk3), runnable);
            return;
        }
        try {
            rk3.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    @Deprecated
    public void addParticipant(String str, boolean z, rk3 rk3) {
        sl0 resolveInternalRequest = IdUtils.resolveInternalRequest(str, false);
        kc3 kc3 = this.disposable;
        fce j = RetryKt.retryApiCallForFastWorkRequired(this.api.c().a(resolveInternalRequest), this.callParams.B.h, this.log).j(qe.a());
        ao1 ao1 = new ao1(3, new j(this, z, rk3), new p(this));
        j.l(ao1);
        kc3.a(ao1);
    }

    public void changeMyState(Map<String, String> map, n9e n9e) {
        this.participantStatesManager.updateOwnState(map, n9e);
    }

    public void prepare(ConversationParams conversationParams2, boolean z, boolean z2, rk3 rk3, rk3 rk32) {
        lbe executeWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(conversationParams2), Prepare.PrepareParams.C0002Prepare.INSTANCE);
        l lVar = new l(this, z, rk32, z2, rk3);
        i iVar = new i(rk32, 1);
        executeWithState.getClass();
        ao1 ao1 = new ao1(3, lVar, iVar);
        executeWithState.l(ao1);
        this.disposable.a(ao1);
    }

    public void removeParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 0));
    }

    public void setAnonJoinForbidden(boolean z, rk3 rk3) {
        setCallOptionEnabled(gz0.a, z, rk3);
    }

    public void setFeedbackEnabled(boolean z, rk3 rk3) {
        setCallOptionEnabled(gz0.o, z, rk3);
    }

    public void setWaitingRoomEnabled(boolean z, rk3 rk3) {
        setCallOptionEnabled(gz0.b, z, rk3);
    }

    /* access modifiers changed from: private */
    public void grantRoles(ue1 ue1, boolean z, xe1[] xe1Arr, Runnable runnable, Runnable runnable2) {
        hz0 hz0 = this.call;
        List asList = Arrays.asList(xe1Arr);
        hz0.r1.E(ue1, asList, z, new sy0(hz0, ue1, z, asList, runnable, runnable2));
    }
}
