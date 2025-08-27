package org.webrtc;

public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver = new CapturerObserver() {
        public void onCapturerStarted(boolean z) {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(z);
            synchronized (VideoSource.this.videoProcessorLock) {
                try {
                    VideoSource.this.isCapturerRunning = z;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStarted(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onCapturerStopped() {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
            synchronized (VideoSource.this.videoProcessorLock) {
                try {
                    VideoSource.this.isCapturerRunning = false;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            r4 = org.webrtc.VideoProcessor.applyFrameAdaptationParameters(r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (r4 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            org.webrtc.VideoSource.d(r3.this$0).onFrameCaptured(r4);
            r4.release();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onFrameCaptured(org.webrtc.VideoFrame r4) {
            /*
                r3 = this;
                org.webrtc.VideoSource r0 = org.webrtc.VideoSource.this
                org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
                org.webrtc.VideoProcessor$FrameAdaptationParameters r0 = r0.adaptFrame(r4)
                org.webrtc.VideoSource r1 = org.webrtc.VideoSource.this
                java.lang.Object r1 = r1.videoProcessorLock
                monitor-enter(r1)
                org.webrtc.VideoSource r2 = org.webrtc.VideoSource.this     // Catch:{ all -> 0x0024 }
                org.webrtc.VideoProcessor r2 = r2.videoProcessor     // Catch:{ all -> 0x0024 }
                if (r2 == 0) goto L_0x0026
                org.webrtc.VideoSource r3 = org.webrtc.VideoSource.this     // Catch:{ all -> 0x0024 }
                org.webrtc.VideoProcessor r3 = r3.videoProcessor     // Catch:{ all -> 0x0024 }
                r3.onFrameCaptured(r4, r0)     // Catch:{ all -> 0x0024 }
                monitor-exit(r1)     // Catch:{ all -> 0x0024 }
                return
            L_0x0024:
                r3 = move-exception
                goto L_0x003a
            L_0x0026:
                monitor-exit(r1)     // Catch:{ all -> 0x0024 }
                org.webrtc.VideoFrame r4 = org.webrtc.VideoProcessor.applyFrameAdaptationParameters(r4, r0)
                if (r4 == 0) goto L_0x0039
                org.webrtc.VideoSource r3 = org.webrtc.VideoSource.this
                org.webrtc.NativeAndroidVideoTrackSource r3 = r3.nativeAndroidVideoTrackSource
                r3.onFrameCaptured(r4)
                r4.release()
            L_0x0039:
                return
            L_0x003a:
                monitor-exit(r1)     // Catch:{ all -> 0x0024 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoSource.AnonymousClass1.onFrameCaptured(org.webrtc.VideoFrame):void");
        }
    };
    /* access modifiers changed from: private */
    public boolean isCapturerRunning;
    /* access modifiers changed from: private */
    public final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    /* access modifiers changed from: private */
    public VideoProcessor videoProcessor;
    /* access modifiers changed from: private */
    public final Object videoProcessorLock = new Object();

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public VideoSource(long j) {
        super(j);
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new l8g(1, this, videoFrame));
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        adaptOutputFormat(max, min, min, max, i3);
    }

    public void dispose() {
        setVideoProcessor((VideoProcessor) null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor2) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor3 = this.videoProcessor;
                if (videoProcessor3 != null) {
                    videoProcessor3.setSink((VideoSink) null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor2;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(new w8g(this));
                    if (this.isCapturerRunning) {
                        videoProcessor2.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5) {
        AspectRatio aspectRatio = new AspectRatio(i, i2);
        Integer valueOf = Integer.valueOf(i * i2);
        adaptOutputFormat(aspectRatio, valueOf, new AspectRatio(i3, i4), Integer.valueOf(i3 * i4), Integer.valueOf(i5));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
