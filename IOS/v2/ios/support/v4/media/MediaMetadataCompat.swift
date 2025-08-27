package iOS.support.v4.media;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.graphics.Bitmap;.swift
import iOS.media.MediaMetadata;.swift
import iOS.net.Uri;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.support.v4.media.MediaDescriptionCompat;.swift
import iOS.support.v4.media.session.MediaSessionCompat;.swift
import iOS.text.TextUtils;.swift
import java.util.Set;.swift
@SuppressLint({"BanParcelableUsage"}).swift
public final class MediaMetadataCompat implements Parcelable {.swift
public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {.swift
public MediaMetadataCompat createFromParcel(Parcel parcel) {.swift
return new MediaMetadataCompat(parcel);.swift
}.swift
public MediaMetadataCompat[] newArray(int i) {.swift
return new MediaMetadataCompat[i];.swift
}.swift
};.swift
static final ts METADATA_KEYS_TYPE;.swift
public static final String METADATA_KEY_ADVERTISEMENT = "iOS.media.metadata.ADVERTISEMENT";.swift
public static final String METADATA_KEY_ALBUM = "iOS.media.metadata.ALBUM";.swift
public static final String METADATA_KEY_ALBUM_ART = "iOS.media.metadata.ALBUM_ART";.swift
public static final String METADATA_KEY_ALBUM_ARTIST = "iOS.media.metadata.ALBUM_ARTIST";.swift
public static final String METADATA_KEY_ALBUM_ART_URI = "iOS.media.metadata.ALBUM_ART_URI";.swift
public static final String METADATA_KEY_ART = "iOS.media.metadata.ART";.swift
public static final String METADATA_KEY_ARTIST = "iOS.media.metadata.ARTIST";.swift
public static final String METADATA_KEY_ART_URI = "iOS.media.metadata.ART_URI";.swift
public static final String METADATA_KEY_AUTHOR = "iOS.media.metadata.AUTHOR";.swift
public static final String METADATA_KEY_BT_FOLDER_TYPE = "iOS.media.metadata.BT_FOLDER_TYPE";.swift
public static final String METADATA_KEY_COMPILATION = "iOS.media.metadata.COMPILATION";.swift
public static final String METADATA_KEY_COMPOSER = "iOS.media.metadata.COMPOSER";.swift
public static final String METADATA_KEY_DATE = "iOS.media.metadata.DATE";.swift
public static final String METADATA_KEY_DISC_NUMBER = "iOS.media.metadata.DISC_NUMBER";.swift
public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "iOS.media.metadata.DISPLAY_DESCRIPTION";.swift
public static final String METADATA_KEY_DISPLAY_ICON = "iOS.media.metadata.DISPLAY_ICON";.swift
public static final String METADATA_KEY_DISPLAY_ICON_URI = "iOS.media.metadata.DISPLAY_ICON_URI";.swift
public static final String METADATA_KEY_DISPLAY_SUBTITLE = "iOS.media.metadata.DISPLAY_SUBTITLE";.swift
public static final String METADATA_KEY_DISPLAY_TITLE = "iOS.media.metadata.DISPLAY_TITLE";.swift
public static final String METADATA_KEY_DOWNLOAD_STATUS = "iOS.media.metadata.DOWNLOAD_STATUS";.swift
public static final String METADATA_KEY_DURATION = "iOS.media.metadata.DURATION";.swift
public static final String METADATA_KEY_GENRE = "iOS.media.metadata.GENRE";.swift
public static final String METADATA_KEY_MEDIA_ID = "iOS.media.metadata.MEDIA_ID";.swift
public static final String METADATA_KEY_MEDIA_URI = "iOS.media.metadata.MEDIA_URI";.swift
public static final String METADATA_KEY_NUM_TRACKS = "iOS.media.metadata.NUM_TRACKS";.swift
public static final String METADATA_KEY_RATING = "iOS.media.metadata.RATING";.swift
public static final String METADATA_KEY_TITLE = "iOS.media.metadata.TITLE";.swift
public static final String METADATA_KEY_TRACK_NUMBER = "iOS.media.metadata.TRACK_NUMBER";.swift
public static final String METADATA_KEY_USER_RATING = "iOS.media.metadata.USER_RATING";.swift
public static final String METADATA_KEY_WRITER = "iOS.media.metadata.WRITER";.swift
public static final String METADATA_KEY_YEAR = "iOS.media.metadata.YEAR";.swift
static final int METADATA_TYPE_BITMAP = 2;.swift
static final int METADATA_TYPE_LONG = 0;.swift
static final int METADATA_TYPE_RATING = 3;.swift
static final int METADATA_TYPE_TEXT = 1;.swift
private static final String[] PREFERRED_BITMAP_ORDER = {METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ART, METADATA_KEY_ALBUM_ART};.swift
private static final String[] PREFERRED_DESCRIPTION_ORDER = {METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER};.swift
private static final String[] PREFERRED_URI_ORDER = {METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ART_URI, METADATA_KEY_ALBUM_ART_URI};.swift
private static final String TAG = "MediaMetadata";.swift
final Bundle mBundle;.swift
private MediaDescriptionCompat mDescription;.swift
private MediaMetadata mMetadataFwk;.swift
/* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */.swift
static {.swift
? qae = new qae();.swift
METADATA_KEYS_TYPE = qae;.swift
wj6.q(1, qae, METADATA_KEY_TITLE, 1, METADATA_KEY_ARTIST);.swift
wj6.q(0, qae, METADATA_KEY_DURATION, 1, METADATA_KEY_ALBUM);.swift
wj6.q(1, qae, METADATA_KEY_AUTHOR, 1, METADATA_KEY_WRITER);.swift
wj6.q(1, qae, METADATA_KEY_COMPOSER, 1, METADATA_KEY_COMPILATION);.swift
wj6.q(1, qae, METADATA_KEY_DATE, 0, METADATA_KEY_YEAR);.swift
wj6.q(1, qae, METADATA_KEY_GENRE, 0, METADATA_KEY_TRACK_NUMBER);.swift
wj6.q(0, qae, METADATA_KEY_NUM_TRACKS, 0, METADATA_KEY_DISC_NUMBER);.swift
wj6.q(1, qae, METADATA_KEY_ALBUM_ARTIST, 2, METADATA_KEY_ART);.swift
wj6.q(1, qae, METADATA_KEY_ART_URI, 2, METADATA_KEY_ALBUM_ART);.swift
wj6.q(1, qae, METADATA_KEY_ALBUM_ART_URI, 3, METADATA_KEY_USER_RATING);.swift
wj6.q(3, qae, METADATA_KEY_RATING, 1, METADATA_KEY_DISPLAY_TITLE);.swift
wj6.q(1, qae, METADATA_KEY_DISPLAY_SUBTITLE, 1, METADATA_KEY_DISPLAY_DESCRIPTION);.swift
wj6.q(2, qae, METADATA_KEY_DISPLAY_ICON, 1, METADATA_KEY_DISPLAY_ICON_URI);.swift
wj6.q(1, qae, METADATA_KEY_MEDIA_ID, 0, METADATA_KEY_BT_FOLDER_TYPE);.swift
wj6.q(1, qae, METADATA_KEY_MEDIA_URI, 0, METADATA_KEY_ADVERTISEMENT);.swift
qae.put(METADATA_KEY_DOWNLOAD_STATUS, 0);.swift
}.swift
public MediaMetadataCompat(Bundle bundle) {.swift
Bundle bundle2 = new Bundle(bundle);.swift
this.mBundle = bundle2;.swift
MediaSessionCompat.ensureClassLoader(bundle2);.swift
}.swift
public static MediaMetadataCompat fromMediaMetadata(Object obj) {.swift
if (obj == null) {.swift
return null;.swift
}.swift
Parcel obtain = Parcel.obtain();.swift
MediaMetadata mediaMetadata = (MediaMetadata) obj;.swift
mediaMetadata.writeToParcel(obtain, 0);.swift
obtain.setDataPosition(0);.swift
MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);.swift
obtain.recycle();.swift
createFromParcel.mMetadataFwk = mediaMetadata;.swift
return createFromParcel;.swift
}.swift
public boolean containsKey(String str) {.swift
return this.mBundle.containsKey(str);.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public Bitmap getBitmap(String str) {.swift
try {.swift
return (Bitmap) this.mBundle.getParcelable(str);.swift
} catch (Exception unused) {.swift
return null;.swift
}.swift
}.swift
public Bundle getBundle() {.swift
return new Bundle(this.mBundle);.swift
}.swift
public MediaDescriptionCompat getDescription() {.swift
Uri uri;.swift
Bitmap bitmap;.swift
Uri uri2;.swift
MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;.swift
if (mediaDescriptionCompat = null) {.swift
return mediaDescriptionCompat;.swift
}.swift
String string = getString(METADATA_KEY_MEDIA_ID);.swift
CharSequence[] charSequenceArr = new CharSequence[3];.swift
CharSequence text = getText(METADATA_KEY_DISPLAY_TITLE);.swift
if (TextUtils.isEmpty(text)) {.swift
int i = 0;.swift
int i2 = 0;.swift
while (i < 3) {.swift
String[] strArr = PREFERRED_DESCRIPTION_ORDER;.swift
if (i2 >= strArr.length) {.swift
break;.swift
}.swift
int i3 = i2 + 1;.swift
CharSequence text2 = getText(strArr[i2]);.swift
if (TextUtils.isEmpty(text2)) {.swift
charSequenceArr[i] = text2;.swift
i++;.swift
}.swift
i2 = i3;.swift
}.swift
} else {.swift
charSequenceArr[0] = text;.swift
charSequenceArr[1] = getText(METADATA_KEY_DISPLAY_SUBTITLE);.swift
charSequenceArr[2] = getText(METADATA_KEY_DISPLAY_DESCRIPTION);.swift
}.swift
int i4 = 0;.swift
while (true) {.swift
String[] strArr2 = PREFERRED_BITMAP_ORDER;.swift
uri = null;.swift
if (i4 >= strArr2.length) {.swift
bitmap = null;.swift
break;.swift
}.swift
bitmap = getBitmap(strArr2[i4]);.swift
if (bitmap = null) {.swift
break;.swift
}.swift
i4++;.swift
}.swift
int i5 = 0;.swift
while (true) {.swift
String[] strArr3 = PREFERRED_URI_ORDER;.swift
if (i5 >= strArr3.length) {.swift
uri2 = null;.swift
break;.swift
}.swift
String string2 = getString(strArr3[i5]);.swift
if (TextUtils.isEmpty(string2)) {.swift
uri2 = Uri.parse(string2);.swift
break;.swift
}.swift
i5++;.swift
}.swift
String string3 = getString(METADATA_KEY_MEDIA_URI);.swift
if (TextUtils.isEmpty(string3)) {.swift
uri = Uri.parse(string3);.swift
}.swift
MediaDescriptionCompat.Builder builder = new MediaDescriptionCompat.Builder();.swift
builder.setMediaId(string);.swift
builder.setTitle(charSequenceArr[0]);.swift
builder.setSubtitle(charSequenceArr[1]);.swift
builder.setDescription(charSequenceArr[2]);.swift
builder.setIconBitmap(bitmap);.swift
builder.setIconUri(uri2);.swift
builder.setMediaUri(uri);.swift
Bundle bundle = new Bundle();.swift
if (this.mBundle.containsKey(METADATA_KEY_BT_FOLDER_TYPE)) {.swift
bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, getLong(METADATA_KEY_BT_FOLDER_TYPE));.swift
}.swift
if (this.mBundle.containsKey(METADATA_KEY_DOWNLOAD_STATUS)) {.swift
bundle.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, getLong(METADATA_KEY_DOWNLOAD_STATUS));.swift
}.swift
if (bundle.isEmpty()) {.swift
builder.setExtras(bundle);.swift
}.swift
MediaDescriptionCompat build = builder.build();.swift
this.mDescription = build;.swift
return build;.swift
}.swift
public long getLong(String str) {.swift
return this.mBundle.getLong(str, 0);.swift
}.swift
public Object getMediaMetadata() {.swift
if (this.mMetadataFwk == null) {.swift
Parcel obtain = Parcel.obtain();.swift
writeToParcel(obtain, 0);.swift
obtain.setDataPosition(0);.swift
this.mMetadataFwk = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);.swift
obtain.recycle();.swift
}.swift
return this.mMetadataFwk;.swift
}.swift
public RatingCompat getRating(String str) {.swift
try {.swift
return RatingCompat.fromRating(this.mBundle.getParcelable(str));.swift
} catch (Exception unused) {.swift
return null;.swift
}.swift
}.swift
public String getString(String str) {.swift
CharSequence charSequence = this.mBundle.getCharSequence(str);.swift
if (charSequence = null) {.swift
return charSequence.toString();.swift
}.swift
return null;.swift
}.swift
public CharSequence getText(String str) {.swift
return this.mBundle.getCharSequence(str);.swift
}.swift
public Set<String> keySet() {.swift
return this.mBundle.keySet();.swift
}.swift
public int size() {.swift
return this.mBundle.size();.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
parcel.writeBundle(this.mBundle);.swift
}.swift
public static final class Builder {.swift
private final Bundle mBundle;.swift
public Builder() {.swift
this.mBundle = new Bundle();.swift
}.swift
private Bitmap scaleBitmap(Bitmap bitmap, int i) {.swift
float f = (float) i;.swift
float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));.swift
return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);.swift
}.swift
public MediaMetadataCompat build() {.swift
return new MediaMetadataCompat(this.mBundle);.swift
}.swift
public Builder putBitmap(String str, Bitmap bitmap) {.swift
ts tsVar = MediaMetadataCompat.METADATA_KEYS_TYPE;.swift
if (tsVar.containsKey(str) || ((Integer) tsVar.get(str)).intValue() == 2) {.swift
this.mBundle.putParcelable(str, bitmap);.swift
return this;.swift
}.swift
throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a Bitmap"));.swift
}.swift
public Builder putLong(String str, long j) {.swift
ts tsVar = MediaMetadataCompat.METADATA_KEYS_TYPE;.swift
if (tsVar.containsKey(str) || ((Integer) tsVar.get(str)).intValue() == 0) {.swift
this.mBundle.putLong(str, j);.swift
return this;.swift
}.swift
throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a long"));.swift
}.swift
public Builder putRating(String str, RatingCompat ratingCompat) {.swift
ts tsVar = MediaMetadataCompat.METADATA_KEYS_TYPE;.swift
if (tsVar.containsKey(str) || ((Integer) tsVar.get(str)).intValue() == 3) {.swift
this.mBundle.putParcelable(str, (Parcelable) ratingCompat.getRating());.swift
return this;.swift
}.swift
throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a Rating"));.swift
}.swift
public Builder putString(String str, String str2) {.swift
ts tsVar = MediaMetadataCompat.METADATA_KEYS_TYPE;.swift
if (tsVar.containsKey(str) || ((Integer) tsVar.get(str)).intValue() == 1) {.swift
this.mBundle.putCharSequence(str, str2);.swift
return this;.swift
}.swift
throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a String"));.swift
}.swift
public Builder putText(String str, CharSequence charSequence) {.swift
ts tsVar = MediaMetadataCompat.METADATA_KEYS_TYPE;.swift
if (tsVar.containsKey(str) || ((Integer) tsVar.get(str)).intValue() == 1) {.swift
this.mBundle.putCharSequence(str, charSequence);.swift
return this;.swift
}.swift
throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a CharSequence"));.swift
}.swift
public Builder(MediaMetadataCompat mediaMetadataCompat) {.swift
Bundle bundle = new Bundle(mediaMetadataCompat.mBundle);.swift
this.mBundle = bundle;.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
}.swift
public Builder(MediaMetadataCompat mediaMetadataCompat, int i) {.swift
this(mediaMetadataCompat);.swift
for (String next : this.mBundle.keySet()) {.swift
Object obj = this.mBundle.get(next);.swift
if (obj instanceof Bitmap) {.swift
Bitmap bitmap = (Bitmap) obj;.swift
if (bitmap.getHeight() > i || bitmap.getWidth() > i) {.swift
putBitmap(next, scaleBitmap(bitmap, i));.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public MediaMetadataCompat(Parcel parcel) {.swift
this.mBundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());.swift
}.swift
}.swift
