package uz.abbosbek.myviewpager_hom_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.abbosbek.myviewpager_hom_1.adapters.PagerAdapters
import uz.abbosbek.myviewpager_hom_1.databinding.ActivityMainBinding
import uz.abbosbek.myviewpager_hom_1.modls.User

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list:ArrayList<User>
    private lateinit var pagerAdapters: PagerAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()

        pagerAdapters = PagerAdapters(list, this)
        binding.myPagerView.adapter = pagerAdapters

        

    }

    private fun loadData() {
    list = ArrayList()
        list.add(User(R.drawable.rectangleimage_1, "Xush kelibsiz", "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"))
        list.add(User(R.drawable.rectangleimage_2, "2- rasim","2-rasim"))
        list.add(User(R.drawable.rectangleimage_3, "3- rasim","2-rasim"))
        list.add(User(R.drawable.rectangleimage_4, "4- rasim","2-rasim"))
    }
}