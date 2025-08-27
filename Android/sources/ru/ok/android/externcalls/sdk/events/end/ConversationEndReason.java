package ru.ok.android.externcalls.sdk.events.end;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "", "AcceptedOnAnotherDevice", "Busy", "CallTimeout", "Canceled", "ConversationAlreadyEnded", "EndedForAll", "Error", "Hangup", "Missed", "ObsoleteClient", "PeerConnectionTimeout", "Rejected", "RemovedFromCall", "SignalingTimeout", "Unknown", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConversationEndReason {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AcceptedOnAnotherDevice implements ConversationEndReason {
        public static final AcceptedOnAnotherDevice INSTANCE = new AcceptedOnAnotherDevice();

        private AcceptedOnAnotherDevice() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AcceptedOnAnotherDevice);
        }

        public int hashCode() {
            return 941556652;
        }

        public String toString() {
            return "AcceptedOnAnotherDevice";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Busy implements ConversationEndReason {
        public static final Busy INSTANCE = new Busy();

        private Busy() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Busy);
        }

        public int hashCode() {
            return -1199866912;
        }

        public String toString() {
            return "Busy";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallTimeout implements ConversationEndReason {
        public static final CallTimeout INSTANCE = new CallTimeout();

        private CallTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CallTimeout);
        }

        public int hashCode() {
            return 746379612;
        }

        public String toString() {
            return "CallTimeout";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Canceled implements ConversationEndReason {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public int hashCode() {
            return 284189440;
        }

        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConversationAlreadyEnded implements ConversationEndReason {
        public static final ConversationAlreadyEnded INSTANCE = new ConversationAlreadyEnded();

        private ConversationAlreadyEnded() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConversationAlreadyEnded);
        }

        public int hashCode() {
            return -513124916;
        }

        public String toString() {
            return "ConversationAlreadyEnded";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndedForAll implements ConversationEndReason {
        public static final EndedForAll INSTANCE = new EndedForAll();

        private EndedForAll() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EndedForAll);
        }

        public int hashCode() {
            return 1468058539;
        }

        public String toString() {
            return "EndedForAll";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements ConversationEndReason {
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Error copy(Throwable th) {
            return new Error(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual((Object) this.throwable, (Object) ((Error) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            Throwable th = this.throwable;
            return "Error(throwable=" + th + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Hangup implements ConversationEndReason {
        public static final Hangup INSTANCE = new Hangup();

        private Hangup() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hangup);
        }

        public int hashCode() {
            return -1867725132;
        }

        public String toString() {
            return "Hangup";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Missed implements ConversationEndReason {
        public static final Missed INSTANCE = new Missed();

        private Missed() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Missed);
        }

        public int hashCode() {
            return -1717031230;
        }

        public String toString() {
            return "Missed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "explanationHtml", "", "(Ljava/lang/String;)V", "getExplanationHtml", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ObsoleteClient implements ConversationEndReason {
        private final String explanationHtml;

        public ObsoleteClient(String str) {
            this.explanationHtml = str;
        }

        public static /* synthetic */ ObsoleteClient copy$default(ObsoleteClient obsoleteClient, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = obsoleteClient.explanationHtml;
            }
            return obsoleteClient.copy(str);
        }

        public final String component1() {
            return this.explanationHtml;
        }

        public final ObsoleteClient copy(String str) {
            return new ObsoleteClient(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ObsoleteClient) && Intrinsics.areEqual((Object) this.explanationHtml, (Object) ((ObsoleteClient) obj).explanationHtml);
        }

        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        public int hashCode() {
            String str = this.explanationHtml;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return wj6.k("ObsoleteClient(explanationHtml=", this.explanationHtml, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PeerConnectionTimeout implements ConversationEndReason {
        public static final PeerConnectionTimeout INSTANCE = new PeerConnectionTimeout();

        private PeerConnectionTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PeerConnectionTimeout);
        }

        public int hashCode() {
            return -303820710;
        }

        public String toString() {
            return "PeerConnectionTimeout";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Rejected implements ConversationEndReason {
        public static final Rejected INSTANCE = new Rejected();

        private Rejected() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public int hashCode() {
            return -201133339;
        }

        public String toString() {
            return "Rejected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RemovedFromCall implements ConversationEndReason {
        public static final RemovedFromCall INSTANCE = new RemovedFromCall();

        private RemovedFromCall() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RemovedFromCall);
        }

        public int hashCode() {
            return 354659681;
        }

        public String toString() {
            return "RemovedFromCall";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SignalingTimeout implements ConversationEndReason {
        public static final SignalingTimeout INSTANCE = new SignalingTimeout();

        private SignalingTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignalingTimeout);
        }

        public int hashCode() {
            return -269234386;
        }

        public String toString() {
            return "SignalingTimeout";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unknown implements ConversationEndReason {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public int hashCode() {
            return 1252320515;
        }

        public String toString() {
            return "Unknown";
        }
    }
}
