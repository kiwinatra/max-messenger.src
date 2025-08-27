package ru.ok.android.externcalls.sdk;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

class ConversationBuilder {
    List<String> additionalWhitelistedCodecPrefixes;
    CallAnalyticsSender analyticsSender;
    ui animojiRenderProvider;
    boolean answerAsContact;
    nla api;
    String[] audioCodecs = null;
    int audioLevelFrequencyMs = 250;
    ig0 badNetworkIndicatorConfig;
    qe1 bitrates = null;
    wga cameraCapturerFactory;
    Long chatId = null;
    ChatStateListener chatStateListener = ChatStateListener.EMPTY;
    String cid;
    String clientType;
    Context context;
    ConversationFactory creator;
    boolean dnsResolverEnabled;
    String domainId;
    boolean enableLossRttBadConnectionHandling;
    ConversationEventsListener eventListener;
    ExecutorService executorService;
    re1 experiments;
    IdsMapper<ue1, ParticipantId> externalIdsMapper;
    boolean fastRecoverEnabled = false;
    boolean forceRelayPolicy;
    lx1 frameInterceptor;
    gj8 groupCallMediaAdaptationConfig;
    boolean hasVideo;
    boolean hotStart;
    IdMappingWrapper idMappingWrapper;
    ConversationParticipant initialOpponent;
    IdsMapper<ParticipantId, ue1> internalIdsMapper;
    boolean isAnswer;
    boolean isAsrOnlineEnabled = false;
    boolean isAudienceModeEnabled = false;
    boolean isCaller;
    boolean isConsumerUpdateEnabled;
    boolean isDataChannelScreenshareRecvEnabled;
    boolean isDataChannelScreenshareSendEnabled;
    boolean isDeviceAudioShareEnabled = false;
    boolean isFastScreenCaptureEnabled = false;
    boolean isJoined;
    boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    boolean isOnDemandTracksEnabled;
    boolean isSessionRoomsFeatureEnabled = true;
    boolean isSignalingDefaultValuesFilteringEnabled;
    boolean isWaitingRoomActivated = false;
    boolean isWatchTogetherEnabledForAll;
    boolean isWebRTCCodecFilteringEnabled = false;
    String joinLink;
    Locale locale = null;
    voc log;
    woc logConfiguration;

    /* renamed from: me  reason: collision with root package name */
    ConversationParticipant f132me;
    MediaConnectionSettings mediaConnectionSettings;
    long mediaReceivingTimeoutMs;
    boolean multipleDevicesEnabled;
    OkApiService okApiService;
    String payload;
    gj8 ptpCallMediaAdaptationConfig;
    i8d rotationProvider = i8d.a0;
    RttRateHintConfig rttRateHintConfig;
    lgd screenCapturePermissionProvider;
    boolean serverTopologySuspendBelowMinBitrate = false;
    boolean sessionIdEnabled = false;
    boolean showLocalVideoInOriginalQuality;
    ExtLogger stat;
    String version;
    String[] videoCodecs = null;
    int videoTracksCount = 0;

    public ConversationBuilder(IdMappingWrapper idMappingWrapper2) {
        this.idMappingWrapper = idMappingWrapper2;
    }

    public ConversationImpl createConversation() {
        return new ConversationImpl(this);
    }

