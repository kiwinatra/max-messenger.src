package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.x2;
import com.my.tracker.obfuscated.y2;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class PersonalizeApiClient {
    private final a a;

    public static final class Builder {
        private List a;
        private Context b;

        public PersonalizeApiClient build() {
            y2 y2Var = MyTracker.a.a;
            String g = y2Var.g();
            String str = null;
            if (TextUtils.isEmpty(g)) {
                x2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.b;
            if (context != null) {
                str = MyTracker.getInstanceId(context);
            }
            List list = this.a;
            return new PersonalizeApiClient(new a(g, (list == null || str == null || !list.contains(str)) ? y2Var.l() : y2Var.k()));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.a = list;
            this.b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    public PersonalizeApiClient(a aVar) {
        this.a = aVar;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(PersonalizeRequest<T> personalizeRequest, Handler handler, OnCompleteListener<T> onCompleteListener) {
        m.b(new po1(this, a(personalizeRequest, this.a), (PersonalizeRequest) personalizeRequest, handler, (OnCompleteListener) onCompleteListener));
    }

    private String a(PersonalizeRequest personalizeRequest, a aVar) {
        String q = rae.q(new StringBuilder(), aVar.b, "/api/v1/recommendation", personalizeRequest.a());
        Map b = personalizeRequest.b();
        b.remove("sdk_key");
        if (b.isEmpty()) {
            return q;
        }
        Uri.Builder buildUpon = Uri.parse(q).buildUpon();
        for (Map.Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            for (String appendQueryParameter : (List) entry.getValue()) {
                buildUpon.appendQueryParameter(str, appendQueryParameter);
            }
        }
        buildUpon.appendQueryParameter("sdk_key", aVar.a);
        return buildUpon.toString();
    }

    private void a(PersonalizeRequest personalizeRequest, s0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        String str;
        String str2;
        if (bVar == null) {
            x2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String str3 = (String) bVar.b();
            if (TextUtils.isEmpty(str3)) {
                x2.a("PersonalizeApiClient: HTTP response is empty");
                str = null;
                str2 = "HTTP response is empty";
            } else {
                try {
                    c a2 = personalizeRequest.c().a(new JSONObject(str3));
                    String a3 = a2.a();
                    if (a3 != null) {
                        a(personalizeRequest, (Object) null, (String) null, handler, a3, onCompleteListener);
                        return;
                    }
                    a(personalizeRequest, a2.b(), str3, handler, (String) null, onCompleteListener);
                    return;
                } catch (Throwable th) {
                    String str4 = "Can't parse JSON with error: " + th.getMessage();
                    x2.a("PersonalizeApiClient: " + str4);
                    a(personalizeRequest, (Object) null, (String) null, handler, str4, onCompleteListener);
                    return;
                }
            }
        }
        a(personalizeRequest, (Object) null, str, handler, str2, onCompleteListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse((Object) null, str, (String) null));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, s0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    private void a(PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, String str2, OnCompleteListener onCompleteListener) {
        jh3 jh3;
        if (handler == null) {
            handler = m.a;
        }
        if (!TextUtils.isEmpty(str2)) {
            x2.b("PersonalizeApiClient: " + str2);
            jh3 = new jh3(14, this, onCompleteListener, personalizeRequest, str2);
        } else {
            jh3 = new jh3(15, this, onCompleteListener, personalizeRequest, new PersonalizeResponse(obj, (String) null, str));
        }
        handler.post(jh3);
    }
}
