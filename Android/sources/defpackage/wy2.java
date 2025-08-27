package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: wy2  reason: default package */
public final class wy2 {
    public final xt4 a;

    public wy2(xt4 xt4) {
        this.a = xt4;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [sr7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v4, types: [u62, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v17, types: [java.lang.Object, j8] */
    /* JADX WARNING: type inference failed for: r7v31, types: [java.lang.Object, c72] */
    public final m72 a(byte[] bArr) {
        l72 l72;
        ArrayList arrayList;
        Map<Long, Protos.Chat.AdminParticipant> map;
        byte[] bArr2 = b.a;
        try {
            Protos.Chat chat = (Protos.Chat) ad9.mergeFrom(new Protos.Chat(), bArr);
            w62 w62 = new w62();
            w62.a = chat.serverId;
            int i = chat.type;
            if (i != 0) {
                l72 = l72.b;
                if (i != 1) {
                    if (i == 2) {
                        l72 = l72.c;
                    } else if (i == 3) {
                        l72 = l72.o;
                    }
                }
            } else {
                l72 = l72.a;
            }
            w62.b = l72;
            int i2 = chat.status;
            k72 k72 = k72.a;
            switch (i2) {
                case 1:
                    k72 = k72.b;
                    break;
                case 2:
                    k72 = k72.c;
                    break;
                case 3:
                    k72 = k72.o;
                    break;
                case 4:
                    k72 = k72.v;
                    break;
                case 5:
                    k72 = k72.w;
                    break;
                case 6:
                    k72 = k72.x;
                    break;
            }
            w62.c = k72;
            w62.d = chat.owner;
            w62.e = chat.participants;
            w62.f = chat.created;
            w62.g = chat.title;
            w62.h = chat.baseIconUrl;
            w62.i = chat.baseRawIconUrl;
            w62.j = chat.lastMessageId;
            w62.k = chat.lastEventTime;
            w62.P = chat.joinTime;
            w62.l = chat.cid;
            w62.m = chat.newMessages;
            w62.l0 = chat.markedAsUnread;
            Protos.Chat.Chunk[] chunkArr = chat.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                for (Protos.Chat.Chunk i3 : chunkArr) {
                    w62.n.a(b.i(i3), bl4.REGULAR);
                }
            }
            Protos.Chat.Chunk[] chunkArr2 = chat.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                for (Protos.Chat.Chunk i4 : chunkArr2) {
                    w62.n.a(b.i(i4), bl4.DELAYED);
                }
            }
            w62.o = chat.lastInput;
            Protos.Chat.ChatSettings chatSettings = chat.chatSettings;
            if (chatSettings != null) {
                ? obj = new Object();
                obj.c = chatSettings.lastNotifMark;
                obj.d = chatSettings.lastNotifMessageId;
                obj.a = chatSettings.dontDisturbUntil;
                int[] iArr = chatSettings.options;
                if (iArr != null && iArr.length > 0) {
                    for (int i5 : iArr) {
                        if (i5 == 0) {
                            obj.a(a72.a);
                        } else if (i5 == 1) {
                            obj.a(a72.b);
                        } else if (i5 == 2) {
                            obj.a(a72.c);
                        }
                    }
                }
                obj.e = chatSettings.favoriteIndex;
                obj.f = chatSettings.hideMyLiveLocationPanelBeforeTime;
                obj.g = chatSettings.hideLiveLocationPanelBeforeTime;
                w62.p = new d72(obj);
            }
            Protos.Chat.ChatMedia chatMedia = chat.mediaAll;
            if (chatMedia != null) {
                w62.q = b.g(chatMedia);
            }
            Protos.Chat.ChatMedia chatMedia2 = chat.mediaPhotoVideo;
            if (chatMedia2 != null) {
                w62.r = b.g(chatMedia2);
            }
            Protos.Chat.ChatMedia chatMedia3 = chat.mediaMusic;
            if (chatMedia3 != null) {
                w62.t = b.g(chatMedia3);
            }
            Protos.Chat.ChatMedia chatMedia4 = chat.mediaAudio;
            if (chatMedia4 != null) {
                w62.u = b.g(chatMedia4);
            }
            Protos.Chat.ChatMedia chatMedia5 = chat.mediaFiles;
            if (chatMedia5 != null) {
                w62.v = b.g(chatMedia5);
            }
            Protos.Chat.ChatMedia chatMedia6 = chat.mediaLocations;
            if (chatMedia6 != null) {
                w62.w = b.g(chatMedia6);
            }
            Protos.Chat.ChatMedia chatMedia7 = chat.mediaShare;
            if (chatMedia7 != null) {
                w62.s = b.g(chatMedia7);
            }
            w62.x = chat.firstMessageId;
            Protos.Chat.Section[] sectionArr = chat.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                for (Protos.Chat.Section section : sectionArr) {
                    ? obj2 = new Object();
                    obj2.c = section.id;
                    obj2.d = section.title;
                    long[] jArr = section.stickers;
                    if (jArr != null) {
                        obj2.e = cjf.h(jArr);
                    }
                    obj2.a = section.marker;
                    obj2.b = section.collapsed;
                    j72 j72 = new j72(obj2);
                    if (w62.y == null) {
                        w62.y = new ArrayList();
                    }
                    w62.y.add(j72);
                }
            }
            String[] strArr = chat.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                w62.z = Arrays.asList(strArr);
            }
            w62.A = chat.stickersSyncTime;
            int[] iArr2 = chat.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i6 : iArr2) {
                    if (i6 == 0) {
                        w62.a(x62.a);
                    } else if (i6 == 1) {
                        w62.a(x62.b);
                    } else if (i6 == 2) {
                        w62.a(x62.c);
                    } else if (i6 == 3) {
                        w62.a(x62.o);
                    }
                }
            }
            Protos.Chat.ChatSubject chatSubject = chat.chatSubject;
            if (chatSubject != null) {
                long[] jArr2 = chatSubject.organizationIds;
                if (jArr2.length > 0) {
                    w62.D = new e72(jArr2);
                }
            }
            Protos.Chat.ChannelInfo channelInfo = chat.channelInfo;
            if (channelInfo != null) {
                chat.participantsCount = channelInfo.membersCount;
                chat.description = channelInfo.description;
                chat.admins = channelInfo.admins;
                if (channelInfo.signAdmin) {
                    Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                    chatOptions.signAdmin = true;
                    chat.chatOptions = chatOptions;
                }
            }
            if (chat.participantsCount == 0 && w62.e().size() > 0) {
                chat.participantsCount = w62.e().size();
            }
            w62.G = chat.participantsCount;
            w62.H = chat.description;
            w62.I = cjf.h(chat.admins);
            long[] jArr3 = chat.admins;
            if (jArr3 == null || ((map = chat.adminParticipants) != null && jArr3.length <= map.size())) {
                w62.f(b.a(chat.adminParticipants));
            } else {
                HashMap hashMap = new HashMap();
                Map<Long, Protos.Chat.AdminParticipant> map2 = chat.adminParticipants;
                if (map2 != null) {
                    hashMap.putAll(b.a(map2));
                }
                for (long j : chat.admins) {
                    if (!hashMap.containsKey(Long.valueOf(j))) {
                        Long valueOf = Long.valueOf(j);
                        ? obj3 = new Object();
                        obj3.b = j;
                        obj3.a = 2043;
                        hashMap.put(valueOf, new v62(obj3));
                    }
                }
                w62.f(hashMap);
            }
            w62.J = chat.blockedParticipantsCount;
            Protos.Chat.ChatOptions chatOptions2 = chat.chatOptions;
            if (chatOptions2 != null) {
                if (w62.K == null) {
                    w62.K = b72.j;
                }
                boolean z = w62.K.a;
                b72 b72 = r8;
                b72 b722 = new b72(chatOptions2.signAdmin, chatOptions2.onlyOwnerCanChangeIconTitle, chatOptions2.official, chatOptions2.onlyAdminCanAddMember, chatOptions2.allCanPinMessage, chatOptions2.onlyAdminCanCall, chatOptions2.sentByPhone, chatOptions2.serviceChat, chatOptions2.membersCanSeePrivateLink);
                w62.K = b72;
            }
            int i7 = chat.accessType;
            if (i7 == 0) {
                w62.r0 = 1;
            } else if (i7 == 1) {
                w62.r0 = 2;
            }
            w62.E = chat.link;
            w62.F = new jq5(chat.restrictions, 2);
            Protos.Chat.GroupChatInfo groupChatInfo = chat.groupChatInfo;
            if (groupChatInfo != null) {
                hv6 hv6 = hv6.b;
                long j2 = groupChatInfo.groupId;
                boolean z2 = groupChatInfo.isAnswered;
                boolean z3 = groupChatInfo.isModerator;
                boolean z4 = groupChatInfo.isImportant;
                String str = groupChatInfo.name;
                String str2 = groupChatInfo.baseIconUrl;
                boolean z5 = groupChatInfo.isCustomTitle;
                boolean z6 = groupChatInfo.isMember;
                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = groupChatInfo.groupOptions;
                if (groupOptions != null) {
                    hv6 = new hv6(groupOptions.groupPremium);
                }
                hv6 hv62 = hv6;
                int i8 = groupChatInfo.messagingPermissions;
                w62.C = new h72(j2, z2, z3, z4, str, str2, z5, z6, i8 != 1 ? i8 != 2 ? 1 : 3 : 2, hv62);
            }
            w62.L = chat.pinnedMessageId;
            w62.M = chat.hidePinnedMessage;
            w62.N = chat.unreadReply;
            w62.O = chat.unreadPin;
            w62.Q = chat.messagesTtlSec;
            w62.S = chat.flagsSettings;
            Protos.Chat.VideoConversation videoConversation = chat.videoConversation;
            if (videoConversation != null) {
                w62.T = new nl(videoConversation.startedAt, videoConversation.conversationId, videoConversation.joinLink);
            }
            w62.U = chat.lastOpenPositionTime;
            w62.V = chat.lastOpenPositionOffset;
            w62.W = chat.lastOpenReadMark;
            w62.X = (int) chat.lastOpenNewMessages;
            w62.Y = chat.lastSearchClickTime;
            w62.Z = chat.lastWriteTime;
            Protos.Chat.LastInputMedia[] lastInputMediaArr = chat.lastInputMedia;
            if (lastInputMediaArr != null) {
                ArrayList arrayList2 = new ArrayList(lastInputMediaArr.length);
                for (Protos.Chat.LastInputMedia lastInputMedia : lastInputMediaArr) {
                    ? obj4 = new Object();
                    obj4.a = lastInputMedia.originalId;
                    obj4.b = lastInputMedia.originalUri;
                    obj4.c = lastInputMedia.thumbnailUri;
                    obj4.d = lastInputMedia.originalOrientation;
                    obj4.e = lastInputMedia.originalDuration;
                    obj4.f = lastInputMedia.mimeType;
                    obj4.g = lastInputMedia.dateModified;
                    obj4.h = lastInputMedia.editedUri;
                    obj4.k = lastInputMedia.attachLocalId;
                    obj4.i = lastInputMedia.type;
                    int[] iArr3 = lastInputMedia.wave;
                    if (iArr3 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int valueOf2 : iArr3) {
                            arrayList.add(Integer.valueOf(valueOf2));
                        }
                    }
                    obj4.j = arrayList;
                    arrayList2.add(new tr7(obj4));
                }
                w62.a0 = arrayList2;
            }
            w62.b0 = chat.lastInputEditMessageId;
            w62.c0 = chat.lastInputReplyMessageId;
            w62.f0 = this.a.f(chat.draft);
            w62.g0 = chat.draftUpdateTime;
            w62.h0 = chat.draftUpdateTimeForSyncLogic;
            Protos.Chat.BotsInfo botsInfo = chat.botsInfo;
            w62.d0 = botsInfo == null ? zq0.c : new zq0(botsInfo.hasBots, botsInfo.suspendedBot);
            w62.e0 = chat.modified;
            w62.j0 = chat.liveLocationMessageIds;
            w62.i0 = chat.subscribedToUpdates;
            w62.k0 = chat.lastMentionMessageId;
            w62.n0 = chat.lastReactedMessageId;
            String str3 = chat.lastReaction;
            if (cvg.A(str3)) {
                w62.o0 = null;
            } else {
                w62.o0 = str3;
            }
            Protos.Chat.PushMessage pushMessage = chat.lastPushMessage;
            if (pushMessage != null) {
                w62.m0 = new i72(pushMessage.time, pushMessage.text, pushMessage.id);
            }
            w62.q0 = chat.lastFireDelayedErrorTime;
            w62.p0 = chat.lastDelayedUpdateTime;
            return new m72(w62);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