    public ConversationBuilder setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
        return this;
    }

    public ConversationBuilder setAnalyticsSender(CallAnalyticsSender callAnalyticsSender) {
        this.analyticsSender = callAnalyticsSender;
        return this;
    }

    public ConversationBuilder setAnimojiDataSupplier(ui uiVar) {
        this.animojiRenderProvider = uiVar;
        return this;
    }

    public ConversationBuilder setAnswerAsContact(boolean z) {
        this.answerAsContact = z;
        return this;
    }

    public ConversationBuilder setApi(nla nla) {
        this.api = nla;
        this.okApiService = new OkApiService(nla.c());
        return this;
    }

    public ConversationBuilder setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
        return this;
    }

    public ConversationBuilder setAudienceModelEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
        return this;
    }

    public ConversationBuilder setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
        return this;
    }

    public ConversationBuilder setBadNetworkIndicatorConfig(ig0 ig0) {
        this.badNetworkIndicatorConfig = ig0;
        return this;
    }

    public ConversationBuilder setBitrates(qe1 qe1) {
        this.bitrates = qe1;
        return this;
    }

    public ConversationBuilder setCameraCapturerFactory(wga wga) {
        this.cameraCapturerFactory = wga;
        return this;
    }

    public ConversationBuilder setChatId(Long l) {
        this.chatId = l;
        return this;
    }

    public ConversationBuilder setChatStateListener(ChatStateListener chatStateListener2) {
        this.chatStateListener = chatStateListener2;
        return this;
    }

    public ConversationBuilder setCid(String str) {
        this.cid = str;
        return this;
    }

    public ConversationBuilder setClientType(String str) {
        this.clientType = str;
        return this;
    }

    public ConversationBuilder setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
        return this;
    }

    public ConversationBuilder setContext(Context context2) {
        this.context = context2;
        return this;
    }

    public ConversationBuilder setCreator(ConversationFactory conversationFactory) {
        this.creator = conversationFactory;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareRecvEnabled(boolean z) {
        this.isDataChannelScreenshareRecvEnabled = z;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareSendEnabled(boolean z) {
        this.isDataChannelScreenshareSendEnabled = z;
        return this;
    }

    public ConversationBuilder setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
        return this;
    }

    public ConversationBuilder setDnsResolverEnabled(boolean z) {
        this.dnsResolverEnabled = z;
        return this;
    }

    public ConversationBuilder setDomainId(String str) {
        this.domainId = str;
        return this;
    }

    public ConversationBuilder setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
        return this;
    }

    public ConversationBuilder setEventListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener = conversationEventsListener;
        return this;
    }

    public ConversationBuilder setExecutorService(ExecutorService executorService2) {
        this.executorService = executorService2;
        return this;
    }

    public ConversationBuilder setExperiments(re1 re1) {
        this.experiments = re1;
        return this;
    }

    public ConversationBuilder setExternalIdsMapper(IdsMapper<ue1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
        return this;
    }

    public ConversationBuilder setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
        return this;
    }

    public ConversationBuilder setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
        return this;
    }

    public ConversationBuilder setFrameInterceptor(lx1 lx1) {
        return this;
    }

    public ConversationBuilder setGroupCallMediaAdaptationConfig(gj8 gj8) {
        this.groupCallMediaAdaptationConfig = gj8;
        return this;
    }

    public ConversationBuilder setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public ConversationBuilder setHotStart(boolean z) {
        this.hotStart = z;
        return this;
    }

    public ConversationBuilder setInternalIdsMapper(IdsMapper<ParticipantId, ue1> idsMapper) {
        this.internalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setIsAnswer(boolean z) {
        this.isAnswer = z;
        return this;
    }

    public ConversationBuilder setIsCaller(boolean z) {
        this.isCaller = z;
        return this;
    }

    public ConversationBuilder setIsJoined(boolean z) {
        this.isJoined = z;
        return this;
    }

    public ConversationBuilder setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
        return this;
    }

    public ConversationBuilder setJoinLink(String str) {
        this.joinLink = str;
        return this;
    }

    public ConversationBuilder setLocale(Locale locale2) {
        this.locale = locale2;
        return this;
    }

    public ConversationBuilder setLog(voc voc) {
        this.log = voc;
        return this;
    }

    public ConversationBuilder setLogConfiguration(woc woc) {
        this.logConfiguration = woc;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
        return this;
    }

    public ConversationBuilder setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings2) {
        this.mediaConnectionSettings = mediaConnectionSettings2;
        return this;
    }

    public ConversationBuilder setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
        return this;
    }

    public ConversationBuilder setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
        return this;
    }

    public ConversationBuilder setMyId(ParticipantId participantId) {
        this.f132me = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        return this;
    }

    public ConversationBuilder setOkApiService(OkApiService okApiService2) {
        this.okApiService = okApiService2;
        return this;
    }

    public ConversationBuilder setOnDemandTracksEnabled(boolean z) {
        this.isOnDemandTracksEnabled = z;
        return this;
    }

    public ConversationBuilder setOpponentId(ParticipantId participantId) {
        if (participantId != null) {
            this.initialOpponent = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        }
        return this;
    }

    public ConversationBuilder setP2PCallMediaAdaptationConfig(gj8 gj8) {
        this.ptpCallMediaAdaptationConfig = gj8;
        return this;
    }

    public ConversationBuilder setPayload(String str) {
        this.payload = str;
        return this;
    }

    public ConversationBuilder setRotationProvider(i8d i8d) {
        this.rotationProvider = i8d;
        return this;
    }

    public ConversationBuilder setRttRateHintConfig(RttRateHintConfig rttRateHintConfig2) {
        this.rttRateHintConfig = rttRateHintConfig2;
        return this;
    }

    public ConversationBuilder setScreenCapturePermissionProvider(lgd lgd) {
        this.screenCapturePermissionProvider = lgd;
        return this;
    }

    public ConversationBuilder setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
        return this;
    }

    public ConversationBuilder setSessionIdEnabled(boolean z) {
        this.sessionIdEnabled = z;
        return this;
    }

    public ConversationBuilder setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
        return this;
    }

    public ConversationBuilder setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setStat(ExtLogger extLogger) {
        this.stat = extLogger;
        return this;
    }

    public ConversationBuilder setVersion(String str) {
        this.version = str;
        return this;
    }

    public ConversationBuilder setVideoTracksCount(int i) {
        this.videoTracksCount = i;
        return this;
    }

    public ConversationBuilder setWatchTogetherEnabledForAll(boolean z) {
        this.isWatchTogetherEnabledForAll = z;
        return this;
    }

    public ConversationBuilder setWebRTCAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
        return this;
    }

    public ConversationBuilder setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setWebRTCVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
        return this;
    }

    public ConversationBuilder showLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
        return this;
    }
}
