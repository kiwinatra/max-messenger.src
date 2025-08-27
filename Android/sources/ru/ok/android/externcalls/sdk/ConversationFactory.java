package ru.ok.android.externcalls.sdk;

import android.content.Context;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.log.stat.ProductStatisticsManagerImpl;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

public class ConversationFactory {
    private static final String DEFAULT_APP_VERSION = "sdk-sdk-125.1.0.48";
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "sdk-125.1.0.48";
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private List<String> additionalWhitelistedCodecPrefixes;
    private ui animojiDataSupplier;
    private final nla api;
    private String appVersion;
    private String[] audioCodecs;
    private int audioLevelFrequencyMs;
    private ig0 badNetworkIndicatorConfig;
    private qe1 bitrates;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private boolean dataChannelScreenshareRecvEnabled;
    private boolean dataChannelScreenshareSendEnabled;
    private final ExtLogger defaultStat;
    private final kc3 disposable;
    private boolean dnsResolverEnabled;
    private String domainId;
    private boolean enableLossRttBadConnectionHandling;
    private final re1 experiments;
    private IdsMapper<ue1, ParticipantId> externalIdsMapper;
    private boolean fastRecoverEnabled;
    private boolean forceRelayPolicy;
    private gj8 groupCallMediaAdaptationConfig;
    private boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, ue1> internalIdsMapper;
    private boolean isAsrOnlineEnabled;
    private boolean isAudienceModeEnabled;
    private boolean isConsumerUpdateEnabled;
    private boolean isDeviceAudioShareEnabled;
    private boolean isFastScreenCaptureEnabled;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall;
    private boolean isSessionRoomsFeatureEnabled;
    private boolean isSignalingDefaultValuesFilteringEnabled;
    private boolean isWaitingRoomActivated;
    private boolean isWebRTCCodecFilteringEnabled;
    private Locale locale;
    private voc log;
    private woc logConfiguration;
    private MediaConnectionSettings mediaConnectionSettings;
    private long mediaReceivingTimeoutMs;
    private boolean multipleDevicesEnabled;
    private OkApiService okApiService;
    private boolean onDemandTracksEnabled;
    private gj8 p2pCallMediaAdaptationConfig;
    private final StatisticsManager<ProductStatItem> prodStat;
    private i8d rotationProvider;
    private RttRateHintConfig rttRateHintConfig;
    private lgd screenCapturePermissionProvider;
    private boolean serverTopologySuspendBelowMinBitrate;
    private boolean sessionIdEnabled;
    private boolean showLocalVideoInOriginalQuality;
    private final yof tracerLiteFacade;
    private String[] videoCodecs;
    private int videoTracksCount;

