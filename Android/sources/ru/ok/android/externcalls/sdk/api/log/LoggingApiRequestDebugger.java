package ru.ok.android.externcalls.sdk.api.log;

import android.net.Uri;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger;", "Ljm;", "Lvoc;", "log", "<init>", "(Lvoc;)V", "Lhm;", "request", "", "getParams", "(Lhm;)Ljava/lang/String;", "jsonString", "eraseSecrets", "(Ljava/lang/String;)Ljava/lang/String;", "getRawParams", "Lxl;", "engine", "Lyl;", "config", "", "debugApiRequest", "(Lxl;Lhm;Lyl;)V", "Lsp7;", "reader", "debugApiResponseOk", "(Lxl;Lhm;Lsp7;)Lsp7;", "debugApiResponseFail", "Lru/ok/android/api/core/ApiException;", "exception", "debugApiException", "(Lxl;Lhm;Lru/ok/android/api/core/ApiException;)V", "Ljava/io/IOException;", "debugIoException", "(Lxl;Lhm;Ljava/io/IOException;)V", "Lvoc;", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "secretEraser", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class LoggingApiRequestDebugger implements jm {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ERASED_SECRET = "<ERASED_SECRET>";
    private static final String TAG = "CallsApiDebug";
    private final voc log;
    private final RequestSecretEraser secretEraser = new RequestSecretEraser(SetsKt.setOf(ApiProtocol.KEY_TOKEN, "auth_data", "credential", "auth_token", "session_data"), ERASED_SECRET);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger$Companion;", "", "()V", "ERASED_SECRET", "", "TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LoggingApiRequestDebugger(voc voc) {
        this.log = voc;
    }

    private final String eraseSecrets(String str) {
        try {
            return this.secretEraser.eraseSecrets(str);
        } catch (JSONException e) {
            this.log.logException(TAG, "can't erase secrets from json", e);
            return ERASED_SECRET;
        }
    }

    private final String getParams(hm hmVar) {
        return eraseSecrets(getRawParams(hmVar));
    }

    private final String getRawParams(hm hmVar) {
        StringWriter stringWriter = new StringWriter();
        vnb vnb = new vnb(stringWriter);
        try {
            vnb.t();
            hmVar.writeParams(vnb);
            vnb.r();
            vnb.flush();
        } catch (Exception unused) {
            this.log.log(TAG, "failed to log request params");
        }
        return stringWriter.toString();
    }

    public void debugApiException(xl xlVar, hm hmVar, ApiException apiException) throws IOException {
        voc voc = this.log;
        Uri uri = hmVar.getUri();
        voc.logException(TAG, "API request " + uri + " failed with API Exception", apiException);
    }

    public void debugApiRequest(xl xlVar, hm hmVar, yl ylVar) throws IOException {
        voc voc = this.log;
        Uri uri = hmVar.getUri();
        String params = getParams(hmVar);
        voc.log(TAG, "API request " + uri + " start with params " + params);
    }

    public sp7 debugApiResponseFail(xl xlVar, hm hmVar, sp7 sp7) throws IOException {
        String W = sp7.W();
        String eraseSecrets = eraseSecrets(W);
        voc voc = this.log;
        Uri uri = hmVar.getUri();
        voc.log(TAG, "API request " + uri + " failed with response " + eraseSecrets);
        return tp7.b(W);
    }

    public sp7 debugApiResponseOk(xl xlVar, hm hmVar, sp7 sp7) throws IOException {
        String W = sp7.W();
        String eraseSecrets = eraseSecrets(W);
        voc voc = this.log;
        Uri uri = hmVar.getUri();
        voc.log(TAG, "API request " + uri + " success with response " + eraseSecrets);
        return tp7.b(W);
    }

    public void debugIoException(xl xlVar, hm hmVar, IOException iOException) throws IOException {
        voc voc = this.log;
        Uri uri = hmVar.getUri();
        voc.logException(TAG, "API request " + uri + " failed with IO Exception", iOException);
    }
}
