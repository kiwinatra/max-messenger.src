package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.WindowManager;
import kotlin.collections.ArraysKt;

/* renamed from: kw3  reason: default package */
public abstract class kw3 {
    public static final WindowManager a(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static final void b(Context context, String str) {
        if (str.length() != 0) {
            try {
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
                Linkify.addLinks(newSpannable, 1);
                boolean z = false;
                URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
                if (uRLSpanArr.length == 0) {
                    z = true;
                }
                if (true ^ z) {
                    str = ((URLSpan) ArraysKt.first((T[]) uRLSpanArr)).getURL();
                }
            } catch (Throwable unused) {
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.getMessage();
            }
        }
    }
}
