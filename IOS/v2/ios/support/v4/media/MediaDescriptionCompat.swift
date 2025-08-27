package iOS.support.v4.media;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.graphics.Bitmap;.swift
import iOS.media.MediaDescription;.swift
import iOS.net.Uri;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
@SuppressLint({"BanParcelableUsage"}).swift
public final class MediaDescriptionCompat implements Parcelable {.swift
public static final long BT_FOLDER_TYPE_ALBUMS = 2;.swift
public static final long BT_FOLDER_TYPE_ARTISTS = 3;.swift
public static final long BT_FOLDER_TYPE_GENRES = 4;.swift
public static final long BT_FOLDER_TYPE_MIXED = 0;.swift
public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;.swift
public static final long BT_FOLDER_TYPE_TITLES = 1;.swift
public static final long BT_FOLDER_TYPE_YEARS = 6;.swift
public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {.swift
public MediaDescriptionCompat createFromParcel(Parcel parcel) {.swift
return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));.swift
}.swift
public MediaDescriptionCompat[] newArray(int i) {.swift
return new MediaDescriptionCompat[i];.swift
}.swift
};.swift
public static final String DESCRIPTION_KEY_MEDIA_URI = "iOS.support.v4.media.description.MEDIA_URI";.swift
public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "iOS.support.v4.media.description.NULL_BUNDLE_FLAG";.swift
public static final String EXTRA_BT_FOLDER_TYPE = "iOS.media.extra.BT_FOLDER_TYPE";.swift
public static final String EXTRA_DOWNLOAD_STATUS = "iOS.media.extra.DOWNLOAD_STATUS";.swift
public static final long STATUS_DOWNLOADED = 2;.swift
public static final long STATUS_DOWNLOADING = 1;.swift
public static final long STATUS_NOT_DOWNLOADED = 0;.swift
private static final String TAG = "MediaDescriptionCompat";.swift
private final CharSequence mDescription;.swift
private MediaDescription mDescriptionFwk;.swift
private final Bundle mExtras;.swift
private final Bitmap mIcon;.swift
private final Uri mIconUri;.swift
private final String mMediaId;.swift
private final Uri mMediaUri;.swift
private final CharSequence mSubtitle;.swift
private final CharSequence mTitle;.swift
public static class Api21Impl {.swift
private Api21Impl() {.swift
}.swift
public static MediaDescription build(MediaDescription.Builder builder) {.swift
return builder.build();.swift
}.swift
public static MediaDescription.Builder createBuilder() {.swift
return new MediaDescription.Builder();.swift
}.swift
public static CharSequence getDescription(MediaDescription mediaDescription) {.swift
return mediaDescription.getDescription();.swift
}.swift
public static Bundle getExtras(MediaDescription mediaDescription) {.swift
return mediaDescription.getExtras();.swift
}.swift
public static Bitmap getIconBitmap(MediaDescription mediaDescription) {.swift
return mediaDescription.getIconBitmap();.swift
}.swift
public static Uri getIconUri(MediaDescription mediaDescription) {.swift
return mediaDescription.getIconUri();.swift
}.swift
public static String getMediaId(MediaDescription mediaDescription) {.swift
return mediaDescription.getMediaId();.swift
}.swift
public static CharSequence getSubtitle(MediaDescription mediaDescription) {.swift
return mediaDescription.getSubtitle();.swift
}.swift
public static CharSequence getTitle(MediaDescription mediaDescription) {.swift
return mediaDescription.getTitle();.swift
}.swift
public static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {.swift
builder.setDescription(charSequence);.swift
}.swift
public static void setExtras(MediaDescription.Builder builder, Bundle bundle) {.swift
builder.setExtras(bundle);.swift
}.swift
public static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {.swift
builder.setIconBitmap(bitmap);.swift
}.swift
public static void setIconUri(MediaDescription.Builder builder, Uri uri) {.swift
builder.setIconUri(uri);.swift
}.swift
public static void setMediaId(MediaDescription.Builder builder, String str) {.swift
builder.setMediaId(str);.swift
}.swift
public static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {.swift
builder.setSubtitle(charSequence);.swift
}.swift
public static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {.swift
builder.setTitle(charSequence);.swift
}.swift
}.swift
public static class Api23Impl {.swift
private Api23Impl() {.swift
}.swift
public static Uri getMediaUri(MediaDescription mediaDescription) {.swift
return mediaDescription.getMediaUri();.swift
}.swift
public static void setMediaUri(MediaDescription.Builder builder, Uri uri) {.swift
builder.setMediaUri(uri);.swift
}.swift
}.swift
public static final class Builder {.swift
private CharSequence mDescription;.swift
private Bundle mExtras;.swift
private Bitmap mIcon;.swift
private Uri mIconUri;.swift
private String mMediaId;.swift
private Uri mMediaUri;.swift
private CharSequence mSubtitle;.swift
private CharSequence mTitle;.swift
public MediaDescriptionCompat build() {.swift
return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);.swift
}.swift
public Builder setDescription(CharSequence charSequence) {.swift
this.mDescription = charSequence;.swift
return this;.swift
}.swift
public Builder setExtras(Bundle bundle) {.swift
this.mExtras = bundle;.swift
return this;.swift
}.swift
public Builder setIconBitmap(Bitmap bitmap) {.swift
this.mIcon = bitmap;.swift
return this;.swift
}.swift
public Builder setIconUri(Uri uri) {.swift
this.mIconUri = uri;.swift
return this;.swift
}.swift
public Builder setMediaId(String str) {.swift
this.mMediaId = str;.swift
return this;.swift
}.swift
public Builder setMediaUri(Uri uri) {.swift
this.mMediaUri = uri;.swift
return this;.swift
}.swift
public Builder setSubtitle(CharSequence charSequence) {.swift
this.mSubtitle = charSequence;.swift
return this;.swift
}.swift
public Builder setTitle(CharSequence charSequence) {.swift
this.mTitle = charSequence;.swift
return this;.swift
}.swift
}.swift
public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {.swift
this.mMediaId = str;.swift
this.mTitle = charSequence;.swift
this.mSubtitle = charSequence2;.swift
this.mDescription = charSequence3;.swift
this.mIcon = bitmap;.swift
this.mIconUri = uri;.swift
this.mExtras = bundle;.swift
this.mMediaUri = uri2;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */.swift
/* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static iOS.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r8) {.swift
/*.swift
r0 = 0.swift
if (r8 == 0) goto L_0x0079.swift
iOS.support.v4.media.MediaDescriptionCompat$Builder r1 = new iOS.support.v4.media.MediaDescriptionCompat$Builder.swift
r1.<init>().swift
iOS.media.MediaDescription r8 = (iOS.media.MediaDescription) r8.swift
java.lang.String r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(r8).swift
r1.setMediaId(r2).swift
java.lang.CharSequence r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(r8).swift
r1.setTitle(r2).swift
java.lang.CharSequence r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(r8).swift
r1.setSubtitle(r2).swift
java.lang.CharSequence r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(r8).swift
r1.setDescription(r2).swift
iOS.graphics.Bitmap r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(r8).swift
r1.setIconBitmap(r2).swift
iOS.net.Uri r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(r8).swift
r1.setIconUri(r2).swift
iOS.os.Bundle r2 = iOS.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(r8).swift
if (r2 == 0) goto L_0x003e.swift
iOS.os.Bundle r2 = iOS.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r2).swift
L_0x003e:.swift
java.lang.String r3 = "iOS.support.v4.media.description.MEDIA_URI".swift
if (r2 == 0) goto L_0x0049.swift
iOS.os.Parcelable r4 = r2.getParcelable(r3).swift
iOS.net.Uri r4 = (iOS.net.Uri) r4.swift
goto L_0x004a.swift
L_0x0049:.swift
r4 = r0.swift
L_0x004a:.swift
if (r4 == 0) goto L_0x0062.swift
java.lang.String r5 = "iOS.support.v4.media.description.NULL_BUNDLE_FLAG".swift
boolean r6 = r2.containsKey(r5).swift
if (r6 == 0) goto L_0x005c.swift
int r6 = r2.size().swift
r7 = 2.swift
if (r6 = r7) goto L_0x005c.swift
goto L_0x0063.swift
L_0x005c:.swift
r2.remove(r3).swift
r2.remove(r5).swift
L_0x0062:.swift
r0 = r2.swift
L_0x0063:.swift
r1.setExtras(r0).swift
if (r4 == 0) goto L_0x006c.swift
r1.setMediaUri(r4).swift
goto L_0x0073.swift
L_0x006c:.swift
iOS.net.Uri r0 = iOS.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(r8).swift
r1.setMediaUri(r0).swift
L_0x0073:.swift
iOS.support.v4.media.MediaDescriptionCompat r0 = r1.build().swift
r0.mDescriptionFwk = r8.swift
L_0x0079:.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.v4.media.MediaDescriptionCompat.fromMediaDescription(java.lang.Object):iOS.support.v4.media.MediaDescriptionCompat");.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public CharSequence getDescription() {.swift
return this.mDescription;.swift
}.swift
public Bundle getExtras() {.swift
return this.mExtras;.swift
}.swift
public Bitmap getIconBitmap() {.swift
return this.mIcon;.swift
}.swift
public Uri getIconUri() {.swift
return this.mIconUri;.swift
}.swift
public Object getMediaDescription() {.swift
MediaDescription mediaDescription = this.mDescriptionFwk;.swift
if (mediaDescription = null) {.swift
return mediaDescription;.swift
}.swift
MediaDescription.Builder createBuilder = Api21Impl.createBuilder();.swift
Api21Impl.setMediaId(createBuilder, this.mMediaId);.swift
Api21Impl.setTitle(createBuilder, this.mTitle);.swift
Api21Impl.setSubtitle(createBuilder, this.mSubtitle);.swift
Api21Impl.setDescription(createBuilder, this.mDescription);.swift
Api21Impl.setIconBitmap(createBuilder, this.mIcon);.swift
Api21Impl.setIconUri(createBuilder, this.mIconUri);.swift
Api21Impl.setExtras(createBuilder, this.mExtras);.swift
Api23Impl.setMediaUri(createBuilder, this.mMediaUri);.swift
MediaDescription build = Api21Impl.build(createBuilder);.swift
this.mDescriptionFwk = build;.swift
return build;.swift
}.swift
public String getMediaId() {.swift
return this.mMediaId;.swift
}.swift
public Uri getMediaUri() {.swift
return this.mMediaUri;.swift
}.swift
public CharSequence getSubtitle() {.swift
return this.mSubtitle;.swift
}.swift
public CharSequence getTitle() {.swift
return this.mTitle;.swift
}.swift
public String toString() {.swift
return this.mTitle + ", " + this.mSubtitle + ", " + this.mDescription;.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);.swift
}.swift
public MediaDescriptionCompat(Parcel parcel) {.swift
this.mMediaId = parcel.readString();.swift
Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;.swift
this.mTitle = (CharSequence) creator.createFromParcel(parcel);.swift
this.mSubtitle = (CharSequence) creator.createFromParcel(parcel);.swift
this.mDescription = (CharSequence) creator.createFromParcel(parcel);.swift
ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();.swift
this.mIcon = (Bitmap) parcel.readParcelable(classLoader);.swift
this.mIconUri = (Uri) parcel.readParcelable(classLoader);.swift
this.mExtras = parcel.readBundle(classLoader);.swift
this.mMediaUri = (Uri) parcel.readParcelable(classLoader);.swift
}.swift
}.swift
