package ru.ok.android.externcalls.sdk.participant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "reason", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;)V", "getReason", "()Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "Reason", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddByLinkFailedException extends RuntimeException {
    private final Reason reason;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "", "(Ljava/lang/String;I)V", "LINK_OUTDATED", "WRONG_SIGNATURE", "MALFORMED_QR_URL", "QR_WRONG_PREFIX", "QR_NO_USER_ID_PARAMETER", "QR_GENERAL_ERROR", "UNKNOWN", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Reason {
        LINK_OUTDATED,
        WRONG_SIGNATURE,
        MALFORMED_QR_URL,
        QR_WRONG_PREFIX,
        QR_NO_USER_ID_PARAMETER,
        QR_GENERAL_ERROR,
        UNKNOWN;

        static {
            Reason[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }
    }

    public AddByLinkFailedException(String str, Reason reason2) {
        super(str);
        this.reason = reason2;
    }

    public final Reason getReason() {
        return this.reason;
    }
}
