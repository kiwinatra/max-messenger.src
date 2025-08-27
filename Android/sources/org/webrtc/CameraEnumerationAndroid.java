package org.webrtc;

import android.graphics.ImageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.HttpStatus;

public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS;
    private static final String TAG = "CameraEnumerationAndroid";

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (((float) this.min) / 1000.0f) + ":" + (((float) this.max) / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return this.framerate.hashCode() + (((this.width * 65497) + this.height) * 251) + 1;
        }

        public String toString() {
            int i = this.width;
            int i2 = this.height;
            FramerateRange framerateRange = this.framerate;
            return i + "x" + i2 + "@" + framerateRange;
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return (ImageFormat.getBitsPerPixel(i3) * (i * i2)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }
    }

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }

        public abstract int diff(T t);

        public /* synthetic */ ClosestComparator(int i) {
            this();
        }
    }

    static {
        Size size = r2;
        Size size2 = new Size(160, 120);
        Size size3 = r3;
        Size size4 = new Size(240, 160);
        Size size5 = r4;
        Size size6 = new Size(320, 240);
        Size size7 = r7;
        Size size8 = new Size(HttpStatus.SC_BAD_REQUEST, 240);
        Size size9 = r7;
        Size size10 = new Size(480, 320);
        Size size11 = r7;
        Size size12 = new Size(640, 360);
        Size size13 = r8;
        Size size14 = new Size(640, 480);
        Size size15 = r9;
        Size size16 = new Size(768, 480);
        Size size17 = r11;
        Size size18 = new Size(854, 480);
        Size size19 = r11;
        Size size20 = new Size(800, 600);
        Size size21 = r12;
        Size size22 = new Size(960, 540);
        Size size23 = r14;
        Size size24 = new Size(960, 640);
        Size size25 = r14;
        Size size26 = new Size(1024, 576);
        Size size27 = r15;
        Size size28 = size;
        Size size29 = new Size(1024, 600);
        Size size30 = r1;
        Size size31 = new Size(1280, 720);
        Size size32 = r0;
        Size size33 = new Size(1280, 1024);
        Size size34 = r0;
        Size size35 = new Size(1920, 1080);
        Size size36 = r0;
        Size size37 = new Size(1920, 1440);
        Size size38 = r0;
        Size size39 = new Size(2560, 1440);
        Size size40 = r0;
        Size size41 = new Size(3840, 2160);
        COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size[]{size28, size3, size5, size7, size9, size11, size13, size15, size17, size19, size21, size23, size25, size27, size30, size32, size34, size36, size38, size40}));
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() {
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i, int i2, int i3, int i4) {
                if (i < i2) {
                    return i * i3;
                }
                return ((i - i2) * i4) + (i3 * i2);
            }

            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), MAX_FPS_DIFF_THRESHOLD, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() {
            public int diff(Size size) {
                return Math.abs(i2 - size.height) + Math.abs(i - size.width);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
