package com.sq.common_module.common.widget.lucky

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sq.common_module.R
import com.sq.common_module.common.bean.NineGridPrizeBean
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.loadNetImage
import com.sq.common_module.common.utils.kt.setBackGroundRes


/**
 * @Author zlm
 * @Date 2020-11-26 15:52
 * @Desc 抽奖转盘的适配器
 */
class LuckyDrawUpAdapter() :
    RecyclerView.Adapter<LuckyDrawUpAdapter.LuckyDrawItem>() {
    private var onClick: LuckyDrawUpView.DrawClickListener? = null
    private var mType = 1
    private var mDataListArr = arrayListOf<LuckyDrawUpView.LuckyDataBean>()

    var posMap =
        mapOf<Int, Int>(0 to 0, 1 to 1, 2 to 2, 3 to 7, 4 to 8, 5 to 3, 6 to 6, 7 to 5, 8 to 4)
    private var selectPosition = -1//当前选中需要常亮的

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LuckyDrawItem {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_lucky_draw, parent, false)
        return LuckyDrawItem(view)
    }

    override fun onBindViewHolder(holder: LuckyDrawItem, position: Int) {
        posMap[position]?.let { fakePos ->
            if (mDataListArr.size > position) {
                holder.init(fakePos, mDataListArr[position], selectPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return 9
    }

    fun setOnDrawClickListener(click: LuckyDrawUpView.DrawClickListener) {
        onClick = click
        notifyDataSetChanged()
    }

    fun setType(type: Int) {
        mType = type
        notifyDataSetChanged()
    }

    fun setDataArr(arr: ArrayList<LuckyDrawUpView.LuckyDataBean>) {
        mDataListArr = arr
        notifyDataSetChanged()
    }

    fun setSelectionPosition(selectPos: Int) {
        val lastPos = selectPosition
        selectPosition = selectPos
        if (lastPos != -1) {
            notifyItemChanged(reversePosition(lastPos))
        } else {
            notifyDataSetChanged()
        }
        notifyItemChanged(reversePosition(selectPos))
    }

    private var mList = arrayListOf<NineGridPrizeBean>()
    fun setDataList(list: List<NineGridPrizeBean>) {
        mList.clear()
        mList.addAll(list)
        notifyDataSetChanged()
    }

    /**
     * 获取真实坐标
     */
    private fun reversePosition(selectPos: Int): Int {
        for ((key, value) in posMap.entries) {
            if (value == selectPos) {
                return key
            }
        }
        return -1
    }

    inner class LuckyDrawItem(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        //这里做一个映射，将真实位置和抽奖机位置进行映射

        private var ivBg: ImageView = itemView.findViewById(R.id.iv_bg)
        private var ivLottery: ImageView = itemView.findViewById(R.id.iv_lottery)
        private var tvName: TextView = itemView.findViewById(R.id.tv_lottery_name)
        private var viewShadow: View = itemView.findViewById(R.id.view_shadow)
        private var tvWxDesc: View = itemView.findViewById(R.id.tv_wx_desc)

        /**
         * 将坐标传入，里面屏蔽adapter的内容，全部展示看到的坐标
         */
        fun init(fakePos: Int, dataBean: LuckyDrawUpView.LuckyDataBean, selectPos: Int) {

            if (fakePos == 8) {
                ivBg.setBackgroundResource(dataBean.midRes)

                ivLottery.visibility = View.GONE
                tvName.visibility = View.VISIBLE
                viewShadow.visibility = View.GONE
                tvWxDesc.visibility = View.GONE
                if (mList.size > 0) {
                    tvName.text = mList[fakePos].name
                    tvName.setTextColor(dataBean.midColor)
                }
                ivBg.setOnClickListener {
                    onClick?.onClickDraw()
                }
            } else {
                ivBg.setBackgroundResource(dataBean.unSelectRes)
                viewShadow.setBackgroundResource(dataBean.selectRes)
                if (dataBean.isHuawei) {
                    tvName.visibility = View.VISIBLE
                } else {
                    tvWxDesc.visibility = View.VISIBLE
                }

                ivLottery.visibility = View.VISIBLE
                viewShadow.visibility =
                    if (selectPos == fakePos) View.VISIBLE else View.GONE
                if (mList.size > 0) {
                    ivLottery.loadNetImage(mList[fakePos!!].pic)
                    if (dataBean.isHuawei) {
                        tvName.text = mList[fakePos].name
                        tvName.setTextColor(Color.parseColor("#6F572C"))
                    }
                }
            }
        }
    }

}