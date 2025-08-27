package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

public class GetAnonymTokenByLinkRequest extends e0 implements am {
    private static final op7 PARSER = new ip5(26);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.a == 457;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(sp7 sp7) throws IOException, JsonParseException {
        sp7.t();
        String str = null;
        String str2 = null;
        while (sp7.hasNext()) {
            String name2 = sp7.name();
            name2.getClass();
            if (name2.equals("uid")) {
                str = sp7.I();
            } else if (!name2.equals(ApiProtocol.KEY_TOKEN)) {
                sp7.A();
            } else {
                str2 = sp7.I();
            }
        }
        sp7.r();
        return new Response(str, str2);
    }

    public /* bridge */ /* synthetic */ zl getConfigExtractor() {
        return zl.e;
    }

    public /* bridge */ /* synthetic */ op7 getFailParser() {
        return djd.c;
    }

    public op7 getOkParser() {
        return PARSER;
    }

    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    public /* bridge */ /* synthetic */ mm getScope() {
        return mm.o;
    }

    public /* bridge */ /* synthetic */ nm getScopeAfter() {
        return nm.a;
    }

    public Uri getUri() {
        return um.a("vchat.getAnonymTokenByLink");
    }

    public void populateParams(gm gmVar) {
        gmVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        gmVar.b("anonymName", this.name);
    }

    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, (String) null);
    }
}
