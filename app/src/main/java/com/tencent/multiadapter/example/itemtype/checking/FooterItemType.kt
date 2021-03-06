package com.tencent.multiadapter.example.itemtype.checking

import com.tencent.lib.multi.core.MultiHelper
import com.tencent.lib.multi.core.MultiItemType
import com.tencent.lib.multi.core.MultiViewHolder
import com.tencent.multiadapter.R
import com.tencent.multiadapter.example.bean.CheckableItem

/**

 * Author：岑胜德 on 2021/5/12 18:17

 * 说明：

 */
class FooterItemType:MultiItemType<CheckableItem>() {

    override fun getId(): Int = CheckableItem.VIEW_TYPE_FOOTER

    override fun getItemLayoutRes(): Int = R.layout.item_checking_footer

    override fun matchItemType(data: CheckableItem, position: Int): Boolean =data.viewType== id

    override fun onBindViewHolder(holder: MultiViewHolder, helper: MultiHelper<CheckableItem,MultiViewHolder>, position: Int) {

    }
}