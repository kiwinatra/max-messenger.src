package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: v55  reason: default package */
public final /* synthetic */ class v55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g65 b;
    public final /* synthetic */ long c;

    public /* synthetic */ v55(g65 g65, long j, int i) {
        this.a = i;
        this.b = g65;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g65 g65 = this.b;
                switch (tr1.y(g65.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.c;
                        n54.M(j);
                        g65.o.addLast(Range.create(Long.valueOf(j), Long.valueOf(LongCompanionObject.MAX_VALUE)));
                        g65.i(3);
                        return;
                    case 4:
                        g65.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g65.D)));
                }
            default:
                g65 g652 = this.b;
                long j2 = this.c;
                switch (tr1.y(g652.D)) {
                    case 0:
                        g652.w = null;
                        n54.M(j2);
                        try {
                            if (g652.z) {
                                g652.h();
                            }
                            g652.t = Range.create(Long.valueOf(j2), Long.valueOf(LongCompanionObject.MAX_VALUE));
                            g652.e.start();
                            n55 n55 = g652.f;
                            if (n55 instanceof c65) {
                                ((c65) n55).a(true);
                            }
                            g652.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            g652.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        g652.w = null;
                        Range range = (Range) g652.o.removeLast();
                        bs0.r("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == LongCompanionObject.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        g652.o.addLast(Range.create(l, Long.valueOf(j2)));
                        n54.M(j2);
                        n54.M(j2 - longValue);
                        if ((g652.c || on4.a.g(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!g652.c || on4.a.g(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            g652.e.setParameters(wj6.g(0, "drop-input-frames"));
                            n55 n552 = g652.f;
                            if (n552 instanceof c65) {
                                ((c65) n552).a(true);
                            }
                        }
                        if (g652.c) {
                            g652.g();
                        }
                        g652.i(2);
                        return;
                    case 3:
                    case 5:
                        g652.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g652.D)));
                }
        }
    }
}
