package ru.ok.android.externcalls.sdk.record;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "", "currentState", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "previousState", "(Lru/ok/android/externcalls/sdk/record/RecordDescription;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "getCurrentState", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getPreviousState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecordDescriptionHistory {
    private final RecordDescription currentState;
    private final RecordDescription previousState;

    public RecordDescriptionHistory(RecordDescription recordDescription, RecordDescription recordDescription2) {
        this.currentState = recordDescription;
        this.previousState = recordDescription2;
    }

    public static /* synthetic */ RecordDescriptionHistory copy$default(RecordDescriptionHistory recordDescriptionHistory, RecordDescription recordDescription, RecordDescription recordDescription2, int i, Object obj) {
        if ((i & 1) != 0) {
            recordDescription = recordDescriptionHistory.currentState;
        }
        if ((i & 2) != 0) {
            recordDescription2 = recordDescriptionHistory.previousState;
        }
        return recordDescriptionHistory.copy(recordDescription, recordDescription2);
    }

    public final RecordDescription component1() {
        return this.currentState;
    }

    public final RecordDescription component2() {
        return this.previousState;
    }

    public final RecordDescriptionHistory copy(RecordDescription recordDescription, RecordDescription recordDescription2) {
        return new RecordDescriptionHistory(recordDescription, recordDescription2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDescriptionHistory)) {
            return false;
        }
        RecordDescriptionHistory recordDescriptionHistory = (RecordDescriptionHistory) obj;
        return Intrinsics.areEqual((Object) this.currentState, (Object) recordDescriptionHistory.currentState) && Intrinsics.areEqual((Object) this.previousState, (Object) recordDescriptionHistory.previousState);
    }

    public final RecordDescription getCurrentState() {
        return this.currentState;
    }

    public final RecordDescription getPreviousState() {
        return this.previousState;
    }

    public int hashCode() {
        RecordDescription recordDescription = this.currentState;
        int i = 0;
        int hashCode = (recordDescription == null ? 0 : recordDescription.hashCode()) * 31;
        RecordDescription recordDescription2 = this.previousState;
        if (recordDescription2 != null) {
            i = recordDescription2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        RecordDescription recordDescription = this.currentState;
        RecordDescription recordDescription2 = this.previousState;
        return "RecordDescriptionHistory(currentState=" + recordDescription + ", previousState=" + recordDescription2 + ")";
    }
}
