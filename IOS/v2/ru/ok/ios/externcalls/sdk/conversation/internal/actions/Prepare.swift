package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003BCDBi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\b\b\u0000\u0010!*\u00020 *\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010)\u001a\u00020\u00142\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010)\u001a\u00020\u00142\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b/\u0010.J/\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b0\u00101J7\u00103\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00030\u00030\u001d2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b3\u00101J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010=R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010A¨\u0006E"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "okApiService", "Lkz3;", "cidProvider", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "providedParams", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "internalIdsResolver", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "externalIdsResolver", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "startCallApiParams", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "peerIdGenerator", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "", "isAnswer", "isCaller", "Lvoc;", "log", "Lte1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiService;Lkz3;Lru/ok/android/externcalls/sdk/api/ConversationParams;Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;ZZLvoc;Lte1;)V", "Llbe;", "executeSimple", "()Llbe;", "", "T", "retryForApiCall", "(Llbe;)Llbe;", "", "initialJoinLink", "anonToken", "executeWithJoinLink", "(Ljava/lang/String;Ljava/lang/String;)Llbe;", "isJoinByLink", "Lkotlin/Function0;", "Lz4b;", "apiRequest", "prepareImpl", "(ZLkotlin/jvm/functions/Function0;)Llbe;", "getPrepareResult", "getPrepareResultWithoutInternalIds", "(Lkotlin/jvm/functions/Function0;)Llbe;", "kotlin.jvm.PlatformType", "getPrepareResultWithInternalIds", "params", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;)Llbe;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "Lkz3;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Z", "Lvoc;", "Lte1;", "Companion", "PrepareParams", "PrepareResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class Prepare implements Action<PrepareParams, PrepareResult> {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String TAG = "ConversationPrepare";
    /* access modifiers changed from: private */
    public final te1 callParams;
    /* access modifiers changed from: private */
    public final kz3 cidProvider;
    private final ExternalIdsResolver externalIdsResolver;
    private final InternalIdsResolver internalIdsResolver;
    /* access modifiers changed from: private */
    public final boolean isAnswer;
    /* access modifiers changed from: private */
    public final boolean isCaller;
    /* access modifiers changed from: private */
    public final voc log;
    /* access modifiers changed from: private */
    public final OkApiService okApiService;
    /* access modifiers changed from: private */
    public final PeerIdGenerator peerIdGenerator;
    /* access modifiers changed from: private */
    public final ConversationPreparedStat preparedStat;
    /* access modifiers changed from: private */
    public final ConversationParams providedParams;
    /* access modifiers changed from: private */
    public final StartCallApiParams startCallApiParams;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$Companion;", "", "()V", "TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "Prepare", "PrepareJoin", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PrepareParams extends ActionParams {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$PrepareParams$Prepare  reason: collision with other inner class name */
        public static final class C0002Prepare implements PrepareParams {
            public static final C0002Prepare INSTANCE = new C0002Prepare();

            private C0002Prepare() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "initialJoinLink", "", "anonToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnonToken", "()Ljava/lang/String;", "getInitialJoinLink", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PrepareJoin implements PrepareParams {
            private final String anonToken;
            private final String initialJoinLink;

            public PrepareJoin(String str, String str2) {
                this.initialJoinLink = str;
                this.anonToken = str2;
            }

            public static /* synthetic */ PrepareJoin copy$default(PrepareJoin prepareJoin, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = prepareJoin.initialJoinLink;
                }
                if ((i & 2) != 0) {
                    str2 = prepareJoin.anonToken;
                }
                return prepareJoin.copy(str, str2);
            }

            public final String component1() {
                return this.initialJoinLink;
            }

            public final String component2() {
                return this.anonToken;
            }

            public final PrepareJoin copy(String str, String str2) {
                return new PrepareJoin(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrepareJoin)) {
                    return false;
                }
                PrepareJoin prepareJoin = (PrepareJoin) obj;
                return Intrinsics.areEqual((Object) this.initialJoinLink, (Object) prepareJoin.initialJoinLink) && Intrinsics.areEqual((Object) this.anonToken, (Object) prepareJoin.anonToken);
            }

            public final String getAnonToken() {
                return this.anonToken;
            }

            public final String getInitialJoinLink() {
                return this.initialJoinLink;
            }

            public int hashCode() {
                String str = this.initialJoinLink;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.anonToken;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return rae.p("PrepareJoin(initialJoinLink=", this.initialJoinLink, ", anonToken=", this.anonToken, ")");
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "conversationParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "unresolvedParticipantIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/api/ConversationParams;Ljava/util/Set;)V", "getConversationParams", "()Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getUnresolvedParticipantIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PrepareResult implements ActionResult {
        private final ConversationParams conversationParams;
        private final Set<ParticipantId> unresolvedParticipantIds;

        public PrepareResult(ConversationParams conversationParams2, Set<ParticipantId> set) {
            this.conversationParams = conversationParams2;
            this.unresolvedParticipantIds = set;
        }

        public static /* synthetic */ PrepareResult copy$default(PrepareResult prepareResult, ConversationParams conversationParams2, Set<ParticipantId> set, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams2 = prepareResult.conversationParams;
            }
            if ((i & 2) != 0) {
                set = prepareResult.unresolvedParticipantIds;
            }
            return prepareResult.copy(conversationParams2, set);
        }

        public final ConversationParams component1() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> component2() {
            return this.unresolvedParticipantIds;
        }

        public final PrepareResult copy(ConversationParams conversationParams2, Set<ParticipantId> set) {
            return new PrepareResult(conversationParams2, set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepareResult)) {
                return false;
            }
            PrepareResult prepareResult = (PrepareResult) obj;
            return Intrinsics.areEqual((Object) this.conversationParams, (Object) prepareResult.conversationParams) && Intrinsics.areEqual((Object) this.unresolvedParticipantIds, (Object) prepareResult.unresolvedParticipantIds);
        }

        public final ConversationParams getConversationParams() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> getUnresolvedParticipantIds() {
            return this.unresolvedParticipantIds;
        }

        public int hashCode() {
            ConversationParams conversationParams2 = this.conversationParams;
            return this.unresolvedParticipantIds.hashCode() + ((conversationParams2 == null ? 0 : conversationParams2.hashCode()) * 31);
        }

        public String toString() {
            ConversationParams conversationParams2 = this.conversationParams;
            Set<ParticipantId> set = this.unresolvedParticipantIds;
            return "PrepareResult(conversationParams=" + conversationParams2 + ", unresolvedParticipantIds=" + set + ")";
        }
    }

    public Prepare(OkApiService okApiService2, kz3 kz3, ConversationParams conversationParams, InternalIdsResolver internalIdsResolver2, ExternalIdsResolver externalIdsResolver2, StartCallApiParams startCallApiParams2, PeerIdGenerator peerIdGenerator2, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, voc voc, te1 te1) {
        this.okApiService = okApiService2;
        this.cidProvider = kz3;
        this.providedParams = conversationParams;
        this.internalIdsResolver = internalIdsResolver2;
        this.externalIdsResolver = externalIdsResolver2;
        this.startCallApiParams = startCallApiParams2;
        this.peerIdGenerator = peerIdGenerator2;
        this.preparedStat = conversationPreparedStat;
        this.isAnswer = z;
        this.isCaller = z2;
        this.log = voc;
        this.callParams = te1;
    }

    private final lbe executeSimple() {
        return prepareImpl(false, new Prepare$executeSimple$1(this));
    }

    private final lbe executeWithJoinLink(String str, String str2) {
        return prepareImpl(true, new Prepare$executeWithJoinLink$1(this, str, str2));
    }

    private final lbe getPrepareResult(boolean z, Function0<? extends lbe> function0) {
        return (!this.callParams.B.j || (!this.isCaller && !z)) ? getPrepareResultWithInternalIds(function0) : getPrepareResultWithoutInternalIds(function0);
    }

    private final lbe getPrepareResultWithInternalIds(Function0<? extends lbe> function0) {
        lbe lbe = (lbe) function0.invoke();
        lbe retryForApiCall = retryForApiCall(this.internalIdsResolver.resolveIdsAndGetFailed());
        ExternalIdsResolver externalIdsResolver2 = this.externalIdsResolver;
        ma3 resolveIds = externalIdsResolver2.resolveIds(externalIdsResolver2.collectExternalIdResolutionCandidates());
        Unit unit = Unit.INSTANCE;
        resolveIds.getClass();
        Objects.requireNonNull(unit, "completionValue is null");
        lbe retryForApiCall2 = retryForApiCall(new hb3(0, resolveIds, unit));
        Prepare$getPrepareResultWithInternalIds$1<T1, T2, T3, R> prepare$getPrepareResultWithInternalIds$1 = Prepare$getPrepareResultWithInternalIds$1.INSTANCE;
        Objects.requireNonNull(lbe, "source1 is null");
        Objects.requireNonNull(retryForApiCall, "source2 is null");
        Objects.requireNonNull(retryForApiCall2, "source3 is null");
        Objects.requireNonNull(prepare$getPrepareResultWithInternalIds$1, "zipper is null");
        return new hb3(6, new lbe[]{lbe, retryForApiCall, retryForApiCall2}, new ch2(11, prepare$getPrepareResultWithInternalIds$1));
    }

    private final lbe getPrepareResultWithoutInternalIds(Function0<? extends lbe> function0) {
        return ((lbe) function0.invoke()).i(Prepare$getPrepareResultWithoutInternalIds$1.INSTANCE);
    }

    private final lbe prepareImpl(boolean z, Function0<? extends lbe> function0) {
        return new hb3(5, getPrepareResult(z, function0).j(qe.a()), new Prepare$prepareImpl$1(this));
    }

    /* access modifiers changed from: private */
    public final <T> lbe retryForApiCall(lbe lbe) {
        return this.isAnswer ? RetryKt.retryApiCallForIncoming(lbe, this.callParams.B.h, this.log) : RetryKt.retryApiCallForOutgoing(lbe, this.callParams.B.h, this.log);
    }

    public lbe execute(PrepareParams prepareParams) {
        if (prepareParams instanceof PrepareParams.C0002Prepare) {
            return executeSimple();
        }
        if (prepareParams instanceof PrepareParams.PrepareJoin) {
            PrepareParams.PrepareJoin prepareJoin = (PrepareParams.PrepareJoin) prepareParams;
            return executeWithJoinLink(prepareJoin.getInitialJoinLink(), prepareJoin.getAnonToken());
        }
        throw new NoWhenBranchMatchedException();
    }
}
