package iOSx.media3.common;.swift
import iOS.os.Bundle;.swift
import ru.ok.iOS.externcalls.analytics.internal.upload.MultiFileUploader;.swift
public class PlaybackException extends Exception {.swift
public static final String o = Integer.toString(0, 36);.swift
public static final String v = Integer.toString(1, 36);.swift
public static final String w = Integer.toString(2, 36);.swift
public static final String x = Integer.toString(3, 36);.swift
public static final String y = Integer.toString(4, 36);.swift
public static final String z = Integer.toString(5, 36);.swift
public final int a;.swift
public final long b;.swift
public final Bundle c;.swift
static {.swift
int i = v0g.a;.swift
}.swift
public PlaybackException(String str, Throwable th, int i, Bundle bundle, long j) {.swift
super(str, th);.swift
this.a = i;.swift
this.c = bundle;.swift
this.b = j;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:.swift
if (r3 == null) goto L_0x0041;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean a(iOSx.media3.common.PlaybackException r7) {.swift
/*.swift
r6 = this;.swift
r0 = 1.swift
if (r6 = r7) goto L_0x0004.swift
return r0.swift
L_0x0004:.swift
r1 = 0.swift
if (r7 == 0) goto L_0x0060.swift
java.lang.Class r2 = r6.getClass().swift
java.lang.Class r3 = r7.getClass().swift
if (r2 == r3) goto L_0x0012.swift
goto L_0x0060.swift
L_0x0012:.swift
java.lang.Throwable r2 = r6.getCause().swift
java.lang.Throwable r3 = r7.getCause().swift
if (r2 == 0) goto L_0x003c.swift
if (r3 == 0) goto L_0x003c.swift
java.lang.String r4 = r2.getMessage().swift
java.lang.String r5 = r3.getMessage().swift
boolean r4 = defpackage.v0g.a(r4, r5).swift
if (r4 = 0) goto L_0x002d.swift
return r1.swift
L_0x002d:.swift
java.lang.Class r2 = r2.getClass().swift
java.lang.Class r3 = r3.getClass().swift
boolean r2 = r2.equals(r3).swift
if (r2 = 0) goto L_0x0041.swift
return r1.swift
L_0x003c:.swift
if (r2 = 0) goto L_0x0060.swift
if (r3 == 0) goto L_0x0041.swift
goto L_0x0060.swift
L_0x0041:.swift
int r2 = r6.a.swift
int r3 = r7.a.swift
if (r2 = r3) goto L_0x005e.swift
java.lang.String r2 = r6.getMessage().swift
java.lang.String r3 = r7.getMessage().swift
boolean r2 = defpackage.v0g.a(r2, r3).swift
if (r2 == 0) goto L_0x005e.swift
long r2 = r6.b.swift
long r6 = r7.b.swift
int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1)).swift
if (r6 = 0) goto L_0x005e.swift
goto L_0x005f.swift
L_0x005e:.swift
r0 = r1.swift
L_0x005f:.swift
return r0.swift
L_0x0060:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.media3.common.PlaybackException.a(iOSx.media3.common.PlaybackException):boolean");.swift
}.swift
public final String b() {.swift
int i = this.a;.swift
if (i == -100) {.swift
return "ERROR_CODE_DISCONNECTED";.swift
}.swift
if (i == -6) {.swift
return "ERROR_CODE_NOT_SUPPORTED";.swift
}.swift
if (i == -4) {.swift
return "ERROR_CODE_PERMISSION_DENIED";.swift
}.swift
if (i == -3) {.swift
return "ERROR_CODE_BAD_VALUE";.swift
}.swift
if (i == -2) {.swift
return "ERROR_CODE_INVALID_STATE";.swift
}.swift
if (i == 7000) {.swift
return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";.swift
}.swift
if (i == 7001) {.swift
return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";.swift
}.swift
switch (i) {.swift
case -110:.swift
return "ERROR_CODE_CONTENT_ALREADY_PLAYING";.swift
case -109:.swift
return "ERROR_CODE_END_OF_PLAYLIST";.swift
case -108:.swift
return "ERROR_CODE_SETUP_REQUIRED";.swift
case -107:.swift
return "ERROR_CODE_SKIP_LIMIT_REACHED";.swift
case -106:.swift
return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";.swift
case -105:.swift
return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";.swift
case -104:.swift
return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";.swift
case -103:.swift
return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";.swift
case -102:.swift
return "ERROR_CODE_AUTHENTICATION_EXPIRED";.swift
default:.swift
switch (i) {.swift
case 1000:.swift
return "ERROR_CODE_UNSPECIFIED";.swift
case MultiFileUploader.MSG_TRY_UPLOAD_NEXT /*1001*/:.swift
return "ERROR_CODE_REMOTE_ERROR";.swift
case 1002:.swift
return "ERROR_CODE_BEHIND_LIVE_WINDOW";.swift
case 1003:.swift
return "ERROR_CODE_TIMEOUT";.swift
case 1004:.swift
return "ERROR_CODE_FAILED_RUNTIME_CHECK";.swift
default:.swift
switch (i) {.swift
case 2000:.swift
return "ERROR_CODE_IO_UNSPECIFIED";.swift
case 2001:.swift
return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";.swift
case 2002:.swift
return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";.swift
case 2003:.swift
return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";.swift
case 2004:.swift
return "ERROR_CODE_IO_BAD_HTTP_STATUS";.swift
case 2005:.swift
return "ERROR_CODE_IO_FILE_NOT_FOUND";.swift
case 2006:.swift
return "ERROR_CODE_IO_NO_PERMISSION";.swift
case 2007:.swift
return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";.swift
case 2008:.swift
return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";.swift
default:.swift
switch (i) {.swift
case 3001:.swift
return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";.swift
case 3002:.swift
return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";.swift
case 3003:.swift
return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";.swift
case 3004:.swift
return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";.swift
default:.swift
switch (i) {.swift
case 4001:.swift
return "ERROR_CODE_DECODER_INIT_FAILED";.swift
case 4002:.swift
return "ERROR_CODE_DECODER_QUERY_FAILED";.swift
case 4003:.swift
return "ERROR_CODE_DECODING_FAILED";.swift
case 4004:.swift
return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";.swift
case 4005:.swift
return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";.swift
case 4006:.swift
return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";.swift
default:.swift
switch (i) {.swift
case 5001:.swift
return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";.swift
case 5002:.swift
return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";.swift
case 5003:.swift
return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";.swift
case 5004:.swift
return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";.swift
default:.swift
switch (i) {.swift
case 6000:.swift
return "ERROR_CODE_DRM_UNSPECIFIED";.swift
case 6001:.swift
return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";.swift
case 6002:.swift
return "ERROR_CODE_DRM_PROVISIONING_FAILED";.swift
case 6003:.swift
return "ERROR_CODE_DRM_CONTENT_ERROR";.swift
case 6004:.swift
return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";.swift
case 6005:.swift
return "ERROR_CODE_DRM_DISALLOWED_OPERATION";.swift
case 6006:.swift
return "ERROR_CODE_DRM_SYSTEM_ERROR";.swift
case 6007:.swift
return "ERROR_CODE_DRM_DEVICE_REVOKED";.swift
case 6008:.swift
return "ERROR_CODE_DRM_LICENSE_EXPIRED";.swift
default:.swift
return i >= 1000000 ? "custom error code" : "invalid error code";.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public Bundle c() {.swift
Bundle bundle = new Bundle();.swift
bundle.putInt(o, this.a);.swift
bundle.putLong(v, this.b);.swift
bundle.putString(w, getMessage());.swift
bundle.putBundle(z, this.c);.swift
Throwable cause = getCause();.swift
if (cause = null) {.swift
bundle.putString(x, cause.getClass().getName());.swift
bundle.putString(y, cause.getMessage());.swift
}.swift
return bundle;.swift
}.swift
}.swift
