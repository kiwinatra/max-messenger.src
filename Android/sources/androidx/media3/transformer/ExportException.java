package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

public final class ExportException extends Exception {
    public static final j0d b;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v0, types: [cs, cb7] */
    static {
        ? csVar = new cs(4);
        csVar.G("ERROR_CODE_FAILED_RUNTIME_CHECK", Integer.valueOf(MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
        csVar.G("ERROR_CODE_IO_UNSPECIFIED", 2000);
        csVar.G("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        csVar.G("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        csVar.G("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        csVar.G("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        csVar.G("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        csVar.G("ERROR_CODE_IO_NO_PERMISSION", 2006);
        csVar.G("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        csVar.G("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        csVar.G("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        csVar.G("ERROR_CODE_DECODING_FAILED", 3002);
        csVar.G("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        csVar.G("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        csVar.G("ERROR_CODE_ENCODING_FAILED", 4002);
        csVar.G("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        csVar.G("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        csVar.G("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        csVar.G("ERROR_CODE_MUXING_FAILED", 7001);
        csVar.G("ERROR_CODE_MUXING_TIMEOUT", 7002);
        csVar.G("ERROR_CODE_MUXING_APPEND", 7003);
        b = csVar.h();
    }

    public ExportException(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
    }

    public static ExportException a(Throwable th, int i) {
        return new ExportException("Asset loader error", th, i);
    }

    public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder p = tr1.p("Audio error: ", str, ", audioFormat=");
        p.append(audioProcessor$UnhandledAudioFormatException.a);
        return new ExportException(p.toString(), audioProcessor$UnhandledAudioFormatException, 6001);
    }

    public static ExportException c(Throwable th, int i, ci3 ci3) {
        return new ExportException("Codec exception: " + ci3, th, i);
    }

    public static ExportException d(Exception exc, int i) {
        return new ExportException("Muxer error", exc, i);
    }

    public static ExportException e(Exception exc) {
        return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, MultiFileUploader.MSG_TRY_UPLOAD_NEXT) : new ExportException("Unexpected error", exc, 1000);
    }
}
