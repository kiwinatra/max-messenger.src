package ru.ok.android.externcalls.sdk.audio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J}\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/NoiseSuppressionManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "Lhz0;", "call", "<init>", "(Lhz0;)V", "", "serversideBasic", "serversideAnn", "clientsidePlatform", "clientsideAnn", "Lorg/webrtc/PeerConnectionFactory$EnhancerKind;", "enhancerKind", "", "filePath", "", "inputSampleRate", "outputSampleRate", "fallbackTimeLimitMillis", "fallbackStutterCountMillis", "fallbackTimeframeMillis", "logTimings", "Ljava/lang/Runnable;", "onNoiseSuppressorDisabledDueToStutter", "", "setNoiseSuppressorParams", "(ZZZZLorg/webrtc/PeerConnectionFactory$EnhancerKind;Ljava/lang/String;IIIIIZLjava/lang/Runnable;)V", "Lkotlin/Function1;", "Lz9a;", "Lbaa;", "paramFun", "setNoiseSuppressionParams", "(Lkotlin/jvm/functions/Function1;)V", "Lhz0;", "getNsActiveState", "()Lbaa;", "nsActiveState", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNoiseSuppressionManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoiseSuppressionManagerImpl.kt\nru/ok/android/externcalls/sdk/audio/internal/NoiseSuppressionManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class NoiseSuppressionManagerImpl implements NoiseSuppressionManager {
    private final hz0 call;

    public NoiseSuppressionManagerImpl(hz0 hz0) {
        this.call = hz0;
    }

    public baa getNsActiveState() {
        return this.call.b;
    }

    public void setNoiseSuppressionParams(Function1<? super z9a, baa> function1) {
        this.call.F(function1.invoke(new Object()));
    }

    public void setNoiseSuppressorParams(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable) {
        setNoiseSuppressionParams(new NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1(z, z2, z3, z4, enhancerKind, str, i, i2, i3, i4, i5, z5, runnable));
    }
}
