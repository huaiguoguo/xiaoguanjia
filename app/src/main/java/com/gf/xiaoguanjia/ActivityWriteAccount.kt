package com.gf.xiaoguanjia

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

/**
 * Created by gf on 2018/1/30.
 */

class ActivityWriteAccount : AppCompatActivity(), View.OnClickListener{


    private var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_account)
        initView()
    }

    private fun initView() {
        btn = findViewById(R.id.save)
    }


    override fun onClick(view: View?) {
        Toast.makeText(this, view!!.id, Toast.LENGTH_LONG).show()
        when(view!!.id){
            R.id.save->{
                Toast.makeText(this, "保栫成功", Toast.LENGTH_LONG).show()
            }
            else->{

            }
        }
    }


}
