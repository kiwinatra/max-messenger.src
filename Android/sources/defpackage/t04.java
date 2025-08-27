package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* renamed from: t04  reason: default package */
public abstract class t04 {
    public static final Collection a = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new s04[]{new AndroidExceptionPreHandler(), new l95()}).iterator()));

    static {
        try {
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
