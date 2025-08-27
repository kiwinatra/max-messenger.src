package ru.ok.android.externcalls.sdk.conversation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "", "domainId", "", "payload", "isWatchTogetherEnabledForAll", "", "isVideo", "clientType", "isMultipleDevicesEnabled", "chatId", "", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/Long;)V", "getChatId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientType", "()Ljava/lang/String;", "getDomainId", "()Z", "getPayload", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StartCallApiParams {
    private final Long chatId;
    private final String clientType;
    private final String domainId;
    private final boolean isMultipleDevicesEnabled;
    private final boolean isVideo;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;

    public StartCallApiParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Long l) {
        this.domainId = str;
        this.payload = str2;
        this.isWatchTogetherEnabledForAll = z;
        this.isVideo = z2;
        this.clientType = str3;
        this.isMultipleDevicesEnabled = z3;
        this.chatId = l;
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final String getDomainId() {
        return this.domainId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final boolean isMultipleDevicesEnabled() {
        return this.isMultipleDevicesEnabled;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartCallApiParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, str3, z3, (i & 64) != 0 ? null : l);
    }
}
