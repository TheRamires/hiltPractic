package ram.ramires.hilt_practic_30_03

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repo: MyRepositoriy,
    ): ViewModel() {

        fun getData(){
            Log.d("myLog", repo.load())
        }
}