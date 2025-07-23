package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:35
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0003\b\u009b\u0001\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u00c6\u0001B\u0081\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020,\u0012\u0006\u00104\u001a\u00020\n\u0012\u0006\u00105\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\n\u0012\u0006\u00109\u001a\u00020\n\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\n\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010>\u001a\u00020\u0006\u0012\u0006\u0010?\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\n\u0012\u0006\u0010A\u001a\u00020\n\u0012\u0006\u0010B\u001a\u00020\u0006\u0012\u0006\u0010C\u001a\u00020\n\u0012\u0006\u0010D\u001a\u00020\n\u0012\u0006\u0010E\u001a\u00020\u0003\u00a2\u0006\u0002\u0010FJ\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0082\u0005\u0010\u00c1\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020,2\b\b\u0002\u00104\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\n2\b\b\u0002\u00109\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\n2\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\n2\b\b\u0002\u0010A\u001a\u00020\n2\b\b\u0002\u0010B\u001a\u00020\u00062\b\b\u0002\u0010C\u001a\u00020\n2\b\b\u0002\u0010D\u001a\u00020\n2\b\b\u0002\u0010E\u001a\u00020\u0003H\u00c6\u0001J\u0015\u0010\u00c2\u0001\u001a\u00020\n2\t\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00c4\u0001\u001a\u00020\u0006H\u00d6\u0001J\n\u0010\u00c5\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u00100\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0011\u00103\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010HR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010HR\u0011\u00106\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010HR\u0011\u0010/\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010JR\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0011\u00104\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010QR\u0011\u00109\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010QR\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010QR\u0011\u0010C\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010QR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010O\"\u0004\bX\u0010YR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010QR\u0011\u0010!\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010OR\u0011\u00108\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010QR\u0011\u0010<\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010QR\u0011\u0010@\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010QR\u0011\u0010A\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010QR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010QR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010QR\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010QR\u0011\u0010D\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010QR\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010HR\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010HR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010HR\u0011\u00102\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010QR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010OR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010HR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010HR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010HR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010HR\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010HR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010OR\u0011\u0010;\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010HR\u0011\u0010E\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010HR\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010HR\u0011\u0010.\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010JR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010HR\u0011\u0010B\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010OR\u001a\u0010?\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010O\"\u0004\bt\u0010YR\u001a\u0010>\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010O\"\u0004\bv\u0010YR\u0011\u00107\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010HR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010O\"\u0004\by\u0010YR\u0011\u00105\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010OR\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010HR\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010HR\u0011\u0010=\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010OR\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010HR\u0011\u00101\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010HR\u0012\u0010-\u001a\u00020,\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010JR\u0012\u0010*\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010H\u00a8\u0006\u00c7\u0001"}, d2 = {"Lcom/sq/common_module/common/bean/InitData;", "", "lowOfficialInterval", "", "lowLimit", "officialInterval", "", "lessAdInterval", "backToFrontTwice", "isLessAdLimit", "", "lessAdLimit", "Lcom/sq/common_module/common/bean/InitData$LessAdLimitBean;", "twiceOpenScreen", "IMEI", "isJlOfficial", "isAudit", "countDownSwitch", "isShowUseNotice", "isShowDiscount", "phoneService", "countDownText", "deliveryDes", "serviceTime", "myBoxNotice", "predictMaxIncome", "myDeliverNotice", "noticeText", "percentDesc", "myDeliverTips", "videoLink", "latestVersion", "latestVersionDesc", "isPopupUpdate", "updateUrl", "isShowReward", "recycleDescribe", "loginBanner", "aliAppId", "wxAppId", "gromoreAppId", "ksAppId", "ylhAppId", "adInfo", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "xxlLowInfo", "screenLowInfo", "fullAdInfo", "adInfo3", "wxTransferNotice", "lessAd", "adInfo4", "isAlive", "updateType", "downloadUrl", "toVersion", "isRealAuth", "isApplyDelete", "deleteTime", "pangleLinkAppId", "isRiskOpen", "withdrawPlatformType", "showSplashTimes", "showSplashSeconds", "isRiskOpenReward", "isRiskOpenWithdraw", "showAdType", "isAutoloadAd", "jPush", "planId", "(Ljava/lang/String;Ljava/lang/String;IIIZLcom/sq/common_module/common/bean/InitData$LessAdLimitBean;ILjava/lang/String;IZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Ljava/lang/String;ZLcom/sq/common_module/common/bean/RewardAdInfo;ZILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZIIIZZIZZLjava/lang/String;)V", "getIMEI", "()Ljava/lang/String;", "getAdInfo", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getAdInfo3", "getAdInfo4", "getAliAppId", "getBackToFrontTwice", "()I", "getCountDownSwitch", "()Z", "getCountDownText", "getDeleteTime", "getDeliveryDes", "getDownloadUrl", "getFullAdInfo", "getGromoreAppId", "setJlOfficial", "(I)V", "getJPush", "getKsAppId", "getLatestVersion", "getLatestVersionDesc", "getLessAd", "getLessAdInterval", "getLessAdLimit", "()Lcom/sq/common_module/common/bean/InitData$LessAdLimitBean;", "getLoginBanner", "getLowLimit", "getLowOfficialInterval", "getMyBoxNotice", "getMyDeliverNotice", "getMyDeliverTips", "getNoticeText", "getOfficialInterval", "getPangleLinkAppId", "getPercentDesc", "getPhoneService", "getPlanId", "getPredictMaxIncome", "getRecycleDescribe", "getScreenLowInfo", "getServiceTime", "getShowAdType", "getShowSplashSeconds", "setShowSplashSeconds", "getShowSplashTimes", "setShowSplashTimes", "getToVersion", "getTwiceOpenScreen", "setTwiceOpenScreen", "getUpdateType", "getUpdateUrl", "getVideoLink", "getWithdrawPlatformType", "getWxAppId", "getWxTransferNotice", "getXxlLowInfo", "getYlhAppId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "LessAdLimitBean", "common_module_release"})
public final class InitData {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lowOfficialInterval = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lowLimit = null;
    private final int officialInterval = 0;
    private final int lessAdInterval = 0;
    private final int backToFrontTwice = 0;
    private final boolean isLessAdLimit = false;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.InitData.LessAdLimitBean lessAdLimit = null;
    private int twiceOpenScreen;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IMEI = null;
    private int isJlOfficial;
    private final boolean isAudit = false;
    private final boolean countDownSwitch = false;
    private final boolean isShowUseNotice = false;
    private final boolean isShowDiscount = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneService = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String countDownText = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String deliveryDes = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String serviceTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String myBoxNotice = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String predictMaxIncome = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String myDeliverNotice = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String noticeText = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String percentDesc = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String myDeliverTips = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String videoLink = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String latestVersion = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String latestVersionDesc = null;
    private final int isPopupUpdate = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updateUrl = null;
    private final boolean isShowReward = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String recycleDescribe = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String loginBanner = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String aliAppId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String wxAppId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gromoreAppId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ksAppId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ylhAppId = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo adInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo xxlLowInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo screenLowInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo fullAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo adInfo3 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String wxTransferNotice = null;
    private final boolean lessAd = false;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo adInfo4 = null;
    private final boolean isAlive = false;
    private final int updateType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String downloadUrl = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String toVersion = null;
    private final boolean isRealAuth = false;
    private final boolean isApplyDelete = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String deleteTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pangleLinkAppId = null;
    private final boolean isRiskOpen = false;
    private final int withdrawPlatformType = 0;
    private int showSplashTimes;
    private int showSplashSeconds;
    private final boolean isRiskOpenReward = false;
    private final boolean isRiskOpenWithdraw = false;
    private final int showAdType = 0;
    private final boolean isAutoloadAd = false;
    private final boolean jPush = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String planId = null;
    
