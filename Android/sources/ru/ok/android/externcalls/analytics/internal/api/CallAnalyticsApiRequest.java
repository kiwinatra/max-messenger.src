package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

public final class CallAnalyticsApiRequest implements am {
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final String appVersion;
    private final hs0 items;
    private final CallAnalyticsLogger logger;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, hs0 hs0, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
        this.items = hs0;
        this.logger = callAnalyticsLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$getOkParser$0(sp7 sp7) throws IOException, JsonParseException {
        CallAnalyticsLogger callAnalyticsLogger = this.logger;
        callAnalyticsLogger.d(LOG_TAG, "Send response: " + sp7.I());
        return null;
    }

    private void writeString(zp7 zp7, String str, String str2) throws IOException {
        writeString(zp7, str, str2, false);
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public /* bridge */ /* synthetic */ zl getConfigExtractor() {
        return zl.e;
    }

    public /* bridge */ /* synthetic */ op7 getFailParser() {
        return djd.c;
    }

    public op7 getOkParser() {
        return new d9d(16, this);
    }

    public int getPriority() {
        return 2;
    }

    public mm getScope() {
        return mm.c;
    }

    public /* bridge */ /* synthetic */ nm getScopeAfter() {
        return nm.a;
    }

    public Uri getUri() {
        return um.a(this.apiMethod);
    }

    public boolean shouldGzip() {
        return true;
    }

    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    public void writeParams(zp7 zp7) throws IOException, JsonSerializeException {
        zp7.h0("data");
        zp7.t();
        writeString(zp7, "platform", this.platform, true);
        writeString(zp7, "app_version", this.appVersion);
        writeString(zp7, "sdk_type", this.sdkType);
        writeString(zp7, "sdk_version", this.sdkVersion);
        zp7.h0(ClientCookie.VERSION_ATTR);
        ((v1) zp7).a(Integer.toString(this.version));
        zp7.h0("items");
        this.items.write(zp7);
        zp7.r();
    }

    public /* bridge */ /* synthetic */ void writeSupplyParams(zp7 zp7) throws IOException, JsonSerializeException {
    }

    private void writeString(zp7 zp7, String str, String str2, boolean z) throws IOException {
        if (str2 == null) {
            return;
        }
        if (!z || !str2.isEmpty()) {
            zp7.h0(str);
            zp7.i(str2);
        }
    }
}
