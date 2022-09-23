package com.example.fact
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
        lateinit var num:EditText
        lateinit var  result:EditText
        lateinit var  btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num =findViewById(R.id.t1)
        result=findViewById(R.id.t2)
         btn=findViewById(R.id.button2)
    }
    fun factorial(n:Float): Float
    {
         var v1:Float= 1F
        for(i in 1..n.toInt())
        {
            v1 =v1* i
        }
        return v1
    }
    fun calculate(view: View)
    {

         var res=factorial(num.text.toString().toFloat())
        result.setText(res.toString())

    }
fun clear (view: View)
{
    num.getText().clear()
    result.getText().clear()
}

}