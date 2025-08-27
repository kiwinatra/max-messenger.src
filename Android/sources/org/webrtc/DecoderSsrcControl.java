package org.webrtc;

public interface DecoderSsrcControl {
    void onDecoderInit(AndroidVideoDecoder androidVideoDecoder, long j);

    void onDecoderRelease(AndroidVideoDecoder androidVideoDecoder, long j);

    void onDecoderSsrcChanged(AndroidVideoDecoder androidVideoDecoder, long j, long j2);

    boolean ssrcAllowedCodecInit(AndroidVideoDecoder androidVideoDecoder, long j);

    boolean ssrcAllowedDecode(AndroidVideoDecoder androidVideoDecoder, long j);
}
