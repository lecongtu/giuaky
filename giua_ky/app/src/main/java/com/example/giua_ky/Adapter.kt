package com.example.giua_ky

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var context:Context,var arr: ArrayList<hangHoa>) : BaseAdapter() {
    class ViewHolder(row: View){
        var checkbox:CheckBox
        var text:TextView
        init {
            checkbox = row.findViewById(R.id.checkbox_monAn) as CheckBox
            text = row.findViewById(R.id.textview_monAn) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder : ViewHolder
        if(convertView==null){
            var LayoutInflater : LayoutInflater = LayoutInflater.from(context)
            view = LayoutInflater.inflate(R.layout.row_hanghoa,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var monan: hangHoa = getItem(position) as hangHoa
        viewHolder.text.text = monan.monAn
        return  view as View
    }

    override fun getItem(position: Int): Any {
        return arr.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arr.size
    }
}