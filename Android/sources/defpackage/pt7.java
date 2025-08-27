package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;

/* renamed from: pt7  reason: default package */
public abstract class pt7 {
    public static Parcelable a(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) b(parcelable);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) b((Parcelable) creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static Object b(Object obj) {
        int i = v0g.a;
        if (i < 21 || i >= 23) {
            return obj;
        }
        if (!(obj instanceof MediaBrowserCompat.MediaItem)) {
            return obj instanceof MediaDescriptionCompat ? c((MediaDescriptionCompat) obj) : obj;
        }
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        return new MediaBrowserCompat.MediaItem(c(mediaItem.getDescription()), mediaItem.getFlags());
    }

    public static MediaDescriptionCompat c(MediaDescriptionCompat mediaDescriptionCompat) {
        return new MediaDescriptionCompat.Builder().setMediaId(mediaDescriptionCompat.getMediaId()).setTitle(mediaDescriptionCompat.getTitle()).setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setIconBitmap(mediaDescriptionCompat.getIconBitmap()).setIconUri(mediaDescriptionCompat.getIconUri()).setExtras(mediaDescriptionCompat.getExtras()).setMediaUri(mediaDescriptionCompat.getMediaUri()).build();
    }
}
