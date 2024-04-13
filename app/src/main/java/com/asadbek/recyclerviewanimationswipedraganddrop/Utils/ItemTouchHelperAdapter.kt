package com.asadbek.recyclerviewanimationswipedraganddrop.Utils

interface ItemTouchHelperAdapter {
    // itemni bir joydan boshqa bir joyga siljitish uchun funktsiya
    // fromPosition - turgan joyidan
    // toPosition - turgan joyidan boshqa bir joyga
    fun onItemMove(fromPosition:Int,toPosition:Int)
    // itemni siljitishni bekor qilish uchun funktsiya
    fun onItemDismiss(position:Int)
}