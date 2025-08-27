package ru.ok.android.externcalls.sdk.id.peer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "", "()V", "generatePeerId", "", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PeerIdGenerator {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long MAX_JS_SAFE_LONG = 9007199254740991L;
    private static final long MIN_JS_SAFE_LONG = -9007199254740991L;
    private static final LongRange PEER_ID_RANGE = new LongRange(MIN_JS_SAFE_LONG, MAX_JS_SAFE_LONG);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator$Companion;", "", "()V", "MAX_JS_SAFE_LONG", "", "MIN_JS_SAFE_LONG", "PEER_ID_RANGE", "Lkotlin/ranges/LongRange;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long generatePeerId() {
        return RangesKt.random(PEER_ID_RANGE, (Random) Random.Default);
    }
}
