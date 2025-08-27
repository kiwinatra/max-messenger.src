package org.webrtc;

public class NoopSsrcControl implements DecoderSsrcControl {
    public void onDecoderInit(AndroidVideoDecoder androidVideoDecoder, long j) {
    }

    public void onDecoderRelease(AndroidVideoDecoder androidVideoDecoder, long j) {
    }

    public void onDecoderSsrcChanged(AndroidVideoDecoder androidVideoDecoder, long j, long j2) {
    }

    public boolean ssrcAllowedCodecInit(AndroidVideoDecoder androidVideoDecoder, long j) {
        return true;
    }

    public boolean ssrcAllowedDecode(AndroidVideoDecoder androidVideoDecoder, long j) {
        return true;
    }
}
