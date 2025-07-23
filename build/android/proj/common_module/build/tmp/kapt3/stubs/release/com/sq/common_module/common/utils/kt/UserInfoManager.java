package com.sq.common_module.common.utils.kt;

import com.blankj.utilcode.util.TimeUtils;
import java.util.Date;

/**
 * Created by town
 * Date :  2022/10/12
 * Time : 15:45
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u00ad\u0001\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\tR\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b\'\u0010\u000bR\u0011\u0010(\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\tR\u0011\u0010*\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\tR\u0011\u0010,\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\tR\u0011\u0010.\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\tR\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\tR\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\tR\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010y\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010\tR\u000e\u0010{\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010~\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010\tR\u0016\u0010\u0080\u0001\u001a\u00020\u0004X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010\tR\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u008a\u0001\u001a\u00020\u0004X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\tR\u000f\u0010\u008c\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a0\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a1\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a2\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a3\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a4\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a5\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a6\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a7\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a8\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a9\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00aa\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ab\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ac\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u00ae\u0001\u001a\u00020\u0004X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00af\u0001\u0010\tR\u000f\u0010\u00b0\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010\u00b1\u0001\u001a\u00030\u00b2\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b3\u0001\u0010\u00b4\u0001\"\u0006\b\u00b5\u0001\u0010\u00b6\u0001R \u0010\u00b7\u0001\u001a\u00030\u00b2\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b8\u0001\u0010\u00b4\u0001\"\u0006\b\u00b9\u0001\u0010\u00b6\u0001R \u0010\u00ba\u0001\u001a\u00030\u00b2\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bb\u0001\u0010\u00b4\u0001\"\u0006\b\u00bc\u0001\u0010\u00b6\u0001\u00a8\u0006\u00bd\u0001"}, d2 = {"Lcom/sq/common_module/common/utils/kt/UserInfoManager;", "", "()V", "ADD_DESKTOP_APPWIDGET", "", "ALIVE_START_TIME", "ALI_APP_ID", "ANDROID_ID", "getANDROID_ID", "()Ljava/lang/String;", "setANDROID_ID", "(Ljava/lang/String;)V", "APPLICATION_ID", "APP_CHANNEL", "APP_CODE", "APP_WIDGET_EVERY_SHOW", "AUDIT_USER_STEP", "AUDIT_USER_TOTAL_STEP", "BACK_TO_FRONT", "getBACK_TO_FRONT", "BATTERY_HEALTH", "CHECKED_PRIVACY", "CLEAN_V2_KS", "CLEAR_DANGER_DATA", "CLEAR_HOME_DATA", "CLEAR_HOME_TAB_DATA", "CLEAR_SAFE_DAY", "CLEAR_TOOL_TAB_DATA", "CLEAR_WECHAT_DANGER", "CONNECTED_WIFI", "CQP_IMG_LIMIT", "getCQP_IMG_LIMIT", "CQP_LIMIT", "getCQP_LIMIT", "CQP_VIDEO_LIMIT", "getCQP_VIDEO_LIMIT", "CURRENT_NET_SPEED", "DEVICEID", "getDEVICEID", "setDEVICEID", "EVERY_TASK_1", "getEVERY_TASK_1", "EVERY_TASK_2", "getEVERY_TASK_2", "EVERY_TASK_3", "getEVERY_TASK_3", "EVERY_TASK_4", "getEVERY_TASK_4", "GET_NEW_PERSON_REWARD", "GROMORE_APP_ID", "GRO_BANNER_ID", "GRO_FULL_ID", "GRO_REWARD_ID", "GRO_SPLASH_ID", "GUESS_FEED_AD_FROM", "GUESS_FEED_AD_ID", "GUESS_SHOW_FULL_AD", "GUIDE_OPEN_LOCATION", "GUIDE_OPT_IS_WIFI", "IMEIORIGIN", "INNER_VERSION", "IS_AGREE_PRIVACY", "IS_ALIVE", "IS_ALL_FIND_KILL", "IS_APP_MANAGER", "IS_APP_SECURITY", "IS_AUDIT", "IS_AUIDT_CLEAR_HOME", "IS_AUIDT_FIRST_CLEAR_HOME", "IS_AUIDT_SCAN_HOME", "IS_BATTERY_HEALTH", "IS_BATTERY_INFO", "IS_BATTERY_MAINTEN", "IS_BATTERY_POWER", "IS_BATTERY_PROTECT", "IS_BIG_FILE_MANAGER", "IS_BIND_PHONE", "IS_CAMERA_DETECTION", "IS_CHARGING", "IS_CHARGING_RECORDS", "IS_CHECK_SECURITY", "IS_CLEAN_PHOTO", "IS_DEVICE_SQUA", "IS_ELE_SKILLS", "IS_FULL_SCAN", "IS_GAME_CONSUME", "IS_GARBAGE_REMOVE", "IS_HIDDEN_PROGRESS_BTN", "IS_JL_OFFICIAL", "IS_LESSAD_LIMIT", "getIS_LESSAD_LIMIT", "IS_LESS_AD", "IS_LESS_AD_OPEN_LIMIT", "IS_MODE_SWITCHING", "IS_NET_REINFORCE", "IS_NET_TEST", "IS_OFFICIAL_LIMIT", "getIS_OFFICIAL_LIMIT", "IS_PAY_SAFE", "IS_PHONE_COOL", "IS_PHONE_SPEED", "IS_PLUG_BLOCKING", "IS_POWER_OPTION", "IS_POWER_SAVE", "IS_POWER_SAVING", "IS_SCREEN_POWER", "IS_SPEED_TEST", "IS_STARTING_ALIVE", "IS_STRONGER_SIGNAL", "IS_SYSTEM_BATTERY", "IS_SYSTEM_NET", "IS_TRAFFIC_PROTECTION", "IS_USE_FULL_SCREEN", "IS_VIDEO_CONSUME", "IS_VIDEO_SPEED", "IS_VIRUS_SCAN", "IS_WIFI_GUARD", "IS_WIFI_PWD_LEAK", "I_MEI", "KEY_IMEI_ORIGIN", "KEY_PRIVATE_KEY", "KP_LIMIT", "getKP_LIMIT", "KS_APP_ID", "LOW_ECPM_FEED_AD_ID", "LOW_ECPM_FULL_AD_ID", "LOW_INTERVAL", "getLOW_INTERVAL", "LOW_LIMIT", "getLOW_LIMIT", "NEW_PERSON_FULL_AD_ID", "NEW_PERSON_FULL_AD_PLATFORM", "OAID", "PUSH_APP_TYPE", "REFUSE_WIFI_LIST_PERMISSION", "REQUEST_AD", "REWARD_AD_ID", "REWARD_AD_PLATFORM", "REWARD_LIMIT", "getREWARD_LIMIT", "SAFE_TEST_SUCCESS", "SHOW_CASH_RED_DIALOG", "SHOW_EVERY_SIGN", "SHOW_NEW_PERSON", "SHOW_PUSH", "SHOW_SIGN_NUMBER", "SHOW_TOMORROW_TIPS", "SPECIAL_FEED_AD_ID", "SPECIAL_FEED_AD_PLATFORM", "SPECIAL_REC", "SPLASH_AD_ID", "SPLASH_AD_PLATFORM", "SPLASH_OPEN_AD_ID", "STEP_DETECTOR", "TAB_SELECT_POSITION", "TT_APP_ID", "USER_BIND_WX", "USER_BIND_ZFB", "USER_FIRST_THIRD_TAB", "USER_HUNDRED_AMOUNT", "USER_ID", "USER_PHONE", "USER_REAL_AUTH", "USER_STEP", "USER_TOKEN", "USER_TRANSID", "USE_MUSIC_CHARGE", "WEATHER_MY_XZ", "WIFI_ACCELERATION_PROGRESS", "WIFI_NOTE_BOOK", "WIFI_V8_NET_SPEED", "WITHDRAW_PLATFORM_TYPE", "WX_APP_ID", "WX_SHOP_TIPS", "XXL_LIMIT", "getXXL_LIMIT", "YLH_APP_ID", "feedOpenTime", "", "getFeedOpenTime", "()I", "setFeedOpenTime", "(I)V", "fullOpenTime", "getFullOpenTime", "setFullOpenTime", "lowEcpmUser", "getLowEcpmUser", "setLowEcpmUser", "common_module_release"})
public final class UserInfoManager {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.UserInfoManager INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String DEVICEID = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ANDROID_ID = "";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LOW_INTERVAL = "LOW_INTERVAL";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LOW_LIMIT = "LOW_LIMIT";
    private static int lowEcpmUser = -1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BACK_TO_FRONT = "BACK_TO_FRONT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_LESS_AD_OPEN_LIMIT = "is_less_ad_open_limit";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IS_LESSAD_LIMIT = "IS_LESSAD_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IS_OFFICIAL_LIMIT = "IS_OFFICIAL_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KP_LIMIT = "KP_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String REWARD_LIMIT = "REWARD_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CQP_LIMIT = "CQP_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String XXL_LIMIT = "XXL_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CQP_VIDEO_LIMIT = "CQP_VIDEO_LIMIT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CQP_IMG_LIMIT = "CQP_IMG_LIMIT";
    private static int feedOpenTime = -1;
    private static int fullOpenTime = -1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INNER_VERSION = "20241203";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PRIVATE_KEY = "hangzhouhaocai888@#\u00a5";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IMEI_ORIGIN = "imeiOrigin";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_TOKEN = "userToken";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_ID = "userId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BIND_PHONE = "IS_BIND_PHONE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_PHONE = "userPhone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_JL_OFFICIAL = "isJlOfficial";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String I_MEI = "iMei";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_CODE = "appCode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APPLICATION_ID = "applicationId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_CHANNEL = "appChannel";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OAID = "oa_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMEIORIGIN = "IMEI_ORIGIN";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TT_APP_ID = "ttAppId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PUSH_APP_TYPE = "pushAppType";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRO_SPLASH_ID = "groSplashId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRO_BANNER_ID = "groBannerId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRO_REWARD_ID = "groRewardId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRO_FULL_ID = "groFullId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AGREE_PRIVACY = "isAgreePrivacy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AUDIT = "isAudit";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REFUSE_WIFI_LIST_PERMISSION = "refuse_wifi_list_permission";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUESS_SHOW_FULL_AD = "guessShowFullAd";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_STEP = "user_step";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAB_SELECT_POSITION = "tab_select_position";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUESS_FEED_AD_FROM = "guess_full_ad_from";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUESS_FEED_AD_ID = "guess_full_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_DESKTOP_APPWIDGET = "add_desktop_appwidget";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_BIND_WX = "user_bind_wx";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_BIND_ZFB = "user_bind_zfb";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_EVERY_SIGN = "show_every_sign";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ALI_APP_ID = "ali_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WX_APP_ID = "wx_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUDIT_USER_STEP = "audit_user_step";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUDIT_USER_TOTAL_STEP = "audit_user_total_step";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_TOMORROW_TIPS = "show_withdrawal_tomorrow_tips";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BATTERY_HEALTH = "battery_health";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_NEW_PERSON = "show_new_person";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GROMORE_APP_ID = "gromore_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KS_APP_ID = "ks_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String YLH_APP_ID = "ylh_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPLASH_AD_PLATFORM = "splash_ad_platform";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPLASH_AD_ID = "splash_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOW_ECPM_FULL_AD_ID = "LOW_ECPM_FULL_AD_ID";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOW_ECPM_FEED_AD_ID = "LOW_ECPM_FEED_AD_ID";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPLASH_OPEN_AD_ID = "splash_open_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_SIGN_NUMBER = "show_sign_number";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NEW_PERSON_FULL_AD_PLATFORM = "new_person_full_ad_platform";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NEW_PERSON_FULL_AD_ID = "new_person_full_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REWARD_AD_PLATFORM = "reward_ad_platform";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REWARD_AD_ID = "reward_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_CASH_RED_DIALOG = "show_cash_red_dialog";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GET_NEW_PERSON_REWARD = "get_new_person_reward";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_HUNDRED_AMOUNT = "user_hundred_amount";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_FIRST_THIRD_TAB = "user_first_third_tab";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WX_SHOP_TIPS = "wx_shop_tips";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_LESS_AD = "is_less_ad";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPECIAL_FEED_AD_ID = "special_feed_ad_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPECIAL_FEED_AD_PLATFORM = "special_feed_ad_platform";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_ALIVE = "is_alive";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECKED_PRIVACY = "checked_privacy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_WIDGET_EVERY_SHOW = "app_widget_every_show";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_TRANSID = "user_transId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_REAL_AUTH = "user_real_auth";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPECIAL_REC = "special_rec";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_STARTING_ALIVE = "is_starting_alive";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ALIVE_START_TIME = "alive_start_time";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STEP_DETECTOR = "mStepDetector";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WITHDRAW_PLATFORM_TYPE = "withdraw_platform_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_PUSH = "jPush";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USE_MUSIC_CHARGE = "use_music_charge";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WIFI_ACCELERATION_PROGRESS = "wifi_acceleration_progress";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONNECTED_WIFI = "connected_wifi";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SAFE_TEST_SUCCESS = "safetestsuccess";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUIDE_OPT_IS_WIFI = "guide_opt_is_wifi";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_HIDDEN_PROGRESS_BTN = "is_hidden_progress_btn";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_USE_FULL_SCREEN = "is_use_full_screen";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_DANGER_DATA = "clear_danger_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_HOME_DATA = "clear_home_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_TOOL_TAB_DATA = "clear_tool_tab_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_HOME_TAB_DATA = "clear_home_tab_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AUIDT_CLEAR_HOME = "is_auidt_clear_home";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AUIDT_FIRST_CLEAR_HOME = "is_auidt_first_clear_home";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AUIDT_SCAN_HOME = "is_auidt_scan_home";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_SAFE_DAY = "clear_safe_day";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAR_WECHAT_DANGER = "clear_wechat_danger_hidden";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WIFI_NOTE_BOOK = "wifi_note_book";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUIDE_OPEN_LOCATION = "guide_open_location";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WEATHER_MY_XZ = "weather_my_xz";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REQUEST_AD = "request_ad";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CURRENT_NET_SPEED = "current_net_speed";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAN_V2_KS = "clean_v2_ks";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WIFI_V8_NET_SPEED = "wifi_v8_net_speed";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EVERY_TASK_1 = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EVERY_TASK_2 = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EVERY_TASK_3 = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EVERY_TASK_4 = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_MODE_SWITCHING = "IS_MODE_SWITCHING";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_GARBAGE_REMOVE = "IS_GARBAGE_REMOVE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_VIRUS_SCAN = "IS_VIRUS_SCAN";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_PHONE_SPEED = "IS_PHONE_SPEED";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_CLEAN_PHOTO = "IS_CLEAN_PHOTO";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_VIDEO_SPEED = "IS_VIDEO_SPEED";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BATTERY_INFO = "IS_BATTERY_INFO";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_SPEED_TEST = "IS_SPEED_TEST";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_POWER_SAVE = "IS_POWER_SAVE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_POWER_SAVING = "IS_Power_Saving";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_TRAFFIC_PROTECTION = "IS_TRAFFIC_PROTECTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_ALL_FIND_KILL = "IS_ALL_FIND_KILL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BIG_FILE_MANAGER = "IS_BIG_FILE_MANAGER";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_WIFI_PWD_LEAK = "IS_WIFI_PWD_LEAK";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_STRONGER_SIGNAL = "IS_STRONGER_SIGNAL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_DEVICE_SQUA = "IS_DEVICE_SQUA";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_PAY_SAFE = "IS_PAY_SAFE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_SYSTEM_BATTERY = "IS_SYSTEM_BATTERY";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_NET_REINFORCE = "IS_NET_REINFORCE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_WIFI_GUARD = "IS_WIFI_GUARD";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_SYSTEM_NET = "IS_SYSTEM_NET";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_GAME_CONSUME = "IS_GAME_CONSUME";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_VIDEO_CONSUME = "IS_VIDEO_CONSUME";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_CHECK_SECURITY = "IS_CHECK_SECURITY";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_APP_SECURITY = "IS_APP_SECURITY";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_NET_TEST = "IS_NET_TEST";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_FULL_SCAN = "IS_FULL_SCAN";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_ELE_SKILLS = "IS_ELE_SKILLS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_POWER_OPTION = "IS_POWER_OPTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_CAMERA_DETECTION = "IS_CAMERA_DETECTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_APP_MANAGER = "IS_APP_MANAGER";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_SCREEN_POWER = "IS_SCREEN_POWER";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BATTERY_PROTECT = "IS_BATTERY_PROTECT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_PHONE_COOL = "IS_PHONE_COOL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BATTERY_POWER = "IS_BATTERY_POWER";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_CHARGING = "IS_CHARGING";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BATTERY_MAINTEN = "IS_BATTERY_MAINTEN";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_BATTERY_HEALTH = "IS_BATTERY_HEALTH";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_CHARGING_RECORDS = "IS_CHARGING_RECORDS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_PLUG_BLOCKING = "IS_PLUG_BLOCKING";
    
    private UserInfoManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDEVICEID() {
        return null;
    }
    
    public final void setDEVICEID(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getANDROID_ID() {
        return null;
    }
    
    public final void setANDROID_ID(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLOW_INTERVAL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLOW_LIMIT() {
        return null;
    }
    
    public final int getLowEcpmUser() {
        return 0;
    }
    
    public final void setLowEcpmUser(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBACK_TO_FRONT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIS_LESSAD_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIS_OFFICIAL_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKP_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getREWARD_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCQP_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getXXL_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCQP_VIDEO_LIMIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCQP_IMG_LIMIT() {
        return null;
    }
    
    public final int getFeedOpenTime() {
        return 0;
    }
    
    public final void setFeedOpenTime(int p0) {
    }
    
    public final int getFullOpenTime() {
        return 0;
    }
    
    public final void setFullOpenTime(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEVERY_TASK_1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEVERY_TASK_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEVERY_TASK_3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEVERY_TASK_4() {
        return null;
    }
}