    /**
     * Created by town
     * Date :  2022/10/21
     * Time : 14:35
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.InitData copy(@org.jetbrains.annotations.NotNull
    java.lang.String lowOfficialInterval, @org.jetbrains.annotations.NotNull
    java.lang.String lowLimit, int officialInterval, int lessAdInterval, int backToFrontTwice, boolean isLessAdLimit, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.InitData.LessAdLimitBean lessAdLimit, int twiceOpenScreen, @org.jetbrains.annotations.NotNull
    java.lang.String IMEI, int isJlOfficial, boolean isAudit, boolean countDownSwitch, boolean isShowUseNotice, boolean isShowDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String phoneService, @org.jetbrains.annotations.NotNull
    java.lang.String countDownText, @org.jetbrains.annotations.NotNull
    java.lang.String deliveryDes, @org.jetbrains.annotations.NotNull
    java.lang.String serviceTime, @org.jetbrains.annotations.NotNull
    java.lang.String myBoxNotice, @org.jetbrains.annotations.NotNull
    java.lang.String predictMaxIncome, @org.jetbrains.annotations.NotNull
    java.lang.String myDeliverNotice, @org.jetbrains.annotations.NotNull
    java.lang.String noticeText, @org.jetbrains.annotations.NotNull
    java.lang.String percentDesc, @org.jetbrains.annotations.NotNull
    java.lang.String myDeliverTips, @org.jetbrains.annotations.NotNull
    java.lang.String videoLink, @org.jetbrains.annotations.NotNull
    java.lang.String latestVersion, @org.jetbrains.annotations.NotNull
    java.lang.String latestVersionDesc, int isPopupUpdate, @org.jetbrains.annotations.NotNull
    java.lang.String updateUrl, boolean isShowReward, @org.jetbrains.annotations.NotNull
    java.lang.String recycleDescribe, @org.jetbrains.annotations.NotNull
    java.lang.String loginBanner, @org.jetbrains.annotations.NotNull
    java.lang.String aliAppId, @org.jetbrains.annotations.NotNull
    java.lang.String wxAppId, @org.jetbrains.annotations.NotNull
    java.lang.String gromoreAppId, @org.jetbrains.annotations.NotNull
    java.lang.String ksAppId, @org.jetbrains.annotations.NotNull
    java.lang.String ylhAppId, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo xxlLowInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo screenLowInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo3, @org.jetbrains.annotations.NotNull
    java.lang.String wxTransferNotice, boolean lessAd, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo4, boolean isAlive, int updateType, @org.jetbrains.annotations.NotNull
    java.lang.String downloadUrl, @org.jetbrains.annotations.NotNull
    java.lang.String toVersion, boolean isRealAuth, boolean isApplyDelete, @org.jetbrains.annotations.NotNull
    java.lang.String deleteTime, @org.jetbrains.annotations.NotNull
    java.lang.String pangleLinkAppId, boolean isRiskOpen, int withdrawPlatformType, int showSplashTimes, int showSplashSeconds, boolean isRiskOpenReward, boolean isRiskOpenWithdraw, int showAdType, boolean isAutoloadAd, boolean jPush, @org.jetbrains.annotations.NotNull
    java.lang.String planId) {
        return null;
    }
    
    /**
     * Created by town
     * Date :  2022/10/21
     * Time : 14:35
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by town
     * Date :  2022/10/21
     * Time : 14:35
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by town
     * Date :  2022/10/21
     * Time : 14:35
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public InitData(@org.jetbrains.annotations.NotNull
    java.lang.String lowOfficialInterval, @org.jetbrains.annotations.NotNull
    java.lang.String lowLimit, int officialInterval, int lessAdInterval, int backToFrontTwice, boolean isLessAdLimit, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.InitData.LessAdLimitBean lessAdLimit, int twiceOpenScreen, @org.jetbrains.annotations.NotNull
    java.lang.String IMEI, int isJlOfficial, boolean isAudit, boolean countDownSwitch, boolean isShowUseNotice, boolean isShowDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String phoneService, @org.jetbrains.annotations.NotNull
    java.lang.String countDownText, @org.jetbrains.annotations.NotNull
    java.lang.String deliveryDes, @org.jetbrains.annotations.NotNull
    java.lang.String serviceTime, @org.jetbrains.annotations.NotNull
    java.lang.String myBoxNotice, @org.jetbrains.annotations.NotNull
    java.lang.String predictMaxIncome, @org.jetbrains.annotations.NotNull
    java.lang.String myDeliverNotice, @org.jetbrains.annotations.NotNull
    java.lang.String noticeText, @org.jetbrains.annotations.NotNull
    java.lang.String percentDesc, @org.jetbrains.annotations.NotNull
    java.lang.String myDeliverTips, @org.jetbrains.annotations.NotNull
    java.lang.String videoLink, @org.jetbrains.annotations.NotNull
    java.lang.String latestVersion, @org.jetbrains.annotations.NotNull
    java.lang.String latestVersionDesc, int isPopupUpdate, @org.jetbrains.annotations.NotNull
    java.lang.String updateUrl, boolean isShowReward, @org.jetbrains.annotations.NotNull
    java.lang.String recycleDescribe, @org.jetbrains.annotations.NotNull
    java.lang.String loginBanner, @org.jetbrains.annotations.NotNull
    java.lang.String aliAppId, @org.jetbrains.annotations.NotNull
    java.lang.String wxAppId, @org.jetbrains.annotations.NotNull
    java.lang.String gromoreAppId, @org.jetbrains.annotations.NotNull
    java.lang.String ksAppId, @org.jetbrains.annotations.NotNull
    java.lang.String ylhAppId, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo xxlLowInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo screenLowInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo3, @org.jetbrains.annotations.NotNull
    java.lang.String wxTransferNotice, boolean lessAd, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo4, boolean isAlive, int updateType, @org.jetbrains.annotations.NotNull
    java.lang.String downloadUrl, @org.jetbrains.annotations.NotNull
    java.lang.String toVersion, boolean isRealAuth, boolean isApplyDelete, @org.jetbrains.annotations.NotNull
    java.lang.String deleteTime, @org.jetbrains.annotations.NotNull
    java.lang.String pangleLinkAppId, boolean isRiskOpen, int withdrawPlatformType, int showSplashTimes, int showSplashSeconds, boolean isRiskOpenReward, boolean isRiskOpenWithdraw, int showAdType, boolean isAutoloadAd, boolean jPush, @org.jetbrains.annotations.NotNull
    java.lang.String planId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLowOfficialInterval() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLowLimit() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getOfficialInterval() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLessAdInterval() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getBackToFrontTwice() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isLessAdLimit() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.InitData.LessAdLimitBean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.InitData.LessAdLimitBean getLessAdLimit() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getTwiceOpenScreen() {
        return 0;
    }
    
    public final void setTwiceOpenScreen(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIMEI() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int isJlOfficial() {
        return 0;
    }
    
    public final void setJlOfficial(int p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean isAudit() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getCountDownSwitch() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean isShowUseNotice() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean isShowDiscount() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountDownText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeliveryDes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServiceTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMyBoxNotice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPredictMaxIncome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMyDeliverNotice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoticeText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPercentDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMyDeliverTips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVideoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLatestVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLatestVersionDesc() {
        return null;
    }
    
    public final int component28() {
        return 0;
    }
    
    public final int isPopupUpdate() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpdateUrl() {
        return null;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final boolean isShowReward() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRecycleDescribe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoginBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAliAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWxAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGromoreAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKsAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getYlhAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getXxlLowInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getScreenLowInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFullAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getAdInfo3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWxTransferNotice() {
        return null;
    }
    
    public final boolean component44() {
        return false;
    }
    
    public final boolean getLessAd() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getAdInfo4() {
        return null;
    }
    
    public final boolean component46() {
        return false;
    }
    
    public final boolean isAlive() {
        return false;
    }
    
    public final int component47() {
        return 0;
    }
    
    public final int getUpdateType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDownloadUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToVersion() {
        return null;
    }
    
    public final boolean component50() {
        return false;
    }
    
    public final boolean isRealAuth() {
        return false;
    }
    
    public final boolean component51() {
        return false;
    }
    
    public final boolean isApplyDelete() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeleteTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPangleLinkAppId() {
        return null;
    }
    
    public final boolean component54() {
        return false;
    }
    
    public final boolean isRiskOpen() {
        return false;
    }
    
    public final int component55() {
        return 0;
    }
    
    public final int getWithdrawPlatformType() {
        return 0;
    }
    
    public final int component56() {
        return 0;
    }
    
    public final int getShowSplashTimes() {
        return 0;
    }
    
    public final void setShowSplashTimes(int p0) {
    }
    
    public final int component57() {
        return 0;
    }
    
    public final int getShowSplashSeconds() {
        return 0;
    }
    
    public final void setShowSplashSeconds(int p0) {
    }
    
    public final boolean component58() {
        return false;
    }
    
    public final boolean isRiskOpenReward() {
        return false;
    }
    
    public final boolean component59() {
        return false;
    }
    
    public final boolean isRiskOpenWithdraw() {
        return false;
    }
    
    public final int component60() {
        return 0;
    }
    
    public final int getShowAdType() {
        return 0;
    }
    
    public final boolean component61() {
        return false;
    }
    
    public final boolean isAutoloadAd() {
        return false;
    }
    
    public final boolean component62() {
        return false;
    }
    
    public final boolean getJPush() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlanId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/sq/common_module/common/bean/InitData$LessAdLimitBean;", "", "cqpImgLimit", "", "cqpLimit", "cqpVideoLimit", "kpLimit", "rewardLimit", "xxlLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCqpImgLimit", "()Ljava/lang/String;", "getCqpLimit", "getCqpVideoLimit", "getKpLimit", "getRewardLimit", "getXxlLimit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_module_release"})
    public static final class LessAdLimitBean {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String cqpImgLimit = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String cqpLimit = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String cqpVideoLimit = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String kpLimit = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String rewardLimit = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String xxlLimit = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.sq.common_module.common.bean.InitData.LessAdLimitBean copy(@org.jetbrains.annotations.Nullable
        java.lang.String cqpImgLimit, @org.jetbrains.annotations.Nullable
        java.lang.String cqpLimit, @org.jetbrains.annotations.Nullable
        java.lang.String cqpVideoLimit, @org.jetbrains.annotations.Nullable
        java.lang.String kpLimit, @org.jetbrains.annotations.Nullable
        java.lang.String rewardLimit, @org.jetbrains.annotations.Nullable
        java.lang.String xxlLimit) {
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
        
        public LessAdLimitBean(@org.jetbrains.annotations.Nullable
        java.lang.String cqpImgLimit, @org.jetbrains.annotations.Nullable
        java.lang.String cqpLimit, @org.jetbrains.annotations.Nullable
        java.lang.String cqpVideoLimit, @org.jetbrains.annotations.Nullable
        java.lang.String kpLimit, @org.jetbrains.annotations.Nullable
        java.lang.String rewardLimit, @org.jetbrains.annotations.Nullable
        java.lang.String xxlLimit) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCqpImgLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCqpLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCqpVideoLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getKpLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRewardLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getXxlLimit() {
            return null;
        }
    }
}