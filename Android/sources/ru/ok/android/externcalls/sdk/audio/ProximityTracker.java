package ru.ok.android.externcalls.sdk.audio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "", "canUseSpeaker", "", "getCanUseSpeaker", "()Z", "startTrackingProximity", "", "stopTrackingProximity", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ProximityTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/ProximityTracker$Companion;", "", "()V", "NOOP", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "getNOOP$calls_audiomanager_release", "()Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ProximityTracker NOOP = new ProximityTracker$Companion$NOOP$1();

        private Companion() {
        }

        public final ProximityTracker getNOOP$calls_audiomanager_release() {
            return NOOP;
        }
    }

    boolean getCanUseSpeaker() {
        return true;
    }

    void startTrackingProximity() {
    }

    void stopTrackingProximity() {
    }
}
