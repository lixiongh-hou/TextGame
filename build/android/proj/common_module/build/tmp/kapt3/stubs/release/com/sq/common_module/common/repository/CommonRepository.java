package com.sq.common_module.common.repository;

import com.google.gson.JsonObject;
import com.sq.common_module.common.bean.*;
import com.sq.common_module.common.utils.http.ApiService;
import com.sq.common_module.common.utils.http.BaseResult;
import io.reactivex.rxjava3.core.Observable;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2022/10/24
 * Time : 18:21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00f0\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\tJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u0006J \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0013\u001a\u00020\tJ6\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\tJ(\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ(\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tJ\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00070\u00062\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J \u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\tJ\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00070\u0006J \u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0\u00070\u00062\u0006\u0010\'\u001a\u00020\tJ\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00070\u0006J \u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010,\u001a\u00020\tJ \u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\b0\u00070\u00062\u0006\u0010/\u001a\u00020\tJ\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00070\u0006J \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u00103\u001a\u000204J\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00070\u0006J\u001a\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00070\u00062\u0006\u00108\u001a\u00020\tJ\u0012\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00070\u0006J\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00070\u0006J\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00070\u0006J\u0012\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00070\u0006J\u0012\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00070\u0006J\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00070\u0006J\u0012\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00070\u0006J\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00070\u0006J\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00070\u0006J\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00070\u0006J\u0012\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00070\u0006JS\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00070\u00062\u0006\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u0001042\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010WJS\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00070\u00062\u0006\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u0001042\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010WJ\"\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00070\u00062\u0006\u0010[\u001a\u00020\t2\u0006\u0010U\u001a\u00020\tJ\u0012\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00070\u0006J\u0018\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\b0\u00070\u0006J\u0012\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\u00070\u0006J\u0012\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00070\u0006J\u0012\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00070\u0006J\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\b0\u00070\u0006J\u0012\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00070\u0006J\u0012\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u00070\u0006J\u0012\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m0\u00070\u0006J\u0012\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u00070\u0006J\u0018\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\b0\u00070\u0006J\u0012\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u00070\u0006J \u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0\b0\u00070\u00062\u0006\u0010v\u001a\u000204J\u0012\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0\u00070\u0006J\u0012\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0\u00070\u0006J\u0012\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0\u00070\u0006J\u0012\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u00070\u0006J+\u0010\u007f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u0080\u0001\u001a\u0002042\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\"\u0010\u0083\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u0084\u0001\u001a\u000204J;\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0086\u00010\u00070\u00062%\u0010\u0087\u0001\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0088\u0001j\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u0089\u0001J=\u0010\u008a\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\tJ\u0019\u0010\u008f\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u001d\u0010\u0090\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010\u00070\u00062\u0007\u0010\u0092\u0001\u001a\u00020\tJN\u0010\u0093\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010Q\u001a\u00020\t2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u0094\u0001\u001a\u00020\t2\u0007\u0010\u0095\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u000204J\u001c\u0010\u0096\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0097\u00010\u00070\u00062\u0006\u0010S\u001a\u00020\tJ!\u0010\u0098\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010S\u001a\u00020\tJ!\u0010\u0099\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0015\u001a\u00020\tJ+\u0010\u009a\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u009b\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\tJ\"\u0010\u009d\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u009e\u0001\u001a\u00020\tJ4\u0010\u009f\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u00a0\u0001\u001a\u0002042\u0007\u0010\u00a1\u0001\u001a\u00020\tJ\u0082\u0001\u0010\u00a2\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a3\u00010\u00070\u00062\u0006\u0010Q\u001a\u00020\t2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u0094\u0001\u001a\u0002042\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0007\u0010\u00a4\u0001\u001a\u0002042\u0007\u0010\u0095\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u000b\b\u0002\u0010\u00a5\u0001\u001a\u0004\u0018\u0001042\u0007\u0010\u0080\u0001\u001a\u0002042\u000b\b\u0002\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0003\u0010\u00a7\u0001J\u0014\u0010\u00a8\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a9\u00010\u00070\u0006J+\u0010\u00aa\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u00ab\u0001\u001a\u00020\t2\u0007\u0010\u00ac\u0001\u001a\u00020\tJ%\u0010\u00ad\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ae\u00010\u00070\u00062\u0006\u0010/\u001a\u00020\t2\u0007\u0010\u00af\u0001\u001a\u00020\tJ\u0019\u0010\u00b0\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0019\u0010\u00b1\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\"\u0010\u00b2\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u00b3\u0001\u001a\u000204J\"\u0010\u00b4\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0007\u0010\u00b5\u0001\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b6\u0001"}, d2 = {"Lcom/sq/common_module/common/repository/CommonRepository;", "", "apiService", "Lcom/sq/common_module/common/utils/http/ApiService;", "(Lcom/sq/common_module/common/utils/http/ApiService;)V", "abandonCashRedWheel", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/sq/common_module/common/utils/http/BaseResult;", "", "", "abandonGuessAction", "addCity", "regionCode", "appInfoLog", "scene", "des", "baseInfo", "Lcom/sq/common_module/common/bean/BaseInfo;", "bindJPushRegId", "id", "bindPhone", "phone", "code", "shanYanToken", "bindWx", "appId", "bindZfb", "token", "cancelDeleteSelf", "checkRisk", "Lcom/sq/common_module/common/bean/CheckRiskBean;", "tdBlackBox", "delayDeleteSelf", "deleteCity", "deleteSelf", "getCashRedBagPreData", "Lcom/sq/common_module/common/bean/CashRedPreBean;", "getCityListData", "Lcom/sq/common_module/common/bean/CityListBean;", "regionName", "getCoinWithdrawData", "Lcom/sq/common_module/common/bean/CoinWithdrawData;", "getCompany", "Lcom/sq/common_module/common/bean/CompanyBean;", "keyword", "getCurrentWeather", "Lcom/sq/common_module/common/bean/CurrentWeatherBean;", "city", "getDailyRedPreBean", "Lcom/sq/common_module/common/bean/LuckyFlopBean;", "getDailyWithdrawReward", "rewardNum", "", "getDrawCardPreBean", "getEnterpriseInfo", "Lcom/sq/common_module/common/bean/EnterpriseInfoBean;", "creditNo", "getGuessData", "Lcom/sq/common_module/common/bean/GuessIdiomsBean;", "getGuessPreData", "Lcom/sq/common_module/common/bean/GuessPreBean;", "getHomeData", "Lcom/sq/common_module/common/bean/NewHomeBean;", "getHundredRewardLog", "Lcom/sq/common_module/common/bean/HundredRewardLogData;", "getHundredSignPreData", "Lcom/sq/common_module/common/bean/SignPreData;", "getInitData", "Lcom/sq/common_module/common/bean/InitData;", "getLuckyTurnTablePreData", "Lcom/sq/common_module/common/bean/BigWheelBean;", "getNewRedRainPreData", "Lcom/sq/common_module/common/bean/NewRainRedBean;", "getNineGridPreData", "Lcom/sq/common_module/common/bean/NineGridPreBean;", "getNormQuestionList", "Lcom/sq/common_module/common/bean/NormQuestionData;", "getRedRainPreBean", "Lcom/sq/common_module/common/bean/RedRainPreBean;", "getRewardByActivity", "Lcom/sq/common_module/common/bean/GetRewardBean;", "transId", "ecpm", "activityName", "logId", "coin", "withdrawTypestring", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Observable;", "getRewardByActivityV2", "getSelectCityList", "Lcom/sq/common_module/common/bean/SelectCityBean;", "name", "getShakePreData", "Lcom/sq/common_module/common/bean/ShakePreBean;", "getShakeRewardLog", "Lcom/sq/common_module/common/bean/ShakeRewardLogBean;", "getShakeWithdrawInfo", "Lcom/sq/common_module/common/bean/ShakeWithdrawalBean;", "getSignPreData", "Lcom/sq/common_module/common/bean/EverySignPreBean;", "getSystemCheck", "Lcom/sq/common_module/common/bean/SystemCheckBean;", "getUserCoinLog", "Lcom/sq/common_module/common/bean/CoinLogData;", "getUserHierarchyData", "Lcom/sq/common_module/common/bean/UserHierarchyBean;", "getUserVipInfo", "Lcom/sq/common_module/common/bean/UseVipBean;", "getWatchWithdrawPreData", "Lcom/sq/common_module/common/bean/CashRedWheelBean;", "getWifiPreData", "Lcom/sq/common_module/common/bean/WifiPreBean;", "getWithdrawBulletScreenBean", "Lcom/sq/common_module/common/bean/WithdrawBulletScreenListBean;", "getWithdrawForNewPreData", "Lcom/sq/common_module/common/bean/WithdrawForNewPreBean;", "getWithdrawHistoryBean", "Lcom/sq/common_module/common/bean/WithdrawHistoryListBean;", "page", "getWithdrawalData", "Lcom/sq/common_module/common/bean/HomeWithdrawalBean;", "getWithdrawalPreBean", "Lcom/sq/common_module/common/bean/WithdrawalBean;", "getZfbSevenSignData", "Lcom/sq/common_module/common/bean/AliSignBean;", "goToWifiPage", "Lcom/sq/common_module/common/bean/ToWIfiPageBean;", "initStatus", "status", "millisecond", "", "keepAliveLog", "actionType", "keySearch", "Lcom/sq/common_module/common/bean/KeySearchBean;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "loadAdFailLog", "adNetwork", "adUnitId", "errCode", "errMsg", "loginOut", "queryWfWithdrawResult", "Lcom/sq/common_module/common/bean/WfWithdrawBean;", "thirdOrderId", "recordAdTrace", "adUnitType", "adSiteId", "saveUserActivityLog", "Lcom/google/gson/JsonObject;", "sendActivityResult", "sendCode", "submitCoinWithdraw", "withdrawCoinNum", "withdrawAmount", "submitShakeWithdraw", "amount", "submitWithdrawal", "isQuickWithdraw", "payType", "syncAdInfo", "Lcom/sq/common_module/common/bean/ReportFlagBean;", "isClick", "isEnd", "slotId", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)Lio/reactivex/rxjava3/core/Observable;", "toLogin", "Lcom/sq/common_module/common/bean/LoginBean;", "toRealAuth", "realName", "idNo", "todayWeather", "Lcom/sq/common_module/common/bean/ToadyWeatherBean;", "fate", "unbindAccount", "unbindPhone", "upDateUserInfo", "isAddComponent", "userTrace", "event", "common_module_release"})
public final class CommonRepository {
    private final com.sq.common_module.common.utils.http.ApiService apiService = null;
    
    @javax.inject.Inject
    public CommonRepository(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.InitData>> getInitData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LoginBean>> toLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CompanyBean>>> getCompany(@org.jetbrains.annotations.NotNull
    java.lang.String keyword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.EnterpriseInfoBean>> getEnterpriseInfo(@org.jetbrains.annotations.NotNull
    java.lang.String creditNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GuessIdiomsBean>> getGuessData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.google.gson.JsonObject>> saveUserActivityLog(@org.jetbrains.annotations.NotNull
    java.lang.String activityName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.BigWheelBean>> getLuckyTurnTablePreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NewHomeBean>> getHomeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.BaseInfo>> baseInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CoinLogData>>> getUserCoinLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.HundredRewardLogData>> getHundredRewardLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CoinWithdrawData>> getCoinWithdrawData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NormQuestionData>> getNormQuestionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GetRewardBean>> getRewardByActivity(@org.jetbrains.annotations.NotNull
    java.lang.String transId, @org.jetbrains.annotations.NotNull
    java.lang.String ecpm, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, @org.jetbrains.annotations.Nullable
    java.lang.Integer logId, @org.jetbrains.annotations.Nullable
    java.lang.String coin, @org.jetbrains.annotations.Nullable
    java.lang.String withdrawTypestring) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ReportFlagBean>> syncAdInfo(@org.jetbrains.annotations.NotNull
    java.lang.String transId, int adNetwork, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String ecpm, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, int isClick, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, @org.jetbrains.annotations.Nullable
    java.lang.Integer isEnd, int status, @org.jetbrains.annotations.Nullable
    java.lang.String slotId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LuckyFlopBean>> getDrawCardPreBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LuckyFlopBean>> getDailyRedPreBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WithdrawalBean>> getWithdrawalPreBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitWithdrawal(@org.jetbrains.annotations.NotNull
    java.lang.String amount, int isQuickWithdraw, @org.jetbrains.annotations.NotNull
    java.lang.String payType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.WithdrawHistoryListBean>>> getWithdrawHistoryBean(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.WithdrawBulletScreenListBean>>> getWithdrawBulletScreenBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.RedRainPreBean>> getRedRainPreBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GuessPreBean>> getGuessPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitCoinWithdraw(@org.jetbrains.annotations.NotNull
    java.lang.String withdrawCoinNum, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawAmount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> loginOut() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> sendCode(@org.jetbrains.annotations.NotNull
    java.lang.String phone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindPhone(@org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    java.lang.String shanYanToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> deleteSelf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SignPreData>> getHundredSignPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> abandonGuessAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ShakePreBean>> getShakePreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NineGridPreBean>> getNineGridPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.ShakeRewardLogBean>>> getShakeRewardLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.EverySignPreBean>> getSignPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CashRedPreBean>> getCashRedBagPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CashRedWheelBean>> getWatchWithdrawPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> abandonCashRedWheel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.HomeWithdrawalBean>> getWithdrawalData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NewRainRedBean>> getNewRedRainPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> upDateUserInfo(int isAddComponent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindWx(@org.jetbrains.annotations.NotNull
    java.lang.String appId, @org.jetbrains.annotations.NotNull
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindZfb(@org.jetbrains.annotations.NotNull
    java.lang.String appId, @org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WithdrawForNewPreBean>> getWithdrawForNewPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ShakeWithdrawalBean>> getShakeWithdrawInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> getDailyWithdrawReward(int rewardNum) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitShakeWithdraw(@org.jetbrains.annotations.NotNull
    java.lang.String amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> unbindAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> unbindPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.AliSignBean>> getZfbSevenSignData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> loadAdFailLog(int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, @org.jetbrains.annotations.NotNull
    java.lang.String errCode, @org.jetbrains.annotations.NotNull
    java.lang.String errMsg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.UseVipBean>> getUserVipInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.UserHierarchyBean>> getUserHierarchyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> toRealAuth(@org.jetbrains.annotations.NotNull
    java.lang.String realName, @org.jetbrains.annotations.NotNull
    java.lang.String idNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> delayDeleteSelf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> cancelDeleteSelf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> keepAliveLog(int actionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CheckRiskBean>> checkRisk(@org.jetbrains.annotations.NotNull
    java.lang.String tdBlackBox, @org.jetbrains.annotations.NotNull
    java.lang.String scene) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WifiPreBean>> getWifiPreData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WfWithdrawBean>> queryWfWithdrawResult(@org.jetbrains.annotations.NotNull
    java.lang.String thirdOrderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> sendActivityResult(@org.jetbrains.annotations.NotNull
    java.lang.String activityName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ToWIfiPageBean>> goToWifiPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> userTrace(@org.jetbrains.annotations.NotNull
    java.lang.String event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> initStatus(int status, long millisecond) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindJPushRegId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ToadyWeatherBean>> todayWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String fate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CurrentWeatherBean>>> getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> recordAdTrace(@org.jetbrains.annotations.NotNull
    java.lang.String transId, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> appInfoLog(@org.jetbrains.annotations.NotNull
    java.lang.String scene, @org.jetbrains.annotations.NotNull
    java.lang.String des) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SystemCheckBean>> getSystemCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GetRewardBean>> getRewardByActivityV2(@org.jetbrains.annotations.NotNull
    java.lang.String transId, @org.jetbrains.annotations.NotNull
    java.lang.String ecpm, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, @org.jetbrains.annotations.Nullable
    java.lang.Integer logId, @org.jetbrains.annotations.Nullable
    java.lang.String coin, @org.jetbrains.annotations.Nullable
    java.lang.String withdrawTypestring) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CityListBean>>> getCityListData(@org.jetbrains.annotations.NotNull
    java.lang.String regionName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> addCity(@org.jetbrains.annotations.NotNull
    java.lang.String regionCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> deleteCity(@org.jetbrains.annotations.NotNull
    java.lang.String regionCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SelectCityBean>> getSelectCityList(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.KeySearchBean>> keySearch(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> map) {
        return null;
    }
}