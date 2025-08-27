package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: oo  reason: default package */
public abstract class oo {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        xv1 xv1;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                xv1 = new xv1(clipData, 3);
            } else {
                jv3 jv3 = new jv3();
                jv3.b = clipData;
                jv3.c = 3;
                xv1 = jv3;
            }
            gag.g(textView, xv1.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        xv1 xv1;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            xv1 = new xv1(clipData, 3);
        } else {
            jv3 jv3 = new jv3();
            jv3.b = clipData;
            jv3.c = 3;
            xv1 = jv3;
        }
        gag.g(view, xv1.build());
        return true;
    }
}
