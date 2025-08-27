package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: hm8  reason: default package */
public final class hm8 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm8(yx8 yx8, Looper looper) {
        super(looper);
        this.c = yx8;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference != null) {
                    Messenger messenger = (Messenger) weakReference.get();
                    jm8 jm8 = (jm8) ((WeakReference) this.b).get();
                    if (messenger != null && jm8 != null) {
                        Bundle data = message.getData();
                        px8.a(data);
                        try {
                            int i = message.what;
                            if (i == 1) {
                                px8.a(data.getBundle("data_root_hints"));
                                data.getString("data_media_item_id");
                                ox8 ox8 = (ox8) pt7.a(data.getParcelable("data_media_session_token"), ox8.CREATOR);
                                return;
                            } else if (i == 2) {
                                return;
                            } else {
                                if (i != 3) {
                                    message.toString();
                                    return;
                                }
                                px8.a(data.getBundle("data_options"));
                                px8.a(data.getBundle("data_notify_children_changed_options"));
                                String string = data.getString("data_media_item_id");
                                ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                                Parcelable.Creator<km8> creator = km8.CREATOR;
                                if (parcelableArrayList != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                        arrayList.add(pt7.a((Parcelable) parcelableArrayList.get(i2), creator));
                                    }
                                }
                                if (jm8.g == messenger) {
                                    if (string != null) {
                                        rae.w(jm8.e.get(string));
                                    }
                                    int i3 = lm8.b;
                                    return;
                                }
                                return;
                            }
                        } catch (BadParcelableException unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public hm8(jm8 jm8) {
        this.b = new WeakReference(jm8);
    }
}
