package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* renamed from: v33  reason: default package */
public interface v33 extends Closeable, k97, HasExtraData {
    void close();

    int getHeight();

    k97 getImageInfo();

    tac getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
