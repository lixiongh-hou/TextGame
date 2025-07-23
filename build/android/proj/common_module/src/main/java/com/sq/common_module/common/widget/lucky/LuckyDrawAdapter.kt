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
class LuckyDrawAdapter() :
    RecyclerView.Adapter<LuckyDrawAdapter.LuckyDrawItem>() {
    private var onClick: LuckyDrawView.DrawClickListener? = null
    private var mType = 1


    var posMap =
        mapOf<Int, Int>(0 to 0, 1 to 1, 2 to 2, 3 to 7, 4 to 8, 5 to 3, 6 to 6, 7 to 5, 8 to 4)
    private var selectPosition = -1//当前选中需要常亮的

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LuckyDrawItem {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_lucky_draw, parent, false)
        return LuckyDrawItem(view)
    }

    override fun onBindViewHolder(holder: LuckyDrawItem, position: Int) {
        holder.init(posMap[position], selectPosition)
    }

    override fun getItemCount(): Int {
        return 9
    }

    fun setOnDrawClickListener(click: LuckyDrawView.DrawClickListener) {
        onClick = click
        notifyDataSetChanged()
    }

    fun setType(type: Int) {
        mType = type
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
        fun init(fakePos: Int?, selectPos: Int) {
            if (fakePos == 8) {
                //抽奖按钮
                ivBg.setBackGroundRes(
                    mType == 1,
                    R.drawable.ic_start_lucky_draw,
                    R.drawable.ic_start_lucky_draw_2
                )
                if (mType == 3) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_3)
                if (mType == 4) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_4)
                if (mType == 5) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_5)
                if (mType == 6) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_6)
                if (mType == 7) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_7)

                if (mType == 8) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_8)
                if (mType == 9) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_9)

                if (mType == 10) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_10)
                if (mType == 11) ivBg.setBackgroundResource(R.drawable.ic_start_lucky_draw_11)

                ivLottery.visibility = View.GONE
                tvName.visibility = View.VISIBLE
                viewShadow.visibility = View.GONE
                tvWxDesc.visibility = View.GONE
                if (mList.size > 0) {
                    tvName.text = mList[fakePos].name
                    tvName.setTextColor(Color.WHITE)
                    if (mType == 5){
                        tvName.setTextColor(Color.parseColor("#B07D11"))
                    }
                }
                ivBg.setOnClickListener {
                    onClick?.onClickDraw()
                }
            } else {
                ivBg.setBackGroundRes(
                    mType == 1,
                    R.drawable.ic_lucky_unselected,
                    R.drawable.ic_lucky_unselected_2
                )

                viewShadow.setBackGroundRes(
                    mType == 1,
                    R.drawable.ic_lucky_selected,
                    R.drawable.ic_lucky_selected_2
                )
                if (mType == 3) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_3)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_3)
                }
                if (mType == 4) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_4)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_4)
                }

                if (mType == 5) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_5)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_5)
                }

                if (mType == 6){
                    when (fakePos) {
                        0 -> {
                            ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_6_lt)
                            viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_6_lt)
                        }
                        2 -> {
                            ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_6_rt)
                            viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_6_rt)
                        }
                        6 -> {
                            ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_6_lb)
                            viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_6_lb)
                        }
                        4 -> {
                            ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_6_rb)
                            viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_6_rb)
                        }
                        else -> {
                            ivBg.setBackgroundResource(R.drawable.ic_mid_lucky_unselected_6)
                            viewShadow.setBackgroundResource(R.drawable.ic_mid_lucky_selected_6)
                        }
                    }
                }

                if (mType == 7) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_7)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_7)
                }

                if (mType == 8) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_8)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_8)
                }

                if (mType == 9) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_9)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_9)
                }

                if (mType == 10) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_10)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_10)
                }

                if (mType == 11) {
                    ivBg.setBackgroundResource(R.drawable.ic_lucky_unselected_11)
                    viewShadow.setBackgroundResource(R.drawable.ic_lucky_selected_11)
                }

                ivLottery.visibility = View.VISIBLE
                when(mType){
                    1,3,5,6,9,11 ->{
                        tvName.visibility = View.VISIBLE
                    }
                    else ->{
                        tvWxDesc.visibility = View.VISIBLE
                    }
                }

                viewShadow.visibility =
                    if (selectPos == fakePos) View.VISIBLE else View.GONE
//                ivLottery.setImageResource(iconArray[fakePos!!])
                if (mList.size > 0) {
                    ivLottery.loadNetImage(mList[fakePos!!].pic)
                    when (mType) {
                        1, 3, 5, 6,9,11 -> {
                            tvName.text = mList[fakePos].name
                            tvName.setTextColor(Color.parseColor("#6F572C"))
                        }
                    }
                }

            }
        }


    }

}