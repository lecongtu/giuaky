package com.example.giua_ky

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_hanghoa.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    var arr :ArrayList<hangHoa> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arr.add(hangHoa("thit bo trung1"))
        arr.add(hangHoa("thit bo trung2"))
        arr.add(hangHoa("thit bo trung3"))
        arr.add(hangHoa("thit bo trung4"))
        arr.add(hangHoa("thit bo trung5"))
        listView.adapter = Adapter(this , arr)
        listView.onItemClickListener = this

    }
    fun addRow(view:View){
        arr.add(hangHoa(edit_list.text.toString()))
        listView.adapter = Adapter(this , arr)
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "lecongtu1223", Toast.LENGTH_LONG).show()
    }
}