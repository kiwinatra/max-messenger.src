package androidx.media3.common;

public final class VideoFrameProcessingException extends Exception {
    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public static VideoFrameProcessingException a(Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new Exception(exc);
    }
}
