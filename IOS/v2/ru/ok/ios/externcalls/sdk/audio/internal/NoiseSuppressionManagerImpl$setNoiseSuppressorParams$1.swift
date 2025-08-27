package ru.ok.android.externcalls.sdk.audio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.webrtc.PeerConnectionFactory;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz9a;", "builder", "Lbaa;", "invoke", "(Lz9a;)Lbaa;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1 extends Lambda implements Function1<z9a, baa> {
    final /* synthetic */ boolean $clientsideAnn;
    final /* synthetic */ boolean $clientsidePlatform;
    final /* synthetic */ PeerConnectionFactory.EnhancerKind $enhancerKind;
    final /* synthetic */ int $fallbackStutterCountMillis;
    final /* synthetic */ int $fallbackTimeLimitMillis;
    final /* synthetic */ int $fallbackTimeframeMillis;
    final /* synthetic */ String $filePath;
    final /* synthetic */ int $inputSampleRate;
    final /* synthetic */ boolean $logTimings;
    final /* synthetic */ Runnable $onNoiseSuppressorDisabledDueToStutter;
    final /* synthetic */ int $outputSampleRate;
    final /* synthetic */ boolean $serversideAnn;
    final /* synthetic */ boolean $serversideBasic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable) {
        super(1);
        this.$serversideBasic = z;
        this.$serversideAnn = z2;
        this.$clientsidePlatform = z3;
        this.$clientsideAnn = z4;
        this.$enhancerKind = enhancerKind;
        this.$filePath = str;
        this.$inputSampleRate = i;
        this.$outputSampleRate = i2;
        this.$fallbackTimeLimitMillis = i3;
        this.$fallbackStutterCountMillis = i4;
        this.$fallbackTimeframeMillis = i5;
        this.$logTimings = z5;
        this.$onNoiseSuppressorDisabledDueToStutter = runnable;
    }

    public final baa invoke(z9a z9a) {
        int i;
        aaa aaa;
        boolean z;
        z9a z9a2 = z9a;
        z9a2.a = this.$serversideBasic;
        z9a2.b = this.$serversideAnn;
        z9a2.c = this.$clientsidePlatform;
        z9a2.d = this.$clientsideAnn;
        PeerConnectionFactory.EnhancerKind enhancerKind = this.$enhancerKind;
        z9a2.f = enhancerKind;
        if (enhancerKind == null) {
            i = -1;
        } else {
            i = y9a.$EnumSwitchMapping$1[enhancerKind.ordinal()];
        }
        si0 si0 = null;
        if (i == 1) {
            aaa = aaa.a;
        } else if (i == 2) {
            aaa = aaa.c;
        } else if (i != 3) {
            aaa = null;
        } else {
            aaa = aaa.b;
        }
        z9a2.e = aaa;
        z9a2.g = this.$filePath;
        z9a2.h = this.$inputSampleRate;
        z9a2.i = this.$outputSampleRate;
        z9a2.j = this.$fallbackTimeLimitMillis;
        z9a2.k = this.$fallbackStutterCountMillis;
        z9a2.l = this.$fallbackTimeframeMillis;
        z9a2.m = this.$logTimings;
        Runnable runnable = this.$onNoiseSuppressorDisabledDueToStutter;
        if (runnable != null) {
            z9a2.n = new rh9(20, (Object) runnable);
        }
        boolean z2 = z9a2.a;
        boolean z3 = z9a2.b;
        boolean z4 = z9a2.c;
        boolean z5 = z9a2.d;
        PeerConnectionFactory.EnhancerKind enhancerKind2 = z9a2.f;
        String str = z9a2.g;
        int i2 = z9a2.h;
        int i3 = z9a2.i;
        int i4 = z9a2.j;
        int i5 = z9a2.k;
        int i6 = z9a2.l;
        boolean z6 = z9a2.m;
        rh9 rh9 = z9a2.n;
        if (rh9 != null) {
            z = z6;
            si0 = new si0(6, rh9);
        } else {
            z = z6;
        }
        return new baa(z2, z3, z4, z5, enhancerKind2, str, i2, i3, i4, i5, i6, z, si0, z9a2.e);
    }
}
