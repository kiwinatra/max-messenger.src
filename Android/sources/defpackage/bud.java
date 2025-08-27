package defpackage;

import androidx.work.WorkRequest;
import java.util.Arrays;
import java.util.HashSet;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: bud  reason: default package */
public interface bud {
    public static final HashSet a = new HashSet(Arrays.asList(new String[]{"error.comment.chat.access", "error.comment.invalid", "error.message.invalid", "error.message.chat.access", "error.message.like.unknown.like"}));
    public static final String[] b = {"modifiers", "accessFlags"};
    public static final long[] c = {15000, WorkRequest.MIN_BACKOFF_MILLIS, MultiFileUploader.UPLOAD_NEXT_INTERVAL};
    public static final int[] d = {1, 3, 4};
}
