package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m1488overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + Duration.m1402toStringimpl(j) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m1489plusAssignLRDsOJo(long j) {
        long r0 = Duration.m1399toLongimpl(j, getUnit());
        if (((r0 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            long r02 = Duration.m1356divUwyO8pc(j, 2);
            if ((1 | (Duration.m1399toLongimpl(r02, getUnit()) - 1)) == LongCompanionObject.MAX_VALUE) {
                m1488overflowLRDsOJo(j);
                return;
            }
            long j2 = this.reading;
            try {
                m1489plusAssignLRDsOJo(r02);
                m1489plusAssignLRDsOJo(Duration.m1388minusLRDsOJo(j, r02));
            } catch (IllegalStateException e) {
                this.reading = j2;
                throw e;
            }
        } else {
            long j3 = this.reading;
            long j4 = j3 + r0;
            if ((r0 ^ j3) >= 0 && (j3 ^ j4) < 0) {
                m1488overflowLRDsOJo(j);
            }
            this.reading = j4;
        }
    }

    public long read() {
        return this.reading;
    }
}
