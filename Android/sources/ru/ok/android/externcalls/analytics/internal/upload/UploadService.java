package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;

public class UploadService extends ybd {
    public static final String ACTION_UPLOAD = "ru.ok.android.onelog.action.UPLOAD";
    private static final String LOG_TAG = "UploadService";
    public static final String SCHEME = "calls-sdk-analytics";

    private void onHandleUpload(String str) {
        try {
            UploadStarter.INSTANCE.upload(str);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public static void startUpload(String str) {
        Application application = ApplicationProvider.a;
        Application w = kv0.w();
        Class<UploadService> cls = UploadService.class;
        an7.enqueueWork((Context) w, (Class<?>) cls, CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadJobId(), new Intent().setAction(ACTION_UPLOAD).setData(Uri.fromParts(SCHEME, str, (String) null)).setClass(w, cls));
    }

    public void onHandleWork(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            Uri data = intent.getData();
            if (action.equals(ACTION_UPLOAD) && data != null) {
                onHandleUpload(data.getSchemeSpecificPart());
            }
        }
    }
}
