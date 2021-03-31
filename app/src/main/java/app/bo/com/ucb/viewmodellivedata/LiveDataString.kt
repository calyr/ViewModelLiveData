package app.bo.com.ucb.viewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataString: ViewModel() {
    val cadena: LiveData<String>
        get() = _cadena

    private val _cadena = MutableLiveData<String>()

    fun cambiarValor(valor: String) {
        _cadena.value = valor
    }
}