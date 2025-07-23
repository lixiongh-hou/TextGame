package com.sq.common_module.common.utils.kt

import com.sq.common_module.R

/**
 * Created by town
 * Date :  2023/1/3
 * Time : 10:01
 */


object GuessLevelConstant {
    val mGuessLevelList = arrayListOf<GuessLevelBean>()
    val guessPercentList = arrayListOf(7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 93, 100)
    init {
        mGuessLevelList.add(GuessLevelBean(1, "书生", R.drawable.ic_guess_level_1, 0))
        mGuessLevelList.add(GuessLevelBean(2, "秀才", R.drawable.ic_guess_level_2, 1))
        mGuessLevelList.add(GuessLevelBean(3, "举人", R.drawable.ic_guess_level_3, 4))
        mGuessLevelList.add(GuessLevelBean(4, "探花", R.drawable.ic_guess_level_4, 10))
        mGuessLevelList.add(GuessLevelBean(5, "榜眼", R.drawable.ic_guess_level_5, 20))
        mGuessLevelList.add(GuessLevelBean(6, "状元", R.drawable.ic_guess_level_6, 50))
        mGuessLevelList.add(GuessLevelBean(7, "九品芝麻官", R.drawable.ic_guess_level_6, 100))
        mGuessLevelList.add(GuessLevelBean(8, "七品县令", R.drawable.ic_guess_level_6, 200))
        mGuessLevelList.add(GuessLevelBean(9, "六品太学博士", R.drawable.ic_guess_level_6, 300))
        mGuessLevelList.add(GuessLevelBean(10, "五品翰林学士", R.drawable.ic_guess_level_6, 400))
        mGuessLevelList.add(GuessLevelBean(11, "四品知府", R.drawable.ic_guess_level_6, 500))
        mGuessLevelList.add(GuessLevelBean(12, "三品礼部尚书", R.drawable.ic_guess_level_6, 600))
        mGuessLevelList.add(GuessLevelBean(13, "二品内阁学士", R.drawable.ic_guess_level_6, 700))
        mGuessLevelList.add(GuessLevelBean(14, "一品内阁学士", R.drawable.ic_guess_level_6, 800))
    }
}

data class GuessLevelBean(val level: Int, val name: String, val res: Int, val times: Int)

