package ru.ok.tamtam.nano;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

public abstract class b {
    public static final byte[] a = new byte[0];

    static {
        y7e.e = new gga(17);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [u62, java.lang.Object] */
    public static HashMap a(Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            ? obj = new Object();
            obj.b = adminParticipant.id;
            obj.a = adminParticipant.permissions;
            obj.c = adminParticipant.inviterId;
            obj.d = adminParticipant.alias;
            hashMap.put(l, new v62(obj));
        }
        return hashMap;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v7, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [y10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r5v11, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v17, types: [f10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v19, types: [b20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v21, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v50, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v76, types: [java.lang.Object, o10] */
    public static l20 c(Protos.Attaches.Attach attach) {
        j10 j10;
        Protos.Attaches.Attach.Location location;
        j10 j102;
        List list;
        int lastIndexOf;
        int i;
        Protos.Attaches.Attach attach2 = attach;
        int i2 = l20.z;
        ? obj = new Object();
        obj.j = attach2.lastErrorTime;
        float f = attach2.progressFloat;
        if (f == c44.DEFAULT_ASPECT_RATIO) {
            f = (float) attach2.progress;
        }
        obj.k = f;
        obj.l = attach2.localId;
        obj.m = attach2.localPath;
        obj.n = attach2.isDeleted;
        obj.o = attach2.totalBytes;
        obj.p = attach2.bytesDownloaded;
        obj.u = attach2.lastModified;
        obj.x = attach2.sensitiveContentUnlocked;
        obj.y = attach2.sensitive;
        int i3 = attach2.type;
        g20 g20 = g20.a;
        switch (i3) {
            case 1:
                g20 = g20.b;
                break;
            case 2:
                g20 = g20.c;
                break;
            case 3:
                g20 = g20.o;
                break;
            case 4:
                g20 = g20.v;
                break;
            case 5:
                g20 = g20.w;
                break;
            case 6:
                g20 = g20.x;
                break;
            case 7:
                g20 = g20.z;
                break;
            case 8:
                g20 = g20.y;
                break;
            case 10:
                g20 = g20.X;
                break;
            case 11:
                g20 = g20.Y;
                break;
            case 12:
                g20 = g20.Z;
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                g20 = g20.v0;
                break;
        }
        obj.a = g20;
        int i4 = attach2.status;
        d20 d20 = d20.a;
        int i5 = 4;
        if (i4 != 0) {
            if (i4 == 1) {
                d20 = d20.b;
            } else if (i4 == 2) {
                d20 = d20.c;
            } else if (i4 == 3) {
                d20 = d20.o;
            } else if (i4 == 4) {
                d20 = d20.v;
            }
        }
        obj.i = d20;
        Protos.Attaches.Attach.Photo photo = attach2.photo;
        if (photo != null) {
            obj.b = m(photo);
        }
        Protos.Attaches.Attach.Control control = attach2.control;
        if (control != null) {
            int i6 = q10.p;
            ? obj2 = new Object();
            int i7 = control.event;
            p10 p10 = p10.a;
            switch (i7) {
                case 1:
                    p10 = p10.b;
                    break;
                case 2:
                    p10 = p10.c;
                    break;
                case 3:
                    p10 = p10.o;
                    break;
                case 4:
                    p10 = p10.v;
                    break;
                case 5:
                    p10 = p10.w;
                    break;
                case 6:
                    p10 = p10.x;
                    break;
                case 7:
                case 8:
                    p10 = p10.y;
                    break;
                case 9:
                    p10 = p10.z;
                    break;
                case 10:
                    p10 = p10.X;
                    break;
                case 11:
                    p10 = p10.Y;
                    break;
            }
            obj2.a = p10;
            obj2.b = control.userId;
            obj2.c = cjf.h(control.userIds);
            Protos.Attaches.Attach.Control control2 = attach2.control;
            obj2.d = control2.title;
            obj2.e = control2.iconToken;
            obj2.f = control2.url;
            obj2.g = control2.fullUrl;
            obj2.k = control2.showHistory;
            int i8 = control2.chatType;
            if (i8 == 1) {
                obj2.l = 3;
            } else if (i8 == 2) {
                obj2.l = 4;
            } else if (i8 == 3) {
                obj2.l = 5;
            } else if (i8 != 4) {
                obj2.l = 1;
            } else {
                obj2.l = 2;
            }
            Protos.Attaches.Attach.Rect rect = control2.crop;
            if (rect != null) {
                a20 a20 = r11;
                a20 a202 = new a20(rect.left, rect.top, rect.right, rect.bottom, 0);
                obj2.h = a20;
            }
            obj2.i = control2.message;
            obj2.j = control2.shortMessage;
            obj2.m = control2.pinnedMessageId;
            obj2.n = control2.pinnedMessageServerId;
            obj2.o = control2.startPayload;
            obj.c = obj2.a();
        }
        Protos.Attaches.Attach.Video video = attach2.video;
        if (video != null) {
            k20 k20 = k20.q;
            h20 h20 = new h20();
            h20.a = video.videoId;
            h20.e = (long) video.duration;
            h20.d = video.thumbnail;
            h20.b = video.width;
            h20.c = video.height;
            h20.j = video.live;
            h20.f = video.externalUrl;
            h20.g = video.externalSiteName;
            h20.n = video.previewData;
            h20.k = video.startTime;
            h20.h = video.token;
            h20.l = video.ignoreAutoplay;
            h20.i = video.audioTrackIndex;
            h20.m = video.audioGroupIndex;
            if (video.convertOptions != null) {
                int i9 = j20.e;
                i20 i20 = new i20(0);
                Protos.Attaches.Attach.Video.ConvertOptions convertOptions = attach2.video.convertOptions;
                i20.b = convertOptions.startTrimPosition;
                i20.c = convertOptions.endTrimPosition;
                i20.d = convertOptions.mute;
                if (convertOptions.quality != null) {
                    i20.a = qac.values()[attach2.video.convertOptions.quality.ordinal];
                } else {
                    i20.a = qac.values()[attach2.video.convertOptions.qualityValue];
                }
                h20.o = new j20(i20);
            }
            Protos.Attaches.Attach.Video.VideoCollage videoCollage = attach2.video.videoCollage;
            if (videoCollage != null) {
                h20.p = new zy(videoCollage.frequency, videoCollage.height, videoCollage.width, videoCollage.count, videoCollage.url);
            }
            obj.d = new k20(h20);
        }
        Protos.Attaches.Attach.Audio audio = attach2.audio;
        if (audio != null) {
            int i10 = audio.transcriptionStatus;
            if (i10 != 0) {
                if (i10 == 1) {
                    i = 2;
                } else if (i10 == 2) {
                    i = 3;
                } else if (i10 == 3) {
                    i = 4;
                } else if (i10 == 4) {
                    i = 5;
                }
                i10 i102 = i10.j;
                ? obj3 = new Object();
                obj3.a = audio.audioId;
                obj3.b = audio.url;
                obj3.c = audio.duration;
                obj3.g = audio.startTime;
                obj3.h = audio.lastStartTimeUpdateTimestamp;
                obj3.d = audio.wave;
                obj3.f = audio.transcription;
                obj3.i = i;
                obj3.e = audio.token;
                obj.e = new i10(obj3);
            }
            i = 1;
            i10 i1022 = i10.j;
            ? obj32 = new Object();
            obj32.a = audio.audioId;
            obj32.b = audio.url;
            obj32.c = audio.duration;
            obj32.g = audio.startTime;
            obj32.h = audio.lastStartTimeUpdateTimestamp;
            obj32.d = audio.wave;
            obj32.f = audio.transcription;
            obj32.i = i;
            obj32.e = audio.token;
            obj.e = new i10(obj32);
        }
        Protos.Attaches.Attach.Sticker sticker = attach2.sticker;
        if (sticker != null) {
            f20 f20 = f20.o;
            ? obj4 = new Object();
            obj4.a = sticker.stickerId;
            obj4.d = sticker.url;
            obj4.b = sticker.width;
            obj4.c = sticker.height;
            obj4.f = sticker.mp4Url;
            obj4.g = sticker.firstUrl;
            String[] strArr = sticker.tags;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            obj4.i = arrayList;
            Protos.Attaches.Attach.Sticker sticker2 = attach2.sticker;
            obj4.h = sticker2.previewUrl;
            obj4.e = sticker2.updateTime;
            obj4.k = sticker2.setId;
            obj4.l = sticker2.lottieUrl;
            obj4.m = sticker2.audio;
            int i11 = sticker2.stickerType;
            if (i11 == 1) {
                obj4.j = 2;
            } else if (i11 == 2) {
                obj4.j = 3;
            } else if (i11 != 4) {
                obj4.j = 1;
            } else {
                obj4.j = 4;
            }
            int i12 = sticker2.authorType;
            if (i12 == 1) {
                obj4.n = 2;
            } else if (i12 != 2) {
                obj4.n = 1;
            } else {
                obj4.n = 3;
            }
            obj.f = obj4.a();
        }
        Protos.Attaches.Attach.Share share = attach2.share;
        if (share != null) {
            int i13 = c20.i;
            ? obj5 = new Object();
            obj5.a = share.shareId;
            obj5.b = share.url;
            obj5.c = share.title;
            obj5.d = share.description;
            obj5.e = share.host;
            Protos.Attaches.Attach.Photo photo2 = share.image;
            if (photo2 != null) {
                obj5.f = m(photo2);
            }
            Protos.Attaches.Attach attach3 = attach2.share.media;
            if (attach3 != null) {
                obj5.g = c(attach3);
            }
            obj5.h = attach2.share.deleted;
            obj.g = new c20(obj5);
        }
        Protos.Attaches.Attach.App app = attach2.app;
        if (app != null) {
            ? obj6 = new Object();
            obj6.a = app.appId;
            obj6.b = app.name;
            obj6.d = app.message;
            obj6.c = app.icon;
            obj6.f = app.timeout;
            obj6.e = app.state;
            obj6.g = app.appState;
            obj.h = new g10(obj6);
        }
        Protos.Attaches.Attach.Call call = attach2.call;
        if (call != null) {
            int i14 = call.callType;
            int i15 = i14 != 1 ? i14 != 2 ? 1 : 3 : 2;
            int i16 = call.hangupType;
            int i17 = i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? 1 : 5 : 4 : 3 : 2;
            long j = call.durationLong;
            if (j == 0) {
                j = (long) call.duration;
            }
            k10 k10 = new k10();
            k10.a = call.conversationId;
            k10.b = call.joinLink;
            k10.c = i15;
            k10.d = i17;
            k10.e = j;
            ArrayList h = cjf.h(call.contactIds);
            k10.f = h;
            if (h == null) {
                k10.f = Collections.emptyList();
            }
            obj.q = new l10(k10);
        }
        Protos.Attaches.Attach.File file = attach2.file;
        if (file != null) {
            ? obj7 = new Object();
            obj7.a = file.fileId;
            obj7.b = file.size;
            String str = file.name;
            if (!cvg.A(str) && (lastIndexOf = str.lastIndexOf("/")) != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            obj7.c = str;
            Protos.Attaches.Attach attach4 = attach2.file.preview;
            obj7.e = attach4 != null ? c(attach4) : null;
            obj7.d = attach2.file.token;
            obj.r = new s10(obj7);
        }
        Protos.Attaches.Attach.Contact contact = attach2.contact;
        if (contact != null) {
            ? obj8 = new Object();
            obj8.a = contact.vcfBody;
            obj8.b = contact.contactId;
            obj8.c = contact.name;
            obj8.f = contact.phone;
            obj8.g = contact.photoUrl;
            obj8.h = contact.localPhotoUrl;
            obj8.d = contact.firstName;
            obj8.e = contact.lastName;
            obj.s = new n10(obj8);
        }
        Protos.Attaches.Attach.Present present = attach2.present;
        if (present != null) {
            int i18 = present.status;
            if (i18 == 1) {
                i5 = 2;
            } else if (i18 == 2) {
                i5 = 3;
            } else if (i18 != 3) {
                if (i18 != 4) {
                    i5 = 5;
                    if (i18 != 5) {
                        i5 = 1;
                    }
                } else {
                    i5 = 6;
                }
            }
            ? obj9 = new Object();
            obj9.a = present.presentId;
            obj9.b = present.metadataId;
            obj9.c = present.senderId;
            obj9.d = present.receiverId;
            obj9.e = i5;
            obj9.f = present.presentJson;
            obj.t = new y10(obj9);
        }
        Protos.Attaches.Attach.Location location2 = attach2.location;
        if (location2 != null) {
            ? obj10 = new Object();
            obj10.a = new s58(location2.latitude, location2.longitude, location2.altitude, location2.accuracy, location2.bearing, location2.speed);
            obj10.b = location2.livePeriod;
            obj10.c = location2.startTime;
            obj10.d = location2.endTime;
            Protos.Attaches.LocationInfo[] locationInfoArr = location2.track;
            if (locationInfoArr == null) {
                list = Collections.emptyList();
                j102 = obj;
                location = location2;
            } else {
                ArrayList arrayList2 = new ArrayList(locationInfoArr.length);
                int length = locationInfoArr.length;
                int i19 = 0;
                j10 j103 = obj;
                while (i19 < length) {
                    Protos.Attaches.LocationInfo locationInfo = locationInfoArr[i19];
                    Protos.Attaches.Attach.Location location3 = location2;
                    s58 s58 = r12;
                    s58 s582 = new s58(locationInfo.latitude, locationInfo.longitude, locationInfo.altitude, locationInfo.accuracy, locationInfo.bearing, locationInfo.speed);
                    arrayList2.add(new v10(s58, locationInfo.time));
                    i19++;
                    length = length;
                    j103 = j103;
                    locationInfoArr = locationInfoArr;
                    location2 = location3;
                    Protos.Attaches.Attach attach5 = attach;
                }
                j102 = j103;
                location = location2;
                list = arrayList2;
            }
            obj10.e = list;
            Protos.Attaches.Attach.Location location4 = location;
            obj10.f = location4.deviceId;
            obj10.g = location4.zoom;
            obj10.h = location4.corrupted;
            Protos.Attaches.LocationInfo locationInfo2 = location4.lastLocation;
            if (locationInfo2 != null) {
                obj10.i = new v10(new s58(locationInfo2.latitude, locationInfo2.longitude, locationInfo2.altitude, locationInfo2.accuracy, locationInfo2.bearing, locationInfo2.speed), locationInfo2.time);
            }
            j10 = j102;
            j10.v = obj10.a();
        } else {
            j10 = obj;
        }
        int i21 = attach.processingOnServerStatus;
        j10.w = i21 != 1 ? i21 != 2 ? z10.a : z10.c : z10.b;
        return j10.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ru.ok.tamtam.nano.Protos.Attaches.Attach d(defpackage.l20 r15) {
        /*
            r0 = 1
            ru.ok.tamtam.nano.Protos$Attaches$Attach r1 = new ru.ok.tamtam.nano.Protos$Attaches$Attach
            r1.<init>()
            long r2 = r15.o
            r1.lastErrorTime = r2
            float r2 = r15.p
            r1.progressFloat = r2
            r2 = 0
            r1.progress = r2
            java.lang.String r3 = r15.q
            boolean r4 = defpackage.cvg.A(r3)
            if (r4 == 0) goto L_0x0021
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
        L_0x0021:
            r1.localId = r3
            java.lang.String r3 = ""
            java.lang.String r4 = r15.r
            if (r4 != 0) goto L_0x002a
            r4 = r3
        L_0x002a:
            r1.localPath = r4
            boolean r4 = r15.s
            r1.isDeleted = r4
            long r4 = r15.t
            r1.totalBytes = r4
            long r4 = r15.u
            r1.bytesDownloaded = r4
            long r4 = r15.v
            r1.lastModified = r4
            boolean r4 = r15.x
            r1.sensitiveContentUnlocked = r4
            boolean r4 = r15.y
            r1.sensitive = r4
            g20 r4 = r15.a
            int r4 = r4.ordinal()
            r5 = 6
            r6 = 8
            r7 = 10
            r8 = 11
            r9 = 5
            r10 = 3
            r11 = 4
            r12 = 2
            switch(r4) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0070;
                case 3: goto L_0x006e;
                case 4: goto L_0x006c;
                case 5: goto L_0x006a;
                case 6: goto L_0x0068;
                case 7: goto L_0x0066;
                case 8: goto L_0x0064;
                case 9: goto L_0x0062;
                case 10: goto L_0x0060;
                case 11: goto L_0x005d;
                case 12: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            r4 = r2
            goto L_0x0073
        L_0x005a:
            r4 = 14
            goto L_0x0073
        L_0x005d:
            r4 = 12
            goto L_0x0073
        L_0x0060:
            r4 = r8
            goto L_0x0073
        L_0x0062:
            r4 = r7
            goto L_0x0073
        L_0x0064:
            r4 = 7
            goto L_0x0073
        L_0x0066:
            r4 = r6
            goto L_0x0073
        L_0x0068:
            r4 = r5
            goto L_0x0073
        L_0x006a:
            r4 = r9
            goto L_0x0073
        L_0x006c:
            r4 = r11
            goto L_0x0073
        L_0x006e:
            r4 = r10
            goto L_0x0073
        L_0x0070:
            r4 = r12
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            r1.type = r4
            d20 r4 = r15.n
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0085
            if (r4 == r0) goto L_0x008d
            if (r4 == r12) goto L_0x008b
            if (r4 == r10) goto L_0x0089
            if (r4 == r11) goto L_0x0087
        L_0x0085:
            r4 = r2
            goto L_0x008e
        L_0x0087:
            r4 = r11
            goto L_0x008e
        L_0x0089:
            r4 = r10
            goto L_0x008e
        L_0x008b:
            r4 = r12
            goto L_0x008e
        L_0x008d:
            r4 = r0
        L_0x008e:
            r1.status = r4
            boolean r4 = r15.f()
            if (r4 == 0) goto L_0x009e
            x10 r4 = r15.b
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r4 = n(r4)
            r1.photo = r4
        L_0x009e:
            q10 r4 = r15.c
            if (r4 == 0) goto L_0x014a
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Control r13 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Control
            r13.<init>()
            p10 r14 = r4.a
            int r14 = r14.ordinal()
            switch(r14) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00b4;
                case 10: goto L_0x00b2;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r5 = r2
            goto L_0x00c4
        L_0x00b2:
            r5 = r8
            goto L_0x00c4
        L_0x00b4:
            r5 = r7
            goto L_0x00c4
        L_0x00b6:
            r5 = 9
            goto L_0x00c4
        L_0x00b9:
            r5 = r6
            goto L_0x00c4
        L_0x00bb:
            r5 = r9
            goto L_0x00c4
        L_0x00bd:
            r5 = r11
            goto L_0x00c4
        L_0x00bf:
            r5 = r10
            goto L_0x00c4
        L_0x00c1:
            r5 = r12
            goto L_0x00c4
        L_0x00c3:
            r5 = r0
        L_0x00c4:
            r13.event = r5
            long r5 = r4.b
            r13.userId = r5
            java.util.ArrayList r5 = r4.c
            long[] r5 = defpackage.cjf.i(r5)
            r13.userIds = r5
            java.lang.String r5 = r4.d
            if (r5 != 0) goto L_0x00d7
            r5 = r3
        L_0x00d7:
            r13.title = r5
            java.lang.String r5 = r4.e
            if (r5 != 0) goto L_0x00de
            r5 = r3
        L_0x00de:
            r13.iconToken = r5
            java.lang.String r5 = r4.f
            if (r5 != 0) goto L_0x00e5
            r5 = r3
        L_0x00e5:
            r13.url = r5
            java.lang.String r5 = r4.g
            if (r5 != 0) goto L_0x00ec
            r5 = r3
        L_0x00ec:
            r13.fullUrl = r5
            a20 r5 = r4.h
            if (r5 == 0) goto L_0x0109
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect
            r6.<init>()
            r13.crop = r6
            float r7 = r5.b
            r6.left = r7
            float r7 = r5.c
            r6.top = r7
            float r7 = r5.d
            r6.right = r7
            float r5 = r5.e
            r6.bottom = r5
        L_0x0109:
            java.lang.String r5 = r4.i
            if (r5 != 0) goto L_0x010e
            r5 = r3
        L_0x010e:
            r13.message = r5
            java.lang.String r5 = r4.j
            if (r5 != 0) goto L_0x0115
            r5 = r3
        L_0x0115:
            r13.shortMessage = r5
            boolean r5 = r4.k
            r13.showHistory = r5
            int r5 = r4.l
            if (r5 == 0) goto L_0x0139
            int r5 = defpackage.tr1.y(r5)
            if (r5 == r0) goto L_0x0137
            if (r5 == r12) goto L_0x0134
            if (r5 == r10) goto L_0x0131
            if (r5 == r11) goto L_0x012e
            r13.chatType = r2
            goto L_0x0139
        L_0x012e:
            r13.chatType = r10
            goto L_0x0139
        L_0x0131:
            r13.chatType = r12
            goto L_0x0139
        L_0x0134:
            r13.chatType = r0
            goto L_0x0139
        L_0x0137:
            r13.chatType = r11
        L_0x0139:
            long r5 = r4.m
            r13.pinnedMessageId = r5
            long r5 = r4.n
            r13.pinnedMessageServerId = r5
            java.lang.String r4 = r4.o
            if (r4 != 0) goto L_0x0146
            r4 = r3
        L_0x0146:
            r13.startPayload = r4
            r1.control = r13
        L_0x014a:
            boolean r4 = r15.i()
            if (r4 == 0) goto L_0x01de
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video
            r4.<init>()
            k20 r5 = r15.d
            long r6 = r5.a
            r4.videoId = r6
            long r6 = r5.b
            int r6 = (int) r6
            r4.duration = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x0165
            r6 = r3
        L_0x0165:
            r4.thumbnail = r6
            int r6 = r5.d
            r4.width = r6
            int r6 = r5.e
            r4.height = r6
            boolean r6 = r5.f
            r4.live = r6
            java.lang.String r6 = r5.g
            if (r6 != 0) goto L_0x0178
            r6 = r3
        L_0x0178:
            r4.externalUrl = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x017f
            r6 = r3
        L_0x017f:
            r4.externalSiteName = r6
            byte[] r6 = r5.i
            if (r6 == 0) goto L_0x0187
            r4.previewData = r6
        L_0x0187:
            long r6 = r5.j
            r4.startTime = r6
            java.lang.String r6 = r5.l
            if (r6 != 0) goto L_0x0190
            r6 = r3
        L_0x0190:
            r4.token = r6
            boolean r6 = r5.n
            r4.ignoreAutoplay = r6
            int r6 = r5.o
            r4.audioTrackIndex = r6
            int r6 = r5.p
            r4.audioGroupIndex = r6
            j20 r6 = r5.k
            if (r6 == 0) goto L_0x01bb
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions r7 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions
            r7.<init>()
            float r8 = r6.a
            r7.startTrimPosition = r8
            float r8 = r6.b
            r7.endTrimPosition = r8
            qac r8 = r6.c
            int r8 = r8.b
            r7.qualityValue = r8
            boolean r6 = r6.d
            r7.mute = r6
            r4.convertOptions = r7
        L_0x01bb:
            zy r5 = r5.m
            if (r5 == 0) goto L_0x01dc
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage
            r6.<init>()
            java.lang.Object r7 = r5.w
            java.lang.String r7 = (java.lang.String) r7
            r6.url = r7
            int r7 = r5.b
            r6.frequency = r7
            int r7 = r5.c
            r6.height = r7
            int r7 = r5.o
            r6.width = r7
            int r5 = r5.v
            r6.count = r5
            r4.videoCollage = r6
        L_0x01dc:
            r1.video = r4
        L_0x01de:
            boolean r4 = r15.a()
            if (r4 == 0) goto L_0x023a
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio
            r4.<init>()
            i10 r5 = r15.e
            long r6 = r5.a
            r4.audioId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x01f4
            r6 = r3
        L_0x01f4:
            r4.url = r6
            long r6 = r5.c
            r4.duration = r6
            byte[] r6 = r5.d
            if (r6 == 0) goto L_0x0200
            r4.wave = r6
        L_0x0200:
            java.lang.String r6 = r5.f
            if (r6 == 0) goto L_0x0206
            r4.transcription = r6
        L_0x0206:
            int r6 = r5.i
            if (r6 == 0) goto L_0x0229
            int r6 = defpackage.tr1.y(r6)
            if (r6 == 0) goto L_0x0227
            if (r6 == r0) goto L_0x0224
            if (r6 == r12) goto L_0x0221
            if (r6 == r10) goto L_0x021e
            if (r6 == r11) goto L_0x021b
            r4.transcriptionStatus = r2
            goto L_0x0229
        L_0x021b:
            r4.transcriptionStatus = r11
            goto L_0x0229
        L_0x021e:
            r4.transcriptionStatus = r10
            goto L_0x0229
        L_0x0221:
            r4.transcriptionStatus = r12
            goto L_0x0229
        L_0x0224:
            r4.transcriptionStatus = r0
            goto L_0x0229
        L_0x0227:
            r4.transcriptionStatus = r2
        L_0x0229:
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x022e
            r6 = r3
        L_0x022e:
            r4.token = r6
            long r6 = r5.g
            r4.startTime = r6
            long r5 = r5.h
            r4.lastStartTimeUpdateTimestamp = r5
            r1.audio = r4
        L_0x023a:
            boolean r4 = r15.h()
            if (r4 == 0) goto L_0x02be
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker
            r4.<init>()
            f20 r5 = r15.f
            long r6 = r5.a
            r4.stickerId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x0250
            r6 = r3
        L_0x0250:
            r4.url = r6
            int r6 = r5.c
            r4.width = r6
            int r6 = r5.d
            r4.height = r6
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x025f
            r6 = r3
        L_0x025f:
            r4.mp4Url = r6
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x0266
            r6 = r3
        L_0x0266:
            r4.firstUrl = r6
            java.util.List r6 = r5.g
            int r7 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.tags = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x027d
            r6 = r3
        L_0x027d:
            r4.previewUrl = r6
            long r6 = r5.i
            r4.updateTime = r6
            int r6 = r5.j
            if (r6 == 0) goto L_0x029a
            int r6 = defpackage.tr1.y(r6)
            if (r6 == r0) goto L_0x0297
            if (r6 == r12) goto L_0x0295
            if (r6 == r10) goto L_0x0293
            r6 = r2
            goto L_0x0298
        L_0x0293:
            r6 = r11
            goto L_0x0298
        L_0x0295:
            r6 = r12
            goto L_0x0298
        L_0x0297:
            r6 = r0
        L_0x0298:
            r4.stickerType = r6
        L_0x029a:
            long r6 = r5.k
            r4.setId = r6
            java.lang.String r6 = r5.l
            if (r6 != 0) goto L_0x02a3
            r6 = r3
        L_0x02a3:
            r4.lottieUrl = r6
            boolean r6 = r5.m
            r4.audio = r6
            int r5 = r5.n
            if (r5 == 0) goto L_0x02bc
            int r5 = defpackage.tr1.y(r5)
            if (r5 == r0) goto L_0x02b9
            if (r5 == r12) goto L_0x02b7
            r5 = r2
            goto L_0x02ba
        L_0x02b7:
            r5 = r12
            goto L_0x02ba
        L_0x02b9:
            r5 = r0
        L_0x02ba:
            r4.authorType = r5
        L_0x02bc:
            r1.sticker = r4
        L_0x02be:
            boolean r4 = r15.g()
            if (r4 == 0) goto L_0x0305
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Share r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Share
            r4.<init>()
            c20 r5 = r15.g
            long r6 = r5.a
            r4.shareId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x02d4
            r6 = r3
        L_0x02d4:
            r4.url = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x02db
            r6 = r3
        L_0x02db:
            r4.title = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x02e2
            r6 = r3
        L_0x02e2:
            r4.description = r6
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x02e9
            r6 = r3
        L_0x02e9:
            r4.host = r6
            x10 r6 = r5.f
            if (r6 == 0) goto L_0x02f5
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r6 = n(r6)
            r4.image = r6
        L_0x02f5:
            l20 r6 = r5.g
            if (r6 == 0) goto L_0x02ff
            ru.ok.tamtam.nano.Protos$Attaches$Attach r6 = d(r6)
            r4.media = r6
        L_0x02ff:
            boolean r5 = r5.h
            r4.deleted = r5
            r1.share = r4
        L_0x0305:
            g10 r4 = r15.h
            if (r4 == 0) goto L_0x0334
            ru.ok.tamtam.nano.Protos$Attaches$Attach$App r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$App
            r5.<init>()
            long r6 = r4.a
            r5.appId = r6
            java.lang.String r6 = r4.b
            if (r6 == 0) goto L_0x0318
            r5.name = r6
        L_0x0318:
            java.lang.String r6 = r4.c
            if (r6 == 0) goto L_0x031e
            r5.icon = r6
        L_0x031e:
            java.lang.String r6 = r4.d
            if (r6 == 0) goto L_0x0324
            r5.message = r6
        L_0x0324:
            int r6 = r4.e
            r5.state = r6
            long r6 = r4.f
            r5.timeout = r6
            java.lang.String r4 = r4.g
            if (r4 == 0) goto L_0x0332
            r5.appState = r4
        L_0x0332:
            r1.app = r5
        L_0x0334:
            l10 r4 = r15.i
            if (r4 == 0) goto L_0x038e
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Call r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Call
            r5.<init>()
            java.lang.String r6 = r4.a
            r5.conversationId = r6
            int r6 = r4.c
            if (r6 == 0) goto L_0x0356
            int r6 = defpackage.tr1.y(r6)
            if (r6 == r0) goto L_0x0353
            if (r6 == r12) goto L_0x0350
            r5.callType = r2
            goto L_0x0358
        L_0x0350:
            r5.callType = r12
            goto L_0x0358
        L_0x0353:
            r5.callType = r0
            goto L_0x0358
        L_0x0356:
            r5.callType = r2
        L_0x0358:
            int r6 = r4.d
            if (r6 == 0) goto L_0x0377
            int r6 = defpackage.tr1.y(r6)
            if (r6 == r0) goto L_0x0374
            if (r6 == r12) goto L_0x0371
            if (r6 == r10) goto L_0x036e
            if (r6 == r11) goto L_0x036b
            r5.hangupType = r2
            goto L_0x0379
        L_0x036b:
            r5.hangupType = r11
            goto L_0x0379
        L_0x036e:
            r5.hangupType = r10
            goto L_0x0379
        L_0x0371:
            r5.hangupType = r12
            goto L_0x0379
        L_0x0374:
            r5.hangupType = r0
            goto L_0x0379
        L_0x0377:
            r5.hangupType = r2
        L_0x0379:
            long r6 = r4.e
            r5.durationLong = r6
            java.util.List r6 = r4.f
            long[] r6 = defpackage.cjf.i(r6)
            r5.contactIds = r6
            java.lang.String r4 = r4.b
            if (r4 != 0) goto L_0x038a
            r4 = r3
        L_0x038a:
            r5.joinLink = r4
            r1.call = r5
        L_0x038e:
            boolean r4 = r15.c()
            if (r4 == 0) goto L_0x03bd
            ru.ok.tamtam.nano.Protos$Attaches$Attach$File r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$File
            r4.<init>()
            s10 r5 = r15.j
            long r6 = r5.a
            r4.fileId = r6
            long r6 = r5.b
            r4.size = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x03a8
            r6 = r3
        L_0x03a8:
            r4.name = r6
            l20 r6 = r5.d
            if (r6 == 0) goto L_0x03b4
            ru.ok.tamtam.nano.Protos$Attaches$Attach r6 = d(r6)
            r4.preview = r6
        L_0x03b4:
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L_0x03b9
            r5 = r3
        L_0x03b9:
            r4.token = r5
            r1.file = r4
        L_0x03bd:
            boolean r4 = r15.b()
            if (r4 == 0) goto L_0x0401
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact
            r4.<init>()
            n10 r5 = r15.k
            java.lang.String r6 = r5.a
            if (r6 != 0) goto L_0x03cf
            r6 = r3
        L_0x03cf:
            r4.vcfBody = r6
            long r6 = r5.b
            r4.contactId = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x03da
            r6 = r3
        L_0x03da:
            r4.name = r6
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x03e1
            r6 = r3
        L_0x03e1:
            r4.phone = r6
            java.lang.String r6 = r5.g
            if (r6 != 0) goto L_0x03e8
            r6 = r3
        L_0x03e8:
            r4.photoUrl = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x03ef
            r6 = r3
        L_0x03ef:
            r4.localPhotoUrl = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x03f6
            r6 = r3
        L_0x03f6:
            r4.firstName = r6
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L_0x03fd
            r5 = r3
        L_0x03fd:
            r4.lastName = r5
            r1.contact = r4
        L_0x0401:
            y10 r4 = r15.l
            if (r4 == 0) goto L_0x043e
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Present r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Present
            r5.<init>()
            long r6 = r4.a
            r5.presentId = r6
            long r6 = r4.b
            r5.metadataId = r6
            long r6 = r4.c
            r5.senderId = r6
            long r6 = r4.d
            r5.receiverId = r6
            int r6 = r4.e
            int r6 = defpackage.tr1.y(r6)
            if (r6 == r0) goto L_0x0432
            if (r6 == r12) goto L_0x0430
            if (r6 == r10) goto L_0x042e
            if (r6 == r11) goto L_0x0433
            if (r6 == r9) goto L_0x042c
            r9 = r2
            goto L_0x0433
        L_0x042c:
            r9 = r11
            goto L_0x0433
        L_0x042e:
            r9 = r10
            goto L_0x0433
        L_0x0430:
            r9 = r12
            goto L_0x0433
        L_0x0432:
            r9 = r0
        L_0x0433:
            r5.status = r9
            java.lang.String r4 = r4.f
            if (r4 != 0) goto L_0x043a
            r4 = r3
        L_0x043a:
            r5.presentJson = r4
            r1.present = r5
        L_0x043e:
            boolean r4 = r15.e()
            if (r4 == 0) goto L_0x04ae
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Location r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Location
            r4.<init>()
            u10 r5 = r15.m
            s58 r6 = r5.a
            double r7 = r6.a
            r4.latitude = r7
            double r7 = r6.b
            r4.longitude = r7
            double r7 = r6.c
            r4.altitude = r7
            float r7 = r6.o
            r4.accuracy = r7
            float r7 = r6.v
            r4.bearing = r7
            float r6 = r6.w
            r4.speed = r6
            long r6 = r5.b
            r4.livePeriod = r6
            long r6 = r5.c
            r4.startTime = r6
            long r6 = r5.d
            r4.endTime = r6
            java.util.List r6 = r5.e
            if (r6 == 0) goto L_0x0492
            int r7 = r6.size()
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo[] r7 = new ru.ok.tamtam.nano.Protos.Attaches.LocationInfo[r7]
            r8 = r2
        L_0x047c:
            int r9 = r6.size()
            if (r8 >= r9) goto L_0x0490
            java.lang.Object r9 = r6.get(r8)
            v10 r9 = (defpackage.v10) r9
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r9 = l(r9)
            r7[r8] = r9
            int r8 = r8 + r0
            goto L_0x047c
        L_0x0490:
            r4.track = r7
        L_0x0492:
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x0497
            goto L_0x0498
        L_0x0497:
            r3 = r6
        L_0x0498:
            r4.deviceId = r3
            float r3 = r5.g
            r4.zoom = r3
            boolean r3 = r5.h
            r4.corrupted = r3
            v10 r3 = r5.i
            if (r3 == 0) goto L_0x04ac
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r3 = l(r3)
            r4.lastLocation = r3
        L_0x04ac:
            r1.location = r4
        L_0x04ae:
            z10 r15 = r15.w
            int r15 = r15.ordinal()
            if (r15 == r0) goto L_0x04bb
            if (r15 == r12) goto L_0x04ba
            r0 = r2
            goto L_0x04bb
        L_0x04ba:
            r0 = r12
        L_0x04bb:
            r1.processingOnServerStatus = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.b.d(l20):ru.ok.tamtam.nano.Protos$Attaches$Attach");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m20] */
    public static w28 e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        Protos.Attaches attaches2 = attaches;
        ? obj = new Object();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches2.keyboard;
        if (inlineKeyboard2 != null) {
            obj.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches2.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i];
                if (replyButtons != null) {
                    arrayList.add(new h2d());
                    int i2 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i2 >= replyButtonArr.length) {
                            break;
                        }
                        Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i2];
                        if (replyButton != null) {
                            h2d h2d = (h2d) arrayList.get(i);
                            int i3 = replyButton.type;
                            d2d d2d = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? d2d.UNKNOWN : d2d.LOCATION : d2d.CONTACT : d2d.IMAGE : d2d.MESSAGE;
                            int i4 = replyButton.intent;
                            b2d b2d = i4 != 0 ? i4 != 1 ? i4 != 2 ? b2d.o : b2d.c : b2d.b : b2d.a;
                            Protos.Attaches.Attach.Photo photo = replyButton.image;
                            h2d.add(new f2d(d2d, b2d, replyButton.text, photo != null ? m(photo) : null, replyButton.outgoingMessageId));
                        }
                        i2++;
                    }
                }
                i++;
            }
            obj.c = new i2d(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches2.attach) {
            if (obj.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                obj.a(c(attach));
            } else {
                obj.b = k(inlineKeyboard);
            }
        }
        return obj.c();
    }

    public static Protos.Attaches f(w28 w28) {
        String str;
        int i;
        w28 w282 = w28;
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) w282.b).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i2 = 0; i2 < size; i2++) {
            attachArr[i2] = d(w282.F(i2));
        }
        attaches.attach = attachArr;
        String str2 = "";
        zf7 zf7 = (zf7) w282.c;
        if (zf7 != null) {
            Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
            ArrayList arrayList = new ArrayList();
            for (List<xv0> it : zf7.a) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (xv0 xv0 : it) {
                    Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                    int y = tr1.y(xv0.c);
                    button.intent = y != 0 ? y != 1 ? y != 2 ? 3 : 2 : 1 : 0;
                    switch (xv0.b.ordinal()) {
                        case 0:
                            i = 0;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 7;
                            break;
                        case 6:
                            i = 6;
                            break;
                        default:
                            i = 4;
                            break;
                    }
                    button.type = i;
                    String str3 = xv0.a;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    button.title = str3;
                    String str4 = xv0.o;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    button.url = str4;
                    String str5 = xv0.v;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    button.payload = str5;
                    button.showLoading = xv0.y;
                    button.quickLocation = xv0.w;
                    button.contactId = xv0.x;
                    arrayList2.add(button);
                    str2 = str2;
                }
            }
            str = str2;
            Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList.size()];
            Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList.get(i3)).toArray(buttonArr);
                buttonsArr[i3] = buttons;
            }
            inlineKeyboard.buttons = buttonsArr;
            String str6 = zf7.b;
            if (str6 == null) {
                str6 = str;
            }
            inlineKeyboard.callbackId = str6;
            attaches.keyboard = inlineKeyboard;
        } else {
            str = str2;
        }
        i2d i2d = (i2d) w282.o;
        if (i2d != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList arrayList3 = new ArrayList();
            for (List<f2d> it2 : i2d.a) {
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(arrayList4);
                for (f2d f2d : it2) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int ordinal = f2d.b.ordinal();
                    replyButton.intent = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 3 : 2 : 1 : 0;
                    int ordinal2 = f2d.a.ordinal();
                    replyButton.type = ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? 3 : 2 : 1 : 0;
                    String str7 = f2d.c;
                    if (str7 == null) {
                        str7 = str;
                    }
                    replyButton.text = str7;
                    replyButton.outgoingMessageId = f2d.e;
                    x10 x10 = f2d.d;
                    if (x10 != null) {
                        replyButton.image = n(x10);
                    }
                    arrayList4.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList3.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList3.get(i4)).toArray(replyButtonArr);
                replyButtonsArr[i4] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = i2d.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static z62 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        ArrayList arrayList = null;
        f72 i2 = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk i3 : chunkArr) {
                f72 i4 = i(i3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(i4);
            }
        }
        return new z62(i2, i, j, j2, arrayList == null ? Collections.emptyList() : arrayList);
    }

    public static Protos.Chat.ChatMedia h(z62 z62) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        chatMedia.firstMessageId = z62.c;
        chatMedia.lastMessageId = z62.d;
        chatMedia.totalCount = z62.b;
        f72 f72 = z62.a;
        if (f72 != null) {
            chatMedia.chunk = j(f72);
        }
        List list = z62.e;
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((f72) list.get(i));
            }
        }
        return chatMedia;
    }

    public static f72 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            z68.o("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            z68.o("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        return new f72(j, j2);
    }

    public static Protos.Chat.Chunk j(f72 f72) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = f72.a;
        chunk.endTime = f72.b;
        return chunk;
    }

    public static zf7 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = inlineKeyboard;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard2.buttons;
            if (i < buttonsArr.length) {
                Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
                arrayList.add(new ArrayList());
                int i2 = 0;
                while (true) {
                    Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                    if (i2 >= buttonArr.length) {
                        break;
                    }
                    Protos.Attaches.Attach.Button button = buttonArr[i2];
                    ew0 ew0 = (ew0) arrayList.get(i);
                    int i3 = button.type;
                    int i4 = 3;
                    fw0 fw0 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? fw0.UNKNOWN : fw0.OPEN_APP : fw0.MESSAGE : fw0.CHAT : fw0.REQUEST_GEO_LOCATION : fw0.REQUEST_CONTACT : fw0.LINK : fw0.CALLBACK;
                    int i5 = button.intent;
                    if (i5 == 0) {
                        i4 = 1;
                    } else if (i5 == 1) {
                        i4 = 2;
                    } else if (i5 != 2) {
                        i4 = 4;
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    uv0 uv0 = new uv0(str, fw0, i4);
                    uv0.d = str2;
                    uv0.e = str3;
                    uv0.h = j;
                    uv0.f = z;
                    uv0.g = z2;
                    ew0.add(new xv0(uv0));
                    i2++;
                    i = i;
                }
                i++;
            } else {
                int i6 = zf7.c;
                yf7 yf7 = new yf7();
                yf7.a = arrayList;
                yf7.b = inlineKeyboard2.callbackId;
                return new zf7(yf7);
            }
        }
    }

    public static Protos.Attaches.LocationInfo l(v10 v10) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        s58 s58 = v10.a;
        locationInfo.latitude = s58.a;
        locationInfo.longitude = s58.b;
        locationInfo.altitude = s58.c;
        locationInfo.accuracy = s58.o;
        locationInfo.bearing = s58.v;
        locationInfo.speed = s58.w;
        locationInfo.time = v10.b;
        return locationInfo;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [w10, java.lang.Object] */
    public static x10 m(Protos.Attaches.Attach.Photo photo) {
        x10 x10 = x10.Z;
        ? obj = new Object();
        obj.a = photo.baseUrl;
        obj.b = photo.photoUrl;
        obj.c = photo.width;
        obj.d = photo.height;
        obj.e = photo.gif;
        obj.f = photo.previewData;
        obj.g = photo.photoToken;
        obj.h = photo.photoId;
        obj.i = photo.mp4Url;
        obj.k = cvg.A(photo.previewUrl) ? null : photo.previewUrl;
        obj.j = photo.externalGifId;
        return obj.a();
    }

    public static Protos.Attaches.Attach.Photo n(x10 x10) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = x10.a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        photo.baseUrl = str;
        String str3 = x10.b;
        if (str3 == null) {
            str3 = str2;
        }
        photo.photoUrl = str3;
        photo.width = x10.c;
        photo.height = x10.o;
        photo.gif = x10.v;
        byte[] bArr = x10.w;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        String str4 = x10.Y;
        if (str4 == null) {
            str4 = str2;
        }
        photo.previewUrl = str4;
        String str5 = x10.x;
        if (str5 == null) {
            str5 = str2;
        }
        photo.photoToken = str5;
        photo.photoId = x10.y;
        String str6 = x10.z;
        if (str6 == null) {
            str6 = str2;
        }
        photo.mp4Url = str6;
        String str7 = x10.X;
        if (str7 != null) {
            str2 = str7;
        }
        photo.externalGifId = str2;
        return photo;
    }

    public static int o(int i) {
        int y = tr1.y(i);
        int i2 = 1;
        if (y != 1) {
            i2 = 2;
            if (y != 2) {
                i2 = 3;
                if (y != 3) {
                    i2 = 4;
                    if (y != 4) {
                        i2 = 5;
                        if (y != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
