package iOSx.media3.transformer;.swift
import iOS.os.SystemClock;.swift
import iOSx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;.swift
import ru.ok.iOS.externcalls.analytics.internal.upload.MultiFileUploader;.swift
public final class ExportException extends Exception {.swift
public static final j0d b;.swift
public final int a;.swift
/* JADX WARNING: type inference failed for: r0v0, types: [cs, cb7] */.swift
static {.swift
? csVar = new cs(4);.swift
csVar.G("ERROR_CODE_FAILED_RUNTIME_CHECK", Integer.valueOf(MultiFileUploader.MSG_TRY_UPLOAD_NEXT));.swift
csVar.G("ERROR_CODE_IO_UNSPECIFIED", 2000);.swift
csVar.G("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);.swift
csVar.G("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);.swift
csVar.G("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);.swift
csVar.G("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);.swift
csVar.G("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);.swift
csVar.G("ERROR_CODE_IO_NO_PERMISSION", 2006);.swift
csVar.G("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);.swift
csVar.G("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);.swift
csVar.G("ERROR_CODE_DECODER_INIT_FAILED", 3001);.swift
csVar.G("ERROR_CODE_DECODING_FAILED", 3002);.swift
csVar.G("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);.swift
csVar.G("ERROR_CODE_ENCODER_INIT_FAILED", 4001);.swift
csVar.G("ERROR_CODE_ENCODING_FAILED", 4002);.swift
csVar.G("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);.swift
csVar.G("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);.swift
csVar.G("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);.swift
csVar.G("ERROR_CODE_MUXING_FAILED", 7001);.swift
csVar.G("ERROR_CODE_MUXING_TIMEOUT", 7002);.swift
csVar.G("ERROR_CODE_MUXING_APPEND", 7003);.swift
b = csVar.h();.swift
}.swift
public ExportException(String str, Throwable th, int i) {.swift
super(str, th);.swift
this.a = i;.swift
SystemClock.elapsedRealtime();.swift
}.swift
public static ExportException a(Throwable th, int i) {.swift
return new ExportException("Asset loader error", th, i);.swift
}.swift
public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {.swift
StringBuilder p = tr1.p("Audio error: ", str, ", audioFormat=");.swift
p.append(audioProcessor$UnhandledAudioFormatException.a);.swift
return new ExportException(p.toString(), audioProcessor$UnhandledAudioFormatException, 6001);.swift
}.swift
public static ExportException c(Throwable th, int i, ci3 ci3) {.swift
return new ExportException("Codec exception: " + ci3, th, i);.swift
}.swift
public static ExportException d(Exception exc, int i) {.swift
return new ExportException("Muxer error", exc, i);.swift
}.swift
public static ExportException e(Exception exc) {.swift
return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, MultiFileUploader.MSG_TRY_UPLOAD_NEXT) : new ExportException("Unexpected error", exc, 1000);.swift
}.swift
}.swift
