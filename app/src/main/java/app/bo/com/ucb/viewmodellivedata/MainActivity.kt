package app.bo.com.ucb.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counter = 0;

    //1
    lateinit var liveDataString: LiveDataString
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveDataString = LiveDataString()
        //2
        liveDataString.cadena.observe(this, Observer(::updateUi))

        btnAdd.setOnClickListener {
            counter++
            liveDataString.cambiarValor(counter.toString())
//            labelContent.text = counter.toString()
        }
    }
    private fun updateUi(valor: String) {
        labelContent.text = valor
    }
}