    public ConversationFactory(nla nla, Context context2, String str) {
        this(nla, context2, str, (String) null);
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private ConversationBuilder getBaseBuilder() {
        ConversationBuilder stat = new ConversationBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setExecutorService(WEBRTC_EXECUTOR).setVersion(this.appVersion).setStat(this.defaultStat);
        voc voc = this.log;
        if (!(voc instanceof gpf)) {
            voc = new gpf(this.tracerLiteFacade, voc);
        }
        return stat.setLog(voc).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setHotStart(this.hotStart).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setDomainId(this.domainId).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setSessionIdEnabled(this.sessionIdEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setIsWaitingRoomActivated(this.isWaitingRoomActivated).setSignalingDefaultValuesFilteringEnabled(this.isSignalingDefaultValuesFilteringEnabled).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setAnimojiDataSupplier(this.animojiDataSupplier).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setSessionRoomsEnabled(this.isSessionRoomsFeatureEnabled).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setExperiments(this.experiments).setAudienceModelEnabled(this.isAudienceModeEnabled).setServerTopologySuspendBelowMinBitrate(this.serverTopologySuspendBelowMinBitrate).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setDnsResolverEnabled(this.dnsResolverEnabled).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setAnalyticsSender(this.callAnalyticsSender).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig);
    }

    public static synchronized void init(Context context2) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context2).build());
        }
    }

    private static /* synthetic */ pm lambda$answer$5(pm pmVar) {
        return new InMemorySessionStore();
    }

    private static /* synthetic */ pm lambda$call$2(pm pmVar) {
        return new InMemorySessionStore();
    }

    private static /* synthetic */ pm lambda$createConfRoom$18(pm pmVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$22(Object obj) throws Throwable {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$23(Throwable th) throws Throwable {
    }

    private static /* synthetic */ pm lambda$joinAnonByLink$13(pm pmVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sm lambda$joinAnonByLink$14(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new sm((String) null, joinAnonByLinkParams.getApiEndpoint());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$joinAnonByLink$15() {
        return null;
    }

    private static /* synthetic */ pm lambda$joinByLink$10(pm pmVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ voc lambda$new$0() {
        return this.log;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ voc lambda$new$1() {
        return this.log;
    }

    public Conversation answer(Function1<AnswerCallParams.Builder, AnswerCallParams> function1) {
        AnswerCallParams invoke = function1.invoke(new AnswerCallParams.Builder());
        ConversationParams conversationParams = null;
        ConversationBuilder cameraCapturerFactory = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setAnswerAsContact(invoke.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload((String) null).setCid(invoke.getConversationId()).setEventListener(invoke.getEventListener()).setCameraCapturerFactory(invoke.getCameraCapturerFactory());
        invoke.getFrameInterceptor();
        ConversationBuilder opponentId = cameraCapturerFactory.setFrameInterceptor((lx1) null).setMyId(invoke.getMyId()).setOpponentId(invoke.getOpponentId());
        if (invoke.getTokenProvider() != null) {
            ic3 d = this.api.d();
            d.a = new SimpleConfigurationStore((cf3) d.a);
            d.b = invoke.getTokenProvider();
            opponentId.setApi(d.h());
        }
        if (invoke.getTokenInfoProvider() != null) {
            ic3 d2 = this.api.d();
            d2.x = lambda$answer$5((pm) d2.x);
            d2.w = invoke.getTokenInfoProvider();
            opponentId.setApi(d2.h());
        }
        ConversationImpl createConversation = opponentId.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParams = ConversationParams.decode(invoke.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        createConversation.prepare(conversationParams, new fz3(invoke, 0), new fz3(invoke, 1));
        return createConversation;
    }

    public Conversation call(Function1<StartCallParams.Builder, StartCallParams> function1) {
        StartCallParams invoke = function1.invoke(new StartCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(true).setPayload(invoke.getPayload()).setCid(generateConversationId()).setEventListener(invoke.getEventListener());
        invoke.getFrameInterceptor();
        ConversationBuilder chatId = eventListener.setFrameInterceptor((lx1) null).setWatchTogetherEnabledForAll(invoke.isWatchTogetherEnabledForAll()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).setOpponentId(invoke.getOpponentId()).setChatId(invoke.getChatId());
        if (invoke.getTokenProvider() != null) {
            ic3 d = this.api.d();
            d.a = new SimpleConfigurationStore((cf3) d.a);
            d.b = invoke.getTokenProvider();
            chatId.setApi(d.h());
        }
        if (invoke.getTokenInfoProvider() != null) {
            ic3 d2 = this.api.d();
            d2.x = lambda$call$2((pm) d2.x);
            d2.w = invoke.getTokenInfoProvider();
            chatId.setApi(d2.h());
        }
        ConversationImpl createConversation = chatId.createConversation();
        createConversation.prepare((ConversationParams) null, new bz3(invoke, 0), new bz3(invoke, 1));
        return createConversation;
    }

    public void clearApiAuthSession() {
        this.api.b().b();
    }

    public Conversation createConfRoom(Function1<CreateConfParams.Builder, CreateConfParams> function1) {
        CreateConfParams invoke = function1.invoke(new CreateConfParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(true).setPayload(invoke.getPayload()).setCid(generateConversationId()).setEventListener(invoke.getEventListener());
        invoke.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor((lx1) null).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(invoke.isWatchTogetherEnabledForAll()).setMyId(invoke.getMyId());
        if (invoke.getTokenProvider() != null) {
            ic3 d = this.api.d();
            d.b = invoke.getTokenProvider();
            d.a = new SimpleConfigurationStore((cf3) d.a);
            myId.setApi(d.h());
        }
        if (invoke.getTokenInfoProvider() != null) {
            ic3 d2 = this.api.d();
            d2.x = lambda$createConfRoom$18((pm) d2.x);
            d2.w = invoke.getTokenInfoProvider();
            myId.setApi(d2.h());
        }
        ConversationImpl createConversation = myId.createConversation();
        createConversation.initStore(invoke.getInitialIds());
        createConversation.prepare((ConversationParams) null, true, invoke.isAnonForbidden(), new iz3(invoke, 0), new iz3(invoke, 1));
        return createConversation;
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public ui getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public StatisticsManager<ProductStatItem> getProductStatisticsManager() {
        return this.prodStat;
    }

    public void hangup(nw6 nw6, String str, String str2) {
        rl0 y = hsg.y("vchat.hangupConversation");
        y.b = mm.c;
        y.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        y.b("reason", nw6.toString());
        y.b(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        sl0 a = y.a(o5a.d);
        zad c = this.api.c();
        zb2 zb2 = new zb2(18);
        c.getClass();
        lbe retryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(c.a(new aqg((hm) a, (op7) zb2)), this.experiments.h, this.log);
        zb2 zb22 = new zb2(19);
        zb2 zb23 = new zb2(20);
        retryApiCallForBackgroundWork.getClass();
        ao1 ao1 = new ao1(3, zb22, zb23);
        retryApiCallForBackgroundWork.l(ao1);
        this.disposable.a(ao1);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public Conversation join(Function1<JoinCallParams.Builder, JoinCallParams> function1) {
        JoinCallParams invoke = function1.invoke(new JoinCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setCid(invoke.getConversationId()).setEventListener(invoke.getEventListener());
        invoke.getFrameInterceptor();
        ConversationImpl createConversation = eventListener.setFrameInterceptor((lx1) null).setChatId(invoke.getChatId()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepare((ConversationParams) null, new ez3(invoke, 0), new ez3(invoke, 1));
        return createConversation;
    }

    public Conversation joinAnonByLink(Function1<JoinAnonByLinkParams.Builder, JoinAnonByLinkParams> function1) {
        JoinAnonByLinkParams invoke = function1.invoke(new JoinAnonByLinkParams.Builder());
        ic3 d = this.api.d();
        if (((tm) d.w) == null || invoke.getApiEndpoint() == null) {
            d.a = new SimpleConfigurationStore((cf3) d.a);
            d.b = new zb2(21);
        } else {
            d.x = lambda$joinAnonByLink$13((pm) d.x);
            d.w = new rt3(5, (Object) invoke);
        }
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setEventListener(invoke.getEventListener());
        invoke.getFrameInterceptor();
        ConversationImpl createConversation = eventListener.setFrameInterceptor((lx1) null).setJoinLink(invoke.getLink()).setApi(d.h()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepareJoinByLink(new cz3(invoke, 0), new cz3(invoke, 1), invoke.getToken());
        return createConversation;
    }

    public Conversation joinByLink(Function1<JoinByLinkParams.Builder, JoinByLinkParams> function1) {
        JoinByLinkParams invoke = function1.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setEventListener(invoke.getEventListener());
        invoke.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor((lx1) null).setJoinLink(invoke.getLink()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setPayload(invoke.getPayload()).setMyId(invoke.getMyId());
        if (invoke.getTokenProvider() != null) {
            ic3 d = this.api.d();
            d.b = invoke.getTokenProvider();
            d.a = new SimpleConfigurationStore((cf3) d.a);
            myId.setApi(d.h());
        }
        if (invoke.getTokenInfoProvider() != null) {
            ic3 d2 = this.api.d();
            d2.x = lambda$joinByLink$10((pm) d2.x);
            d2.w = invoke.getTokenInfoProvider();
            myId.setApi(d2.h());
        }
        ConversationImpl createConversation = myId.createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepareJoinByLink(new dz3(invoke, 0), new dz3(invoke, 1), (String) null);
        return createConversation;
    }

    public void reset() {
        this.disposable.d();
        this.api.b().b();
        this.idMappingWrapper.clear();
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAnimojiDataSupplier(ui uiVar) {
        this.animojiDataSupplier = uiVar;
    }

    public void setApiRetriesEnabled(boolean z) {
        this.experiments.h = z;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    public void setBadNetworkIndicatorConfig(ig0 ig0) {
        this.badNetworkIndicatorConfig = ig0;
    }

    @Deprecated(forRemoval = true, since = "125.1.0.24")
    public void setBitrateByTableCalculationEnabled(boolean z) {
    }

    public void setBitrates(qe1 qe1) {
        this.bitrates = qe1;
    }

    public void setCamera2ApiEnabled(boolean z) {
        this.experiments.a = z;
    }

    @Deprecated(since = "112.1.6.15")
    public void setCameraFrameMaxDimension(int i) {
        this.experiments.e = Integer.valueOf(i);
    }

    public void setChatStateListener(ChatStateListener chatStateListener2) {
        this.chatStateListener = chatStateListener2;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    public void setDtxDisabled(boolean z) {
        this.experiments.g = z;
    }

    public void setDynamicScreenShareSizeUpdateEnabled(boolean z) {
        this.experiments.k = z;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    public void setEnqueuedCommandMergeEnabled(boolean z) {
        this.experiments.i = z;
    }

    @Deprecated
    public void setExceptionConsumer(toc toc) {
    }

    public void setExternalIdsMapper(IdsMapper<ue1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(gj8 gj8) {
        this.groupCallMediaAdaptationConfig = gj8;
    }

    public void setHotStart(boolean z) {
        this.hotStart = z;
    }

    public void setInternalIdsMapper(IdsMapper<ParticipantId, ue1> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    public void setLocale(Locale locale2) {
        this.locale = locale2;
    }

    public void setLogConfiguration(woc woc) {
        this.logConfiguration = woc;
    }

    public void setLogger(voc voc) {
        if (voc == null) {
            voc = uoc.a;
            this.api.b().i(jm.a);
        } else {
            this.api.b().i(new LoggingApiRequestDebugger(voc));
        }
        gpf gpf = new gpf(this.tracerLiteFacade, voc);
        this.log = gpf;
        GlobalRTCLogger.setLog(gpf);
    }

    public void setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings2) {
        this.mediaConnectionSettings = mediaConnectionSettings2;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    public void setOkApiService(OkApiService okApiService2) {
        this.okApiService = okApiService2;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(gj8 gj8) {
        this.p2pCallMediaAdaptationConfig = gj8;
    }

    public void setRotationProvider(i8d i8d) {
        this.rotationProvider = i8d;
    }

    public void setRttRateHintConfig(RttRateHintConfig rttRateHintConfig2) {
        this.rttRateHintConfig = rttRateHintConfig2;
    }

    public void setScreenCapturePermissionProvider(lgd lgd) {
        this.screenCapturePermissionProvider = lgd;
    }

    public void setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
    }

    public void setSessionIdEnabled(boolean z) {
        this.sessionIdEnabled = z;
    }

    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    public void setStartCallByExternalIdEnabled(boolean z) {
        this.experiments.j = z;
    }

    public void setTimeouts(se1 se1) {
        this.experiments.f = se1;
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    public void setVideoDegradationForSoftwareCodec(boolean z, Float f, Float f2) {
        re1 re1 = this.experiments;
        re1.b = z;
        if (z && f2 != null) {
            re1.c = f.floatValue();
        }
        if (z && f2 != null) {
            this.experiments.d = f2.floatValue();
        }
    }

    @Deprecated(forRemoval = true, since = "125.1.0.24")
    public void setVideoQualityUpdateNotificationEnabled(boolean z) {
    }

    public void setVideoTracksCount(int i) {
        if (i > 0) {
            this.videoTracksCount = i;
            return;
        }
        throw new IllegalArgumentException("Video tracks count must be positive");
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationFactory(defpackage.nla r8, android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.time.Clock r0 = java.time.Clock.systemUTC()
            java.util.Objects.requireNonNull(r0)
            hz3 r6 = new hz3
            r1 = 1
            r6.<init>(r0, r1)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationFactory.<init>(nla, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static synchronized void init(Context context2, NativeLibraryLoader nativeLibraryLoader) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context2).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, kc3] */
    public ConversationFactory(nla nla, Context context2, String str, String str2, ExtLogger.TimeProvider timeProvider) {
        this.isWaitingRoomActivated = true;
        this.enableLossRttBadConnectionHandling = false;
        this.hotStart = false;
        this.log = uoc.a;
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.forceRelayPolicy = false;
        this.audioLevelFrequencyMs = 250;
        this.additionalWhitelistedCodecPrefixes = Arrays.asList(new String[]{"OMX.MTK", "OMX.hisi"});
        this.isConsumerUpdateEnabled = true;
        this.onDemandTracksEnabled = true;
        this.dataChannelScreenshareRecvEnabled = true;
        this.dataChannelScreenshareSendEnabled = true;
        this.videoTracksCount = 10;
        this.fastRecoverEnabled = true;
        this.sessionIdEnabled = true;
        this.mediaReceivingTimeoutMs = WorkRequest.MIN_BACKOFF_MILLIS;
        this.isSignalingDefaultValuesFilteringEnabled = true;
        this.rotationProvider = i8d.a0;
        this.appVersion = DEFAULT_APP_VERSION;
        this.isWebRTCCodecFilteringEnabled = false;
        this.audioCodecs = null;
        this.videoCodecs = null;
        this.multipleDevicesEnabled = false;
        this.showLocalVideoInOriginalQuality = false;
        this.isSessionRoomsFeatureEnabled = true;
        this.isFastScreenCaptureEnabled = false;
        this.isDeviceAudioShareEnabled = false;
        this.isAsrOnlineEnabled = false;
        this.experiments = new re1();
        this.locale = null;
        this.animojiDataSupplier = bk3.b;
        this.isMediaAdaptationFeatureEnabledForP2PCall = true;
        this.isMediaAdaptationFeatureEnabledForGroupCall = true;
        this.chatStateListener = ChatStateListener.EMPTY;
        this.serverTopologySuspendBelowMinBitrate = false;
        this.isAudienceModeEnabled = false;
        this.badNetworkIndicatorConfig = ig0.c;
        CallAnalyticsSender callAnalyticsSender2 = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender2;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.mediaConnectionSettings = new MediaConnectionSettings();
        this.rttRateHintConfig = new RttRateHintConfig();
        this.clientType = str;
        this.domainId = str2;
        this.api = nla;
        this.context = context2;
        this.disposable = new Object();
        IdMappingWrapper idMappingWrapper2 = IdMappingWrapper.get(context2, new RTCLogWrapper(new gz3(this, 0)));
        this.idMappingWrapper = idMappingWrapper2;
        Clock systemUTC = Clock.systemUTC();
        Objects.requireNonNull(systemUTC);
        this.prodStat = new ProductStatisticsManagerImpl(new hz3(systemUTC, 0));
        this.defaultStat = new ExtLogger(context2.getApplicationInfo().packageName, timeProvider);
        idMappingWrapper2.scheduleReadCacheFromDisk();
        this.additionalWhitelistedCodecPrefixes = Collections.emptyList();
        this.bitrates = CallUtil.createBitrates();
        this.okApiService = new OkApiService(nla.c());
        this.tracerLiteFacade = new yof(context2);
        new CallAnalyticsInitializer().init(callAnalyticsSender2, conversationAnalyticsSenderImpl.getConfiguration(), nla, new gz3(this, 1));
    }

    public static synchronized void init(ConversationFactoryInitParams conversationFactoryInitParams) {
        hbb hbb;
        hbb hbb2;
        synchronized (ConversationFactory.class) {
            if (!initDone) {
                initDone = true;
                ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
                ConversationFactoryInitParams.PeerConnection.DynamicRedundancyParameters dynamicRedundancyParams = peerConnection.getDynamicRedundancyParams();
                Context context2 = conversationFactoryInitParams.getContext();
                voc logger = peerConnection.getLogger();
                Integer rttMultCapMs = peerConnection.getRttMultCapMs();
                boolean isREDEnabledP2P = peerConnection.isREDEnabledP2P();
                boolean isREDEnabledServer = peerConnection.isREDEnabledServer();
                boolean isOpusDREDEnabled = peerConnection.isOpusDREDEnabled();
                if (dynamicRedundancyParams == null) {
                    hbb = null;
                } else {
                    hbb = new hbb(dynamicRedundancyParams.isEnabled(), dynamicRedundancyParams.getMinAudioBitrateBps(), dynamicRedundancyParams.getDREDSwitchBitrateBps(), dynamicRedundancyParams.isNoLACEEnabled(), dynamicRedundancyParams.isDREDWithFecEnabled(), dynamicRedundancyParams.isDREDLowBitrateEnabled(), dynamicRedundancyParams.getPTimeMinMs(), dynamicRedundancyParams.getPTimeMaxMs());
                }
                boolean isOpusDREDLowBitrateEnabled = peerConnection.isOpusDREDLowBitrateEnabled();
                String bonusFieldTrials = peerConnection.getBonusFieldTrials();
                String udpMarker = peerConnection.getUdpMarker();
                String tcpMarker = peerConnection.getTcpMarker();
                boolean isEarlyAudioPlayoutEnabled = peerConnection.isEarlyAudioPlayoutEnabled();
                boolean isEarlyAudioRecordingEnabled = peerConnection.isEarlyAudioRecordingEnabled();
                boolean isSkipRelayToNotRelayConnectionEnabled = peerConnection.isSkipRelayToNotRelayConnectionEnabled();
                if (hbb == null) {
                    Boolean bool = Boolean.FALSE;
                    hbb2 = new hbb(false, (Integer) null, (Integer) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null);
                } else {
                    hbb2 = hbb;
                }
                fbb.D(context2, new dm4(20, (Object) new ibb(isREDEnabledP2P, isREDEnabledServer, udpMarker, tcpMarker, rttMultCapMs, isEarlyAudioPlayoutEnabled, isEarlyAudioRecordingEnabled, isSkipRelayToNotRelayConnectionEnabled, isOpusDREDEnabled, hbb2, isOpusDREDLowBitrateEnabled, bonusFieldTrials), (Object) logger), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
            }
        }
    }

    public void hangup(nw6 nw6, String str) {
        hangup(nw6, str, (String) null);
    }
}
