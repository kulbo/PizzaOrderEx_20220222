package kr.co.smartsoft.pizzaorderex_20220222.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.smartsoft.pizzaorderex_20220222.R
import kr.co.smartsoft.pizzaorderex_20220222.datas.OrderData

class OrderAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<OrderData>
) : ArrayAdapter<OrderData>(mContext, resId, mList) {

    /*
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempOrder = convertView

        if (tempOrder == null) {
            tempOrder = LayoutInflater.from(mContext).inflate(R.layout.order_list_item, null)
        }

        val row = tempOrder

        // val data = mList(position)

        // val txtName = row.findViewById<TextView>(R.id.txtName)

        return row
    }
     */
}