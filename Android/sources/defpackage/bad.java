package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;

/* renamed from: bad  reason: default package */
public final class bad implements CameraVideoCapturer.CameraEventsHandler {
    public final voc a;

    public /* synthetic */ bad(voc voc) {
        this.a = voc;
    }

    public void a(RtpSender rtpSender, String str) {
        fbb.A().b();
        this.a.log("RtpSenderHelper", "set audio bitrate range to 6000-48000, priority=1.0");
        b(rtpSender, str, 6000, 48000, Double.valueOf(1.0d), true);
    }

    public void b(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            c(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            this.a.reportException("RtpSenderHelper", "Failed to set bitrate of ".concat(str), th);
        }
    }

    public void c(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        voc voc = this.a;
        if (rtpSender == null) {
            voc.log("RtpSenderHelper", str.concat(": no sender"));
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            voc.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        boolean z2 = false;
        for (RtpParameters.Encoding next : parameters.encodings) {
            Integer num = next.maxBitrateBps;
            if (num == null || num.intValue() != i2) {
                next.maxBitrateBps = Integer.valueOf(i2);
                z2 = true;
            }
            Integer num2 = next.minBitrateBps;
            if (num2 == null || num2.intValue() != i) {
                next.minBitrateBps = Integer.valueOf(i);
                z2 = true;
            }
            if (d != null && !Intrinsics.areEqual(next.bitratePriority, d)) {
                next.bitratePriority = d.doubleValue();
                z2 = true;
            }
            if (next.adaptiveAudioPacketTime != z) {
                next.adaptiveAudioPacketTime = z;
                z2 = true;
            }
        }
        if (!z2) {
            voc.log("RtpSenderHelper", str + " encodings update not needed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
        } else if (rtpSender.setParameters(parameters)) {
            voc.log("RtpSenderHelper", str + " encodings update done. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
        } else {
            voc.log("RtpSenderHelper", str + " encodings update failed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
        }
    }

    public void d(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        if (rtpSender != null) {
            RtpParameters parameters = rtpSender.getParameters();
            boolean isEmpty = parameters.encodings.isEmpty();
            voc voc = this.a;
            if (isEmpty) {
                voc.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
                return;
            }
            for (RtpParameters.Encoding next : parameters.encodings) {
                if (!Intrinsics.areEqual((Object) next.maxBitrateBps, (Object) num)) {
                    next.maxBitrateBps = num;
                    z = true;
                }
                if (!Intrinsics.areEqual((Object) next.numTemporalLayers, (Object) num2)) {
                    next.numTemporalLayers = num2;
                    z = true;
                }
                if (!Intrinsics.areEqual((Object) next.maxFramerate, (Object) num3)) {
                    next.maxFramerate = num3;
                    z = true;
                }
            }
            if (parameters.degradationPreference != degradationPreference) {
                parameters.degradationPreference = degradationPreference;
                z = true;
            }
            if (!z) {
                voc.log("RtpSenderHelper", "No " + str + " change detected. Ignore update");
            } else if (!rtpSender.setParameters(parameters)) {
                voc.log("RtpSenderHelper", "Failed to set sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            } else {
                voc.log("RtpSenderHelper", "Sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r4 = (org.webrtc.RtpParameters.Encoding) kotlin.collections.CollectionsKt.firstOrNull((r4 = r4.encodings));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int e(org.webrtc.RtpSender r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            goto L_0x0023
        L_0x0004:
            org.webrtc.RtpParameters r4 = r4.getParameters()     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.util.List<org.webrtc.RtpParameters$Encoding> r4 = r4.encodings     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)     // Catch:{ all -> 0x0019 }
            org.webrtc.RtpParameters$Encoding r4 = (org.webrtc.RtpParameters.Encoding) r4     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.lang.Integer r4 = r4.maxBitrateBps     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0024
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r0 = r4.intValue()     // Catch:{ all -> 0x0019 }
        L_0x0023:
            return r0
        L_0x0024:
            java.lang.String r1 = "RtpSenderHelper"
            java.lang.String r2 = "Unable to get sender max bitrate"
            voc r3 = r3.a
            r3.reportException(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.e(org.webrtc.RtpSender):int");
    }

    public void onCameraClosed() {
    }

    public void onCameraDisconnected() {
    }

    public void onCameraError(String str) {
        this.a.reportException("OKRTCSvcFactory", a81.m("onCameraError(): ", str), new RuntimeException(a81.m("Camera error: ", str)));
    }

    public void onCameraFreezed(String str) {
        this.a.log("OKRTCSvcFactory", "onCameraFreezed(): " + str);
    }

    public void onCameraOpening(String str) {
    }

    public void onFirstFrameAvailable() {
    }
}
