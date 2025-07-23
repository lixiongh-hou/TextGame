package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u00a2\u0006\u0002\u0010@J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010+H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010-H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u000103H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u000105H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u000109H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010;H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010=H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010?H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00fe\u0002\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?H\u00c6\u0001J\u0016\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001H\u00d6\u0001J\u000b\u0010\u00a4\u0001\u001a\u00030\u00a5\u0001H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010*\u001a\u0004\u0018\u00010+\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0013\u0010,\u001a\u0004\u0018\u00010-\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0013\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0013\u00100\u001a\u0004\u0018\u000101\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0013\u00102\u001a\u0004\u0018\u000103\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u00104\u001a\u0004\u0018\u000105\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0013\u00106\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0013\u00108\u001a\u0004\u0018\u000109\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0013\u0010:\u001a\u0004\u0018\u00010;\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0013\u0010<\u001a\u0004\u0018\u00010=\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0013\u0010>\u001a\u0004\u0018\u00010?\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010~\u00a8\u0006\u00a6\u0001"}, d2 = {"Lcom/sq/common_module/common/bean/LifeData;", "", "chenlian", "Lcom/sq/common_module/common/bean/Chenlian;", "chuanyi", "Lcom/sq/common_module/common/bean/Chuanyi;", "diaoyu", "Lcom/sq/common_module/common/bean/Diaoyu;", "fangshai", "Lcom/sq/common_module/common/bean/Fangshai;", "fenghan", "Lcom/sq/common_module/common/bean/Fenghan;", "fengzheng", "Lcom/sq/common_module/common/bean/Fengzheng;", "ganmao", "Lcom/sq/common_module/common/bean/Ganmao;", "ganzao", "Lcom/sq/common_module/common/bean/Ganzao;", "guangjie", "Lcom/sq/common_module/common/bean/Guangjie;", "guomin", "Lcom/sq/common_module/common/bean/Guomin;", "huachuan", "Lcom/sq/common_module/common/bean/Huachuan;", "huazhuang", "Lcom/sq/common_module/common/bean/Huazhuang;", "jiaotong", "Lcom/sq/common_module/common/bean/Jiaotong;", "kongtiao", "Lcom/sq/common_module/common/bean/Kongtiao;", "kouzhao", "Lcom/sq/common_module/common/bean/Kouzhao;", "liangshai", "Lcom/sq/common_module/common/bean/Liangshai;", "lukuang", "Lcom/sq/common_module/common/bean/Lukuang;", "lvyou", "Lcom/sq/common_module/common/bean/Lvyou;", "meifa", "Lcom/sq/common_module/common/bean/Meifa;", "pijiu", "Lcom/sq/common_module/common/bean/Pijiu;", "shushidu", "Lcom/sq/common_module/common/bean/Shushidu;", "taiyangjing", "Lcom/sq/common_module/common/bean/Taiyangjing;", "wuran", "Lcom/sq/common_module/common/bean/Wuran;", "xiche", "Lcom/sq/common_module/common/bean/Xiche;", "xinqing", "Lcom/sq/common_module/common/bean/Xinqing;", "yeshenghuo", "Lcom/sq/common_module/common/bean/Yeshenghuo;", "yuehui", "Lcom/sq/common_module/common/bean/Yuehui;", "yundong", "Lcom/sq/common_module/common/bean/Yundong;", "yusan", "Lcom/sq/common_module/common/bean/Yusan;", "zhongshu", "Lcom/sq/common_module/common/bean/Zhongshu;", "ziwaixian", "Lcom/sq/common_module/common/bean/Ziwaixian;", "(Lcom/sq/common_module/common/bean/Chenlian;Lcom/sq/common_module/common/bean/Chuanyi;Lcom/sq/common_module/common/bean/Diaoyu;Lcom/sq/common_module/common/bean/Fangshai;Lcom/sq/common_module/common/bean/Fenghan;Lcom/sq/common_module/common/bean/Fengzheng;Lcom/sq/common_module/common/bean/Ganmao;Lcom/sq/common_module/common/bean/Ganzao;Lcom/sq/common_module/common/bean/Guangjie;Lcom/sq/common_module/common/bean/Guomin;Lcom/sq/common_module/common/bean/Huachuan;Lcom/sq/common_module/common/bean/Huazhuang;Lcom/sq/common_module/common/bean/Jiaotong;Lcom/sq/common_module/common/bean/Kongtiao;Lcom/sq/common_module/common/bean/Kouzhao;Lcom/sq/common_module/common/bean/Liangshai;Lcom/sq/common_module/common/bean/Lukuang;Lcom/sq/common_module/common/bean/Lvyou;Lcom/sq/common_module/common/bean/Meifa;Lcom/sq/common_module/common/bean/Pijiu;Lcom/sq/common_module/common/bean/Shushidu;Lcom/sq/common_module/common/bean/Taiyangjing;Lcom/sq/common_module/common/bean/Wuran;Lcom/sq/common_module/common/bean/Xiche;Lcom/sq/common_module/common/bean/Xinqing;Lcom/sq/common_module/common/bean/Yeshenghuo;Lcom/sq/common_module/common/bean/Yuehui;Lcom/sq/common_module/common/bean/Yundong;Lcom/sq/common_module/common/bean/Yusan;Lcom/sq/common_module/common/bean/Zhongshu;Lcom/sq/common_module/common/bean/Ziwaixian;)V", "getChenlian", "()Lcom/sq/common_module/common/bean/Chenlian;", "getChuanyi", "()Lcom/sq/common_module/common/bean/Chuanyi;", "getDiaoyu", "()Lcom/sq/common_module/common/bean/Diaoyu;", "getFangshai", "()Lcom/sq/common_module/common/bean/Fangshai;", "getFenghan", "()Lcom/sq/common_module/common/bean/Fenghan;", "getFengzheng", "()Lcom/sq/common_module/common/bean/Fengzheng;", "getGanmao", "()Lcom/sq/common_module/common/bean/Ganmao;", "getGanzao", "()Lcom/sq/common_module/common/bean/Ganzao;", "getGuangjie", "()Lcom/sq/common_module/common/bean/Guangjie;", "getGuomin", "()Lcom/sq/common_module/common/bean/Guomin;", "getHuachuan", "()Lcom/sq/common_module/common/bean/Huachuan;", "getHuazhuang", "()Lcom/sq/common_module/common/bean/Huazhuang;", "getJiaotong", "()Lcom/sq/common_module/common/bean/Jiaotong;", "getKongtiao", "()Lcom/sq/common_module/common/bean/Kongtiao;", "getKouzhao", "()Lcom/sq/common_module/common/bean/Kouzhao;", "getLiangshai", "()Lcom/sq/common_module/common/bean/Liangshai;", "getLukuang", "()Lcom/sq/common_module/common/bean/Lukuang;", "getLvyou", "()Lcom/sq/common_module/common/bean/Lvyou;", "getMeifa", "()Lcom/sq/common_module/common/bean/Meifa;", "getPijiu", "()Lcom/sq/common_module/common/bean/Pijiu;", "getShushidu", "()Lcom/sq/common_module/common/bean/Shushidu;", "getTaiyangjing", "()Lcom/sq/common_module/common/bean/Taiyangjing;", "getWuran", "()Lcom/sq/common_module/common/bean/Wuran;", "getXiche", "()Lcom/sq/common_module/common/bean/Xiche;", "getXinqing", "()Lcom/sq/common_module/common/bean/Xinqing;", "getYeshenghuo", "()Lcom/sq/common_module/common/bean/Yeshenghuo;", "getYuehui", "()Lcom/sq/common_module/common/bean/Yuehui;", "getYundong", "()Lcom/sq/common_module/common/bean/Yundong;", "getYusan", "()Lcom/sq/common_module/common/bean/Yusan;", "getZhongshu", "()Lcom/sq/common_module/common/bean/Zhongshu;", "getZiwaixian", "()Lcom/sq/common_module/common/bean/Ziwaixian;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_module_release"})
public final class LifeData {
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Chenlian chenlian = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Chuanyi chuanyi = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Diaoyu diaoyu = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Fangshai fangshai = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Fenghan fenghan = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Fengzheng fengzheng = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Ganmao ganmao = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Ganzao ganzao = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Guangjie guangjie = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Guomin guomin = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Huachuan huachuan = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Huazhuang huazhuang = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Jiaotong jiaotong = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Kongtiao kongtiao = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Kouzhao kouzhao = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Liangshai liangshai = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Lukuang lukuang = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Lvyou lvyou = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Meifa meifa = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Pijiu pijiu = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Shushidu shushidu = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Taiyangjing taiyangjing = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Wuran wuran = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Xiche xiche = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Xinqing xinqing = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Yeshenghuo yeshenghuo = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Yuehui yuehui = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Yundong yundong = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Yusan yusan = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Zhongshu zhongshu = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Ziwaixian ziwaixian = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.LifeData copy(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Chenlian chenlian, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Chuanyi chuanyi, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Diaoyu diaoyu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fangshai fangshai, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fenghan fenghan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fengzheng fengzheng, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ganmao ganmao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ganzao ganzao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Guangjie guangjie, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Guomin guomin, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Huachuan huachuan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Huazhuang huazhuang, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Jiaotong jiaotong, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Kongtiao kongtiao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Kouzhao kouzhao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Liangshai liangshai, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Lukuang lukuang, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Lvyou lvyou, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Meifa meifa, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Pijiu pijiu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Shushidu shushidu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Taiyangjing taiyangjing, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Wuran wuran, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Xiche xiche, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Xinqing xinqing, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yeshenghuo yeshenghuo, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yuehui yuehui, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yundong yundong, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yusan yusan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Zhongshu zhongshu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ziwaixian ziwaixian) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public LifeData(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Chenlian chenlian, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Chuanyi chuanyi, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Diaoyu diaoyu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fangshai fangshai, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fenghan fenghan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Fengzheng fengzheng, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ganmao ganmao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ganzao ganzao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Guangjie guangjie, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Guomin guomin, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Huachuan huachuan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Huazhuang huazhuang, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Jiaotong jiaotong, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Kongtiao kongtiao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Kouzhao kouzhao, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Liangshai liangshai, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Lukuang lukuang, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Lvyou lvyou, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Meifa meifa, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Pijiu pijiu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Shushidu shushidu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Taiyangjing taiyangjing, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Wuran wuran, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Xiche xiche, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Xinqing xinqing, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yeshenghuo yeshenghuo, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yuehui yuehui, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yundong yundong, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Yusan yusan, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Zhongshu zhongshu, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Ziwaixian ziwaixian) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Chenlian component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Chenlian getChenlian() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Chuanyi component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Chuanyi getChuanyi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Diaoyu component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Diaoyu getDiaoyu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fangshai component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fangshai getFangshai() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fenghan component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fenghan getFenghan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fengzheng component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Fengzheng getFengzheng() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ganmao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ganmao getGanmao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ganzao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ganzao getGanzao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Guangjie component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Guangjie getGuangjie() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Guomin component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Guomin getGuomin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Huachuan component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Huachuan getHuachuan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Huazhuang component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Huazhuang getHuazhuang() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Jiaotong component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Jiaotong getJiaotong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Kongtiao component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Kongtiao getKongtiao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Kouzhao component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Kouzhao getKouzhao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Liangshai component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Liangshai getLiangshai() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Lukuang component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Lukuang getLukuang() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Lvyou component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Lvyou getLvyou() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Meifa component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Meifa getMeifa() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Pijiu component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Pijiu getPijiu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Shushidu component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Shushidu getShushidu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Taiyangjing component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Taiyangjing getTaiyangjing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Wuran component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Wuran getWuran() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Xiche component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Xiche getXiche() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Xinqing component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Xinqing getXinqing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yeshenghuo component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yeshenghuo getYeshenghuo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yuehui component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yuehui getYuehui() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yundong component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yundong getYundong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yusan component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Yusan getYusan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Zhongshu component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Zhongshu getZhongshu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ziwaixian component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Ziwaixian getZiwaixian() {
        return null;
    }
}