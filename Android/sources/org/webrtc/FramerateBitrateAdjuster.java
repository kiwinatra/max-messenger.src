package org.webrtc;

class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    public void setTargets(int i, double d) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) (((double) (i * DEFAULT_FRAMERATE_FPS)) / d);
    }
}
