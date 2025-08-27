package org.webrtc;

public interface VideoEncoderObserver {

    public static class EncoderInfo {
        private final String encoderType;
        private final String implementationName;
        private final boolean isHardwareAccelerated;
        private final boolean isSuspended;

        @CalledByNative("EncoderInfo")
        public EncoderInfo(String str, String str2, boolean z, boolean z2) {
            this.encoderType = str;
            this.implementationName = str2;
            this.isHardwareAccelerated = z;
            this.isSuspended = z2;
        }

        public String getEncoderType() {
            return this.encoderType;
        }

        public String getImplementationName() {
            return this.implementationName;
        }

        public boolean isHardwareAccelerated() {
            return this.isHardwareAccelerated;
        }

        public boolean isSuspended() {
            return this.isSuspended;
        }
    }

    @CalledByNative
    void onEncoderChanged(EncoderInfo encoderInfo);

    @CalledByNative
    void release();
}
